package android.app.servertransaction;

public class LaunchActivityItem extends android.app.servertransaction.ClientTransactionItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.LaunchActivityItem> CREATOR = null;
    private final android.app.IActivityClientController mActivityClientController = null;
    private final android.os.IBinder mActivityToken = null;
    private final android.window.ActivityWindowInfo mActivityWindowInfo = null;
    private final android.os.IBinder mAssistToken = null;
    private final android.content.res.Configuration mCurConfig = null;
    private final int mDeviceId = 0;
    private final int mDisplayId = 0;
    private final int mIdent = 0;
    private android.content.pm.ActivityInfo mInfo;
    private final android.os.IBinder mInitialCallerInfoAccessToken = null;
    private android.content.Intent mIntent;
    private final boolean mIsForward = false;
    private final boolean mLaunchedFromBubble = false;
    private final android.content.res.Configuration mOverrideConfig = null;
    private final java.util.List<com.android.internal.content.ReferrerIntent> mPendingNewIntents = null;
    private final java.util.List<android.app.ResultInfo> mPendingResults = null;
    private final android.os.PersistableBundle mPersistentState = null;
    private final int mProcState = 0;
    private final android.app.ProfilerInfo mProfilerInfo = null;
    private final java.lang.String mReferrer = null;
    private final android.app.ActivityOptions.SceneTransitionInfo mSceneTransitionInfo = null;
    private final android.os.IBinder mShareableActivityToken = null;
    private final android.os.Bundle mState = null;
    private final android.os.IBinder mTaskFragmentToken = null;
    private final com.android.internal.app.IVoiceInteractor mVoiceInteractor = null;
    private LaunchActivityItem(android.os.IBinder p0, int p1, android.content.res.Configuration p2, android.content.res.Configuration p3, int p4, java.lang.String p5, com.android.internal.app.IVoiceInteractor p6, int p7, android.os.Bundle p8, android.os.PersistableBundle p9, java.util.List<android.app.ResultInfo> p10, java.util.List<com.android.internal.content.ReferrerIntent> p11, android.app.ActivityOptions.SceneTransitionInfo p12, boolean p13, android.app.ProfilerInfo p14, android.os.IBinder p15, android.app.IActivityClientController p16, android.os.IBinder p17, boolean p18, android.os.IBinder p19, android.os.IBinder p20, android.window.ActivityWindowInfo p21, int p22) { super(); }
    public LaunchActivityItem(android.os.IBinder p0, android.content.Intent p1, int p2, android.content.pm.ActivityInfo p3, android.content.res.Configuration p4, android.content.res.Configuration p5, int p6, java.lang.String p7, com.android.internal.app.IVoiceInteractor p8, int p9, android.os.Bundle p10, android.os.PersistableBundle p11, java.util.List<android.app.ResultInfo> p12, java.util.List<com.android.internal.content.ReferrerIntent> p13, android.app.ActivityOptions.SceneTransitionInfo p14, boolean p15, android.app.ProfilerInfo p16, android.os.IBinder p17, android.app.IActivityClientController p18, android.os.IBinder p19, boolean p20, android.os.IBinder p21, android.os.IBinder p22, android.window.ActivityWindowInfo p23, int p24) { super(); }
    private LaunchActivityItem(android.os.Parcel p0) { super(); }
    private boolean activityInfoEqual(android.content.pm.ActivityInfo p0) { return false; }
    private static boolean areBundlesEqualRoughly(android.os.BaseBundle p0, android.os.BaseBundle p1) { return false; }
    private static int getRoughBundleHashCode(android.os.BaseBundle p0) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void execute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public android.os.IBinder getActivityToken() { return null; }
    public int hashCode() { return 0; }
    public void postExecute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public void preExecute(android.app.ClientTransactionHandler p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
