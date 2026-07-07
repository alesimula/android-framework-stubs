package android.window;

public interface ITaskOrganizerController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.ITaskOrganizerController";
    public void clearExcludeLayersFromTaskSnapshot(android.window.WindowContainerToken p0) throws android.os.RemoteException;
    public android.window.TaskAppearedInfo createTask(android.window.TaskCreationParams p0) throws android.os.RemoteException;
    public boolean deleteTask(android.window.WindowContainerToken p0) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getChildTasks(android.window.WindowContainerToken p0, int[] p1) throws android.os.RemoteException;
    public android.window.WindowContainerToken getImeLayeringTarget(int p0) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRootTasks(int p0, int[] p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.window.TaskAppearedInfo> registerTaskOrganizer(android.window.ITaskOrganizer p0) throws android.os.RemoteException;
    public void restartTaskProcessIfVisible(android.window.WindowContainerToken p0) throws android.os.RemoteException;
    public void restartTaskTopActivityProcessIfVisible(android.window.WindowContainerToken p0) throws android.os.RemoteException;
    public void setExcludeLayersFromTaskSnapshot(android.window.WindowContainerToken p0, android.view.SurfaceControl[] p1) throws android.os.RemoteException;
    public void unregisterTaskOrganizer(android.window.ITaskOrganizer p0) throws android.os.RemoteException;

    public static class Default implements android.window.ITaskOrganizerController {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void clearExcludeLayersFromTaskSnapshot(android.window.WindowContainerToken p0) throws android.os.RemoteException {}
        public android.window.TaskAppearedInfo createTask(android.window.TaskCreationParams p0) throws android.os.RemoteException { return null; }
        public boolean deleteTask(android.window.WindowContainerToken p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getChildTasks(android.window.WindowContainerToken p0, int[] p1) throws android.os.RemoteException { return null; }
        public android.window.WindowContainerToken getImeLayeringTarget(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRootTasks(int p0, int[] p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice<android.window.TaskAppearedInfo> registerTaskOrganizer(android.window.ITaskOrganizer p0) throws android.os.RemoteException { return null; }
        public void restartTaskProcessIfVisible(android.window.WindowContainerToken p0) throws android.os.RemoteException {}
        public void restartTaskTopActivityProcessIfVisible(android.window.WindowContainerToken p0) throws android.os.RemoteException {}
        public void setExcludeLayersFromTaskSnapshot(android.window.WindowContainerToken p0, android.view.SurfaceControl[] p1) throws android.os.RemoteException {}
        public void unregisterTaskOrganizer(android.window.ITaskOrganizer p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ITaskOrganizerController {
        static final int TRANSACTION_clearExcludeLayersFromTaskSnapshot = 11;
        static final int TRANSACTION_createTask = 3;
        static final int TRANSACTION_deleteTask = 4;
        static final int TRANSACTION_getChildTasks = 5;
        static final int TRANSACTION_getImeLayeringTarget = 7;
        static final int TRANSACTION_getRootTasks = 6;
        static final int TRANSACTION_registerTaskOrganizer = 1;
        static final int TRANSACTION_restartTaskProcessIfVisible = 9;
        static final int TRANSACTION_restartTaskTopActivityProcessIfVisible = 8;
        static final int TRANSACTION_setExcludeLayersFromTaskSnapshot = 10;
        static final int TRANSACTION_unregisterTaskOrganizer = 2;
        public Stub() { super(); }
        public static android.window.ITaskOrganizerController asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.window.ITaskOrganizerController {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void clearExcludeLayersFromTaskSnapshot(android.window.WindowContainerToken p0) throws android.os.RemoteException {}
            public android.window.TaskAppearedInfo createTask(android.window.TaskCreationParams p0) throws android.os.RemoteException { return null; }
            public boolean deleteTask(android.window.WindowContainerToken p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getChildTasks(android.window.WindowContainerToken p0, int[] p1) throws android.os.RemoteException { return null; }
            public android.window.WindowContainerToken getImeLayeringTarget(int p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRootTasks(int p0, int[] p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice<android.window.TaskAppearedInfo> registerTaskOrganizer(android.window.ITaskOrganizer p0) throws android.os.RemoteException { return null; }
            public void restartTaskProcessIfVisible(android.window.WindowContainerToken p0) throws android.os.RemoteException {}
            public void restartTaskTopActivityProcessIfVisible(android.window.WindowContainerToken p0) throws android.os.RemoteException {}
            public void setExcludeLayersFromTaskSnapshot(android.window.WindowContainerToken p0, android.view.SurfaceControl[] p1) throws android.os.RemoteException {}
            public void unregisterTaskOrganizer(android.window.ITaskOrganizer p0) throws android.os.RemoteException {}
        }
    }
}
