package android.os.instrumentation;

public class TargetProcess implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.instrumentation.TargetProcess> CREATOR = null;
    public int pid;
    public java.lang.String processName;
    public int uid;
    public TargetProcess() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
