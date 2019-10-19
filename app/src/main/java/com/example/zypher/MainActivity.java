package com.example.zypher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.zypher.Model.Author;
import com.example.zypher.Model.Main;
import com.example.zypher.Model.Theme;
import com.example.zypher.Retrofit.ApiClient;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ImageView cardOneImageView;
    private ImageView cardTwoImageView;
    private RecyclerView authorRecyclerView;
    private RecyclerView popularRecyclerView;
    private AuthorAdapter authorAdapter;
    private PopularBooksAdapter popularBooksAdapter;
    private List<Author> authorList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardOneImageView = findViewById(R.id.cardOneImageView);
        cardTwoImageView = findViewById(R.id.cardTwoImageView);



        ApiClient.getmInstance().getApi().getBooksResponse().enqueue(new Callback<Main>() {
            @Override
            public void onResponse(Call<Main> call, Response<Main> response) {

                Picasso.get().load(response.body().getCategory().get(0)
                        .getCategoryImageURL()).into(cardOneImageView);
                Picasso.get().load(response.body().getCategory().get(1)
                        .getCategoryImageURL()).into(cardTwoImageView);

                authorList = response.body().getAuthors();

                setUpAuthorRecyclerView(authorList);
                setUpPopularBooksRecyclerView(response.body().getThemes());

            }

            @Override
            public void onFailure(Call<Main> call, Throwable t) {

            }
        });

    }


    public void setUpAuthorRecyclerView(List<Author> authorList) {

        authorRecyclerView = findViewById(R.id.author_recyclerView);


        LinearLayoutManager linearLayoutManager = new
                LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        authorRecyclerView.setLayoutManager(linearLayoutManager);
        authorRecyclerView.setHasFixedSize(true);

        authorAdapter = new AuthorAdapter(this, authorList);

        authorRecyclerView.setAdapter(authorAdapter);

        authorAdapter.notifyDataSetChanged();
    }


    public void setUpPopularBooksRecyclerView(List<Theme> themeList) {


        popularRecyclerView = findViewById(R.id.popular_books_recyclerView);

        LinearLayoutManager linearLayoutManager = new
                LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        popularRecyclerView.setLayoutManager(linearLayoutManager);

        popularBooksAdapter = new PopularBooksAdapter(themeList, this);

        popularRecyclerView.setAdapter(popularBooksAdapter);
        popularBooksAdapter.notifyDataSetChanged();

    }

}
