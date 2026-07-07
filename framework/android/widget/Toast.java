package android.widget;

public class Toast {
    private static final long CHANGE_TEXT_TOASTS_IN_THE_SYSTEM = 147798919L;
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT = 0;
    static final java.lang.String TAG = "Toast";
    static final boolean localLOGV = false;
    private static android.app.INotificationManager sService;
    private final java.util.List<android.widget.Toast.Callback> mCallbacks = null;
    private final android.content.Context mContext = null;
    int mDuration;
    private final android.os.Handler mHandler = null;
    private android.view.View mNextView;
    final android.widget.Toast.TN mTN = null;
    private java.lang.CharSequence mText;
    private final android.os.Binder mToken = null;
    public Toast(android.content.Context p0) {}
    public Toast(android.content.Context p0, android.os.Looper p1) {}
    private android.os.Looper getLooper(android.os.Looper p0) { return null; }
    private static android.app.INotificationManager getService() { return null; }
    private boolean isSystemRenderedTextToast() { return false; }
    public static android.widget.Toast makeCustomToastWithIcon(android.content.Context p0, android.os.Looper p1, java.lang.CharSequence p2, int p3, android.graphics.drawable.Drawable p4) { return null; }
    public static android.widget.Toast makeText(android.content.Context p0, int p1, int p2) throws android.content.res.Resources.NotFoundException { return null; }
    public static android.widget.Toast makeText(android.content.Context p0, android.os.Looper p1, java.lang.CharSequence p2, int p3) { return null; }
    public static android.widget.Toast makeText(android.content.Context p0, java.lang.CharSequence p1, int p2) { return null; }
    public void addCallback(android.widget.Toast.Callback p0) {}
    public void cancel() {}
    public int getDuration() { return 0; }
    public int getGravity() { return 0; }
    public float getHorizontalMargin() { return 0.0f; }
    public android.widget.Toast.TN getTn() { return null; }
    public float getVerticalMargin() { return 0.0f; }
    @java.lang.Deprecated
    public android.view.View getView() { return null; }
    public android.view.WindowManager.LayoutParams getWindowParams() { return null; }
    public int getXOffset() { return 0; }
    public int getYOffset() { return 0; }
    public void removeCallback(android.widget.Toast.Callback p0) {}
    public void setDuration(int p0) {}
    public void setGravity(int p0, int p1, int p2) {}
    public void setMargin(float p0, float p1) {}
    public void setText(int p0) {}
    public void setText(java.lang.CharSequence p0) {}
    @java.lang.Deprecated
    public void setView(android.view.View p0) {}
    public void show() {}

    public static abstract class Callback {
        public Callback() {}
        public void onToastHidden() {}
        public void onToastShown() {}
    }

    private static class CallbackBinder extends android.app.ITransientNotificationCallback.Stub {
        private final java.util.List<android.widget.Toast.Callback> mCallbacks = null;
        private final android.os.Handler mHandler = null;
        private CallbackBinder(java.util.List<android.widget.Toast.Callback> p0, android.os.Handler p1) { super(); }
        private java.util.List<android.widget.Toast.Callback> getCallbacks() { return null; }
        public void onToastHidden() {}
        public void onToastShown() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Duration {
    }

    public static class TN extends android.app.ITransientNotification.Stub {
        private static final int CANCEL = 2;
        private static final int HIDE = 1;
        private static final int SHOW = 0;
        private final java.lang.ref.WeakReference<java.util.List<android.widget.Toast.Callback>> mCallbacks = null;
        int mDuration;
        int mGravity;
        final android.os.Handler mHandler = null;
        float mHorizontalMargin;
        android.view.View mNextView;
        java.lang.ref.WeakReference<android.view.View> mNextViewWeakRef;
        final java.lang.String mPackageName = null;
        private final android.view.WindowManager.LayoutParams mParams = null;
        private final android.widget.ToastPresenter mPresenter = null;
        final android.os.Binder mToken = null;
        float mVerticalMargin;
        android.view.View mView;
        android.view.WindowManager mWM;
        int mX;
        int mY;
        TN(android.content.Context p0, java.lang.String p1, android.os.Binder p2, java.util.List<android.widget.Toast.Callback> p3, android.os.Looper p4) { super(); }
        private java.util.List<android.widget.Toast.Callback> getCallbacks() { return null; }
        public void cancel() {}
        public android.view.View getNextView() { return null; }
        public void handleHide() {}
        public void handleShow(android.os.IBinder p0) {}
        public void hide() {}
        public void show(android.os.IBinder p0) {}
    }
}
