package android.content.pm;

public final class LauncherUserInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.LauncherUserInfo> CREATOR = null;
    public static final java.lang.String PRIVATE_SPACE_ENTRYPOINT_HIDDEN = "private_space_entrypoint_hidden";
    private final android.os.Bundle mUserConfig = null;
    private final int mUserSerialNumber = 0;
    private final java.lang.String mUserType = null;
    private LauncherUserInfo(android.os.Parcel p0) {}
    private LauncherUserInfo(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public int describeContents() { return 0; }
    public android.os.Bundle getUserConfig() { return null; }
    public int getUserSerialNumber() { return 0; }
    public java.lang.String getUserType() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.os.Bundle mUserConfig = null;
        private final int mUserSerialNumber = 0;
        private final java.lang.String mUserType = null;
        public Builder(java.lang.String p0, int p1) {}
        public Builder(java.lang.String p0, int p1, android.os.Bundle p2) {}
        public android.content.pm.LauncherUserInfo build() { return null; }
    }
}
