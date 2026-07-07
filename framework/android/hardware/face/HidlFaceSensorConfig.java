package android.hardware.face;

public final class HidlFaceSensorConfig extends android.hardware.biometrics.face.SensorProps {
    private int mModality;
    private int mSensorId;
    private int mStrength;
    public HidlFaceSensorConfig() { super(); }
    private byte authenticatorStrengthToPropertyStrength(int p0) { return 0; }
    private void mapHidlToAidlFaceSensorConfigurations(android.content.Context p0) {}
    public int getModality() { return 0; }
    public void parse(java.lang.String p0, android.content.Context p1) throws java.lang.IllegalArgumentException {}
}
