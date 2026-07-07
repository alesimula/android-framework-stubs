package android.service.autofill.augmented;

@android.annotation.SystemApi
public final class FillWindow implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = null;
    private android.graphics.Rect mBounds;
    private boolean mDestroyed;
    private android.view.View mFillView;
    private final java.lang.Object mLock = null;
    private android.service.autofill.augmented.AugmentedAutofillService.AutofillProxy mProxy;
    private boolean mShowing;
    private final android.os.Handler mUiThreadHandler = null;
    private boolean mUpdateCalled;
    private android.view.WindowManager mWm;
    public FillWindow() {}
    private void checkNotDestroyedLocked() {}
    private void handleHide() {}
    private void handleShow(android.view.WindowManager.LayoutParams p0) {}
    private void hide() {}
    public void close() {}
    public void destroy() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    protected void finalize() throws java.lang.Throwable {}
    void show() {}
    public boolean update(android.service.autofill.augmented.PresentationParams.Area p0, android.view.View p1, long p2) { return false; }

    private static final class FillWindowPresenter extends android.view.autofill.IAutofillWindowPresenter.Stub {
        private final java.lang.ref.WeakReference<android.service.autofill.augmented.FillWindow> mFillWindowReference = null;
        FillWindowPresenter(android.service.autofill.augmented.FillWindow p0) { super(); }
        public void hide(android.graphics.Rect p0) {}
        public void show(android.view.WindowManager.LayoutParams p0, android.graphics.Rect p1, boolean p2, int p3) {}
    }
}
