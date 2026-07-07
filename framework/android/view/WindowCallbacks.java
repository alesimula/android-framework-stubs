package android.view;

public interface WindowCallbacks {
    public boolean onContentDrawn(int p0, int p1, int p2, int p3);
    public void onPostDraw(android.graphics.RecordingCanvas p0);
    public void onRequestDraw(boolean p0);
    public void onWindowDragResizeEnd();
    public void onWindowDragResizeStart();
}
