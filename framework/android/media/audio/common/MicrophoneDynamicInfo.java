package android.media.audio.common;

public class MicrophoneDynamicInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.MicrophoneDynamicInfo> CREATOR = null;
    public int[] channelMapping;
    public java.lang.String id;
    public MicrophoneDynamicInfo() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface ChannelMapping {
        public static final int DIRECT = 1;
        public static final int PROCESSED = 2;
        public static final int UNUSED = 0;
    }
}
