package android.app;

public interface IUiModeManager extends android.os.IInterface {
    public void addCallback(android.app.IUiModeManagerCallback p0, int p1) throws android.os.RemoteException;
    public void addOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0, int p1) throws android.os.RemoteException;
    public void disableCarMode(int p0) throws android.os.RemoteException;
    public void disableCarModeByCallingPackage(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void enableCarMode(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int getActiveProjectionTypes() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllForceInvertAlwaysDisableApps(int p0) throws android.os.RemoteException;
    public int getAttentionModeThemeOverlay() throws android.os.RemoteException;
    public float getContrast(int p0) throws android.os.RemoteException;
    public int getCurrentModeType(int p0) throws android.os.RemoteException;
    public long getCustomNightModeEnd() throws android.os.RemoteException;
    public long getCustomNightModeStart() throws android.os.RemoteException;
    public int getForceInvertOverrideState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getForceInvertState(int p0) throws android.os.RemoteException;
    public int getNightMode(int p0) throws android.os.RemoteException;
    public int getNightModeCustomType() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getProjectingPackages(int p0) throws android.os.RemoteException;
    public boolean isNightModeLocked() throws android.os.RemoteException;
    public boolean isUiModeLocked() throws android.os.RemoteException;
    public boolean releaseProjection(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void removeCallback(android.app.IUiModeManagerCallback p0, int p1) throws android.os.RemoteException;
    public void removeOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0) throws android.os.RemoteException;
    public boolean requestProjection(android.os.IBinder p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setApplicationNightMode(int p0) throws android.os.RemoteException;
    public void setAttentionModeThemeOverlay(int p0) throws android.os.RemoteException;
    public void setCustomNightModeEnd(long p0) throws android.os.RemoteException;
    public void setCustomNightModeStart(long p0) throws android.os.RemoteException;
    public boolean setForceInvertOverrideState(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setNightMode(int p0) throws android.os.RemoteException;
    public boolean setNightModeActivated(boolean p0) throws android.os.RemoteException;
    public boolean setNightModeActivatedForCustomMode(int p0, boolean p1) throws android.os.RemoteException;
    public void setNightModeCustomType(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.IUiModeManager {
        public Default() {}
        public void addCallback(android.app.IUiModeManagerCallback p0, int p1) throws android.os.RemoteException {}
        public void addOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void disableCarMode(int p0) throws android.os.RemoteException {}
        public void disableCarModeByCallingPackage(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void enableCarMode(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public int getActiveProjectionTypes() throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getAllForceInvertAlwaysDisableApps(int p0) throws android.os.RemoteException { return null; }
        public int getAttentionModeThemeOverlay() throws android.os.RemoteException { return 0; }
        public float getContrast(int p0) throws android.os.RemoteException { return 0.0f; }
        public int getCurrentModeType(int p0) throws android.os.RemoteException { return 0; }
        public long getCustomNightModeEnd() throws android.os.RemoteException { return 0L; }
        public long getCustomNightModeStart() throws android.os.RemoteException { return 0L; }
        public int getForceInvertOverrideState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getForceInvertState(int p0) throws android.os.RemoteException { return 0; }
        public int getNightMode(int p0) throws android.os.RemoteException { return 0; }
        public int getNightModeCustomType() throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getProjectingPackages(int p0) throws android.os.RemoteException { return null; }
        public boolean isNightModeLocked() throws android.os.RemoteException { return false; }
        public boolean isUiModeLocked() throws android.os.RemoteException { return false; }
        public boolean releaseProjection(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void removeCallback(android.app.IUiModeManagerCallback p0, int p1) throws android.os.RemoteException {}
        public void removeOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0) throws android.os.RemoteException {}
        public boolean requestProjection(android.os.IBinder p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setApplicationNightMode(int p0) throws android.os.RemoteException {}
        public void setAttentionModeThemeOverlay(int p0) throws android.os.RemoteException {}
        public void setCustomNightModeEnd(long p0) throws android.os.RemoteException {}
        public void setCustomNightModeStart(long p0) throws android.os.RemoteException {}
        public boolean setForceInvertOverrideState(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void setNightMode(int p0) throws android.os.RemoteException {}
        public boolean setNightModeActivated(boolean p0) throws android.os.RemoteException { return false; }
        public boolean setNightModeActivatedForCustomMode(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public void setNightModeCustomType(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IUiModeManager {
        public static final java.lang.String DESCRIPTOR = "android.app.IUiModeManager";
        static final int TRANSACTION_addCallback = 1;
        static final int TRANSACTION_addOnProjectionStateChangedListener = 24;
        static final int TRANSACTION_disableCarMode = 4;
        static final int TRANSACTION_disableCarModeByCallingPackage = 5;
        static final int TRANSACTION_enableCarMode = 3;
        static final int TRANSACTION_getActiveProjectionTypes = 27;
        static final int TRANSACTION_getAllForceInvertAlwaysDisableApps = 31;
        static final int TRANSACTION_getAttentionModeThemeOverlay = 12;
        static final int TRANSACTION_getContrast = 28;
        static final int TRANSACTION_getCurrentModeType = 6;
        static final int TRANSACTION_getCustomNightModeEnd = 20;
        static final int TRANSACTION_getCustomNightModeStart = 18;
        static final int TRANSACTION_getForceInvertOverrideState = 30;
        static final int TRANSACTION_getForceInvertState = 29;
        static final int TRANSACTION_getNightMode = 8;
        static final int TRANSACTION_getNightModeCustomType = 10;
        static final int TRANSACTION_getProjectingPackages = 26;
        static final int TRANSACTION_isNightModeLocked = 15;
        static final int TRANSACTION_isUiModeLocked = 14;
        static final int TRANSACTION_releaseProjection = 23;
        static final int TRANSACTION_removeCallback = 2;
        static final int TRANSACTION_removeOnProjectionStateChangedListener = 25;
        static final int TRANSACTION_requestProjection = 22;
        static final int TRANSACTION_setApplicationNightMode = 13;
        static final int TRANSACTION_setAttentionModeThemeOverlay = 11;
        static final int TRANSACTION_setCustomNightModeEnd = 21;
        static final int TRANSACTION_setCustomNightModeStart = 19;
        static final int TRANSACTION_setForceInvertOverrideState = 32;
        static final int TRANSACTION_setNightMode = 7;
        static final int TRANSACTION_setNightModeActivated = 17;
        static final int TRANSACTION_setNightModeActivatedForCustomMode = 16;
        static final int TRANSACTION_setNightModeCustomType = 9;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.app.IUiModeManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void addOnProjectionStateChangedListener_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void getActiveProjectionTypes_enforcePermission() throws java.lang.SecurityException {}
        protected void getAttentionModeThemeOverlay_enforcePermission() throws java.lang.SecurityException {}
        protected void getNightModeCustomType_enforcePermission() throws java.lang.SecurityException {}
        protected void getProjectingPackages_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void removeOnProjectionStateChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void setAttentionModeThemeOverlay_enforcePermission() throws java.lang.SecurityException {}
        protected void setForceInvertOverrideState_enforcePermission() throws java.lang.SecurityException {}
        protected void setNightModeCustomType_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.app.IUiModeManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addCallback(android.app.IUiModeManagerCallback p0, int p1) throws android.os.RemoteException {}
            public void addOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0, int p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void disableCarMode(int p0) throws android.os.RemoteException {}
            public void disableCarModeByCallingPackage(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void enableCarMode(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public int getActiveProjectionTypes() throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getAllForceInvertAlwaysDisableApps(int p0) throws android.os.RemoteException { return null; }
            public int getAttentionModeThemeOverlay() throws android.os.RemoteException { return 0; }
            public float getContrast(int p0) throws android.os.RemoteException { return 0.0f; }
            public int getCurrentModeType(int p0) throws android.os.RemoteException { return 0; }
            public long getCustomNightModeEnd() throws android.os.RemoteException { return 0L; }
            public long getCustomNightModeStart() throws android.os.RemoteException { return 0L; }
            public int getForceInvertOverrideState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getForceInvertState(int p0) throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getNightMode(int p0) throws android.os.RemoteException { return 0; }
            public int getNightModeCustomType() throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getProjectingPackages(int p0) throws android.os.RemoteException { return null; }
            public boolean isNightModeLocked() throws android.os.RemoteException { return false; }
            public boolean isUiModeLocked() throws android.os.RemoteException { return false; }
            public boolean releaseProjection(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void removeCallback(android.app.IUiModeManagerCallback p0, int p1) throws android.os.RemoteException {}
            public void removeOnProjectionStateChangedListener(android.app.IOnProjectionStateChangedListener p0) throws android.os.RemoteException {}
            public boolean requestProjection(android.os.IBinder p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setApplicationNightMode(int p0) throws android.os.RemoteException {}
            public void setAttentionModeThemeOverlay(int p0) throws android.os.RemoteException {}
            public void setCustomNightModeEnd(long p0) throws android.os.RemoteException {}
            public void setCustomNightModeStart(long p0) throws android.os.RemoteException {}
            public boolean setForceInvertOverrideState(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void setNightMode(int p0) throws android.os.RemoteException {}
            public boolean setNightModeActivated(boolean p0) throws android.os.RemoteException { return false; }
            public boolean setNightModeActivatedForCustomMode(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public void setNightModeCustomType(int p0) throws android.os.RemoteException {}
        }
    }
}
