package android.telephony.ims;

@android.annotation.SystemApi
public final class RcsContactUceCapability implements android.os.Parcelable {
    public static final int CAPABILITY_MECHANISM_OPTIONS = 2;
    public static final int CAPABILITY_MECHANISM_PRESENCE = 1;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsContactUceCapability> CREATOR = null;
    public static final int REQUEST_RESULT_FOUND = 3;
    public static final int REQUEST_RESULT_NOT_FOUND = 2;
    public static final int REQUEST_RESULT_NOT_ONLINE = 1;
    public static final int REQUEST_RESULT_UNKNOWN = 0;
    public static final int SOURCE_TYPE_CACHED = 1;
    public static final int SOURCE_TYPE_NETWORK = 0;
    private int mCapabilityMechanism;
    private final android.net.Uri mContactUri = null;
    private android.net.Uri mEntityUri;
    private final java.util.Set<java.lang.String> mFeatureTags = null;
    private final java.util.List<android.telephony.ims.RcsContactPresenceTuple> mPresenceTuples = null;
    private int mRequestResult;
    private int mSourceType;
    private RcsContactUceCapability(android.net.Uri p0, int p1, int p2) {}
    private RcsContactUceCapability(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getCapabilityMechanism() { return 0; }
    public android.telephony.ims.RcsContactPresenceTuple getCapabilityTuple(java.lang.String p0) { return null; }
    public java.util.List<android.telephony.ims.RcsContactPresenceTuple> getCapabilityTuples() { return null; }
    public android.net.Uri getContactUri() { return null; }
    public android.net.Uri getEntityUri() { return null; }
    public java.util.Set<java.lang.String> getFeatureTags() { return null; }
    public int getRequestResult() { return 0; }
    public int getSourceType() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CapabilityMechanism {
    }

    public static final class OptionsBuilder {
        private final android.telephony.ims.RcsContactUceCapability mCapabilities = null;
        public OptionsBuilder(android.net.Uri p0) {}
        public OptionsBuilder(android.net.Uri p0, int p1) {}
        public android.telephony.ims.RcsContactUceCapability.OptionsBuilder addFeatureTag(java.lang.String p0) { return null; }
        public android.telephony.ims.RcsContactUceCapability.OptionsBuilder addFeatureTags(java.util.Set<java.lang.String> p0) { return null; }
        public android.telephony.ims.RcsContactUceCapability build() { return null; }
        public android.telephony.ims.RcsContactUceCapability.OptionsBuilder setRequestResult(int p0) { return null; }
    }

    public static final class PresenceBuilder {
        private final android.telephony.ims.RcsContactUceCapability mCapabilities = null;
        public PresenceBuilder(android.net.Uri p0, int p1, int p2) {}
        public android.telephony.ims.RcsContactUceCapability.PresenceBuilder addCapabilityTuple(android.telephony.ims.RcsContactPresenceTuple p0) { return null; }
        public android.telephony.ims.RcsContactUceCapability.PresenceBuilder addCapabilityTuples(java.util.List<android.telephony.ims.RcsContactPresenceTuple> p0) { return null; }
        public android.telephony.ims.RcsContactUceCapability build() { return null; }
        public android.telephony.ims.RcsContactUceCapability.PresenceBuilder setEntityUri(android.net.Uri p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SourceType {
    }
}
