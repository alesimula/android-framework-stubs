package android.graphics;

public enum BlendMode {
    CLEAR,
    COLOR,
    COLOR_BURN,
    COLOR_DODGE,
    DARKEN,
    DIFFERENCE,
    DST,
    DST_ATOP,
    DST_IN,
    DST_OUT,
    DST_OVER,
    EXCLUSION,
    HARD_LIGHT,
    HUE,
    LIGHTEN,
    LUMINOSITY,
    MODULATE,
    MULTIPLY,
    OVERLAY,
    PLUS,
    SATURATION,
    SCREEN,
    SOFT_LIGHT,
    SRC,
    SRC_ATOP,
    SRC_IN,
    SRC_OUT,
    SRC_OVER,
    XOR;
    private static final android.graphics.BlendMode[] $VALUES = null;
    private static final android.graphics.BlendMode[] BLEND_MODES = null;
    private final android.graphics.PorterDuffXfermode mXfermode = null;
    private BlendMode() {}
    public static android.graphics.PorterDuff.Mode blendModeToPorterDuffMode(android.graphics.BlendMode p0) { return null; }
    public static android.graphics.BlendMode fromValue(int p0) { return null; }
    public static int toValue(android.graphics.BlendMode p0) { return 0; }
    public android.graphics.PorterDuffXfermode getXfermode() { return null; }
}
