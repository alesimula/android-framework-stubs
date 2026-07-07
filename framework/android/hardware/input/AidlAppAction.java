package android.hardware.input;

public class AidlAppAction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.AidlAppAction> CREATOR = null;
    public java.lang.String action;
    public android.content.ComponentName component;
    public android.net.Uri data;
    public java.lang.String oemPackageName;
    public int oemUid;
    public AidlAppAction() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
