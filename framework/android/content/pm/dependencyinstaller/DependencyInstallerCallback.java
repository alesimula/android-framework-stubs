package android.content.pm.dependencyinstaller;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class DependencyInstallerCallback implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.dependencyinstaller.DependencyInstallerCallback> CREATOR = null;
    private final android.os.IBinder mBinder = null;
    private final android.content.pm.dependencyinstaller.IDependencyInstallerCallback mCallback = null;
    public DependencyInstallerCallback(android.os.IBinder p0) {}
    private DependencyInstallerCallback(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void onAllDependenciesResolved(int[] p0) {}
    public void onFailureToResolveAllDependencies() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
