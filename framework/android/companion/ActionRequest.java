package android.companion;

public final class ActionRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.ActionRequest> CREATOR = null;
    public static final int OP_ACTIVATE = 0;
    public static final int OP_DEACTIVATE = 1;
    public static final int REQUEST_NEARBY_ADVERTISING = 1;
    public static final int REQUEST_NEARBY_SCANNING = 0;
    public static final int REQUEST_TRANSPORT = 2;
    private final int mAction = 0;
    private final int mOperation = 0;
    private ActionRequest(android.companion.ActionRequest.Builder p0) {}
    private ActionRequest(android.os.Parcel p0) {}
    public static java.lang.String actionToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAction() { return 0; }
    public int getOperation() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final int mAction = 0;
        private final int mOperation = 0;
        public Builder(int p0, int p1) {}
        public android.companion.ActionRequest build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Operation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestAction {
    }
}
