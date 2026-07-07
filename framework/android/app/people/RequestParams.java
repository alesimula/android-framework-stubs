package android.app.people;

@android.annotation.SystemApi
public final class RequestParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.RequestParams> CREATOR = null;
    private final android.accounts.Account mAccount = null;
    private final java.util.List<java.lang.String> mMimeTypes = null;
    private final java.util.List<java.lang.Integer> mTargetIdTypes = null;
    private final java.util.List<java.lang.String> mTargetLabels = null;
    private RequestParams(android.app.people.RequestParams.Builder p0) {}
    private RequestParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.accounts.Account getAccount() { return null; }
    public java.util.List<java.lang.String> getMimeTypes() { return null; }
    public java.util.List<java.lang.Integer> getTargetIdTypes() { return null; }
    public java.util.List<java.lang.String> getTargetLabels() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private android.accounts.Account mAccount;
        private java.util.List<java.lang.String> mMimeTypes;
        private java.util.List<java.lang.Integer> mTargetIdTypes;
        private java.util.List<java.lang.String> mTargetLabels;
        public Builder() {}
        public android.app.people.RequestParams build() { return null; }
        public android.app.people.RequestParams.Builder setAccount(android.accounts.Account p0) { return null; }
        public android.app.people.RequestParams.Builder setMimeTypes(java.util.List<java.lang.String> p0) { return null; }
        public android.app.people.RequestParams.Builder setTargetIdTypes(java.util.List<java.lang.Integer> p0) { return null; }
        public android.app.people.RequestParams.Builder setTargetLabels(java.util.List<java.lang.String> p0) { return null; }
    }
}
