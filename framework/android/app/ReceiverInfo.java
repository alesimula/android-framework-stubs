package android.app;

public class ReceiverInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.ReceiverInfo> CREATOR = null;
    public android.content.pm.ActivityInfo activityInfo;
    public boolean assumeDelivered;
    public android.content.res.CompatibilityInfo compatInfo;
    public java.lang.String data;
    public android.os.Bundle extras;
    public android.content.Intent intent;
    public boolean ordered;
    public int processState;
    public android.content.IIntentReceiver receiver;
    public boolean registered;
    public int resultCode;
    public java.lang.String sendingPackage;
    public int sendingUid;
    public int sendingUser;
    public boolean sticky;
    public boolean sync;
    public ReceiverInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
