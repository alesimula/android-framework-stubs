package android.view.translation;

public final class TranslationCapability implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.translation.TranslationCapability> CREATOR = null;
    public static final int STATE_AVAILABLE_TO_DOWNLOAD = 1;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_NOT_AVAILABLE = 4;
    public static final int STATE_ON_DEVICE = 3;
    public static final int STATE_REMOVED_AND_AVAILABLE = 1000;
    private final android.view.translation.TranslationSpec mSourceSpec = null;
    private final int mState = 0;
    private final int mSupportedTranslationFlags = 0;
    private final android.view.translation.TranslationSpec mTargetSpec = null;
    private final boolean mUiTranslationEnabled = false;
    @android.annotation.SystemApi
    public TranslationCapability(int p0, android.view.translation.TranslationSpec p1, android.view.translation.TranslationSpec p2, boolean p3, int p4) {}
    TranslationCapability(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public static java.lang.String modelStateToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public android.view.translation.TranslationSpec getSourceSpec() { return null; }
    public int getState() { return 0; }
    public int getSupportedTranslationFlags() { return 0; }
    public android.view.translation.TranslationSpec getTargetSpec() { return null; }
    public boolean isUiTranslationEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModelState {
    }
}
