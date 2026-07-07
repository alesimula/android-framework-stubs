package android.companion;

public final class ActionResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.ActionResult> CREATOR = null;
    public static final int RESULT_ACTIVATED = 0;
    public static final int RESULT_DEACTIVATED = 2;
    public static final int RESULT_FAILED_TO_ACTIVATE = 1;
    private final int mAction = 0;
    private final int mResultCode = 0;
    private ActionResult(android.companion.ActionResult.Builder p0) {}
    private ActionResult(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAction() { return 0; }
    public int getResultCode() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final int mAction = 0;
        private final int mResultCode = 0;
        public Builder(int p0, int p1) {}
        public android.companion.ActionResult build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
