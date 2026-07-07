package android.media.tv;

public final class TableResponse extends android.media.tv.BroadcastInfoResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.TableResponse> CREATOR = null;
    private static final int RESPONSE_TYPE = 2;
    private final int mSize = 0;
    private final byte[] mTableByteArray = null;
    private final android.os.SharedMemory mTableSharedMemory = null;
    private final android.net.Uri mTableUri = null;
    private final int mVersion = 0;
    private TableResponse(int p0, int p1, int p2, int p3, int p4, android.net.Uri p5, byte[] p6, android.os.SharedMemory p7) { super(0, (android.os.Parcel)null); }
    @java.lang.Deprecated
    public TableResponse(int p0, int p1, int p2, android.net.Uri p3, int p4, int p5) { super(0, (android.os.Parcel)null); }
    TableResponse(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    static android.media.tv.TableResponse createFromParcelBody(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public int getSize() { return 0; }
    public byte[] getTableByteArray() { return null; }
    public android.os.SharedMemory getTableSharedMemory() { return null; }
    public android.net.Uri getTableUri() { return null; }
    public int getVersion() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final int mRequestId = 0;
        private final int mResponseResult = 0;
        private final int mSequence = 0;
        private final int mSize = 0;
        private byte[] mTableByteArray;
        private android.os.SharedMemory mTableSharedMemory;
        private android.net.Uri mTableUri;
        private final int mVersion = 0;
        public Builder(int p0, int p1, int p2, int p3, int p4) {}
        public android.media.tv.TableResponse build() { return null; }
        public android.media.tv.TableResponse.Builder setTableByteArray(byte[] p0) { return null; }
        public android.media.tv.TableResponse.Builder setTableSharedMemory(android.os.SharedMemory p0) { return null; }
        public android.media.tv.TableResponse.Builder setTableUri(android.net.Uri p0) { return null; }
    }
}
