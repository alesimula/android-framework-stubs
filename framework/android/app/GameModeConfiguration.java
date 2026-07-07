package android.app;

@android.annotation.SystemApi
public final class GameModeConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.GameModeConfiguration> CREATOR = null;
    public static final int FPS_OVERRIDE_NONE = 0;
    private final int mFpsOverride = 0;
    private final float mScalingFactor = 0.0f;
    GameModeConfiguration(float p0, int p1) {}
    GameModeConfiguration(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getFpsOverride() { return 0; }
    public float getScalingFactor() { return 0.0f; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private int mFpsOverride;
        private float mScalingFactor;
        public Builder() {}
        public Builder(android.app.GameModeConfiguration p0) {}
        public android.app.GameModeConfiguration build() { return null; }
        public android.app.GameModeConfiguration.Builder setFpsOverride(int p0) { return null; }
        public android.app.GameModeConfiguration.Builder setScalingFactor(float p0) { return null; }
    }
}
