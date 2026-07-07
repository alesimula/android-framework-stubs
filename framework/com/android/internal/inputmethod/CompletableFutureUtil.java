package com.android.internal.inputmethod;

public final class CompletableFutureUtil {
    private CompletableFutureUtil() {}
    public static boolean getBooleanResult(java.util.concurrent.CompletableFuture<java.lang.Boolean> p0) { return false; }
    public static int getIntegerResult(java.util.concurrent.CompletableFuture<java.lang.Integer> p0) { return 0; }
    public static <T extends java.lang.Object> T getResult(java.util.concurrent.CompletableFuture<T> p0) { return null; }
    public static boolean getResultOrFalse(java.util.concurrent.CompletableFuture<java.lang.Boolean> p0, java.lang.String p1, java.lang.String p2, com.android.internal.inputmethod.CancellationGroup p3, long p4) { return false; }
    public static <T extends java.lang.Object> T getResultOrNull(java.util.concurrent.CompletableFuture<T> p0, java.lang.String p1, java.lang.String p2, com.android.internal.inputmethod.CancellationGroup p3, long p4) { return null; }
    public static int getResultOrZero(java.util.concurrent.CompletableFuture<java.lang.Integer> p0, java.lang.String p1, java.lang.String p2, com.android.internal.inputmethod.CancellationGroup p3, long p4) { return 0; }
    private static <T extends java.lang.Object> T getValueOrNullInternal(java.util.concurrent.CompletableFuture<T> p0, java.lang.String p1, java.lang.String p2, long p3, com.android.internal.inputmethod.CancellationGroup p4) { return null; }
    private static <T extends java.lang.Object> T getValueOrRethrowErrorInternal(java.util.concurrent.CompletableFuture<T> p0) { return null; }
    private static void logCancellationInternal(java.lang.String p0, java.lang.String p1) {}
    private static void logErrorInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    private static void logTimeoutInternal(java.lang.String p0, java.lang.String p1, long p2) {}
}
