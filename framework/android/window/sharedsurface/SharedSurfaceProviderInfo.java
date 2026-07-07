package android.window.sharedsurface;

public class SharedSurfaceProviderInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.sharedsurface.SharedSurfaceProviderInfo> CREATOR = null;
    public android.window.sharedsurface.SharedAnimationFilter mFilter;
    public android.window.sharedsurface.ISharedAnimationProvider mISharedAnimationProvider;
    public android.graphics.Point mOffsetToTarget;
    public android.window.WindowContainerToken mPivotToken;
    public android.window.sharedsurface.SharedAnimationParams mSharedAnimationParams;
    public SharedSurfaceProviderInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
