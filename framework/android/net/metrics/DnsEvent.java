package android.net.metrics;

public final class DnsEvent {
    private static final int SIZE_LIMIT = 20000;
    public int eventCount;
    public byte[] eventTypes;
    public int[] latenciesMs;
    public final int netId = 0;
    public byte[] returnCodes;
    public int successCount;
    public final long transports = 0L;
    public DnsEvent(int p0, long p1, int p2) {}
    boolean addResult(byte p0, byte p1, int p2) { return false; }
    public void resize(int p0) {}
    public java.lang.String toString() { return null; }
}
