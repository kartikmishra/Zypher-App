package com.example.zypher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zypher.Model.Theme;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PopularBooksAdapter extends RecyclerView
        .Adapter<PopularBooksAdapter.PopularBooksAdapterViewHolder> {


    private List<Theme> themeList;
    private Context mContext;

    public PopularBooksAdapter(List<Theme> themeList, Context mContext) {
        this.themeList = themeList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public PopularBooksAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.popular_books_recyclerview_item,
                parent , false);
        return new PopularBooksAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularBooksAdapterViewHolder holder, int position) {

        if (themeList.size() > 0 ) {

            Picasso.get().load(themeList.get(position).getThemeImageURL())
                    .into(holder.popularBooksImageView);

            holder.popularBooksTextView.setText(themeList.get(position).getThemeName());

        }


    }

    @Override
    public int getItemCount() {
        return themeList.size();
    }


    class PopularBooksAdapterViewHolder extends RecyclerView.ViewHolder {

        private ImageView popularBooksImageView;
        private TextView popularBooksTextView;

        public PopularBooksAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            popularBooksImageView = itemView.findViewById(R.id.popular_books_imageView);
            popularBooksTextView = itemView.findViewById(R.id.popular_books_textView);
        }
    }
}
