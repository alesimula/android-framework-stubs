package android.speech;

public final class RecognitionSupport implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.speech.RecognitionSupport> CREATOR = null;
    private java.util.List<java.lang.String> mInstalledOnDeviceLanguages;
    private java.util.List<java.lang.String> mOnlineLanguages;
    private java.util.List<java.lang.String> mPendingOnDeviceLanguages;
    private java.util.List<java.lang.String> mSupportedOnDeviceLanguages;
    RecognitionSupport(android.os.Parcel p0) {}
    RecognitionSupport(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<java.lang.String> getInstalledOnDeviceLanguages() { return null; }
    public java.util.List<java.lang.String> getOnlineLanguages() { return null; }
    public java.util.List<java.lang.String> getPendingOnDeviceLanguages() { return null; }
    public java.util.List<java.lang.String> getSupportedOnDeviceLanguages() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mBuilderFieldsSet;
        private java.util.List<java.lang.String> mInstalledOnDeviceLanguages;
        private java.util.List<java.lang.String> mOnlineLanguages;
        private java.util.List<java.lang.String> mPendingOnDeviceLanguages;
        private java.util.List<java.lang.String> mSupportedOnDeviceLanguages;
        public Builder() {}
        private void checkNotUsed() {}
        public android.speech.RecognitionSupport.Builder addInstalledOnDeviceLanguage(java.lang.String p0) { return null; }
        public android.speech.RecognitionSupport.Builder addOnlineLanguage(java.lang.String p0) { return null; }
        public android.speech.RecognitionSupport.Builder addPendingOnDeviceLanguage(java.lang.String p0) { return null; }
        public android.speech.RecognitionSupport.Builder addSupportedOnDeviceLanguage(java.lang.String p0) { return null; }
        public android.speech.RecognitionSupport build() { return null; }
        public android.speech.RecognitionSupport.Builder setInstalledOnDeviceLanguages(java.util.List<java.lang.String> p0) { return null; }
        public android.speech.RecognitionSupport.Builder setOnlineLanguages(java.util.List<java.lang.String> p0) { return null; }
        public android.speech.RecognitionSupport.Builder setPendingOnDeviceLanguages(java.util.List<java.lang.String> p0) { return null; }
        public android.speech.RecognitionSupport.Builder setSupportedOnDeviceLanguages(java.util.List<java.lang.String> p0) { return null; }
    }
}
