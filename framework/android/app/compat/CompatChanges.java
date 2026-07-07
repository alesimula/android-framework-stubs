package android.app.compat;

@android.annotation.SystemApi
public final class CompatChanges {
    private static final android.app.compat.ChangeIdStateCache QUERY_CACHE = null;
    private CompatChanges() {}
    public static boolean isChangeEnabled(long p0) { return false; }
    public static boolean isChangeEnabled(long p0, int p1) { return false; }
    public static boolean isChangeEnabled(long p0, java.lang.String p1, android.os.UserHandle p2) { return false; }
    public static void putAllPackageOverrides(java.util.Map<java.lang.String, java.util.Map<java.lang.Long, android.app.compat.PackageOverride>> p0) {}
    public static void putPackageOverrides(java.lang.String p0, java.util.Map<java.lang.Long, android.app.compat.PackageOverride> p1) {}
    public static void removeAllPackageOverrides(java.util.Map<java.lang.String, java.util.Set<java.lang.Long>> p0) {}
    public static void removePackageOverrides(java.lang.String p0, java.util.Set<java.lang.Long> p1) {}
    private static void validateChangeId(long p0) {}
}
