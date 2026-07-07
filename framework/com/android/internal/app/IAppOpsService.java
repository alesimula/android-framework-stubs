package com.android.internal.app;

public interface IAppOpsService extends android.os.IInterface {
    public void addHistoricalOps(android.app.AppOpsManager.HistoricalOps p0) throws android.os.RemoteException;
    public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public int checkOperation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int checkOperationForDevice(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public int checkOperationRaw(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public int checkOperationRawForDevice(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public int checkPackage(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void clearHistory() throws android.os.RemoteException;
    public void collectNoteOpCallsForValidation(java.lang.String p0, int p1, java.lang.String p2, long p3) throws android.os.RemoteException;
    public android.app.RuntimeAppOpAccessMessage collectRuntimeAppOpAccessMessage() throws android.os.RemoteException;
    public java.util.List<android.app.AsyncNotedAppOp> extractAsyncOps(java.lang.String p0) throws android.os.RemoteException;
    public void finishOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void finishOperationForDevice(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5) throws android.os.RemoteException;
    public void finishProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3) throws android.os.RemoteException;
    public void finishProxyOperationWithState(android.os.IBinder p0, int p1, android.content.AttributionSourceState p2, boolean p3) throws android.os.RemoteException;
    public void getHistoricalOps(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException;
    public void getHistoricalOpsFromDiskRaw(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException;
    public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, int[] p2) throws android.os.RemoteException;
    public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.app.AppOpsManager.PackageOps> getPackagesForOpsForDevice(int[] p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPackagesWithNonDefaultUidMode(int p0, int p1, int p2) throws android.os.RemoteException;
    public java.util.List<android.app.AppOpsManager.PackageOps> getUidOps(int p0, int[] p1) throws android.os.RemoteException;
    public boolean isOperationActive(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isProxying(int p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp noteOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5, boolean p6) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp noteOperationForDevice(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, java.lang.String p6, boolean p7) throws android.os.RemoteException;
    public void noteOperationsInBatch(java.util.Map p0) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp noteProxyOperation(int p0, android.content.AttributionSource p1, boolean p2, java.lang.String p3, boolean p4, boolean p5) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp noteProxyOperationWithState(int p0, android.content.AttributionSourceState p1, boolean p2, java.lang.String p3, boolean p4, boolean p5) throws android.os.RemoteException;
    public void offsetHistory(long p0) throws android.os.RemoteException;
    public int permissionToOpCode(java.lang.String p0) throws android.os.RemoteException;
    public void rebootHistory(long p0) throws android.os.RemoteException;
    public void reloadNonHistoricalState() throws android.os.RemoteException;
    public void removeUser(int p0) throws android.os.RemoteException;
    public com.android.internal.app.MessageSamplingConfig reportRuntimeAppOpAccessMessageAndGetConfig(java.lang.String p0, android.app.SyncNotedAppOp p1, java.lang.String p2) throws android.os.RemoteException;
    public void resetAllModes(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void resetHistoryParameters() throws android.os.RemoteException;
    public void resetPackageOpsNoHistory(java.lang.String p0) throws android.os.RemoteException;
    public void setAudioRestriction(int p0, int[] p1, int p2, java.lang.String[] p3) throws android.os.RemoteException;
    public void setCameraAudioRestriction(int p0) throws android.os.RemoteException;
    public void setHistoryParameters(int p0, long p1, int p2) throws android.os.RemoteException;
    public void setMode(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void setUidMode(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2, int p3, android.os.PackageTagsList p4) throws android.os.RemoteException;
    public void setUserRestrictions(android.os.Bundle p0, android.os.IBinder p1, int p2) throws android.os.RemoteException;
    public boolean shouldCollectNotes(int p0) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp startOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, java.lang.String p7, boolean p8, int p9, int p10) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp startOperationForDevice(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5, boolean p6, boolean p7, java.lang.String p8, boolean p9, int p10, int p11) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp startProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, boolean p7, int p8, int p9, int p10) throws android.os.RemoteException;
    public android.app.SyncNotedAppOp startProxyOperationWithState(android.os.IBinder p0, int p1, android.content.AttributionSourceState p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, boolean p7, int p8, int p9, int p10) throws android.os.RemoteException;
    public void startWatchingActive(int[] p0, com.android.internal.app.IAppOpsActiveCallback p1) throws android.os.RemoteException;
    public void startWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException;
    public void startWatchingMode(int p0, java.lang.String p1, com.android.internal.app.IAppOpsCallback p2) throws android.os.RemoteException;
    public void startWatchingModeWithFlags(int p0, java.lang.String p1, int p2, com.android.internal.app.IAppOpsCallback p3) throws android.os.RemoteException;
    public void startWatchingNoted(int[] p0, com.android.internal.app.IAppOpsNotedCallback p1) throws android.os.RemoteException;
    public void startWatchingStarted(int[] p0, com.android.internal.app.IAppOpsStartedCallback p1) throws android.os.RemoteException;
    public void stopWatchingActive(com.android.internal.app.IAppOpsActiveCallback p0) throws android.os.RemoteException;
    public void stopWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException;
    public void stopWatchingMode(com.android.internal.app.IAppOpsCallback p0) throws android.os.RemoteException;
    public void stopWatchingNoted(com.android.internal.app.IAppOpsNotedCallback p0) throws android.os.RemoteException;
    public void stopWatchingStarted(com.android.internal.app.IAppOpsStartedCallback p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IAppOpsService {
        public Default() {}
        public void addHistoricalOps(android.app.AppOpsManager.HistoricalOps p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public int checkOperation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int checkOperationForDevice(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return 0; }
        public int checkOperationRaw(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public int checkOperationRawForDevice(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return 0; }
        public int checkPackage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void clearHistory() throws android.os.RemoteException {}
        public void collectNoteOpCallsForValidation(java.lang.String p0, int p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
        public android.app.RuntimeAppOpAccessMessage collectRuntimeAppOpAccessMessage() throws android.os.RemoteException { return null; }
        public java.util.List<android.app.AsyncNotedAppOp> extractAsyncOps(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void finishOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
        public void finishOperationForDevice(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5) throws android.os.RemoteException {}
        public void finishProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3) throws android.os.RemoteException {}
        public void finishProxyOperationWithState(android.os.IBinder p0, int p1, android.content.AttributionSourceState p2, boolean p3) throws android.os.RemoteException {}
        public void getHistoricalOps(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException {}
        public void getHistoricalOpsFromDiskRaw(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException {}
        public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, int[] p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice<android.app.AppOpsManager.PackageOps> getPackagesForOpsForDevice(int[] p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPackagesWithNonDefaultUidMode(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.AppOpsManager.PackageOps> getUidOps(int p0, int[] p1) throws android.os.RemoteException { return null; }
        public boolean isOperationActive(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isProxying(int p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException { return false; }
        public android.app.SyncNotedAppOp noteOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5, boolean p6) throws android.os.RemoteException { return null; }
        public android.app.SyncNotedAppOp noteOperationForDevice(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, java.lang.String p6, boolean p7) throws android.os.RemoteException { return null; }
        public void noteOperationsInBatch(java.util.Map p0) throws android.os.RemoteException {}
        public android.app.SyncNotedAppOp noteProxyOperation(int p0, android.content.AttributionSource p1, boolean p2, java.lang.String p3, boolean p4, boolean p5) throws android.os.RemoteException { return null; }
        public android.app.SyncNotedAppOp noteProxyOperationWithState(int p0, android.content.AttributionSourceState p1, boolean p2, java.lang.String p3, boolean p4, boolean p5) throws android.os.RemoteException { return null; }
        public void offsetHistory(long p0) throws android.os.RemoteException {}
        public int permissionToOpCode(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void rebootHistory(long p0) throws android.os.RemoteException {}
        public void reloadNonHistoricalState() throws android.os.RemoteException {}
        public void removeUser(int p0) throws android.os.RemoteException {}
        public com.android.internal.app.MessageSamplingConfig reportRuntimeAppOpAccessMessageAndGetConfig(java.lang.String p0, android.app.SyncNotedAppOp p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void resetAllModes(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void resetHistoryParameters() throws android.os.RemoteException {}
        public void resetPackageOpsNoHistory(java.lang.String p0) throws android.os.RemoteException {}
        public void setAudioRestriction(int p0, int[] p1, int p2, java.lang.String[] p3) throws android.os.RemoteException {}
        public void setCameraAudioRestriction(int p0) throws android.os.RemoteException {}
        public void setHistoryParameters(int p0, long p1, int p2) throws android.os.RemoteException {}
        public void setMode(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void setUidMode(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2, int p3, android.os.PackageTagsList p4) throws android.os.RemoteException {}
        public void setUserRestrictions(android.os.Bundle p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
        public boolean shouldCollectNotes(int p0) throws android.os.RemoteException { return false; }
        public android.app.SyncNotedAppOp startOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, java.lang.String p7, boolean p8, int p9, int p10) throws android.os.RemoteException { return null; }
        public android.app.SyncNotedAppOp startOperationForDevice(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5, boolean p6, boolean p7, java.lang.String p8, boolean p9, int p10, int p11) throws android.os.RemoteException { return null; }
        public android.app.SyncNotedAppOp startProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, boolean p7, int p8, int p9, int p10) throws android.os.RemoteException { return null; }
        public android.app.SyncNotedAppOp startProxyOperationWithState(android.os.IBinder p0, int p1, android.content.AttributionSourceState p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, boolean p7, int p8, int p9, int p10) throws android.os.RemoteException { return null; }
        public void startWatchingActive(int[] p0, com.android.internal.app.IAppOpsActiveCallback p1) throws android.os.RemoteException {}
        public void startWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
        public void startWatchingMode(int p0, java.lang.String p1, com.android.internal.app.IAppOpsCallback p2) throws android.os.RemoteException {}
        public void startWatchingModeWithFlags(int p0, java.lang.String p1, int p2, com.android.internal.app.IAppOpsCallback p3) throws android.os.RemoteException {}
        public void startWatchingNoted(int[] p0, com.android.internal.app.IAppOpsNotedCallback p1) throws android.os.RemoteException {}
        public void startWatchingStarted(int[] p0, com.android.internal.app.IAppOpsStartedCallback p1) throws android.os.RemoteException {}
        public void stopWatchingActive(com.android.internal.app.IAppOpsActiveCallback p0) throws android.os.RemoteException {}
        public void stopWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
        public void stopWatchingMode(com.android.internal.app.IAppOpsCallback p0) throws android.os.RemoteException {}
        public void stopWatchingNoted(com.android.internal.app.IAppOpsNotedCallback p0) throws android.os.RemoteException {}
        public void stopWatchingStarted(com.android.internal.app.IAppOpsStartedCallback p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IAppOpsService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IAppOpsService";
        static final int TRANSACTION_addHistoricalOps = 25;
        static final int TRANSACTION_checkAudioOperation = 8;
        static final int TRANSACTION_checkOperation = 1;
        static final int TRANSACTION_checkOperationForDevice = 12;
        static final int TRANSACTION_checkOperationRaw = 49;
        static final int TRANSACTION_checkOperationRawForDevice = 55;
        static final int TRANSACTION_checkPackage = 16;
        static final int TRANSACTION_clearHistory = 28;
        static final int TRANSACTION_collectNoteOpCallsForValidation = 51;
        static final int TRANSACTION_collectRuntimeAppOpAccessMessage = 17;
        static final int TRANSACTION_extractAsyncOps = 48;
        static final int TRANSACTION_finishOperation = 4;
        static final int TRANSACTION_finishOperationForDevice = 58;
        static final int TRANSACTION_finishProxyOperation = 15;
        static final int TRANSACTION_finishProxyOperationWithState = 54;
        static final int TRANSACTION_getHistoricalOps = 21;
        static final int TRANSACTION_getHistoricalOpsFromDiskRaw = 22;
        static final int TRANSACTION_getOpsForPackage = 20;
        static final int TRANSACTION_getPackagesForOps = 19;
        static final int TRANSACTION_getPackagesForOpsForDevice = 59;
        static final int TRANSACTION_getPackagesWithNonDefaultUidMode = 61;
        static final int TRANSACTION_getUidOps = 30;
        static final int TRANSACTION_isOperationActive = 40;
        static final int TRANSACTION_isProxying = 41;
        static final int TRANSACTION_noteOperation = 2;
        static final int TRANSACTION_noteOperationForDevice = 56;
        static final int TRANSACTION_noteOperationsInBatch = 60;
        static final int TRANSACTION_noteProxyOperation = 13;
        static final int TRANSACTION_noteProxyOperationWithState = 52;
        static final int TRANSACTION_offsetHistory = 23;
        static final int TRANSACTION_permissionToOpCode = 7;
        static final int TRANSACTION_rebootHistory = 29;
        static final int TRANSACTION_reloadNonHistoricalState = 50;
        static final int TRANSACTION_removeUser = 37;
        static final int TRANSACTION_reportRuntimeAppOpAccessMessageAndGetConfig = 18;
        static final int TRANSACTION_resetAllModes = 33;
        static final int TRANSACTION_resetHistoryParameters = 26;
        static final int TRANSACTION_resetPackageOpsNoHistory = 27;
        static final int TRANSACTION_setAudioRestriction = 34;
        static final int TRANSACTION_setCameraAudioRestriction = 10;
        static final int TRANSACTION_setHistoryParameters = 24;
        static final int TRANSACTION_setMode = 32;
        static final int TRANSACTION_setUidMode = 31;
        static final int TRANSACTION_setUserRestriction = 36;
        static final int TRANSACTION_setUserRestrictions = 35;
        static final int TRANSACTION_shouldCollectNotes = 9;
        static final int TRANSACTION_startOperation = 3;
        static final int TRANSACTION_startOperationForDevice = 57;
        static final int TRANSACTION_startProxyOperation = 14;
        static final int TRANSACTION_startProxyOperationWithState = 53;
        static final int TRANSACTION_startWatchingActive = 38;
        static final int TRANSACTION_startWatchingAsyncNoted = 46;
        static final int TRANSACTION_startWatchingMode = 5;
        static final int TRANSACTION_startWatchingModeWithFlags = 11;
        static final int TRANSACTION_startWatchingNoted = 44;
        static final int TRANSACTION_startWatchingStarted = 42;
        static final int TRANSACTION_stopWatchingActive = 39;
        static final int TRANSACTION_stopWatchingAsyncNoted = 47;
        static final int TRANSACTION_stopWatchingMode = 6;
        static final int TRANSACTION_stopWatchingNoted = 45;
        static final int TRANSACTION_stopWatchingStarted = 43;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static com.android.internal.app.IAppOpsService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void addHistoricalOps_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void clearHistory_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void offsetHistory_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void rebootHistory_enforcePermission() throws java.lang.SecurityException {}
        protected void resetHistoryParameters_enforcePermission() throws java.lang.SecurityException {}
        protected void resetPackageOpsNoHistory_enforcePermission() throws java.lang.SecurityException {}
        protected void setHistoryParameters_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements com.android.internal.app.IAppOpsService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addHistoricalOps(android.app.AppOpsManager.HistoricalOps p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public int checkOperation(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int checkOperationForDevice(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return 0; }
            public int checkOperationRaw(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public int checkOperationRawForDevice(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return 0; }
            public int checkPackage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void clearHistory() throws android.os.RemoteException {}
            public void collectNoteOpCallsForValidation(java.lang.String p0, int p1, java.lang.String p2, long p3) throws android.os.RemoteException {}
            public android.app.RuntimeAppOpAccessMessage collectRuntimeAppOpAccessMessage() throws android.os.RemoteException { return null; }
            public java.util.List<android.app.AsyncNotedAppOp> extractAsyncOps(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void finishOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException {}
            public void finishOperationForDevice(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5) throws android.os.RemoteException {}
            public void finishProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3) throws android.os.RemoteException {}
            public void finishProxyOperationWithState(android.os.IBinder p0, int p1, android.content.AttributionSourceState p2, boolean p3) throws android.os.RemoteException {}
            public void getHistoricalOps(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException {}
            public void getHistoricalOpsFromDiskRaw(int p0, java.lang.String p1, java.lang.String p2, java.util.List<java.lang.String> p3, int p4, int p5, long p6, long p7, int p8, android.os.RemoteCallback p9) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.app.AppOpsManager.PackageOps> getOpsForPackage(int p0, java.lang.String p1, int[] p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.AppOpsManager.PackageOps> getPackagesForOps(int[] p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice<android.app.AppOpsManager.PackageOps> getPackagesForOpsForDevice(int[] p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPackagesWithNonDefaultUidMode(int p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.AppOpsManager.PackageOps> getUidOps(int p0, int[] p1) throws android.os.RemoteException { return null; }
            public boolean isOperationActive(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isProxying(int p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException { return false; }
            public android.app.SyncNotedAppOp noteOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5, boolean p6) throws android.os.RemoteException { return null; }
            public android.app.SyncNotedAppOp noteOperationForDevice(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, java.lang.String p6, boolean p7) throws android.os.RemoteException { return null; }
            public void noteOperationsInBatch(java.util.Map p0) throws android.os.RemoteException {}
            public android.app.SyncNotedAppOp noteProxyOperation(int p0, android.content.AttributionSource p1, boolean p2, java.lang.String p3, boolean p4, boolean p5) throws android.os.RemoteException { return null; }
            public android.app.SyncNotedAppOp noteProxyOperationWithState(int p0, android.content.AttributionSourceState p1, boolean p2, java.lang.String p3, boolean p4, boolean p5) throws android.os.RemoteException { return null; }
            public void offsetHistory(long p0) throws android.os.RemoteException {}
            public int permissionToOpCode(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void rebootHistory(long p0) throws android.os.RemoteException {}
            public void reloadNonHistoricalState() throws android.os.RemoteException {}
            public void removeUser(int p0) throws android.os.RemoteException {}
            public com.android.internal.app.MessageSamplingConfig reportRuntimeAppOpAccessMessageAndGetConfig(java.lang.String p0, android.app.SyncNotedAppOp p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void resetAllModes(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void resetHistoryParameters() throws android.os.RemoteException {}
            public void resetPackageOpsNoHistory(java.lang.String p0) throws android.os.RemoteException {}
            public void setAudioRestriction(int p0, int[] p1, int p2, java.lang.String[] p3) throws android.os.RemoteException {}
            public void setCameraAudioRestriction(int p0) throws android.os.RemoteException {}
            public void setHistoryParameters(int p0, long p1, int p2) throws android.os.RemoteException {}
            public void setMode(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void setUidMode(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setUserRestriction(int p0, boolean p1, android.os.IBinder p2, int p3, android.os.PackageTagsList p4) throws android.os.RemoteException {}
            public void setUserRestrictions(android.os.Bundle p0, android.os.IBinder p1, int p2) throws android.os.RemoteException {}
            public boolean shouldCollectNotes(int p0) throws android.os.RemoteException { return false; }
            public android.app.SyncNotedAppOp startOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, java.lang.String p7, boolean p8, int p9, int p10) throws android.os.RemoteException { return null; }
            public android.app.SyncNotedAppOp startOperationForDevice(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5, boolean p6, boolean p7, java.lang.String p8, boolean p9, int p10, int p11) throws android.os.RemoteException { return null; }
            public android.app.SyncNotedAppOp startProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, boolean p7, int p8, int p9, int p10) throws android.os.RemoteException { return null; }
            public android.app.SyncNotedAppOp startProxyOperationWithState(android.os.IBinder p0, int p1, android.content.AttributionSourceState p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, boolean p7, int p8, int p9, int p10) throws android.os.RemoteException { return null; }
            public void startWatchingActive(int[] p0, com.android.internal.app.IAppOpsActiveCallback p1) throws android.os.RemoteException {}
            public void startWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
            public void startWatchingMode(int p0, java.lang.String p1, com.android.internal.app.IAppOpsCallback p2) throws android.os.RemoteException {}
            public void startWatchingModeWithFlags(int p0, java.lang.String p1, int p2, com.android.internal.app.IAppOpsCallback p3) throws android.os.RemoteException {}
            public void startWatchingNoted(int[] p0, com.android.internal.app.IAppOpsNotedCallback p1) throws android.os.RemoteException {}
            public void startWatchingStarted(int[] p0, com.android.internal.app.IAppOpsStartedCallback p1) throws android.os.RemoteException {}
            public void stopWatchingActive(com.android.internal.app.IAppOpsActiveCallback p0) throws android.os.RemoteException {}
            public void stopWatchingAsyncNoted(java.lang.String p0, com.android.internal.app.IAppOpsAsyncNotedCallback p1) throws android.os.RemoteException {}
            public void stopWatchingMode(com.android.internal.app.IAppOpsCallback p0) throws android.os.RemoteException {}
            public void stopWatchingNoted(com.android.internal.app.IAppOpsNotedCallback p0) throws android.os.RemoteException {}
            public void stopWatchingStarted(com.android.internal.app.IAppOpsStartedCallback p0) throws android.os.RemoteException {}
        }
    }
}
