package android.app;

public class ActivityClient {
    private static final android.app.ActivityClient.ActivityClientControllerSingleton INTERFACE_SINGLETON = null;
    private static final android.util.Singleton<android.app.ActivityClient> sInstance = null;
    private ActivityClient() {}
    private static android.app.IActivityClientController getActivityClientController() { return null; }
    public static android.app.ActivityClient getInstance() { return null; }
    public static android.app.IActivityClientController setActivityClientController(android.app.IActivityClientController p0) { return null; }
    public void activityDestroyed(android.os.IBinder p0) {}
    public void activityIdle(android.os.IBinder p0, android.content.res.Configuration p1, boolean p2) {}
    public void activityLocalRelaunch(android.os.IBinder p0) {}
    public void activityPaused(android.os.IBinder p0) {}
    public void activityRefreshed(android.os.IBinder p0) {}
    public void activityRelaunched(android.os.IBinder p0) {}
    public void activityResumed(android.os.IBinder p0, boolean p1) {}
    public void activityStopped(android.os.IBinder p0, android.os.Bundle p1, android.os.PersistableBundle p2, android.app.HandoffActivityData p3, java.lang.CharSequence p4) {}
    public void activityTopResumedStateLost(android.os.IBinder p0) {}
    public int checkActivityCallerContentUriPermission(android.os.IBinder p0, android.os.IBinder p1, android.net.Uri p2, int p3) { return 0; }
    void clearOverrideActivityTransition(android.os.IBinder p0, boolean p1) {}
    boolean convertFromTranslucent(android.os.IBinder p0) { return false; }
    boolean convertToTranslucent(android.os.IBinder p0, android.os.Bundle p1) { return false; }
    void dismissKeyguard(android.os.IBinder p0, com.android.internal.policy.IKeyguardDismissCallback p1, java.lang.CharSequence p2) {}
    void enableTaskLocaleOverride(android.os.IBinder p0) {}
    boolean enterPictureInPictureMode(android.os.IBinder p0, android.app.PictureInPictureParams p1) { return false; }
    public boolean finishActivity(android.os.IBinder p0, int p1, android.content.Intent p2, int p3) { return false; }
    boolean finishActivityAffinity(android.os.IBinder p0) { return false; }
    void finishSubActivity(android.os.IBinder p0, java.lang.String p1, int p2) {}
    public java.lang.String getActivityCallerPackage(android.os.IBinder p0, android.os.IBinder p1) { return null; }
    public int getActivityCallerUid(android.os.IBinder p0, android.os.IBinder p1) { return 0; }
    public android.os.IBinder getActivityTokenBelow(android.os.IBinder p0) { return null; }
    android.content.ComponentName getCallingActivity(android.os.IBinder p0) { return null; }
    java.lang.String getCallingPackage(android.os.IBinder p0) { return null; }
    public int getDisplayId(android.os.IBinder p0) { return 0; }
    android.app.HandoffActivityParams getHandoffActivityParams(android.os.IBinder p0) { return null; }
    public java.lang.String getLaunchedFromPackage(android.os.IBinder p0) { return null; }
    public int getLaunchedFromUid(android.os.IBinder p0) { return 0; }
    int getRequestedOrientation(android.os.IBinder p0) { return 0; }
    public android.content.res.Configuration getTaskConfiguration(android.os.IBinder p0) { return null; }
    public int getTaskForActivity(android.os.IBinder p0, boolean p1) { return 0; }
    public void invalidateHomeTaskSnapshot(android.os.IBinder p0) {}
    boolean isImmersive(android.os.IBinder p0) { return false; }
    public boolean isRequestedToLaunchInTaskFragment(android.os.IBinder p0, android.os.IBinder p1) { return false; }
    boolean isRootVoiceInteraction(android.os.IBinder p0) { return false; }
    public boolean isTopOfTask(android.os.IBinder p0) { return false; }
    public boolean moveActivityTaskToBack(android.os.IBinder p0, boolean p1) { return false; }
    boolean navigateUpTo(android.os.IBinder p0, android.content.Intent p1, java.lang.String p2, int p3, android.content.Intent p4) { return false; }
    void onBackPressed(android.os.IBinder p0, android.app.IRequestFinishCallback p1) {}
    void overrideActivityTransition(android.os.IBinder p0, boolean p1, int p2, int p3, int p4) {}
    void overridePendingTransition(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4) {}
    void registerRemoteAnimations(android.os.IBinder p0, android.view.RemoteAnimationDefinition p1) {}
    boolean releaseActivityInstance(android.os.IBinder p0) { return false; }
    void reportActivityFullyDrawn(android.os.IBinder p0, boolean p1) {}
    void reportSizeConfigurations(android.os.IBinder p0, android.window.SizeConfigurationBuckets p1) {}
    void reportSplashScreenAttached(android.os.IBinder p0) {}
    public void requestMultiwindowFullscreen(android.os.IBinder p0, int p1, android.os.IRemoteCallback p2) {}
    void setActivityRecordInputSinkEnabled(android.os.IBinder p0, boolean p1) {}
    void setAllowCrossUidActivitySwitchFromBelow(android.os.IBinder p0, boolean p1) {}
    void setForceSendResultForMediaProjection(android.os.IBinder p0) {}
    void setHandoffEnabled(android.os.IBinder p0, boolean p1, android.app.HandoffActivityParams p2) {}
    void setImmersive(android.os.IBinder p0, boolean p1) {}
    void setInheritShowWhenLocked(android.os.IBinder p0, boolean p1) {}
    void setPictureInPictureParams(android.os.IBinder p0, android.app.PictureInPictureParams p1) {}
    void setRecentsScreenshotEnabled(android.os.IBinder p0, boolean p1) {}
    public void setRequestedOrientation(android.os.IBinder p0, int p1) {}
    void setShouldDockBigOverlays(android.os.IBinder p0, boolean p1) {}
    void setShowWhenLocked(android.os.IBinder p0, boolean p1) {}
    void setTaskDescription(android.os.IBinder p0, android.app.ActivityManager.TaskDescription p1) {}
    void setTurnScreenOn(android.os.IBinder p0, boolean p1) {}
    int setVrMode(android.os.IBinder p0, boolean p1, android.content.ComponentName p2) { return 0; }
    boolean shouldUpRecreateTask(android.os.IBinder p0, java.lang.String p1) { return false; }
    boolean showAssistFromActivity(android.os.IBinder p0, android.os.Bundle p1) { return false; }
    void showLockTaskEscapeMessage(android.os.IBinder p0) {}
    void startLocalVoiceInteraction(android.os.IBinder p0, android.os.Bundle p1) {}
    void startLockTaskModeByToken(android.os.IBinder p0) {}
    void stopLocalVoiceInteraction(android.os.IBinder p0) {}
    void stopLockTaskModeByToken(android.os.IBinder p0) {}
    void toggleFreeformWindowingMode(android.os.IBinder p0) {}
    void unregisterRemoteAnimations(android.os.IBinder p0) {}
    boolean willActivityBeVisible(android.os.IBinder p0) { return false; }

    private static class ActivityClientControllerSingleton extends android.util.Singleton<android.app.IActivityClientController> {
        android.app.IActivityClientController mKnownInstance;
        private ActivityClientControllerSingleton() { super(); }
        protected android.app.IActivityClientController create() { return null; }
    }
}
