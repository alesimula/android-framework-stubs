package android.app;

@android.annotation.SystemApi
public final class GameModeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.GameModeInfo> CREATOR = null;
    private final int mActiveGameMode = 0;
    private final int[] mAvailableGameModes = null;
    private final java.util.Map<java.lang.Integer, android.app.GameModeConfiguration> mConfigMap = null;
    private final boolean mIsDownscalingAllowed = false;
    private final boolean mIsFpsOverrideAllowed = false;
    private final int[] mOverriddenGameModes = null;
    public GameModeInfo(int p0, int[] p1) {}
    private GameModeInfo(int p0, int[] p1, int[] p2, boolean p3, boolean p4, java.util.Map<java.lang.Integer, android.app.GameModeConfiguration> p5) {}
    public GameModeInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getActiveGameMode() { return 0; }
    public int[] getAvailableGameModes() { return null; }
    public android.app.GameModeConfiguration getGameModeConfiguration(int p0) { return null; }
    public int[] getOverriddenGameModes() { return null; }
    public boolean isDownscalingAllowed() { return false; }
    public boolean isFpsOverrideAllowed() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private int mActiveGameMode;
        private int[] mAvailableGameModes;
        private java.util.Map<java.lang.Integer, android.app.GameModeConfiguration> mConfigMap;
        private boolean mIsDownscalingAllowed;
        private boolean mIsFpsOverrideAllowed;
        private int[] mOverriddenGameModes;
        public Builder() {}
        public android.app.GameModeInfo build() { return null; }
        public android.app.GameModeInfo.Builder setActiveGameMode(int p0) { return null; }
        public android.app.GameModeInfo.Builder setAvailableGameModes(int[] p0) { return null; }
        public android.app.GameModeInfo.Builder setDownscalingAllowed(boolean p0) { return null; }
        public android.app.GameModeInfo.Builder setFpsOverrideAllowed(boolean p0) { return null; }
        public android.app.GameModeInfo.Builder setGameModeConfiguration(int p0, android.app.GameModeConfiguration p1) { return null; }
        public android.app.GameModeInfo.Builder setOverriddenGameModes(int[] p0) { return null; }
    }
}
