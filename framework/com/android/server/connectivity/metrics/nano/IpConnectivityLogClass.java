package com.android.server.connectivity.metrics.nano;

public interface IpConnectivityLogClass {
    public static final int BLUETOOTH = 1;
    public static final int CELLULAR = 2;
    public static final int ETHERNET = 3;
    public static final int LOWPAN = 9;
    public static final int MULTIPLE = 6;
    public static final int NONE = 5;
    public static final int UNKNOWN = 0;
    public static final int WIFI = 4;
    public static final int WIFI_NAN = 8;
    public static final int WIFI_P2P = 7;

    public static final class ApfProgramEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent[] _emptyArray;
        public int currentRas;
        public boolean dropMulticast;
        public long effectiveLifetime;
        public int filteredRas;
        public boolean hasIpv4Addr;
        public long lifetime;
        public int programLength;
        public ApfProgramEvent() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class ApfStatistics extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics[] _emptyArray;
        public int droppedRas;
        public long durationMs;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] hardwareCounters;
        public int matchingRas;
        public int maxProgramSize;
        public int parseErrors;
        public int programUpdates;
        public int programUpdatesAll;
        public int programUpdatesAllowingMulticast;
        public int receivedRas;
        public int totalPacketDropped;
        public int totalPacketProcessed;
        public int zeroLifetimeRas;
        public ApfStatistics() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class ConnectStatistics extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics[] _emptyArray;
        public int connectBlockingCount;
        public int connectCount;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] errnosCounters;
        public int ipv6AddrCount;
        public int[] latenciesMs;
        public int[] nonBlockingLatenciesMs;
        public ConnectStatistics() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class DefaultNetworkEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int DISCONNECT = 3;
        public static final int DUAL = 3;
        public static final int INVALIDATION = 2;
        public static final int IPV4 = 1;
        public static final int IPV6 = 2;
        public static final int NONE = 0;
        public static final int OUTSCORED = 1;
        public static final int UNKNOWN = 0;
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent[] _emptyArray;
        public long defaultNetworkDurationMs;
        public long finalScore;
        public long initialScore;
        public int ipSupport;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId networkId;
        public long noDefaultNetworkDurationMs;
        public int previousDefaultNetworkLinkLayer;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId previousNetworkId;
        public int previousNetworkIpSupport;
        public int[] transportTypes;
        public long validationDurationMs;
        public DefaultNetworkEvent() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class DHCPEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int ERROR_CODE_FIELD_NUMBER = 3;
        public static final int STATE_TRANSITION_FIELD_NUMBER = 2;
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent[] _emptyArray;
        public int durationMs;
        public java.lang.String ifName;
        private int valueCase_;
        private java.lang.Object value_;
        public DHCPEvent() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent clear() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent clearValue() { return null; }
        protected int computeSerializedSize() { return 0; }
        public int getErrorCode() { return 0; }
        public java.lang.String getStateTransition() { return null; }
        public int getValueCase() { return 0; }
        public boolean hasErrorCode() { return false; }
        public boolean hasStateTransition() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent setErrorCode(int p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent setStateTransition(java.lang.String p0) { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class DNSLatencies extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies[] _emptyArray;
        public int aCount;
        public int aaaaCount;
        public int[] latenciesMs;
        public int queryCount;
        public int returnCode;
        public int type;
        public DNSLatencies() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class DNSLookupBatch extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch[] _emptyArray;
        public int[] eventTypes;
        public long getaddrinfoErrorCount;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] getaddrinfoErrors;
        public long getaddrinfoQueryCount;
        public long gethostbynameErrorCount;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] gethostbynameErrors;
        public long gethostbynameQueryCount;
        public int[] latenciesMs;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId networkId;
        public int[] returnCodes;
        public DNSLookupBatch() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class IpConnectivityEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int APF_PROGRAM_EVENT_FIELD_NUMBER = 9;
        public static final int APF_STATISTICS_FIELD_NUMBER = 10;
        public static final int CONNECT_STATISTICS_FIELD_NUMBER = 14;
        public static final int DEFAULT_NETWORK_EVENT_FIELD_NUMBER = 2;
        public static final int DHCP_EVENT_FIELD_NUMBER = 6;
        public static final int DNS_LATENCIES_FIELD_NUMBER = 13;
        public static final int DNS_LOOKUP_BATCH_FIELD_NUMBER = 5;
        public static final int IP_PROVISIONING_EVENT_FIELD_NUMBER = 7;
        public static final int IP_REACHABILITY_EVENT_FIELD_NUMBER = 3;
        public static final int NETWORK_EVENT_FIELD_NUMBER = 4;
        public static final int NETWORK_STATS_FIELD_NUMBER = 19;
        public static final int RA_EVENT_FIELD_NUMBER = 11;
        public static final int VALIDATION_PROBE_EVENT_FIELD_NUMBER = 8;
        public static final int WAKEUP_STATS_FIELD_NUMBER = 20;
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent[] _emptyArray;
        private int eventCase_;
        private java.lang.Object event_;
        public java.lang.String ifName;
        public int linkLayer;
        public int networkId;
        public long timeMs;
        public long transports;
        public IpConnectivityEvent() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent clear() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent clearEvent() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent getApfProgramEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics getApfStatistics() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics getConnectStatistics() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent getDefaultNetworkEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent getDhcpEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies getDnsLatencies() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch getDnsLookupBatch() { return null; }
        public int getEventCase() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent getIpProvisioningEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent getIpReachabilityEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent getNetworkEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats getNetworkStats() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent getRaEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent getValidationProbeEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats getWakeupStats() { return null; }
        public boolean hasApfProgramEvent() { return false; }
        public boolean hasApfStatistics() { return false; }
        public boolean hasConnectStatistics() { return false; }
        public boolean hasDefaultNetworkEvent() { return false; }
        public boolean hasDhcpEvent() { return false; }
        public boolean hasDnsLatencies() { return false; }
        public boolean hasDnsLookupBatch() { return false; }
        public boolean hasIpProvisioningEvent() { return false; }
        public boolean hasIpReachabilityEvent() { return false; }
        public boolean hasNetworkEvent() { return false; }
        public boolean hasNetworkStats() { return false; }
        public boolean hasRaEvent() { return false; }
        public boolean hasValidationProbeEvent() { return false; }
        public boolean hasWakeupStats() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setApfProgramEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setApfStatistics(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setConnectStatistics(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setDefaultNetworkEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setDhcpEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setDnsLatencies(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setDnsLookupBatch(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setIpProvisioningEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setIpReachabilityEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setNetworkEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setNetworkStats(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setRaEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setValidationProbeEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent p0) { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setWakeupStats(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats p0) { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class IpConnectivityLog extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog[] _emptyArray;
        public int droppedEvents;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent[] events;
        public int version;
        public IpConnectivityLog() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class IpProvisioningEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent[] _emptyArray;
        public int eventType;
        public java.lang.String ifName;
        public int latencyMs;
        public IpProvisioningEvent() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class IpReachabilityEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent[] _emptyArray;
        public int eventType;
        public java.lang.String ifName;
        public IpReachabilityEvent() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class NetworkEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent[] _emptyArray;
        public int eventType;
        public int latencyMs;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId networkId;
        public NetworkEvent() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class NetworkId extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId[] _emptyArray;
        public int networkId;
        public NetworkId() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class NetworkStats extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats[] _emptyArray;
        public long durationMs;
        public boolean everValidated;
        public int ipSupport;
        public int noConnectivityReports;
        public boolean portalFound;
        public int validationAttempts;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] validationEvents;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] validationStates;
        public NetworkStats() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class Pair extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] _emptyArray;
        public int key;
        public int value;
        public Pair() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class RaEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent[] _emptyArray;
        public long dnsslLifetime;
        public long prefixPreferredLifetime;
        public long prefixValidLifetime;
        public long rdnssLifetime;
        public long routeInfoLifetime;
        public long routerLifetime;
        public RaEvent() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class ValidationProbeEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent[] _emptyArray;
        public int latencyMs;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId networkId;
        public int probeResult;
        public int probeType;
        public ValidationProbeEvent() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class WakeupStats extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats[] _emptyArray;
        public long applicationWakeups;
        public long durationSec;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] ethertypeCounts;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] ipNextHeaderCounts;
        public long l2BroadcastCount;
        public long l2MulticastCount;
        public long l2UnicastCount;
        public long noUidWakeups;
        public long nonApplicationWakeups;
        public long rootWakeups;
        public long systemWakeups;
        public long totalWakeups;
        public WakeupStats() { super(); }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats[] emptyArray() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }
}
