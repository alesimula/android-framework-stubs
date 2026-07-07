package android.hardware.power;

public class ChannelConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.ChannelConfig> CREATOR = null;
    public android.hardware.common.fmq.MQDescriptor<android.hardware.power.ChannelMessage, java.lang.Byte> channelDescriptor;
    public android.hardware.common.fmq.MQDescriptor<java.lang.Byte, java.lang.Byte> eventFlagDescriptor;
    public int readFlagBitmask;
    public int writeFlagBitmask;
    public ChannelConfig() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
