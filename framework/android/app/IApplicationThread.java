package android.app;

public interface IApplicationThread extends android.os.IInterface {
    public void attachAgent(java.lang.String p0) throws android.os.RemoteException;
    public void attachStartupAgents(java.lang.String p0) throws android.os.RemoteException;
    public void bindApplication(java.lang.String p0, android.content.pm.ApplicationInfo p1, java.lang.String p2, java.lang.String p3, boolean p4, android.content.pm.ProviderInfoList p5, android.content.ComponentName p6, android.app.ProfilerInfo p7, android.os.Bundle p8, android.app.IInstrumentationWatcher p9, android.app.IUiAutomationConnection p10, int p11, boolean p12, boolean p13, boolean p14, boolean p15, android.content.res.Configuration p16, android.content.res.CompatibilityInfo p17, java.util.Map p18, android.os.Bundle p19, java.lang.String p20, android.content.AutofillOptions p21, android.content.ContentCaptureOptions p22, long[] p23, long[] p24, long[] p25, boolean p26, android.os.SharedMemory p27, java.io.FileDescriptor p28, long p29, long p30) throws android.os.RemoteException;
    public void clearDnsCache() throws android.os.RemoteException;
    public void dispatchPackageBroadcast(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void dumpActivity(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException;
    public void dumpBitmapsProto(android.os.ParcelFileDescriptor p0, java.lang.String p1) throws android.os.RemoteException;
    public void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void dumpDbInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void dumpGfxInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void dumpHeap(boolean p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4, android.os.ParcelFileDescriptor p5, android.os.RemoteCallback p6) throws android.os.RemoteException;
    public void dumpMemInfo(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, java.lang.String[] p8) throws android.os.RemoteException;
    public void dumpMemInfoProto(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String[] p6) throws android.os.RemoteException;
    public void dumpProvider(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException;
    public void dumpResources(android.os.ParcelFileDescriptor p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    public void dumpService(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException;
    public void getExecutableMethodFileOffsets(android.os.instrumentation.MethodDescriptor p0, android.os.instrumentation.IOffsetCallback p1) throws android.os.RemoteException;
    public void handleTrustStorageUpdate() throws android.os.RemoteException;
    public void instrumentWithoutRestart(android.content.ComponentName p0, android.os.Bundle p1, android.app.IInstrumentationWatcher p2, android.app.IUiAutomationConnection p3, android.content.pm.ApplicationInfo p4) throws android.os.RemoteException;
    public void notifyCleartextNetwork(byte[] p0) throws android.os.RemoteException;
    public void notifyContentProviderPublishStatus(android.app.ContentProviderHolder p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException;
    public void processInBackground() throws android.os.RemoteException;
    public void profilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) throws android.os.RemoteException;
    public void requestAssistContextExtras(android.os.IBinder p0, android.os.IBinder p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void requestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void requestHandoffActivityData(android.os.IBinder p0, java.util.List<android.os.IBinder> p1) throws android.os.RemoteException;
    public void runIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException;
    public void scheduleBindService(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2, boolean p3, int p4, long p5) throws android.os.RemoteException;
    public void scheduleCrash(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void scheduleCreateService(android.os.IBinder p0, android.content.pm.ServiceInfo p1, android.content.res.CompatibilityInfo p2, int p3) throws android.os.RemoteException;
    public void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo p0, int p1) throws android.os.RemoteException;
    public void scheduleEnterAnimationComplete(android.os.IBinder p0) throws android.os.RemoteException;
    public void scheduleExit() throws android.os.RemoteException;
    public void scheduleInstallProvider(android.content.pm.ProviderInfo p0) throws android.os.RemoteException;
    public void scheduleLocalVoiceInteractionStarted(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1) throws android.os.RemoteException;
    public void scheduleLowMemory() throws android.os.RemoteException;
    public void scheduleOnNewSceneTransitionInfo(android.os.IBinder p0, android.app.ActivityOptions.SceneTransitionInfo p1) throws android.os.RemoteException;
    public void schedulePing(android.os.RemoteCallback p0) throws android.os.RemoteException;
    public void scheduleReceiver(android.content.Intent p0, android.content.pm.ActivityInfo p1, android.content.res.CompatibilityInfo p2, int p3, java.lang.String p4, android.os.Bundle p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) throws android.os.RemoteException;
    public void scheduleReceiverList(java.util.List<android.app.ReceiverInfo> p0) throws android.os.RemoteException;
    public void scheduleRegisteredReceiver(android.content.IIntentReceiver p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) throws android.os.RemoteException;
    public void scheduleSelfBroadcast(android.app.SelfBroadcastData p0) throws android.os.RemoteException;
    public void scheduleServiceArgs(android.os.IBinder p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException;
    public void scheduleStopService(android.os.IBinder p0) throws android.os.RemoteException;
    public void scheduleSuicide() throws android.os.RemoteException;
    public void scheduleTaskFragmentTransaction(android.window.ITaskFragmentOrganizer p0, android.window.TaskFragmentTransaction p1) throws android.os.RemoteException;
    public void scheduleTimeoutService(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void scheduleTimeoutServiceForType(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void scheduleTransaction(android.app.servertransaction.ClientTransaction p0) throws android.os.RemoteException;
    public void scheduleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void scheduleTrimMemory(int p0) throws android.os.RemoteException;
    public void scheduleUnbindService(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2) throws android.os.RemoteException;
    public void setCoreSettings(android.os.Bundle p0) throws android.os.RemoteException;
    public void setNetworkBlockSeq(long p0) throws android.os.RemoteException;
    public void setProcessState(int p0) throws android.os.RemoteException;
    public void setSchedulingGroup(int p0) throws android.os.RemoteException;
    public void startBinderTracking() throws android.os.RemoteException;
    public void stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException;
    public void updateHttpProxy() throws android.os.RemoteException;
    public void updatePackageCompatibilityInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1) throws android.os.RemoteException;
    public void updateTimePrefs(int p0) throws android.os.RemoteException;
    public void updateTimeZone() throws android.os.RemoteException;
    public void updateUiTranslationState(android.os.IBinder p0, int p1, android.view.translation.TranslationSpec p2, android.view.translation.TranslationSpec p3, java.util.List<android.view.autofill.AutofillId> p4, android.view.translation.UiTranslationSpec p5) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.IApplicationThread {
        public static final java.lang.String DESCRIPTOR = "android.app.IApplicationThread";
        static final int TRANSACTION_attachAgent = 52;
        static final int TRANSACTION_attachStartupAgents = 53;
        static final int TRANSACTION_bindApplication = 6;
        static final int TRANSACTION_clearDnsCache = 28;
        static final int TRANSACTION_dispatchPackageBroadcast = 23;
        static final int TRANSACTION_dumpActivity = 26;
        static final int TRANSACTION_dumpBitmapsProto = 36;
        static final int TRANSACTION_dumpCacheInfo = 37;
        static final int TRANSACTION_dumpDbInfo = 39;
        static final int TRANSACTION_dumpGfxInfo = 35;
        static final int TRANSACTION_dumpHeap = 25;
        static final int TRANSACTION_dumpMemInfo = 33;
        static final int TRANSACTION_dumpMemInfoProto = 34;
        static final int TRANSACTION_dumpProvider = 38;
        static final int TRANSACTION_dumpResources = 27;
        static final int TRANSACTION_dumpService = 14;
        static final int TRANSACTION_getExecutableMethodFileOffsets = 66;
        static final int TRANSACTION_handleTrustStorageUpdate = 51;
        static final int TRANSACTION_instrumentWithoutRestart = 61;
        static final int TRANSACTION_notifyCleartextNetwork = 47;
        static final int TRANSACTION_notifyContentProviderPublishStatus = 60;
        static final int TRANSACTION_performDirectAction = 59;
        static final int TRANSACTION_processInBackground = 11;
        static final int TRANSACTION_profilerControl = 17;
        static final int TRANSACTION_requestAssistContextExtras = 41;
        static final int TRANSACTION_requestDirectActions = 58;
        static final int TRANSACTION_requestHandoffActivityData = 67;
        static final int TRANSACTION_runIsolatedEntryPoint = 7;
        static final int TRANSACTION_scheduleApplicationInfoChanged = 54;
        static final int TRANSACTION_scheduleBindService = 12;
        static final int TRANSACTION_scheduleCrash = 24;
        static final int TRANSACTION_scheduleCreateBackupAgent = 19;
        static final int TRANSACTION_scheduleCreateService = 4;
        static final int TRANSACTION_scheduleDestroyBackupAgent = 20;
        static final int TRANSACTION_scheduleEnterAnimationComplete = 46;
        static final int TRANSACTION_scheduleExit = 8;
        static final int TRANSACTION_scheduleInstallProvider = 44;
        static final int TRANSACTION_scheduleLocalVoiceInteractionStarted = 50;
        static final int TRANSACTION_scheduleLowMemory = 16;
        static final int TRANSACTION_scheduleOnNewSceneTransitionInfo = 21;
        static final int TRANSACTION_schedulePing = 65;
        static final int TRANSACTION_scheduleReceiver = 1;
        static final int TRANSACTION_scheduleReceiverList = 2;
        static final int TRANSACTION_scheduleRegisteredReceiver = 15;
        static final int TRANSACTION_scheduleSelfBroadcast = 3;
        static final int TRANSACTION_scheduleServiceArgs = 9;
        static final int TRANSACTION_scheduleStopService = 5;
        static final int TRANSACTION_scheduleSuicide = 22;
        static final int TRANSACTION_scheduleTaskFragmentTransaction = 57;
        static final int TRANSACTION_scheduleTimeoutService = 63;
        static final int TRANSACTION_scheduleTimeoutServiceForType = 64;
        static final int TRANSACTION_scheduleTransaction = 56;
        static final int TRANSACTION_scheduleTranslucentConversionComplete = 42;
        static final int TRANSACTION_scheduleTrimMemory = 32;
        static final int TRANSACTION_scheduleUnbindService = 13;
        static final int TRANSACTION_setCoreSettings = 30;
        static final int TRANSACTION_setNetworkBlockSeq = 55;
        static final int TRANSACTION_setProcessState = 43;
        static final int TRANSACTION_setSchedulingGroup = 18;
        static final int TRANSACTION_startBinderTracking = 48;
        static final int TRANSACTION_stopBinderTrackingAndDump = 49;
        static final int TRANSACTION_unstableProviderDied = 40;
        static final int TRANSACTION_updateHttpProxy = 29;
        static final int TRANSACTION_updatePackageCompatibilityInfo = 31;
        static final int TRANSACTION_updateTimePrefs = 45;
        static final int TRANSACTION_updateTimeZone = 10;
        static final int TRANSACTION_updateUiTranslationState = 62;
        public Stub() { super(); }
        public static android.app.IApplicationThread asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IApplicationThread {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void attachAgent(java.lang.String p0) throws android.os.RemoteException {}
            public void attachStartupAgents(java.lang.String p0) throws android.os.RemoteException {}
            public void bindApplication(java.lang.String p0, android.content.pm.ApplicationInfo p1, java.lang.String p2, java.lang.String p3, boolean p4, android.content.pm.ProviderInfoList p5, android.content.ComponentName p6, android.app.ProfilerInfo p7, android.os.Bundle p8, android.app.IInstrumentationWatcher p9, android.app.IUiAutomationConnection p10, int p11, boolean p12, boolean p13, boolean p14, boolean p15, android.content.res.Configuration p16, android.content.res.CompatibilityInfo p17, java.util.Map p18, android.os.Bundle p19, java.lang.String p20, android.content.AutofillOptions p21, android.content.ContentCaptureOptions p22, long[] p23, long[] p24, long[] p25, boolean p26, android.os.SharedMemory p27, java.io.FileDescriptor p28, long p29, long p30) throws android.os.RemoteException {}
            public void clearDnsCache() throws android.os.RemoteException {}
            public void dispatchPackageBroadcast(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void dumpActivity(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException {}
            public void dumpBitmapsProto(android.os.ParcelFileDescriptor p0, java.lang.String p1) throws android.os.RemoteException {}
            public void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void dumpDbInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void dumpGfxInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void dumpHeap(boolean p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4, android.os.ParcelFileDescriptor p5, android.os.RemoteCallback p6) throws android.os.RemoteException {}
            public void dumpMemInfo(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, java.lang.String[] p8) throws android.os.RemoteException {}
            public void dumpMemInfoProto(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String[] p6) throws android.os.RemoteException {}
            public void dumpProvider(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void dumpResources(android.os.ParcelFileDescriptor p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void dumpService(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void getExecutableMethodFileOffsets(android.os.instrumentation.MethodDescriptor p0, android.os.instrumentation.IOffsetCallback p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void handleTrustStorageUpdate() throws android.os.RemoteException {}
            public void instrumentWithoutRestart(android.content.ComponentName p0, android.os.Bundle p1, android.app.IInstrumentationWatcher p2, android.app.IUiAutomationConnection p3, android.content.pm.ApplicationInfo p4) throws android.os.RemoteException {}
            public void notifyCleartextNetwork(byte[] p0) throws android.os.RemoteException {}
            public void notifyContentProviderPublishStatus(android.app.ContentProviderHolder p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
            public void processInBackground() throws android.os.RemoteException {}
            public void profilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) throws android.os.RemoteException {}
            public void requestAssistContextExtras(android.os.IBinder p0, android.os.IBinder p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void requestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void requestHandoffActivityData(android.os.IBinder p0, java.util.List<android.os.IBinder> p1) throws android.os.RemoteException {}
            public void runIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException {}
            public void scheduleBindService(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2, boolean p3, int p4, long p5) throws android.os.RemoteException {}
            public void scheduleCrash(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void scheduleCreateService(android.os.IBinder p0, android.content.pm.ServiceInfo p1, android.content.res.CompatibilityInfo p2, int p3) throws android.os.RemoteException {}
            public void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo p0, int p1) throws android.os.RemoteException {}
            public void scheduleEnterAnimationComplete(android.os.IBinder p0) throws android.os.RemoteException {}
            public void scheduleExit() throws android.os.RemoteException {}
            public void scheduleInstallProvider(android.content.pm.ProviderInfo p0) throws android.os.RemoteException {}
            public void scheduleLocalVoiceInteractionStarted(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1) throws android.os.RemoteException {}
            public void scheduleLowMemory() throws android.os.RemoteException {}
            public void scheduleOnNewSceneTransitionInfo(android.os.IBinder p0, android.app.ActivityOptions.SceneTransitionInfo p1) throws android.os.RemoteException {}
            public void schedulePing(android.os.RemoteCallback p0) throws android.os.RemoteException {}
            public void scheduleReceiver(android.content.Intent p0, android.content.pm.ActivityInfo p1, android.content.res.CompatibilityInfo p2, int p3, java.lang.String p4, android.os.Bundle p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) throws android.os.RemoteException {}
            public void scheduleReceiverList(java.util.List<android.app.ReceiverInfo> p0) throws android.os.RemoteException {}
            public void scheduleRegisteredReceiver(android.content.IIntentReceiver p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) throws android.os.RemoteException {}
            public void scheduleSelfBroadcast(android.app.SelfBroadcastData p0) throws android.os.RemoteException {}
            public void scheduleServiceArgs(android.os.IBinder p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
            public void scheduleStopService(android.os.IBinder p0) throws android.os.RemoteException {}
            public void scheduleSuicide() throws android.os.RemoteException {}
            public void scheduleTaskFragmentTransaction(android.window.ITaskFragmentOrganizer p0, android.window.TaskFragmentTransaction p1) throws android.os.RemoteException {}
            public void scheduleTimeoutService(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void scheduleTimeoutServiceForType(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void scheduleTransaction(android.app.servertransaction.ClientTransaction p0) throws android.os.RemoteException {}
            public void scheduleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void scheduleTrimMemory(int p0) throws android.os.RemoteException {}
            public void scheduleUnbindService(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2) throws android.os.RemoteException {}
            public void setCoreSettings(android.os.Bundle p0) throws android.os.RemoteException {}
            public void setNetworkBlockSeq(long p0) throws android.os.RemoteException {}
            public void setProcessState(int p0) throws android.os.RemoteException {}
            public void setSchedulingGroup(int p0) throws android.os.RemoteException {}
            public void startBinderTracking() throws android.os.RemoteException {}
            public void stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
            public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException {}
            public void updateHttpProxy() throws android.os.RemoteException {}
            public void updatePackageCompatibilityInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1) throws android.os.RemoteException {}
            public void updateTimePrefs(int p0) throws android.os.RemoteException {}
            public void updateTimeZone() throws android.os.RemoteException {}
            public void updateUiTranslationState(android.os.IBinder p0, int p1, android.view.translation.TranslationSpec p2, android.view.translation.TranslationSpec p3, java.util.List<android.view.autofill.AutofillId> p4, android.view.translation.UiTranslationSpec p5) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.IApplicationThread {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void attachAgent(java.lang.String p0) throws android.os.RemoteException {}
        public void attachStartupAgents(java.lang.String p0) throws android.os.RemoteException {}
        public void bindApplication(java.lang.String p0, android.content.pm.ApplicationInfo p1, java.lang.String p2, java.lang.String p3, boolean p4, android.content.pm.ProviderInfoList p5, android.content.ComponentName p6, android.app.ProfilerInfo p7, android.os.Bundle p8, android.app.IInstrumentationWatcher p9, android.app.IUiAutomationConnection p10, int p11, boolean p12, boolean p13, boolean p14, boolean p15, android.content.res.Configuration p16, android.content.res.CompatibilityInfo p17, java.util.Map p18, android.os.Bundle p19, java.lang.String p20, android.content.AutofillOptions p21, android.content.ContentCaptureOptions p22, long[] p23, long[] p24, long[] p25, boolean p26, android.os.SharedMemory p27, java.io.FileDescriptor p28, long p29, long p30) throws android.os.RemoteException {}
        public void clearDnsCache() throws android.os.RemoteException {}
        public void dispatchPackageBroadcast(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void dumpActivity(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException {}
        public void dumpBitmapsProto(android.os.ParcelFileDescriptor p0, java.lang.String p1) throws android.os.RemoteException {}
        public void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void dumpDbInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void dumpGfxInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void dumpHeap(boolean p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4, android.os.ParcelFileDescriptor p5, android.os.RemoteCallback p6) throws android.os.RemoteException {}
        public void dumpMemInfo(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, java.lang.String[] p8) throws android.os.RemoteException {}
        public void dumpMemInfoProto(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String[] p6) throws android.os.RemoteException {}
        public void dumpProvider(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void dumpResources(android.os.ParcelFileDescriptor p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void dumpService(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void getExecutableMethodFileOffsets(android.os.instrumentation.MethodDescriptor p0, android.os.instrumentation.IOffsetCallback p1) throws android.os.RemoteException {}
        public void handleTrustStorageUpdate() throws android.os.RemoteException {}
        public void instrumentWithoutRestart(android.content.ComponentName p0, android.os.Bundle p1, android.app.IInstrumentationWatcher p2, android.app.IUiAutomationConnection p3, android.content.pm.ApplicationInfo p4) throws android.os.RemoteException {}
        public void notifyCleartextNetwork(byte[] p0) throws android.os.RemoteException {}
        public void notifyContentProviderPublishStatus(android.app.ContentProviderHolder p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        public void processInBackground() throws android.os.RemoteException {}
        public void profilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) throws android.os.RemoteException {}
        public void requestAssistContextExtras(android.os.IBinder p0, android.os.IBinder p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void requestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void requestHandoffActivityData(android.os.IBinder p0, java.util.List<android.os.IBinder> p1) throws android.os.RemoteException {}
        public void runIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException {}
        public void scheduleBindService(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2, boolean p3, int p4, long p5) throws android.os.RemoteException {}
        public void scheduleCrash(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void scheduleCreateService(android.os.IBinder p0, android.content.pm.ServiceInfo p1, android.content.res.CompatibilityInfo p2, int p3) throws android.os.RemoteException {}
        public void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo p0, int p1) throws android.os.RemoteException {}
        public void scheduleEnterAnimationComplete(android.os.IBinder p0) throws android.os.RemoteException {}
        public void scheduleExit() throws android.os.RemoteException {}
        public void scheduleInstallProvider(android.content.pm.ProviderInfo p0) throws android.os.RemoteException {}
        public void scheduleLocalVoiceInteractionStarted(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1) throws android.os.RemoteException {}
        public void scheduleLowMemory() throws android.os.RemoteException {}
        public void scheduleOnNewSceneTransitionInfo(android.os.IBinder p0, android.app.ActivityOptions.SceneTransitionInfo p1) throws android.os.RemoteException {}
        public void schedulePing(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void scheduleReceiver(android.content.Intent p0, android.content.pm.ActivityInfo p1, android.content.res.CompatibilityInfo p2, int p3, java.lang.String p4, android.os.Bundle p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) throws android.os.RemoteException {}
        public void scheduleReceiverList(java.util.List<android.app.ReceiverInfo> p0) throws android.os.RemoteException {}
        public void scheduleRegisteredReceiver(android.content.IIntentReceiver p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) throws android.os.RemoteException {}
        public void scheduleSelfBroadcast(android.app.SelfBroadcastData p0) throws android.os.RemoteException {}
        public void scheduleServiceArgs(android.os.IBinder p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
        public void scheduleStopService(android.os.IBinder p0) throws android.os.RemoteException {}
        public void scheduleSuicide() throws android.os.RemoteException {}
        public void scheduleTaskFragmentTransaction(android.window.ITaskFragmentOrganizer p0, android.window.TaskFragmentTransaction p1) throws android.os.RemoteException {}
        public void scheduleTimeoutService(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void scheduleTimeoutServiceForType(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void scheduleTransaction(android.app.servertransaction.ClientTransaction p0) throws android.os.RemoteException {}
        public void scheduleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void scheduleTrimMemory(int p0) throws android.os.RemoteException {}
        public void scheduleUnbindService(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2) throws android.os.RemoteException {}
        public void setCoreSettings(android.os.Bundle p0) throws android.os.RemoteException {}
        public void setNetworkBlockSeq(long p0) throws android.os.RemoteException {}
        public void setProcessState(int p0) throws android.os.RemoteException {}
        public void setSchedulingGroup(int p0) throws android.os.RemoteException {}
        public void startBinderTracking() throws android.os.RemoteException {}
        public void stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException {}
        public void updateHttpProxy() throws android.os.RemoteException {}
        public void updatePackageCompatibilityInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1) throws android.os.RemoteException {}
        public void updateTimePrefs(int p0) throws android.os.RemoteException {}
        public void updateTimeZone() throws android.os.RemoteException {}
        public void updateUiTranslationState(android.os.IBinder p0, int p1, android.view.translation.TranslationSpec p2, android.view.translation.TranslationSpec p3, java.util.List<android.view.autofill.AutofillId> p4, android.view.translation.UiTranslationSpec p5) throws android.os.RemoteException {}
    }

    public static class Delegator extends android.app.IApplicationThread.Stub {
        android.app.IApplicationThread mImpl;
        public Delegator(android.app.IApplicationThread p0) { super(); }
        public void attachAgent(java.lang.String p0) throws android.os.RemoteException {}
        public void attachStartupAgents(java.lang.String p0) throws android.os.RemoteException {}
        public void bindApplication(java.lang.String p0, android.content.pm.ApplicationInfo p1, java.lang.String p2, java.lang.String p3, boolean p4, android.content.pm.ProviderInfoList p5, android.content.ComponentName p6, android.app.ProfilerInfo p7, android.os.Bundle p8, android.app.IInstrumentationWatcher p9, android.app.IUiAutomationConnection p10, int p11, boolean p12, boolean p13, boolean p14, boolean p15, android.content.res.Configuration p16, android.content.res.CompatibilityInfo p17, java.util.Map p18, android.os.Bundle p19, java.lang.String p20, android.content.AutofillOptions p21, android.content.ContentCaptureOptions p22, long[] p23, long[] p24, long[] p25, boolean p26, android.os.SharedMemory p27, java.io.FileDescriptor p28, long p29, long p30) throws android.os.RemoteException {}
        public void clearDnsCache() throws android.os.RemoteException {}
        public void dispatchPackageBroadcast(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void dumpActivity(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException {}
        public void dumpBitmapsProto(android.os.ParcelFileDescriptor p0, java.lang.String p1) throws android.os.RemoteException {}
        public void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void dumpDbInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void dumpGfxInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void dumpHeap(boolean p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4, android.os.ParcelFileDescriptor p5, android.os.RemoteCallback p6) throws android.os.RemoteException {}
        public void dumpMemInfo(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, java.lang.String[] p8) throws android.os.RemoteException {}
        public void dumpMemInfoProto(android.os.ParcelFileDescriptor p0, android.os.Debug.MemoryInfo p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String[] p6) throws android.os.RemoteException {}
        public void dumpProvider(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void dumpResources(android.os.ParcelFileDescriptor p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void dumpService(android.os.ParcelFileDescriptor p0, android.os.IBinder p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void getExecutableMethodFileOffsets(android.os.instrumentation.MethodDescriptor p0, android.os.instrumentation.IOffsetCallback p1) throws android.os.RemoteException {}
        public void handleTrustStorageUpdate() throws android.os.RemoteException {}
        public void instrumentWithoutRestart(android.content.ComponentName p0, android.os.Bundle p1, android.app.IInstrumentationWatcher p2, android.app.IUiAutomationConnection p3, android.content.pm.ApplicationInfo p4) throws android.os.RemoteException {}
        public void notifyCleartextNetwork(byte[] p0) throws android.os.RemoteException {}
        public void notifyContentProviderPublishStatus(android.app.ContentProviderHolder p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void performDirectAction(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, android.os.RemoteCallback p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        public void processInBackground() throws android.os.RemoteException {}
        public void profilerControl(boolean p0, android.app.ProfilerInfo p1, int p2) throws android.os.RemoteException {}
        public void requestAssistContextExtras(android.os.IBinder p0, android.os.IBinder p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void requestDirectActions(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void requestHandoffActivityData(android.os.IBinder p0, java.util.List<android.os.IBinder> p1) throws android.os.RemoteException {}
        public void runIsolatedEntryPoint(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void scheduleApplicationInfoChanged(android.content.pm.ApplicationInfo p0) throws android.os.RemoteException {}
        public void scheduleBindService(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2, boolean p3, int p4, long p5) throws android.os.RemoteException {}
        public void scheduleCrash(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void scheduleCreateBackupAgent(android.content.pm.ApplicationInfo p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void scheduleCreateService(android.os.IBinder p0, android.content.pm.ServiceInfo p1, android.content.res.CompatibilityInfo p2, int p3) throws android.os.RemoteException {}
        public void scheduleDestroyBackupAgent(android.content.pm.ApplicationInfo p0, int p1) throws android.os.RemoteException {}
        public void scheduleEnterAnimationComplete(android.os.IBinder p0) throws android.os.RemoteException {}
        public void scheduleExit() throws android.os.RemoteException {}
        public void scheduleInstallProvider(android.content.pm.ProviderInfo p0) throws android.os.RemoteException {}
        public void scheduleLocalVoiceInteractionStarted(android.os.IBinder p0, com.android.internal.app.IVoiceInteractor p1) throws android.os.RemoteException {}
        public void scheduleLowMemory() throws android.os.RemoteException {}
        public void scheduleOnNewSceneTransitionInfo(android.os.IBinder p0, android.app.ActivityOptions.SceneTransitionInfo p1) throws android.os.RemoteException {}
        public void schedulePing(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void scheduleReceiver(android.content.Intent p0, android.content.pm.ActivityInfo p1, android.content.res.CompatibilityInfo p2, int p3, java.lang.String p4, android.os.Bundle p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) throws android.os.RemoteException {}
        public void scheduleReceiverList(java.util.List<android.app.ReceiverInfo> p0) throws android.os.RemoteException {}
        public void scheduleRegisteredReceiver(android.content.IIntentReceiver p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4, boolean p5, boolean p6, boolean p7, int p8, int p9, int p10, java.lang.String p11) throws android.os.RemoteException {}
        public void scheduleSelfBroadcast(android.app.SelfBroadcastData p0) throws android.os.RemoteException {}
        public void scheduleServiceArgs(android.os.IBinder p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
        public void scheduleStopService(android.os.IBinder p0) throws android.os.RemoteException {}
        public void scheduleSuicide() throws android.os.RemoteException {}
        public void scheduleTaskFragmentTransaction(android.window.ITaskFragmentOrganizer p0, android.window.TaskFragmentTransaction p1) throws android.os.RemoteException {}
        public void scheduleTimeoutService(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void scheduleTimeoutServiceForType(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void scheduleTransaction(android.app.servertransaction.ClientTransaction p0) throws android.os.RemoteException {}
        public void scheduleTranslucentConversionComplete(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void scheduleTrimMemory(int p0) throws android.os.RemoteException {}
        public void scheduleUnbindService(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2) throws android.os.RemoteException {}
        public void setCoreSettings(android.os.Bundle p0) throws android.os.RemoteException {}
        public void setNetworkBlockSeq(long p0) throws android.os.RemoteException {}
        public void setProcessState(int p0) throws android.os.RemoteException {}
        public void setSchedulingGroup(int p0) throws android.os.RemoteException {}
        public void startBinderTracking() throws android.os.RemoteException {}
        public void stopBinderTrackingAndDump(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void unstableProviderDied(android.os.IBinder p0) throws android.os.RemoteException {}
        public void updateHttpProxy() throws android.os.RemoteException {}
        public void updatePackageCompatibilityInfo(java.lang.String p0, android.content.res.CompatibilityInfo p1) throws android.os.RemoteException {}
        public void updateTimePrefs(int p0) throws android.os.RemoteException {}
        public void updateTimeZone() throws android.os.RemoteException {}
        public void updateUiTranslationState(android.os.IBinder p0, int p1, android.view.translation.TranslationSpec p2, android.view.translation.TranslationSpec p3, java.util.List<android.view.autofill.AutofillId> p4, android.view.translation.UiTranslationSpec p5) throws android.os.RemoteException {}
    }
}
