package android.hardware.hid;

public class HidReportPacket implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.hid.HidReportPacket> CREATOR = null;
    public int currentChunk;
    public byte[] payload;
    public int payloadSize;
    public int totalChunks;
    public HidReportPacket() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
