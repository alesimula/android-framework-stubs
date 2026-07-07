package android.database;

public interface CrossProcessCursor extends android.database.Cursor {
    public void fillWindow(int p0, android.database.CursorWindow p1);
    public android.database.CursorWindow getWindow();
    public boolean onMove(int p0, int p1);
}
