package android.view.selectiontoolbar;

public interface SelectionToolbarClient {
    public void onMenuItemClicked(int p0);
    public void onSessionError(java.lang.Throwable p0);
    public void onSessionOpened(android.view.selectiontoolbar.SelectionToolbarSession p0);
    public void onUpdated(android.view.SurfaceControlViewHost.SurfacePackage p0, android.graphics.Rect p1, android.graphics.Region p2);
    public void onVisibilityChanged(boolean p0);
}
