package android.window;

public final class TaskFragmentCreationParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentCreationParams> CREATOR = null;
    private final boolean mAllowTransitionWhenEmpty = false;
    private final int mConfigurationChangeMask = 0;
    private final android.os.IBinder mFragmentToken = null;
    private final android.graphics.Rect mInitialRelativeBounds = null;
    private final android.window.TaskFragmentOrganizerToken mOrganizer = null;
    private final int mOverrideOrientation = 0;
    private final android.os.IBinder mOwnerToken = null;
    private final android.os.IBinder mPairedActivityToken = null;
    private final android.os.IBinder mPairedPrimaryFragmentToken = null;
    private final int mWindowingMode = 0;
    private TaskFragmentCreationParams(android.os.Parcel p0) {}
    private TaskFragmentCreationParams(android.window.TaskFragmentOrganizerToken p0, android.os.IBinder p1, android.os.IBinder p2, android.graphics.Rect p3, int p4, android.os.IBinder p5, android.os.IBinder p6, boolean p7, int p8, int p9) {}
    public int describeContents() { return 0; }
    public boolean getAllowTransitionWhenEmpty() { return false; }
    public int getConfigurationChangeMask() { return 0; }
    public android.os.IBinder getFragmentToken() { return null; }
    public android.graphics.Rect getInitialRelativeBounds() { return null; }
    public android.window.TaskFragmentOrganizerToken getOrganizer() { return null; }
    public int getOverrideOrientation() { return 0; }
    public android.os.IBinder getOwnerToken() { return null; }
    public android.os.IBinder getPairedActivityToken() { return null; }
    public android.os.IBinder getPairedPrimaryFragmentToken() { return null; }
    public int getWindowingMode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mAllowTransitionWhenEmpty;
        private int mConfigurationChangeMask;
        private final android.os.IBinder mFragmentToken = null;
        private final android.graphics.Rect mInitialRelativeBounds = null;
        private final android.window.TaskFragmentOrganizerToken mOrganizer = null;
        private int mOverrideOrientation;
        private final android.os.IBinder mOwnerToken = null;
        private android.os.IBinder mPairedActivityToken;
        private android.os.IBinder mPairedPrimaryFragmentToken;
        private int mWindowingMode;
        public Builder(android.window.TaskFragmentOrganizerToken p0, android.os.IBinder p1, android.os.IBinder p2) {}
        public android.window.TaskFragmentCreationParams build() { return null; }
        public android.window.TaskFragmentCreationParams.Builder setAllowTransitionWhenEmpty(boolean p0) { return null; }
        public android.window.TaskFragmentCreationParams.Builder setConfigurationChangeMask(int p0) { return null; }
        public android.window.TaskFragmentCreationParams.Builder setInitialRelativeBounds(android.graphics.Rect p0) { return null; }
        public android.window.TaskFragmentCreationParams.Builder setOverrideOrientation(int p0) { return null; }
        public android.window.TaskFragmentCreationParams.Builder setPairedActivityToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentCreationParams.Builder setPairedPrimaryFragmentToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentCreationParams.Builder setWindowingMode(int p0) { return null; }
    }
}
