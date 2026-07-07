package com.android.net.module.util;

public abstract class SvcParam<T extends java.lang.Object> {
    static final int KEY_ALPN = 1;
    static final int KEY_DOHPATH = 7;
    static final int KEY_ECH = 5;
    static final int KEY_IPV4HINT = 4;
    static final int KEY_IPV6HINT = 6;
    static final int KEY_MANDATORY = 0;
    static final int KEY_NO_DEFAULT_ALPN = 2;
    static final int KEY_PORT = 3;
    static final int MINSVCPARAMSIZE = 4;
    private final int mKey = 0;
    SvcParam(int p0) {}
    static com.android.net.module.util.SvcParam parseSvcParam(java.nio.ByteBuffer p0) throws com.android.net.module.util.DnsPacket.ParseException { return null; }
    static java.lang.String toKeyName(int p0) { return null; }
    int getKey() { return 0; }
    abstract T getValue();

    static class SvcParamAlpn extends com.android.net.module.util.SvcParam<java.util.List<java.lang.String>> {
        private final java.util.List<java.lang.String> mValue = null;
        SvcParamAlpn(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        java.util.List<java.lang.String> getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    static class SvcParamDohPath extends com.android.net.module.util.SvcParam<java.lang.String> {
        private final java.lang.String mValue = null;
        SvcParamDohPath(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        java.lang.String getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    static class SvcParamEch extends com.android.net.module.util.SvcParam.SvcParamGeneric {
        SvcParamEch(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0, null); }
        byte[] getValue() { return null; }
    }

    static class SvcParamGeneric extends com.android.net.module.util.SvcParam<byte[]> {
        final byte[] mValue = null;
        SvcParamGeneric(int p0, java.nio.ByteBuffer p1) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        byte[] getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    static class SvcParamIpHint extends com.android.net.module.util.SvcParam<java.util.List<java.net.InetAddress>> {
        private final java.util.List<java.net.InetAddress> mValue = null;
        private SvcParamIpHint(int p0, java.nio.ByteBuffer p1, int p2) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        java.util.List<java.net.InetAddress> getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    static class SvcParamIpv4Hint extends com.android.net.module.util.SvcParam.SvcParamIpHint {
        SvcParamIpv4Hint(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0, null, 0); }
    }

    static class SvcParamIpv6Hint extends com.android.net.module.util.SvcParam.SvcParamIpHint {
        SvcParamIpv6Hint(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0, null, 0); }
    }

    static class SvcParamMandatory extends com.android.net.module.util.SvcParam<short[]> {
        private final short[] mValue = null;
        private SvcParamMandatory(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        short[] getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    static class SvcParamNoDefaultAlpn extends com.android.net.module.util.SvcParam<java.lang.Void> {
        SvcParamNoDefaultAlpn(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        java.lang.Void getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    static class SvcParamPort extends com.android.net.module.util.SvcParam<java.lang.Integer> {
        private final int mValue = 0;
        SvcParamPort(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        java.lang.Integer getValue() { return null; }
        public java.lang.String toString() { return null; }
    }
}
