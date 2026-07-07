package android.hardware.fingerprint;

public final class HidlFingerprintSensorConfig extends android.hardware.biometrics.fingerprint.SensorProps {
    private int mModality;
    private int mSensorId;
    private int mStrength;
    public HidlFingerprintSensorConfig() { super(); }
    private byte authenticatorStrengthToPropertyStrength(int p0) { return 0; }
    private void mapHidlToAidlSensorConfiguration(android.content.Context p0) {}
    private void setSensorLocation(int p0, int p1, int p2) {}
    public int getModality() { return 0; }
    public void parse(java.lang.String p0, android.content.Context p1) throws java.lang.IllegalArgumentException {}
}
