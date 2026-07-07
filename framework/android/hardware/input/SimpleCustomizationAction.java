package android.hardware.input;

public final class SimpleCustomizationAction extends android.hardware.input.CustomizationAction {
    public static final int TYPE_ASSIST = 21;
    public static final int TYPE_BACK = 1;
    public static final int TYPE_BRIGHTNESS_DOWN = 2;
    public static final int TYPE_BRIGHTNESS_UP = 3;
    public static final int TYPE_CALCULATOR = 4;
    public static final int TYPE_CLOSE_WINDOW = 19;
    public static final int TYPE_CONTEXTUAL_INSERT = 22;
    public static final int TYPE_CONTEXTUAL_QUERY = 24;
    public static final int TYPE_CONTEXTUAL_SEARCH = 23;
    public static final int TYPE_DICTATION = 5;
    public static final int TYPE_DO_NOTHING = 18;
    public static final int TYPE_EMOJI_MENU = 6;
    public static final int TYPE_FORWARD = 7;
    public static final int TYPE_LOCK = 8;
    public static final int TYPE_MEDIA_NEXT = 9;
    public static final int TYPE_MEDIA_PLAY_PAUSE = 10;
    public static final int TYPE_MEDIA_PREVIOUS = 11;
    public static final int TYPE_PARTIAL_SCREENSHOT = 20;
    public static final int TYPE_PRINT_SCREEN = 12;
    public static final int TYPE_SCREEN_CAPTURE = 13;
    public static final int TYPE_SHOW_DESKTOP = 14;
    public static final int TYPE_VOICE_ASSIST = 25;
    public static final int TYPE_VOLUME_DOWN = 15;
    public static final int TYPE_VOLUME_MUTE = 16;
    public static final int TYPE_VOLUME_UP = 17;
    private final android.hardware.input.AidlSimpleAction mAidlSimpleAction = null;
    public SimpleCustomizationAction(int p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.input.AidlSimpleAction getAidl() { return null; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
