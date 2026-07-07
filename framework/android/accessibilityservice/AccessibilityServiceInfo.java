package android.accessibilityservice;

public class AccessibilityServiceInfo implements android.os.Parcelable {
    public static final int CAPABILITY_CAN_CONTROL_MAGNIFICATION = 16;
    public static final int CAPABILITY_CAN_PERFORM_GESTURES = 32;
    @java.lang.Deprecated
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_FINGERPRINT_GESTURES = 64;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int CAPABILITY_CAN_TAKE_SCREENSHOT = 128;
    public static final android.os.Parcelable.Creator<android.accessibilityservice.AccessibilityServiceInfo> CREATOR = null;
    public static final int DEFAULT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_AUDIBLE = 4;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FEEDBACK_GENERIC = 16;
    public static final int FEEDBACK_HAPTIC = 2;
    public static final int FEEDBACK_SPOKEN = 1;
    public static final int FEEDBACK_VISUAL = 8;
    public static final int FLAG_ENABLE_ACCESSIBILITY_VOLUME = 128;
    public static final int FLAG_FORCE_DIRECT_BOOT_AWARE = 65536;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_INPUT_METHOD_EDITOR = 32768;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_2_FINGER_PASSTHROUGH = 8192;
    public static final int FLAG_REQUEST_ACCESSIBILITY_BUTTON = 256;
    @java.lang.Deprecated
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_REQUEST_FINGERPRINT_GESTURES = 512;
    public static final int FLAG_REQUEST_MULTI_FINGER_GESTURES = 4096;
    public static final int FLAG_REQUEST_SHORTCUT_WARNING_DIALOG_SPOKEN_FEEDBACK = 1024;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;
    public static final int FLAG_REQUIRE_SHORTCUT = 131072;
    public static final int FLAG_RETRIEVE_INTERACTIVE_WINDOWS = 64;
    public static final int FLAG_SEND_MOTION_EVENTS = 16384;
    public static final int FLAG_SERVICE_HANDLES_DOUBLE_TAP = 2048;
    private static final long REQUEST_ACCESSIBILITY_BUTTON_CHANGE = 136293963L;
    private static final java.lang.String TAG_ACCESSIBILITY_SERVICE = "accessibility-service";
    private static android.util.SparseArray<android.accessibilityservice.AccessibilityServiceInfo.CapabilityInfo> sAvailableCapabilityInfos;
    public boolean crashed;
    public int eventTypes;
    public int feedbackType;
    public int flags;
    private int mAnimatedImageRes;
    private int mCapabilities;
    private android.content.ComponentName mComponentName;
    private int mDescriptionResId;
    private final android.accessibilityservice.AccessibilityServiceInfo.DynamicPropertyDefaults mDynamicPropertyDefaults = null;
    private int mHtmlDescriptionRes;
    private int mInteractiveUiTimeout;
    private int mIntroResId;
    private boolean mIsAccessibilityTool;
    private int mMotionEventSources;
    private int mNonInteractiveUiTimeout;
    private java.lang.String mNonLocalizedDescription;
    private java.lang.String mNonLocalizedSummary;
    private int mObservedMotionEventSources;
    private android.content.pm.ResolveInfo mResolveInfo;
    private java.lang.String mSettingsActivityName;
    private int mSummaryResId;
    private java.lang.String mTileServiceName;
    public long notificationTimeout;
    public java.lang.String[] packageNames;
    public AccessibilityServiceInfo() {}
    public AccessibilityServiceInfo(android.content.pm.ResolveInfo p0, android.content.Context p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private static void appendCapabilities(java.lang.StringBuilder p0, int p1) {}
    private static void appendEventTypes(java.lang.StringBuilder p0, int p1) {}
    private static void appendFeedbackTypes(java.lang.StringBuilder p0, int p1) {}
    private static void appendFlags(java.lang.StringBuilder p0, int p1) {}
    private static void appendPackageNames(java.lang.StringBuilder p0, java.lang.String[] p1) {}
    public static java.lang.String capabilityToString(int p0) { return null; }
    public static java.lang.String feedbackTypeToString(int p0) { return null; }
    private static boolean fingerprintAvailable(android.content.Context p0) { return false; }
    public static java.lang.String flagToString(int p0) { return null; }
    private static android.util.SparseArray<android.accessibilityservice.AccessibilityServiceInfo.CapabilityInfo> getCapabilityInfoSparseArray(android.content.Context p0) { return null; }
    private void initFromParcel(android.os.Parcel p0) {}
    private boolean isRequestAccessibilityButtonChangeEnabled(com.android.internal.compat.IPlatformCompat p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAnimatedImageRes() { return 0; }
    public boolean getCanRetrieveWindowContent() { return false; }
    public int getCapabilities() { return 0; }
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo.CapabilityInfo> getCapabilityInfos() { return null; }
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo.CapabilityInfo> getCapabilityInfos(android.content.Context p0) { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public java.lang.String getDescription() { return null; }
    public java.lang.String getId() { return null; }
    public int getInteractiveUiTimeoutMillis() { return 0; }
    public int getMotionEventSources() { return 0; }
    public int getNonInteractiveUiTimeoutMillis() { return 0; }
    public int getObservedMotionEventSources() { return 0; }
    public android.content.pm.ResolveInfo getResolveInfo() { return null; }
    public java.lang.String getSettingsActivityName() { return null; }
    public java.lang.String getTileServiceName() { return null; }
    public int hashCode() { return 0; }
    public boolean isAccessibilityTool() { return false; }
    public boolean isDirectBootAware() { return false; }
    public final boolean isWithinParcelableSize() { return false; }
    public android.graphics.drawable.Drawable loadAnimatedImage(android.content.Context p0) { return null; }
    public java.lang.String loadDescription(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String loadHtmlDescription(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadIntro(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadSummary(android.content.pm.PackageManager p0) { return null; }
    public void resetDynamicallyConfigurableProperties() {}
    @android.annotation.SystemApi
    public void setAccessibilityTool(boolean p0) {}
    public void setCapabilities(int p0) {}
    public void setComponentName(android.content.ComponentName p0) {}
    public void setInteractiveUiTimeoutMillis(int p0) {}
    public void setMotionEventSources(int p0) {}
    public void setNonInteractiveUiTimeoutMillis(int p0) {}
    public void setObservedMotionEventSources(int p0) {}
    public void setResolveInfo(android.content.pm.ResolveInfo p0) {}
    public java.lang.String toString() { return null; }
    public void updateDynamicallyConfigurableProperties(com.android.internal.compat.IPlatformCompat p0, android.accessibilityservice.AccessibilityServiceInfo p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class CapabilityInfo {
        public final int capability = 0;
        public final int descResId = 0;
        public final int titleResId = 0;
        public CapabilityInfo(int p0, int p1, int p2) {}
    }

    private static class DynamicPropertyDefaults {
        private final int mEventTypesDefault = 0;
        private final int mFeedbackTypeDefault = 0;
        private final int mFlagsDefault = 0;
        private final int mInteractiveUiTimeoutDefault = 0;
        private final int mMotionEventSourcesDefault = 0;
        private final int mNonInteractiveUiTimeoutDefault = 0;
        private final long mNotificationTimeoutDefault = 0L;
        private final int mObservedMotionEventSourcesDefault = 0;
        private final java.util.List<java.lang.String> mPackageNamesDefault = null;
        DynamicPropertyDefaults(android.accessibilityservice.AccessibilityServiceInfo p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeedbackType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MotionEventSources {
    }
}
