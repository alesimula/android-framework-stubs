package android.gui;

public class StalledTransactionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.gui.StalledTransactionInfo> CREATOR = null;
    public long bufferId;
    public long frameNumber;
    public java.lang.String layerName;
    public StalledTransactionInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
