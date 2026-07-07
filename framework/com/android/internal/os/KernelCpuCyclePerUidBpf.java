package com.android.internal.os;

public class KernelCpuCyclePerUidBpf {
    private static final java.lang.String TAG = "KernelCpuCyclePerUidBpf";
    private static boolean sLibraryLoaded;
    private KernelCpuCyclePerUidBpf() {}
    public static boolean isSupported() { return false; }
    private static native boolean isSupportedInternal();
    public static long readDesyncCount() { return 0L; }
    private static native long readDesyncCountInternal();
    public static long readLastRecordedCycle() { return 0L; }
    private static native long readLastRecordedCycleInternal();
    public static long readPackagePower() { return 0L; }
    private static native long readPackagePowerInternal();
    public static long[] readUidCpuCycles() { return null; }
    private static native long[] readUidCpuCyclesInternal();
    public static long[] readUidPowerDelta() { return null; }
    private static native long[] readUidPowerDeltaInternal();
    public static boolean startTracking() { return false; }
    private static native boolean startTrackingInternal();
    public static void stopTracking() {}
    private static native void stopTrackingInternal();
}
