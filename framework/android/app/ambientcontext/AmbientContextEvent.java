package android.app.ambientcontext;

@android.annotation.SystemApi
public final class AmbientContextEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.ambientcontext.AmbientContextEvent> CREATOR = null;
    public static final int EVENT_BACK_DOUBLE_TAP = 3;
    public static final int EVENT_COUGH = 1;
    public static final int EVENT_EMERGENCY = 4;
    public static final int EVENT_SNORE = 2;
    public static final int EVENT_UNKNOWN = 0;
    public static final int EVENT_VENDOR_WEARABLE_START = 100000;
    public static final java.lang.String KEY_VENDOR_WEARABLE_EVENT_NAME = "wearable_event_name";
    public static final int LEVEL_HIGH = 5;
    public static final int LEVEL_LOW = 1;
    public static final int LEVEL_MEDIUM = 3;
    public static final int LEVEL_MEDIUM_HIGH = 4;
    public static final int LEVEL_MEDIUM_LOW = 2;
    public static final int LEVEL_UNKNOWN = 0;
    static com.android.internal.util.Parcelling<java.time.Instant> sParcellingForEndTime;
    static com.android.internal.util.Parcelling<java.time.Instant> sParcellingForStartTime;
    private final int mConfidenceLevel = 0;
    private final int mDensityLevel = 0;
    private final java.time.Instant mEndTime = null;
    private final int mEventType = 0;
    private final java.time.Instant mStartTime = null;
    private final android.os.PersistableBundle mVendorData = null;
    AmbientContextEvent(int p0, java.time.Instant p1, java.time.Instant p2, int p3, int p4, android.os.PersistableBundle p5) {}
    AmbientContextEvent(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static int defaultConfidenceLevel() { return 0; }
    private static int defaultDensityLevel() { return 0; }
    private static java.time.Instant defaultEndTime() { return null; }
    private static int defaultEventType() { return 0; }
    private static java.time.Instant defaultStartTime() { return null; }
    private static android.os.PersistableBundle defaultVendorData() { return null; }
    public static java.lang.String eventToString(int p0) { return null; }
    public static java.lang.String levelToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public int getConfidenceLevel() { return 0; }
    public int getDensityLevel() { return 0; }
    public java.time.Instant getEndTime() { return null; }
    public int getEventType() { return 0; }
    public java.time.Instant getStartTime() { return null; }
    public android.os.PersistableBundle getVendorData() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mBuilderFieldsSet;
        private int mConfidenceLevel;
        private int mDensityLevel;
        private java.time.Instant mEndTime;
        private int mEventType;
        private java.time.Instant mStartTime;
        private android.os.PersistableBundle mVendorData;
        public Builder() {}
        private void checkNotUsed() {}
        public android.app.ambientcontext.AmbientContextEvent build() { return null; }
        public android.app.ambientcontext.AmbientContextEvent.Builder setConfidenceLevel(int p0) { return null; }
        public android.app.ambientcontext.AmbientContextEvent.Builder setDensityLevel(int p0) { return null; }
        public android.app.ambientcontext.AmbientContextEvent.Builder setEndTime(java.time.Instant p0) { return null; }
        public android.app.ambientcontext.AmbientContextEvent.Builder setEventType(int p0) { return null; }
        public android.app.ambientcontext.AmbientContextEvent.Builder setStartTime(java.time.Instant p0) { return null; }
        public android.app.ambientcontext.AmbientContextEvent.Builder setVendorData(android.os.PersistableBundle p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Event {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Level {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LevelValue {
    }
}
