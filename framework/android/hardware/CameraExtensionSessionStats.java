package android.hardware;

public class CameraExtensionSessionStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.CameraExtensionSessionStats> CREATOR = null;
    public java.lang.String cameraId;
    public int captureFormat;
    public java.lang.String clientName;
    public boolean isAdvanced;
    public java.lang.String key;
    public int type;
    public CameraExtensionSessionStats() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Type {
        public static final int EXTENSION_AUTOMATIC = 0;
        public static final int EXTENSION_BOKEH = 2;
        public static final int EXTENSION_FACE_RETOUCH = 1;
        public static final int EXTENSION_HDR = 3;
        public static final int EXTENSION_NIGHT = 4;
        public static final int EXTENSION_NONE = -1;
    }
}
