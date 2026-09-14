package android.view.selectiontoolbar;

public interface SelectionToolbarSession extends java.lang.AutoCloseable {
    public void clearTextSelection();
    public void close();
    public void hide();
    public void selectText(java.lang.CharSequence p0, int p1, int p2, android.os.LocaleList p3);
    public void update(boolean p0, java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> p1, android.graphics.Rect p2, int p3, android.graphics.Rect p4);
}
