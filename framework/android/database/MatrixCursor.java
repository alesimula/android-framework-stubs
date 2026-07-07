package android.database;

public class MatrixCursor extends android.database.AbstractCursor {
    private final int columnCount = 0;
    private final java.lang.String[] columnNames = null;
    private java.lang.Object[] data;
    private int rowCount;
    public MatrixCursor(java.lang.String[] p0) { super(); }
    public MatrixCursor(java.lang.String[] p0, int p1) { super(); }
    private void addRow(java.util.ArrayList<?> p0, int p1) {}
    private void ensureCapacity(int p0) {}
    private java.lang.Object get(int p0) { return null; }
    public void addRow(java.lang.Iterable<?> p0) {}
    public void addRow(java.lang.Object[] p0) {}
    public byte[] getBlob(int p0) { return null; }
    public java.lang.String[] getColumnNames() { return null; }
    public int getCount() { return 0; }
    public double getDouble(int p0) { return 0.0; }
    public float getFloat(int p0) { return 0.0f; }
    public int getInt(int p0) { return 0; }
    public long getLong(int p0) { return 0L; }
    public short getShort(int p0) { return 0; }
    public java.lang.String getString(int p0) { return null; }
    public int getType(int p0) { return 0; }
    public boolean isNull(int p0) { return false; }
    public android.database.MatrixCursor.RowBuilder newRow() { return null; }

    public class RowBuilder {
        private final int endIndex = 0;
        private int index;
        private final int row = 0;
        RowBuilder(android.database.MatrixCursor p0, int p1) {}
        public final android.database.MatrixCursor.RowBuilder add(int p0, java.lang.Object p1) { return null; }
        public android.database.MatrixCursor.RowBuilder add(java.lang.Object p0) { return null; }
        public android.database.MatrixCursor.RowBuilder add(java.lang.String p0, java.lang.Object p1) { return null; }
    }
}
