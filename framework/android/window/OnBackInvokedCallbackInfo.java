package android.window;

public final class OnBackInvokedCallbackInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.OnBackInvokedCallbackInfo> CREATOR = null;
    private final android.window.IOnBackInvokedCallback mCallback = null;
    private final boolean mIsAnimationCallback = false;
    private final int mOverrideBehavior = 0;
    private int mPriority;
    private OnBackInvokedCallbackInfo(android.os.Parcel p0) {}
    public OnBackInvokedCallbackInfo(android.window.IOnBackInvokedCallback p0, int p1, boolean p2, int p3) {}
    public int describeContents() { return 0; }
    public android.window.IOnBackInvokedCallback getCallback() { return null; }
    public int getOverrideBehavior() { return 0; }
    public int getPriority() { return 0; }
    public boolean isAnimationCallback() { return false; }
    public boolean isSystemCallback() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
