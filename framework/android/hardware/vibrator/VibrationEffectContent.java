package android.hardware.vibrator;

public final class VibrationEffectContent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.VibrationEffectContent> CREATOR = null;
    public static final int composite = 1;
    public static final int oneShotPrimitive = 2;
    public static final int predefined = 3;
    public static final int pwleV2Primitive = 4;
    public static final int reserved = 0;
    private int _tag;
    private java.lang.Object _value;
    public VibrationEffectContent() {}
    private VibrationEffectContent(int p0, java.lang.Object p1) {}
    private VibrationEffectContent(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.vibrator.VibrationEffectContent composite(android.hardware.vibrator.CompositeEffect p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.vibrator.VibrationEffectContent oneShotPrimitive(android.hardware.vibrator.OneShotPrimitive p0) { return null; }
    public static android.hardware.vibrator.VibrationEffectContent predefined(android.hardware.vibrator.PredefinedEffect p0) { return null; }
    public static android.hardware.vibrator.VibrationEffectContent pwleV2Primitive(android.hardware.vibrator.PwleV2Primitive p0) { return null; }
    public static android.hardware.vibrator.VibrationEffectContent reserved(byte[] p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.vibrator.CompositeEffect getComposite() { return null; }
    public android.hardware.vibrator.OneShotPrimitive getOneShotPrimitive() { return null; }
    public android.hardware.vibrator.PredefinedEffect getPredefined() { return null; }
    public android.hardware.vibrator.PwleV2Primitive getPwleV2Primitive() { return null; }
    public byte[] getReserved() { return null; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setComposite(android.hardware.vibrator.CompositeEffect p0) {}
    public void setOneShotPrimitive(android.hardware.vibrator.OneShotPrimitive p0) {}
    public void setPredefined(android.hardware.vibrator.PredefinedEffect p0) {}
    public void setPwleV2Primitive(android.hardware.vibrator.PwleV2Primitive p0) {}
    public void setReserved(byte[] p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final byte composite = 1;
        public static final byte oneShotPrimitive = 2;
        public static final byte predefined = 3;
        public static final byte pwleV2Primitive = 4;
        public static final byte reserved = 0;
    }
}
