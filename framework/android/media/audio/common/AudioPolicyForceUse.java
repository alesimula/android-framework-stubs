package android.media.audio.common;

public final class AudioPolicyForceUse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioPolicyForceUse> CREATOR = null;
    public static final int dock = 4;
    public static final int encodedSurround = 7;
    public static final int forCommunication = 1;
    public static final int forMedia = 0;
    public static final int forRecord = 2;
    public static final int forVibrateRinging = 3;
    public static final int hdmiSystemAudio = 6;
    public static final int systemSounds = 5;
    private int _tag;
    private java.lang.Object _value;
    public AudioPolicyForceUse() {}
    private AudioPolicyForceUse(int p0, java.lang.Object p1) {}
    private AudioPolicyForceUse(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.media.audio.common.AudioPolicyForceUse dock(byte p0) { return null; }
    public static android.media.audio.common.AudioPolicyForceUse encodedSurround(byte p0) { return null; }
    public static android.media.audio.common.AudioPolicyForceUse forCommunication(byte p0) { return null; }
    public static android.media.audio.common.AudioPolicyForceUse forMedia(byte p0) { return null; }
    public static android.media.audio.common.AudioPolicyForceUse forRecord(byte p0) { return null; }
    public static android.media.audio.common.AudioPolicyForceUse forVibrateRinging(byte p0) { return null; }
    public static android.media.audio.common.AudioPolicyForceUse hdmiSystemAudio(boolean p0) { return null; }
    public static android.media.audio.common.AudioPolicyForceUse systemSounds(boolean p0) { return null; }
    public int describeContents() { return 0; }
    public byte getDock() { return 0; }
    public byte getEncodedSurround() { return 0; }
    public byte getForCommunication() { return 0; }
    public byte getForMedia() { return 0; }
    public byte getForRecord() { return 0; }
    public byte getForVibrateRinging() { return 0; }
    public boolean getHdmiSystemAudio() { return false; }
    public final int getStability() { return 0; }
    public boolean getSystemSounds() { return false; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setDock(byte p0) {}
    public void setEncodedSurround(byte p0) {}
    public void setForCommunication(byte p0) {}
    public void setForMedia(byte p0) {}
    public void setForRecord(byte p0) {}
    public void setForVibrateRinging(byte p0) {}
    public void setHdmiSystemAudio(boolean p0) {}
    public void setSystemSounds(boolean p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface CommunicationDeviceCategory {
        public static final byte BT_BLE = 3;
        public static final byte BT_SCO = 2;
        public static final byte NONE = 0;
        public static final byte SPEAKER = 1;
        public static final byte WIRED_ACCESSORY = 4;
    }

    public static @interface DockType {
        public static final byte ANALOG_DOCK = 3;
        public static final byte BT_CAR_DOCK = 1;
        public static final byte BT_DESK_DOCK = 2;
        public static final byte DIGITAL_DOCK = 4;
        public static final byte NONE = 0;
        public static final byte WIRED_ACCESSORY = 5;
    }

    public static @interface EncodedSurroundConfig {
        public static final byte ALWAYS = 2;
        public static final byte MANUAL = 3;
        public static final byte NEVER = 1;
        public static final byte UNSPECIFIED = 0;
    }

    public static @interface MediaDeviceCategory {
        public static final byte ANALOG_DOCK = 4;
        public static final byte BT_A2DP = 3;
        public static final byte DIGITAL_DOCK = 5;
        public static final byte HEADPHONES = 2;
        public static final byte NONE = 0;
        public static final byte NO_BT_A2DP = 7;
        public static final byte SPEAKER = 1;
        public static final byte WIRED_ACCESSORY = 6;
    }

    public static @interface Tag {
        public static final int dock = 4;
        public static final int encodedSurround = 7;
        public static final int forCommunication = 1;
        public static final int forMedia = 0;
        public static final int forRecord = 2;
        public static final int forVibrateRinging = 3;
        public static final int hdmiSystemAudio = 6;
        public static final int systemSounds = 5;
    }
}
