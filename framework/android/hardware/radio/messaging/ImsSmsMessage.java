package android.hardware.radio.messaging;

public class ImsSmsMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.ImsSmsMessage> CREATOR = null;
    @java.lang.Deprecated
    public android.hardware.radio.messaging.CdmaSmsMessage[] cdmaMessage;
    public android.hardware.radio.messaging.GsmSmsMessage[] gsmMessage;
    public int messageRef;
    public boolean retry;
    public int tech;
    public ImsSmsMessage() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
