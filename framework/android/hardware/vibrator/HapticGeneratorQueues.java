package android.hardware.vibrator;

public class HapticGeneratorQueues implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.HapticGeneratorQueues> CREATOR = null;
    public android.hardware.common.fmq.MQDescriptor<android.hardware.vibrator.HapticGeneratorCommand, java.lang.Byte> command;
    public android.hardware.common.fmq.MQDescriptor<android.hardware.vibrator.VibrationEffectContent, java.lang.Byte> effect;
    public android.hardware.common.fmq.MQDescriptor<java.lang.Byte, java.lang.Byte> pcm;
    public android.hardware.common.fmq.MQDescriptor<android.hardware.vibrator.HapticGeneratorReply, java.lang.Byte> reply;
    public int vibratorId;
    public HapticGeneratorQueues() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
