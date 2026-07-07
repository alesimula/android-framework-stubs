package android.media.tv;

public final class DsmccResponse extends android.media.tv.BroadcastInfoResponse implements android.os.Parcelable {
    public static final java.lang.String BIOP_MESSAGE_TYPE_DIRECTORY = "directory";
    public static final java.lang.String BIOP_MESSAGE_TYPE_FILE = "file";
    public static final java.lang.String BIOP_MESSAGE_TYPE_SERVICE_GATEWAY = "service_gateway";
    public static final java.lang.String BIOP_MESSAGE_TYPE_STREAM = "stream";
    public static final android.os.Parcelable.Creator<android.media.tv.DsmccResponse> CREATOR = null;
    private static final int RESPONSE_TYPE = 6;
    private final java.lang.String mBiopMessageType = null;
    private final java.util.List<java.lang.String> mChildList = null;
    private final int[] mEventIds = null;
    private final java.lang.String[] mEventNames = null;
    private final android.os.ParcelFileDescriptor mFileDescriptor = null;
    public DsmccResponse(int p0, int p1, int p2, android.os.ParcelFileDescriptor p3) { super(0, (android.os.Parcel)null); }
    public DsmccResponse(int p0, int p1, int p2, boolean p3, java.util.List<java.lang.String> p4) { super(0, (android.os.Parcel)null); }
    public DsmccResponse(int p0, int p1, int p2, int[] p3, java.lang.String[] p4) { super(0, (android.os.Parcel)null); }
    private DsmccResponse(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    static android.media.tv.DsmccResponse createFromParcelBody(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getBiopMessageType() { return null; }
    public java.util.List<java.lang.String> getChildList() { return null; }
    public android.os.ParcelFileDescriptor getFile() { return null; }
    public int[] getStreamEventIds() { return null; }
    public java.lang.String[] getStreamEventNames() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BiopMessageType {
    }
}
