package android.app.blob;

@android.annotation.RestrictedForEnvironment(environments="SDK Runtime", from=34)
public class BlobStoreManager {
    public static final int COMMIT_RESULT_ERROR = 1;
    public static final int COMMIT_RESULT_SUCCESS = 0;
    public static final int INVALID_RES_ID = -1;
    public static final int MAX_CERTIFICATE_LENGTH = 32;
    public static final int MAX_PACKAGE_NAME_LENGTH = 223;
    private final android.content.Context mContext = null;
    private final android.app.blob.IBlobStoreManager mService = null;
    public BlobStoreManager(android.content.Context p0, android.app.blob.IBlobStoreManager p1) {}
    public void abandonSession(long p0) throws java.io.IOException {}
    public void acquireLease(android.app.blob.BlobHandle p0, int p1) throws java.io.IOException {}
    public void acquireLease(android.app.blob.BlobHandle p0, int p1, long p2) throws java.io.IOException {}
    public void acquireLease(android.app.blob.BlobHandle p0, java.lang.CharSequence p1) throws java.io.IOException {}
    public void acquireLease(android.app.blob.BlobHandle p0, java.lang.CharSequence p1, long p2) throws java.io.IOException {}
    public long createSession(android.app.blob.BlobHandle p0) throws java.io.IOException { return 0L; }
    public void deleteBlob(android.app.blob.BlobInfo p0) throws java.io.IOException {}
    public android.app.blob.LeaseInfo getLeaseInfo(android.app.blob.BlobHandle p0) throws java.io.IOException { return null; }
    public java.util.List<android.app.blob.BlobHandle> getLeasedBlobs() throws java.io.IOException { return null; }
    public long getRemainingLeaseQuotaBytes() { return 0L; }
    public android.os.ParcelFileDescriptor openBlob(android.app.blob.BlobHandle p0) throws java.io.IOException { return null; }
    public android.app.blob.BlobStoreManager.Session openSession(long p0) throws java.io.IOException { return null; }
    public java.util.List<android.app.blob.BlobInfo> queryBlobsForUser(android.os.UserHandle p0) throws java.io.IOException { return null; }
    public void releaseAllLeases() throws java.lang.Exception {}
    public void releaseLease(android.app.blob.BlobHandle p0) throws java.io.IOException {}
    public void waitForIdle(long p0) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {}

    public static class Session implements java.io.Closeable {
        private final android.app.blob.IBlobStoreSession mSession = null;
        private Session(android.app.blob.IBlobStoreSession p0) {}
        public void abandon() throws java.io.IOException {}
        public void allowPackageAccess(java.lang.String p0, byte[] p1) throws java.io.IOException {}
        public void allowPublicAccess() throws java.io.IOException {}
        public void allowSameSignatureAccess() throws java.io.IOException {}
        public void close() throws java.io.IOException {}
        public void commit(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) throws java.io.IOException {}
        public long getSize() throws java.io.IOException { return 0L; }
        public boolean isPackageAccessAllowed(java.lang.String p0, byte[] p1) throws java.io.IOException { return false; }
        public boolean isPublicAccessAllowed() throws java.io.IOException { return false; }
        public boolean isSameSignatureAccessAllowed() throws java.io.IOException { return false; }
        public android.os.ParcelFileDescriptor openRead() throws java.io.IOException { return null; }
        public android.os.ParcelFileDescriptor openWrite(long p0, long p1) throws java.io.IOException { return null; }
    }
}
