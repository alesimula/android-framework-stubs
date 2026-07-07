package android.media.audiopolicy;

@android.annotation.SystemApi
public class AudioMixingRule implements android.os.Parcelable {
    private static final java.lang.String BATCH_CAPTURE = "BATCH_CAPTURE";
    public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioMixingRule> CREATOR = null;
    public static final int MIX_ROLE_INJECTOR = 1;
    public static final int MIX_ROLE_PLAYERS = 0;
    public static final int RULE_EXCLUDE_ATTRIBUTE_CAPTURE_PRESET = 32770;
    public static final int RULE_EXCLUDE_ATTRIBUTE_USAGE = 32769;
    public static final int RULE_EXCLUDE_AUDIO_SESSION_ID = 32784;
    public static final int RULE_EXCLUDE_UID = 32772;
    public static final int RULE_EXCLUDE_USERID = 32776;
    private static final int RULE_EXCLUSION_MASK = 32768;
    public static final int RULE_MATCH_ATTRIBUTE_CAPTURE_PRESET = 2;
    public static final int RULE_MATCH_ATTRIBUTE_USAGE = 1;
    public static final int RULE_MATCH_AUDIO_SESSION_ID = 16;
    public static final int RULE_MATCH_UID = 4;
    public static final int RULE_MATCH_USERID = 8;
    private boolean mAllowPrivilegedPlaybackCapture;
    private final java.util.ArrayList<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> mCriteria = null;
    private boolean mIsBatchCapture;
    private final int mTargetMixType = 0;
    private boolean mVoiceCommunicationCaptureAllowed;
    private AudioMixingRule(int p0, java.util.Collection<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> p1, boolean p2, boolean p3, boolean p4) {}
    private static boolean isAudioAttributeRule(int p0) { return false; }
    private static boolean isPlayerRule(int p0) { return false; }
    private static boolean isRecorderRule(int p0) { return false; }
    private static boolean isValidAttributesSystemApiRule(int p0) { return false; }
    private static boolean isValidRule(int p0) { return false; }
    private static boolean isValidSystemApiRule(int p0) { return false; }
    public boolean allowPrivilegedMediaPlaybackCapture() { return false; }
    boolean containsMatchAttributeRuleForUsage(int p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.ArrayList<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> getCriteria() { return null; }
    public int getTargetMixRole() { return 0; }
    int getTargetMixType() { return 0; }
    public int hashCode() { return 0; }
    boolean isAffectingUsage(int p0) { return false; }
    public boolean isForCallRedirection() { return false; }
    public void setVoiceCommunicationCaptureAllowed(boolean p0) {}
    public boolean voiceCommunicationCaptureAllowed() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class AudioMixMatchCriterion implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> CREATOR = null;
        final android.media.AudioAttributes mAttr = null;
        final int mIntProp = 0;
        final int mRule = 0;
        public AudioMixMatchCriterion(android.media.AudioAttributes p0, int p1) {}
        private AudioMixMatchCriterion(android.os.Parcel p0) {}
        public AudioMixMatchCriterion(java.lang.Integer p0, int p1) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.media.AudioAttributes getAudioAttributes() { return null; }
        public int getIntProp() { return 0; }
        public int getRule() { return 0; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class Builder {
        private boolean mAllowPrivilegedMediaPlaybackCapture;
        private final java.util.Set<android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion> mCriteria = null;
        private boolean mIsBatchCapture;
        private int mTargetMixType;
        private boolean mVoiceCommunicationCaptureAllowed;
        public Builder() {}
        private android.media.audiopolicy.AudioMixingRule.Builder addRuleInternal(android.media.audiopolicy.AudioMixingRule.AudioMixMatchCriterion p0) throws java.lang.IllegalArgumentException { return null; }
        private android.media.audiopolicy.AudioMixingRule.Builder checkAddRuleObjInternal(int p0, java.lang.Object p1) throws java.lang.IllegalArgumentException { return null; }
        private android.media.audiopolicy.AudioMixingRule.Builder setBatchCapture(boolean p0) { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder addMixRule(int p0, java.lang.Object p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder addRule(android.media.AudioAttributes p0, int p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder allowPrivilegedPlaybackCapture(boolean p0) { return null; }
        public android.media.audiopolicy.AudioMixingRule build() { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder excludeMixRule(int p0, java.lang.Object p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder excludeRule(android.media.AudioAttributes p0, int p1) throws java.lang.IllegalArgumentException { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder setTargetMixRole(int p0) { return null; }
        public android.media.audiopolicy.AudioMixingRule.Builder voiceCommunicationCaptureAllowed(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MixRole {
    }
}
