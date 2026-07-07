package android.security.keystore.recovery;

@android.annotation.SystemApi
public final class KeyChainSnapshot implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.keystore.recovery.KeyChainSnapshot> CREATOR = null;
    private static final long DEFAULT_COUNTER_ID = 1L;
    private static final int DEFAULT_MAX_ATTEMPTS = 10;
    private android.security.keystore.recovery.RecoveryCertPath mCertPath;
    private long mCounterId;
    private byte[] mEncryptedRecoveryKeyBlob;
    private java.util.List<android.security.keystore.recovery.WrappedApplicationKey> mEntryRecoveryData;
    private java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> mKeyChainProtectionParams;
    private int mMaxAttempts;
    private byte[] mServerParams;
    private int mSnapshotVersion;
    private KeyChainSnapshot() {}
    protected KeyChainSnapshot(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getCounterId() { return 0L; }
    public byte[] getEncryptedRecoveryKeyBlob() { return null; }
    public java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> getKeyChainProtectionParams() { return null; }
    public int getMaxAttempts() { return 0; }
    public byte[] getServerParams() { return null; }
    public int getSnapshotVersion() { return 0; }
    public java.security.cert.CertPath getTrustedHardwareCertPath() { return null; }
    public java.util.List<android.security.keystore.recovery.WrappedApplicationKey> getWrappedApplicationKeys() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private android.security.keystore.recovery.KeyChainSnapshot mInstance;
        public Builder() {}
        public android.security.keystore.recovery.KeyChainSnapshot build() { return null; }
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setCounterId(long p0) { return null; }
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setEncryptedRecoveryKeyBlob(byte[] p0) { return null; }
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setKeyChainProtectionParams(java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> p0) { return null; }
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setMaxAttempts(int p0) { return null; }
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setServerParams(byte[] p0) { return null; }
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setSnapshotVersion(int p0) { return null; }
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setTrustedHardwareCertPath(java.security.cert.CertPath p0) throws java.security.cert.CertificateException { return null; }
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setWrappedApplicationKeys(java.util.List<android.security.keystore.recovery.WrappedApplicationKey> p0) { return null; }
    }
}
