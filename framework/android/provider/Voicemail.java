package android.provider;

public class Voicemail implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.provider.Voicemail> CREATOR = null;
    private final java.lang.Long mDuration = null;
    private final java.lang.Boolean mHasContent = null;
    private final java.lang.Long mId = null;
    private final java.lang.Boolean mIsRead = null;
    private final java.lang.String mNumber = null;
    private final java.lang.String mProviderData = null;
    private final java.lang.String mSource = null;
    private final java.lang.Long mTimestamp = null;
    private final java.lang.String mTranscription = null;
    private final android.net.Uri mUri = null;
    private Voicemail(android.os.Parcel p0) {}
    private Voicemail(java.lang.Long p0, java.lang.String p1, android.telecom.PhoneAccountHandle p2, java.lang.Long p3, java.lang.Long p4, java.lang.String p5, java.lang.String p6, android.net.Uri p7, java.lang.Boolean p8, java.lang.Boolean p9, java.lang.String p10) {}
    public static android.provider.Voicemail.Builder createForInsertion(long p0, java.lang.String p1) { return null; }
    public static android.provider.Voicemail.Builder createForUpdate(long p0, java.lang.String p1) { return null; }
    public int describeContents() { return 0; }
    public long getDuration() { return 0L; }
    public long getId() { return 0L; }
    public java.lang.String getNumber() { return null; }
    public android.telecom.PhoneAccountHandle getPhoneAccount() { return null; }
    public java.lang.String getSourceData() { return null; }
    public java.lang.String getSourcePackage() { return null; }
    public long getTimestampMillis() { return 0L; }
    public java.lang.String getTranscription() { return null; }
    public android.net.Uri getUri() { return null; }
    public boolean hasContent() { return false; }
    public boolean isRead() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private java.lang.Long mBuilderDuration;
        private boolean mBuilderHasContent;
        private java.lang.Long mBuilderId;
        private java.lang.Boolean mBuilderIsRead;
        private java.lang.String mBuilderNumber;
        private java.lang.String mBuilderSourceData;
        private java.lang.String mBuilderSourcePackage;
        private java.lang.Long mBuilderTimestamp;
        private java.lang.String mBuilderTranscription;
        private android.net.Uri mBuilderUri;
        private Builder() {}
        public android.provider.Voicemail build() { return null; }
        public android.provider.Voicemail.Builder setDuration(long p0) { return null; }
        public android.provider.Voicemail.Builder setHasContent(boolean p0) { return null; }
        public android.provider.Voicemail.Builder setId(long p0) { return null; }
        public android.provider.Voicemail.Builder setIsRead(boolean p0) { return null; }
        public android.provider.Voicemail.Builder setNumber(java.lang.String p0) { return null; }
        public android.provider.Voicemail.Builder setPhoneAccount(android.telecom.PhoneAccountHandle p0) { return null; }
        public android.provider.Voicemail.Builder setSourceData(java.lang.String p0) { return null; }
        public android.provider.Voicemail.Builder setSourcePackage(java.lang.String p0) { return null; }
        public android.provider.Voicemail.Builder setTimestamp(long p0) { return null; }
        public android.provider.Voicemail.Builder setTranscription(java.lang.String p0) { return null; }
        public android.provider.Voicemail.Builder setUri(android.net.Uri p0) { return null; }
    }
}
