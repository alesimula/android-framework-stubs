package android.view.selectiontoolbar;

public interface SelectionToolbarSession extends java.lang.AutoCloseable {
    public void close();
    public void hide();
    public void update(boolean p0, java.util.List<android.view.selectiontoolbar.ToolbarMenuItem> p1, android.graphics.Rect p2, int p3);
}
