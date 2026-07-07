package android.os;

public class ExternalVibrationScale implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.ExternalVibrationScale> CREATOR = null;
    public float adaptiveHapticsScale;
    public float scaleFactor;
    public int scaleLevel;
    public ExternalVibrationScale() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface ScaleLevel {
        public static final int SCALE_HIGH = 1;
        public static final int SCALE_LOW = -1;
        public static final int SCALE_MUTE = -100;
        public static final int SCALE_NONE = 0;
        public static final int SCALE_VERY_HIGH = 2;
        public static final int SCALE_VERY_LOW = -2;
    }
}
