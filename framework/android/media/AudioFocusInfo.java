package android.media;

@android.annotation.SystemApi
public final class AudioFocusInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioFocusInfo> CREATOR = null;
    private final android.media.AudioAttributes mAttributes = null;
    private final java.lang.String mClientId = null;
    private final int mClientUid = 0;
    private int mFlags;
    private int mGainRequest;
    private long mGenCount;
    private int mLossReceived;
    private final java.lang.String mPackageName = null;
    private final int mSdkTarget = 0;
    public AudioFocusInfo(android.media.AudioAttributes p0, int p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, int p7) {}
    public void clearLossReceived() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.media.AudioAttributes getAttributes() { return null; }
    public java.lang.String getClientId() { return null; }
    public int getClientUid() { return 0; }
    public int getFlags() { return 0; }
    public int getGainRequest() { return 0; }
    public long getGen() { return 0L; }
    public int getLossReceived() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public int getSdkTarget() { return 0; }
    public int hashCode() { return 0; }
    public boolean isLossReceivedTransient() { return false; }
    public void setGen(long p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
