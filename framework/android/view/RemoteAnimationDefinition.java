package android.view;

public class RemoteAnimationDefinition implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.RemoteAnimationDefinition> CREATOR = null;
    private final android.util.SparseArray<android.view.RemoteAnimationDefinition.RemoteAnimationAdapterEntry> mTransitionAnimationMap = null;
    public RemoteAnimationDefinition() {}
    public RemoteAnimationDefinition(android.os.Parcel p0) {}
    public void addRemoteAnimation(int p0, int p1, android.view.RemoteAnimationAdapter p2) {}
    public void addRemoteAnimation(int p0, android.view.RemoteAnimationAdapter p1) {}
    public int describeContents() { return 0; }
    public android.view.RemoteAnimationAdapter getAdapter(int p0, android.util.ArraySet<java.lang.Integer> p1) { return null; }
    public boolean hasTransition(int p0, android.util.ArraySet<java.lang.Integer> p1) { return false; }
    public void linkToDeath(android.os.IBinder.DeathRecipient p0) {}
    public void setCallingPidUid(int p0, int p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static class RemoteAnimationAdapterEntry implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.RemoteAnimationDefinition.RemoteAnimationAdapterEntry> CREATOR = null;
        final int activityTypeFilter = 0;
        final android.view.RemoteAnimationAdapter adapter = null;
        private RemoteAnimationAdapterEntry(android.os.Parcel p0) {}
        RemoteAnimationAdapterEntry(android.view.RemoteAnimationAdapter p0, int p1) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
