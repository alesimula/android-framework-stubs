package android.app;

public class SelfBroadcastData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.SelfBroadcastData> CREATOR = null;
    public android.content.Intent intent;
    public boolean ordered;
    public java.util.List<android.app.ReceiverInfo> receivers;
    public int resultCode;
    public java.lang.String resultData;
    public android.os.Bundle resultExtras;
    public android.content.IIntentReceiver resultTo;
    public int traceCookie;
    public int userId;
    public SelfBroadcastData() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
