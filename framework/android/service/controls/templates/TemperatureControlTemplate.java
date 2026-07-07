package android.service.controls.templates;

public final class TemperatureControlTemplate extends android.service.controls.templates.ControlTemplate {
    private static final int ALL_FLAGS = 62;
    public static final int FLAG_MODE_COOL = 8;
    public static final int FLAG_MODE_ECO = 32;
    public static final int FLAG_MODE_HEAT = 4;
    public static final int FLAG_MODE_HEAT_COOL = 16;
    public static final int FLAG_MODE_OFF = 2;
    private static final java.lang.String KEY_CURRENT_ACTIVE_MODE = "key_current_active_mode";
    private static final java.lang.String KEY_CURRENT_MODE = "key_current_mode";
    private static final java.lang.String KEY_MODES = "key_modes";
    private static final java.lang.String KEY_TEMPLATE = "key_template";
    public static final int MODE_COOL = 3;
    public static final int MODE_ECO = 5;
    public static final int MODE_HEAT = 2;
    public static final int MODE_HEAT_COOL = 4;
    public static final int MODE_OFF = 1;
    public static final int MODE_UNKNOWN = 0;
    private static final int NUM_MODES = 6;
    private static final java.lang.String TAG = "ThermostatTemplate";
    private static final int TYPE = 7;
    private static final int[] modeToFlag = null;
    private final int mCurrentActiveMode = 0;
    private final int mCurrentMode = 0;
    private final int mModes = 0;
    private final android.service.controls.templates.ControlTemplate mTemplate = null;
    TemperatureControlTemplate(android.os.Bundle p0) { super((android.os.Bundle)null); }
    public TemperatureControlTemplate(java.lang.String p0, android.service.controls.templates.ControlTemplate p1, int p2, int p3, int p4) { super((android.os.Bundle)null); }
    public int getCurrentActiveMode() { return 0; }
    public int getCurrentMode() { return 0; }
    android.os.Bundle getDataBundle() { return null; }
    public int getModes() { return 0; }
    public android.service.controls.templates.ControlTemplate getTemplate() { return null; }
    public int getTemplateType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Mode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModeFlag {
    }
}
