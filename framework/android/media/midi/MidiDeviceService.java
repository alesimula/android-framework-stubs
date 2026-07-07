package android.media.midi;

public abstract class MidiDeviceService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.media.midi.MidiDeviceService";
    private static final java.lang.String TAG = "MidiDeviceService";
    private final android.media.midi.MidiDeviceServer.Callback mCallback = null;
    private android.media.midi.MidiDeviceInfo mDeviceInfo;
    private android.media.midi.IMidiManager mMidiManager;
    private android.media.midi.MidiDeviceServer mServer;
    public MidiDeviceService() { super(); }
    public final android.media.midi.MidiDeviceInfo getDeviceInfo() { return null; }
    public final android.media.midi.MidiReceiver[] getOutputPortReceivers() { return null; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onClose() {}
    public void onCreate() {}
    public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) {}
    public abstract android.media.midi.MidiReceiver[] onGetInputPortReceivers();
}
