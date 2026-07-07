package android.hardware.input;

public abstract class CustomizationTrigger {
    public static final int TRIGGER_TYPE_BUTTON = 2;
    public static final int TRIGGER_TYPE_KEY = 1;
    protected final android.hardware.input.AidlCustomizationTrigger mAidlTrigger = null;
    CustomizationTrigger(android.hardware.input.AidlCustomizationTrigger p0) {}
    static java.lang.String typeToString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.input.AidlCustomizationTrigger getAidlTrigger() { return null; }
    public int getTriggerType() { return 0; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TriggerType {
    }
}
