package android.telephony;

@android.annotation.SystemApi
public final class PinResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.PinResult> CREATOR = null;
    public static final int PIN_RESULT_TYPE_ABORTED = 3;
    public static final int PIN_RESULT_TYPE_FAILURE = 2;
    public static final int PIN_RESULT_TYPE_INCORRECT = 1;
    public static final int PIN_RESULT_TYPE_SUCCESS = 0;
    private static final android.telephony.PinResult sFailedResult = null;
    private final int mAttemptsRemaining = 0;
    private final int mResult = 0;
    public PinResult(int p0, int p1) {}
    private PinResult(android.os.Parcel p0) {}
    public static android.telephony.PinResult getDefaultFailedResult() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAttemptsRemaining() { return 0; }
    public int getResult() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PinResultType {
    }
}
