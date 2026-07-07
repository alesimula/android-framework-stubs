package android.telephony.ims;

@android.annotation.SystemApi
public final class MediaThreshold implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ims.MediaThreshold> CREATOR = null;
    private final long[] mRtpInactivityTimeMillis = null;
    private final int[] mRtpJitter = null;
    private final int[] mRtpPacketLossRate = null;
    private MediaThreshold(android.os.Parcel p0) {}
    private MediaThreshold(int[] p0, int[] p1, long[] p2) {}
    public static boolean isValidJitterMillis(int p0) { return false; }
    public static boolean isValidRtpInactivityTimeMillis(long p0) { return false; }
    public static boolean isValidRtpPacketLossRate(int p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long[] getThresholdsRtpInactivityTimeMillis() { return null; }
    public int[] getThresholdsRtpJitterMillis() { return null; }
    @android.annotation.SystemApi
    public int[] getThresholdsRtpPacketLossRate() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long[] mRtpInactivityTimeMillis;
        private int[] mRtpJitter;
        private int[] mRtpPacketLossRate;
        public Builder() {}
        public android.telephony.ims.MediaThreshold build() { return null; }
        public android.telephony.ims.MediaThreshold.Builder setThresholdsRtpInactivityTimeMillis(long[] p0) { return null; }
        public android.telephony.ims.MediaThreshold.Builder setThresholdsRtpJitterMillis(int[] p0) { return null; }
        public android.telephony.ims.MediaThreshold.Builder setThresholdsRtpPacketLossRate(int[] p0) { return null; }
    }
}
