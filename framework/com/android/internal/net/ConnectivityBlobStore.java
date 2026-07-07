package com.android.internal.net;

public class ConnectivityBlobStore {
    private static final java.lang.String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS blob_table (owner INTEGER,name BLOB,blob BLOB,UNIQUE(owner, name));";
    private static final java.lang.String ROOT_DIR = "/data/misc/connectivityblobdb/";
    private static final java.lang.String TABLENAME = "blob_table";
    private static final java.lang.String TAG = null;
    private final android.database.sqlite.SQLiteDatabase mDb = null;
    public ConnectivityBlobStore(java.io.File p0) {}
    public ConnectivityBlobStore(java.lang.String p0) {}
    public byte[] get(java.lang.String p0) { return null; }
    protected int getCallingUidMockable() { return 0; }
    public java.lang.String[] list(java.lang.String p0) { return null; }
    public boolean put(java.lang.String p0, byte[] p1) { return false; }
    public boolean remove(java.lang.String p0) { return false; }
    public boolean removeAll() { return false; }
}
