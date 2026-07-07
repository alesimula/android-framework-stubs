package android.hardware.input;

public final class ButtonCustomizationTrigger extends android.hardware.input.CustomizationTrigger {
    public static final int CUSTOMIZABLE_BUTTON_BACK = 8;
    public static final int CUSTOMIZABLE_BUTTON_EXTRA = 128;
    public static final int CUSTOMIZABLE_BUTTON_FORWARD = 16;
    public static final int CUSTOMIZABLE_BUTTON_SIDE = 256;
    public static final int CUSTOMIZABLE_BUTTON_TASK = 512;
    public static final int CUSTOMIZABLE_BUTTON_TERTIARY = 4;
    public ButtonCustomizationTrigger(int p0) { super(null); }
    public ButtonCustomizationTrigger(android.hardware.input.AidlCustomizationTrigger p0) { super(null); }
    public static boolean isValidButtonCode(int p0) { return false; }
    public int getButtonCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CustomizableButton {
    }
}
