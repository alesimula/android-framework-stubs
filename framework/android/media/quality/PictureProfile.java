package android.media.quality;

public final class PictureProfile implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.quality.PictureProfile> CREATOR = null;
    public static final int ERROR_DUPLICATE = 2;
    public static final int ERROR_INVALID_ARGUMENT = 3;
    public static final int ERROR_NOT_ALLOWLISTED = 4;
    public static final int ERROR_NO_PERMISSION = 1;
    public static final int ERROR_UNKNOWN = 0;
    public static final java.lang.String NAME_DEFAULT = "default";
    public static final java.lang.String NAME_ENERGY_SAVING = "energy_saving";
    public static final java.lang.String NAME_GAME = "game";
    public static final java.lang.String NAME_MOVIE = "movie";
    public static final java.lang.String NAME_SPORTS = "sports";
    public static final java.lang.String NAME_STANDARD = "standard";
    public static final java.lang.String NAME_UNKNOWN = "unknown";
    public static final java.lang.String NAME_USER = "user";
    public static final java.lang.String NAME_VIVID = "vivid";
    public static final java.lang.String STATUS_DOLBY_VISION = "DOLBY_VISION";
    public static final java.lang.String STATUS_FMM_DOLBY = "FMM_DOLBY";
    public static final java.lang.String STATUS_FMM_HDR10 = "FMM_HDR10";
    public static final java.lang.String STATUS_FMM_HDR10_PLUS = "FMM_HDR10_PLUS";
    public static final java.lang.String STATUS_FMM_HDR_VIVID = "FMM_HDR_VIVID";
    public static final java.lang.String STATUS_FMM_HLG = "FMM_HLG";
    public static final java.lang.String STATUS_FMM_SDR = "FMM_SDR";
    public static final java.lang.String STATUS_FMM_TCH = "FMM_TCH";
    public static final java.lang.String STATUS_HDR10 = "HDR10";
    public static final java.lang.String STATUS_HDR10_PLUS = "HDR10_PLUS";
    public static final java.lang.String STATUS_HDR_VIVID = "HDR_VIVID";
    public static final java.lang.String STATUS_HLG = "HLG";
    public static final java.lang.String STATUS_IMAX_HDR10 = "IMAX_HDR10";
    public static final java.lang.String STATUS_IMAX_HDR10_PLUS = "IMAX_HDR10_PLUS";
    public static final java.lang.String STATUS_IMAX_SDR = "IMAX_SDR";
    public static final java.lang.String STATUS_SDR = "SDR";
    public static final java.lang.String STATUS_TCH = "TCH";
    public static final java.lang.String STATUS_UNKNOWN = "UNKNOWN";
    public static final int TYPE_APPLICATION = 2;
    public static final int TYPE_SYSTEM = 1;
    private final android.media.quality.PictureProfileHandle mHandle = null;
    private java.lang.String mId;
    private final java.lang.String mInputId = null;
    private final java.lang.String mName = null;
    private final java.lang.String mPackageName = null;
    private final android.os.PersistableBundle mParams = null;
    private final java.util.Map<java.lang.String, android.os.PersistableBundle> mStreamStatusVariants = null;
    private final int mType = 0;
    private PictureProfile(android.os.Parcel p0) {}
    public PictureProfile(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, android.os.PersistableBundle p5, android.media.quality.PictureProfileHandle p6) {}
    public PictureProfile(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, android.os.PersistableBundle p5, android.media.quality.PictureProfileHandle p6, java.util.Map<java.lang.String, android.os.PersistableBundle> p7) {}
    public static android.media.quality.PictureProfile copyFrom(android.media.quality.PictureProfile p0) { return null; }
    public void addStringParameter(java.lang.String p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public android.media.quality.PictureProfileHandle getHandle() { return null; }
    public java.lang.String getInputId() { return null; }
    public java.lang.String getName() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.os.PersistableBundle getParameters() { return null; }
    public java.lang.String getProfileId() { return null; }
    public int getProfileType() { return 0; }
    public java.util.Map<java.lang.String, android.os.PersistableBundle> getStreamStatusVariants() { return null; }
    public void setProfileId(java.lang.String p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.media.quality.PictureProfileHandle mHandle;
        private java.lang.String mId;
        private java.lang.String mInputId;
        private java.lang.String mName;
        private java.lang.String mPackageName;
        private android.os.PersistableBundle mParams;
        private java.util.Map<java.lang.String, android.os.PersistableBundle> mStreamStatusVariants;
        private int mType;
        public Builder(android.media.quality.PictureProfile p0) {}
        public Builder(java.lang.String p0) {}
        public android.media.quality.PictureProfile.Builder addStreamStatusVariant(java.lang.String p0, android.os.PersistableBundle p1) { return null; }
        public android.media.quality.PictureProfile build() { return null; }
        public android.media.quality.PictureProfile.Builder setHandle(android.media.quality.PictureProfileHandle p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.PictureProfile.Builder setInputId(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.PictureProfile.Builder setPackageName(java.lang.String p0) { return null; }
        public android.media.quality.PictureProfile.Builder setParameters(android.os.PersistableBundle p0) { return null; }
        public android.media.quality.PictureProfile.Builder setProfileId(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        public android.media.quality.PictureProfile.Builder setProfileType(int p0) { return null; }
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
