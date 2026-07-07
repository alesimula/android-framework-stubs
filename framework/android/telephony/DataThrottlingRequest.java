package android.telephony;

@android.annotation.SystemApi
public final class DataThrottlingRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.DataThrottlingRequest> CREATOR = null;
    @android.annotation.SystemApi
    public static final int DATA_THROTTLING_ACTION_HOLD = 3;
    @android.annotation.SystemApi
    public static final int DATA_THROTTLING_ACTION_NO_DATA_THROTTLING = 0;
    @android.annotation.SystemApi
    public static final int DATA_THROTTLING_ACTION_THROTTLE_PRIMARY_CARRIER = 2;
    @android.annotation.SystemApi
    public static final int DATA_THROTTLING_ACTION_THROTTLE_SECONDARY_CARRIER = 1;
    private long mCompletionDurationMillis;
    private int mDataThrottlingAction;
    private DataThrottlingRequest(int p0, long p1) {}
    private DataThrottlingRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getCompletionDurationMillis() { return 0L; }
    public int getDataThrottlingAction() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private long mCompletionDurationMillis;
        private int mDataThrottlingAction;
        public Builder() {}
        public android.telephony.DataThrottlingRequest build() { return null; }
        public android.telephony.DataThrottlingRequest.Builder setCompletionDurationMillis(long p0) { return null; }
        public android.telephony.DataThrottlingRequest.Builder setDataThrottlingAction(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataThrottlingAction {
    }
}
