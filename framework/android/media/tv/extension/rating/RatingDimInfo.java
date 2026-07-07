package android.media.tv.extension.rating;

public final class RatingDimInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.extension.rating.RatingDimInfo> CREATOR = null;
    private java.lang.String mDimText;
    private boolean mIsDimGrad;
    private java.util.List<android.media.tv.extension.rating.RatingLevelInfo> mRatingLevelList;
    private int mRatingLevelNumber;
    public RatingDimInfo(int p0, boolean p1, java.lang.String p2, java.util.List<android.media.tv.extension.rating.RatingLevelInfo> p3) {}
    private RatingDimInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getDimText() { return null; }
    public java.util.List<android.media.tv.extension.rating.RatingLevelInfo> getRatingLevelList() { return null; }
    public int getRatingLevelNumber() { return 0; }
    public boolean isDimGrad() { return false; }
    public void setDimGrad(boolean p0) {}
    public void setDimText(java.lang.String p0) {}
    public void setRatingLevelList(java.util.List<android.media.tv.extension.rating.RatingLevelInfo> p0) {}
    public void setRatingLevelNumber(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
