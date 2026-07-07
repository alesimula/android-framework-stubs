package android.media.tv.extension;

public class TvExtensionDbHelper extends android.database.sqlite.SQLiteOpenHelper {
    private static final java.lang.String DATABASE_NAME = "tv_extension.db";
    private static final int DATABASE_VERSION = 1;
    private static final java.lang.String TAG = "TvExtensionDbHelper";
    public TvExtensionDbHelper(android.content.Context p0) { super((android.content.Context)null, (java.lang.String)null, 0, (android.database.sqlite.SQLiteDatabase.OpenParams)null); }
    private static int getDbVersion() { return 0; }
    public void onCreate(android.database.sqlite.SQLiteDatabase p0) {}
    public void onUpgrade(android.database.sqlite.SQLiteDatabase p0, int p1, int p2) {}
}
