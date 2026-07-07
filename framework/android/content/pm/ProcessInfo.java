package android.content.pm;

public class ProcessInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.ProcessInfo> CREATOR = null;
    static com.android.internal.util.Parcelling<android.util.ArraySet<java.lang.String>> sParcellingForDeniedPermissions;
    public android.util.ArraySet<java.lang.String> deniedPermissions;
    public int gwpAsanMode;
    public int memtagMode;
    public java.lang.String name;
    public int nativeHeapZeroInitialized;
    public boolean singleUser;
    public boolean useEmbeddedDex;
    @java.lang.Deprecated
    public ProcessInfo(android.content.pm.ProcessInfo p0) {}
    protected ProcessInfo(android.os.Parcel p0) {}
    public ProcessInfo(java.lang.String p0, android.util.ArraySet<java.lang.String> p1, int p2, int p3, int p4, boolean p5, boolean p6) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
