package com.android.internal.inputmethod;

public final class InputMethodPrivilegedOperationsRegistry {
    private static final java.lang.Object sLock = null;
    private static com.android.internal.inputmethod.InputMethodPrivilegedOperations sNop;
    private static java.util.WeakHashMap<android.os.IBinder, java.lang.ref.WeakReference<com.android.internal.inputmethod.InputMethodPrivilegedOperations>> sRegistry;
    private InputMethodPrivilegedOperationsRegistry() {}
    public static com.android.internal.inputmethod.InputMethodPrivilegedOperations get(android.os.IBinder p0) { return null; }
    private static com.android.internal.inputmethod.InputMethodPrivilegedOperations getNopOps() { return null; }
    public static void put(android.os.IBinder p0, com.android.internal.inputmethod.InputMethodPrivilegedOperations p1) {}
    public static void remove(android.os.IBinder p0) {}
}
