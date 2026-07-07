package android.media.midi;

public final class MidiManager {
    public static final java.lang.String BLUETOOTH_MIDI_SERVICE_CLASS = "com.android.bluetoothmidiservice.BluetoothMidiService";
    public static final java.lang.String BLUETOOTH_MIDI_SERVICE_INTENT = "android.media.midi.BluetoothMidiService";
    public static final java.lang.String BLUETOOTH_MIDI_SERVICE_PACKAGE = "com.android.bluetoothmidiservice";
    private static final java.lang.String TAG = "MidiManager";
    public static final int TRANSPORT_MIDI_BYTE_STREAM = 1;
    public static final int TRANSPORT_UNIVERSAL_MIDI_PACKETS = 2;
    private java.util.concurrent.ConcurrentHashMap<android.media.midi.MidiManager.DeviceCallback, android.media.midi.MidiManager.DeviceListener> mDeviceListeners;
    private final android.media.midi.IMidiManager mService = null;
    private final android.os.IBinder mToken = null;
    public MidiManager(android.media.midi.IMidiManager p0) {}
    private void sendOpenDeviceResponse(android.media.midi.MidiDevice p0, android.media.midi.MidiManager.OnDeviceOpenedListener p1, android.os.Handler p2) {}
    public void closeBluetoothDevice(android.media.midi.MidiDevice p0) {}
    public android.media.midi.MidiDeviceServer createDeviceServer(android.media.midi.MidiReceiver[] p0, int p1, java.lang.String[] p2, java.lang.String[] p3, android.os.Bundle p4, int p5, int p6, android.media.midi.MidiDeviceServer.Callback p7) { return null; }
    @java.lang.Deprecated
    public android.media.midi.MidiDeviceInfo[] getDevices() { return null; }
    public java.util.Set<android.media.midi.MidiDeviceInfo> getDevicesForTransport(int p0) { return null; }
    public void openBluetoothDevice(android.bluetooth.BluetoothDevice p0, android.media.midi.MidiManager.OnDeviceOpenedListener p1, android.os.Handler p2) {}
    public void openDevice(android.media.midi.MidiDeviceInfo p0, android.media.midi.MidiManager.OnDeviceOpenedListener p1, android.os.Handler p2) {}
    public void registerDeviceCallback(int p0, java.util.concurrent.Executor p1, android.media.midi.MidiManager.DeviceCallback p2) {}
    @java.lang.Deprecated
    public void registerDeviceCallback(android.media.midi.MidiManager.DeviceCallback p0, android.os.Handler p1) {}
    public void unregisterDeviceCallback(android.media.midi.MidiManager.DeviceCallback p0) {}

    public static class DeviceCallback {
        public DeviceCallback() {}
        public void onDeviceAdded(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceRemoved(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) {}
    }

    private class DeviceListener extends android.media.midi.IMidiDeviceListener.Stub {
        private final android.media.midi.MidiManager.DeviceCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final int mTransport = 0;
        DeviceListener(android.media.midi.MidiManager p0, android.media.midi.MidiManager.DeviceCallback p1, java.util.concurrent.Executor p2, int p3) { super(); }
        private boolean shouldInvokeCallback(android.media.midi.MidiDeviceInfo p0) { return false; }
        public void onDeviceAdded(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceRemoved(android.media.midi.MidiDeviceInfo p0) {}
        public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) {}
    }

    public static interface OnDeviceOpenedListener {
        public void onDeviceOpened(android.media.midi.MidiDevice p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Transport {
    }
}
