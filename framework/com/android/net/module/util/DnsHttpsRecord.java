package com.android.net.module.util;

public class DnsHttpsRecord extends com.android.net.module.util.DnsPacket.DnsRecord {
    public static final int ALIAS_MODE_PRIORITY = 0;
    public static final java.lang.String DEFAULT_HTTPS_ALPN_ID = "http/1.1";
    public static final int DEFAULT_HTTPS_PORT_VALUE = 443;
    private final android.util.SparseArray<com.android.net.module.util.SvcParam> mSvcParams = null;
    private final int mSvcPriority = 0;
    private final java.lang.String mTargetName = null;
    public DnsHttpsRecord(int p0, java.nio.ByteBuffer p1) throws java.lang.IllegalStateException, com.android.net.module.util.DnsPacket.ParseException, java.nio.BufferUnderflowException { super(0, null); }
    public java.util.List<java.lang.String> getAlpnIds() { return null; }
    public java.lang.String getDohPath() { return null; }
    public byte[] getEchConfigList() { return null; }
    public java.util.List<java.net.InetAddress> getIpv4Hints() { return null; }
    public java.util.List<java.net.InetAddress> getIpv6Hints() { return null; }
    public short[] getMandatory() { return null; }
    public java.lang.String getOwnerName() { return null; }
    public int getPort() { return 0; }
    public int getPriority() { return 0; }
    public java.lang.String getTargetName() { return null; }
    public void verifyMandatoryKeys() throws com.android.net.module.util.DnsPacket.ParseException {}
}
