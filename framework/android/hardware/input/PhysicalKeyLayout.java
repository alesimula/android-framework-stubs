package android.hardware.input;

final class PhysicalKeyLayout {
    private static final android.util.SparseIntArray DEFAULT_KEYCODE_FOR_SCANCODE = null;
    private static final int SCANCODE_0 = 11;
    private static final int SCANCODE_1 = 2;
    private static final int SCANCODE_2 = 3;
    private static final int SCANCODE_3 = 4;
    private static final int SCANCODE_4 = 5;
    private static final int SCANCODE_5 = 6;
    private static final int SCANCODE_6 = 7;
    private static final int SCANCODE_7 = 8;
    private static final int SCANCODE_8 = 9;
    private static final int SCANCODE_9 = 10;
    private static final int SCANCODE_A = 30;
    private static final int SCANCODE_APOSTROPHE = 40;
    private static final int SCANCODE_B = 48;
    private static final int SCANCODE_BACKSLASH1 = 43;
    private static final int SCANCODE_BACKSLASH2 = 86;
    private static final int SCANCODE_C = 46;
    private static final int SCANCODE_COMMA = 51;
    private static final int SCANCODE_D = 32;
    private static final int SCANCODE_E = 18;
    private static final int SCANCODE_EQUALS = 13;
    private static final int SCANCODE_F = 33;
    private static final int SCANCODE_G = 34;
    private static final int SCANCODE_GRAVE = 41;
    private static final int SCANCODE_H = 35;
    private static final int SCANCODE_I = 23;
    private static final int SCANCODE_J = 36;
    private static final int SCANCODE_K = 37;
    private static final int SCANCODE_L = 38;
    private static final int SCANCODE_LEFT_BRACKET = 26;
    private static final int SCANCODE_M = 50;
    private static final int SCANCODE_MINUS = 12;
    private static final int SCANCODE_N = 49;
    private static final int SCANCODE_O = 24;
    private static final int SCANCODE_P = 25;
    private static final int SCANCODE_PERIOD = 52;
    private static final int SCANCODE_Q = 16;
    private static final int SCANCODE_R = 19;
    private static final int SCANCODE_RIGHT_BRACKET = 27;
    private static final int SCANCODE_S = 31;
    private static final int SCANCODE_SEMICOLON = 39;
    private static final int SCANCODE_SLASH = 53;
    private static final int SCANCODE_T = 20;
    private static final int SCANCODE_U = 22;
    private static final int SCANCODE_V = 47;
    private static final int SCANCODE_W = 17;
    private static final int SCANCODE_X = 45;
    private static final int SCANCODE_Y = 21;
    private static final int SCANCODE_YEN = 124;
    private static final int SCANCODE_Z = 44;
    private static final java.lang.String TAG = "KeyboardLayoutPreview";
    private android.hardware.input.PhysicalKeyLayout.EnterKey mEnterKey;
    private android.hardware.input.PhysicalKeyLayout.LayoutKey[][] mKeys;
    public PhysicalKeyLayout(android.view.KeyCharacterMap p0, android.hardware.input.KeyboardLayout p1) {}
    private void createAnsiLayout(android.view.KeyCharacterMap p0) {}
    private void createIsoLayout(android.view.KeyCharacterMap p0) {}
    private void createJisLayout(android.view.KeyCharacterMap p0) {}
    private static android.hardware.input.PhysicalKeyLayout.LayoutKey getKey(int p0, float p1) { return null; }
    private static android.hardware.input.PhysicalKeyLayout.LayoutKey getKey(android.view.KeyCharacterMap p0, int p1) { return null; }
    private static android.hardware.input.PhysicalKeyLayout.LayoutKey getKey(android.view.KeyCharacterMap p0, int p1, float p2) { return null; }
    private static java.lang.String getKeyText(android.view.KeyCharacterMap p0, int p1, int p2) { return null; }
    private void initLayoutKeys(android.view.KeyCharacterMap p0, android.hardware.input.KeyboardLayout p1) {}
    public static boolean isKeyPositionUnsure(android.hardware.input.PhysicalKeyLayout.LayoutKey p0) { return false; }
    private static boolean isSpecialKey(int p0) { return false; }
    public static boolean isSpecialKey(android.hardware.input.PhysicalKeyLayout.LayoutKey p0) { return false; }
    public android.hardware.input.PhysicalKeyLayout.EnterKey getEnterKey() { return null; }
    public android.hardware.input.PhysicalKeyLayout.LayoutKey[][] getKeys() { return null; }

    public static final class EnterKey {
        private final float bottomKeyWeight = 0.0f;
        private final int column = 0;
        private final int row = 0;
        private final float topKeyWeight = 0.0f;
        public EnterKey(int p0, int p1, float p2, float p3) {}
        public float bottomKeyWeight() { return 0.0f; }
        public int column() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public int row() { return 0; }
        public final java.lang.String toString() { return null; }
        public float topKeyWeight() { return 0.0f; }
    }

    public static class KeyGlyph {
        private final java.lang.String mAltGrShiftText = null;
        private final java.lang.String mAltGrText = null;
        private final java.lang.String mBaseText = null;
        private final java.lang.String mShiftText = null;
        public KeyGlyph(android.view.KeyCharacterMap p0, int p1) {}
        public java.lang.String getAltGrShiftText() { return null; }
        public java.lang.String getAltGrText() { return null; }
        public java.lang.String getBaseText() { return null; }
        public java.lang.String getShiftText() { return null; }
        public boolean hasBaseText() { return false; }
        public boolean hasValidAltGrShiftText() { return false; }
        public boolean hasValidAltGrText() { return false; }
        public boolean hasValidShiftText() { return false; }
    }

    public static final class LayoutKey {
        private final android.hardware.input.PhysicalKeyLayout.KeyGlyph glyph = null;
        private final int keyCode = 0;
        private final float keyWeight = 0.0f;
        private final int scanCode = 0;
        public LayoutKey(int p0, int p1, float p2, android.hardware.input.PhysicalKeyLayout.KeyGlyph p3) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public android.hardware.input.PhysicalKeyLayout.KeyGlyph glyph() { return null; }
        public final int hashCode() { return 0; }
        public int keyCode() { return 0; }
        public float keyWeight() { return 0.0f; }
        public int scanCode() { return 0; }
        public final java.lang.String toString() { return null; }
    }
}
