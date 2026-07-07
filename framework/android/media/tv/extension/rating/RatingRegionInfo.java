package android.media.tv.extension.rating;

public final class RatingRegionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.extension.rating.RatingRegionInfo> CREATOR = null;
    private java.util.List<android.media.tv.extension.rating.RatingDimInfo> mRatingDimInfoList;
    private int mRatingDimNumber;
    private int mRatingRegionId;
    private java.lang.String mRatingRegionText;
    private int mRatingRegionVersion;
    public RatingRegionInfo(int p0, java.lang.String p1, int p2, int p3, java.util.List<android.media.tv.extension.rating.RatingDimInfo> p4) {}
    private RatingRegionInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.util.List<android.media.tv.extension.rating.RatingDimInfo> getRatingDimInfoList() { return null; }
    public int getRatingDimNumber() { return 0; }
    public int getRatingRegionId() { return 0; }
    public java.lang.String getRatingRegionText() { return null; }
    public int getRatingRegionVersion() { return 0; }
    public void setRatingDimInfoList(java.util.List<android.media.tv.extension.rating.RatingDimInfo> p0) {}
    public void setRatingDimNumber(int p0) {}
    public void setRatingRegionId(int p0) {}
    public void setRatingRegionText(java.lang.String p0) {}
    public void setRatingRegionVersion(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
