package android.mtp;

public class MtpDeviceInfo {
    private int[] mDevicePropertySupported;
    private int[] mEventsSupported;
    private java.lang.String mManufacturer;
    private java.lang.String mModel;
    private int[] mOperationsSupported;
    private java.lang.String mSerialNumber;
    private java.lang.String mVersion;
    private MtpDeviceInfo() {}
    private static boolean isSupported(int[] p0, int p1) { return false; }
    public final int[] getDevicePropertySupported() { return null; }
    public final int[] getEventsSupported() { return null; }
    public final java.lang.String getManufacturer() { return null; }
    public final java.lang.String getModel() { return null; }
    public final int[] getOperationsSupported() { return null; }
    public final java.lang.String getSerialNumber() { return null; }
    public final java.lang.String getVersion() { return null; }
    public boolean isDevicePropertySupported(int p0) { return false; }
    public boolean isEventSupported(int p0) { return false; }
    public boolean isOperationSupported(int p0) { return false; }
}
