package android.service.voice;

public class VoiceInteractionSession implements android.view.KeyEvent.Callback, android.content.ComponentCallbacks2 {
    static final boolean DEBUG = false;
    public static final java.lang.String KEY_FOREGROUND_ACTIVITIES = "android.service.voice.FOREGROUND_ACTIVITIES";
    public static final java.lang.String KEY_SHOW_SESSION_ID = "android.service.voice.SHOW_SESSION_ID";
    static final int MSG_CANCEL = 7;
    static final int MSG_CLOSE_SYSTEM_DIALOGS = 102;
    static final int MSG_DESTROY = 103;
    static final int MSG_HANDLE_ASSIST = 104;
    static final int MSG_HANDLE_SCREENSHOT = 105;
    static final int MSG_HIDE = 107;
    static final int MSG_NOTIFY_VISIBLE_ACTIVITY_INFO_CHANGED = 109;
    static final int MSG_ON_LOCKSCREEN_SHOWN = 108;
    static final int MSG_REGISTER_VISIBLE_ACTIVITY_CALLBACK = 110;
    static final int MSG_SHOW = 106;
    static final int MSG_START_ABORT_VOICE = 4;
    static final int MSG_START_COMMAND = 5;
    static final int MSG_START_COMPLETE_VOICE = 3;
    static final int MSG_START_CONFIRMATION = 1;
    static final int MSG_START_PICK_OPTION = 2;
    static final int MSG_SUPPORTS_COMMANDS = 6;
    static final int MSG_TASK_FINISHED = 101;
    static final int MSG_TASK_STARTED = 100;
    static final int MSG_UNREGISTER_VISIBLE_ACTIVITY_CALLBACK = 111;
    public static final int SHOW_SOURCE_ACTIVITY = 16;
    public static final int SHOW_SOURCE_APPLICATION = 8;
    public static final int SHOW_SOURCE_ASSIST_GESTURE = 4;
    public static final int SHOW_SOURCE_AUTOMOTIVE_SYSTEM_UI = 128;
    public static final int SHOW_SOURCE_NOTIFICATION = 64;
    public static final int SHOW_SOURCE_PUSH_TO_TALK = 32;
    public static final int SHOW_WITH_ASSIST = 1;
    public static final int SHOW_WITH_ASSIST_STRUCTURE_SCREEN_CONTENT = 256;
    public static final int SHOW_WITH_SCREENSHOT = 2;
    static final java.lang.String TAG = "VoiceInteractionSession";
    public static final int VOICE_INTERACTION_ACTIVITY_EVENT_PAUSE = 3;
    public static final int VOICE_INTERACTION_ACTIVITY_EVENT_RESUME = 2;
    public static final int VOICE_INTERACTION_ACTIVITY_EVENT_START = 1;
    public static final int VOICE_INTERACTION_ACTIVITY_EVENT_STOP = 4;
    final android.util.ArrayMap<android.os.IBinder, android.service.voice.VoiceInteractionSession.Request> mActiveRequests = null;
    final android.service.voice.VoiceInteractionSession.MyCallbacks mCallbacks = null;
    android.widget.FrameLayout mContentFrame;
    final android.content.Context mContext = null;
    final android.view.KeyEvent.DispatcherState mDispatcherState = null;
    final com.android.internal.os.HandlerCaller mHandlerCaller = null;
    boolean mInShowWindow;
    android.view.LayoutInflater mInflater;
    boolean mInitialized;
    final android.view.ViewTreeObserver.OnComputeInternalInsetsListener mInsetsComputer = null;
    final com.android.internal.app.IVoiceInteractor mInteractor = null;
    android.os.ICancellationSignal mKillCallback;
    final java.util.Map<android.service.voice.VoiceInteractionSession.SafeResultListener, java.util.function.Consumer<android.os.Bundle>> mRemoteCallbacks = null;
    android.view.View mRootView;
    final android.service.voice.IVoiceInteractionSession mSession = null;
    com.android.internal.app.IVoiceInteractionManagerService mSystemService;
    int mTheme;
    android.content.res.TypedArray mThemeAttrs;
    final android.service.voice.VoiceInteractionSession.Insets mTmpInsets = null;
    android.os.IBinder mToken;
    boolean mUiEnabled;
    private final java.util.Map<android.service.voice.VoiceInteractionSession.VisibleActivityCallback, java.util.concurrent.Executor> mVisibleActivityCallbacks = null;
    private final java.util.List<android.service.voice.VisibleActivityInfo> mVisibleActivityInfos = null;
    final java.lang.ref.WeakReference<android.service.voice.VoiceInteractionSession> mWeakRef = null;
    android.service.voice.VoiceInteractionWindow mWindow;
    boolean mWindowAdded;
    boolean mWindowVisible;
    boolean mWindowWasVisible;
    public VoiceInteractionSession(android.content.Context p0) {}
    public VoiceInteractionSession(android.content.Context p0, android.os.Handler p1) {}
    private android.service.voice.VoiceInteractionSession.SafeResultListener createSafeResultListener(java.util.function.Consumer<android.os.Bundle> p0) { return null; }
    private android.content.Context createWindowContextIfNeeded(android.content.Context p0) { return null; }
    private void doNotifyVisibleActivityInfoChanged(android.service.voice.VisibleActivityInfo p0, int p1) {}
    private void doOnCreate() {}
    private void doRegisterVisibleActivityCallback(java.util.concurrent.Executor p0, android.service.voice.VoiceInteractionSession.VisibleActivityCallback p1) {}
    private void doUnregisterVisibleActivityCallback(android.service.voice.VoiceInteractionSession.VisibleActivityCallback p0) {}
    private void notifyVisibleActivityChanged(android.service.voice.VisibleActivityInfo p0, int p1) {}
    private java.util.function.Consumer<android.os.Bundle> removeSafeResultListener(android.service.voice.VoiceInteractionSession.SafeResultListener p0) { return null; }
    void addRequest(android.service.voice.VoiceInteractionSession.Request p0) {}
    public void closeSystemDialogs() {}
    void doCreate(com.android.internal.app.IVoiceInteractionManagerService p0, android.os.IBinder p1) {}
    void doDestroy() {}
    void doHide() {}
    void doOnHandleAssist(int p0, android.os.IBinder p1, android.os.Bundle p2, android.app.assist.AssistStructure p3, java.lang.Throwable p4, android.app.assist.AssistContent p5, int p6, int p7) {}
    void doShow(android.os.Bundle p0, int p1, com.android.internal.app.IVoiceInteractionSessionShowCallback p2) {}
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    void ensureWindowAdded() {}
    void ensureWindowCreated() {}
    void ensureWindowHidden() {}
    public void finish() {}
    public android.app.appfunctions.AppFunctionActivityId getAppFunctionActivityId(android.service.voice.VoiceInteractionSession.ActivityId p0) { return null; }
    public android.content.Context getContext() { return null; }
    public int getDisabledShowContext() { return 0; }
    public android.view.LayoutInflater getLayoutInflater() { return null; }
    public int getUserDisabledShowContext() { return 0; }
    public android.app.Dialog getWindow() { return null; }
    public void hide() {}
    boolean isRequestActive(android.os.IBinder p0) { return false; }
    public void onAssistStructureFailure(java.lang.Throwable p0) {}
    public void onBackPressed() {}
    public void onCancelRequest(android.service.voice.VoiceInteractionSession.Request p0) {}
    public void onCloseSystemDialogs() {}
    public void onComputeInsets(android.service.voice.VoiceInteractionSession.Insets p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onCreate() {}
    public android.view.View onCreateContentView() { return null; }
    public void onDestroy() {}
    public void onDirectActionsInvalidated(android.service.voice.VoiceInteractionSession.ActivityId p0) {}
    public boolean[] onGetSupportedCommands(java.lang.String[] p0) { return null; }
    @java.lang.Deprecated
    public void onHandleAssist(android.os.Bundle p0, android.app.assist.AssistStructure p1, android.app.assist.AssistContent p2) {}
    public void onHandleAssist(android.service.voice.VoiceInteractionSession.AssistState p0) {}
    @java.lang.Deprecated
    public void onHandleAssistSecondary(android.os.Bundle p0, android.app.assist.AssistStructure p1, android.app.assist.AssistContent p2, int p3, int p4) {}
    public void onHandleScreenshot(android.graphics.Bitmap p0) {}
    public void onHide() {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public void onLockscreenShown() {}
    public void onLowMemory() {}
    public void onPrepareShow(android.os.Bundle p0, int p1) {}
    public void onRequestAbortVoice(android.service.voice.VoiceInteractionSession.AbortVoiceRequest p0) {}
    public void onRequestCommand(android.service.voice.VoiceInteractionSession.CommandRequest p0) {}
    public void onRequestCompleteVoice(android.service.voice.VoiceInteractionSession.CompleteVoiceRequest p0) {}
    public void onRequestConfirmation(android.service.voice.VoiceInteractionSession.ConfirmationRequest p0) {}
    public void onRequestPickOption(android.service.voice.VoiceInteractionSession.PickOptionRequest p0) {}
    public void onShow(android.os.Bundle p0, int p1) {}
    public void onTaskFinished(android.content.Intent p0, int p1) {}
    public void onTaskStarted(android.content.Intent p0, int p1) {}
    public void onTrimMemory(int p0) {}
    public final void performDirectAction(android.app.DirectAction p0, android.os.Bundle p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, java.util.function.Consumer<android.os.Bundle> p4) {}
    public final void registerVisibleActivityCallback(java.util.concurrent.Executor p0, android.service.voice.VoiceInteractionSession.VisibleActivityCallback p1) {}
    android.service.voice.VoiceInteractionSession.Request removeRequest(android.os.IBinder p0) { return null; }
    public final void requestDirectActions(android.service.voice.VoiceInteractionSession.ActivityId p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.util.List<android.app.DirectAction>> p3) {}
    public void setContentView(android.view.View p0) {}
    public void setDisabledShowContext(int p0) {}
    public void setKeepAwake(boolean p0) {}
    public void setTheme(int p0) {}
    public void setUiEnabled(boolean p0) {}
    public void show(android.os.Bundle p0, int p1) {}
    void showWindow() {}
    public void startAssistantActivity(android.content.Intent p0) {}
    public void startAssistantActivity(android.content.Intent p0, android.os.Bundle p1) {}
    public void startVoiceActivity(android.content.Intent p0) {}
    public final void unregisterVisibleActivityCallback(android.service.voice.VoiceInteractionSession.VisibleActivityCallback p0) {}

    public static final class AbortVoiceRequest extends android.service.voice.VoiceInteractionSession.Request {
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        AbortVoiceRequest(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, android.app.VoiceInteractor.Prompt p4, android.os.Bundle p5) { super(null, 0, null, null, null); }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        @java.lang.Deprecated
        public java.lang.CharSequence getMessage() { return null; }
        public android.app.VoiceInteractor.Prompt getVoicePrompt() { return null; }
        public void sendAbortResult(android.os.Bundle p0) {}
    }

    public static class ActivityId {
        private final android.os.IBinder mAssistToken = null;
        private final int mTaskId = 0;
        ActivityId(int p0, android.os.IBinder p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public android.os.IBinder getAssistToken() { return null; }
        public int getTaskId() { return 0; }
        public int hashCode() { return 0; }
    }

    public static final class AssistState {
        private final android.service.voice.VoiceInteractionSession.ActivityId mActivityId = null;
        private final android.app.assist.AssistContent mContent = null;
        private final int mCount = 0;
        private final android.os.Bundle mData = null;
        private final int mIndex = 0;
        private final android.app.assist.AssistStructure mStructure = null;
        AssistState(android.service.voice.VoiceInteractionSession.ActivityId p0, android.os.Bundle p1, android.app.assist.AssistStructure p2, android.app.assist.AssistContent p3, int p4, int p5) {}
        public android.service.voice.VoiceInteractionSession.ActivityId getActivityId() { return null; }
        public android.app.assist.AssistContent getAssistContent() { return null; }
        public android.os.Bundle getAssistData() { return null; }
        public android.app.assist.AssistStructure getAssistStructure() { return null; }
        public int getCount() { return 0; }
        public int getIndex() { return 0; }
        public boolean isFocused() { return false; }
    }

    public static final class CommandRequest extends android.service.voice.VoiceInteractionSession.Request {
        final java.lang.String mCommand = null;
        CommandRequest(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, java.lang.String p4, android.os.Bundle p5) { super(null, 0, null, null, null); }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        public java.lang.String getCommand() { return null; }
        void sendCommandResult(boolean p0, android.os.Bundle p1) {}
        public void sendIntermediateResult(android.os.Bundle p0) {}
        public void sendResult(android.os.Bundle p0) {}
    }

    public static final class CompleteVoiceRequest extends android.service.voice.VoiceInteractionSession.Request {
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        CompleteVoiceRequest(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, android.app.VoiceInteractor.Prompt p4, android.os.Bundle p5) { super(null, 0, null, null, null); }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        @java.lang.Deprecated
        public java.lang.CharSequence getMessage() { return null; }
        public android.app.VoiceInteractor.Prompt getVoicePrompt() { return null; }
        public void sendCompleteResult(android.os.Bundle p0) {}
    }

    public static final class ConfirmationRequest extends android.service.voice.VoiceInteractionSession.Request {
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        ConfirmationRequest(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, android.app.VoiceInteractor.Prompt p4, android.os.Bundle p5) { super(null, 0, null, null, null); }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        @java.lang.Deprecated
        public java.lang.CharSequence getPrompt() { return null; }
        public android.app.VoiceInteractor.Prompt getVoicePrompt() { return null; }
        public void sendConfirmationResult(boolean p0, android.os.Bundle p1) {}
    }

    public static final class Insets {
        public static final int TOUCHABLE_INSETS_CONTENT = 1;
        public static final int TOUCHABLE_INSETS_FRAME = 0;
        public static final int TOUCHABLE_INSETS_REGION = 3;
        public final android.graphics.Rect contentInsets = null;
        public int touchableInsets;
        public final android.graphics.Region touchableRegion = null;
        public Insets() {}
    }

    class MyCallbacks implements com.android.internal.os.HandlerCaller.Callback, android.service.voice.VoiceInteractionWindow.Callback {
        MyCallbacks(android.service.voice.VoiceInteractionSession p0) {}
        public void executeMessage(android.os.Message p0) {}
        public void onBackPressed() {}
    }

    public static final class PickOptionRequest extends android.service.voice.VoiceInteractionSession.Request {
        final android.app.VoiceInteractor.PickOptionRequest.Option[] mOptions = null;
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        PickOptionRequest(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, android.app.VoiceInteractor.Prompt p4, android.app.VoiceInteractor.PickOptionRequest.Option[] p5, android.os.Bundle p6) { super(null, 0, null, null, null); }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        public android.app.VoiceInteractor.PickOptionRequest.Option[] getOptions() { return null; }
        @java.lang.Deprecated
        public java.lang.CharSequence getPrompt() { return null; }
        public android.app.VoiceInteractor.Prompt getVoicePrompt() { return null; }
        public void sendIntermediatePickOptionResult(android.app.VoiceInteractor.PickOptionRequest.Option[] p0, android.os.Bundle p1) {}
        void sendPickOptionResult(boolean p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) {}
        public void sendPickOptionResult(android.app.VoiceInteractor.PickOptionRequest.Option[] p0, android.os.Bundle p1) {}
    }

    public static class Request {
        final com.android.internal.app.IVoiceInteractorCallback mCallback = null;
        final java.lang.String mCallingPackage = null;
        final int mCallingUid = 0;
        final android.os.Bundle mExtras = null;
        final com.android.internal.app.IVoiceInteractorRequest mInterface = null;
        final java.lang.ref.WeakReference<android.service.voice.VoiceInteractionSession> mSession = null;
        Request(java.lang.String p0, int p1, com.android.internal.app.IVoiceInteractorCallback p2, android.service.voice.VoiceInteractionSession p3, android.os.Bundle p4) {}
        public void cancel() {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        void finishRequest() {}
        public java.lang.String getCallingPackage() { return null; }
        public int getCallingUid() { return 0; }
        public android.os.Bundle getExtras() { return null; }
        public boolean isActive() { return false; }
        public java.lang.String toString() { return null; }
    }

    private static class SafeResultListener implements android.os.RemoteCallback.OnResultListener {
        private final java.lang.ref.WeakReference<android.service.voice.VoiceInteractionSession> mWeakSession = null;
        SafeResultListener(java.util.function.Consumer<android.os.Bundle> p0, android.service.voice.VoiceInteractionSession p1) {}
        public void onResult(android.os.Bundle p0) {}
    }

    public static interface VisibleActivityCallback {
        default public void onInvisible(android.service.voice.VoiceInteractionSession.ActivityId p0) {}
        default public void onVisible(android.service.voice.VisibleActivityInfo p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VoiceInteractionActivityEventType {
    }
}
