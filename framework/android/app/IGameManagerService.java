package android.app;

public interface IGameManagerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IGameManagerService";
    public void addGameModeListener(android.app.IGameModeListener p0) throws android.os.RemoteException;
    public void addGameStateListener(android.app.IGameStateListener p0) throws android.os.RemoteException;
    public int[] getAvailableGameModes(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getGameMode(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.app.GameModeInfo getGameModeInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public float getResolutionScalingFactor(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isAngleEnabled(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void notifyGraphicsEnvironmentSetup(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void removeGameModeListener(android.app.IGameModeListener p0) throws android.os.RemoteException;
    public void removeGameStateListener(android.app.IGameStateListener p0) throws android.os.RemoteException;
    public void setGameMode(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void setGameServiceProvider(java.lang.String p0) throws android.os.RemoteException;
    public void setGameState(java.lang.String p0, android.app.GameState p1, int p2) throws android.os.RemoteException;
    public void toggleGameDefaultFrameRate(boolean p0) throws android.os.RemoteException;
    public void updateCustomGameModeConfiguration(java.lang.String p0, android.app.GameModeConfiguration p1, int p2) throws android.os.RemoteException;
    public void updateResolutionScalingFactor(java.lang.String p0, int p1, float p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.app.IGameManagerService {
        public Default() {}
        public void addGameModeListener(android.app.IGameModeListener p0) throws android.os.RemoteException {}
        public void addGameStateListener(android.app.IGameStateListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public int[] getAvailableGameModes(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int getGameMode(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public android.app.GameModeInfo getGameModeInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public float getResolutionScalingFactor(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0.0f; }
        public boolean isAngleEnabled(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void notifyGraphicsEnvironmentSetup(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void removeGameModeListener(android.app.IGameModeListener p0) throws android.os.RemoteException {}
        public void removeGameStateListener(android.app.IGameStateListener p0) throws android.os.RemoteException {}
        public void setGameMode(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void setGameServiceProvider(java.lang.String p0) throws android.os.RemoteException {}
        public void setGameState(java.lang.String p0, android.app.GameState p1, int p2) throws android.os.RemoteException {}
        public void toggleGameDefaultFrameRate(boolean p0) throws android.os.RemoteException {}
        public void updateCustomGameModeConfiguration(java.lang.String p0, android.app.GameModeConfiguration p1, int p2) throws android.os.RemoteException {}
        public void updateResolutionScalingFactor(java.lang.String p0, int p1, float p2, int p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IGameManagerService {
        static final int TRANSACTION_addGameModeListener = 12;
        static final int TRANSACTION_addGameStateListener = 14;
        static final int TRANSACTION_getAvailableGameModes = 3;
        static final int TRANSACTION_getGameMode = 1;
        static final int TRANSACTION_getGameModeInfo = 7;
        static final int TRANSACTION_getResolutionScalingFactor = 10;
        static final int TRANSACTION_isAngleEnabled = 4;
        static final int TRANSACTION_notifyGraphicsEnvironmentSetup = 5;
        static final int TRANSACTION_removeGameModeListener = 13;
        static final int TRANSACTION_removeGameStateListener = 15;
        static final int TRANSACTION_setGameMode = 2;
        static final int TRANSACTION_setGameServiceProvider = 8;
        static final int TRANSACTION_setGameState = 6;
        static final int TRANSACTION_toggleGameDefaultFrameRate = 16;
        static final int TRANSACTION_updateCustomGameModeConfiguration = 11;
        static final int TRANSACTION_updateResolutionScalingFactor = 9;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.app.IGameManagerService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void toggleGameDefaultFrameRate_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.app.IGameManagerService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addGameModeListener(android.app.IGameModeListener p0) throws android.os.RemoteException {}
            public void addGameStateListener(android.app.IGameStateListener p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public int[] getAvailableGameModes(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int getGameMode(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public android.app.GameModeInfo getGameModeInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public float getResolutionScalingFactor(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0.0f; }
            public boolean isAngleEnabled(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void notifyGraphicsEnvironmentSetup(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void removeGameModeListener(android.app.IGameModeListener p0) throws android.os.RemoteException {}
            public void removeGameStateListener(android.app.IGameStateListener p0) throws android.os.RemoteException {}
            public void setGameMode(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void setGameServiceProvider(java.lang.String p0) throws android.os.RemoteException {}
            public void setGameState(java.lang.String p0, android.app.GameState p1, int p2) throws android.os.RemoteException {}
            public void toggleGameDefaultFrameRate(boolean p0) throws android.os.RemoteException {}
            public void updateCustomGameModeConfiguration(java.lang.String p0, android.app.GameModeConfiguration p1, int p2) throws android.os.RemoteException {}
            public void updateResolutionScalingFactor(java.lang.String p0, int p1, float p2, int p3) throws android.os.RemoteException {}
        }
    }
}
