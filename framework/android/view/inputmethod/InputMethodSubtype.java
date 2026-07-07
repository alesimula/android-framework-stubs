package android.view.inputmethod;

public final class InputMethodSubtype implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InputMethodSubtype> CREATOR = null;
    private static final java.lang.String EXTRA_KEY_UNTRANSLATABLE_STRING_IN_SUBTYPE_NAME = "UntranslatableReplacementStringInSubtypeName";
    private static final java.lang.String EXTRA_VALUE_KEY_VALUE_SEPARATOR = "=";
    private static final java.lang.String EXTRA_VALUE_PAIR_SEPARATOR = ",";
    private static final java.lang.String LANGUAGE_TAG_NONE = "";
    public static final int SUBTYPE_ID_NONE = 0;
    private static final java.lang.String SUBTYPE_MODE_KEYBOARD = "keyboard";
    private static final java.lang.String TAG = null;
    private static final java.lang.String UNDEFINED_LANGUAGE_TAG = "und";
    private volatile java.lang.String mCachedCanonicalizedLanguageTag;
    private volatile java.util.Locale mCachedLocaleObj;
    private volatile java.util.HashMap<java.lang.String, java.lang.String> mExtraValueHashMapCache;
    private final boolean mIsAsciiCapable = false;
    private final boolean mIsAuxiliary = false;
    private final java.lang.CharSequence mLayoutLabelNonLocalized = null;
    private final int mLayoutLabelResId = 0;
    private final java.lang.Object mLock = null;
    private final boolean mOverridesImplicitlyEnabledSubtype = false;
    private final java.lang.String mPkLanguageTag = null;
    private final java.lang.String mPkLayoutType = null;
    private final java.lang.String mSubtypeExtraValue = null;
    private final int mSubtypeHashCode = 0;
    private final int mSubtypeIconResId = 0;
    private final int mSubtypeId = 0;
    private final java.lang.String mSubtypeLanguageTag = null;
    private final java.lang.String mSubtypeLocale = null;
    private final java.lang.String mSubtypeMode = null;
    private final java.lang.CharSequence mSubtypeNameOverride = null;
    private final int mSubtypeNameResId = 0;
    private final java.lang.CharSequence mSubtypeShortLabel = null;
    @java.lang.Deprecated
    public InputMethodSubtype(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6) {}
    @java.lang.Deprecated
    public InputMethodSubtype(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, int p7) {}
    InputMethodSubtype(android.os.Parcel p0) {}
    private InputMethodSubtype(android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder p0) {}
    private static android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder getBuilder(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, int p7, boolean p8) { return null; }
    private java.util.HashMap<java.lang.String, java.lang.String> getExtraValueHashMap() { return null; }
    private static java.lang.String getLocaleDisplayName(java.util.Locale p0, java.util.Locale p1, android.icu.text.DisplayContext p2) { return null; }
    private static java.util.Locale getLocaleFromContext(android.content.Context p0) { return null; }
    private static int hashCodeInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4, boolean p5) { return 0; }
    public static java.util.List<android.view.inputmethod.InputMethodSubtype> sort(android.view.inputmethod.InputMethodInfo p0, java.util.List<android.view.inputmethod.InputMethodSubtype> p1) { return null; }
    public boolean containsExtraValueKey(java.lang.String p0) { return false; }
    public int describeContents() { return 0; }
    void dump(android.util.Printer p0, java.lang.String p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getCanonicalizedLanguageTag() { return null; }
    public java.lang.CharSequence getDisplayName(android.content.Context p0, java.lang.String p1, android.content.pm.ApplicationInfo p2) { return null; }
    public java.lang.String getExtraValue() { return null; }
    public java.lang.String getExtraValueOf(java.lang.String p0) { return null; }
    public int getIconResId() { return 0; }
    public java.lang.String getLanguageTag() { return null; }
    public java.lang.CharSequence getLayoutDisplayName(android.content.Context p0, android.content.pm.ApplicationInfo p1) { return null; }
    public java.lang.CharSequence getLayoutLabelNonLocalized() { return null; }
    public int getLayoutLabelResource() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getLocale() { return null; }
    public java.util.Locale getLocaleObject() { return null; }
    public java.lang.String getMode() { return null; }
    public java.lang.CharSequence getNameOverride() { return null; }
    public int getNameResId() { return 0; }
    public android.icu.util.ULocale getPhysicalKeyboardHintLanguageTag() { return null; }
    public java.lang.String getPhysicalKeyboardHintLayoutType() { return null; }
    public final int getSubtypeId() { return 0; }
    public java.lang.CharSequence getSubtypeShortLabel() { return null; }
    public final boolean hasSubtypeId() { return false; }
    public int hashCode() { return 0; }
    public boolean isAsciiCapable() { return false; }
    public boolean isAuxiliary() { return false; }
    public boolean isSuitableForPhysicalKeyboardLayoutMapping() { return false; }
    public boolean overridesImplicitlyEnabledSubtype() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class InputMethodSubtypeBuilder {
        private boolean mIsAsciiCapable;
        private boolean mIsAuxiliary;
        private java.lang.CharSequence mLayoutLabelNonLocalized;
        private int mLayoutLabelResId;
        private boolean mOverridesImplicitlyEnabledSubtype;
        private java.lang.String mPkLanguageTag;
        private java.lang.String mPkLayoutType;
        private java.lang.String mSubtypeExtraValue;
        private int mSubtypeIconResId;
        private int mSubtypeId;
        private java.lang.String mSubtypeLanguageTag;
        private java.lang.String mSubtypeLocale;
        private java.lang.String mSubtypeMode;
        private java.lang.CharSequence mSubtypeNameOverride;
        private int mSubtypeNameResId;
        private java.lang.CharSequence mSubtypeShortLabel;
        public InputMethodSubtypeBuilder() {}
        public android.view.inputmethod.InputMethodSubtype build() { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAsciiCapable(boolean p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAuxiliary(boolean p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setLanguageTag(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setLayoutLabelNonLocalized(java.lang.CharSequence p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setLayoutLabelResource(int p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setOverridesImplicitlyEnabledSubtype(boolean p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setPhysicalKeyboardHint(android.icu.util.ULocale p0, java.lang.String p1) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeExtraValue(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeIconResId(int p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeId(int p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeLocale(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeMode(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeNameOverride(java.lang.CharSequence p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeNameResId(int p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeShortLabel(java.lang.CharSequence p0) { return null; }
    }
}
