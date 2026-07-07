package android.app;

public class ProfilerInfo implements android.os.Parcelable {
    public static final int CLOCK_TYPE_DEFAULT = 0;
    public static final int CLOCK_TYPE_DUAL = 272;
    public static final int CLOCK_TYPE_MASK = -273;
    public static final int CLOCK_TYPE_THREAD_CPU = 256;
    public static final int CLOCK_TYPE_WALL = 16;
    public static final android.os.Parcelable.Creator<android.app.ProfilerInfo> CREATOR = null;
    public static final int DEFAULT_FLAGS = 0;
    public static final int OUTPUT_VERSION_DEFAULT = 1;
    public static final int OUTPUT_VERSION_MASK = -7;
    public static final int PROFILE_TYPE_LOW_OVERHEAD = 1;
    public static final int PROFILE_TYPE_REGULAR = 0;
    private static final java.lang.String TAG = "ProfilerInfo";
    public static final int TRACE_FORMAT_VERSION_SHIFT = 1;
    public final java.lang.String agent = null;
    public final boolean attachAgentDuringBind = false;
    public final boolean autoStopProfiler = false;
    public final long durationMicros = 0L;
    public android.os.ParcelFileDescriptor profileFd;
    public final java.lang.String profileFile = null;
    public final boolean profileLongRunningMethods = false;
    public final int profilerFlags = 0;
    public final int samplingInterval = 0;
    public final boolean streamingOutput = false;
    public ProfilerInfo(android.app.ProfilerInfo p0) {}
    private ProfilerInfo(android.os.Parcel p0) {}
    public ProfilerInfo(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, int p7, boolean p8, long p9) {}
    public static int getClockTypeFromString(java.lang.String p0) { return 0; }
    public static int getFlagsForOutputVersion(int p0) { return 0; }
    public static int updateFlags(int p0, int p1, int p2) { return 0; }
    public void closeFd() {}
    public int describeContents() { return 0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public android.app.ProfilerInfo setAgent(java.lang.String p0, boolean p1) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
