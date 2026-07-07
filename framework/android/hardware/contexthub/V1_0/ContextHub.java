package android.hardware.contexthub.V1_0;

public final class ContextHub {
    public byte chreApiMajorVersion;
    public byte chreApiMinorVersion;
    public short chrePatchVersion;
    public long chrePlatformId;
    public java.util.ArrayList<android.hardware.contexthub.V1_0.PhysicalSensor> connectedSensors;
    public int hubId;
    public int maxSupportedMsgLen;
    public java.lang.String name;
    public float peakMips;
    public float peakPowerDrawMw;
    public int platformVersion;
    public float sleepPowerDrawMw;
    public float stoppedPowerDrawMw;
    public java.lang.String toolchain;
    public int toolchainVersion;
    public java.lang.String vendor;
    public ContextHub() {}
    public static final java.util.ArrayList<android.hardware.contexthub.V1_0.ContextHub> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.contexthub.V1_0.ContextHub> p1) {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void readFromParcel(android.os.HwParcel p0) {}
    public final java.lang.String toString() { return null; }
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
}
