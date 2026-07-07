package android.net.ipsec.ike;

public class IkeSessionParams {
    public IkeSessionParams() {}
    public android.net.ipsec.ike.IkeIdentification getLocalIdentification() { return null; }
    public java.lang.String getServerHostname() { return null; }
    public android.net.Network getNetwork() { return null; }
    public android.net.ipsec.ike.ike3gpp.Ike3gppExtension getIke3gppExtension() { return null; }
    public java.util.List getSaProposals() { return null; }
    public android.net.ipsec.ike.IkeIdentification getRemoteIdentification() { return null; }
    public android.net.ipsec.ike.IkeSessionParams.IkeAuthConfig getLocalAuthConfig() { return null; }
    public android.net.ipsec.ike.IkeSessionParams.IkeAuthConfig getRemoteAuthConfig() { return null; }
    public java.util.List getConfigurationRequests() { return null; }
    public int[] getRetransmissionTimeoutsMillis() { return null; }
    public int getHardLifetimeSeconds() { return 0; }
    public int getSoftLifetimeSeconds() { return 0; }
    public int getDpdDelaySeconds() { return 0; }
    public int getNattKeepAliveDelaySeconds() { return 0; }
    public int getIpVersion() { return 0; }
    public int getEncapType() { return 0; }
    public java.util.Set getIkeOptions() { return null; }
    public boolean hasIkeOption(int p0) { return false; }

    public static class Builder {
        public Builder() {}
        public android.net.ipsec.ike.IkeSessionParams.Builder setAuthDigitalSignature(java.security.cert.X509Certificate p0, java.security.cert.X509Certificate p1, java.util.List p2, java.security.PrivateKey p3) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder setAuthEap(java.security.cert.X509Certificate p0, android.net.eap.EapSessionConfig p1) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder setAuthPsk(byte[] p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder setServerHostname(java.lang.String p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder addSaProposal(android.net.ipsec.ike.IkeSaProposal p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder setLocalIdentification(android.net.ipsec.ike.IkeIdentification p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder setRemoteIdentification(android.net.ipsec.ike.IkeIdentification p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder setRetransmissionTimeoutsMillis(int[] p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder setLifetimeSeconds(int p0, int p1) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder setDpdDelaySeconds(int p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder setNattKeepAliveDelaySeconds(int p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder setIpVersion(int p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder setEncapType(int p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder addPcscfServerRequest(int p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder addPcscfServerRequest(java.net.InetAddress p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder removeIkeOption(int p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams.Builder addIkeOption(int p0) { return null; }
        public android.net.ipsec.ike.IkeSessionParams build() { return null; }
    }

    public static class IkeAuthConfig {
        public IkeAuthConfig() {}
    }

    public static class IkeConfigRequest {
        public IkeConfigRequest() {}
    }

    public static class IkeAuthDigitalSignLocalConfig {
        public IkeAuthDigitalSignLocalConfig() {}
        public java.security.cert.X509Certificate getClientEndCertificate() { return null; }
        public java.util.List getIntermediateCertificates() { return null; }
        public java.security.PrivateKey getPrivateKey() { return null; }
    }

    public static class IkeAuthDigitalSignRemoteConfig {
        public IkeAuthDigitalSignRemoteConfig() {}
        public java.security.cert.X509Certificate getRemoteCaCert() { return null; }
    }

    public static class IkeAuthEapConfig {
        public IkeAuthEapConfig() {}
        public android.net.eap.EapSessionConfig getEapConfig() { return null; }
    }

    public static class IkeAuthPskConfig {
        public IkeAuthPskConfig() {}
        public byte[] getPsk() { return null; }
    }

    public static interface ConfigRequestIpv4PcscfServer {
    }

    public static interface ConfigRequestIpv6PcscfServer {
    }
}
