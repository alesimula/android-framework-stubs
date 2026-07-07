package android.app.privatecompute;

public final class PccEgressException extends java.lang.Exception implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.privatecompute.PccEgressException> CREATOR = null;
    public static final int STATUS_FAILURE_CALLER_NOT_PCC = 2;
    public static final int STATUS_FAILURE_INDICATOR_UNAVAILABLE = 5;
    public static final int STATUS_FAILURE_INVALID_REQUEST = 7;
    public static final int STATUS_FAILURE_MISSING_CONSENT = 1;
    public static final int STATUS_FAILURE_NO_RESPONSE_FROM_PROXY = 6;
    public static final int STATUS_FAILURE_REQUEST_TOO_LARGE = 3;
    public static final int STATUS_FAILURE_UNABLE_TO_DELIVER_REQUEST = 4;
    public static final int STATUS_FAILURE_UNKNOWN = -1;
    private final int mStatusCode = 0;
    public PccEgressException(int p0) { super(); }
    public PccEgressException(int p0, java.lang.String p1) { super(); }
    private PccEgressException(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public int getStatusCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StatusCode {
    }
}
