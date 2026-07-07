package android.os.multisensory;

public class MultisensoryManager {
    private static final int[] MULTISENSORY_TOKENS = null;
    private static final java.lang.String TAG = "MultisensoryManager";
    public static final int TOKEN_CANCEL = 6;
    public static final int TOKEN_DRAG_INDICATOR_CONTINUOUS = 17;
    public static final int TOKEN_DRAG_INDICATOR_DISCRETE = 18;
    public static final int TOKEN_DRAG_INDICATOR_THRESHOLD_LIMIT = 16;
    public static final int TOKEN_FAILURE = 1;
    public static final int TOKEN_FAILURE_HIGH_EMPHASIS = 0;
    public static final int TOKEN_KEYPRESS_DELETE = 22;
    public static final int TOKEN_KEYPRESS_RETURN = 21;
    public static final int TOKEN_KEYPRESS_SPACEBAR = 20;
    public static final int TOKEN_KEYPRESS_STANDARD = 19;
    public static final int TOKEN_LOCK = 10;
    public static final int TOKEN_LONG_PRESS = 11;
    public static final int TOKEN_PAUSE = 4;
    public static final int TOKEN_START = 3;
    public static final int TOKEN_STOP = 5;
    public static final int TOKEN_SUCCESS = 2;
    public static final int TOKEN_SWIPE_INDICATOR_THRESHOLD_LIMIT = 12;
    public static final int TOKEN_SWITCH_OFF = 8;
    public static final int TOKEN_SWITCH_ON = 7;
    public static final int TOKEN_TAP_HIGH_EMPHASIS = 13;
    public static final int TOKEN_TAP_LOW_EMPHASIS = 15;
    public static final int TOKEN_TAP_MEDIUM_EMPHASIS = 14;
    public static final int TOKEN_UNLOCK = 9;
    private final android.os.multisensory.IMultisensoryService mService = null;
    public MultisensoryManager() {}
    public static int[] getMultisensoryTokens() { return null; }
    public void playToken(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Token {
    }
}
