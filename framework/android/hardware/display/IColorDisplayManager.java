package android.hardware.display;

public interface IColorDisplayManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.display.IColorDisplayManager";
    public int getColorMode() throws android.os.RemoteException;
    public int getNightDisplayAutoMode() throws android.os.RemoteException;
    public int getNightDisplayAutoModeRaw() throws android.os.RemoteException;
    public int getNightDisplayColorTemperature() throws android.os.RemoteException;
    public android.hardware.display.Time getNightDisplayCustomEndTime() throws android.os.RemoteException;
    public android.hardware.display.Time getNightDisplayCustomStartTime() throws android.os.RemoteException;
    public float getReduceBrightColorsOffsetFactor() throws android.os.RemoteException;
    public int getReduceBrightColorsStrength() throws android.os.RemoteException;
    public int getTransformCapabilities() throws android.os.RemoteException;
    public boolean isDeviceColorManaged() throws android.os.RemoteException;
    public boolean isDisplayWhiteBalanceEnabled() throws android.os.RemoteException;
    public boolean isNightDisplayActivated() throws android.os.RemoteException;
    public boolean isReduceBrightColorsActivated() throws android.os.RemoteException;
    public boolean isSaturationActivated() throws android.os.RemoteException;
    public boolean setAppSaturationLevel(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setColorMode(int p0) throws android.os.RemoteException;
    public boolean setDisplayWhiteBalanceEnabled(boolean p0) throws android.os.RemoteException;
    public boolean setNightDisplayActivated(boolean p0) throws android.os.RemoteException;
    public boolean setNightDisplayAutoMode(int p0) throws android.os.RemoteException;
    public boolean setNightDisplayColorTemperature(int p0) throws android.os.RemoteException;
    public boolean setNightDisplayCustomEndTime(android.hardware.display.Time p0) throws android.os.RemoteException;
    public boolean setNightDisplayCustomStartTime(android.hardware.display.Time p0) throws android.os.RemoteException;
    public boolean setReduceBrightColorsActivated(boolean p0) throws android.os.RemoteException;
    public boolean setReduceBrightColorsStrength(int p0) throws android.os.RemoteException;
    public boolean setSaturationLevel(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.display.IColorDisplayManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public int getColorMode() throws android.os.RemoteException { return 0; }
        public int getNightDisplayAutoMode() throws android.os.RemoteException { return 0; }
        public int getNightDisplayAutoModeRaw() throws android.os.RemoteException { return 0; }
        public int getNightDisplayColorTemperature() throws android.os.RemoteException { return 0; }
        public android.hardware.display.Time getNightDisplayCustomEndTime() throws android.os.RemoteException { return null; }
        public android.hardware.display.Time getNightDisplayCustomStartTime() throws android.os.RemoteException { return null; }
        public float getReduceBrightColorsOffsetFactor() throws android.os.RemoteException { return 0.0f; }
        public int getReduceBrightColorsStrength() throws android.os.RemoteException { return 0; }
        public int getTransformCapabilities() throws android.os.RemoteException { return 0; }
        public boolean isDeviceColorManaged() throws android.os.RemoteException { return false; }
        public boolean isDisplayWhiteBalanceEnabled() throws android.os.RemoteException { return false; }
        public boolean isNightDisplayActivated() throws android.os.RemoteException { return false; }
        public boolean isReduceBrightColorsActivated() throws android.os.RemoteException { return false; }
        public boolean isSaturationActivated() throws android.os.RemoteException { return false; }
        public boolean setAppSaturationLevel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setColorMode(int p0) throws android.os.RemoteException {}
        public boolean setDisplayWhiteBalanceEnabled(boolean p0) throws android.os.RemoteException { return false; }
        public boolean setNightDisplayActivated(boolean p0) throws android.os.RemoteException { return false; }
        public boolean setNightDisplayAutoMode(int p0) throws android.os.RemoteException { return false; }
        public boolean setNightDisplayColorTemperature(int p0) throws android.os.RemoteException { return false; }
        public boolean setNightDisplayCustomEndTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
        public boolean setNightDisplayCustomStartTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
        public boolean setReduceBrightColorsActivated(boolean p0) throws android.os.RemoteException { return false; }
        public boolean setReduceBrightColorsStrength(int p0) throws android.os.RemoteException { return false; }
        public boolean setSaturationLevel(int p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.display.IColorDisplayManager {
        static final int TRANSACTION_getColorMode = 17;
        static final int TRANSACTION_getNightDisplayAutoMode = 10;
        static final int TRANSACTION_getNightDisplayAutoModeRaw = 11;
        static final int TRANSACTION_getNightDisplayColorTemperature = 8;
        static final int TRANSACTION_getNightDisplayCustomEndTime = 15;
        static final int TRANSACTION_getNightDisplayCustomStartTime = 13;
        static final int TRANSACTION_getReduceBrightColorsOffsetFactor = 25;
        static final int TRANSACTION_getReduceBrightColorsStrength = 23;
        static final int TRANSACTION_getTransformCapabilities = 5;
        static final int TRANSACTION_isDeviceColorManaged = 1;
        static final int TRANSACTION_isDisplayWhiteBalanceEnabled = 19;
        static final int TRANSACTION_isNightDisplayActivated = 6;
        static final int TRANSACTION_isReduceBrightColorsActivated = 21;
        static final int TRANSACTION_isSaturationActivated = 4;
        static final int TRANSACTION_setAppSaturationLevel = 3;
        static final int TRANSACTION_setColorMode = 18;
        static final int TRANSACTION_setDisplayWhiteBalanceEnabled = 20;
        static final int TRANSACTION_setNightDisplayActivated = 7;
        static final int TRANSACTION_setNightDisplayAutoMode = 12;
        static final int TRANSACTION_setNightDisplayColorTemperature = 9;
        static final int TRANSACTION_setNightDisplayCustomEndTime = 16;
        static final int TRANSACTION_setNightDisplayCustomStartTime = 14;
        static final int TRANSACTION_setReduceBrightColorsActivated = 22;
        static final int TRANSACTION_setReduceBrightColorsStrength = 24;
        static final int TRANSACTION_setSaturationLevel = 2;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.display.IColorDisplayManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void getNightDisplayAutoMode_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void getTransformCapabilities_enforcePermission() throws java.lang.SecurityException {}
        protected void isSaturationActivated_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setAppSaturationLevel_enforcePermission() throws java.lang.SecurityException {}
        protected void setColorMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setDisplayWhiteBalanceEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setNightDisplayActivated_enforcePermission() throws java.lang.SecurityException {}
        protected void setNightDisplayAutoMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setNightDisplayColorTemperature_enforcePermission() throws java.lang.SecurityException {}
        protected void setNightDisplayCustomEndTime_enforcePermission() throws java.lang.SecurityException {}
        protected void setNightDisplayCustomStartTime_enforcePermission() throws java.lang.SecurityException {}
        protected void setReduceBrightColorsActivated_enforcePermission() throws java.lang.SecurityException {}
        protected void setReduceBrightColorsStrength_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.display.IColorDisplayManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public int getColorMode() throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getNightDisplayAutoMode() throws android.os.RemoteException { return 0; }
            public int getNightDisplayAutoModeRaw() throws android.os.RemoteException { return 0; }
            public int getNightDisplayColorTemperature() throws android.os.RemoteException { return 0; }
            public android.hardware.display.Time getNightDisplayCustomEndTime() throws android.os.RemoteException { return null; }
            public android.hardware.display.Time getNightDisplayCustomStartTime() throws android.os.RemoteException { return null; }
            public float getReduceBrightColorsOffsetFactor() throws android.os.RemoteException { return 0.0f; }
            public int getReduceBrightColorsStrength() throws android.os.RemoteException { return 0; }
            public int getTransformCapabilities() throws android.os.RemoteException { return 0; }
            public boolean isDeviceColorManaged() throws android.os.RemoteException { return false; }
            public boolean isDisplayWhiteBalanceEnabled() throws android.os.RemoteException { return false; }
            public boolean isNightDisplayActivated() throws android.os.RemoteException { return false; }
            public boolean isReduceBrightColorsActivated() throws android.os.RemoteException { return false; }
            public boolean isSaturationActivated() throws android.os.RemoteException { return false; }
            public boolean setAppSaturationLevel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setColorMode(int p0) throws android.os.RemoteException {}
            public boolean setDisplayWhiteBalanceEnabled(boolean p0) throws android.os.RemoteException { return false; }
            public boolean setNightDisplayActivated(boolean p0) throws android.os.RemoteException { return false; }
            public boolean setNightDisplayAutoMode(int p0) throws android.os.RemoteException { return false; }
            public boolean setNightDisplayColorTemperature(int p0) throws android.os.RemoteException { return false; }
            public boolean setNightDisplayCustomEndTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
            public boolean setNightDisplayCustomStartTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
            public boolean setReduceBrightColorsActivated(boolean p0) throws android.os.RemoteException { return false; }
            public boolean setReduceBrightColorsStrength(int p0) throws android.os.RemoteException { return false; }
            public boolean setSaturationLevel(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
