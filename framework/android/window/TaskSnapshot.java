package android.window;

public class TaskSnapshot implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TaskSnapshot> CREATOR = null;
    public static final int REFERENCE_BROADCAST = 1;
    public static final int REFERENCE_CACHE = 2;
    public static final int REFERENCE_CONTENT_SUGGESTION = 8;
    public static final int REFERENCE_CONVERT_RESOLUTION = 32;
    public static final int REFERENCE_NONE = 0;
    public static final int REFERENCE_PERSIST = 4;
    public static final int REFERENCE_WILL_UPDATE_TO_CACHE = 64;
    public static final int REFERENCE_WRITE_TO_PARCEL = 16;
    private static final java.lang.String TAG = "TaskSnapshot";
    private final int mAppearance = 0;
    private final long mCaptureTime = 0L;
    private final android.graphics.ColorSpace mColorSpace = null;
    private final android.graphics.Rect mContentInsets = null;
    private final int mDensityDpi = 0;
    private final boolean mHasImeSurface = false;
    private final long mId = 0L;
    private int mInternalReferences;
    private final boolean mIsLowResolution = false;
    private final boolean mIsRealSnapshot = false;
    private final boolean mIsTranslucent = false;
    private final android.graphics.Rect mLetterboxInsets = null;
    private final int mOrientation = 0;
    private final int mRotation = 0;
    private java.util.function.Consumer<android.hardware.HardwareBuffer> mSafeSnapshotReleaser;
    private final android.hardware.HardwareBuffer mSnapshot = null;
    private java.lang.ref.WeakReference<android.window.TaskSnapshotManager.SnapshotTracker> mSnapshotTracker;
    private final android.graphics.Point mTaskSize = null;
    private final android.content.ComponentName mTopActivityComponent = null;
    private final int mUiMode = 0;
    private final int mWindowingMode = 0;
    private int mWriteToParcelCount;
    public TaskSnapshot(long p0, long p1, android.content.ComponentName p2, android.hardware.HardwareBuffer p3, android.graphics.ColorSpace p4, int p5, int p6, android.graphics.Point p7, android.graphics.Rect p8, android.graphics.Rect p9, boolean p10, boolean p11, int p12, int p13, boolean p14, boolean p15, int p16, int p17) {}
    private TaskSnapshot(android.os.Parcel p0) {}
    public void addReference(int p0) {}
    public void attachAndQueueBufferWithColorSpace(android.view.Surface p0) {}
    public void closeBuffer() {}
    public int describeContents() { return 0; }
    public int getAppearance() { return 0; }
    public long getCaptureTime() { return 0L; }
    public android.graphics.ColorSpace getColorSpace() { return null; }
    public android.graphics.Rect getContentInsets() { return null; }
    public int getDensityDpi() { return 0; }
    @java.lang.Deprecated
    public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
    public int getHardwareBufferFormat() { return 0; }
    public int getHardwareBufferHeight() { return 0; }
    public int getHardwareBufferWidth() { return 0; }
    public long getId() { return 0L; }
    public android.graphics.Rect getLetterboxInsets() { return null; }
    public int getOrientation() { return 0; }
    public int getRotation() { return 0; }
    public android.graphics.Point getTaskSize() { return null; }
    public android.content.ComponentName getTopActivityComponent() { return null; }
    public int getUiMode() { return 0; }
    public int getWindowingMode() { return 0; }
    public boolean hasImeSurface() { return false; }
    public boolean hasProtectedContent() { return false; }
    public boolean isBufferValid() { return false; }
    public boolean isLowResolution() { return false; }
    public boolean isRealSnapshot() { return false; }
    public boolean isSameHardwareBuffer(android.hardware.HardwareBuffer p0) { return false; }
    public boolean isTranslucent() { return false; }
    public void removeReference(int p0) {}
    public void setBufferToSurface(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1) {}
    public void setSafeRelease(java.util.function.Consumer<android.hardware.HardwareBuffer> p0) {}
    void setSnapshotTracker(android.window.TaskSnapshotManager.SnapshotTracker p0) {}
    public java.lang.String toString() { return null; }
    public android.graphics.Bitmap wrapToBitmap() { return null; }
    public android.graphics.Bitmap wrapToBitmap(android.graphics.ColorSpace p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mAppearance;
        private long mCaptureTime;
        private android.graphics.ColorSpace mColorSpace;
        private android.graphics.Rect mContentInsets;
        private int mDensityDpi;
        private boolean mHasImeSurface;
        private long mId;
        private boolean mIsRealSnapshot;
        private boolean mIsTranslucent;
        private android.graphics.Rect mLetterboxInsets;
        private int mOrientation;
        private int mPixelFormat;
        private int mRotation;
        private android.hardware.HardwareBuffer mSnapshot;
        private android.graphics.Point mTaskSize;
        private android.content.ComponentName mTopActivity;
        private int mUiMode;
        private int mWindowingMode;
        public Builder() {}
        public android.window.TaskSnapshot build() { return null; }
        public int getPixelFormat() { return 0; }
        public android.window.TaskSnapshot.Builder setAppearance(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setCaptureTime(long p0) { return null; }
        public android.window.TaskSnapshot.Builder setColorSpace(android.graphics.ColorSpace p0) { return null; }
        public android.window.TaskSnapshot.Builder setContentInsets(android.graphics.Rect p0) { return null; }
        public android.window.TaskSnapshot.Builder setDensityDpi(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setHasImeSurface(boolean p0) { return null; }
        public android.window.TaskSnapshot.Builder setId(long p0) { return null; }
        public android.window.TaskSnapshot.Builder setIsRealSnapshot(boolean p0) { return null; }
        public android.window.TaskSnapshot.Builder setIsTranslucent(boolean p0) { return null; }
        public android.window.TaskSnapshot.Builder setLetterboxInsets(android.graphics.Rect p0) { return null; }
        public android.window.TaskSnapshot.Builder setOrientation(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setPixelFormat(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setRotation(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setSnapshot(android.hardware.HardwareBuffer p0) { return null; }
        public android.window.TaskSnapshot.Builder setTaskSize(android.graphics.Point p0) { return null; }
        public android.window.TaskSnapshot.Builder setTopActivityComponent(android.content.ComponentName p0) { return null; }
        public android.window.TaskSnapshot.Builder setUiMode(int p0) { return null; }
        public android.window.TaskSnapshot.Builder setWindowingMode(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ReferenceFlags {
    }
}
