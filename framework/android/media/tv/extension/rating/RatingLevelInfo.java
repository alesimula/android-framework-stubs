package android.media.tv.extension.rating;

public final class RatingLevelInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.extension.rating.RatingLevelInfo> CREATOR = null;
    private boolean mIsBlocked;
    private java.lang.String mLevelAbbrText;
    private java.lang.String mLevelText;
    private RatingLevelInfo(android.os.Parcel p0) {}
    public RatingLevelInfo(java.lang.String p0, java.lang.String p1, boolean p2) {}
    public int describeContents() { return 0; }
    public java.lang.String getLevelAbbrText() { return null; }
    public java.lang.String getLevelText() { return null; }
    public boolean isBlocked() { return false; }
    public void setBlocked(boolean p0) {}
    public void setLevelAbbrText(java.lang.String p0) {}
    public void setLevelText(java.lang.String p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
