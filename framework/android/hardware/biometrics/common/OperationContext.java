package android.hardware.biometrics.common;

public class OperationContext implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.OperationContext> CREATOR = null;
    public android.hardware.biometrics.common.AuthenticateReason authenticateReason;
    public int displayState;
    public int foldState;
    public int id;
    @java.lang.Deprecated
    public boolean isAod;
    public boolean isCrypto;
    public android.hardware.biometrics.common.OperationState operationState;
    public byte reason;
    public int wakeReason;
    public OperationContext() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
