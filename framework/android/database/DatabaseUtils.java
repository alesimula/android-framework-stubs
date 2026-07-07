package android.database;

public class DatabaseUtils {
    private static final boolean DEBUG = false;
    private static final char[] DIGITS = null;
    public static final int STATEMENT_ABORT = 6;
    public static final int STATEMENT_ATTACH = 3;
    public static final int STATEMENT_BEGIN = 4;
    public static final int STATEMENT_COMMENT = 102;
    public static final int STATEMENT_COMMIT = 5;
    public static final int STATEMENT_CREATE = 101;
    public static final int STATEMENT_DDL = 8;
    public static final int STATEMENT_OTHER = 99;
    public static final int STATEMENT_PRAGMA = 7;
    public static final int STATEMENT_SELECT = 1;
    public static final int STATEMENT_UNPREPARED = 9;
    public static final int STATEMENT_UPDATE = 2;
    public static final int STATEMENT_WITH = 100;
    private static final java.lang.String TAG = "DatabaseUtils";
    private static java.text.Collator mColl;
    public DatabaseUtils() {}
    public static void appendEscapedSQLString(java.lang.StringBuilder p0, java.lang.String p1) {}
    public static java.lang.String[] appendSelectionArgs(java.lang.String[] p0, java.lang.String[] p1) { return null; }
    public static final void appendValueToSql(java.lang.StringBuilder p0, java.lang.Object p1) {}
    private static void bindArgs(android.database.sqlite.SQLiteStatement p0, java.lang.Object[] p1) {}
    public static void bindObjectToProgram(android.database.sqlite.SQLiteProgram p0, int p1, java.lang.Object p2) {}
    public static java.lang.String bindSelection(java.lang.String p0, java.lang.Object... p1) { return null; }
    public static android.os.ParcelFileDescriptor blobFileDescriptorForQuery(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1, java.lang.String[] p2) { return null; }
    public static android.os.ParcelFileDescriptor blobFileDescriptorForQuery(android.database.sqlite.SQLiteStatement p0, java.lang.String[] p1) { return null; }
    private static int categorizeStatement(java.lang.String p0, java.lang.String p1) { return 0; }
    public static java.lang.String concatenateWhere(java.lang.String p0, java.lang.String p1) { return null; }
    public static void createDbFromSqlStatements(android.content.Context p0, java.lang.String p1, int p2, java.lang.String p3) {}
    public static void cursorDoubleToContentValues(android.database.Cursor p0, java.lang.String p1, android.content.ContentValues p2, java.lang.String p3) {}
    public static void cursorDoubleToContentValuesIfPresent(android.database.Cursor p0, android.content.ContentValues p1, java.lang.String p2) {}
    public static void cursorDoubleToCursorValues(android.database.Cursor p0, java.lang.String p1, android.content.ContentValues p2) {}
    public static void cursorFillWindow(android.database.Cursor p0, int p1, android.database.CursorWindow p2) {}
    public static void cursorFloatToContentValuesIfPresent(android.database.Cursor p0, android.content.ContentValues p1, java.lang.String p2) {}
    public static void cursorIntToContentValues(android.database.Cursor p0, java.lang.String p1, android.content.ContentValues p2) {}
    public static void cursorIntToContentValues(android.database.Cursor p0, java.lang.String p1, android.content.ContentValues p2, java.lang.String p3) {}
    public static void cursorIntToContentValuesIfPresent(android.database.Cursor p0, android.content.ContentValues p1, java.lang.String p2) {}
    public static void cursorLongToContentValues(android.database.Cursor p0, java.lang.String p1, android.content.ContentValues p2) {}
    public static void cursorLongToContentValues(android.database.Cursor p0, java.lang.String p1, android.content.ContentValues p2, java.lang.String p3) {}
    public static void cursorLongToContentValuesIfPresent(android.database.Cursor p0, android.content.ContentValues p1, java.lang.String p2) {}
    public static int cursorPickFillWindowStartPosition(int p0, int p1) { return 0; }
    public static void cursorRowToContentValues(android.database.Cursor p0, android.content.ContentValues p1) {}
    public static void cursorShortToContentValuesIfPresent(android.database.Cursor p0, android.content.ContentValues p1, java.lang.String p2) {}
    public static void cursorStringToContentValues(android.database.Cursor p0, java.lang.String p1, android.content.ContentValues p2) {}
    public static void cursorStringToContentValues(android.database.Cursor p0, java.lang.String p1, android.content.ContentValues p2, java.lang.String p3) {}
    public static void cursorStringToContentValuesIfPresent(android.database.Cursor p0, android.content.ContentValues p1, java.lang.String p2) {}
    public static void cursorStringToInsertHelper(android.database.Cursor p0, java.lang.String p1, android.database.DatabaseUtils.InsertHelper p2, int p3) {}
    public static java.lang.Object[] deepCopyOf(java.lang.Object[] p0) { return null; }
    public static void dumpCurrentRow(android.database.Cursor p0) {}
    public static void dumpCurrentRow(android.database.Cursor p0, java.io.PrintStream p1) {}
    public static void dumpCurrentRow(android.database.Cursor p0, java.lang.StringBuilder p1) {}
    public static java.lang.String dumpCurrentRowToString(android.database.Cursor p0) { return null; }
    public static void dumpCursor(android.database.Cursor p0) {}
    public static void dumpCursor(android.database.Cursor p0, java.io.PrintStream p1) {}
    public static void dumpCursor(android.database.Cursor p0, java.lang.StringBuilder p1) {}
    public static java.lang.String dumpCursorToString(android.database.Cursor p0) { return null; }
    private static char[] encodeHex(byte[] p0) { return null; }
    public static java.lang.String escapeForLike(java.lang.String p0) { return null; }
    public static long executeInsert(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1, java.lang.Object[] p2) throws android.database.SQLException { return 0L; }
    public static int executeUpdateDelete(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1, java.lang.Object[] p2) throws android.database.SQLException { return 0; }
    public static int findRowIdColumnIndex(java.lang.String[] p0) { return 0; }
    public static java.lang.String getCollationKey(java.lang.String p0) { return null; }
    private static byte[] getCollationKeyInBytes(java.lang.String p0) { return null; }
    public static java.lang.String getHexCollationKey(java.lang.String p0) { return null; }
    private static int getKeyLen(byte[] p0) { return 0; }
    private static java.lang.String getSqlStatementPrefixExtendedNoRegex(java.lang.String p0) { return null; }
    private static int getSqlStatementPrefixOffset(java.lang.String p0) { return 0; }
    public static int getSqlStatementType(int p0) { return 0; }
    public static int getSqlStatementType(java.lang.String p0) { return 0; }
    public static int getSqlStatementTypeExtended(java.lang.String p0) { return 0; }
    public static int getTypeOfObject(java.lang.Object p0) { return 0; }
    public static long longForQuery(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1, java.lang.String[] p2) { return 0L; }
    public static long longForQuery(android.database.sqlite.SQLiteStatement p0, java.lang.String[] p1) { return 0L; }
    public static boolean queryIsEmpty(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1) { return false; }
    public static long queryNumEntries(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1) { return 0L; }
    public static long queryNumEntries(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1, java.lang.String p2) { return 0L; }
    public static long queryNumEntries(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3) { return 0L; }
    public static final void readExceptionFromParcel(android.os.Parcel p0) {}
    private static final void readExceptionFromParcel(android.os.Parcel p0, java.lang.String p1, int p2) {}
    public static void readExceptionWithFileNotFoundExceptionFromParcel(android.os.Parcel p0) throws java.io.FileNotFoundException {}
    public static void readExceptionWithOperationApplicationExceptionFromParcel(android.os.Parcel p0) throws android.content.OperationApplicationException {}
    public static java.lang.String sqlEscapeString(java.lang.String p0) { return null; }
    public static java.lang.String stringForQuery(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1, java.lang.String[] p2) { return null; }
    public static java.lang.String stringForQuery(android.database.sqlite.SQLiteStatement p0, java.lang.String[] p1) { return null; }
    public static final void writeExceptionToParcel(android.os.Parcel p0, java.lang.Exception p1) {}

    @java.lang.Deprecated
    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        private java.util.HashMap<java.lang.String, java.lang.Integer> mColumns;
        private final android.database.sqlite.SQLiteDatabase mDb = null;
        private java.lang.String mInsertSQL;
        private android.database.sqlite.SQLiteStatement mInsertStatement;
        private android.database.sqlite.SQLiteStatement mPreparedStatement;
        private android.database.sqlite.SQLiteStatement mReplaceStatement;
        private final java.lang.String mTableName = null;
        public InsertHelper(android.database.sqlite.SQLiteDatabase p0, java.lang.String p1) {}
        private void buildSQL() throws android.database.SQLException {}
        private android.database.sqlite.SQLiteStatement getStatement(boolean p0) throws android.database.SQLException { return null; }
        private long insertInternal(android.content.ContentValues p0, boolean p1) { return 0L; }
        public void bind(int p0, double p1) {}
        public void bind(int p0, float p1) {}
        public void bind(int p0, int p1) {}
        public void bind(int p0, long p1) {}
        public void bind(int p0, java.lang.String p1) {}
        public void bind(int p0, boolean p1) {}
        public void bind(int p0, byte[] p1) {}
        public void bindNull(int p0) {}
        public void close() {}
        public long execute() { return 0L; }
        public int getColumnIndex(java.lang.String p0) { return 0; }
        public long insert(android.content.ContentValues p0) { return 0L; }
        public void prepareForInsert() {}
        public void prepareForReplace() {}
        public long replace(android.content.ContentValues p0) { return 0L; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SqlStatementExtendedType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SqlStatementType {
    }
}
