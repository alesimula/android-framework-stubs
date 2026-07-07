package android.hardware.radio.data;

public class PcoDataInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.PcoDataInfo> CREATOR = null;
    public java.lang.String bearerProto;
    public int cid;
    public byte[] contents;
    public int pcoId;
    public PcoDataInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
