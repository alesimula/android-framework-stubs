package android.app;

public class BindUpdateInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.BindUpdateInfo> CREATOR = null;
    public android.os.IBinder connection;
    public long flags;
    public boolean unbind;
    public BindUpdateInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
