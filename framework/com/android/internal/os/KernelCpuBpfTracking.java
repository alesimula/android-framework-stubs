package com.android.internal.os;

public final class KernelCpuBpfTracking {
    private static long[] sFreqs;
    private static int[] sFreqsClusters;
    private static boolean sTracking;
    private KernelCpuBpfTracking() {}
    public static int getClusters() { return 0; }
    public static long[] getFreqs() { return null; }
    public static int[] getFreqsClusters() { return null; }
    private static native int[] getFreqsClustersInternal();
    static native long[] getFreqsInternal();
    public static native boolean isSupported();
    public static boolean startTracking() { return false; }
    private static native boolean startTrackingInternal();
}
