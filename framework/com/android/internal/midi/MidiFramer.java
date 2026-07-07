package com.android.internal.midi;

public class MidiFramer extends android.media.midi.MidiReceiver {
    public java.lang.String TAG;
    private byte[] mBuffer;
    private int mCount;
    private boolean mInSysEx;
    private int mNeeded;
    private android.media.midi.MidiReceiver mReceiver;
    private byte mRunningStatus;
    public MidiFramer(android.media.midi.MidiReceiver p0) { super(); }
    public static java.lang.String formatMidiData(byte[] p0, int p1, int p2) { return null; }
    public void onSend(byte[] p0, int p1, int p2, long p3) throws java.io.IOException {}
}
