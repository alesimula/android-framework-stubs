package android.media.projection;

public final class MediaProjectionConfig implements android.os.Parcelable {
    public static final int CAPTURE_REGION_FIXED_DISPLAY = 1;
    public static final int CAPTURE_REGION_USER_CHOICE = 0;
    public static final android.os.Parcelable.Creator<android.media.projection.MediaProjectionConfig> CREATOR = null;
    public static final int DEFAULT_PROJECTION_SOURCES = 10;
    private static final int[] PROJECTION_SOURCES = null;
    private static final java.lang.String[] PROJECTION_SOURCES_STRING = null;
    public static final int PROJECTION_SOURCE_APP = 8;
    public static final int PROJECTION_SOURCE_APP_CONTENT = 16;
    public static final int PROJECTION_SOURCE_DISPLAY = 2;
    public static final int PROJECTION_SOURCE_DISPLAY_REGION = 4;
    private static final int VALID_PROJECTION_SOURCES = Integer.valueOf(0);
    private final boolean mAudioRequested = false;
    private final int mDisplayToCapture = 0;
    private final int mInitialSelection = 0;
    private final boolean mOwnAppContentProvided = false;
    private final int mProjectionSources = 0;
    @java.lang.Deprecated
    private int mRegionToCapture;
    private final java.lang.String mRequesterHint = null;
    @java.lang.Deprecated
    private MediaProjectionConfig(int p0) {}
    private MediaProjectionConfig(int p0, java.lang.String p1, int p2, int p3, boolean p4, boolean p5) {}
    MediaProjectionConfig(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private static java.lang.String captureRegionToString(int p0) { return null; }
    public static android.media.projection.MediaProjectionConfig createConfigForDefaultDisplay() { return null; }
    public static android.media.projection.MediaProjectionConfig createConfigForUserChoice() { return null; }
    private static int createValidSourcesMask() { return 0; }
    private static java.lang.String projectionSourceToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getDisplayToCapture() { return 0; }
    public int getInitiallySelectedSource() { return 0; }
    public int getProjectionSources() { return 0; }
    public int getRegionToCapture() { return 0; }
    public java.lang.CharSequence getRequesterHint() { return null; }
    public int hashCode() { return 0; }
    public boolean isAudioRequested() { return false; }
    public boolean isOwnAppContentProvided() { return false; }
    public boolean isSourceEnabled(int p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mAudioRequested;
        private int mInitialSelection;
        private int mOptions;
        private boolean mOwnAppContentProvided;
        private java.lang.String mRequesterHint;
        public Builder() {}
        public android.media.projection.MediaProjectionConfig build() { return null; }
        public android.media.projection.MediaProjectionConfig.Builder setAudioRequested(boolean p0) { return null; }
        public android.media.projection.MediaProjectionConfig.Builder setInitiallySelectedSource(int p0) { return null; }
        public android.media.projection.MediaProjectionConfig.Builder setOwnAppContentProvided(boolean p0) { return null; }
        public android.media.projection.MediaProjectionConfig.Builder setRequesterHint(java.lang.String p0) { return null; }
        public android.media.projection.MediaProjectionConfig.Builder setSourceEnabled(int p0, boolean p1) { return null; }
    }

    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CaptureRegion {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MediaProjectionSource {
    }
}
