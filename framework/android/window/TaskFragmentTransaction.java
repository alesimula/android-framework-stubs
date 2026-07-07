package android.window;

public final class TaskFragmentTransaction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentTransaction> CREATOR = null;
    public static final int TYPE_ACTIVITY_REMOVED_FROM_TASK_FRAGMENT = 7;
    public static final int TYPE_ACTIVITY_REPARENTED_TO_TASK = 6;
    public static final int TYPE_TASK_FRAGMENT_APPEARED = 1;
    public static final int TYPE_TASK_FRAGMENT_ERROR = 5;
    public static final int TYPE_TASK_FRAGMENT_INFO_CHANGED = 2;
    public static final int TYPE_TASK_FRAGMENT_PARENT_INFO_CHANGED = 4;
    public static final int TYPE_TASK_FRAGMENT_VANISHED = 3;
    private final java.util.ArrayList<android.window.TaskFragmentTransaction.Change> mChanges = null;
    private final android.os.IBinder mTransactionToken = null;
    public TaskFragmentTransaction() {}
    private TaskFragmentTransaction(android.os.Parcel p0) {}
    public void addChange(android.window.TaskFragmentTransaction.Change p0) {}
    public int describeContents() { return 0; }
    public java.util.List<android.window.TaskFragmentTransaction.Change> getChanges() { return null; }
    public android.os.IBinder getTransactionToken() { return null; }
    public boolean isEmpty() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Change implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TaskFragmentTransaction.Change> CREATOR = null;
        private android.content.Intent mActivityIntent;
        private android.os.IBinder mActivityToken;
        private android.os.Bundle mErrorBundle;
        private android.os.IBinder mErrorCallbackToken;
        private boolean mIsActivityInOrganizerProcess;
        private android.os.IBinder mOtherActivityToken;
        private android.view.SurfaceControl mSurfaceControl;
        private android.window.TaskFragmentInfo mTaskFragmentInfo;
        private android.window.TaskFragmentParentInfo mTaskFragmentParentInfo;
        private android.os.IBinder mTaskFragmentToken;
        private int mTaskId;
        private final int mType = 0;
        public Change(int p0) {}
        private Change(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public android.content.Intent getActivityIntent() { return null; }
        public android.os.IBinder getActivityToken() { return null; }
        public android.os.Bundle getErrorBundle() { return null; }
        public android.os.IBinder getErrorCallbackToken() { return null; }
        public android.os.IBinder getOtherActivityToken() { return null; }
        public android.window.TaskFragmentInfo getTaskFragmentInfo() { return null; }
        public android.window.TaskFragmentParentInfo getTaskFragmentParentInfo() { return null; }
        public android.view.SurfaceControl getTaskFragmentSurfaceControl() { return null; }
        public android.os.IBinder getTaskFragmentToken() { return null; }
        public int getTaskId() { return 0; }
        public int getType() { return 0; }
        public boolean isActivityInOrganizerProcess() { return false; }
        public android.window.TaskFragmentTransaction.Change setActivityIntent(android.content.Intent p0) { return null; }
        public android.window.TaskFragmentTransaction.Change setActivityToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentTransaction.Change setErrorBundle(android.os.Bundle p0) { return null; }
        public android.window.TaskFragmentTransaction.Change setErrorCallbackToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentTransaction.Change setIsActivityInOrganizerProcess(boolean p0) { return null; }
        public android.window.TaskFragmentTransaction.Change setOtherActivityToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentTransaction.Change setTaskFragmentInfo(android.window.TaskFragmentInfo p0) { return null; }
        public android.window.TaskFragmentTransaction.Change setTaskFragmentParentInfo(android.window.TaskFragmentParentInfo p0) { return null; }
        public android.window.TaskFragmentTransaction.Change setTaskFragmentSurfaceControl(android.view.SurfaceControl p0) { return null; }
        public android.window.TaskFragmentTransaction.Change setTaskFragmentToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentTransaction.Change setTaskId(int p0) { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ChangeType {
    }
}
