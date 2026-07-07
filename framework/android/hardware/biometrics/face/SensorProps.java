package android.hardware.biometrics.face;

public class SensorProps implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.face.SensorProps> CREATOR = null;
    public android.hardware.biometrics.common.CommonProps commonProps;
    public int enrollPreviewHeight;
    public float enrollPreviewScale;
    public int enrollPreviewWidth;
    public float enrollTranslationX;
    public float enrollTranslationY;
    public boolean halControlsPreview;
    public int previewDisplayId;
    public byte sensorType;
    public boolean supportsDetectInteraction;
    public SensorProps() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
