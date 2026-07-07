package android.media.midi;

public final class MidiDeviceServer implements java.io.Closeable {
    private static final java.lang.String TAG = "MidiDeviceServer";
    private static final int UNUSED_UID = -1;
    private final android.media.midi.MidiDeviceServer.Callback mCallback = null;
    private android.media.midi.MidiDeviceInfo mDeviceInfo;
    private final java.util.HashMap<android.media.midi.MidiInputPort, android.media.midi.MidiDeviceServer.PortClient> mInputPortClients = null;
    private final int mInputPortCount = 0;
    private final com.android.internal.midi.MidiDispatcher.MidiReceiverFailureHandler mInputPortFailureHandler = null;
    private final boolean[] mInputPortOpen = null;
    private final android.media.midi.MidiOutputPort[] mInputPortOutputPorts = null;
    private final android.media.midi.MidiReceiver[] mInputPortReceivers = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.midi.MidiInputPort> mInputPorts = null;
    private boolean mIsClosed;
    private final android.media.midi.IMidiManager mMidiManager = null;
    private final int mOutputPortCount = 0;
    private com.android.internal.midi.MidiDispatcher[] mOutputPortDispatchers;
    private final int[] mOutputPortOpenCount = null;
    private final java.util.HashMap<android.os.IBinder, android.media.midi.MidiDeviceServer.PortClient> mPortClients = null;
    private final android.media.midi.IMidiDeviceServer mServer = null;
    private java.util.concurrent.atomic.AtomicInteger mTotalInputBytes;
    private java.util.concurrent.atomic.AtomicInteger mTotalOutputBytes;
    private final int[] mUmpInputPortUids = null;
    private final int[] mUmpOutputPortUids = null;
    private final java.lang.Object mUmpUidLock = null;
    MidiDeviceServer(android.media.midi.IMidiManager p0, android.media.midi.MidiReceiver[] p1, int p2, android.media.midi.MidiDeviceServer.Callback p3) {}
    MidiDeviceServer(android.media.midi.IMidiManager p0, android.media.midi.MidiReceiver[] p1, android.media.midi.MidiDeviceInfo p2, android.media.midi.MidiDeviceServer.Callback p3) {}
    private static java.io.FileDescriptor[] createSeqPacketSocketPair() throws java.io.IOException { return null; }
    private boolean isUmpDevice() { return false; }
    private void updateDeviceStatus() {}
    private void updateTotalBytes() {}
    public android.os.IBinder asBinder() { return null; }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    android.media.midi.IMidiDeviceServer getBinderInterface() { return null; }
    public android.media.midi.MidiReceiver[] getOutputPortReceivers() { return null; }

    public static interface Callback {
        public void onClose();
        public void onDeviceStatusChanged(android.media.midi.MidiDeviceServer p0, android.media.midi.MidiDeviceStatus p1);
    }

    private class InputPortClient extends android.media.midi.MidiDeviceServer.PortClient {
        private final android.media.midi.MidiOutputPort mOutputPort = null;
        InputPortClient(android.media.midi.MidiDeviceServer p0, android.os.IBinder p1, android.media.midi.MidiOutputPort p2) { super(null, null); }
        void close() {}
    }

    private class OutputPortClient extends android.media.midi.MidiDeviceServer.PortClient {
        private final android.media.midi.MidiInputPort mInputPort = null;
        OutputPortClient(android.media.midi.MidiDeviceServer p0, android.os.IBinder p1, android.media.midi.MidiInputPort p2) { super(null, null); }
        void close() {}
        android.media.midi.MidiInputPort getInputPort() { return null; }
    }

    private abstract class PortClient implements android.os.IBinder.DeathRecipient {
        final android.os.IBinder mToken = null;
        PortClient(android.media.midi.MidiDeviceServer p0, android.os.IBinder p1) {}
        public void binderDied() {}
        abstract void close();
        android.media.midi.MidiInputPort getInputPort() { return null; }
    }
}
