package android.app.assist;

public class AssistStructure implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.assist.AssistStructure> CREATOR = null;
    private static final boolean DEBUG_PARCEL = false;
    private static final boolean DEBUG_PARCEL_CHILDREN = false;
    private static final boolean DEBUG_PARCEL_TREE = false;
    private static final java.lang.String DESCRIPTOR = "android.app.AssistStructure";
    public static final int FLAG_OMIT_SCREEN_CONTENT = -2147483648;
    private static final android.util.ArrayMap<java.lang.Integer, java.lang.String> INPUT_TYPE_VARIATIONS = null;
    private static final java.lang.String TAG = "AssistStructure";
    private static final int TRANSACTION_XFER = 2;
    private static final int VALIDATE_VIEW_TOKEN = 572662306;
    private static final int VALIDATE_WINDOW_TOKEN = 286331153;
    private long mAcquisitionEndTime;
    private long mAcquisitionStartTime;
    private android.content.ComponentName mActivityComponent;
    private int mAutofillFlags;
    private android.view.autofill.AutofillNoiseInjector mAutofillNoiseInjector;
    private int mFlags;
    private boolean mHaveData;
    private boolean mIsHomeActivity;
    private final java.util.ArrayList<android.app.assist.AssistStructure.ViewNodeBuilder> mPendingAsyncChildren = null;
    private android.os.IBinder mReceiveChannel;
    private boolean mSanitizeOnWrite;
    private android.app.assist.AssistStructure.SendChannel mSendChannel;
    private int mTaskId;
    private android.graphics.Rect mTmpRect;
    private final java.util.ArrayList<android.app.assist.AssistStructure.WindowNode> mWindowNodes = null;
    public AssistStructure() {}
    public AssistStructure(android.app.Activity p0, boolean p1, int p2) {}
    public AssistStructure(android.os.Parcel p0) {}
    private static java.lang.String getInputTypeString(int p0) { return null; }
    public void clearSendChannel() {}
    public int describeContents() { return 0; }
    void dump(java.lang.String p0, android.app.assist.AssistStructure.ViewNode p1, boolean p2) {}
    public void dump(boolean p0) {}
    public void ensureData() {}
    public void ensureDataForAutofill() {}
    public long getAcquisitionEndTime() { return 0L; }
    public long getAcquisitionStartTime() { return 0L; }
    public android.content.ComponentName getActivityComponent() { return null; }
    public int getFlags() { return 0; }
    public int getTaskId() { return 0; }
    public android.app.assist.AssistStructure.WindowNode getWindowNodeAt(int p0) { return null; }
    public int getWindowNodeCount() { return 0; }
    public boolean isHomeActivity() { return false; }
    public void sanitizeForParceling(boolean p0, android.view.autofill.AutofillNoiseInjector p1) {}
    public void setAcquisitionEndTime(long p0) {}
    public void setAcquisitionStartTime(long p0) {}
    public void setActivityComponent(android.content.ComponentName p0) {}
    public void setHomeActivity(boolean p0) {}
    public void setTaskId(int p0) {}
    boolean waitForReady() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class AutofillOverlay {
        public boolean focused;
        public android.view.autofill.AutofillValue value;
        public AutofillOverlay() {}
    }

    private static final class HtmlInfoNode extends android.view.ViewStructure.HtmlInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.assist.AssistStructure.HtmlInfoNode> CREATOR = null;
        private java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> mAttributes;
        private final java.lang.String[] mNames = null;
        private final java.lang.String mTag = null;
        private final java.lang.String[] mValues = null;
        private HtmlInfoNode(android.app.assist.AssistStructure.HtmlInfoNodeBuilder p0) { super(); }
        public int describeContents() { return 0; }
        public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttributes() { return null; }
        public java.lang.String getTag() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static final class HtmlInfoNodeBuilder extends android.view.ViewStructure.HtmlInfo.Builder {
        private java.util.ArrayList<java.lang.String> mNames;
        private final java.lang.String mTag = null;
        private java.util.ArrayList<java.lang.String> mValues;
        HtmlInfoNodeBuilder(java.lang.String p0) { super(); }
        public android.view.ViewStructure.HtmlInfo.Builder addAttribute(java.lang.String p0, java.lang.String p1) { return null; }
        public android.app.assist.AssistStructure.HtmlInfoNode build() { return null; }
    }

    final class ParcelTransferReader {
        private final android.os.IBinder mChannel = null;
        private android.os.Parcel mCurParcel;
        int mNumReadViews;
        int mNumReadWindows;
        android.os.PooledStringReader mStringReader;
        final float[] mTmpMatrix = null;
        private android.os.IBinder mTransferToken;
        ParcelTransferReader(android.app.assist.AssistStructure p0, android.os.IBinder p1) {}
        private void fetchData() {}
        void go() {}
        android.os.Parcel readParcel(int p0, int p1) { return null; }
    }

    static final class ParcelTransferWriter extends android.os.Binder {
        final android.view.autofill.AutofillNoiseInjector mAutofillNoiseInjector = null;
        android.app.assist.AssistStructure.ViewStackEntry mCurViewStackEntry;
        int mCurViewStackPos;
        int mCurWindow;
        int mNumWindows;
        int mNumWrittenViews;
        int mNumWrittenWindows;
        final boolean mSanitizeOnWrite = false;
        final float[] mTmpMatrix = null;
        final java.util.ArrayList<android.app.assist.AssistStructure.ViewStackEntry> mViewStack = null;
        final boolean mWriteStructure = false;
        ParcelTransferWriter(android.app.assist.AssistStructure p0, android.os.Parcel p1) { super(); }
        void pushViewStackEntry(android.app.assist.AssistStructure.ViewNode p0, int p1) {}
        boolean writeNextEntryToParcel(android.app.assist.AssistStructure p0, android.os.Parcel p1, android.os.PooledStringWriter p2) { return false; }
        void writeToParcel(android.app.assist.AssistStructure p0, android.os.Parcel p1) {}
        boolean writeToParcelInner(android.app.assist.AssistStructure p0, android.os.Parcel p1) { return false; }
        void writeView(android.app.assist.AssistStructure.ViewNode p0, android.os.Parcel p1, android.os.PooledStringWriter p2, int p3) {}
    }

    static final class SendChannel extends android.os.Binder {
        volatile android.app.assist.AssistStructure mAssistStructure;
        SendChannel(android.app.assist.AssistStructure p0) { super(); }
        protected boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
    }

    public static class ViewNode {
        static final int AUTOFILL_FLAGS_HAS_AUTOFILL_HINTS = 16;
        static final int AUTOFILL_FLAGS_HAS_AUTOFILL_NOISE_INJECTED_DATA = 8192;
        static final int AUTOFILL_FLAGS_HAS_AUTOFILL_OPTIONS = 32;
        static final int AUTOFILL_FLAGS_HAS_AUTOFILL_SESSION_ID = 2048;
        static final int AUTOFILL_FLAGS_HAS_AUTOFILL_TYPE = 8;
        static final int AUTOFILL_FLAGS_HAS_AUTOFILL_VALUE = 4;
        static final int AUTOFILL_FLAGS_HAS_AUTOFILL_VIEW_ID = 1;
        static final int AUTOFILL_FLAGS_HAS_AUTOFILL_VIRTUAL_VIEW_ID = 2;
        static final int AUTOFILL_FLAGS_HAS_HINT_ID_ENTRY = 4096;
        static final int AUTOFILL_FLAGS_HAS_HTML_INFO = 64;
        static final int AUTOFILL_FLAGS_HAS_MAX_TEXT_EMS = 512;
        static final int AUTOFILL_FLAGS_HAS_MAX_TEXT_LENGTH = 1024;
        static final int AUTOFILL_FLAGS_HAS_MIN_TEXT_EMS = 256;
        static final int AUTOFILL_FLAGS_HAS_TEXT_ID_ENTRY = 128;
        static final int FLAGS_ACCESSIBILITY_FOCUSED = 4096;
        static final int FLAGS_ACTIVATED = 8192;
        static final int FLAGS_ALL_CONTROL = -65536;
        static final int FLAGS_ASSIST_BLOCKED = 128;
        static final int FLAGS_CHECKABLE = 256;
        static final int FLAGS_CHECKED = 512;
        static final int FLAGS_CLICKABLE = 1024;
        static final int FLAGS_CONTEXT_CLICKABLE = 16384;
        static final int FLAGS_DISABLED = 1;
        static final int FLAGS_FOCUSABLE = 16;
        static final int FLAGS_FOCUSED = 32;
        static final int FLAGS_HAS_ALPHA = 536870912;
        static final int FLAGS_HAS_CHILDREN = 1048576;
        static final int FLAGS_HAS_COMPLEX_TEXT = 8388608;
        static final int FLAGS_HAS_CONTENT_DESCRIPTION = 33554432;
        static final int FLAGS_HAS_ELEVATION = 268435456;
        static final int FLAGS_HAS_EXTRAS = 4194304;
        static final int FLAGS_HAS_ID = 2097152;
        static final int FLAGS_HAS_INPUT_TYPE = 262144;
        static final int FLAGS_HAS_LARGE_COORDS = 67108864;
        static final int FLAGS_HAS_LOCALE_LIST = 65536;
        static final int FLAGS_HAS_MATRIX = 1073741824;
        static final int FLAGS_HAS_MIME_TYPES = -2147483648;
        static final int FLAGS_HAS_SCROLL = 134217728;
        static final int FLAGS_HAS_TEXT = 16777216;
        static final int FLAGS_HAS_URL_DOMAIN = 524288;
        static final int FLAGS_HAS_URL_SCHEME = 131072;
        static final int FLAGS_LONG_CLICKABLE = 2048;
        static final int FLAGS_OPAQUE = 32768;
        static final int FLAGS_SELECTED = 64;
        static final int FLAGS_VISIBILITY_MASK = 12;
        public static final int TEXT_COLOR_UNDEFINED = 1;
        public static final int TEXT_STYLE_BOLD = 1;
        public static final int TEXT_STYLE_ITALIC = 2;
        public static final int TEXT_STYLE_STRIKE_THRU = 8;
        public static final int TEXT_STYLE_UNDERLINE = 4;
        float mAlpha;
        int mAutofillFlags;
        java.lang.String[] mAutofillHints;
        android.view.autofill.AutofillId mAutofillId;
        android.view.autofill.AutofillNoiseInjectedData mAutofillNoiseInjectedData;
        java.lang.CharSequence[] mAutofillOptions;
        android.app.assist.AssistStructure.AutofillOverlay mAutofillOverlay;
        int mAutofillType;
        android.view.autofill.AutofillValue mAutofillValue;
        android.app.assist.AssistStructure.ViewNode[] mChildren;
        java.lang.String mClassName;
        java.lang.CharSequence mContentDescription;
        float mElevation;
        android.os.Bundle mExtras;
        int mFlags;
        android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> mGetCredentialCallback;
        android.credentials.GetCredentialRequest mGetCredentialRequest;
        android.os.ResultReceiver mGetCredentialResultReceiver;
        int mHeight;
        java.lang.String mHintIdEntry;
        android.view.ViewStructure.HtmlInfo mHtmlInfo;
        int mId;
        java.lang.String mIdEntry;
        java.lang.String mIdPackage;
        java.lang.String mIdType;
        int mImportantForAutofill;
        int mInputType;
        boolean mIsCredential;
        android.os.LocaleList mLocaleList;
        android.graphics.Matrix mMatrix;
        int mMaxEms;
        int mMaxLength;
        int mMinEms;
        java.lang.String[] mReceiveContentMimeTypes;
        boolean mSanitized;
        int mScrollX;
        int mScrollY;
        android.app.assist.AssistStructure.ViewNodeText mText;
        java.lang.String mTextIdEntry;
        java.lang.String mWebDomain;
        java.lang.String mWebScheme;
        int mWidth;
        int mX;
        int mY;
        @android.annotation.SystemApi
        public ViewNode() {}
        ViewNode(android.app.assist.AssistStructure.ParcelTransferReader p0, int p1) {}
        ViewNode(android.os.Parcel p0) {}
        private static java.lang.String readString(android.os.Parcel p0, android.os.PooledStringReader p1) { return null; }
        private boolean shouldWriteSensitive(boolean p0, boolean p1) { return false; }
        private static void writeString(android.os.Parcel p0, android.os.PooledStringWriter p1, java.lang.String p2) {}
        public float getAlpha() { return 0.0f; }
        public java.lang.String[] getAutofillHints() { return null; }
        public android.view.autofill.AutofillId getAutofillId() { return null; }
        public android.view.autofill.AutofillNoiseInjectedData getAutofillNoiseInjectedData() { return null; }
        public java.lang.CharSequence[] getAutofillOptions() { return null; }
        public int getAutofillType() { return 0; }
        public android.view.autofill.AutofillValue getAutofillValue() { return null; }
        public android.app.assist.AssistStructure.ViewNode getChildAt(int p0) { return null; }
        public int getChildCount() { return 0; }
        public java.lang.String getClassName() { return null; }
        public java.lang.CharSequence getContentDescription() { return null; }
        public float getElevation() { return 0.0f; }
        public android.os.Bundle getExtras() { return null; }
        public int getHeight() { return 0; }
        public java.lang.String getHint() { return null; }
        public java.lang.String getHintIdEntry() { return null; }
        public android.view.ViewStructure.HtmlInfo getHtmlInfo() { return null; }
        public int getId() { return 0; }
        public java.lang.String getIdEntry() { return null; }
        public java.lang.String getIdPackage() { return null; }
        public java.lang.String getIdType() { return null; }
        public int getImportantForAutofill() { return 0; }
        public int getInputType() { return 0; }
        public int getLeft() { return 0; }
        public android.os.LocaleList getLocaleList() { return null; }
        public int getMaxTextEms() { return 0; }
        public int getMaxTextLength() { return 0; }
        public int getMinTextEms() { return 0; }
        public android.os.ResultReceiver getPendingCredentialCallback() { return null; }
        public android.credentials.GetCredentialRequest getPendingCredentialRequest() { return null; }
        public java.lang.String[] getReceiveContentMimeTypes() { return null; }
        public int getScrollX() { return 0; }
        public int getScrollY() { return 0; }
        public java.lang.CharSequence getText() { return null; }
        public int getTextBackgroundColor() { return 0; }
        public int getTextColor() { return 0; }
        public java.lang.String getTextIdEntry() { return null; }
        public int[] getTextLineBaselines() { return null; }
        public int[] getTextLineCharOffsets() { return null; }
        public int getTextSelectionEnd() { return 0; }
        public int getTextSelectionStart() { return 0; }
        public float getTextSize() { return 0.0f; }
        public int getTextStyle() { return 0; }
        public int getTop() { return 0; }
        public android.graphics.Matrix getTransformation() { return null; }
        public int getVisibility() { return 0; }
        public java.lang.String getWebDomain() { return null; }
        public java.lang.String getWebScheme() { return null; }
        public int getWidth() { return 0; }
        void initializeFromParcelWithoutChildren(android.os.Parcel p0, android.os.PooledStringReader p1, float[] p2) {}
        public boolean isAccessibilityFocused() { return false; }
        public boolean isActivated() { return false; }
        public boolean isAssistBlocked() { return false; }
        public boolean isCheckable() { return false; }
        public boolean isChecked() { return false; }
        public boolean isClickable() { return false; }
        public boolean isContextClickable() { return false; }
        public boolean isCredential() { return false; }
        public boolean isEnabled() { return false; }
        public boolean isFocusable() { return false; }
        public boolean isFocused() { return false; }
        public boolean isLongClickable() { return false; }
        public boolean isOpaque() { return false; }
        public boolean isSanitized() { return false; }
        public boolean isSelected() { return false; }
        public void setAutofillOverlay(android.app.assist.AssistStructure.AutofillOverlay p0) {}
        public void setWebDomain(java.lang.String p0) {}
        public void updateAutofillValue(android.view.autofill.AutofillValue p0) {}
        int writeSelfToParcel(android.os.Parcel p0, android.os.PooledStringWriter p1, boolean p2, android.view.autofill.AutofillNoiseInjector p3, float[] p4, boolean p5) { return 0; }
    }

    public static class ViewNodeBuilder extends android.view.ViewStructure {
        final android.app.assist.AssistStructure mAssist = null;
        final boolean mAsync = false;
        private android.os.Handler mHandler;
        final android.app.assist.AssistStructure.ViewNode mNode = null;
        public ViewNodeBuilder() { super(); }
        ViewNodeBuilder(android.app.assist.AssistStructure p0, android.app.assist.AssistStructure.ViewNode p1, boolean p2) { super(); }
        private final android.app.assist.AssistStructure.ViewNodeText getNodeText() { return null; }
        private void setUpResultReceiver(android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> p0) {}
        private java.lang.CharSequence stripAllSpansFromText(java.lang.CharSequence p0) { return null; }
        private android.os.ResultReceiver toIpcFriendlyResultReceiver(android.os.ResultReceiver p0) { return null; }
        public int addChildCount(int p0) { return 0; }
        public void asyncCommit() {}
        public android.view.ViewStructure asyncNewChild(int p0) { return null; }
        public android.view.autofill.AutofillId getAutofillId() { return null; }
        public int getChildCount() { return 0; }
        public android.os.Bundle getExtras() { return null; }
        public java.lang.CharSequence getHint() { return null; }
        public android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> getPendingCredentialCallback() { return null; }
        public android.credentials.GetCredentialRequest getPendingCredentialRequest() { return null; }
        public android.graphics.Rect getTempRect() { return null; }
        public java.lang.CharSequence getText() { return null; }
        public int getTextSelectionEnd() { return 0; }
        public int getTextSelectionStart() { return 0; }
        public android.app.assist.AssistStructure.ViewNode getViewNode() { return null; }
        public boolean hasExtras() { return false; }
        public android.view.ViewStructure newChild(int p0) { return null; }
        public android.view.ViewStructure.HtmlInfo.Builder newHtmlInfoBuilder(java.lang.String p0) { return null; }
        public void setAccessibilityFocused(boolean p0) {}
        public void setActivated(boolean p0) {}
        public void setAlpha(float p0) {}
        public void setAssistBlocked(boolean p0) {}
        public void setAutofillHints(java.lang.String[] p0) {}
        public void setAutofillId(android.view.autofill.AutofillId p0) {}
        public void setAutofillId(android.view.autofill.AutofillId p0, int p1) {}
        public void setAutofillOptions(java.lang.CharSequence[] p0) {}
        public void setAutofillType(int p0) {}
        public void setAutofillValue(android.view.autofill.AutofillValue p0) {}
        public void setCheckable(boolean p0) {}
        public void setChecked(boolean p0) {}
        public void setChildCount(int p0) {}
        public void setClassName(java.lang.String p0) {}
        public void setClickable(boolean p0) {}
        public void setContentDescription(java.lang.CharSequence p0) {}
        public void setContextClickable(boolean p0) {}
        public void setDataIsSensitive(boolean p0) {}
        public void setDimens(int p0, int p1, int p2, int p3, int p4, int p5) {}
        public void setElevation(float p0) {}
        public void setEnabled(boolean p0) {}
        public void setFocusable(boolean p0) {}
        public void setFocused(boolean p0) {}
        public void setHint(java.lang.CharSequence p0) {}
        public void setHintIdEntry(java.lang.String p0) {}
        public void setHtmlInfo(android.view.ViewStructure.HtmlInfo p0) {}
        public void setId(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
        public void setImportantForAutofill(int p0) {}
        public void setInputType(int p0) {}
        public void setIsCredential(boolean p0) {}
        public void setLocaleList(android.os.LocaleList p0) {}
        public void setLongClickable(boolean p0) {}
        public void setMaxTextEms(int p0) {}
        public void setMaxTextLength(int p0) {}
        public void setMinTextEms(int p0) {}
        public void setOpaque(boolean p0) {}
        public void setPendingCredentialRequest(android.credentials.GetCredentialRequest p0, android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> p1) {}
        public void setReceiveContentMimeTypes(java.lang.String[] p0) {}
        public void setSelected(boolean p0) {}
        public void setText(java.lang.CharSequence p0) {}
        public void setText(java.lang.CharSequence p0, int p1, int p2) {}
        public void setTextIdEntry(java.lang.String p0) {}
        public void setTextLines(int[] p0, int[] p1) {}
        public void setTextStyle(float p0, int p1, int p2, int p3) {}
        public void setTransformation(android.graphics.Matrix p0) {}
        public void setVisibility(int p0) {}
        public void setWebDomain(java.lang.String p0) {}
    }

    public static final class ViewNodeParcelable implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.assist.AssistStructure.ViewNodeParcelable> CREATOR = null;
        private final android.app.assist.AssistStructure.ViewNode mViewNode = null;
        public ViewNodeParcelable(android.app.assist.AssistStructure.ViewNode p0) {}
        public ViewNodeParcelable(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public android.app.assist.AssistStructure.ViewNode getViewNode() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    static final class ViewNodeText {
        java.lang.String mHint;
        int[] mLineBaselines;
        int[] mLineCharOffsets;
        java.lang.CharSequence mText;
        int mTextBackgroundColor;
        int mTextColor;
        int mTextSelectionEnd;
        int mTextSelectionStart;
        float mTextSize;
        int mTextStyle;
        ViewNodeText() {}
        ViewNodeText(android.os.Parcel p0, boolean p1) {}
        boolean isSimple() { return false; }
        void writeToParcel(android.os.Parcel p0, boolean p1, boolean p2) {}
    }

    static final class ViewStackEntry {
        int curChild;
        android.app.assist.AssistStructure.ViewNode node;
        int numChildren;
        ViewStackEntry() {}
    }

    public static class WindowNode {
        final int mDisplayId = 0;
        final int mHeight = 0;
        final android.app.assist.AssistStructure.ViewNode mRoot = null;
        final java.lang.CharSequence mTitle = null;
        final int mWidth = 0;
        final int mX = 0;
        final int mY = 0;
        WindowNode(android.app.assist.AssistStructure.ParcelTransferReader p0) {}
        WindowNode(android.app.assist.AssistStructure p0, android.view.ViewRootImpl p1, boolean p2, int p3) {}
        public int getDisplayId() { return 0; }
        public int getHeight() { return 0; }
        public int getLeft() { return 0; }
        public android.app.assist.AssistStructure.ViewNode getRootViewNode() { return null; }
        public java.lang.CharSequence getTitle() { return null; }
        public int getTop() { return 0; }
        public int getWidth() { return 0; }
        int resolveViewAutofillFlags(android.content.Context p0, int p1) { return 0; }
        void writeSelfToParcel(android.os.Parcel p0, android.os.PooledStringWriter p1, float[] p2) {}
    }
}
