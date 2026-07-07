package android.hardware.radio.messaging;

public class SendSmsResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.SendSmsResult> CREATOR = null;
    @java.lang.Deprecated
    public java.lang.String ackPDU;
    @java.lang.Deprecated
    public int errorCode;
    @java.lang.Deprecated
    public int messageRef;
    public SendSmsResult() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
