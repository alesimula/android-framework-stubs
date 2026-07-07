package android.hardware.input;

public final class KeyGlyphMap implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.KeyGlyphMap> CREATOR = null;
    private static final java.lang.String TAG = "KeyGlyphMap";
    private final android.content.ComponentName mComponentName = null;
    private final int[] mFunctionRowKeys = null;
    private final java.util.Map<android.hardware.input.KeyGlyphMap.KeyCombination, java.lang.Integer> mHardwareShortcuts = null;
    private final android.util.SparseArray<java.lang.String> mKeyDisplayNames = null;
    private final android.util.SparseIntArray mKeyGlyphs = null;
    private final android.util.SparseIntArray mModifierGlyphs = null;
    public KeyGlyphMap(android.content.ComponentName p0, android.util.SparseIntArray p1, android.util.SparseArray<java.lang.String> p2, android.util.SparseIntArray p3, int[] p4, java.util.Map<android.hardware.input.KeyGlyphMap.KeyCombination, java.lang.Integer> p5) {}
    public KeyGlyphMap(android.os.Parcel p0) {}
    private android.graphics.drawable.Drawable getDrawable(android.content.Context p0, int p1) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getDisplayNameForKeycode(int p0) { return null; }
    public android.graphics.drawable.Drawable getDrawableForKeycode(android.content.Context p0, int p1) { return null; }
    public android.graphics.drawable.Drawable getDrawableForModifier(android.content.Context p0, int p1) { return null; }
    public android.graphics.drawable.Drawable getDrawableForModifierState(android.content.Context p0, int p1) { return null; }
    public int[] getFunctionRowKeys() { return null; }
    public java.util.Map<android.hardware.input.KeyGlyphMap.KeyCombination, java.lang.Integer> getHardwareShortcuts() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class KeyCombination implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.input.KeyGlyphMap.KeyCombination> CREATOR = null;
        private final int mKeycode = 0;
        private final int mModifierState = 0;
        public KeyCombination(int p0, int p1) {}
        public KeyCombination(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getKeycode() { return 0; }
        public int getModifierState() { return 0; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
