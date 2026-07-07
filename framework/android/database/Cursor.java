package android.database;

public interface Cursor extends java.io.Closeable {
    public static final int FIELD_TYPE_BLOB = 4;
    public static final int FIELD_TYPE_FLOAT = 2;
    public static final int FIELD_TYPE_INTEGER = 1;
    public static final int FIELD_TYPE_NULL = 0;
    public static final int FIELD_TYPE_STRING = 3;
    public void close();
    public void copyStringToBuffer(int p0, android.database.CharArrayBuffer p1);
    @java.lang.Deprecated
    public void deactivate();
    public byte[] getBlob(int p0);
    public int getColumnCount();
    public int getColumnIndex(java.lang.String p0);
    public int getColumnIndexOrThrow(java.lang.String p0) throws java.lang.IllegalArgumentException;
    public java.lang.String getColumnName(int p0);
    public java.lang.String[] getColumnNames();
    public int getCount();
    public double getDouble(int p0);
    public android.os.Bundle getExtras();
    public float getFloat(int p0);
    public int getInt(int p0);
    public long getLong(int p0);
    public android.net.Uri getNotificationUri();
    default public java.util.List<android.net.Uri> getNotificationUris() { return null; }
    public int getPosition();
    public short getShort(int p0);
    public java.lang.String getString(int p0);
    public int getType(int p0);
    public boolean getWantsAllOnMoveCalls();
    public boolean isAfterLast();
    public boolean isBeforeFirst();
    public boolean isClosed();
    public boolean isFirst();
    public boolean isLast();
    public boolean isNull(int p0);
    public boolean move(int p0);
    public boolean moveToFirst();
    public boolean moveToLast();
    public boolean moveToNext();
    public boolean moveToPosition(int p0);
    public boolean moveToPrevious();
    public void registerContentObserver(android.database.ContentObserver p0);
    public void registerDataSetObserver(android.database.DataSetObserver p0);
    @java.lang.Deprecated
    public boolean requery();
    public android.os.Bundle respond(android.os.Bundle p0);
    public void setExtras(android.os.Bundle p0);
    public void setNotificationUri(android.content.ContentResolver p0, android.net.Uri p1);
    default public void setNotificationUris(android.content.ContentResolver p0, java.util.List<android.net.Uri> p1) {}
    public void unregisterContentObserver(android.database.ContentObserver p0);
    public void unregisterDataSetObserver(android.database.DataSetObserver p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FieldType {
    }
}
