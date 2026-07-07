package android.media.tv;

public final class AdBuffer implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.AdBuffer> CREATOR = null;
    private final android.os.SharedMemory mBuffer = null;
    private final int mFlags = 0;
    private final int mId = 0;
    private final int mLength = 0;
    private final java.lang.String mMimeType = null;
    private final int mOffset = 0;
    private final long mPresentationTimeUs = 0L;
    public AdBuffer(int p0, java.lang.String p1, android.os.SharedMemory p2, int p3, int p4, long p5, int p6) {}
    private AdBuffer(android.os.Parcel p0) {}
    public static android.media.tv.AdBuffer dupAdBuffer(android.media.tv.AdBuffer p0) throws java.io.IOException { return null; }
    public int describeContents() { return 0; }
    public int getFlags() { return 0; }
    public int getId() { return 0; }
    public int getLength() { return 0; }
    public java.lang.String getMimeType() { return null; }
    public int getOffset() { return 0; }
    public long getPresentationTimeUs() { return 0L; }
    public android.os.SharedMemory getSharedMemory() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
