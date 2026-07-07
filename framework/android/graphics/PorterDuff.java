package android.graphics;

public class PorterDuff {
    public PorterDuff() {}
    public static android.graphics.PorterDuff.Mode intToMode(int p0) { return null; }
    public static int modeToInt(android.graphics.PorterDuff.Mode p0) { return 0; }

    public static enum Mode {
        ADD,
        CLEAR,
        DARKEN,
        DST,
        DST_ATOP,
        DST_IN,
        DST_OUT,
        DST_OVER,
        LIGHTEN,
        MULTIPLY,
        OVERLAY,
        SCREEN,
        SRC,
        SRC_ATOP,
        SRC_IN,
        SRC_OUT,
        SRC_OVER,
        XOR;
        private static final android.graphics.PorterDuff.Mode[] $VALUES = null;
        public final int nativeInt = 0;
        private Mode() {}
    }
}
