package com.android.internal.hidden_from_bootclasspath.android.print.flags;

public final class Flags {
    public static final java.lang.String FLAG_ENABLE_PRINT_SPOOLER_AUTO_UNBIND = "android.print.flags.enable_print_spooler_auto_unbind";
    public static final java.lang.String FLAG_ENABLE_SETUP_ACTIVITY = "android.print.flags.enable_setup_activity";
    public static final java.lang.String FLAG_SKIP_UNNEEDED_PRINT_CLEANUP = "android.print.flags.skip_unneeded_print_cleanup";
    public Flags() {}
    public static boolean enablePrintSpoolerAutoUnbind() { return false; }
    public static boolean enableSetupActivity() { return false; }
    public static boolean skipUnneededPrintCleanup() { return false; }
}
