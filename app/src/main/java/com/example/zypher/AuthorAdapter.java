package com.example.zypher;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zypher.Model.Author;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AuthorAdapter  extends RecyclerView.Adapter<AuthorAdapter.AuthorAdapterViewHolder> {


    private Context mContext;
    private List<Author> authorList = new ArrayList<>();

    public AuthorAdapter(Context mContext, List<Author> authorList) {
        this.mContext = mContext;
        this.authorList = authorList;
    }

    @NonNull
    @Override
    public AuthorAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.author_item, parent , false);
        return new AuthorAdapterViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull AuthorAdapterViewHolder holder, int position) {

        if (authorList.size() > 0 ) {

            Author author = authorList.get(position);
            Picasso.get().load(authorList.get(position).getAuthorImageURL())
                    .into(holder.authorImageView);

            holder.authorImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (authorList.indexOf(author) == 1 || authorList.indexOf(author) == 2) {

                holder.authorImageView.setBorderWidth(11);
                holder.authorImageView.setBorderColor(Color.parseColor("#ADD8E6"));
            }

            holder.authorTextView.setText(authorList.get(position).getAuthorName());

        }

    }

    @Override
    public int getItemCount() {
        return authorList.size();
    }

    class AuthorAdapterViewHolder extends RecyclerView.ViewHolder {

        private TextView authorTextView;
        private CircleImageView authorImageView;
        public AuthorAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            authorTextView = itemView.findViewById(R.id.author_textView);
            authorImageView = itemView.findViewById(R.id.author_imageView);
        }
    }
}
