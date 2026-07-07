package android.se.omapi;

public final class Channel implements java.nio.channels.Channel {
    private static final java.lang.String TAG = "OMAPI.Channel";
    private final android.se.omapi.ISecureElementChannel mChannel = null;
    private final java.lang.Object mLock = null;
    private final android.se.omapi.SEService mService = null;
    private android.se.omapi.Session mSession;
    Channel(android.se.omapi.SEService p0, android.se.omapi.Session p1, android.se.omapi.ISecureElementChannel p2) {}
    public void close() {}
    public byte[] getSelectResponse() { return null; }
    public android.se.omapi.Session getSession() { return null; }
    public boolean isBasicChannel() { return false; }
    public boolean isOpen() { return false; }
    public boolean selectNext() throws java.io.IOException { return false; }
    public byte[] transmit(byte[] p0) throws java.io.IOException { return null; }
}
