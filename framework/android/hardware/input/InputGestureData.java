package android.hardware.input;

public final class InputGestureData {
    public static final int TOUCHPAD_GESTURE_TYPE_THREE_FINGER_TAP = 1;
    public static final int TOUCHPAD_GESTURE_TYPE_UNKNOWN = 0;
    private final android.hardware.input.AidlInputGestureData mInputGestureData = null;
    public InputGestureData(android.hardware.input.AidlInputGestureData p0) {}
    public static android.hardware.input.InputGestureData.Trigger createKeyTrigger(int p0, int p1) { return null; }
    public static android.hardware.input.InputGestureData.Trigger createTouchpadTrigger(int p0) { return null; }
    public static android.hardware.input.InputGestureData.Trigger createTriggerFromAidlTrigger(android.hardware.input.AidlInputGestureData.Trigger p0) { return null; }
    private android.hardware.input.AppLaunchData getAppLaunchData() { return null; }
    private void validate() {}
    public boolean allowCaptureByFocusedWindow() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.input.InputGestureData.Action getAction() { return null; }
    public android.hardware.input.AidlInputGestureData getAidlData() { return null; }
    public android.hardware.input.InputGestureData.Trigger getTrigger() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Action {
        private final android.hardware.input.AppLaunchData appLaunchData = null;
        private final int keyGestureType = 0;
        public Action(int p0, android.hardware.input.AppLaunchData p1) {}
        public android.hardware.input.AppLaunchData appLaunchData() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public int keyGestureType() { return 0; }
        public final java.lang.String toString() { return null; }
    }

    public static class Builder {
        private boolean mAllowCaptureByFocusedWindow;
        private android.hardware.input.AppLaunchData mAppLaunchData;
        private int mKeyGestureType;
        private android.hardware.input.InputGestureData.Trigger mTrigger;
        public Builder() {}
        public android.hardware.input.InputGestureData build() throws java.lang.IllegalArgumentException { return null; }
        public android.hardware.input.InputGestureData.Builder setAllowCaptureByFocusedWindow(boolean p0) { return null; }
        public android.hardware.input.InputGestureData.Builder setAppLaunchData(android.hardware.input.AppLaunchData p0) { return null; }
        public android.hardware.input.InputGestureData.Builder setKeyGestureType(int p0) { return null; }
        public android.hardware.input.InputGestureData.Builder setTrigger(android.hardware.input.InputGestureData.Trigger p0) { return null; }
    }

    public static enum Filter {
        KEY,
        TOUCHPAD;
        private static final android.hardware.input.InputGestureData.Filter[] $VALUES = null;
        private final int mTag = 0;
        private Filter() {}
        public static android.hardware.input.InputGestureData.Filter of(int p0) { return null; }
        public int getTag() { return 0; }
        public boolean matches(android.hardware.input.InputGestureData p0) { return false; }
    }

    public static class KeyTrigger implements android.hardware.input.InputGestureData.Trigger {
        android.hardware.input.AidlInputGestureData.KeyTrigger mAidlKeyTrigger;
        private KeyTrigger(int p0, int p1) {}
        private KeyTrigger(android.hardware.input.AidlInputGestureData.KeyTrigger p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public android.hardware.input.AidlInputGestureData.Trigger getAidlTrigger() { return null; }
        public int getKeycode() { return 0; }
        public int getModifierState() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class TouchpadTrigger implements android.hardware.input.InputGestureData.Trigger {
        android.hardware.input.AidlInputGestureData.TouchpadGestureTrigger mAidlTouchpadTrigger;
        private TouchpadTrigger(int p0) {}
        private TouchpadTrigger(android.hardware.input.AidlInputGestureData.TouchpadGestureTrigger p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public android.hardware.input.AidlInputGestureData.Trigger getAidlTrigger() { return null; }
        public int getTouchpadGestureType() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static interface Trigger {
        public android.hardware.input.AidlInputGestureData.Trigger getAidlTrigger();
    }
}
