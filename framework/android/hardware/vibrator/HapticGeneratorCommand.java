package android.hardware.vibrator;

public final class HapticGeneratorCommand implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.HapticGeneratorCommand> CREATOR = null;
    public static final int burstBytes = 3;
    public static final int effect = 1;
    public static final int reserved = 0;
    public static final int session = 2;
    private int _tag;
    private java.lang.Object _value;
    public HapticGeneratorCommand() {}
    private HapticGeneratorCommand(int p0, java.lang.Object p1) {}
    private HapticGeneratorCommand(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.vibrator.HapticGeneratorCommand burstBytes(int p0) { return null; }
    public static android.hardware.vibrator.HapticGeneratorCommand effect(byte p0) { return null; }
    public static android.hardware.vibrator.HapticGeneratorCommand reserved(byte[] p0) { return null; }
    public static android.hardware.vibrator.HapticGeneratorCommand session(byte p0) { return null; }
    public int describeContents() { return 0; }
    public int getBurstBytes() { return 0; }
    public byte getEffect() { return 0; }
    public byte[] getReserved() { return null; }
    public byte getSession() { return 0; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setBurstBytes(int p0) {}
    public void setEffect(byte p0) {}
    public void setReserved(byte[] p0) {}
    public void setSession(byte p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Effect {
        public static final byte CANCEL = 2;
        public static final byte COMPLETE = 1;
        public static final byte START = 0;
    }

    public static @interface Session {
        public static final byte CLOSE = 0;
    }

    public static @interface Tag {
        public static final byte burstBytes = 3;
        public static final byte effect = 1;
        public static final byte reserved = 0;
        public static final byte session = 2;
    }
}
