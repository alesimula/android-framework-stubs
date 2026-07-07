package android.app;

public class RunningAppProcessInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.RunningAppProcessInfo> CREATOR = null;
    public static final int FLAG_CANT_SAVE_STATE = 1;
    public static final int FLAG_HAS_ACTIVITIES = 4;
    public static final int FLAG_PERSISTENT = 2;
    @java.lang.Deprecated
    public static final int IMPORTANCE_BACKGROUND = 400;
    public static final int IMPORTANCE_CACHED = 400;
    public static final int IMPORTANCE_CANT_SAVE_STATE = 350;
    public static final int IMPORTANCE_CANT_SAVE_STATE_PRE_26 = 170;
    public static final int IMPORTANCE_FOREGROUND = 100;
    public static final int IMPORTANCE_FOREGROUND_SERVICE = 125;
    public static final int IMPORTANCE_GONE = 1000;
    public static final int IMPORTANCE_PERCEPTIBLE = 230;
    public static final int IMPORTANCE_PERCEPTIBLE_PRE_26 = 130;
    public static final int IMPORTANCE_SERVICE = 300;
    public static final int IMPORTANCE_TOP_SLEEPING = 325;
    public static final int IMPORTANCE_VISIBLE = 200;
    public static final int REASON_PROVIDER_IN_USE = 1;
    public static final int REASON_SERVICE_IN_USE = 2;
    public static final int REASON_UNKNOWN = 0;
    public int flags;
    public int importance;
    public int importanceReasonCode;
    public java.lang.String importanceReasonComponent;
    public int importanceReasonImportance;
    public int importanceReasonPid;
    public boolean isFocused;
    public long lastActivityTime;
    public int lastTrimLevel;
    public int lru;
    public int pid;
    public java.lang.String[] pkgDeps;
    public java.lang.String[] pkgList;
    public java.lang.String processName;
    public int processState;
    public int uid;
    public RunningAppProcessInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
