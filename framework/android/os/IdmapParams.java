package android.os;

public class IdmapParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.IdmapParams> CREATOR = null;
    public android.os.OverlayConstraint[] constraints;
    public boolean enforceOverlayable;
    public int fulfilledPolicies;
    public java.lang.String overlayName;
    public java.lang.String overlayPath;
    public java.lang.String targetPath;
    public int userId;
    public IdmapParams() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
