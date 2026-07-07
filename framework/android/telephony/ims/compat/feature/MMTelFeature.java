package android.telephony.ims.compat.feature;

public class MMTelFeature extends android.telephony.ims.compat.feature.ImsFeature {
    private final com.android.ims.internal.IImsMMTelFeature mImsMMTelBinder = null;
    private final java.lang.Object mLock = null;
    public MMTelFeature() { super(); }
    public void addRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) {}
    public android.telephony.ims.ImsCallProfile createCallProfile(int p0, int p1, int p2) { return null; }
    public com.android.ims.internal.IImsCallSession createCallSession(int p0, android.telephony.ims.ImsCallProfile p1, com.android.ims.internal.IImsCallSessionListener p2) { return null; }
    public void endSession(int p0) {}
    public final com.android.ims.internal.IImsMMTelFeature getBinder() { return null; }
    public com.android.ims.internal.IImsConfig getConfigInterface() { return null; }
    public android.telephony.ims.stub.ImsEcbmImplBase getEcbmInterface() { return null; }
    public android.telephony.ims.stub.ImsMultiEndpointImplBase getMultiEndpointInterface() { return null; }
    public com.android.ims.internal.IImsCallSession getPendingCallSession(int p0, java.lang.String p1) { return null; }
    public android.telephony.ims.stub.ImsUtImplBase getUtInterface() { return null; }
    public boolean isConnected(int p0, int p1) { return false; }
    public boolean isOpened() { return false; }
    public void onFeatureReady() {}
    public void onFeatureRemoved() {}
    public void removeRegistrationListener(com.android.ims.internal.IImsRegistrationListener p0) {}
    public void setUiTTYMode(int p0, android.os.Message p1) {}
    public int startSession(android.app.PendingIntent p0, com.android.ims.internal.IImsRegistrationListener p1) { return 0; }
    public void turnOffIms() {}
    public void turnOnIms() {}
}
