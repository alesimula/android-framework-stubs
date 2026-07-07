package android.media;

@android.annotation.SystemApi
public final class FadeManagerConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.FadeManagerConfiguration> CREATOR = null;
    private static final long DEFAULT_FADE_IN_DURATION_MS = 1000L;
    private static final long DEFAULT_FADE_OUT_DURATION_MS = 2000L;
    public static final long DURATION_NOT_SET = 0L;
    public static final int FADE_STATE_DISABLED = 0;
    public static final int FADE_STATE_ENABLED_DEFAULT = 1;
    public static final java.lang.String TAG = "FadeManagerConfiguration";
    public static final int VOLUME_SHAPER_SYSTEM_FADE_ID = 2;
    private final android.util.ArrayMap<android.media.AudioAttributes, android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper> mAttrToFadeWrapperMap = null;
    private final long mFadeInDelayForOffendersMillis = 0L;
    private final long mFadeInDurationMillis = 0L;
    private final long mFadeOutDurationMillis = 0L;
    private final int mFadeState = 0;
    private final android.util.IntArray mFadeableUsages = null;
    private final java.util.List<android.media.AudioAttributes> mUnfadeableAudioAttributes = null;
    private final android.util.IntArray mUnfadeableContentTypes = null;
    private final android.util.IntArray mUnfadeablePlayerTypes = null;
    private final android.util.IntArray mUnfadeableUids = null;
    private final android.util.SparseArray<android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper> mUsageToFadeWrapperMap = null;
    private FadeManagerConfiguration(int p0, long p1, long p2, long p3, android.util.SparseArray<android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper> p4, android.util.ArrayMap<android.media.AudioAttributes, android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper> p5, android.util.IntArray p6, android.util.IntArray p7, android.util.IntArray p8, android.util.IntArray p9, java.util.List<android.media.AudioAttributes> p10) {}
    FadeManagerConfiguration(android.os.Parcel p0) {}
    private static java.util.List<java.lang.Integer> convertIntArrayToIntegerList(android.util.IntArray p0) { return null; }
    private static android.util.IntArray convertIntegerListToIntArray(java.util.List<java.lang.Integer> p0) { return null; }
    private void ensureFadingIsEnabled() {}
    public static java.lang.String fadeStateToString(int p0) { return null; }
    private java.util.List<android.media.AudioAttributes> getAudioAttributesInternal() { return null; }
    public static long getDefaultFadeInDurationMillis() { return 0L; }
    public static long getDefaultFadeOutDurationMillis() { return 0L; }
    private long getDurationForVolumeShaperConfig(android.media.VolumeShaper.Configuration p0) { return 0L; }
    private android.media.VolumeShaper.Configuration getVolumeShaperConfigFromWrapper(android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper p0, boolean p1) { return null; }
    private static boolean isUsageValid(int p0) { return false; }
    private static void validateUsage(int p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.media.AudioAttributes> getAudioAttributesWithVolumeShaperConfigs() { return null; }
    public long getFadeInDelayForOffenders() { return 0L; }
    public long getFadeInDurationForAudioAttributes(android.media.AudioAttributes p0) { return 0L; }
    public long getFadeInDurationForUsage(int p0) { return 0L; }
    public android.media.VolumeShaper.Configuration getFadeInVolumeShaperConfigForAudioAttributes(android.media.AudioAttributes p0) { return null; }
    public android.media.VolumeShaper.Configuration getFadeInVolumeShaperConfigForUsage(int p0) { return null; }
    public long getFadeOutDurationForAudioAttributes(android.media.AudioAttributes p0) { return 0L; }
    public long getFadeOutDurationForUsage(int p0) { return 0L; }
    public android.media.VolumeShaper.Configuration getFadeOutVolumeShaperConfigForAudioAttributes(android.media.AudioAttributes p0) { return null; }
    public android.media.VolumeShaper.Configuration getFadeOutVolumeShaperConfigForUsage(int p0) { return null; }
    public int getFadeState() { return 0; }
    public java.util.List<java.lang.Integer> getFadeableUsages() { return null; }
    public java.util.List<android.media.AudioAttributes> getUnfadeableAudioAttributes() { return null; }
    public java.util.List<java.lang.Integer> getUnfadeableContentTypes() { return null; }
    public java.util.List<java.lang.Integer> getUnfadeablePlayerTypes() { return null; }
    public java.util.List<java.lang.Integer> getUnfadeableUids() { return null; }
    public int hashCode() { return 0; }
    public boolean isAudioAttributesUnfadeable(android.media.AudioAttributes p0) { return false; }
    public boolean isContentTypeUnfadeable(int p0) { return false; }
    public boolean isFadeEnabled() { return false; }
    public boolean isPlayerTypeUnfadeable(int p0) { return false; }
    public boolean isUidUnfadeable(int p0) { return false; }
    public boolean isUsageFadeable(int p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private static final long DEFAULT_DELAY_FADE_IN_OFFENDERS_MS = 2000L;
        private static final android.util.IntArray DEFAULT_FADEABLE_USAGES = null;
        private static final android.util.IntArray DEFAULT_UNFADEABLE_CONTENT_TYPES = null;
        private static final android.util.IntArray DEFAULT_UNFADEABLE_PLAYER_TYPES = null;
        private static final int INVALID_INDEX = -1;
        private static final long IS_BUILDER_USED_FIELD_SET = 1L;
        private static final long IS_FADEABLE_USAGES_FIELD_SET = 2L;
        private static final long IS_UNFADEABLE_CONTENT_TYPE_FIELD_SET = 4L;
        private android.util.ArrayMap<android.media.AudioAttributes, android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper> mAttrToFadeWrapperMap;
        private long mBuilderFieldsSet;
        private long mFadeInDelayForOffendersMillis;
        private long mFadeInDurationMillis;
        private long mFadeOutDurationMillis;
        private int mFadeState;
        private android.util.IntArray mFadeableUsages;
        private java.util.List<android.media.AudioAttributes> mUnfadeableAudioAttributes;
        private android.util.IntArray mUnfadeableContentTypes;
        private android.util.IntArray mUnfadeablePlayerTypes;
        private android.util.IntArray mUnfadeableUids;
        private android.util.SparseArray<android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper> mUsageToFadeWrapperMap;
        public Builder() {}
        public Builder(long p0, long p1) {}
        public Builder(android.media.FadeManagerConfiguration p0) {}
        private boolean checkNotSet(long p0) { return false; }
        private void cleanupInactiveWrapperEntries(int p0) {}
        private void cleanupInactiveWrapperEntries(android.media.AudioAttributes p0) {}
        private void copyUsageToFadeWrapperMapInternal(android.util.SparseArray<android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper> p0) {}
        private android.media.VolumeShaper.Configuration createVolShaperConfigForDuration(long p0, boolean p1) { return null; }
        private android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper getFadeVolShaperConfigWrapperForAttr(android.media.AudioAttributes p0) { return null; }
        private android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper getFadeVolShaperConfigWrapperForUsage(int p0) { return null; }
        private static boolean isGeneric(android.media.AudioAttributes p0) { return false; }
        private void setFlag(long p0) {}
        private void setMissingVolShaperConfigsForWrapper(android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper p0) {}
        private void setVolShaperConfigsForUsages(android.util.IntArray p0) {}
        private void validateContentType(int p0) {}
        private void validateContentTypes(java.util.List<java.lang.Integer> p0) {}
        private void validateFadeConfigurations() {}
        private void validateFadeState(int p0) {}
        private void validateFadeVolumeShaperConfigsWrappers() {}
        private void validateFadeableUsages() {}
        private void validateUnfadeableAudioAttributes() {}
        private void validateUsages(java.util.List<java.lang.Integer> p0) {}
        public android.media.FadeManagerConfiguration.Builder addFadeableUsage(int p0) { return null; }
        public android.media.FadeManagerConfiguration.Builder addUnfadeableAudioAttributes(android.media.AudioAttributes p0) { return null; }
        public android.media.FadeManagerConfiguration.Builder addUnfadeableContentType(int p0) { return null; }
        public android.media.FadeManagerConfiguration.Builder addUnfadeableUid(int p0) { return null; }
        public android.media.FadeManagerConfiguration build() { return null; }
        public android.media.FadeManagerConfiguration.Builder clearFadeableUsages() { return null; }
        public android.media.FadeManagerConfiguration.Builder clearUnfadeableAudioAttributes() { return null; }
        public android.media.FadeManagerConfiguration.Builder clearUnfadeableContentTypes() { return null; }
        public android.media.FadeManagerConfiguration.Builder clearUnfadeableUids() { return null; }
        public android.media.FadeManagerConfiguration.Builder setFadeInDelayForOffenders(long p0) { return null; }
        public android.media.FadeManagerConfiguration.Builder setFadeInDurationForAudioAttributes(android.media.AudioAttributes p0, long p1) { return null; }
        public android.media.FadeManagerConfiguration.Builder setFadeInDurationForUsage(int p0, long p1) { return null; }
        public android.media.FadeManagerConfiguration.Builder setFadeInVolumeShaperConfigForAudioAttributes(android.media.AudioAttributes p0, android.media.VolumeShaper.Configuration p1) { return null; }
        public android.media.FadeManagerConfiguration.Builder setFadeInVolumeShaperConfigForUsage(int p0, android.media.VolumeShaper.Configuration p1) { return null; }
        public android.media.FadeManagerConfiguration.Builder setFadeOutDurationForAudioAttributes(android.media.AudioAttributes p0, long p1) { return null; }
        public android.media.FadeManagerConfiguration.Builder setFadeOutDurationForUsage(int p0, long p1) { return null; }
        public android.media.FadeManagerConfiguration.Builder setFadeOutVolumeShaperConfigForAudioAttributes(android.media.AudioAttributes p0, android.media.VolumeShaper.Configuration p1) { return null; }
        public android.media.FadeManagerConfiguration.Builder setFadeOutVolumeShaperConfigForUsage(int p0, android.media.VolumeShaper.Configuration p1) { return null; }
        public android.media.FadeManagerConfiguration.Builder setFadeState(int p0) { return null; }
        public android.media.FadeManagerConfiguration.Builder setFadeableUsages(java.util.List<java.lang.Integer> p0) { return null; }
        public android.media.FadeManagerConfiguration.Builder setUnfadeableAudioAttributes(java.util.List<android.media.AudioAttributes> p0) { return null; }
        public android.media.FadeManagerConfiguration.Builder setUnfadeableContentTypes(java.util.List<java.lang.Integer> p0) { return null; }
        public android.media.FadeManagerConfiguration.Builder setUnfadeableUids(java.util.List<java.lang.Integer> p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FadeStateEnum {
    }

    private static final class FadeVolumeShaperConfigsWrapper implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper> CREATOR = null;
        private android.media.VolumeShaper.Configuration mFadeInVolShaperConfig;
        private android.media.VolumeShaper.Configuration mFadeOutVolShaperConfig;
        FadeVolumeShaperConfigsWrapper() {}
        FadeVolumeShaperConfigsWrapper(android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper p0) {}
        FadeVolumeShaperConfigsWrapper(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.media.VolumeShaper.Configuration getFadeInVolShaperConfig() { return null; }
        public android.media.VolumeShaper.Configuration getFadeOutVolShaperConfig() { return null; }
        public int hashCode() { return 0; }
        boolean isFadeInConfigActive() { return false; }
        boolean isFadeOutConfigActive() { return false; }
        public boolean isInactive() { return false; }
        public void setFadeInVolShaperConfig(android.media.VolumeShaper.Configuration p0) {}
        public void setFadeOutVolShaperConfig(android.media.VolumeShaper.Configuration p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
