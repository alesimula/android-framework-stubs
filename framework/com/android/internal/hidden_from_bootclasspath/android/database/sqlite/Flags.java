package com.android.internal.hidden_from_bootclasspath.android.database.sqlite;

public final class Flags {
    public static final java.lang.String FLAG_CONCURRENT_OPEN_HELPER = "android.database.sqlite.concurrent_open_helper";
    public static final java.lang.String FLAG_REPORT_ACTIVE_DB_CONFIGURATION = "android.database.sqlite.report_active_db_configuration";
    public static final java.lang.String FLAG_SQLITE_APIS_35 = "android.database.sqlite.sqlite_apis_35";
    public Flags() {}
    public static boolean concurrentOpenHelper() { return false; }
    public static boolean reportActiveDbConfiguration() { return false; }
    public static boolean sqliteApis35() { return false; }
}
