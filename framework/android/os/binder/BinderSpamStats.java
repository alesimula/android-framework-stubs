package android.os.binder;

public class BinderSpamStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.binder.BinderSpamStats> CREATOR = null;
    public java.lang.String aidlMethod;
    public int clientUid;
    public java.lang.String interfaceDescriptor;
    public int peakCallCountPerSecond;
    public int secondsWithAtLeast125Calls;
    public int secondsWithAtLeast250Calls;
    public BinderSpamStats() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
