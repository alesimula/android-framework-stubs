package android.hardware.hid;

public interface HidEventListener {
    public void onDisconnected();
    public void onError(java.lang.Exception p0);
    public void onInputReport(android.hardware.hid.Report p0);
}
