package android.telephony.ims;

@android.annotation.SystemApi
public final class MediaQualityStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ims.MediaQualityStatus> CREATOR = null;
    public static final int MEDIA_SESSION_TYPE_AUDIO = 1;
    public static final int MEDIA_SESSION_TYPE_VIDEO = 2;
    private final java.lang.String mImsCallSessionId = null;
    private final int mMediaSessionType = 0;
    private final long mRtpInactivityTimeMillis = 0L;
    private final int mRtpJitterMillis = 0;
    private final int mRtpPacketLossRate = 0;
    private final int mTransportType = 0;
    private MediaQualityStatus(android.os.Parcel p0) {}
    public MediaQualityStatus(java.lang.String p0, int p1, int p2, int p3, int p4, long p5) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getCallSessionId() { return null; }
    public int getMediaSessionType() { return 0; }
    public long getRtpInactivityMillis() { return 0L; }
    public int getRtpJitterMillis() { return 0; }
    public int getRtpPacketLossRate() { return 0; }
    public int getTransportType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MediaSessionType {
    }
}
