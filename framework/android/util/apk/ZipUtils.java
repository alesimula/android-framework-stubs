package android.util.apk;

public abstract class ZipUtils {
    public static final int UINT16_MAX_VALUE = 65535;
    public static final long UINT32_MAX_VALUE = 4294967295L;
    public static final int ZIP64_EOCD_CENTRAL_DIR_OFFSET_FIELD_OFFSET = 48;
    public static final int ZIP64_EOCD_LOCATOR_OFFSET_FIELD_OFFSET = 8;
    public static final int ZIP64_EOCD_LOCATOR_SIG = 117853008;
    public static final int ZIP64_EOCD_LOCATOR_SIZE = 20;
    public static final int ZIP64_EOCD_MAX_SIZE = 1048576;
    public static final int ZIP64_EOCD_REC_CD_SIZE_FIELD_OFFSET = 40;
    public static final int ZIP64_EOCD_REC_HEADER_SIZE = 12;
    public static final int ZIP64_EOCD_REC_MIN_SIZE = 56;
    public static final int ZIP64_EOCD_REC_SIG = 101075792;
    public static final int ZIP64_EOCD_SIZE_OFFSET = 4;
    public static final int ZIP_EOCD_CENTRAL_DIR_OFFSET_FIELD_OFFSET = 16;
    public static final int ZIP_EOCD_CENTRAL_DIR_SIZE_FIELD_OFFSET = 12;
    public static final int ZIP_EOCD_COMMENT_LENGTH_FIELD_OFFSET = 20;
    public static final int ZIP_EOCD_NUM_RECORDS_FIELD_OFFSET = 10;
    public static final int ZIP_EOCD_REC_MIN_SIZE = 22;
    public static final int ZIP_EOCD_REC_SIG = 101010256;
    private ZipUtils() {}
    private static void assertByteOrderLittleEndian(java.nio.ByteBuffer p0) {}
    public static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findZip64EndOfCentralDirectoryRecord(java.io.RandomAccessFile p0, long p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    public static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findZip64EndOfCentralDirectoryRecord(java.nio.channels.FileChannel p0, long p1) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    private static int findZipEndOfCentralDirectoryRecord(java.nio.ByteBuffer p0) { return 0; }
    private static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findZipEndOfCentralDirectoryRecord(android.util.apk.ApkChannel p0) throws java.io.IOException { return null; }
    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findZipEndOfCentralDirectoryRecord(java.io.RandomAccessFile p0) throws java.io.IOException { return null; }
    private static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findZipEndOfCentralDirectoryRecord(java.io.RandomAccessFile p0, int p1) throws java.io.IOException { return null; }
    static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findZipEndOfCentralDirectoryRecord(java.nio.channels.FileChannel p0) throws java.io.IOException { return null; }
    private static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> findZipEndOfCentralDirectoryRecord(java.nio.channels.FileChannel p0, int p1) throws java.io.IOException { return null; }
    private static int getUnsignedInt16(java.nio.ByteBuffer p0, int p1) { return 0; }
    private static long getUnsignedInt32(java.nio.ByteBuffer p0, int p1) { return 0L; }
    public static long getZipEocdCentralDirectoryOffset(java.nio.ByteBuffer p0) { return 0L; }
    public static long getZipEocdCentralDirectorySizeBytes(java.nio.ByteBuffer p0) { return 0L; }
    public static boolean isEocdZip64(java.nio.ByteBuffer p0) { return false; }
    private static boolean isZip64EndOfCentralDirectoryLocatorPresent(android.util.apk.ApkChannel p0, long p1) throws java.io.IOException { return false; }
    public static final boolean isZip64EndOfCentralDirectoryLocatorPresent(java.io.RandomAccessFile p0, long p1) throws java.io.IOException { return false; }
    public static final boolean isZip64EndOfCentralDirectoryLocatorPresent(java.nio.channels.FileChannel p0, long p1) throws java.io.IOException { return false; }
    public static boolean isZip64SentinelPresent(java.nio.ByteBuffer p0) { return false; }
    static void readFully(java.nio.channels.FileChannel p0, java.nio.ByteBuffer p1) throws java.io.IOException {}
    private static void setUnsignedInt32(java.nio.ByteBuffer p0, int p1, long p2) {}
    public static void setZipEocdCentralDirectoryOffset(java.nio.ByteBuffer p0, long p1) {}
}
