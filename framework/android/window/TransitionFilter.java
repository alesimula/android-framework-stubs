package android.window;

public final class TransitionFilter implements android.os.Parcelable {
    public static final int CONTAINER_ORDER_ANY = 0;
    public static final int CONTAINER_ORDER_TOP = 1;
    public static final android.os.Parcelable.Creator<android.window.TransitionFilter> CREATOR = null;
    public int mFlags;
    public int mNotFlags;
    public android.window.TransitionFilter.Requirement[] mRequirements;
    public int[] mTypeSet;
    public TransitionFilter() {}
    private TransitionFilter(android.os.Parcel p0) {}
    public TransitionFilter(android.window.TransitionFilter p0) {}
    private static java.lang.String containerOrderToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean matches(android.window.TransitionInfo p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface ContainerOrder {
    }

    public static final class Requirement implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionFilter.Requirement> CREATOR = null;
        public int mActivityType;
        public java.lang.Boolean mCustomAnimation;
        public int mFlags;
        public boolean mIsCrossDisplayMove;
        public android.os.IBinder mLaunchCookie;
        public int[] mModes;
        public boolean mMustBeIndependent;
        public boolean mMustBeTask;
        public boolean mNot;
        public int mOrder;
        public android.os.IBinder mTaskFragmentToken;
        public android.content.ComponentName mTopActivity;
        public int mWindowingMode;
        public Requirement() {}
        private Requirement(android.os.Parcel p0) {}
        public Requirement(android.window.TransitionFilter.Requirement p0) {}
        private boolean matchesCookie(android.app.ActivityManager.RunningTaskInfo p0) { return false; }
        private boolean matchesTopActivity(android.app.ActivityManager.RunningTaskInfo p0, android.content.ComponentName p1) { return false; }
        public int describeContents() { return 0; }
        boolean matches(android.window.TransitionInfo p0) { return false; }
        boolean matches(android.window.TransitionRequestInfo p0) { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
