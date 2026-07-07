package android.window;

@android.annotation.SystemApi
public class ScreenCapture {
    public static final int SCREEN_CAPTURE_ERROR_CODE_UNKNOWN = 1;
    public static final int SCREEN_CAPTURE_ERROR_MISSING_PERMISSIONS = 3;
    public static final int SCREEN_CAPTURE_ERROR_SENSITIVE_CONTENT = 2;
    private ScreenCapture() {}
    public static void capture(android.window.ScreenCapture.ScreenCaptureParams p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.window.ScreenCapture.ScreenCaptureResult, java.lang.Exception> p2) {}
    public static boolean isScreenCaptureOptimizationEnabled() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScreenCaptureErrorCode {
    }

    public static final class ScreenCaptureParams implements android.os.Parcelable {
        public static final int CAPTURE_MODE_NONE = 0;
        public static final int CAPTURE_MODE_REQUIRE_OPTIMIZED = 1;
        public static final android.os.Parcelable.Creator<android.window.ScreenCapture.ScreenCaptureParams> CREATOR = null;
        public static final int FLAG_IME = 8;
        public static final int FLAG_MOUSE_CURSOR = 1;
        public static final int FLAG_SCREENSHOT_UI = 2;
        public static final int FLAG_STATUS_BAR = 4;
        public static final int PROTECTED_CONTENT_POLICY_CAPTURE = 1;
        public static final int PROTECTED_CONTENT_POLICY_REDACT = 0;
        public static final int PROTECTED_CONTENT_POLICY_THROW_EXCEPTION = 2;
        public static final int SECURE_CONTENT_POLICY_CAPTURE = 1;
        public static final int SECURE_CONTENT_POLICY_REDACT = 0;
        public static final int SECURE_CONTENT_POLICY_THROW_EXCEPTION = 2;
        private final int mCaptureMode = 0;
        private final int mDisplayId = 0;
        private final boolean mIncludeSystemOverlays = false;
        private final int mPixelFormat = 0;
        private final boolean mPreserveDisplayColors = false;
        private final int mProtectedContentPolicy = 0;
        private final int mSecureContentPolicy = 0;
        private final boolean mUseDisplayInstallationOrientation = false;
        private ScreenCaptureParams(int p0, int p1, int p2, int p3, int p4, boolean p5, boolean p6, boolean p7) {}
        private ScreenCaptureParams(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public int getCaptureMode() { return 0; }
        public int getDisplayId() { return 0; }
        public int getPixelFormat() { return 0; }
        public int getProtectedContentPolicy() { return 0; }
        public int getSecureContentPolicy() { return 0; }
        public boolean isIncludeSystemOverlays() { return false; }
        public boolean isPreserveDisplayColors() { return false; }
        public boolean isUseDisplayInstallationOrientation() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private int mCaptureMode;
            private int mDisplayId;
            private boolean mIncludeSystemOverlays;
            private int mPixelFormat;
            private boolean mPreserveDisplayColors;
            private int mProtectedContentPolicy;
            private int mSecureContentPolicy;
            private boolean mUseDisplayInstallationOrientation;
            public Builder(int p0) {}
            public android.window.ScreenCapture.ScreenCaptureParams build() { return null; }
            public android.window.ScreenCapture.ScreenCaptureParams.Builder setCaptureMode(int p0) { return null; }
            public android.window.ScreenCapture.ScreenCaptureParams.Builder setIncludeSystemOverlays(boolean p0) { return null; }
            public android.window.ScreenCapture.ScreenCaptureParams.Builder setPixelFormat(int p0) { return null; }
            public android.window.ScreenCapture.ScreenCaptureParams.Builder setPreserveDisplayColors(boolean p0) { return null; }
            public android.window.ScreenCapture.ScreenCaptureParams.Builder setProtectedContentPolicy(int p0) { return null; }
            public android.window.ScreenCapture.ScreenCaptureParams.Builder setSecureContentPolicy(int p0) { return null; }
            public android.window.ScreenCapture.ScreenCaptureParams.Builder setUseDisplayInstallationOrientation(boolean p0) { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CaptureMode {
        }

        public static @interface CompositionFilterFlag {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ProtectedContentPolicy {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SecureContentPolicy {
        }
    }

    public static final class ScreenCaptureResult implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.ScreenCapture.ScreenCaptureResult> CREATOR = null;
        private final android.graphics.ColorSpace mColorSpace = null;
        private final android.hardware.HardwareBuffer mHardwareBuffer = null;
        public ScreenCaptureResult(android.graphics.ColorSpace p0, android.hardware.HardwareBuffer p1) {}
        private ScreenCaptureResult(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public android.graphics.ColorSpace getColorSpace() { return null; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
