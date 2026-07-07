package com.android.net.module.util;

public class SdkUtil {
    public SdkUtil() {}
    public static boolean isAtLeast25Q4() { return false; }
    public static boolean isAtLeast26Q2() { return false; }
    public static boolean isFullSdkVersionAtMost(int p0) { return false; }

    public static class LateSdk<T extends java.lang.Object> {
        public final T value = null;
        public LateSdk(T p0) {}
    }
}
