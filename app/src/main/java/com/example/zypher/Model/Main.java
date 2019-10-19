package com.example.zypher.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Main implements Parcelable {


    private Integer status;

    private List<Author> authors = null;

    private List<Theme> themes = null;

    private List<Category> category = null;

    private List<Segment> segments = null;


    public Main() {
    }

    public Main(Integer status, List<Author> authors, List<Theme> themes, List<Category> category, List<Segment> segments) {
        this.status = status;
        this.authors = authors;
        this.themes = themes;
        this.category = category;
        this.segments = segments;
    }

    protected Main(Parcel in) {
        if (in.readByte() == 0) {
            status = null;
        } else {
            status = in.readInt();
        }
        authors = in.createTypedArrayList(Author.CREATOR);
        themes = in.createTypedArrayList(Theme.CREATOR);
        category = in.createTypedArrayList(Category.CREATOR);
    }

    public static final Creator<Main> CREATOR = new Creator<Main>() {
        @Override
        public Main createFromParcel(Parcel in) {
            return new Main(in);
        }

        @Override
        public Main[] newArray(int size) {
            return new Main[size];
        }
    };

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (status == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(status);
        }
        parcel.writeTypedList(authors);
        parcel.writeTypedList(themes);
        parcel.writeTypedList(category);
    }
}
