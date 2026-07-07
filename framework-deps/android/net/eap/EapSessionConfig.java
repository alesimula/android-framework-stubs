package android.net.eap;

public class EapSessionConfig {
    public EapSessionConfig() {}
    public byte[] getEapIdentity() { return null; }
    public android.net.eap.EapSessionConfig.EapSimConfig getEapSimConfig() { return null; }
    public android.net.eap.EapSessionConfig.EapTtlsConfig getEapTtlsConfig() { return null; }
    public android.net.eap.EapSessionConfig.EapAkaConfig getEapAkaConfig() { return null; }
    public android.net.eap.EapSessionConfig.EapMsChapV2Config getEapMsChapV2Config() { return null; }
    public android.net.eap.EapSessionConfig.EapAkaPrimeConfig getEapAkaPrimeConfig() { return null; }

    public static class Builder {
        public Builder() {}
        public android.net.eap.EapSessionConfig.Builder setEapAkaConfig(int p0, int p1) { return null; }
        public android.net.eap.EapSessionConfig.Builder setEapAkaPrimeConfig(int p0, int p1, java.lang.String p2, boolean p3) { return null; }
        public android.net.eap.EapSessionConfig.Builder setEapMsChapV2Config(java.lang.String p0, java.lang.String p1) { return null; }
        public android.net.eap.EapSessionConfig.Builder setEapSimConfig(int p0, int p1) { return null; }
        public android.net.eap.EapSessionConfig.Builder setEapTtlsConfig(java.security.cert.X509Certificate p0, android.net.eap.EapSessionConfig p1) { return null; }
        public android.net.eap.EapSessionConfig.Builder setEapIdentity(byte[] p0) { return null; }
        public android.net.eap.EapSessionConfig build() { return null; }
    }

    public static class EapAkaConfig {
        public EapAkaConfig() {}
    }

    public static class EapAkaPrimeConfig {
        public EapAkaPrimeConfig() {}
        public java.lang.String getNetworkName() { return null; }
        public boolean allowsMismatchedNetworkNames() { return false; }
    }

    public static class EapMethodConfig {
        public EapMethodConfig() {}
        public int getMethodType() { return 0; }
    }

    public static class EapMsChapV2Config {
        public EapMsChapV2Config() {}
        public java.lang.String getUsername() { return null; }
        public java.lang.String getPassword() { return null; }
    }

    public static class EapSimConfig {
        public EapSimConfig() {}
    }

    public static class EapTtlsConfig {
        public EapTtlsConfig() {}
        public java.security.cert.X509Certificate getServerCaCert() { return null; }
        public android.net.eap.EapSessionConfig getInnerEapSessionConfig() { return null; }
    }

    public static class EapUiccConfig {
        public EapUiccConfig() {}
        public int getSubId() { return 0; }
        public int getAppType() { return 0; }
    }
}
