package com.android.net.module.util;

public final class DnsPacketUtils {
    private DnsPacketUtils() {}

    public static class DnsRecordParser {
        private static final int MAXLABELCOUNT = 128;
        private static final int MAXLABELSIZE = 63;
        private static final int MAXNAMESIZE = 255;
        private static final java.text.DecimalFormat sByteFormat = null;
        private static final java.text.FieldPosition sPos = null;
        private DnsRecordParser() {}
        public static byte[] domainNameToLabels(java.lang.String p0) throws java.io.IOException, android.net.ParseException { return null; }
        public static boolean isHostName(java.lang.String p0) { return false; }
        static java.lang.String labelToString(byte[] p0) { return null; }
        public static java.lang.String parseName(java.nio.ByteBuffer p0, int p1, int p2, boolean p3) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { return null; }
        public static java.lang.String parseName(java.nio.ByteBuffer p0, int p1, boolean p2) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { return null; }
    }
}
