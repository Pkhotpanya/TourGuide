package com.example.android.tourguide;

/**
 * Created by pkhotpanya on 6/20/17.
 */

public class Item {

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private String mName;
    private String mAdress;
    private String mHours;
    private String mPhoneNumber;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Item(int imageResourceId, String name, String address, String hours, String phoneNumber ) {
        this.mImageResourceId = imageResourceId;
        this.mName = name;
        this.mAdress = address;
        this.mHours = hours;
        this.mPhoneNumber = phoneNumber;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public boolean hasAddress() { return !mAdress.isEmpty();}
    public boolean hasHours() { return !mHours.isEmpty();}
    public boolean hasPhoneNumber() { return !mPhoneNumber.isEmpty();}


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getAdress() {
        return mAdress;
    }

    public String getHours() {
        return mHours;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }
}

