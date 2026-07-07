package android.media.midi;

public final class MidiDeviceStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.midi.MidiDeviceStatus> CREATOR = null;
    private static final java.lang.String TAG = "MidiDeviceStatus";
    private final android.media.midi.MidiDeviceInfo mDeviceInfo = null;
    private final boolean[] mInputPortOpen = null;
    private final int[] mOutputPortOpenCount = null;
    public MidiDeviceStatus(android.media.midi.MidiDeviceInfo p0) {}
    public MidiDeviceStatus(android.media.midi.MidiDeviceInfo p0, boolean[] p1, int[] p2) {}
    public int describeContents() { return 0; }
    public android.media.midi.MidiDeviceInfo getDeviceInfo() { return null; }
    public int getOutputPortOpenCount(int p0) { return 0; }
    public boolean isInputPortOpen(int p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
