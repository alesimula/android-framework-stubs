package android.hardware.hid;

public @interface HidTransport {
    public static final int BLUETOOTH = 5;
    public static final int I2C = 24;
    public static final int SPI = 28;
    public static final int UNKNOWN = 0;
    public static final int USB = 3;
    public static final int VIRTUAL = 6;
}
