package android.companion.virtual.computercontrol;

public interface IComputerControlSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.computercontrol.IComputerControlSession";
    public void addPackagesForAutomation(java.util.List<java.lang.String> p0, android.companion.virtual.computercontrol.ITargetPackagesAdditionCallback p1) throws android.os.RemoteException;
    public void attachNotificationInfo(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public android.companion.virtual.computercontrol.IInteractiveMirror createInteractiveMirror(com.android.internal.os.IResultReceiver p0, android.view.SurfaceControl p1) throws android.os.RemoteException;
    public void handOverApplications() throws android.os.RemoteException;
    public void initialize(android.companion.virtual.computercontrol.IComputerControlLifecycleCallback p0, android.view.Surface p1) throws android.os.RemoteException;
    public android.os.ICancellationSignal insertText(java.lang.String p0, boolean p1, boolean p2, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p3) throws android.os.RemoteException;
    public void launchApplication(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.ICancellationSignal longPress(int p0, int p1, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p2) throws android.os.RemoteException;
    public void notifyBlocked() throws android.os.RemoteException;
    public void notifyScreenshotResult() throws android.os.RemoteException;
    public void notifySuspend() throws android.os.RemoteException;
    public android.os.ICancellationSignal performAction(int p0, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p1) throws android.os.RemoteException;
    public boolean requestResume() throws android.os.RemoteException;
    public void requestScreenshot(android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p0) throws android.os.RemoteException;
    public void setPreviewIntent(android.app.PendingIntent p0) throws android.os.RemoteException;
    public void startActivity(android.content.Intent p0, android.os.Bundle p1) throws android.os.RemoteException;
    public android.os.ICancellationSignal swipe(int p0, int p1, int p2, int p3, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p4) throws android.os.RemoteException;
    public android.os.ICancellationSignal tap(int p0, int p1, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p2) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.computercontrol.IComputerControlSession {
        public Default() {}
        public void addPackagesForAutomation(java.util.List<java.lang.String> p0, android.companion.virtual.computercontrol.ITargetPackagesAdditionCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void attachNotificationInfo(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public android.companion.virtual.computercontrol.IInteractiveMirror createInteractiveMirror(com.android.internal.os.IResultReceiver p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return null; }
        public void handOverApplications() throws android.os.RemoteException {}
        public void initialize(android.companion.virtual.computercontrol.IComputerControlLifecycleCallback p0, android.view.Surface p1) throws android.os.RemoteException {}
        public android.os.ICancellationSignal insertText(java.lang.String p0, boolean p1, boolean p2, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p3) throws android.os.RemoteException { return null; }
        public void launchApplication(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.ICancellationSignal longPress(int p0, int p1, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p2) throws android.os.RemoteException { return null; }
        public void notifyBlocked() throws android.os.RemoteException {}
        public void notifyScreenshotResult() throws android.os.RemoteException {}
        public void notifySuspend() throws android.os.RemoteException {}
        public android.os.ICancellationSignal performAction(int p0, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p1) throws android.os.RemoteException { return null; }
        public boolean requestResume() throws android.os.RemoteException { return false; }
        public void requestScreenshot(android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p0) throws android.os.RemoteException {}
        public void setPreviewIntent(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public void startActivity(android.content.Intent p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public android.os.ICancellationSignal swipe(int p0, int p1, int p2, int p3, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p4) throws android.os.RemoteException { return null; }
        public android.os.ICancellationSignal tap(int p0, int p1, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p2) throws android.os.RemoteException { return null; }
    }

    public static interface IInteractionResultReceiver extends android.os.IInterface {
        public static final java.lang.String DESCRIPTOR = "android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver";
        public void onInteractionResult(int p0) throws android.os.RemoteException;

        public static class Default implements android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver {
            public Default() {}
            public android.os.IBinder asBinder() { return null; }
            public void onInteractionResult(int p0) throws android.os.RemoteException {}
        }

        public static @interface Result {
            public static final int CANCELLED = 1;
            public static final int FAILED = 2;
            public static final int NOT_PERMITTED = 3;
            public static final int SUCCESS = 0;
        }

        public static abstract class Stub extends android.os.Binder implements android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver {
            static final int TRANSACTION_onInteractionResult = 1;
            public Stub() { super(); }
            public static android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver asInterface(android.os.IBinder p0) { return null; }
            public static java.lang.String getDefaultTransactionName(int p0) { return null; }
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getTransactionName(int p0) { return null; }
            public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

            private static final class Proxy implements android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver {
                private android.os.IBinder mRemote;
                Proxy(android.os.IBinder p0) {}
                public android.os.IBinder asBinder() { return null; }
                public final java.lang.String getInterfaceDescriptor() { return null; }
                public void onInteractionResult(int p0) throws android.os.RemoteException {}
            }
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.computercontrol.IComputerControlSession {
        static final int TRANSACTION_addPackagesForAutomation = 18;
        static final int TRANSACTION_attachNotificationInfo = 11;
        static final int TRANSACTION_close = 19;
        static final int TRANSACTION_createInteractiveMirror = 8;
        static final int TRANSACTION_handOverApplications = 4;
        static final int TRANSACTION_initialize = 1;
        static final int TRANSACTION_insertText = 9;
        static final int TRANSACTION_launchApplication = 2;
        static final int TRANSACTION_longPress = 7;
        static final int TRANSACTION_notifyBlocked = 15;
        static final int TRANSACTION_notifyScreenshotResult = 14;
        static final int TRANSACTION_notifySuspend = 16;
        static final int TRANSACTION_performAction = 10;
        static final int TRANSACTION_requestResume = 17;
        static final int TRANSACTION_requestScreenshot = 13;
        static final int TRANSACTION_setPreviewIntent = 12;
        static final int TRANSACTION_startActivity = 3;
        static final int TRANSACTION_swipe = 6;
        static final int TRANSACTION_tap = 5;
        public Stub() { super(); }
        public static android.companion.virtual.computercontrol.IComputerControlSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.companion.virtual.computercontrol.IComputerControlSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addPackagesForAutomation(java.util.List<java.lang.String> p0, android.companion.virtual.computercontrol.ITargetPackagesAdditionCallback p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void attachNotificationInfo(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public android.companion.virtual.computercontrol.IInteractiveMirror createInteractiveMirror(com.android.internal.os.IResultReceiver p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void handOverApplications() throws android.os.RemoteException {}
            public void initialize(android.companion.virtual.computercontrol.IComputerControlLifecycleCallback p0, android.view.Surface p1) throws android.os.RemoteException {}
            public android.os.ICancellationSignal insertText(java.lang.String p0, boolean p1, boolean p2, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p3) throws android.os.RemoteException { return null; }
            public void launchApplication(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.os.ICancellationSignal longPress(int p0, int p1, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p2) throws android.os.RemoteException { return null; }
            public void notifyBlocked() throws android.os.RemoteException {}
            public void notifyScreenshotResult() throws android.os.RemoteException {}
            public void notifySuspend() throws android.os.RemoteException {}
            public android.os.ICancellationSignal performAction(int p0, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p1) throws android.os.RemoteException { return null; }
            public boolean requestResume() throws android.os.RemoteException { return false; }
            public void requestScreenshot(android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p0) throws android.os.RemoteException {}
            public void setPreviewIntent(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public void startActivity(android.content.Intent p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public android.os.ICancellationSignal swipe(int p0, int p1, int p2, int p3, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p4) throws android.os.RemoteException { return null; }
            public android.os.ICancellationSignal tap(int p0, int p1, android.companion.virtual.computercontrol.IComputerControlSession.IInteractionResultReceiver p2) throws android.os.RemoteException { return null; }
        }
    }
}
