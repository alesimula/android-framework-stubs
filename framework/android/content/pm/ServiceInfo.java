package android.content.pm;

public class ServiceInfo extends android.content.pm.ComponentInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.ServiceInfo> CREATOR = null;
    public static final int FLAG_ALLOW_SHARED_ISOLATED_PROCESS = 16;
    public static final int FLAG_EXTERNAL_SERVICE = 4;
    public static final int FLAG_ISOLATED_PROCESS = 2;
    public static final int FLAG_NATIVE_SERVICE = 32;
    public static final int FLAG_RUN_IN_PCC_SANDBOX = 524288;
    public static final int FLAG_SINGLE_USER = 1073741824;
    public static final int FLAG_STOP_WITH_TASK = 1;
    public static final int FLAG_SYSTEM_USER_ONLY = 536870912;
    public static final int FLAG_USE_APP_ZYGOTE = 8;
    public static final int FLAG_VISIBLE_TO_INSTANT_APP = 1048576;
    public static final int FOREGROUND_SERVICE_TYPES_MAX_INDEX = 30;
    public static final int FOREGROUND_SERVICE_TYPE_CAMERA = 64;
    public static final int FOREGROUND_SERVICE_TYPE_CONNECTED_DEVICE = 16;
    public static final int FOREGROUND_SERVICE_TYPE_DATA_SYNC = 1;
    public static final int FOREGROUND_SERVICE_TYPE_FILE_MANAGEMENT = 4096;
    public static final int FOREGROUND_SERVICE_TYPE_HEALTH = 256;
    public static final int FOREGROUND_SERVICE_TYPE_LOCATION = 8;
    public static final int FOREGROUND_SERVICE_TYPE_MANIFEST = -1;
    public static final int FOREGROUND_SERVICE_TYPE_MEDIA_PLAYBACK = 2;
    public static final int FOREGROUND_SERVICE_TYPE_MEDIA_PROCESSING = 8192;
    public static final int FOREGROUND_SERVICE_TYPE_MEDIA_PROJECTION = 32;
    public static final int FOREGROUND_SERVICE_TYPE_MICROPHONE = 128;
    @java.lang.Deprecated
    public static final int FOREGROUND_SERVICE_TYPE_NONE = 0;
    public static final int FOREGROUND_SERVICE_TYPE_PHONE_CALL = 4;
    public static final int FOREGROUND_SERVICE_TYPE_REMOTE_MESSAGING = 512;
    public static final int FOREGROUND_SERVICE_TYPE_SHORT_SERVICE = 2048;
    public static final int FOREGROUND_SERVICE_TYPE_SPECIAL_USE = 1073741824;
    public static final int FOREGROUND_SERVICE_TYPE_SYSTEM_EXEMPTED = 1024;
    public int flags;
    public int mForegroundServiceType;
    public java.lang.String permission;
    public ServiceInfo() { super(); }
    public ServiceInfo(android.content.pm.ServiceInfo p0) { super(); }
    private ServiceInfo(android.os.Parcel p0) { super(); }
    public static java.lang.String foregroundServiceTypeToLabel(int p0) { return null; }
    public int describeContents() { return 0; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    void dump(android.util.Printer p0, java.lang.String p1, int p2) {}
    public int getForegroundServiceType() { return 0; }
    public boolean shouldRunInPccSandbox() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ForegroundServiceType {
    }
}
