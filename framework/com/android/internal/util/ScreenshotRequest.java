package com.android.internal.util;

public class ScreenshotRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.util.ScreenshotRequest> CREATOR = null;
    private static final java.lang.String TAG = "ScreenshotRequest";
    private final android.graphics.Bitmap mBitmap = null;
    private final android.graphics.Rect mBoundsInScreen = null;
    private final android.net.Uri mCustomSaveUri = null;
    private final int mDisplayId = 0;
    private final android.graphics.Insets mInsets = null;
    private final int mSource = 0;
    private final int mTaskId = 0;
    private final android.content.ComponentName mTopComponent = null;
    private final int mType = 0;
    private final int mUserId = 0;
    private ScreenshotRequest(int p0, int p1, android.content.ComponentName p2, int p3, int p4, android.graphics.Bitmap p5, android.graphics.Rect p6, android.graphics.Insets p7, int p8, android.net.Uri p9) {}
    ScreenshotRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.graphics.Bitmap getBitmap() { return null; }
    public android.graphics.Rect getBoundsInScreen() { return null; }
    public android.net.Uri getCustomSaveUri() { return null; }
    public int getDisplayId() { return 0; }
    public android.graphics.Insets getInsets() { return null; }
    public int getSource() { return 0; }
    public int getTaskId() { return 0; }
    public android.content.ComponentName getTopComponent() { return null; }
    public int getType() { return 0; }
    public int getUserId() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private android.graphics.Bitmap mBitmap;
        private android.graphics.Rect mBoundsInScreen;
        private android.net.Uri mCustomSaveUri;
        private int mDisplayId;
        private android.graphics.Insets mInsets;
        private final int mSource = 0;
        private int mTaskId;
        private android.content.ComponentName mTopComponent;
        private final int mType = 0;
        private int mUserId;
        public Builder(int p0, int p1) {}
        public com.android.internal.util.ScreenshotRequest build() { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setBitmap(android.graphics.Bitmap p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setBoundsOnScreen(android.graphics.Rect p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setCustomSaveUri(android.net.Uri p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setDisplayId(int p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setInsets(android.graphics.Insets p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setTaskId(int p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setTopComponent(android.content.ComponentName p0) { return null; }
        public com.android.internal.util.ScreenshotRequest.Builder setUserId(int p0) { return null; }
    }

    private static final class HardwareBitmapBundler {
        private static final java.lang.String KEY_BUFFER = "bitmap_util_buffer";
        private static final java.lang.String KEY_COLOR_SPACE = "bitmap_util_color_space";
        private HardwareBitmapBundler() {}
        private static android.graphics.Bitmap bundleToHardwareBitmap(android.os.Bundle p0) { return null; }
        private static android.os.Bundle hardwareBitmapToBundle(android.graphics.Bitmap p0) { return null; }
    }
}
