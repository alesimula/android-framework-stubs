package com.android.net.module.util;

public class DnsPacket {
    public static final int ANSECTION = 1;
    public static final int ARSECTION = 3;
    public static final int NSSECTION = 2;
    static final int NUM_SECTIONS = 4;
    public static final int QDSECTION = 0;
    private static final java.lang.String TAG = null;
    public static final int TYPE_CNAME = 5;
    public static final int TYPE_SOA = 6;
    public static final int TYPE_SVCB = 64;
    protected final com.android.net.module.util.DnsPacket.DnsHeader mHeader = null;
    protected final java.util.List<com.android.net.module.util.DnsPacket.DnsRecord>[] mRecords = null;
    public DnsPacket(com.android.net.module.util.DnsPacket.DnsHeader p0, java.util.List<com.android.net.module.util.DnsPacket.DnsRecord> p1, java.util.List<com.android.net.module.util.DnsPacket.DnsRecord> p2) {}
    public DnsPacket(byte[] p0) throws com.android.net.module.util.DnsPacket.ParseException {}
    public boolean equals(java.lang.Object p0) { return false; }
    public byte[] getBytes() throws java.io.IOException { return null; }
    public com.android.net.module.util.DnsPacket.DnsHeader getHeader() { return null; }
    public java.util.List<com.android.net.module.util.DnsPacket.DnsRecord> getRecords(int p0) { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static class DnsHeader {
        private static final int FLAGS_SECTION_QR_BIT = 15;
        private static final int SIZE_IN_BYTES = 12;
        private static final java.lang.String TAG = "DnsHeader";
        private final int mFlags = 0;
        private final int mId = 0;
        private final int[] mRecordCount = null;
        public DnsHeader(int p0, int p1, int p2, int p3) {}
        public DnsHeader(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException {}
        public boolean equals(java.lang.Object p0) { return false; }
        public byte[] getBytes() { return null; }
        public int getFlags() { return 0; }
        public int getId() { return 0; }
        public int getRecordCount(int p0) { return 0; }
        public int hashCode() { return 0; }
        public boolean isResponse() { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class DnsRecord {
        public static final int MAXNAMESIZE = 255;
        public static final int NAME_COMPRESSION = 192;
        public static final int NAME_NORMAL = 0;
        private static final java.lang.String TAG = "DnsRecord";
        public final java.lang.String dName = null;
        private final byte[] mRdata = null;
        public final int nsClass = 0;
        public final int nsType = 0;
        public final int rType = 0;
        public final long ttl = 0L;
        private DnsRecord(int p0, java.lang.String p1, int p2, int p3, long p4, java.net.InetAddress p5, java.lang.String p6) throws java.io.IOException {}
        protected DnsRecord(int p0, java.nio.ByteBuffer p1) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException {}
        private DnsRecord(java.lang.String p0, int p1, int p2) {}
        public static com.android.net.module.util.DnsPacket.DnsRecord makeAOrAAAARecord(int p0, java.lang.String p1, int p2, long p3, java.net.InetAddress p4) throws java.io.IOException { return null; }
        public static com.android.net.module.util.DnsPacket.DnsRecord makeCNameRecord(int p0, java.lang.String p1, int p2, long p3, java.lang.String p4) throws java.io.IOException { return null; }
        public static com.android.net.module.util.DnsPacket.DnsRecord makeQuestion(java.lang.String p0, int p1, int p2) { return null; }
        public static com.android.net.module.util.DnsPacket.DnsRecord parse(int p0, java.nio.ByteBuffer p1) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { return null; }
        private static java.lang.String requireHostName(java.lang.String p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public byte[] getBytes() throws java.io.IOException { return null; }
        public byte[] getRR() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class ParseException extends java.lang.RuntimeException {
        public java.lang.String reason;
        public ParseException(java.lang.String p0) { super(); }
        public ParseException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecordType {
    }
}
