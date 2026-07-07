package android.content.pm;

public class FileSystemControlParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.FileSystemControlParcel> CREATOR = null;
    public android.content.pm.IPackageInstallerSessionFileSystemConnector callback;
    public android.os.incremental.IncrementalFileSystemControlParcel incremental;
    public android.os.incremental.IIncrementalServiceConnector service;
    public FileSystemControlParcel() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
