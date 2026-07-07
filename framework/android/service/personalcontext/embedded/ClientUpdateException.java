package android.service.personalcontext.embedded;

@android.annotation.SystemApi
public final class ClientUpdateException extends java.lang.RuntimeException implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.embedded.ClientUpdateException> CREATOR = null;
    public static final int UPDATE_ERROR_DECLINED_BY_VISUALIZER = 2;
    public static final int UPDATE_ERROR_UNKNOWN = 1;
    private final int mErrorCode = 0;
    private final android.service.personalcontext.embedded.InsightSurfaceClientUpdate mUpdate = null;
    ClientUpdateException(int p0, android.service.personalcontext.embedded.InsightSurfaceClientUpdate p1) { super(); }
    private ClientUpdateException(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public int getErrorCode() { return 0; }
    public android.service.personalcontext.embedded.InsightSurfaceClientUpdate getUpdate() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface UpdateError {
    }
}
