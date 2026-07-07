package android.telephony;

public class DropBoxManagerLoggerBackend implements android.telephony.PersistentLoggerBackend {
    private static final int BUFFER_SIZE_BYTES = 512000;
    private static final java.lang.String DROPBOX_TAG = "DropBoxManagerLoggerBackend";
    private static final java.time.ZoneId LOCAL_ZONE_ID = null;
    private static final java.time.format.DateTimeFormatter LOG_TIMESTAMP_FORMATTER = null;
    private static final int MIN_BUFFER_BYTES_FOR_FLUSH = 5120;
    private static final java.lang.String TAG = "DropBoxManagerLoggerBackend";
    private static android.telephony.DropBoxManagerLoggerBackend sInstance;
    private final java.lang.Object mBufferLock = null;
    private long mBufferStartTime;
    private final android.os.DropBoxManager mDropBoxManager = null;
    private final boolean mDropBoxManagerLoggingEnabled = false;
    private final android.os.Handler mHandler = null;
    private final android.os.HandlerThread mHandlerThread = null;
    private boolean mIsLoggingEnabled;
    private final java.lang.StringBuilder mLogBuffer = null;
    private DropBoxManagerLoggerBackend(android.content.Context p0) {}
    private void bufferLog(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Optional<java.lang.Throwable> p3) {}
    private java.lang.String formatLog(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Optional<java.lang.Throwable> p3) { return null; }
    private java.lang.String formatTimestamp(long p0) { return null; }
    public static android.telephony.DropBoxManagerLoggerBackend getInstance(android.content.Context p0) { return null; }
    private boolean persistentLoggingEnabled(android.content.Context p0) { return false; }
    public void debug(java.lang.String p0, java.lang.String p1) {}
    public void error(java.lang.String p0, java.lang.String p1) {}
    public void error(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) {}
    public void flush() {}
    public void flushAsync() {}
    public void info(java.lang.String p0, java.lang.String p1) {}
    public void setLoggingEnabled(boolean p0) {}
    public void warn(java.lang.String p0, java.lang.String p1) {}
    public void warn(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) {}
}
