package android.app;

public final class VoiceInteractor {
    static final boolean DEBUG = false;
    public static final java.lang.String KEY_CANCELLATION_SIGNAL = "key_cancellation_signal";
    static final int MSG_ABORT_VOICE_RESULT = 4;
    static final int MSG_CANCEL_RESULT = 6;
    static final int MSG_COMMAND_RESULT = 5;
    static final int MSG_COMPLETE_VOICE_RESULT = 3;
    static final int MSG_CONFIRMATION_RESULT = 1;
    static final int MSG_PICK_OPTION_RESULT = 2;
    static final android.app.VoiceInteractor.Request[] NO_REQUESTS = null;
    static final java.lang.String TAG = "VoiceInteractor";
    final android.util.ArrayMap<android.os.IBinder, android.app.VoiceInteractor.Request> mActiveRequests = null;
    android.app.Activity mActivity;
    final com.android.internal.app.IVoiceInteractorCallback.Stub mCallback = null;
    android.content.Context mContext;
    final com.android.internal.os.HandlerCaller mHandlerCaller = null;
    final com.android.internal.os.HandlerCaller.Callback mHandlerCallerCallback = null;
    com.android.internal.app.IVoiceInteractor mInteractor;
    final android.util.ArrayMap<java.lang.Runnable, java.util.concurrent.Executor> mOnDestroyCallbacks = null;
    boolean mRetaining;
    VoiceInteractor(com.android.internal.app.IVoiceInteractor p0, android.content.Context p1, android.app.Activity p2, android.os.Looper p3) {}
    private java.util.ArrayList<android.app.VoiceInteractor.Request> makeRequestList() { return null; }
    void attachActivity(android.app.Activity p0) {}
    void destroy() {}
    void detachActivity() {}
    void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    public android.app.VoiceInteractor.Request getActiveRequest(java.lang.String p0) { return null; }
    public android.app.VoiceInteractor.Request[] getActiveRequests() { return null; }
    public java.lang.String getPackageName() { return null; }
    public boolean isDestroyed() { return false; }
    public void notifyDirectActionsChanged() {}
    android.app.VoiceInteractor.Request pullRequest(com.android.internal.app.IVoiceInteractorRequest p0, boolean p1) { return null; }
    public boolean registerOnDestroyedCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) { return false; }
    void retainInstance() {}
    public boolean submitRequest(android.app.VoiceInteractor.Request p0) { return false; }
    public boolean submitRequest(android.app.VoiceInteractor.Request p0, java.lang.String p1) { return false; }
    public boolean[] supportsCommands(java.lang.String[] p0) { return null; }
    public boolean unregisterOnDestroyedCallback(java.lang.Runnable p0) { return false; }

    public static class AbortVoiceRequest extends android.app.VoiceInteractor.Request {
        final android.os.Bundle mExtras = null;
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        public AbortVoiceRequest(android.app.VoiceInteractor.Prompt p0, android.os.Bundle p1) { super(); }
        public AbortVoiceRequest(java.lang.CharSequence p0, android.os.Bundle p1) { super(); }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        java.lang.String getRequestTypeName() { return null; }
        public void onAbortResult(android.os.Bundle p0) {}
        com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException { return null; }
    }

    public static class CommandRequest extends android.app.VoiceInteractor.Request {
        final android.os.Bundle mArgs = null;
        final java.lang.String mCommand = null;
        public CommandRequest(java.lang.String p0, android.os.Bundle p1) { super(); }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        java.lang.String getRequestTypeName() { return null; }
        public void onCommandResult(boolean p0, android.os.Bundle p1) {}
        com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException { return null; }
    }

    public static class CompleteVoiceRequest extends android.app.VoiceInteractor.Request {
        final android.os.Bundle mExtras = null;
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        public CompleteVoiceRequest(android.app.VoiceInteractor.Prompt p0, android.os.Bundle p1) { super(); }
        public CompleteVoiceRequest(java.lang.CharSequence p0, android.os.Bundle p1) { super(); }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        java.lang.String getRequestTypeName() { return null; }
        public void onCompleteResult(android.os.Bundle p0) {}
        com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException { return null; }
    }

    public static class ConfirmationRequest extends android.app.VoiceInteractor.Request {
        final android.os.Bundle mExtras = null;
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        public ConfirmationRequest(android.app.VoiceInteractor.Prompt p0, android.os.Bundle p1) { super(); }
        public ConfirmationRequest(java.lang.CharSequence p0, android.os.Bundle p1) { super(); }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        java.lang.String getRequestTypeName() { return null; }
        public void onConfirmationResult(boolean p0, android.os.Bundle p1) {}
        com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException { return null; }
    }

    private static final class KillCallback extends android.os.ICancellationSignal.Stub {
        private final java.lang.ref.WeakReference<android.app.VoiceInteractor> mInteractor = null;
        KillCallback(android.app.VoiceInteractor p0) { super(); }
        public void cancel() {}
    }

    public static class PickOptionRequest extends android.app.VoiceInteractor.Request {
        final android.os.Bundle mExtras = null;
        final android.app.VoiceInteractor.PickOptionRequest.Option[] mOptions = null;
        final android.app.VoiceInteractor.Prompt mPrompt = null;
        public PickOptionRequest(android.app.VoiceInteractor.Prompt p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) { super(); }
        public PickOptionRequest(java.lang.CharSequence p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) { super(); }
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        java.lang.String getRequestTypeName() { return null; }
        public void onPickOptionResult(boolean p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) {}
        com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException { return null; }

        public static final class Option implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<android.app.VoiceInteractor.PickOptionRequest.Option> CREATOR = null;
            android.os.Bundle mExtras;
            final int mIndex = 0;
            final java.lang.CharSequence mLabel = null;
            java.util.ArrayList<java.lang.CharSequence> mSynonyms;
            Option(android.os.Parcel p0) {}
            public Option(java.lang.CharSequence p0) {}
            public Option(java.lang.CharSequence p0, int p1) {}
            public android.app.VoiceInteractor.PickOptionRequest.Option addSynonym(java.lang.CharSequence p0) { return null; }
            public int countSynonyms() { return 0; }
            public int describeContents() { return 0; }
            public android.os.Bundle getExtras() { return null; }
            public int getIndex() { return 0; }
            public java.lang.CharSequence getLabel() { return null; }
            public java.lang.CharSequence getSynonymAt(int p0) { return null; }
            public void setExtras(android.os.Bundle p0) {}
            public void writeToParcel(android.os.Parcel p0, int p1) {}
        }
    }

    public static class Prompt implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.VoiceInteractor.Prompt> CREATOR = null;
        private final java.lang.CharSequence mVisualPrompt = null;
        private final java.lang.CharSequence[] mVoicePrompts = null;
        Prompt(android.os.Parcel p0) {}
        public Prompt(java.lang.CharSequence p0) {}
        public Prompt(java.lang.CharSequence[] p0, java.lang.CharSequence p1) {}
        public int countVoicePrompts() { return 0; }
        public int describeContents() { return 0; }
        public java.lang.CharSequence getVisualPrompt() { return null; }
        public java.lang.CharSequence getVoicePromptAt(int p0) { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static abstract class Request {
        android.app.Activity mActivity;
        android.content.Context mContext;
        java.lang.String mName;
        com.android.internal.app.IVoiceInteractorRequest mRequestInterface;
        Request() {}
        public void cancel() {}
        void clear() {}
        void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        public android.app.Activity getActivity() { return null; }
        public android.content.Context getContext() { return null; }
        public java.lang.String getName() { return null; }
        java.lang.String getRequestTypeName() { return null; }
        public void onAttached(android.app.Activity p0) {}
        public void onCancel() {}
        public void onDetached() {}
        abstract com.android.internal.app.IVoiceInteractorRequest submit(com.android.internal.app.IVoiceInteractor p0, java.lang.String p1, com.android.internal.app.IVoiceInteractorCallback p2) throws android.os.RemoteException;
        public java.lang.String toString() { return null; }
    }
}
