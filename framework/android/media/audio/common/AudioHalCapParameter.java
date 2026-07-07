package android.media.audio.common;

public final class AudioHalCapParameter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapParameter> CREATOR = null;
    public static final int selectedInputSourceDevice = 1;
    public static final int selectedStrategyDevice = 0;
    public static final int strategyDeviceAddress = 2;
    public static final int streamVolumeProfile = 3;
    private int _tag;
    private java.lang.Object _value;
    public AudioHalCapParameter() {}
    private AudioHalCapParameter(int p0, java.lang.Object p1) {}
    private AudioHalCapParameter(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.media.audio.common.AudioHalCapParameter selectedInputSourceDevice(android.media.audio.common.AudioHalCapParameter.InputSourceDevice p0) { return null; }
    public static android.media.audio.common.AudioHalCapParameter selectedStrategyDevice(android.media.audio.common.AudioHalCapParameter.StrategyDevice p0) { return null; }
    public static android.media.audio.common.AudioHalCapParameter strategyDeviceAddress(android.media.audio.common.AudioHalCapParameter.StrategyDeviceAddress p0) { return null; }
    public static android.media.audio.common.AudioHalCapParameter streamVolumeProfile(android.media.audio.common.AudioHalCapParameter.StreamVolumeProfile p0) { return null; }
    public int describeContents() { return 0; }
    public android.media.audio.common.AudioHalCapParameter.InputSourceDevice getSelectedInputSourceDevice() { return null; }
    public android.media.audio.common.AudioHalCapParameter.StrategyDevice getSelectedStrategyDevice() { return null; }
    public final int getStability() { return 0; }
    public android.media.audio.common.AudioHalCapParameter.StrategyDeviceAddress getStrategyDeviceAddress() { return null; }
    public android.media.audio.common.AudioHalCapParameter.StreamVolumeProfile getStreamVolumeProfile() { return null; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setSelectedInputSourceDevice(android.media.audio.common.AudioHalCapParameter.InputSourceDevice p0) {}
    public void setSelectedStrategyDevice(android.media.audio.common.AudioHalCapParameter.StrategyDevice p0) {}
    public void setStrategyDeviceAddress(android.media.audio.common.AudioHalCapParameter.StrategyDeviceAddress p0) {}
    public void setStreamVolumeProfile(android.media.audio.common.AudioHalCapParameter.StreamVolumeProfile p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class InputSourceDevice implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapParameter.InputSourceDevice> CREATOR = null;
        public android.media.audio.common.AudioDeviceDescription device;
        public int inputSource;
        public boolean isSelected;
        public InputSourceDevice() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class StrategyDevice implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapParameter.StrategyDevice> CREATOR = null;
        public android.media.audio.common.AudioDeviceDescription device;
        public int id;
        public boolean isSelected;
        public StrategyDevice() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class StrategyDeviceAddress implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapParameter.StrategyDeviceAddress> CREATOR = null;
        public android.media.audio.common.AudioDeviceAddress deviceAddress;
        public int id;
        public StrategyDeviceAddress() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class StreamVolumeProfile implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapParameter.StreamVolumeProfile> CREATOR = null;
        public int profile;
        public int stream;
        public StreamVolumeProfile() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static @interface Tag {
        public static final int selectedInputSourceDevice = 1;
        public static final int selectedStrategyDevice = 0;
        public static final int strategyDeviceAddress = 2;
        public static final int streamVolumeProfile = 3;
    }
}
