package com.android.internal.inputmethod;

final class ImeTracingPerfettoImpl extends com.android.internal.inputmethod.ImeTracing {
    private final android.tracing.inputmethod.InputMethodDataSource mDataSource = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsClientDumpInProgress = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsManagerServiceDumpInProgress = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsServiceDumpInProgress = null;
    private final java.util.concurrent.atomic.AtomicInteger mTracingSessionsCount = null;
    ImeTracingPerfettoImpl() { super(); }
    public void addToBuffer(android.util.proto.ProtoOutputStream p0, int p1) {}
    public boolean isEnabled() { return false; }
    public void startTrace(java.io.PrintWriter p0) {}
    public void stopTrace(java.io.PrintWriter p0) {}
    public void triggerClientDump(java.lang.String p0, android.view.inputmethod.InputMethodManager p1, byte[] p2) {}
    public void triggerManagerServiceDump(java.lang.String p0, com.android.internal.inputmethod.ImeTracing.ServiceDumper p1) {}
    public void triggerServiceDump(java.lang.String p0, com.android.internal.inputmethod.ImeTracing.ServiceDumper p1, byte[] p2) {}
}
