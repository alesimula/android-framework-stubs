package android.apex;

public class ApexSessionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.apex.ApexSessionInfo> CREATOR = null;
    public java.lang.String crashingNativeProcess;
    public java.lang.String errorMessage;
    public boolean isActivated;
    public boolean isActivationFailed;
    public boolean isRevertFailed;
    public boolean isRevertInProgress;
    public boolean isReverted;
    public boolean isStaged;
    public boolean isSuccess;
    public boolean isUnknown;
    public boolean isVerified;
    public int sessionId;
    public ApexSessionInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
