package android.content;

public class SearchRecentSuggestionsProvider extends android.content.ContentProvider {
    public static final int DATABASE_MODE_2LINES = 2;
    public static final int DATABASE_MODE_QUERIES = 1;
    private static final int DATABASE_VERSION = 512;
    private static final java.lang.String NULL_COLUMN = "query";
    private static final java.lang.String ORDER_BY = "date DESC";
    private static final java.lang.String TAG = "SuggestionsProvider";
    private static final int URI_MATCH_SUGGEST = 1;
    private static final java.lang.String sDatabaseName = "suggestions.db";
    private static final java.lang.String sSuggestions = "suggestions";
    private java.lang.String mAuthority;
    private int mMode;
    private android.database.sqlite.SQLiteOpenHelper mOpenHelper;
    private java.lang.String mSuggestSuggestionClause;
    private java.lang.String[] mSuggestionProjection;
    private android.net.Uri mSuggestionsUri;
    private boolean mTwoLineDisplay;
    private android.content.UriMatcher mUriMatcher;
    public SearchRecentSuggestionsProvider() { super(); }
    public int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    public java.lang.String getType(android.net.Uri p0) { return null; }
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) { return null; }
    public boolean onCreate() { return false; }
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    protected void setupSuggestions(java.lang.String p0, int p1) {}
    public int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }

    private static class DatabaseHelper extends android.database.sqlite.SQLiteOpenHelper {
        private int mNewVersion;
        public DatabaseHelper(android.content.Context p0, int p1) { super((android.content.Context)null, (java.lang.String)null, 0, (android.database.sqlite.SQLiteDatabase.OpenParams)null); }
        public void onCreate(android.database.sqlite.SQLiteDatabase p0) {}
        public void onUpgrade(android.database.sqlite.SQLiteDatabase p0, int p1, int p2) {}
    }
}
