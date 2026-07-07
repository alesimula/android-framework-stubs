package android.window;

public class BackAnimationAdapter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.BackAnimationAdapter> CREATOR = null;
    public int mOriginDisplayId;
    private final android.window.IBackAnimationRunner mRunner = null;
    private int[] mSupportedAnimators;
    public BackAnimationAdapter(android.os.Parcel p0) {}
    public BackAnimationAdapter(android.window.IBackAnimationRunner p0) {}
    public int describeContents() { return 0; }
    public android.window.IBackAnimationRunner getRunner() { return null; }
    public boolean isAnimatable(int p0) { return false; }
    public void updateSupportedAnimators(java.util.ArrayList<java.lang.Integer> p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
