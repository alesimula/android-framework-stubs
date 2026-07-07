package android.hardware.serial;

class CompatibleOutcomeReceiver implements android.os.OutcomeReceiver<android.hardware.serial.SerialPortResponse, java.lang.Exception> {
    private java.lang.Exception mException;
    private final java.util.concurrent.CountDownLatch mLatch = null;
    private android.hardware.serial.SerialPortResponse mResponse;
    CompatibleOutcomeReceiver() {}
    public void onError(java.lang.Exception p0) {}
    public void onResult(android.hardware.serial.SerialPortResponse p0) {}
    android.hardware.serial.SerialPortResponse waitForResult() throws java.lang.Exception { return null; }
}
