package android.window;

public class AddToSurfaceSyncGroupResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.AddToSurfaceSyncGroupResult> CREATOR = null;
    public android.window.ISurfaceSyncGroup mParentSyncGroup;
    public android.window.ITransactionReadyCallback mTransactionReadyCallback;
    public AddToSurfaceSyncGroupResult() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
