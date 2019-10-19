package com.example.zypher.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Category implements Parcelable {


    private String displayName;

    private String categoryImageURL;

    private String categoryName;


    public Category() {
    }

    public Category(String displayName, String categoryImageURL, String categoryName) {
        this.displayName = displayName;
        this.categoryImageURL = categoryImageURL;
        this.categoryName = categoryName;
    }

    protected Category(Parcel in) {
        displayName = in.readString();
        categoryImageURL = in.readString();
        categoryName = in.readString();
    }

    public static final Parcelable.Creator<Category> CREATOR = new Parcelable.Creator<Category>() {
        @Override
        public Category createFromParcel(Parcel in) {
            return new Category(in);
        }

        @Override
        public Category[] newArray(int size) {
            return new Category[size];
        }
    };

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCategoryImageURL() {
        return categoryImageURL;
    }

    public void setCategoryImageURL(String categoryImageURL) {
        this.categoryImageURL = categoryImageURL;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(displayName);
        parcel.writeString(categoryImageURL);
        parcel.writeString(categoryName);
    }
}
