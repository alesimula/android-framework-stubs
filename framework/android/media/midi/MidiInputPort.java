package android.media.midi;

public final class MidiInputPort extends android.media.midi.MidiReceiver implements java.io.Closeable {
    private static final java.lang.String TAG = "MidiInputPort";
    private final byte[] mBuffer = null;
    private android.media.midi.IMidiDeviceServer mDeviceServer;
    private java.io.FileDescriptor mFileDescriptor;
    private boolean mIsClosed;
    private java.io.FileOutputStream mOutputStream;
    private final int mPortNumber = 0;
    private final android.os.IBinder mToken = null;
    private java.util.concurrent.atomic.AtomicInteger mTotalBytes;
    MidiInputPort(android.media.midi.IMidiDeviceServer p0, android.os.IBinder p1, java.io.FileDescriptor p2, int p3) { super(); }
    MidiInputPort(java.io.FileDescriptor p0, int p1) { super(); }
    java.io.FileDescriptor claimFileDescriptor() { return null; }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    android.media.midi.IMidiDeviceServer getDeviceServer() { return null; }
    public final int getPortNumber() { return 0; }
    android.os.IBinder getToken() { return null; }
    public void onFlush() throws java.io.IOException {}
    public void onSend(byte[] p0, int p1, int p2, long p3) throws java.io.IOException {}
    public int pullTotalBytesCount() { return 0; }
}
