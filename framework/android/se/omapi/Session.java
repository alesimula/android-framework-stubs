package android.se.omapi;

public final class Session {
    private static final java.lang.String TAG = "OMAPI.Session";
    private final java.lang.Object mLock = null;
    private final android.se.omapi.Reader mReader = null;
    private final android.se.omapi.SEService mService = null;
    private final android.se.omapi.ISecureElementSession mSession = null;
    Session(android.se.omapi.SEService p0, android.se.omapi.ISecureElementSession p1, android.se.omapi.Reader p2) {}
    public void close() {}
    public void closeChannels() {}
    public byte[] getATR() { return null; }
    public android.se.omapi.Reader getReader() { return null; }
    public boolean isClosed() { return false; }
    public android.se.omapi.Channel openBasicChannel(byte[] p0) throws java.io.IOException { return null; }
    public android.se.omapi.Channel openBasicChannel(byte[] p0, byte p1) throws java.io.IOException { return null; }
    public android.se.omapi.Channel openLogicalChannel(byte[] p0) throws java.io.IOException { return null; }
    public android.se.omapi.Channel openLogicalChannel(byte[] p0, byte p1) throws java.io.IOException { return null; }
}
