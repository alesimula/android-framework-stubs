package android.view.accessibility;

public final class AccessibilityWindowInfo implements android.os.Parcelable {
    public static final int ACTIVE_WINDOW_ID = 2147483647;
    public static final int ANY_WINDOW_ID = -2;
    private static final int BOOLEAN_PROPERTY_ACCESSIBILITY_FOCUSED = 4;
    private static final int BOOLEAN_PROPERTY_ACTIVE = 1;
    private static final int BOOLEAN_PROPERTY_FOCUSED = 2;
    private static final int BOOLEAN_PROPERTY_PICTURE_IN_PICTURE = 8;
    public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityWindowInfo> CREATOR = null;
    private static final boolean DEBUG = false;
    private static final int MAX_POOL_SIZE = 10;
    public static final int PICTURE_IN_PICTURE_ACTION_REPLACER_WINDOW_ID = -3;
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_MAGNIFICATION_OVERLAY = 6;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    public static final int TYPE_WINDOW_CONTROL = 7;
    public static final int UNDEFINED_CONNECTION_ID = -1;
    public static final int UNDEFINED_WINDOW_ID = -1;
    private static java.util.concurrent.atomic.AtomicInteger sNumInstancesInUse;
    private static final android.util.Pools.SynchronizedPool<android.view.accessibility.AccessibilityWindowInfo> sPool = null;
    private long mAnchorId;
    private int mBooleanProperties;
    private android.util.LongArray mChildIds;
    private int mConnectionId;
    private android.util.LongArray mControlledWindowIds;
    private int mDisplayId;
    private int mId;
    private int mLayer;
    private android.os.LocaleList mLocales;
    private int mParentId;
    private android.graphics.Region mRegionInScreen;
    private int mTaskId;
    private java.lang.CharSequence mTitle;
    private long mTransitionTime;
    private int mType;
    private int mWindowControlId;
    public AccessibilityWindowInfo() {}
    public AccessibilityWindowInfo(android.view.accessibility.AccessibilityWindowInfo p0) {}
    private void clear() {}
    private boolean getBooleanProperty(int p0) { return false; }
    private void init(android.view.accessibility.AccessibilityWindowInfo p0) {}
    private void initFromParcel(android.os.Parcel p0) {}
    public static android.view.accessibility.AccessibilityWindowInfo obtain() { return null; }
    public static android.view.accessibility.AccessibilityWindowInfo obtain(android.view.accessibility.AccessibilityWindowInfo p0) { return null; }
    private void setBooleanProperty(int p0, boolean p1) {}
    public static void setNumInstancesInUseCounter(java.util.concurrent.atomic.AtomicInteger p0) {}
    public static java.lang.String typeToString(int p0) { return null; }
    public void addChild(int p0) {}
    public void addControlledWindow(int p0) {}
    public int describeContents() { return 0; }
    public int differenceFrom(android.view.accessibility.AccessibilityWindowInfo p0) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.view.accessibility.AccessibilityNodeInfo getAnchor() { return null; }
    public void getBoundsInScreen(android.graphics.Rect p0) {}
    public android.view.accessibility.AccessibilityWindowInfo getChild(int p0) { return null; }
    public int getChildCount() { return 0; }
    public android.view.accessibility.AccessibilityWindowInfo getControlledWindow(int p0) { return null; }
    public int getControlledWindowsCount() { return 0; }
    public android.view.accessibility.AccessibilityWindowInfo getControllingWindow() { return null; }
    public int getDisplayId() { return 0; }
    public int getId() { return 0; }
    public int getLayer() { return 0; }
    public android.os.LocaleList getLocales() { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getParent() { return null; }
    public void getRegionInScreen(android.graphics.Region p0) {}
    public android.view.accessibility.AccessibilityNodeInfo getRoot() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getRoot(int p0) { return null; }
    public int getTaskId() { return 0; }
    public java.lang.CharSequence getTitle() { return null; }
    public long getTransitionTimeMillis() { return 0L; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public boolean isAccessibilityFocused() { return false; }
    public boolean isActive() { return false; }
    public boolean isFocused() { return false; }
    public boolean isInPictureInPictureMode() { return false; }
    public void recycle() {}
    public boolean refresh() { return false; }
    public void setAccessibilityFocused(boolean p0) {}
    public void setActive(boolean p0) {}
    public void setAnchorId(long p0) {}
    public void setConnectionId(int p0) {}
    public void setDisplayId(int p0) {}
    public void setFocused(boolean p0) {}
    public void setId(int p0) {}
    public void setLayer(int p0) {}
    public void setLocales(android.os.LocaleList p0) {}
    public void setParentId(int p0) {}
    public void setPictureInPicture(boolean p0) {}
    public void setRegionInScreen(android.graphics.Region p0) {}
    public void setTaskId(int p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTransitionTimeMillis(long p0) {}
    public void setType(int p0) {}
    public void setWindowControlId(int p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class WindowListSparseArray extends android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityWindowInfo.WindowListSparseArray> CREATOR = null;
        public WindowListSparseArray() { super(); }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
