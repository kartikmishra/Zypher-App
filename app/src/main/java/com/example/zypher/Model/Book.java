package com.example.zypher.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Book implements Parcelable {



    private Boolean isCategoryShow;

    private Boolean isEpubAvailable;

    private Integer rating;

    private Integer viewCount;

    private Boolean isPremium;

    private String productName;

    private Boolean isHide;

    private List<String> tags = null;

    private Integer quantity;

    private Integer pageCount;

    private String volumeId;

    private Boolean isTrending;

    private String id;

    private String authorName;

    private String imageURL;

    private Long isbn;

    private String slugURL;

    private Integer v;


    public Book() {
    }

    public Book(Boolean isCategoryShow, Boolean isEpubAvailable, Integer rating, Integer viewCount, Boolean isPremium, String productName, Boolean isHide, List<String> tags, Integer quantity, Integer pageCount, String volumeId, Boolean isTrending, String id, String authorName, String imageURL, Long isbn, String slugURL, Integer v) {
        this.isCategoryShow = isCategoryShow;
        this.isEpubAvailable = isEpubAvailable;
        this.rating = rating;
        this.viewCount = viewCount;
        this.isPremium = isPremium;
        this.productName = productName;
        this.isHide = isHide;
        this.tags = tags;
        this.quantity = quantity;
        this.pageCount = pageCount;
        this.volumeId = volumeId;
        this.isTrending = isTrending;
        this.id = id;
        this.authorName = authorName;
        this.imageURL = imageURL;
        this.isbn = isbn;
        this.slugURL = slugURL;
        this.v = v;
    }

    protected Book(Parcel in) {
        byte tmpIsCategoryShow = in.readByte();
        isCategoryShow = tmpIsCategoryShow == 0 ? null : tmpIsCategoryShow == 1;
        byte tmpIsEpubAvailable = in.readByte();
        isEpubAvailable = tmpIsEpubAvailable == 0 ? null : tmpIsEpubAvailable == 1;
        if (in.readByte() == 0) {
            rating = null;
        } else {
            rating = in.readInt();
        }
        if (in.readByte() == 0) {
            viewCount = null;
        } else {
            viewCount = in.readInt();
        }
        byte tmpIsPremium = in.readByte();
        isPremium = tmpIsPremium == 0 ? null : tmpIsPremium == 1;
        productName = in.readString();
        byte tmpIsHide = in.readByte();
        isHide = tmpIsHide == 0 ? null : tmpIsHide == 1;
        tags = in.createStringArrayList();
        if (in.readByte() == 0) {
            quantity = null;
        } else {
            quantity = in.readInt();
        }
        if (in.readByte() == 0) {
            pageCount = null;
        } else {
            pageCount = in.readInt();
        }
        volumeId = in.readString();
        byte tmpIsTrending = in.readByte();
        isTrending = tmpIsTrending == 0 ? null : tmpIsTrending == 1;
        id = in.readString();
        authorName = in.readString();
        imageURL = in.readString();
        if (in.readByte() == 0) {
            isbn = null;
        } else {
            isbn = in.readLong();
        }
        slugURL = in.readString();
        if (in.readByte() == 0) {
            v = null;
        } else {
            v = in.readInt();
        }
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public Boolean getIsCategoryShow() {
        return isCategoryShow;
    }

    public void setIsCategoryShow(Boolean isCategoryShow) {
        this.isCategoryShow = isCategoryShow;
    }

    public Boolean getIsEpubAvailable() {
        return isEpubAvailable;
    }

    public void setIsEpubAvailable(Boolean isEpubAvailable) {
        this.isEpubAvailable = isEpubAvailable;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Boolean getIsPremium() {
        return isPremium;
    }

    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Boolean getIsHide() {
        return isHide;
    }

    public void setIsHide(Boolean isHide) {
        this.isHide = isHide;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public Boolean getIsTrending() {
        return isTrending;
    }

    public void setIsTrending(Boolean isTrending) {
        this.isTrending = isTrending;
    }

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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getSlugURL() {
        return slugURL;
    }

    public void setSlugURL(String slugURL) {
        this.slugURL = slugURL;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (isCategoryShow == null ? 0 : isCategoryShow ? 1 : 2));
        parcel.writeByte((byte) (isEpubAvailable == null ? 0 : isEpubAvailable ? 1 : 2));
        if (rating == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(rating);
        }
        if (viewCount == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(viewCount);
        }
        parcel.writeByte((byte) (isPremium == null ? 0 : isPremium ? 1 : 2));
        parcel.writeString(productName);
        parcel.writeByte((byte) (isHide == null ? 0 : isHide ? 1 : 2));
        parcel.writeStringList(tags);
        if (quantity == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(quantity);
        }
        if (pageCount == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(pageCount);
        }
        parcel.writeString(volumeId);
        parcel.writeByte((byte) (isTrending == null ? 0 : isTrending ? 1 : 2));
        parcel.writeString(id);
        parcel.writeString(authorName);
        parcel.writeString(imageURL);
        if (isbn == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(isbn);
        }
        parcel.writeString(slugURL);
        if (v == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(v);
        }
    }
}
