package android.service.autofill;

public final class SaveInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.autofill.SaveInfo> CREATOR = null;
    public static final int FLAG_DELAY_SAVE = 4;
    public static final int FLAG_DONT_SAVE_ON_FINISH = 2;
    public static final int FLAG_SAVE_ON_ALL_VIEWS_INVISIBLE = 1;
    public static final int NEGATIVE_BUTTON_STYLE_CANCEL = 0;
    public static final int NEGATIVE_BUTTON_STYLE_NEVER = 2;
    public static final int NEGATIVE_BUTTON_STYLE_REJECT = 1;
    public static final int POSITIVE_BUTTON_STYLE_CONTINUE = 1;
    public static final int POSITIVE_BUTTON_STYLE_SAVE = 0;
    public static final int SAVE_DATA_TYPE_ADDRESS = 2;
    public static final int SAVE_DATA_TYPE_CREDIT_CARD = 4;
    public static final int SAVE_DATA_TYPE_DEBIT_CARD = 32;
    public static final int SAVE_DATA_TYPE_EMAIL_ADDRESS = 16;
    public static final int SAVE_DATA_TYPE_GENERIC = 0;
    public static final int SAVE_DATA_TYPE_GENERIC_CARD = 128;
    public static final int SAVE_DATA_TYPE_PASSWORD = 1;
    public static final int SAVE_DATA_TYPE_PAYMENT_CARD = 64;
    public static final int SAVE_DATA_TYPE_USERNAME = 8;
    private final android.service.autofill.CustomDescription mCustomDescription = null;
    private final java.lang.CharSequence mDescription = null;
    private final int mFlags = 0;
    private final android.content.IntentSender mNegativeActionListener = null;
    private final int mNegativeButtonStyle = 0;
    private final android.view.autofill.AutofillId[] mOptionalIds = null;
    private final int mPositiveButtonStyle = 0;
    private final android.view.autofill.AutofillId[] mRequiredIds = null;
    private final android.service.autofill.InternalSanitizer[] mSanitizerKeys = null;
    private final android.view.autofill.AutofillId[][] mSanitizerValues = null;
    private final android.view.autofill.AutofillId mTriggerId = null;
    private final int mType = 0;
    private final android.service.autofill.InternalValidator mValidator = null;
    private SaveInfo(int p0, int p1, int p2, android.content.IntentSender p3, android.view.autofill.AutofillId[] p4, android.view.autofill.AutofillId[] p5, java.lang.CharSequence p6, int p7, android.service.autofill.CustomDescription p8, android.service.autofill.InternalValidator p9, android.service.autofill.InternalSanitizer[] p10, android.view.autofill.AutofillId[][] p11, android.view.autofill.AutofillId p12) {}
    private SaveInfo(android.service.autofill.SaveInfo.Builder p0) {}
    public static android.service.autofill.SaveInfo copy(android.service.autofill.SaveInfo p0, android.view.autofill.AutofillId[] p1) { return null; }
    public int describeContents() { return 0; }
    public android.service.autofill.CustomDescription getCustomDescription() { return null; }
    public java.lang.CharSequence getDescription() { return null; }
    public int getFlags() { return 0; }
    public android.content.IntentSender getNegativeActionListener() { return null; }
    public int getNegativeActionStyle() { return 0; }
    public android.view.autofill.AutofillId[] getOptionalIds() { return null; }
    public int getPositiveActionStyle() { return 0; }
    public android.view.autofill.AutofillId[] getRequiredIds() { return null; }
    public android.service.autofill.InternalSanitizer[] getSanitizerKeys() { return null; }
    public android.view.autofill.AutofillId[][] getSanitizerValues() { return null; }
    public android.view.autofill.AutofillId getTriggerId() { return null; }
    public int getType() { return 0; }
    public android.service.autofill.InternalValidator getValidator() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.service.autofill.CustomDescription mCustomDescription;
        private java.lang.CharSequence mDescription;
        private boolean mDestroyed;
        private int mFlags;
        private android.content.IntentSender mNegativeActionListener;
        private int mNegativeButtonStyle;
        private android.view.autofill.AutofillId[] mOptionalIds;
        private int mPositiveButtonStyle;
        private final android.view.autofill.AutofillId[] mRequiredIds = null;
        private android.util.ArraySet<android.view.autofill.AutofillId> mSanitizerIds;
        private android.util.ArrayMap<android.service.autofill.InternalSanitizer, android.view.autofill.AutofillId[]> mSanitizers;
        private android.view.autofill.AutofillId mTriggerId;
        private final int mType = 0;
        private android.service.autofill.InternalValidator mValidator;
        public Builder(int p0) {}
        public Builder(int p0, android.view.autofill.AutofillId[] p1) {}
        private void throwIfDestroyed() {}
        public android.service.autofill.SaveInfo.Builder addSanitizer(android.service.autofill.Sanitizer p0, android.view.autofill.AutofillId... p1) { return null; }
        public android.service.autofill.SaveInfo build() { return null; }
        public android.service.autofill.SaveInfo.Builder setCustomDescription(android.service.autofill.CustomDescription p0) { return null; }
        public android.service.autofill.SaveInfo.Builder setDescription(java.lang.CharSequence p0) { return null; }
        public android.service.autofill.SaveInfo.Builder setFlags(int p0) { return null; }
        public android.service.autofill.SaveInfo.Builder setNegativeAction(int p0, android.content.IntentSender p1) { return null; }
        public android.service.autofill.SaveInfo.Builder setOptionalIds(android.view.autofill.AutofillId[] p0) { return null; }
        public android.service.autofill.SaveInfo.Builder setPositiveAction(int p0) { return null; }
        public android.service.autofill.SaveInfo.Builder setTriggerId(android.view.autofill.AutofillId p0) { return null; }
        public android.service.autofill.SaveInfo.Builder setValidator(android.service.autofill.Validator p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface NegativeButtonStyle {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PositiveButtonStyle {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface SaveDataType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface SaveInfoFlags {
    }
}
