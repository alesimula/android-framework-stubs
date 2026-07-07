package android.view.accessibility;

public class AccessibilityRecord {
    protected static final boolean DEBUG_CONCISE_TOSTRING = false;
    private static final int GET_SOURCE_PREFETCH_FLAGS = 7;
    private static final int PROPERTY_ACCESSIBILITY_DATA_SENSITIVE = 1024;
    private static final int PROPERTY_CHECKED = 1;
    private static final int PROPERTY_ENABLED = 2;
    private static final int PROPERTY_FULL_SCREEN = 128;
    private static final int PROPERTY_IMPORTANT_FOR_ACCESSIBILITY = 512;
    private static final int PROPERTY_PASSWORD = 4;
    private static final int PROPERTY_SCROLLABLE = 256;
    private static final int UNDEFINED = -1;
    int mAddedCount;
    java.lang.CharSequence mBeforeText;
    int mBooleanProperties;
    java.lang.CharSequence mClassName;
    int mConnectionId;
    java.lang.CharSequence mContentDescription;
    int mCurrentItemIndex;
    int mEmbeddingHostWindowId;
    int mFromIndex;
    int mItemCount;
    int mMaxScrollX;
    int mMaxScrollY;
    android.os.Parcelable mParcelableData;
    int mRemovedCount;
    int mScrollDeltaX;
    int mScrollDeltaY;
    int mScrollX;
    int mScrollY;
    boolean mSealed;
    int mSourceDisplayId;
    long mSourceNodeId;
    int mSourceWindowId;
    final java.util.List<java.lang.CharSequence> mText = null;
    int mToIndex;
    public AccessibilityRecord() {}
    public AccessibilityRecord(android.view.accessibility.AccessibilityRecord p0) {}
    private void append(java.lang.StringBuilder p0, java.lang.String p1, int p2) {}
    private void append(java.lang.StringBuilder p0, java.lang.String p1, java.lang.Object p2) {}
    private java.lang.StringBuilder appendPropName(java.lang.StringBuilder p0, java.lang.String p1) { return null; }
    private void appendUnless(boolean p0, int p1, java.lang.StringBuilder p2) {}
    private boolean getBooleanProperty(int p0) { return false; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityRecord obtain() { return null; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityRecord obtain(android.view.accessibility.AccessibilityRecord p0) { return null; }
    private void setBooleanProperty(int p0, boolean p1) {}
    private static java.lang.String singleBooleanPropertyToString(int p0) { return null; }
    java.lang.StringBuilder appendTo(java.lang.StringBuilder p0) { return null; }
    void clear() {}
    void enforceNotSealed() {}
    void enforceSealed() {}
    public int getAddedCount() { return 0; }
    public java.lang.CharSequence getBeforeText() { return null; }
    public java.lang.CharSequence getClassName() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public int getCurrentItemIndex() { return 0; }
    public int getDisplayId() { return 0; }
    public int getFromIndex() { return 0; }
    public int getItemCount() { return 0; }
    public int getMaxScrollX() { return 0; }
    public int getMaxScrollY() { return 0; }
    public android.os.Parcelable getParcelableData() { return null; }
    public int getRealWindowId() { return 0; }
    public int getRemovedCount() { return 0; }
    public int getScrollDeltaX() { return 0; }
    public int getScrollDeltaY() { return 0; }
    public int getScrollX() { return 0; }
    public int getScrollY() { return 0; }
    public android.view.accessibility.AccessibilityNodeInfo getSource() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getSource(int p0) { return null; }
    public long getSourceNodeId() { return 0L; }
    public java.util.List<java.lang.CharSequence> getText() { return null; }
    public int getToIndex() { return 0; }
    public int getWindowId() { return 0; }
    void init(android.view.accessibility.AccessibilityRecord p0) {}
    boolean isAccessibilityDataSensitive() { return false; }
    public boolean isChecked() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isFullScreen() { return false; }
    public boolean isImportantForAccessibility() { return false; }
    public boolean isPassword() { return false; }
    public boolean isScrollable() { return false; }
    boolean isSealed() { return false; }
    @java.lang.Deprecated
    public void recycle() {}
    void setAccessibilityDataSensitive(boolean p0) {}
    public void setAddedCount(int p0) {}
    public void setBeforeText(java.lang.CharSequence p0) {}
    public void setChecked(boolean p0) {}
    public void setClassName(java.lang.CharSequence p0) {}
    public void setConnectionId(int p0) {}
    public void setContentDescription(java.lang.CharSequence p0) {}
    public void setCurrentItemIndex(int p0) {}
    public void setDisplayId(int p0) {}
    public void setEmbeddingHostWindowId(int p0) {}
    public void setEnabled(boolean p0) {}
    public void setFromIndex(int p0) {}
    public void setFullScreen(boolean p0) {}
    public void setImportantForAccessibility(boolean p0) {}
    public void setItemCount(int p0) {}
    public void setMaxScrollX(int p0) {}
    public void setMaxScrollY(int p0) {}
    public void setParcelableData(android.os.Parcelable p0) {}
    public void setPassword(boolean p0) {}
    public void setRemovedCount(int p0) {}
    public void setScrollDeltaX(int p0) {}
    public void setScrollDeltaY(int p0) {}
    public void setScrollX(int p0) {}
    public void setScrollY(int p0) {}
    public void setScrollable(boolean p0) {}
    public void setSealed(boolean p0) {}
    public void setSource(android.view.View p0) {}
    public void setSource(android.view.View p0, int p1) {}
    public void setSourceNodeId(long p0) {}
    public void setToIndex(int p0) {}
    public void setWindowId(int p0) {}
    public java.lang.String toString() { return null; }
}
