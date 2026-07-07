package android.app;

public final class ApplicationStartInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.ApplicationStartInfo> CREATOR = null;
    public static final int LAUNCH_MODE_SINGLE_INSTANCE = 2;
    public static final int LAUNCH_MODE_SINGLE_INSTANCE_PER_TASK = 4;
    public static final int LAUNCH_MODE_SINGLE_TASK = 3;
    public static final int LAUNCH_MODE_SINGLE_TOP = 1;
    public static final int LAUNCH_MODE_STANDARD = 0;
    private static final java.lang.String PROTO_SERIALIZER_ATTRIBUTE_INTENT = "intent";
    private static final java.lang.String PROTO_SERIALIZER_ATTRIBUTE_KEY = "key";
    private static final java.lang.String PROTO_SERIALIZER_ATTRIBUTE_TIMESTAMP = "timestamp";
    private static final java.lang.String PROTO_SERIALIZER_ATTRIBUTE_TIMESTAMPS = "timestamps";
    private static final java.lang.String PROTO_SERIALIZER_ATTRIBUTE_TS = "ts";
    public static final int STARTUP_STATE_ERROR = 1;
    public static final int STARTUP_STATE_FIRST_FRAME_DRAWN = 2;
    public static final int STARTUP_STATE_STARTED = 0;
    public static final int START_COMPONENT_ACTIVITY = 1;
    public static final int START_COMPONENT_BROADCAST = 2;
    public static final int START_COMPONENT_CONTENT_PROVIDER = 3;
    public static final int START_COMPONENT_OTHER = 5;
    public static final int START_COMPONENT_SERVICE = 4;
    public static final int START_REASON_ALARM = 0;
    public static final int START_REASON_BACKUP = 1;
    public static final int START_REASON_BOOT_COMPLETE = 2;
    public static final int START_REASON_BROADCAST = 3;
    public static final int START_REASON_CONTENT_PROVIDER = 4;
    public static final int START_REASON_JOB = 5;
    public static final int START_REASON_LAUNCHER = 6;
    public static final int START_REASON_LAUNCHER_RECENTS = 7;
    public static final int START_REASON_OTHER = 8;
    public static final int START_REASON_PUSH = 9;
    public static final int START_REASON_SERVICE = 10;
    public static final int START_REASON_START_ACTIVITY = 11;
    public static final int START_TIMESTAMP_APPLICATION_ONCREATE = 2;
    public static final int START_TIMESTAMP_BIND_APPLICATION = 3;
    public static final int START_TIMESTAMP_FIRST_FRAME = 4;
    public static final int START_TIMESTAMP_FORK = 1;
    public static final int START_TIMESTAMP_FULLY_DRAWN = 5;
    public static final int START_TIMESTAMP_INITIAL_RENDERTHREAD_FRAME = 6;
    public static final int START_TIMESTAMP_LAUNCH = 0;
    public static final int START_TIMESTAMP_RESERVED_RANGE_DEVELOPER = 30;
    public static final int START_TIMESTAMP_RESERVED_RANGE_DEVELOPER_START = 21;
    public static final int START_TIMESTAMP_RESERVED_RANGE_SYSTEM = 20;
    public static final int START_TIMESTAMP_SURFACEFLINGER_COMPOSITION_COMPLETE = 7;
    public static final int START_TYPE_COLD = 1;
    public static final int START_TYPE_HOT = 3;
    public static final int START_TYPE_UNSET = 0;
    public static final int START_TYPE_WARM = 2;
    private int mDefiningUid;
    private int mLaunchMode;
    private long mMonotonicCreationTimeMs;
    private java.lang.String mPackageName;
    private int mPackageUid;
    private int mPid;
    private java.lang.String mProcessName;
    private int mRealUid;
    private int mReason;
    private int mStartComponent;
    private android.content.Intent mStartIntent;
    private int mStartType;
    private int mStartupState;
    private android.util.ArrayMap<java.lang.Integer, java.lang.Long> mStartupTimestampsNs;
    private boolean mWasForceStopped;
    public ApplicationStartInfo(long p0) {}
    public ApplicationStartInfo(android.app.ApplicationStartInfo p0) {}
    public ApplicationStartInfo(android.os.Parcel p0) {}
    private static java.lang.String intern(java.lang.String p0) { return null; }
    private static java.lang.String reasonToString(int p0) { return null; }
    private static java.lang.String startComponentToString(int p0) { return null; }
    private static java.lang.String startTypeToString(int p0) { return null; }
    private boolean timestampsEquals(android.app.ApplicationStartInfo p0) { return false; }
    public void addStartupTimestamp(int p0, long p1) {}
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, android.icu.text.SimpleDateFormat p3) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getDefiningUid() { return 0; }
    public android.content.Intent getIntent() { return null; }
    public int getLaunchMode() { return 0; }
    public long getMonotonicCreationTimeMs() { return 0L; }
    public java.lang.String getPackageName() { return null; }
    public int getPackageUid() { return 0; }
    public int getPid() { return 0; }
    public java.lang.String getProcessName() { return null; }
    public int getRealUid() { return 0; }
    public int getReason() { return 0; }
    public int getStartComponent() { return 0; }
    public int getStartType() { return 0; }
    public int getStartupState() { return 0; }
    public java.util.Map<java.lang.Integer, java.lang.Long> getStartupTimestamps() { return null; }
    public int hashCode() { return 0; }
    public void readFromProto(android.util.proto.ProtoInputStream p0, long p1, java.io.ByteArrayInputStream p2, java.io.ObjectInputStream p3, com.android.modules.utils.TypedXmlPullParser p4) throws java.io.IOException, android.util.proto.WireTypeMismatchException, java.lang.ClassNotFoundException {}
    public void setDefiningUid(int p0) {}
    public void setForceStopped(boolean p0) {}
    public void setIntent(android.content.Intent p0) {}
    public void setLaunchMode(int p0) {}
    public void setPackageName(java.lang.String p0) {}
    public void setPackageUid(int p0) {}
    public void setPid(int p0) {}
    public void setProcessName(java.lang.String p0) {}
    public void setRealUid(int p0) {}
    public void setReason(int p0) {}
    public void setStartComponent(int p0) {}
    public void setStartType(int p0) {}
    public void setStartupState(int p0) {}
    public boolean wasForceStopped() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1, java.io.ByteArrayOutputStream p2, java.io.ObjectOutputStream p3, com.android.modules.utils.TypedXmlSerializer p4) throws java.io.IOException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LaunchMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StartComponent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StartReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StartType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StartupState {
    }
}
