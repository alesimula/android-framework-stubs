package android.app.appfunctions;

public final class AppFunctionAidlSearchSpec implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.appfunctions.AppFunctionAidlSearchSpec> CREATOR = null;
    private final java.lang.String mCallingPackageName = null;
    private final android.app.appfunctions.AppFunctionSearchSpec mClientSearchSpec = null;
    private final int mTargetUserId = 0;
    private AppFunctionAidlSearchSpec(android.os.Parcel p0) {}
    public AppFunctionAidlSearchSpec(java.lang.String p0, android.app.appfunctions.AppFunctionSearchSpec p1, int p2) {}
    public int describeContents() { return 0; }
    public java.lang.String getCallingPackageName() { return null; }
    public android.app.appfunctions.AppFunctionSearchSpec getClientSearchSpec() { return null; }
    public int getTargetUserId() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
