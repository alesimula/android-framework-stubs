package com.android.internal.flags;

public abstract class CoreFlags {
    public static android.flags.BooleanFlag BOOL_FLAG;
    public static android.flags.DynamicBooleanFlag DYN_FLAG;
    public static android.flags.FusedOffFlag OFF_FLAG;
    public static android.flags.FusedOnFlag ON_FLAG;
    private static final java.util.List<android.flags.SyncableFlag> sKnownFlags = null;
    public CoreFlags() {}
    private static android.flags.BooleanFlag booleanFlag(java.lang.String p0, java.lang.String p1, boolean p2) { return null; }
    private static android.flags.DynamicBooleanFlag dynamicBooleanFlag(java.lang.String p0, java.lang.String p1, boolean p2) { return null; }
    private static android.flags.FusedOffFlag fusedOffFlag(java.lang.String p0, java.lang.String p1) { return null; }
    private static android.flags.FusedOnFlag fusedOnFlag(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.util.List<android.flags.SyncableFlag> getCoreFlags() { return null; }
    public static boolean isCoreFlag(android.flags.SyncableFlag p0) { return false; }
}
