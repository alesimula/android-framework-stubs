package dalvik.system;

public class VMDebug {
    public VMDebug() {}
    public long[] countInstancesOfClasses(java.lang.Class[] p0, boolean p1) { return null; }
    public dalvik.system.VMDebug.ExecutableMethodFileOffsets getExecutableMethodFileOffsets(java.lang.reflect.Executable p0) { return null; }
    public dalvik.system.VMDebug.ExecutableMethodFileOffsets getExecutableMethodFileOffsets(java.lang.reflect.Method p0) { return null; }
    public void startMethodTracing(java.lang.String p0, java.io.FileDescriptor p1, int p2, int p3, boolean p4, int p5, boolean p6) {}
    public void attachAgent(java.lang.String p0, java.lang.ClassLoader p1) {}
    public void setAllocTrackerStackDepth(int p0) {}
    public void setUserId(int p0) {}
    public void addApplication(java.lang.String p0) {}
    public void removeApplication(java.lang.String p0) {}
    public void startLowOverheadTraceForLongRunningMethods(long p0) {}
    public void startLowOverheadTraceForAllMethods() {}
    public void dumpLowOverheadTrace(dalvik.system.VMDebug.TraceDestination p0) {}
    public void stopLowOverheadTrace() {}
    public void dumpHprofData(java.lang.String p0) {}
    public void dumpHprofData(java.lang.String p0, java.io.FileDescriptor p1) {}
    public void dumpHprofDataDdms() {}
    public void dumpReferenceTables() {}
    public int getAllocCount(int p0) { return 0; }
    public long countInstancesOfClass(java.lang.Class p0, boolean p1) { return 0L; }
    public int getLoadedClassCount() { return 0; }
    public int getMethodTracingMode() { return 0; }
    public java.lang.String getRuntimeStat(java.lang.String p0) { return null; }
    public java.util.Map getRuntimeStats() { return null; }
    public java.lang.String[] getVmFeatureList() { return null; }
    public boolean isDebuggerConnected() { return false; }
    public void printLoadedClasses(int p0) {}
    public void resetAllocCount(int p0) {}
    public void setWaitingForDebugger(boolean p0) {}
    public void startAllocCounting() {}
    public void startMethodTracing(java.lang.String p0, int p1, int p2, boolean p3, int p4) {}
    public void startMethodTracingDdms(int p0, int p1, boolean p2, int p3) {}
    public void stopAllocCounting() {}
    public void stopMethodTracing() {}
    public boolean isDebuggingEnabled() { return false; }
    public void suspendAllAndSendVmStart() {}
    public long threadCpuTimeNanos() { return 0L; }
    public long lastDebuggerActivity() { return 0L; }
    public void setCurrentProcessName(java.lang.String p0) {}

    public static class ExecutableMethodFileOffsets {
        public ExecutableMethodFileOffsets() {}
        public java.lang.String getContainerPath() { return null; }
        public long getContainerOffset() { return 0L; }
        public long getMethodOffset() { return 0L; }
    }

    public static class TraceDestination {
        public TraceDestination() {}
        public dalvik.system.VMDebug.TraceDestination fromFileDescriptor(java.io.FileDescriptor p0) { return null; }
    }
}
