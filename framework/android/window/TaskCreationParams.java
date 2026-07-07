package android.window;

public final class TaskCreationParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TaskCreationParams> CREATOR = null;
    private int mDisplayId;
    private android.os.IBinder mLaunchCookie;
    private java.lang.String mName;
    private boolean mOnTop;
    private android.window.WindowContainerToken mParentContainer;
    private android.window.TaskPropertiesRequest mTaskPropertiesRequest;
    private boolean mVisibilityBarrier;
    private int mWindowingMode;
    TaskCreationParams(android.os.Parcel p0) {}
    TaskCreationParams(java.lang.String p0, int p1, android.window.WindowContainerToken p2, int p3, boolean p4, android.os.IBinder p5, boolean p6, android.window.TaskPropertiesRequest p7) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getDisplayId() { return 0; }
    public android.os.IBinder getLaunchCookie() { return null; }
    public java.lang.String getName() { return null; }
    public android.window.WindowContainerToken getParentContainer() { return null; }
    public android.window.TaskPropertiesRequest getTaskPropertiesRequest() { return null; }
    public int getWindowingMode() { return 0; }
    public int hashCode() { return 0; }
    public boolean isOnTop() { return false; }
    public boolean isVisibilityBarrier() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        abstract android.window.TaskCreationParams.Builder setLaunchCookie(android.os.IBinder p0);
    }

    public static final class Builder extends android.window.TaskCreationParams.BaseBuilder {
        private long mBuilderFieldsSet;
        private int mDisplayId;
        private android.os.IBinder mLaunchCookie;
        private java.lang.String mName;
        private boolean mOnTop;
        private android.window.WindowContainerToken mParentContainer;
        private android.window.TaskPropertiesRequest mTaskPropertiesRequest;
        private boolean mVisibilityBarrier;
        private int mWindowingMode;
        public Builder() { super(); }
        private void checkNotUsed() {}
        public android.window.TaskCreationParams build() { return null; }
        public android.window.TaskCreationParams.Builder setDisplayId(int p0) { return null; }
        android.window.TaskCreationParams.Builder setLaunchCookie(android.os.IBinder p0) { return null; }
        public android.window.TaskCreationParams.Builder setName(java.lang.String p0) { return null; }
        public android.window.TaskCreationParams.Builder setOnTop(boolean p0) { return null; }
        public android.window.TaskCreationParams.Builder setParentContainer(android.window.WindowContainerToken p0) { return null; }
        public android.window.TaskCreationParams.Builder setTaskPropertiesRequest(android.window.TaskPropertiesRequest p0) { return null; }
        public android.window.TaskCreationParams.Builder setVisibilityBarrier(boolean p0) { return null; }
        public android.window.TaskCreationParams.Builder setWindowingMode(int p0) { return null; }
    }
}
