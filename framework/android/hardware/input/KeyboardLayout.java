package android.hardware.input;

public final class KeyboardLayout implements android.os.Parcelable, java.lang.Comparable<android.hardware.input.KeyboardLayout> {
    public static final android.os.Parcelable.Creator<android.hardware.input.KeyboardLayout> CREATOR = null;
    public static final java.lang.String LAYOUT_TYPE_AZERTY = "azerty";
    public static final java.lang.String LAYOUT_TYPE_COLEMAK = "colemak";
    public static final java.lang.String LAYOUT_TYPE_DVORAK = "dvorak";
    public static final java.lang.String LAYOUT_TYPE_EXTENDED = "extended";
    public static final java.lang.String LAYOUT_TYPE_QWERTY = "qwerty";
    public static final java.lang.String LAYOUT_TYPE_QWERTZ = "qwertz";
    public static final java.lang.String LAYOUT_TYPE_TURKISH_F = "turkish_f";
    public static final java.lang.String LAYOUT_TYPE_TURKISH_Q = "turkish_q";
    public static final java.lang.String LAYOUT_TYPE_UNDEFINED = "undefined";
    public static final java.lang.String LAYOUT_TYPE_WORKMAN = "workman";
    private final java.lang.String mCollection = null;
    private final java.lang.String mDescriptor = null;
    private final java.lang.String mLabel = null;
    private final android.hardware.input.KeyboardLayout.LayoutType mLayoutType = null;
    private final android.os.LocaleList mLocales = null;
    private final int mPriority = 0;
    private final int mProductId = 0;
    private final int mVendorId = 0;
    private KeyboardLayout(android.os.Parcel p0) {}
    public KeyboardLayout(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.os.LocaleList p4, int p5, int p6, int p7) {}
    public static boolean isLayoutTypeValid(java.lang.String p0) { return false; }
    public int compareTo(android.hardware.input.KeyboardLayout p0) { return 0; }
    public int describeContents() { return 0; }
    public java.lang.String getCollection() { return null; }
    public java.lang.String getDescriptor() { return null; }
    public java.lang.String getLabel() { return null; }
    public java.lang.String getLayoutType() { return null; }
    public android.os.LocaleList getLocales() { return null; }
    public int getProductId() { return 0; }
    public int getVendorId() { return 0; }
    public boolean isAnsiLayout() { return false; }
    public boolean isJisLayout() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static enum LayoutType {
        AZERTY,
        COLEMAK,
        DVORAK,
        EXTENDED,
        QWERTY,
        QWERTZ,
        TURKISH_F,
        TURKISH_Q,
        UNDEFINED,
        WORKMAN;
        private static final android.hardware.input.KeyboardLayout.LayoutType[] $VALUES = null;
        private static final java.util.Map<java.lang.String, android.hardware.input.KeyboardLayout.LayoutType> NAME_TO_ENUM_MAP = null;
        private static final java.util.Map<java.lang.Integer, android.hardware.input.KeyboardLayout.LayoutType> VALUE_TO_ENUM_MAP = null;
        private final java.lang.String mName = null;
        private final int mValue = 0;
        private LayoutType() {}
        public static java.lang.String getLayoutNameFromValue(int p0) { return null; }
        public static int getLayoutTypeEnumValue(java.lang.String p0) { return 0; }
        private java.lang.String getName() { return null; }
        private int getValue() { return 0; }
        private static android.hardware.input.KeyboardLayout.LayoutType of(int p0) { return null; }
    }
}
