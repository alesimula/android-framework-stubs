package android.media.audiopolicy;

@android.annotation.SystemApi
public final class AudioProductStrategy implements android.os.Parcelable {
    private static final int AUDIO_FLAGS_AFFECT_STRATEGY_SELECTION = 13;
    public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioProductStrategy> CREATOR = null;
    private static final android.media.AudioAttributes DEFAULT_ATTRIBUTES = null;
    public static final int DEFAULT_GROUP = -1;
    @android.annotation.SystemApi
    public static final int DEFAULT_ZONE_ID = 0;
    private static final java.lang.String INDENT = "  ";
    private static final java.lang.String INTERNAL_TAG = "reserved_internal_strategy";
    @android.annotation.SystemApi
    public static final int INVALID_ZONE_ID = -1;
    private static final int MATCH_EQUALS = 31;
    private static final int MATCH_ON_ZONE_ID_SCORE = 16;
    private static final java.lang.String TAG = "AudioProductStrategy";
    private static android.media.IAudioService sService;
    private final android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup[] mAudioAttributesGroups = null;
    private final int mId = 0;
    private final java.lang.String mName = null;
    private int mZoneId;
    private AudioProductStrategy(java.lang.String p0, int p1, int p2, android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup[] p3) {}
    private static int attributesAndZonesMatchesScore(android.media.AudioAttributes p0, android.media.AudioAttributes p1, int p2, int p3) { return 0; }
    private static int attributesMatchesScore(android.media.AudioAttributes p0, android.media.AudioAttributes p1) { return 0; }
    @android.annotation.SystemApi
    public static android.media.audiopolicy.AudioProductStrategy createInvalidAudioProductStrategy(int p0) { return null; }
    public static void dump(java.io.PrintWriter p0) {}
    public static java.util.List<android.media.audiopolicy.AudioProductStrategy> filterNonInternalStrategies(java.util.List<android.media.audiopolicy.AudioProductStrategy> p0) { return null; }
    private android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup getAudioAttributeGroupForLegacyStreamType(int p0) { return null; }
    public static android.media.AudioAttributes getAudioAttributesForStrategyWithLegacyStreamType(int p0) { return null; }
    public static android.media.AudioAttributes getAudioAttributesForStrategyWithLegacyStreamType(java.util.List<android.media.audiopolicy.AudioProductStrategy> p0, int p1) { return null; }
    private static android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup getAudioAttributesGroupForAttributes(android.media.AudioAttributes p0, int p1, boolean p2) { return null; }
    private static android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup getAudioAttributesGroupForAttributes(android.media.AudioAttributes p0, boolean p1) { return null; }
    private int getAudioAttributesSupportScore(android.media.AudioAttributes p0, int p1) { return 0; }
    private static java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategiesFromService(boolean p0) { return null; }
    @android.annotation.SystemApi
    public static android.media.audiopolicy.AudioProductStrategy getAudioProductStrategyForAudioAttributes(android.media.AudioAttributes p0, int p1, boolean p2) { return null; }
    public static android.media.audiopolicy.AudioProductStrategy getAudioProductStrategyForAudioAttributes(android.media.AudioAttributes p0, boolean p1) { return null; }
    public static android.media.audiopolicy.AudioProductStrategy getAudioProductStrategyWithId(int p0) { return null; }
    public static android.media.AudioAttributes getDefaultAttributes() { return null; }
    public static int getLegacyStreamTypeForStrategyWithAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    private android.media.audiopolicy.AudioProductStrategy.ScoredAudioAttributesGroup getScoredAttributeGroupForAttribute(android.media.AudioAttributes p0) { return null; }
    private android.media.audiopolicy.AudioProductStrategy.ScoredAudioAttributesGroup getScoredAttributeGroupForAttribute(android.media.AudioAttributes p0, int p1) { return null; }
    private static android.media.IAudioService getService() { return null; }
    @android.annotation.SystemApi
    public static int getVolumeGroupIdForAudioAttributes(android.media.AudioAttributes p0, int p1, boolean p2) { return 0; }
    public static int getVolumeGroupIdForAudioAttributes(android.media.AudioAttributes p0, boolean p1) { return 0; }
    public static int getVolumeGroupIdForStreamType(java.util.List<android.media.audiopolicy.AudioProductStrategy> p0, int p1) { return 0; }
    @android.annotation.SystemApi
    public static int getZoneIdForAudioVolumeGroupId(int p0) { return 0; }
    public static int getZoneIdForAudioVolumeGroupId(java.util.List<android.media.audiopolicy.AudioProductStrategy> p0, int p1) { return 0; }
    private static boolean isDefaultMatchScore(int p0) { return false; }
    static boolean isInternalAttributesForStrategy(android.media.AudioAttributes p0) { return false; }
    private boolean isInternalStrategy() { return false; }
    private static boolean isMatchScoreEquals(int p0) { return false; }
    private static native int native_get_audio_attributes_for_legacy_stream(int p0, android.media.AudioAttributes.Builder p1);
    private static native int native_get_legacy_stream_for_audio_attributes(android.media.AudioAttributes p0);
    public static native int native_list_audio_product_strategies(java.util.ArrayList<android.media.audiopolicy.AudioProductStrategy> p0);
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.SystemApi
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public android.media.AudioAttributes getAudioAttributesForLegacyStreamType(int p0) { return null; }
    @android.annotation.SystemApi
    public int getId() { return 0; }
    public int getLegacyStreamTypeForAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    @android.annotation.SystemApi
    public java.lang.String getName() { return null; }
    public int getVolumeGroupIdForAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    @android.annotation.SystemApi
    public int getVolumeGroupIdForAudioAttributes(android.media.AudioAttributes p0, int p1) { return 0; }
    public int getVolumeGroupIdForLegacyStreamType(int p0) { return 0; }
    @android.annotation.SystemApi
    public int getZoneId() { return 0; }
    public int hashCode() { return 0; }
    @android.annotation.SystemApi
    public boolean supportsAudioAttributes(android.media.AudioAttributes p0) { return false; }
    @android.annotation.SystemApi
    public boolean supportsAudioAttributes(android.media.AudioAttributes p0, int p1) { return false; }
    public java.lang.String toString() { return null; }
    java.lang.String toString(java.lang.String p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static final class AudioAttributesGroup implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup> CREATOR = null;
        private final android.media.AudioAttributes[] mAudioAttributes = null;
        private int mLegacyStreamType;
        private int mProductStrategyId;
        private int mVolumeGroupId;
        AudioAttributesGroup(int p0, int p1, int p2, android.media.AudioAttributes[] p3) {}
        private boolean isInternalStrategy() { return false; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getAttributesMatchingScore(android.media.AudioAttributes p0) { return 0; }
        int getAttributesMatchingScore(android.media.AudioAttributes p0, int p1, int p2) { return 0; }
        public android.media.AudioAttributes getAudioAttributes() { return null; }
        int getStrategyId() { return 0; }
        public int getStreamType() { return 0; }
        public int getVolumeGroupId() { return 0; }
        public int hashCode() { return 0; }
        public boolean supportsStreamType(int p0) { return false; }
        public java.lang.String toString() { return null; }
        java.lang.String toString(java.lang.String p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static final class ScoredAudioAttributesGroup {
        private final android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup mAudioAttributesGroup = null;
        private final int mScore = 0;
        ScoredAudioAttributesGroup(int p0, android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup p1) {}
        public android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup getAudioAttributesGroup() { return null; }
        public int getScore() { return 0; }
    }
}
