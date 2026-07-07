package android.hardware.input;

public class InputSettings {
    public static final int DEFAULT_BOUNCE_KEYS_THRESHOLD_MILLIS = 500;
    public static final float DEFAULT_MAXIMUM_OBSCURING_OPACITY_FOR_TOUCH = 0.800000011920929f;
    public static final float DEFAULT_MOUSE_KEYS_ACCELERATION = 0.20000000298023224f;
    public static final int DEFAULT_MOUSE_KEYS_MAX_SPEED = 5;
    public static final int DEFAULT_MOUSE_SCROLLING_SPEED = 0;
    public static final int DEFAULT_POINTER_SPEED = 0;
    public static final int DEFAULT_SLOW_KEYS_THRESHOLD_MILLIS = 500;
    public static final int DEFAULT_STYLUS_POINTER_ICON_ENABLED = 1;
    public static final int MAX_ACCESSIBILITY_BOUNCE_KEYS_THRESHOLD_MILLIS = 5000;
    public static final int MAX_ACCESSIBILITY_SLOW_KEYS_THRESHOLD_MILLIS = 5000;
    public static final int MAX_KEY_REPEAT_DELAY_MILLIS = 2000;
    public static final int MAX_KEY_REPEAT_TIMEOUT_MILLIS = 2000;
    public static final int MAX_MOUSE_SCROLLING_SPEED = 7;
    public static final int MAX_POINTER_SPEED = 7;
    public static final int MIN_KEY_REPEAT_DELAY_MILLIS = 20;
    public static final int MIN_KEY_REPEAT_TIMEOUT_MILLIS = 150;
    public static final int MIN_MOUSE_SCROLLING_SPEED = -7;
    public static final int MIN_POINTER_SPEED = -7;
    private InputSettings() {}
    public static int getAccessibilityBounceKeysThreshold(android.content.Context p0) { return 0; }
    public static float getAccessibilityMouseKeysAcceleration(android.content.Context p0) { return 0.0f; }
    public static int getAccessibilityMouseKeysMaxSpeed(android.content.Context p0) { return 0; }
    public static int getAccessibilitySlowKeysThreshold(android.content.Context p0) { return 0; }
    public static float getMaximumObscuringOpacityForTouch(android.content.Context p0) { return 0.0f; }
    public static int getMouseScrollingSpeed(android.content.Context p0) { return 0; }
    public static int getPointerSpeed(android.content.Context p0) { return 0; }
    public static int getRepeatKeysDelay(android.content.Context p0) { return 0; }
    public static int getRepeatKeysTimeout(android.content.Context p0) { return 0; }
    public static int getTouchpadPointerSpeed(android.content.Context p0) { return 0; }
    public static boolean isAccessibilityBounceKeysEnabled(android.content.Context p0) { return false; }
    public static boolean isAccessibilityMouseKeysEnabled(android.content.Context p0) { return false; }
    public static boolean isAccessibilitySlowKeysEnabled(android.content.Context p0) { return false; }
    public static boolean isAccessibilityStickyKeysEnabled(android.content.Context p0) { return false; }
    public static boolean isCustomizableInputGesturesFeatureFlagEnabled() { return false; }
    public static boolean isMousePointerAccelerationEnabled(android.content.Context p0) { return false; }
    public static boolean isMouseReverseVerticalScrollingEnabled(android.content.Context p0) { return false; }
    public static boolean isMouseScrollingAccelerationEnabled(android.content.Context p0) { return false; }
    public static boolean isMouseSwapPrimaryButtonEnabled(android.content.Context p0) { return false; }
    public static boolean isPrimaryKeysForMouseKeysEnabled(android.content.Context p0) { return false; }
    public static boolean isRepeatKeysEnabled(android.content.Context p0) { return false; }
    public static boolean isStylusEverUsed(android.content.Context p0) { return false; }
    public static boolean isStylusPointerIconEnabled(android.content.Context p0) { return false; }
    public static boolean isStylusPointerIconEnabled(android.content.Context p0, boolean p1) { return false; }
    public static boolean isTouchpadAccelerationEnabled(android.content.Context p0) { return false; }
    public static boolean isTouchpadDisableFeatureFlagEnabled() { return false; }
    public static void setAccessibilityBounceKeysThreshold(android.content.Context p0, int p1) {}
    public static void setAccessibilityMouseKeysAcceleration(android.content.Context p0, float p1) {}
    public static void setAccessibilityMouseKeysEnabled(android.content.Context p0, boolean p1) {}
    public static void setAccessibilityMouseKeysMaxSpeed(android.content.Context p0, int p1) {}
    public static void setAccessibilitySlowKeysThreshold(android.content.Context p0, int p1) {}
    public static void setAccessibilityStickyKeysEnabled(android.content.Context p0, boolean p1) {}
    public static void setMaximumObscuringOpacityForTouch(android.content.Context p0, float p1) {}
    public static void setMouseAccelerationEnabled(android.content.Context p0, boolean p1) {}
    public static void setMouseReverseVerticalScrolling(android.content.Context p0, boolean p1) {}
    public static void setMouseScrollingAcceleration(android.content.Context p0, boolean p1) {}
    public static void setMouseScrollingSpeed(android.content.Context p0, int p1) {}
    public static void setMouseSwapPrimaryButton(android.content.Context p0, boolean p1) {}
    public static void setPointerSpeed(android.content.Context p0, int p1) {}
    public static void setPrimaryKeysForMouseKeysEnabled(android.content.Context p0, boolean p1) {}
    public static void setRepeatKeysDelay(android.content.Context p0, int p1) {}
    public static void setRepeatKeysEnabled(android.content.Context p0, boolean p1) {}
    public static void setRepeatKeysTimeout(android.content.Context p0, int p1) {}
    public static void setStylusEverUsed(android.content.Context p0, boolean p1) {}
    public static void setTouchpadAccelerationEnabled(android.content.Context p0, boolean p1) {}
    public static void setTouchpadNaturalScrolling(android.content.Context p0, boolean p1) {}
    public static void setTouchpadPointerSpeed(android.content.Context p0, int p1) {}
    public static void setTouchpadRightClickZone(android.content.Context p0, boolean p1) {}
    public static void setTouchpadSystemGesturesEnabled(android.content.Context p0, boolean p1) {}
    public static void setTouchpadTapDragging(android.content.Context p0, boolean p1) {}
    public static void setTouchpadTapToClick(android.content.Context p0, boolean p1) {}
    public static void setTouchpadVisualizer(android.content.Context p0, boolean p1) {}
    public static void setTouchpadsEnabled(android.content.Context p0, boolean p1) {}
    public static boolean useTouchpadNaturalScrolling(android.content.Context p0) { return false; }
    public static boolean useTouchpadRightClickZone(android.content.Context p0) { return false; }
    public static boolean useTouchpadSystemGestures(android.content.Context p0) { return false; }
    public static boolean useTouchpadTapDragging(android.content.Context p0) { return false; }
    public static boolean useTouchpadTapToClick(android.content.Context p0) { return false; }
    public static boolean useTouchpadThreeFingerTapShortcut(android.content.Context p0) { return false; }
    public static boolean useTouchpadVisualizer(android.content.Context p0) { return false; }
    public static boolean useTouchpads(android.content.Context p0) { return false; }
}
