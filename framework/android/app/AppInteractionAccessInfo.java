package android.app;

@android.annotation.SystemApi
public final class AppInteractionAccessInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.AppInteractionAccessInfo> CREATOR = null;
    private final int mAccessFlags = 0;
    private final java.lang.String mInteractorPackageName = null;
    private final boolean mIsAppFunctionSupported = false;
    private final boolean mIsComputerControlSupported = false;
    private final java.lang.String mTargetPackageName = null;
    private AppInteractionAccessInfo(android.os.Parcel p0) {}
    public AppInteractionAccessInfo(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3, int p4) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAccessFlags() { return 0; }
    public java.lang.String getInteractorPackageName() { return null; }
    public java.lang.String getTargetPackageName() { return null; }
    public int hashCode() { return 0; }
    public boolean isAppFunctionSupported() { return false; }
    public boolean isComputerControlSupported() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
