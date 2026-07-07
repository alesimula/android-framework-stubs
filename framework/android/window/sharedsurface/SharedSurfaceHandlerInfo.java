package android.window.sharedsurface;

public final class SharedSurfaceHandlerInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.sharedsurface.SharedSurfaceHandlerInfo> CREATOR = null;
    private static final java.lang.String TAG = null;
    private float mFinalAlpha;
    private float mFinalCornerRadius;
    private float mInitialAlpha;
    private float mInitialCornerRadius;
    private final android.graphics.Rect mSharedSurfaceBounds = null;
    private final android.window.sharedsurface.ISharedSurfaceHandler mSharedSurfaceHandler = null;
    public SharedSurfaceHandlerInfo(android.graphics.Rect p0, java.lang.Runnable p1, java.util.concurrent.Executor p2) {}
    private SharedSurfaceHandlerInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public float getFinalAlpha() { return 0.0f; }
    public float getFinalCornerRadius() { return 0.0f; }
    public float getInitialAlpha() { return 0.0f; }
    public float getInitialCornerRadius() { return 0.0f; }
    public android.graphics.Rect getSharedSurfaceBounds() { return null; }
    public void onRemoveSharingSurface() {}
    public void setAlpha(float p0, float p1) {}
    public void setCornerRadius(float p0, float p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static class SharedSurfaceHandlerWrapper extends android.window.sharedsurface.ISharedSurfaceHandler.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.lang.Runnable mOnRemoveCallback = null;
        SharedSurfaceHandlerWrapper(java.lang.Runnable p0, java.util.concurrent.Executor p1) { super(); }
        public void onRemoveSharingSurface() {}
    }
}
