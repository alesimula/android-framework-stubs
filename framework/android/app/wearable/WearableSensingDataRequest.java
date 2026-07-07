package android.app.wearable;

@android.annotation.SystemApi
public final class WearableSensingDataRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.wearable.WearableSensingDataRequest> CREATOR = null;
    private static final int MAX_REQUEST_SIZE = 200;
    private static final int RATE_LIMIT = 30;
    private static final java.time.Duration RATE_LIMIT_WINDOW_SIZE = null;
    public static final java.lang.String REQUEST_BUNDLE_KEY = "android.app.wearable.WearableSensingDataRequestBundleKey";
    public static final java.lang.String REQUEST_STATUS_CALLBACK_BUNDLE_KEY = "android.app.wearable.WearableSensingDataRequestStatusCallbackBundleKey";
    private final int mDataType = 0;
    private final android.os.PersistableBundle mRequestDetails = null;
    private WearableSensingDataRequest(int p0, android.os.PersistableBundle p1) {}
    public static int getMaxRequestSize() { return 0; }
    public static int getRateLimit() { return 0; }
    public static java.time.Duration getRateLimitWindowSize() { return null; }
    public int describeContents() { return 0; }
    public int getDataSize() { return 0; }
    public int getDataType() { return 0; }
    public android.os.PersistableBundle getRequestDetails() { return null; }
    public java.lang.String toExpandedString() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mDataType;
        private android.os.PersistableBundle mRequestDetails;
        public Builder(int p0) {}
        public android.app.wearable.WearableSensingDataRequest build() { return null; }
        public android.app.wearable.WearableSensingDataRequest.Builder setRequestDetails(android.os.PersistableBundle p0) { return null; }
    }
}
