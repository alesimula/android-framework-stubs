package android.hardware.biometrics.face;

public class FaceEnrollOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.face.FaceEnrollOptions> CREATOR = null;
    public android.hardware.biometrics.common.OperationContext context;
    public byte enrollmentType;
    public byte[] features;
    public android.hardware.keymaster.HardwareAuthToken hardwareAuthToken;
    @java.lang.Deprecated
    public android.hardware.common.NativeHandle nativeHandlePreview;
    public android.view.Surface surfacePreview;
    public FaceEnrollOptions() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
