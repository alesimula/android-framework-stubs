package android.hardware.radio.messaging;

public class CdmaSmsWriteArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.CdmaSmsWriteArgs> CREATOR = null;
    @java.lang.Deprecated
    public static final int STATUS_REC_READ = 1;
    @java.lang.Deprecated
    public static final int STATUS_REC_UNREAD = 0;
    @java.lang.Deprecated
    public static final int STATUS_STO_SENT = 3;
    @java.lang.Deprecated
    public static final int STATUS_STO_UNSENT = 2;
    @java.lang.Deprecated
    public android.hardware.radio.messaging.CdmaSmsMessage message;
    @java.lang.Deprecated
    public int status;
    public CdmaSmsWriteArgs() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
