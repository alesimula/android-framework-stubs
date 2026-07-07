package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public final class IptvFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int IGMP_UNDEFINED = 0;
    public static final int IGMP_V1 = 1;
    public static final int IGMP_V2 = 2;
    public static final int IGMP_V3 = 4;
    public static final int PROTOCOL_RTP = 2;
    public static final int PROTOCOL_UDP = 1;
    public static final int PROTOCOL_UNDEFINED = 0;
    private final long mBitrate = 0L;
    private final java.lang.String mContentUrl = null;
    private final byte[] mDstIpAddress = null;
    private final int mDstPort = 0;
    private final android.media.tv.tuner.frontend.IptvFrontendSettingsFec mFec = null;
    private final int mIgmp = 0;
    private final int mProtocol = 0;
    private final byte[] mSrcIpAddress = null;
    private final int mSrcPort = 0;
    private IptvFrontendSettings(byte[] p0, byte[] p1, int p2, int p3, android.media.tv.tuner.frontend.IptvFrontendSettingsFec p4, int p5, int p6, long p7, java.lang.String p8) { super(0L); }
    public long getBitrate() { return 0L; }
    public java.lang.String getContentUrl() { return null; }
    public byte[] getDstIpAddress() { return null; }
    public int getDstPort() { return 0; }
    public android.media.tv.tuner.frontend.IptvFrontendSettingsFec getFec() { return null; }
    public int getIgmp() { return 0; }
    public int getProtocol() { return 0; }
    public byte[] getSrcIpAddress() { return null; }
    public int getSrcPort() { return 0; }
    public int getType() { return 0; }

    public static final class Builder {
        private long mBitrate;
        private java.lang.String mContentUrl;
        private byte[] mDstIpAddress;
        private int mDstPort;
        private android.media.tv.tuner.frontend.IptvFrontendSettingsFec mFec;
        private int mIgmp;
        private int mProtocol;
        private byte[] mSrcIpAddress;
        private int mSrcPort;
        public Builder() {}
        public android.media.tv.tuner.frontend.IptvFrontendSettings build() { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setBitrate(long p0) { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setContentUrl(java.lang.String p0) { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setDstIpAddress(byte[] p0) { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setDstPort(int p0) { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setFec(android.media.tv.tuner.frontend.IptvFrontendSettingsFec p0) { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setIgmp(int p0) { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setProtocol(int p0) { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setSrcIpAddress(byte[] p0) { return null; }
        public android.media.tv.tuner.frontend.IptvFrontendSettings.Builder setSrcPort(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Igmp {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Protocol {
    }
}
