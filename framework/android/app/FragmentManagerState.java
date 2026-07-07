package android.app;

final class FragmentManagerState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.FragmentManagerState> CREATOR = null;
    android.app.FragmentState[] mActive;
    int[] mAdded;
    android.app.BackStackState[] mBackStack;
    int mNextFragmentIndex;
    int mPrimaryNavActiveIndex;
    public FragmentManagerState() {}
    public FragmentManagerState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
