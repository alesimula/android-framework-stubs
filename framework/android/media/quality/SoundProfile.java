package android.media.quality;

public final class SoundProfile implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.quality.SoundProfile> CREATOR = null;
    public static final int ERROR_DUPLICATE = 2;
    public static final int ERROR_INVALID_ARGUMENT = 3;
    public static final int ERROR_NOT_ALLOWLISTED = 4;
    public static final int ERROR_NO_PERMISSION = 1;
    public static final int ERROR_UNKNOWN = 0;
    public static final java.lang.String NAME_DEFAULT = "default";
    public static final java.lang.String NAME_MOVIE = "movie";
    public static final java.lang.String NAME_MUSIC = "music";
    public static final java.lang.String NAME_NEWS = "news";
    public static final java.lang.String NAME_SPORTS = "sports";
    public static final java.lang.String NAME_STANDARD = "standard";
    public static final java.lang.String NAME_USER = "user";
    public static final java.lang.String NAME_VIVID = "vivid";
    public static final int TYPE_APPLICATION = 2;
    public static final int TYPE_SYSTEM = 1;
    private final android.media.quality.SoundProfileHandle mHandle = null;
    private java.lang.String mId;
    private final java.lang.String mInputId = null;
    private final java.lang.String mName = null;
    private final java.lang.String mPackageName = null;
    private final android.os.PersistableBundle mParams = null;
    private final int mType = 0;
    private SoundProfile(android.os.Parcel p0) {}
    public SoundProfile(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, android.os.PersistableBundle p5, android.media.quality.SoundProfileHandle p6) {}
    public int describeContents() { return 0; }
    public android.media.quality.SoundProfileHandle getHandle() { return null; }
    public java.lang.String getInputId() { return null; }
    public java.lang.String getName() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.os.PersistableBundle getParameters() { return null; }
    public java.lang.String getProfileId() { return null; }
    public int getProfileType() { return 0; }
    public void setProfileId(java.lang.String p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.media.quality.SoundProfileHandle mHandle;
        private java.lang.String mId;
        private java.lang.String mInputId;
        private java.lang.String mName;
        private java.lang.String mPackageName;
        private android.os.PersistableBundle mParams;
        private int mType;
        public Builder(android.media.quality.SoundProfile p0) {}
        public Builder(java.lang.String p0) {}
        public android.media.quality.SoundProfile build() { return null; }
        public android.media.quality.SoundProfile.Builder setHandle(android.media.quality.SoundProfileHandle p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.SoundProfile.Builder setInputId(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.SoundProfile.Builder setPackageName(java.lang.String p0) { return null; }
        public android.media.quality.SoundProfile.Builder setParameters(android.os.PersistableBundle p0) { return null; }
        public android.media.quality.SoundProfile.Builder setProfileId(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.SoundProfile.Builder setProfileType(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProfileName {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProfileType {
    }
}
