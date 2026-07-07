package android.app.appfunctions;

public final class ExecuteAppFunctionAidlRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.appfunctions.ExecuteAppFunctionAidlRequest> CREATOR = null;
    private final java.lang.String mCallingPackage = null;
    private final android.app.appfunctions.ExecuteAppFunctionRequest mClientRequest = null;
    private final long mRequestTime = 0L;
    private final long mRequestWallTime = 0L;
    private final android.os.UserHandle mUserHandle = null;
    public ExecuteAppFunctionAidlRequest(android.app.appfunctions.ExecuteAppFunctionRequest p0, android.os.UserHandle p1, java.lang.String p2, long p3, long p4) {}
    public int describeContents() { return 0; }
    public java.lang.String getCallingPackage() { return null; }
    public android.app.appfunctions.ExecuteAppFunctionRequest getClientRequest() { return null; }
    public long getRequestTime() { return 0L; }
    public long getRequestWallTime() { return 0L; }
    public android.os.UserHandle getUserHandle() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
