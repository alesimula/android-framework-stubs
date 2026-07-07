package android.os;

@android.annotation.SystemApi
public final class NewUserRequest {
    private final java.lang.String mAccountName = null;
    private final android.os.PersistableBundle mAccountOptions = null;
    private final java.lang.String mAccountType = null;
    private final boolean mAdmin = false;
    private final boolean mEphemeral = false;
    private final java.lang.String mName = null;
    private final android.graphics.Bitmap mUserIcon = null;
    private final java.lang.String mUserType = null;
    private NewUserRequest(android.os.NewUserRequest.Builder p0) {}
    public java.lang.String getAccountName() { return null; }
    public android.os.PersistableBundle getAccountOptions() { return null; }
    public java.lang.String getAccountType() { return null; }
    int getFlags() { return 0; }
    public java.lang.String getName() { return null; }
    public android.graphics.Bitmap getUserIcon() { return null; }
    public java.lang.String getUserType() { return null; }
    public boolean isAdmin() { return false; }
    public boolean isEphemeral() { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private java.lang.String mAccountName;
        private android.os.PersistableBundle mAccountOptions;
        private java.lang.String mAccountType;
        private boolean mAdmin;
        private boolean mEphemeral;
        private java.lang.String mName;
        private android.graphics.Bitmap mUserIcon;
        private java.lang.String mUserType;
        public Builder() {}
        private void checkIfPropertiesAreCompatible() {}
        public android.os.NewUserRequest build() { return null; }
        public android.os.NewUserRequest.Builder setAccountName(java.lang.String p0) { return null; }
        public android.os.NewUserRequest.Builder setAccountOptions(android.os.PersistableBundle p0) { return null; }
        public android.os.NewUserRequest.Builder setAccountType(java.lang.String p0) { return null; }
        public android.os.NewUserRequest.Builder setAdmin() { return null; }
        public android.os.NewUserRequest.Builder setEphemeral() { return null; }
        public android.os.NewUserRequest.Builder setName(java.lang.String p0) { return null; }
        public android.os.NewUserRequest.Builder setUserIcon(android.graphics.Bitmap p0) { return null; }
        public android.os.NewUserRequest.Builder setUserType(java.lang.String p0) { return null; }
    }
}
