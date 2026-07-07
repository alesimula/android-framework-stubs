package com.android.internal.config.sysui;

public class SystemUiSystemPropertiesFlags {
    private static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver MAIN_RESOLVER = null;
    public static final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag TEAMFOOD = null;
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver TEST_RESOLVER;
    public SystemUiSystemPropertiesFlags() {}
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag devFlag(java.lang.String p0) { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag devFlag(java.lang.String p0, int p1) { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag devFlag(java.lang.String p0, java.lang.String p1) { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver getResolver() { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag releasedFlag(java.lang.String p0) { return null; }
    public static com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag teamfoodFlag(java.lang.String p0) { return null; }

    public static class DebugResolver implements com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver {
        public DebugResolver() {}
        public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
        public int getIntValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return 0; }
        public java.lang.String getStringValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return null; }
        public final boolean isEnabled(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return false; }
    }

    public static final class Flag {
        public final com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag mDebugDefault = null;
        public final int mDefaultIntValue = 0;
        public final java.lang.String mDefaultStringValue = null;
        public final boolean mDefaultValue = false;
        public final java.lang.String mSysPropKey = null;
        public Flag(java.lang.String p0, int p1, com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p2) {}
        public Flag(java.lang.String p0, java.lang.String p1, com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p2) {}
        public Flag(java.lang.String p0, boolean p1, com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p2) {}
    }

    public static interface FlagResolver {
        public int getIntValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0);
        public java.lang.String getStringValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0);
        public boolean isEnabled(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0);
    }

    public static final class ProdResolver implements com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.FlagResolver {
        public ProdResolver() {}
        public int getIntValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return 0; }
        public java.lang.String getStringValue(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return null; }
        public boolean isEnabled(com.android.internal.config.sysui.SystemUiSystemPropertiesFlags.Flag p0) { return false; }
    }
}
