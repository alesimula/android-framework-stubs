package android.media.audiopolicy;

public class AudioPolicyConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioPolicyConfig> CREATOR = null;
    private static final java.lang.String TAG = "AudioPolicyConfig";
    protected int mDuckingPolicy;
    private int mMixCounter;
    protected final java.util.ArrayList<android.media.audiopolicy.AudioMix> mMixes = null;
    private java.lang.String mRegistrationId;
    protected AudioPolicyConfig(android.media.audiopolicy.AudioPolicyConfig p0) {}
    private AudioPolicyConfig(android.os.Parcel p0) {}
    public AudioPolicyConfig(java.util.ArrayList<android.media.audiopolicy.AudioMix> p0) {}
    private static java.lang.String mixTypeId(int p0) { return null; }
    private static java.lang.String mixTypePrefix(int p0) { return null; }
    private void updateMixingRule(android.media.audiopolicy.AudioMix p0, android.media.audiopolicy.AudioMixingRule p1) {}
    protected void add(java.util.ArrayList<android.media.audiopolicy.AudioMix> p0) {}
    public void addMix(android.media.audiopolicy.AudioMix p0) throws java.lang.IllegalArgumentException {}
    public int describeContents() { return 0; }
    public java.util.ArrayList<android.media.audiopolicy.AudioMix> getMixes() { return null; }
    protected java.lang.String getRegistration() { return null; }
    public int hashCode() { return 0; }
    protected void remove(java.util.ArrayList<android.media.audiopolicy.AudioMix> p0) {}
    protected void reset() {}
    protected void setMixRegistration(android.media.audiopolicy.AudioMix p0) {}
    protected void setRegistration(java.lang.String p0) {}
    public java.lang.String toCompactLogString() { return null; }
    public java.lang.String toLogFriendlyString() { return null; }
    public void updateMixingRules(java.util.List<android.util.Pair<android.media.audiopolicy.AudioMix, android.media.audiopolicy.AudioMixingRule>> p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
