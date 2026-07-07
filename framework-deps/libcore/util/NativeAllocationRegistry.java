package libcore.util;

public class NativeAllocationRegistry {
    public NativeAllocationRegistry(java.lang.ClassLoader p0, long p1, long p2) {}
    public java.util.Collection getMetrics() { return null; }
    public java.lang.Runnable registerNativeAllocation(java.lang.Object p0, long p1) { return null; }
    public libcore.util.NativeAllocationRegistry createMalloced(java.lang.ClassLoader p0, long p1) { return null; }
    public libcore.util.NativeAllocationRegistry createMalloced(java.lang.Class p0, long p1) { return null; }
    public libcore.util.NativeAllocationRegistry createMalloced(java.lang.Class p0, long p1, long p2) { return null; }
    public libcore.util.NativeAllocationRegistry createNonmalloced(java.lang.Class p0, long p1, long p2) { return null; }
    public libcore.util.NativeAllocationRegistry createMalloced(java.lang.ClassLoader p0, long p1, long p2) { return null; }
    public libcore.util.NativeAllocationRegistry createNonmalloced(java.lang.ClassLoader p0, long p1, long p2) { return null; }
    public void applyFreeFunction(long p0, long p1) {}

    public static class Metrics {
        public Metrics() {}
        public java.lang.String getClassName() { return null; }
        public long getMallocedCount() { return 0L; }
        public long getMallocedBytes() { return 0L; }
        public long getNonmallocedCount() { return 0L; }
        public long getNonmallocedBytes() { return 0L; }
    }
}
