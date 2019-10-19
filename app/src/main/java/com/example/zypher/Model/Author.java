package com.example.zypher.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Author implements Parcelable {

    private String id;
    private String authorName;
    private String authorImageURL;


    public Author() {
    }

    public Author(String id, String authorName, String authorImageURL) {
        this.id = id;
        this.authorName = authorName;
        this.authorImageURL = authorImageURL;
    }

    protected Author(Parcel in) {
        id = in.readString();
        authorName = in.readString();
        authorImageURL = in.readString();
    }


    public static final Parcelable.Creator<Author> CREATOR = new Parcelable.Creator<Author>() {
        @Override
        public Author createFromParcel(Parcel in) {
            return new Author(in);
        }

        @Override
        public Author[] newArray(int size) {
            return new Author[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorImageURL() {
        return authorImageURL;
    }

    public void setAuthorImageURL(String authorImageURL) {
        this.authorImageURL = authorImageURL;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(authorName);
        parcel.writeString(authorImageURL);
    }
}
