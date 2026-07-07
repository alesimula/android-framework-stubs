package android.os;

public final class Messenger implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.Messenger> CREATOR = null;
    private final android.os.IMessenger mTarget = null;
    public Messenger(android.os.Handler p0) {}
    public Messenger(android.os.IBinder p0) {}
    public static android.os.Messenger readMessengerOrNullFromParcel(android.os.Parcel p0) { return null; }
    public static void writeMessengerOrNullToParcel(android.os.Messenger p0, android.os.Parcel p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.IBinder getBinder() { return null; }
    public int hashCode() { return 0; }
    public void send(android.os.Message p0) throws android.os.RemoteException {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
