package android.view.selectiontoolbar;

public class SelectionToolbarClientWrapper extends android.view.selectiontoolbar.ISelectionToolbarClient.Stub {
    private final android.view.selectiontoolbar.SelectionToolbarClient mClient = null;
    private final java.util.concurrent.Executor mClientExecutor = null;
    private final android.view.selectiontoolbar.SelectionToolbarProviderFactory.SelectionToolbarProviderImpl mProvider = null;
    SelectionToolbarClientWrapper(android.view.selectiontoolbar.SelectionToolbarProviderFactory.SelectionToolbarProviderImpl p0, android.view.selectiontoolbar.SelectionToolbarClient p1, java.util.concurrent.Executor p2) { super(); }
    public void onMenuItemClicked(int p0) {}
    public void onSessionError(android.os.ParcelableException p0) {}
    public void onSessionOpened() {}
    public void onUpdated(android.view.SurfaceControlViewHost.SurfacePackage p0, android.graphics.Rect p1, android.graphics.Region p2) {}
    public void onVisibilityChanged(boolean p0) {}
}
