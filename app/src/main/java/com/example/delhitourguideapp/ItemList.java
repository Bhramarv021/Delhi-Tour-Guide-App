package com.example.delhitourguideapp;

/**
 * ItemList used to hold place/event name with address
 */
public class ItemList {

    /**
     * Holds place/event name
     */
    private String mItemName;

    /**
     * Holds place/event address
     */
    private String mItemAddress;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Image resource ID for word */
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /**
     *
     * @param mItemName used to set mItemName
     * @param mItemAddress used to set mItemAddress
     */
    public ItemList(String mItemName, String mItemAddress){
        this.mItemName = mItemName;
        this.mItemAddress = mItemAddress;
    }

    public ItemList(String mItemName, String mItemAddress, int mImageResourceID){
        this.mItemName = mItemName;
        this.mItemAddress = mItemAddress;
        this.mImageResourceID = mImageResourceID;
    }

    /**
     *
     * @return Item Name
     */
    public String getItemName() {
        return mItemName;
    }

    /**
     * @return Item Address
     */
    public String getItemAddress() {
        return mItemAddress;
    }

    public int getImageResourceId(){
        return mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}