package android.net;

public class SntpClient {
    private static final boolean DBG = true;
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int REFERENCE_TIME_OFFSET = 16;
    public static final int STANDARD_NTP_PORT = 123;
    private static final java.lang.String TAG = "SntpClient";
    private static final int TRANSMIT_TIME_OFFSET = 40;
    private long mClockOffset;
    private java.lang.String mFailureReason;
    private long mNtpTime;
    private long mNtpTimeReference;
    private final java.util.Random mRandom = null;
    private long mRoundTripTime;
    private java.net.InetSocketAddress mServerSocketAddress;
    private final java.util.function.Supplier<java.time.Instant> mSystemTimeSupplier = null;
    public SntpClient() {}
    public SntpClient(java.util.function.Supplier<java.time.Instant> p0, java.util.Random p1) {}
    public static java.time.Duration calculateClockOffset(android.net.sntp.Timestamp64 p0, android.net.sntp.Timestamp64 p1, android.net.sntp.Timestamp64 p2, android.net.sntp.Timestamp64 p3) { return null; }
    private static void checkValidServerReply(byte p0, byte p1, int p2, android.net.sntp.Timestamp64 p3, android.net.sntp.Timestamp64 p4, android.net.sntp.Timestamp64 p5, android.net.sntp.Timestamp64 p6) throws android.net.SntpClient.InvalidServerReplyException {}
    private static java.util.Random defaultRandom() { return null; }
    private android.net.sntp.Timestamp64 readTimeStamp(byte[] p0, int p1) { return null; }
    private long readUnsigned32(byte[] p0, int p1) { return 0L; }
    private void writeTimeStamp(byte[] p0, int p1, android.net.sntp.Timestamp64 p2) {}
    public long getClockOffset() { return 0L; }
    public java.lang.String getFailureReason() { return null; }
    public long getNtpTime() { return 0L; }
    public long getNtpTimeReference() { return 0L; }
    public long getRoundTripTime() { return 0L; }
    public java.net.InetSocketAddress getServerSocketAddress() { return null; }
    @java.lang.Deprecated
    public boolean requestTime(java.lang.String p0, int p1) { return false; }
    public boolean requestTime(java.lang.String p0, int p1, int p2, android.net.Network p3) { return false; }
    public boolean requestTime(java.net.InetAddress p0, int p1, int p2, android.net.Network p3) { return false; }

    private static class InvalidServerReplyException extends java.lang.Exception {
        public InvalidServerReplyException(java.lang.String p0) { super(); }
    }
}
