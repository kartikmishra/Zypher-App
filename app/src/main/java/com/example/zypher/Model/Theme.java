package com.example.zypher.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Theme implements Parcelable {



    private String id;

    private String themeName;

    private String themeImageURL;


    public Theme() {
    }

    public Theme(String id, String themeName, String themeImageURL) {
        this.id = id;
        this.themeName = themeName;
        this.themeImageURL = themeImageURL;
    }

    protected Theme(Parcel in) {
        id = in.readString();
        themeName = in.readString();
        themeImageURL = in.readString();
    }

    public static final Parcelable.Creator<Theme> CREATOR = new Parcelable.Creator<Theme>() {
        @Override
        public Theme createFromParcel(Parcel in) {
            return new Theme(in);
        }

        @Override
        public Theme[] newArray(int size) {
            return new Theme[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public String getThemeImageURL() {
        return themeImageURL;
    }

    public void setThemeImageURL(String themeImageURL) {
        this.themeImageURL = themeImageURL;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(themeName);
        parcel.writeString(themeImageURL);
    }
}
