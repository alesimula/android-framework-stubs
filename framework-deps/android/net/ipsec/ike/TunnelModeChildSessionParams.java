package android.net.ipsec.ike;

public class TunnelModeChildSessionParams {
    public TunnelModeChildSessionParams() {}
    public java.util.List getSaProposals() { return null; }
    public java.util.List getInboundTrafficSelectors() { return null; }
    public java.util.List getOutboundTrafficSelectors() { return null; }
    public int getHardLifetimeSeconds() { return 0; }
    public int getSoftLifetimeSeconds() { return 0; }
    public java.util.List getConfigurationRequests() { return null; }

    public static class TunnelModeChildConfigRequest {
        public TunnelModeChildConfigRequest() {}
    }

    public static interface ConfigRequestIpv4Address {
    }

    public static interface ConfigRequestIpv6Address {
    }

    public static class ConfigRequestIpv4DnsServer {
        public ConfigRequestIpv4DnsServer() {}
    }

    public static class ConfigRequestIpv6DnsServer {
        public ConfigRequestIpv6DnsServer() {}
    }

    public static class ConfigRequestIpv4DhcpServer {
        public ConfigRequestIpv4DhcpServer() {}
    }

    public static class ConfigRequestIpv4Netmask {
        public ConfigRequestIpv4Netmask() {}
    }

    public static class Builder {
        public Builder() {}
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addSaProposal(android.net.ipsec.ike.ChildSaProposal p0) { return null; }
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInboundTrafficSelectors(android.net.ipsec.ike.IkeTrafficSelector p0) { return null; }
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addOutboundTrafficSelectors(android.net.ipsec.ike.IkeTrafficSelector p0) { return null; }
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder setLifetimeSeconds(int p0, int p1) { return null; }
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInternalDhcpServerRequest(int p0) { return null; }
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInternalDnsServerRequest(int p0) { return null; }
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInternalAddressRequest(int p0) { return null; }
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInternalAddressRequest(java.net.Inet6Address p0, int p1) { return null; }
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInternalAddressRequest(java.net.Inet4Address p0) { return null; }
        public android.net.ipsec.ike.TunnelModeChildSessionParams build() { return null; }
    }
}
