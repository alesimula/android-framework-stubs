package android.app;

@java.lang.Deprecated
public class FragmentController {
    private final android.app.FragmentHostCallback<?> mHost = null;
    private FragmentController(android.app.FragmentHostCallback<?> p0) {}
    public static final android.app.FragmentController createController(android.app.FragmentHostCallback<?> p0) { return null; }
    public void attachHost(android.app.Fragment p0) {}
    public void dispatchActivityCreated() {}
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    public boolean dispatchContextItemSelected(android.view.MenuItem p0) { return false; }
    public void dispatchCreate() {}
    public boolean dispatchCreateOptionsMenu(android.view.Menu p0, android.view.MenuInflater p1) { return false; }
    public void dispatchDestroy() {}
    public void dispatchDestroyView() {}
    public void dispatchLowMemory() {}
    @java.lang.Deprecated
    public void dispatchMultiWindowModeChanged(boolean p0) {}
    public void dispatchMultiWindowModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public boolean dispatchOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public void dispatchOptionsMenuClosed(android.view.Menu p0) {}
    public void dispatchPause() {}
    @java.lang.Deprecated
    public void dispatchPictureInPictureModeChanged(boolean p0) {}
    public void dispatchPictureInPictureModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public boolean dispatchPrepareOptionsMenu(android.view.Menu p0) { return false; }
    public void dispatchResume() {}
    public void dispatchStart() {}
    public void dispatchStop() {}
    public void dispatchTrimMemory(int p0) {}
    public void doLoaderDestroy() {}
    public void doLoaderStart() {}
    public void doLoaderStop(boolean p0) {}
    public void dumpLoaders(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    public boolean execPendingActions() { return false; }
    public android.app.Fragment findFragmentByWho(java.lang.String p0) { return null; }
    public android.app.FragmentManager getFragmentManager() { return null; }
    public android.app.LoaderManager getLoaderManager() { return null; }
    public void noteStateNotSaved() {}
    public android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) { return null; }
    public void reportLoaderStart() {}
    public void restoreAllState(android.os.Parcelable p0, android.app.FragmentManagerNonConfig p1) {}
    @java.lang.Deprecated
    public void restoreAllState(android.os.Parcelable p0, java.util.List<android.app.Fragment> p1) {}
    public void restoreLoaderNonConfig(android.util.ArrayMap<java.lang.String, android.app.LoaderManager> p0) {}
    public android.util.ArrayMap<java.lang.String, android.app.LoaderManager> retainLoaderNonConfig() { return null; }
    public android.app.FragmentManagerNonConfig retainNestedNonConfig() { return null; }
    @java.lang.Deprecated
    public java.util.List<android.app.Fragment> retainNonConfig() { return null; }
    public android.os.Parcelable saveAllState() { return null; }
}
