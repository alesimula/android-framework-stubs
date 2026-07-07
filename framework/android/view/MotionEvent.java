package android.view;

public final class MotionEvent extends android.view.InputEvent implements android.os.Parcelable {
    public static final int ACTION_BUTTON_PRESS = 11;
    public static final int ACTION_BUTTON_RELEASE = 12;
    public static final int ACTION_CANCEL = 3;
    public static final int ACTION_DOWN = 0;
    public static final int ACTION_HOVER_ENTER = 9;
    public static final int ACTION_HOVER_EXIT = 10;
    public static final int ACTION_HOVER_MOVE = 7;
    public static final int ACTION_MASK = 255;
    public static final int ACTION_MOVE = 2;
    public static final int ACTION_OUTSIDE = 4;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_1_DOWN = 5;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_1_UP = 6;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_2_DOWN = 261;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_2_UP = 262;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_3_DOWN = 517;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_3_UP = 518;
    public static final int ACTION_POINTER_DOWN = 5;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_ID_MASK = 65280;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_ID_SHIFT = 8;
    public static final int ACTION_POINTER_INDEX_MASK = 65280;
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;
    public static final int ACTION_POINTER_UP = 6;
    public static final int ACTION_SCROLL = 8;
    public static final int ACTION_UP = 1;
    public static final int AXIS_BRAKE = 23;
    public static final int AXIS_DISABLED = -1;
    public static final int AXIS_DISTANCE = 24;
    public static final int AXIS_GAS = 22;
    public static final int AXIS_GENERIC_1 = 32;
    public static final int AXIS_GENERIC_10 = 41;
    public static final int AXIS_GENERIC_11 = 42;
    public static final int AXIS_GENERIC_12 = 43;
    public static final int AXIS_GENERIC_13 = 44;
    public static final int AXIS_GENERIC_14 = 45;
    public static final int AXIS_GENERIC_15 = 46;
    public static final int AXIS_GENERIC_16 = 47;
    public static final int AXIS_GENERIC_2 = 33;
    public static final int AXIS_GENERIC_3 = 34;
    public static final int AXIS_GENERIC_4 = 35;
    public static final int AXIS_GENERIC_5 = 36;
    public static final int AXIS_GENERIC_6 = 37;
    public static final int AXIS_GENERIC_7 = 38;
    public static final int AXIS_GENERIC_8 = 39;
    public static final int AXIS_GENERIC_9 = 40;
    public static final int AXIS_GESTURE_PINCH_SCALE_FACTOR = 52;
    public static final int AXIS_GESTURE_SCROLL_X_DISTANCE = 50;
    public static final int AXIS_GESTURE_SCROLL_Y_DISTANCE = 51;
    public static final int AXIS_GESTURE_SWIPE_FINGER_COUNT = 53;
    public static final int AXIS_GESTURE_X_OFFSET = 48;
    public static final int AXIS_GESTURE_Y_OFFSET = 49;
    public static final int AXIS_HAT_X = 15;
    public static final int AXIS_HAT_Y = 16;
    public static final int AXIS_HSCROLL = 10;
    public static final int AXIS_LTRIGGER = 17;
    public static final int AXIS_ORIENTATION = 8;
    public static final int AXIS_PRESSURE = 2;
    public static final int AXIS_RELATIVE_X = 27;
    public static final int AXIS_RELATIVE_Y = 28;
    public static final int AXIS_RTRIGGER = 18;
    public static final int AXIS_RUDDER = 20;
    public static final int AXIS_RX = 12;
    public static final int AXIS_RY = 13;
    public static final int AXIS_RZ = 14;
    public static final int AXIS_SCROLL = 26;
    public static final int AXIS_SIZE = 3;
    private static final android.util.SparseArray<java.lang.String> AXIS_SYMBOLIC_NAMES = null;
    public static final int AXIS_THROTTLE = 19;
    public static final int AXIS_TILT = 25;
    public static final int AXIS_TOOL_MAJOR = 6;
    public static final int AXIS_TOOL_MINOR = 7;
    public static final int AXIS_TOUCH_MAJOR = 4;
    public static final int AXIS_TOUCH_MINOR = 5;
    public static final int AXIS_VSCROLL = 9;
    public static final int AXIS_WHEEL = 21;
    public static final int AXIS_X = 0;
    public static final int AXIS_Y = 1;
    public static final int AXIS_Z = 11;
    public static final int BUTTON_BACK = 8;
    public static final int BUTTON_EXTRA = 128;
    public static final int BUTTON_FORWARD = 16;
    public static final int BUTTON_PRIMARY = 1;
    public static final int BUTTON_SECONDARY = 2;
    public static final int BUTTON_SIDE = 256;
    public static final int BUTTON_STYLUS_PRIMARY = 32;
    public static final int BUTTON_STYLUS_SECONDARY = 64;
    private static final java.lang.String[] BUTTON_SYMBOLIC_NAMES = null;
    public static final int BUTTON_TASK = 512;
    public static final int BUTTON_TERTIARY = 4;
    public static final int CLASSIFICATION_AMBIGUOUS_GESTURE = 1;
    public static final int CLASSIFICATION_DEEP_PRESS = 2;
    public static final int CLASSIFICATION_MULTI_FINGER_SWIPE = 4;
    public static final int CLASSIFICATION_NONE = 0;
    public static final int CLASSIFICATION_PINCH = 5;
    public static final int CLASSIFICATION_TWO_FINGER_SWIPE = 3;
    public static final android.os.Parcelable.Creator<android.view.MotionEvent> CREATOR = null;
    private static final boolean DEBUG_CONCISE_TOSTRING = false;
    public static final int EDGE_BOTTOM = 2;
    public static final int EDGE_LEFT = 4;
    public static final int EDGE_RIGHT = 8;
    public static final int EDGE_TOP = 1;
    public static final int FLAG_CANCELED = 32;
    public static final int FLAG_HOVER_EXIT_PENDING = 4;
    public static final int FLAG_INJECTED_FROM_ACCESSIBILITY_TOOL = 4096;
    public static final int FLAG_IS_ACCESSIBILITY_EVENT = 2048;
    public static final int FLAG_IS_GENERATED_GESTURE = 8;
    public static final int FLAG_NO_FOCUS_CHANGE = 64;
    @java.lang.Deprecated
    public static final int FLAG_SUPPORTS_DIRECTIONAL_ORIENTATION = 256;
    @java.lang.Deprecated
    public static final int FLAG_SUPPORTS_ORIENTATION = 128;
    public static final int FLAG_TAINTED = -2147483648;
    public static final int FLAG_TARGET_ACCESSIBILITY_FOCUS = 1073741824;
    public static final int FLAG_WINDOW_IS_OBSCURED = 1;
    public static final int FLAG_WINDOW_IS_PARTIALLY_OBSCURED = 2;
    private static final int HISTORY_CURRENT = -2147483648;
    private static final float INVALID_CURSOR_POSITION = Float.NaN;
    public static final int INVALID_POINTER_ID = -1;
    private static final java.lang.String LABEL_PREFIX = "AXIS_";
    private static final int MAX_RECYCLED = 10;
    private static final long NS_PER_MS = 1000000L;
    private static final java.lang.String TAG = "MotionEvent";
    public static final int TOOL_TYPE_ERASER = 4;
    public static final int TOOL_TYPE_FINGER = 1;
    public static final int TOOL_TYPE_MOUSE = 3;
    public static final int TOOL_TYPE_PALM = 5;
    public static final int TOOL_TYPE_STYLUS = 2;
    private static final android.util.SparseArray<java.lang.String> TOOL_TYPE_SYMBOLIC_NAMES = null;
    public static final int TOOL_TYPE_UNKNOWN = 0;
    private static final java.lang.Object gRecyclerLock = null;
    private static android.view.MotionEvent gRecyclerTop;
    private static int gRecyclerUsed;
    private static final java.lang.Object gSharedTempLock = null;
    private static android.view.MotionEvent.PointerCoords[] gSharedTempPointerCoords;
    private static int[] gSharedTempPointerIndexMap;
    private static android.view.MotionEvent.PointerProperties[] gSharedTempPointerProperties;
    private long mNativePtr;
    private android.view.MotionEvent mNext;
    private MotionEvent() { super(); }
    public static java.lang.String actionToString(int p0) { return null; }
    private static <T extends java.lang.Object> void appendUnless(T p0, java.lang.StringBuilder p1, java.lang.String p2, T p3) {}
    public static int axisFromString(java.lang.String p0) { return 0; }
    public static java.lang.String axisToString(int p0) { return null; }
    public static java.lang.String buttonStateToString(int p0) { return null; }
    private static final float clamp(float p0, float p1, float p2) { return 0.0f; }
    public static java.lang.String classificationToString(int p0) { return null; }
    public static android.view.MotionEvent createFromParcelBody(android.os.Parcel p0) { return null; }
    public static android.graphics.Matrix createRotateMatrix(int p0, int p1, int p2) { return null; }
    private static final void ensureSharedTempPointerCapacity(int p0) {}
    private boolean initialize(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, float p9, float p10, float p11, float p12, long p13, long p14, int p15, android.view.MotionEvent.PointerProperties[] p16, android.view.MotionEvent.PointerCoords[] p17) { return false; }
    public static boolean isValidAxis(int p0) { return false; }
    private static native void nativeAddBatch(long p0, long p1, android.view.MotionEvent.PointerCoords[] p2, int p3);
    private static native void nativeApplyTransform(long p0, android.graphics.Matrix p1);
    private static native int nativeAxisFromString(java.lang.String p0);
    private static native java.lang.String nativeAxisToString(int p0);
    private static native long nativeCopy(long p0, long p1, boolean p2);
    private static native void nativeDispose(long p0);
    private static native int nativeFindPointerIndex(long p0, int p1);
    private static native int nativeGetAction(long p0);
    private static native int nativeGetActionButton(long p0);
    private static native float nativeGetAxisValue(long p0, int p1, int p2, int p3);
    private static native int nativeGetButtonState(long p0);
    private static native int nativeGetClassification(long p0);
    private static native int nativeGetDeviceId(long p0);
    private static native int nativeGetDisplayId(long p0);
    private static native long nativeGetDownTimeNanos(long p0);
    private static native int nativeGetEdgeFlags(long p0);
    private static native long nativeGetEventTimeNanos(long p0, int p1);
    private static native int nativeGetFlags(long p0);
    private static native int nativeGetHistorySize(long p0);
    private static native int nativeGetId(long p0);
    private static native int nativeGetMetaState(long p0);
    private static native void nativeGetPointerCoords(long p0, int p1, int p2, android.view.MotionEvent.PointerCoords p3);
    private static native int nativeGetPointerCount(long p0);
    private static native int nativeGetPointerId(long p0, int p1);
    private static native void nativeGetPointerProperties(long p0, int p1, android.view.MotionEvent.PointerProperties p2);
    private static native float nativeGetRawAxisValue(long p0, int p1, int p2, int p3);
    private static native float nativeGetRawXOffset(long p0);
    private static native float nativeGetRawYOffset(long p0);
    private static native int nativeGetSource(long p0);
    private static native int nativeGetSurfaceRotation(long p0);
    private static native int nativeGetToolType(long p0, int p1);
    private static native float nativeGetXCursorPosition(long p0);
    private static native float nativeGetXPrecision(long p0);
    private static native float nativeGetYCursorPosition(long p0);
    private static native float nativeGetYPrecision(long p0);
    private static native long nativeInitialize(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, float p10, float p11, float p12, float p13, long p14, long p15, int p16, android.view.MotionEvent.PointerProperties[] p17, android.view.MotionEvent.PointerCoords[] p18);
    private static native boolean nativeIsTouchEvent(long p0);
    private static native void nativeOffsetLocation(long p0, float p1, float p2);
    private static native long nativeReadFromParcel(long p0, android.os.Parcel p1);
    private static native void nativeScale(long p0, float p1);
    private static native void nativeSetAction(long p0, int p1);
    private static native void nativeSetActionButton(long p0, int p1);
    private static native void nativeSetButtonState(long p0, int p1);
    private static native void nativeSetCursorPosition(long p0, float p1, float p2);
    private static native void nativeSetDisplayId(long p0, int p1);
    private static native void nativeSetDownTimeNanos(long p0, long p1);
    private static native void nativeSetEdgeFlags(long p0, int p1);
    private static native void nativeSetFlags(long p0, int p1);
    private static native void nativeSetSource(long p0, int p1);
    private static native long nativeSplit(long p0, long p1, int p2);
    private static native void nativeTransform(long p0, android.graphics.Matrix p1);
    private static native void nativeWriteToParcel(long p0, android.os.Parcel p1);
    private static android.view.MotionEvent obtain() { return null; }
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, float p3, float p4, float p5, float p6, int p7, float p8, float p9, int p10, int p11) { return null; }
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, float p3, float p4, float p5, float p6, int p7, float p8, float p9, int p10, int p11, int p12, int p13) { return null; }
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, float p3, float p4, int p5) { return null; }
    @java.lang.Deprecated
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, int p3, float p4, float p5, float p6, float p7, int p8, float p9, float p10, int p11, int p12) { return null; }
    @java.lang.Deprecated
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, int p3, int[] p4, android.view.MotionEvent.PointerCoords[] p5, int p6, float p7, float p8, int p9, int p10, int p11, int p12) { return null; }
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, int p3, android.view.MotionEvent.PointerProperties[] p4, android.view.MotionEvent.PointerCoords[] p5, int p6, int p7, float p8, float p9, int p10, int p11, int p12, int p13) { return null; }
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, int p3, android.view.MotionEvent.PointerProperties[] p4, android.view.MotionEvent.PointerCoords[] p5, int p6, int p7, float p8, float p9, int p10, int p11, int p12, int p13, int p14) { return null; }
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, int p3, android.view.MotionEvent.PointerProperties[] p4, android.view.MotionEvent.PointerCoords[] p5, int p6, int p7, float p8, float p9, int p10, int p11, int p12, int p13, int p14, int p15) { return null; }
    public static android.view.MotionEvent obtain(android.view.MotionEvent p0) { return null; }
    public static android.view.MotionEvent obtainNanoseconds(long p0, long p1, int p2, int p3, android.view.MotionEvent.PointerProperties[] p4, android.view.MotionEvent.PointerCoords[] p5, int p6, int p7, float p8, float p9, int p10, int p11, int p12, int p13, int p14, int p15) { return null; }
    public static android.view.MotionEvent obtainNoHistory(android.view.MotionEvent p0) { return null; }
    private void setCanceled(boolean p0) {}
    private void setCursorPosition(float p0, float p1) {}
    public static java.lang.String toolTypeToString(int p0) { return null; }
    private void updateCursorPosition() {}
    public final void addBatch(long p0, float p1, float p2, float p3, float p4, int p5) {}
    public final void addBatch(long p0, android.view.MotionEvent.PointerCoords[] p1, int p2) {}
    public final boolean addBatch(android.view.MotionEvent p0) { return false; }
    public void applyTransform(android.graphics.Matrix p0) {}
    public final void cancel() {}
    public final android.view.MotionEvent clampNoHistory(float p0, float p1, float p2, float p3) { return null; }
    public android.view.MotionEvent copy() { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public final int findPointerIndex(int p0) { return 0; }
    public final int getAction() { return 0; }
    public final int getActionButton() { return 0; }
    public final int getActionIndex() { return 0; }
    public final int getActionMasked() { return 0; }
    public final float getAxisValue(int p0) { return 0.0f; }
    public final float getAxisValue(int p0, int p1) { return 0.0f; }
    public final int getButtonState() { return 0; }
    public int getClassification() { return 0; }
    public final int getDeviceId() { return 0; }
    public int getDisplayId() { return 0; }
    public final long getDownTime() { return 0L; }
    public long getDownTimeNanos() { return 0L; }
    public final int getEdgeFlags() { return 0; }
    public final long getEventTime() { return 0L; }
    public long getEventTimeNanos() { return 0L; }
    public final int getFlags() { return 0; }
    public final float getHistoricalAxisValue(int p0, int p1) { return 0.0f; }
    public final float getHistoricalAxisValue(int p0, int p1, int p2) { return 0.0f; }
    public final long getHistoricalEventTime(int p0) { return 0L; }
    public long getHistoricalEventTimeNanos(int p0) { return 0L; }
    public final float getHistoricalOrientation(int p0) { return 0.0f; }
    public final float getHistoricalOrientation(int p0, int p1) { return 0.0f; }
    public final void getHistoricalPointerCoords(int p0, int p1, android.view.MotionEvent.PointerCoords p2) {}
    public final float getHistoricalPressure(int p0) { return 0.0f; }
    public final float getHistoricalPressure(int p0, int p1) { return 0.0f; }
    public final float getHistoricalSize(int p0) { return 0.0f; }
    public final float getHistoricalSize(int p0, int p1) { return 0.0f; }
    public final float getHistoricalToolMajor(int p0) { return 0.0f; }
    public final float getHistoricalToolMajor(int p0, int p1) { return 0.0f; }
    public final float getHistoricalToolMinor(int p0) { return 0.0f; }
    public final float getHistoricalToolMinor(int p0, int p1) { return 0.0f; }
    public final float getHistoricalTouchMajor(int p0) { return 0.0f; }
    public final float getHistoricalTouchMajor(int p0, int p1) { return 0.0f; }
    public final float getHistoricalTouchMinor(int p0) { return 0.0f; }
    public final float getHistoricalTouchMinor(int p0, int p1) { return 0.0f; }
    public final float getHistoricalX(int p0) { return 0.0f; }
    public final float getHistoricalX(int p0, int p1) { return 0.0f; }
    public final float getHistoricalY(int p0) { return 0.0f; }
    public final float getHistoricalY(int p0, int p1) { return 0.0f; }
    public final int getHistorySize() { return 0; }
    public int getId() { return 0; }
    public final int getMetaState() { return 0; }
    public final float getOrientation() { return 0.0f; }
    public final float getOrientation(int p0) { return 0.0f; }
    public final void getPointerCoords(int p0, android.view.MotionEvent.PointerCoords p1) {}
    public final int getPointerCount() { return 0; }
    public final int getPointerId(int p0) { return 0; }
    public final int getPointerIdBits() { return 0; }
    public final void getPointerProperties(int p0, android.view.MotionEvent.PointerProperties p1) {}
    public final float getPressure() { return 0.0f; }
    public final float getPressure(int p0) { return 0.0f; }
    public final float getRawX() { return 0.0f; }
    public float getRawX(int p0) { return 0.0f; }
    public final float getRawY() { return 0.0f; }
    public float getRawY(int p0) { return 0.0f; }
    public final float getSize() { return 0.0f; }
    public final float getSize(int p0) { return 0.0f; }
    public final int getSource() { return 0; }
    public int getSurfaceRotation() { return 0; }
    public final float getToolMajor() { return 0.0f; }
    public final float getToolMajor(int p0) { return 0.0f; }
    public final float getToolMinor() { return 0.0f; }
    public final float getToolMinor(int p0) { return 0.0f; }
    public int getToolType(int p0) { return 0; }
    public final float getTouchMajor() { return 0.0f; }
    public final float getTouchMajor(int p0) { return 0.0f; }
    public final float getTouchMinor() { return 0.0f; }
    public final float getTouchMinor(int p0) { return 0.0f; }
    public final float getX() { return 0.0f; }
    public final float getX(int p0) { return 0.0f; }
    public float getXCursorPosition() { return 0.0f; }
    public float getXDispatchLocation(int p0) { return 0.0f; }
    public final float getXPrecision() { return 0.0f; }
    public final float getY() { return 0.0f; }
    public final float getY(int p0) { return 0.0f; }
    public float getYCursorPosition() { return 0.0f; }
    public float getYDispatchLocation(int p0) { return 0.0f; }
    public final float getYPrecision() { return 0.0f; }
    public final boolean isButtonPressed(int p0) { return false; }
    public boolean isHoverEvent() { return false; }
    public final boolean isHoverExitPending() { return false; }
    public boolean isInjectedFromAccessibilityService() { return false; }
    public boolean isInjectedFromAccessibilityTool() { return false; }
    public boolean isStylusPointer() { return false; }
    public boolean isSynthesizedTouchpadGesture() { return false; }
    public final boolean isTainted() { return false; }
    public boolean isTargetAccessibilityFocus() { return false; }
    public final boolean isTouchEvent() { return false; }
    public final boolean isWithinBoundsNoHistory(float p0, float p1, float p2, float p3) { return false; }
    public final void offsetLocation(float p0, float p1) {}
    public final void recycle() {}
    public final void scale(float p0) {}
    public final void setAction(int p0) {}
    public final void setActionButton(int p0) {}
    public final void setButtonState(int p0) {}
    public void setDisplayId(int p0) {}
    public final void setDownTime(long p0) {}
    public final void setEdgeFlags(int p0) {}
    public void setHoverExitPending(boolean p0) {}
    public final void setLocation(float p0, float p1) {}
    public final void setSource(int p0) {}
    public final void setTainted(boolean p0) {}
    public void setTargetAccessibilityFocus(boolean p0) {}
    public final android.view.MotionEvent split(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public final void transform(android.graphics.Matrix p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ActionMasked {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Axis {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Button {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Classification {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Flag {
    }

    public static final class PointerCoords {
        private static final int INITIAL_PACKED_AXIS_VALUES = 8;
        public boolean isResampled;
        private long mPackedAxisBits;
        private float[] mPackedAxisValues;
        public float orientation;
        public float pressure;
        public float relativeX;
        public float relativeY;
        public float size;
        public float toolMajor;
        public float toolMinor;
        public float touchMajor;
        public float touchMinor;
        public float x;
        public float y;
        public PointerCoords() {}
        public PointerCoords(android.view.MotionEvent.PointerCoords p0) {}
        public static android.view.MotionEvent.PointerCoords[] createArray(int p0) { return null; }
        public void clear() {}
        public void copyFrom(android.view.MotionEvent.PointerCoords p0) {}
        public float getAxisValue(int p0) { return 0.0f; }
        public boolean isResampled() { return false; }
        public void setAxisValue(int p0, float p1) {}
    }

    public static final class PointerProperties {
        public int id;
        public int toolType;
        public PointerProperties() {}
        public PointerProperties(android.view.MotionEvent.PointerProperties p0) {}
        public static android.view.MotionEvent.PointerProperties[] createArray(int p0) { return null; }
        private boolean equals(android.view.MotionEvent.PointerProperties p0) { return false; }
        public void clear() {}
        public void copyFrom(android.view.MotionEvent.PointerProperties p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ToolType {
    }
}
