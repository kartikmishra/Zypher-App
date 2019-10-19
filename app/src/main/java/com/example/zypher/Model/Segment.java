package com.example.zypher.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Segment implements Parcelable {


    private String segmentName;

    private String segmentSubtitle;

    private String tagName;

    private List<Book> books = null;


    public Segment() {
    }

    public Segment(String segmentName, String segmentSubtitle, String tagName, List<Book> books) {
        this.segmentName = segmentName;
        this.segmentSubtitle = segmentSubtitle;
        this.tagName = tagName;
        this.books = books;
    }

    protected Segment(Parcel in) {
        segmentName = in.readString();
        segmentSubtitle = in.readString();
        tagName = in.readString();
        books = in.createTypedArrayList(Book.CREATOR);
    }

    public static final Creator<Segment> CREATOR = new Creator<Segment>() {
        @Override
        public Segment createFromParcel(Parcel in) {
            return new Segment(in);
        }

        @Override
        public Segment[] newArray(int size) {
            return new Segment[size];
        }
    };

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public String getSegmentSubtitle() {
        return segmentSubtitle;
    }

    public void setSegmentSubtitle(String segmentSubtitle) {
        this.segmentSubtitle = segmentSubtitle;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(segmentName);
        parcel.writeString(segmentSubtitle);
        parcel.writeString(tagName);
        parcel.writeTypedList(books);
    }
}
