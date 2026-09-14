package android.app.admin.dataleakprevention.reporting;

public final class StorageEntity {
    public static final int STORAGE_TYPE_PORTABLE = 1;
    private final java.lang.String mProductId = null;
    private final int mStorageType = 0;
    private final android.net.Uri mUri = null;
    private final java.lang.String mVendorId = null;
    private StorageEntity(android.app.admin.dataleakprevention.reporting.StorageEntity.Builder p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getProductId() { return null; }
    public int getStorageType() { return 0; }
    public android.net.Uri getUri() { return null; }
    public java.lang.String getVendorId() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private java.lang.String mProductId;
        private final int mStorageType = 0;
        private android.net.Uri mUri;
        private java.lang.String mVendorId;
        public Builder(int p0) {}
        public android.app.admin.dataleakprevention.reporting.StorageEntity build() { return null; }
        public android.app.admin.dataleakprevention.reporting.StorageEntity.Builder setProductId(java.lang.String p0) { return null; }
        public android.app.admin.dataleakprevention.reporting.StorageEntity.Builder setUri(android.net.Uri p0) { return null; }
        public android.app.admin.dataleakprevention.reporting.StorageEntity.Builder setVendorId(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StorageType {
    }
}
