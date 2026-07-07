package android.media.tv;

public final class SignalingDataInfo implements android.os.Parcelable {
    public static final java.lang.String CONTENT_ENCODING_BASE64 = "Base64";
    public static final java.lang.String CONTENT_ENCODING_UTF_8 = "UTF-8";
    public static final android.os.Parcelable.Creator<android.media.tv.SignalingDataInfo> CREATOR = null;
    public static final int LLS_NO_GROUP_ID = -1;
    private final java.lang.String mEncoding = null;
    private final int mGroup = 0;
    private final java.lang.String mSignalingDataType = null;
    private final java.lang.String mTable = null;
    private final int mVersion = 0;
    SignalingDataInfo(android.os.Parcel p0) {}
    public SignalingDataInfo(java.lang.String p0, java.lang.String p1, int p2, int p3) {}
    public SignalingDataInfo(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4) {}
    public int describeContents() { return 0; }
    public java.lang.String getEncoding() { return null; }
    public int getGroup() { return 0; }
    public java.lang.String getSignalingDataType() { return null; }
    public java.lang.String getTable() { return null; }
    public int getVersion() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentEncoding {
    }
}
