package android.app;

final class FragmentState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.FragmentState> CREATOR = null;
    final android.os.Bundle mArguments = null;
    final java.lang.String mClassName = null;
    final int mContainerId = 0;
    final boolean mDetached = false;
    final int mFragmentId = 0;
    final boolean mFromLayout = false;
    final boolean mHidden = false;
    final int mIndex = 0;
    android.app.Fragment mInstance;
    final boolean mRetainInstance = false;
    android.os.Bundle mSavedFragmentState;
    final java.lang.String mTag = null;
    FragmentState(android.app.Fragment p0) {}
    FragmentState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.app.Fragment instantiate(android.app.FragmentHostCallback p0, android.app.FragmentContainer p1, android.app.Fragment p2, android.app.FragmentManagerNonConfig p3) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
