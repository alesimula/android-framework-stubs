package android.net.netstats;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class NetworkStatsDataMigrationUtils {
    private static final int BUFFER_SIZE = 8192;
    private static final int FILE_MAGIC = 1095648596;
    public static final java.lang.String PREFIX_UID = "uid";
    public static final java.lang.String PREFIX_UID_TAG = "uid_tag";
    public static final java.lang.String PREFIX_XT = "xt";
    private static final java.util.Map<java.lang.String, java.lang.String> sPrefixLegacyFileNameMap = null;
    private NetworkStatsDataMigrationUtils() {}
    private static int getCollapsedLegacyType(int p0) { return 0; }
    private static java.io.File getLegacyBinFileForPrefix(java.lang.String p0) { return null; }
    private static java.io.File getPlatformBaseDir() { return null; }
    private static java.util.ArrayList<java.io.File> getPlatformFileListForPrefix(java.lang.String p0) { return null; }
    private static java.io.File getPlatformSystemDir() { return null; }
    private static long[] readFullLongArray(java.io.DataInput p0) throws java.io.IOException { return null; }
    public static void readLegacyUid(android.net.NetworkStatsCollection.Builder p0, java.io.DataInput p1, boolean p2) throws java.io.IOException {}
    private static void readLegacyUid(android.net.NetworkStatsCollection.Builder p0, java.io.File p1, boolean p2) throws java.io.IOException {}
    private static java.lang.String readOptionalString(java.io.DataInput p0) throws java.io.IOException { return null; }
    public static android.net.NetworkStatsCollection readPlatformCollection(java.lang.String p0, long p1) throws java.io.IOException { return null; }
    public static void readPlatformCollection(android.net.NetworkStatsCollection.Builder p0, java.io.DataInput p1) throws java.io.IOException {}
    private static void readPlatformCollection(android.net.NetworkStatsCollection.Builder p0, java.io.File p1) throws java.io.IOException {}
    private static android.net.NetworkStatsHistory readPlatformHistory(java.io.DataInput p0) throws java.io.IOException { return null; }
    private static java.util.Set<android.net.NetworkIdentity> readPlatformNetworkIdentitySet(java.io.DataInput p0) throws java.io.IOException { return null; }
    private static long readVarLong(java.io.DataInput p0) throws java.io.IOException { return 0L; }
    private static long[] readVarLongArray(java.io.DataInput p0) throws java.io.IOException { return null; }

    private static class CollectionVersion {
        static final int VERSION_NETWORK_INIT = 1;
        static final int VERSION_UID_INIT = 1;
        static final int VERSION_UID_WITH_IDENT = 2;
        static final int VERSION_UID_WITH_SET = 4;
        static final int VERSION_UID_WITH_TAG = 3;
        static final int VERSION_UNIFIED_INIT = 16;
        private CollectionVersion() {}
    }

    private static class HistoryVersion {
        static final int VERSION_ADD_ACTIVE = 3;
        static final int VERSION_ADD_PACKETS = 2;
        static final int VERSION_INIT = 1;
        private HistoryVersion() {}
    }

    private static class IdentitySetVersion {
        static final int VERSION_ADD_DEFAULT_NETWORK = 5;
        static final int VERSION_ADD_METERED = 4;
        static final int VERSION_ADD_NETWORK_ID = 3;
        static final int VERSION_ADD_OEM_MANAGED_NETWORK = 6;
        static final int VERSION_ADD_ROAMING = 2;
        static final int VERSION_ADD_SUB_ID = 7;
        static final int VERSION_INIT = 1;
        private IdentitySetVersion() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Prefix {
    }
}
