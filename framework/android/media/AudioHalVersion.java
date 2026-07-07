package android.media;

public class AudioHalVersion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioHalVersion> CREATOR = null;
    public int major;
    public int minor;
    public int type;
    public AudioHalVersion() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Type {
        public static final int AIDL = 1;
        public static final int HIDL = 0;
    }
}
