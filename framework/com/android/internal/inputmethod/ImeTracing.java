package com.android.internal.inputmethod;

public abstract class ImeTracing {
    public static final int IME_TRACING_FROM_CLIENT = 0;
    public static final int IME_TRACING_FROM_IMMS = 2;
    public static final int IME_TRACING_FROM_IMS = 1;
    public static final java.lang.String PROTO_ARG = "--proto-com-android-imetracing";
    static final java.lang.String TAG = "imeTracing";
    static boolean sEnabled;
    private static com.android.internal.inputmethod.ImeTracing sInstance;
    protected boolean mDumpInProgress;
    protected final java.lang.Object mDumpInProgressLock = null;
    private final boolean mIsAvailable = false;
    public ImeTracing() {}
    public static com.android.internal.inputmethod.ImeTracing getInstance() { return null; }
    private static boolean isSystemProcess() { return false; }
    public abstract void addToBuffer(android.util.proto.ProtoOutputStream p0, int p1);
    public boolean isAvailable() { return false; }
    public boolean isEnabled() { return false; }
    protected void logAndPrintln(java.io.PrintWriter p0, java.lang.String p1) {}
    public void saveForBugreport(java.io.PrintWriter p0) {}
    public void setEnabled(boolean p0) {}
    public final void startImeTrace() {}
    public abstract void startTrace(java.io.PrintWriter p0);
    public final void stopImeTrace() {}
    public abstract void stopTrace(java.io.PrintWriter p0);
    public abstract void triggerClientDump(java.lang.String p0, android.view.inputmethod.InputMethodManager p1, byte[] p2);
    public abstract void triggerManagerServiceDump(java.lang.String p0, com.android.internal.inputmethod.ImeTracing.ServiceDumper p1);
    public abstract void triggerServiceDump(java.lang.String p0, com.android.internal.inputmethod.ImeTracing.ServiceDumper p1, byte[] p2);

    @java.lang.FunctionalInterface
    public static interface ServiceDumper {
        public void dumpToProto(android.util.proto.ProtoOutputStream p0, byte[] p1);
    }
}
