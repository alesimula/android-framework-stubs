package android.mtp;

public final class MtpObjectInfo {
    private int mAssociationDesc;
    private int mAssociationType;
    private int mCompressedSize;
    private long mDateCreated;
    private long mDateModified;
    private int mFormat;
    private int mHandle;
    private int mImagePixDepth;
    private int mImagePixHeight;
    private int mImagePixWidth;
    private java.lang.String mKeywords;
    private java.lang.String mName;
    private int mParent;
    private int mProtectionStatus;
    private int mSequenceNumber;
    private int mStorageId;
    private int mThumbCompressedSize;
    private int mThumbFormat;
    private int mThumbPixHeight;
    private int mThumbPixWidth;
    private MtpObjectInfo() {}
    private static int longToUint32(long p0, java.lang.String p1) { return 0; }
    private static long uint32ToLong(int p0) { return 0L; }
    public final int getAssociationDesc() { return 0; }
    public final int getAssociationType() { return 0; }
    public final int getCompressedSize() { return 0; }
    public final long getCompressedSizeLong() { return 0L; }
    public final long getDateCreated() { return 0L; }
    public final long getDateModified() { return 0L; }
    public final int getFormat() { return 0; }
    public final int getImagePixDepth() { return 0; }
    public final long getImagePixDepthLong() { return 0L; }
    public final int getImagePixHeight() { return 0; }
    public final long getImagePixHeightLong() { return 0L; }
    public final int getImagePixWidth() { return 0; }
    public final long getImagePixWidthLong() { return 0L; }
    public final java.lang.String getKeywords() { return null; }
    public final java.lang.String getName() { return null; }
    public final int getObjectHandle() { return 0; }
    public final int getParent() { return 0; }
    public final int getProtectionStatus() { return 0; }
    public final int getSequenceNumber() { return 0; }
    public final long getSequenceNumberLong() { return 0L; }
    public final int getStorageId() { return 0; }
    public final int getThumbCompressedSize() { return 0; }
    public final long getThumbCompressedSizeLong() { return 0L; }
    public final int getThumbFormat() { return 0; }
    public final int getThumbPixHeight() { return 0; }
    public final long getThumbPixHeightLong() { return 0L; }
    public final int getThumbPixWidth() { return 0; }
    public final long getThumbPixWidthLong() { return 0L; }

    public static class Builder {
        private android.mtp.MtpObjectInfo mObjectInfo;
        public Builder() {}
        public Builder(android.mtp.MtpObjectInfo p0) {}
        public android.mtp.MtpObjectInfo build() { return null; }
        public android.mtp.MtpObjectInfo.Builder setAssociationDesc(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setAssociationType(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setCompressedSize(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setDateCreated(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setDateModified(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setFormat(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setImagePixDepth(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setImagePixHeight(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setImagePixWidth(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setKeywords(java.lang.String p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setName(java.lang.String p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setObjectHandle(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setParent(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setProtectionStatus(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setSequenceNumber(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setStorageId(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setThumbCompressedSize(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setThumbFormat(int p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setThumbPixHeight(long p0) { return null; }
        public android.mtp.MtpObjectInfo.Builder setThumbPixWidth(long p0) { return null; }
    }
}
