package android.view.inputmethod;

public final class InputMethodInfo implements android.os.Parcelable {
    public static final java.lang.String ACTION_IME_LANGUAGE_SETTINGS = "android.view.inputmethod.action.IME_LANGUAGE_SETTINGS";
    public static final java.lang.String ACTION_STYLUS_HANDWRITING_SETTINGS = "android.view.inputmethod.action.STYLUS_HANDWRITING_SETTINGS";
    public static final int COMPONENT_NAME_MAX_LENGTH = 1000;
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InputMethodInfo> CREATOR = null;
    public static final int MAX_IMES_PER_PACKAGE = 20;
    private static final int MAX_METADATA_SIZE_BYTES = 204800;
    static final int MAX_SUBTYPES_PER_IME = 1500;
    static final java.lang.String TAG = "InputMethodInfo";
    private final boolean mForceDefault = false;
    private final int mHandledConfigChanges = 0;
    final java.lang.String mId = null;
    private final boolean mInlineSuggestionsEnabled = false;
    private final boolean mIsAuxIme = false;
    final int mIsDefaultResId = 0;
    final boolean mIsVirtualDeviceOnly = false;
    final boolean mIsVrOnly = false;
    private final java.lang.String mLanguageSettingsActivityName = null;
    final android.content.pm.ResolveInfo mService = null;
    final java.lang.String mSettingsActivityName = null;
    private final boolean mShowInInputMethodPicker = false;
    private final java.lang.String mStylusHandwritingSettingsActivityAttr = null;
    private final android.view.inputmethod.InputMethodSubtypeArray mSubtypes = null;
    private final boolean mSupportsConnectionlessStylusHandwriting = false;
    private final boolean mSupportsInlineSuggestionsWithTouchExploration = false;
    private final boolean mSupportsStylusHandwriting = false;
    private final boolean mSupportsSwitchingToNextInputMethod = false;
    private final boolean mSuppressesSpellChecker = false;
    public InputMethodInfo(android.content.Context p0, android.content.pm.ResolveInfo p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public InputMethodInfo(android.content.Context p0, android.content.pm.ResolveInfo p1, java.util.List<android.view.inputmethod.InputMethodSubtype> p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public InputMethodInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.lang.String p3, java.util.List<android.view.inputmethod.InputMethodSubtype> p4, int p5, boolean p6, boolean p7, boolean p8, boolean p9, boolean p10, int p11, boolean p12, boolean p13, java.lang.String p14, boolean p15) {}
    public InputMethodInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.view.inputmethod.InputMethodSubtype> p3, int p4, boolean p5) {}
    public InputMethodInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.view.inputmethod.InputMethodSubtype> p3, int p4, boolean p5, boolean p6, boolean p7) {}
    InputMethodInfo(android.os.Parcel p0) {}
    public InputMethodInfo(android.view.inputmethod.InputMethodInfo p0, java.util.List<android.view.inputmethod.InputMethodSubtype> p1) {}
    public InputMethodInfo(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.String p3) {}
    public InputMethodInfo(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.String p3, int p4) {}
    public InputMethodInfo(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, java.lang.String p7) {}
    private static android.content.pm.ResolveInfo buildFakeResolveInfo(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2) { return null; }
    public static java.lang.String computeId(android.content.pm.ResolveInfo p0) { return null; }
    private static void validateXmlMetaData(android.content.pm.ServiceInfo p0, android.content.res.Resources p1) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException, org.xmlpull.v1.XmlPullParserException {}
    public android.content.Intent createImeLanguageSettingsActivityIntent() { return null; }
    public android.content.Intent createStylusHandwritingSettingsActivityIntent() { return null; }
    public int describeContents() { return 0; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.ComponentName getComponent() { return null; }
    public int getConfigChanges() { return 0; }
    public java.lang.String getId() { return null; }
    public int getIsDefaultResourceId() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public java.lang.String getServiceName() { return null; }
    public java.lang.String getSettingsActivity() { return null; }
    public android.view.inputmethod.InputMethodSubtype getSubtypeAt(int p0) { return null; }
    public int getSubtypeCount() { return 0; }
    public int hashCode() { return 0; }
    public boolean isAuxiliaryIme() { return false; }
    public boolean isDefault(android.content.Context p0) { return false; }
    public boolean isInlineSuggestionsEnabled() { return false; }
    public boolean isSystem() { return false; }
    @android.annotation.SystemApi
    public boolean isVirtualDeviceOnly() { return false; }
    public boolean isVrOnly() { return false; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public boolean shouldShowInInputMethodPicker() { return false; }
    public boolean supportsConnectionlessStylusHandwriting() { return false; }
    public boolean supportsInlineSuggestionsWithTouchExploration() { return false; }
    public boolean supportsStylusHandwriting() { return false; }
    public boolean supportsSwitchingToNextInputMethod() { return false; }
    public boolean suppressesSpellChecker() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class MetadataReadBytesTracker {
        private int mRemainingBytes;
        public MetadataReadBytesTracker() {}
        private void onReadBytes(int p0) throws org.xmlpull.v1.XmlPullParserException {}
    }

    public static final class TypedArrayWrapper implements java.lang.AutoCloseable {
        private final boolean mIsReadingSubtype = false;
        private final android.view.inputmethod.InputMethodInfo.MetadataReadBytesTracker mReadTracker = null;
        private final android.content.res.TypedArray mTypedArray = null;
        private TypedArrayWrapper(android.content.res.TypedArray p0, android.view.inputmethod.InputMethodInfo.MetadataReadBytesTracker p1, boolean p2) {}
        public static android.view.inputmethod.InputMethodInfo.TypedArrayWrapper createForMethod(android.content.res.TypedArray p0, android.view.inputmethod.InputMethodInfo.MetadataReadBytesTracker p1) { return null; }
        public static android.view.inputmethod.InputMethodInfo.TypedArrayWrapper createForSubtype(android.content.res.TypedArray p0, android.view.inputmethod.InputMethodInfo.MetadataReadBytesTracker p1) { return null; }
        private int getMaxLength(int p0) { return 0; }
        public void close() {}
        public boolean getBoolean(int p0, boolean p1) throws org.xmlpull.v1.XmlPullParserException { return false; }
        public int getInt(int p0, int p1) throws org.xmlpull.v1.XmlPullParserException { return 0; }
        public int getResourceId(int p0, int p1) throws org.xmlpull.v1.XmlPullParserException { return 0; }
        public java.lang.String getString(int p0) throws org.xmlpull.v1.XmlPullParserException { return null; }
    }
}
