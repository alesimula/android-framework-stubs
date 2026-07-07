package android.app.wallpapereffectsgeneration;

@android.annotation.SystemApi
public final class CinematicEffectResponse implements android.os.Parcelable {
    public static final int CINEMATIC_EFFECT_STATUS_ANIMATION_FAILURE = 10;
    public static final int CINEMATIC_EFFECT_STATUS_CONTENT_TARGET_ERROR = 8;
    public static final int CINEMATIC_EFFECT_STATUS_CONTENT_TOO_FLAT = 9;
    public static final int CINEMATIC_EFFECT_STATUS_CONTENT_UNSUPPORTED = 7;
    public static final int CINEMATIC_EFFECT_STATUS_ERROR = 0;
    public static final int CINEMATIC_EFFECT_STATUS_FEATURE_DISABLED = 5;
    public static final int CINEMATIC_EFFECT_STATUS_IMAGE_FORMAT_NOT_SUITABLE = 6;
    public static final int CINEMATIC_EFFECT_STATUS_NOT_READY = 2;
    public static final int CINEMATIC_EFFECT_STATUS_OK = 1;
    public static final int CINEMATIC_EFFECT_STATUS_PENDING = 3;
    public static final int CINEMATIC_EFFECT_STATUS_TOO_MANY_REQUESTS = 4;
    public static final android.os.Parcelable.Creator<android.app.wallpapereffectsgeneration.CinematicEffectResponse> CREATOR = null;
    public static final int IMAGE_CONTENT_TYPE_LANDSCAPE = 2;
    public static final int IMAGE_CONTENT_TYPE_OTHER = 3;
    public static final int IMAGE_CONTENT_TYPE_PEOPLE_PORTRAIT = 1;
    public static final int IMAGE_CONTENT_TYPE_UNKNOWN = 0;
    private android.app.wallpapereffectsgeneration.CameraAttributes mEndKeyFrame;
    private int mImageContentType;
    private android.app.wallpapereffectsgeneration.CameraAttributes mStartKeyFrame;
    private int mStatusCode;
    private java.lang.String mTaskId;
    private java.util.List<android.app.wallpapereffectsgeneration.TexturedMesh> mTexturedMeshes;
    private CinematicEffectResponse(int p0, java.lang.String p1, int p2, java.util.List<android.app.wallpapereffectsgeneration.TexturedMesh> p3, android.app.wallpapereffectsgeneration.CameraAttributes p4, android.app.wallpapereffectsgeneration.CameraAttributes p5) {}
    private CinematicEffectResponse(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.wallpapereffectsgeneration.CameraAttributes getEndKeyFrame() { return null; }
    public int getImageContentType() { return 0; }
    public android.app.wallpapereffectsgeneration.CameraAttributes getStartKeyFrame() { return null; }
    public int getStatusCode() { return 0; }
    public java.lang.String getTaskId() { return null; }
    public java.util.List<android.app.wallpapereffectsgeneration.TexturedMesh> getTexturedMeshes() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private android.app.wallpapereffectsgeneration.CameraAttributes mEndKeyFrame;
        private int mImageContentType;
        private android.app.wallpapereffectsgeneration.CameraAttributes mStartKeyFrame;
        private int mStatusCode;
        private java.lang.String mTaskId;
        private java.util.List<android.app.wallpapereffectsgeneration.TexturedMesh> mTexturedMeshes;
        @android.annotation.SystemApi
        public Builder(int p0, java.lang.String p1) {}
        public android.app.wallpapereffectsgeneration.CinematicEffectResponse build() { return null; }
        public android.app.wallpapereffectsgeneration.CinematicEffectResponse.Builder setEndKeyFrame(android.app.wallpapereffectsgeneration.CameraAttributes p0) { return null; }
        public android.app.wallpapereffectsgeneration.CinematicEffectResponse.Builder setImageContentType(int p0) { return null; }
        public android.app.wallpapereffectsgeneration.CinematicEffectResponse.Builder setStartKeyFrame(android.app.wallpapereffectsgeneration.CameraAttributes p0) { return null; }
        public android.app.wallpapereffectsgeneration.CinematicEffectResponse.Builder setTexturedMeshes(java.util.List<android.app.wallpapereffectsgeneration.TexturedMesh> p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CinematicEffectStatusCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImageContentType {
    }
}
