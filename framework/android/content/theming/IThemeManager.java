package android.content.theming;

public interface IThemeManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.theming.IThemeManager";
    public android.os.FabricatedOverlayInternal generateDynamicColorOverlay(android.content.theming.ThemeInfo p0) throws android.os.RemoteException;
    public android.content.theming.ThemeSettings getThemeSettings() throws android.os.RemoteException;
    public android.content.theming.ThemeSettings getThemeSettingsOrDefault() throws android.os.RemoteException;
    public android.content.theming.ThemeInfo getUserThemeInfo() throws android.os.RemoteException;
    public boolean registerThemeChangedCallback(android.content.theming.IThemeChangedCallback p0) throws android.os.RemoteException;
    public boolean registerThemeSettingsCallback(android.content.theming.IThemeSettingsCallback p0) throws android.os.RemoteException;
    public boolean unregisterThemeChangedCallback(android.content.theming.IThemeChangedCallback p0) throws android.os.RemoteException;
    public boolean unregisterThemeSettingsCallback(android.content.theming.IThemeSettingsCallback p0) throws android.os.RemoteException;
    public boolean updateThemeSettings(android.content.theming.ThemeSettings p0) throws android.os.RemoteException;

    public static class Default implements android.content.theming.IThemeManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.os.FabricatedOverlayInternal generateDynamicColorOverlay(android.content.theming.ThemeInfo p0) throws android.os.RemoteException { return null; }
        public android.content.theming.ThemeSettings getThemeSettings() throws android.os.RemoteException { return null; }
        public android.content.theming.ThemeSettings getThemeSettingsOrDefault() throws android.os.RemoteException { return null; }
        public android.content.theming.ThemeInfo getUserThemeInfo() throws android.os.RemoteException { return null; }
        public boolean registerThemeChangedCallback(android.content.theming.IThemeChangedCallback p0) throws android.os.RemoteException { return false; }
        public boolean registerThemeSettingsCallback(android.content.theming.IThemeSettingsCallback p0) throws android.os.RemoteException { return false; }
        public boolean unregisterThemeChangedCallback(android.content.theming.IThemeChangedCallback p0) throws android.os.RemoteException { return false; }
        public boolean unregisterThemeSettingsCallback(android.content.theming.IThemeSettingsCallback p0) throws android.os.RemoteException { return false; }
        public boolean updateThemeSettings(android.content.theming.ThemeSettings p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.theming.IThemeManager {
        static final int TRANSACTION_generateDynamicColorOverlay = 1;
        static final int TRANSACTION_getThemeSettings = 8;
        static final int TRANSACTION_getThemeSettingsOrDefault = 9;
        static final int TRANSACTION_getUserThemeInfo = 2;
        static final int TRANSACTION_registerThemeChangedCallback = 5;
        static final int TRANSACTION_registerThemeSettingsCallback = 3;
        static final int TRANSACTION_unregisterThemeChangedCallback = 6;
        static final int TRANSACTION_unregisterThemeSettingsCallback = 4;
        static final int TRANSACTION_updateThemeSettings = 7;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.content.theming.IThemeManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void updateThemeSettings_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.content.theming.IThemeManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.os.FabricatedOverlayInternal generateDynamicColorOverlay(android.content.theming.ThemeInfo p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.theming.ThemeSettings getThemeSettings() throws android.os.RemoteException { return null; }
            public android.content.theming.ThemeSettings getThemeSettingsOrDefault() throws android.os.RemoteException { return null; }
            public android.content.theming.ThemeInfo getUserThemeInfo() throws android.os.RemoteException { return null; }
            public boolean registerThemeChangedCallback(android.content.theming.IThemeChangedCallback p0) throws android.os.RemoteException { return false; }
            public boolean registerThemeSettingsCallback(android.content.theming.IThemeSettingsCallback p0) throws android.os.RemoteException { return false; }
            public boolean unregisterThemeChangedCallback(android.content.theming.IThemeChangedCallback p0) throws android.os.RemoteException { return false; }
            public boolean unregisterThemeSettingsCallback(android.content.theming.IThemeSettingsCallback p0) throws android.os.RemoteException { return false; }
            public boolean updateThemeSettings(android.content.theming.ThemeSettings p0) throws android.os.RemoteException { return false; }
        }
    }
}
