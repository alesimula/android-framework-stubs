package android.os;

public class WorkSource implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.WorkSource> CREATOR = null;
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "WorkSource";
    static android.os.WorkSource sGoneWork;
    static android.os.WorkSource sNewbWork;
    static final android.os.WorkSource sTmpWorkSource = null;
    private java.util.ArrayList<android.os.WorkSource.WorkChain> mChains;
    java.lang.String[] mNames;
    int mNum;
    int[] mUids;
    public WorkSource() {}
    @android.annotation.SystemApi
    public WorkSource(int p0) {}
    @android.annotation.SystemApi
    public WorkSource(int p0, java.lang.String p1) {}
    WorkSource(android.os.Parcel p0) {}
    public WorkSource(android.os.WorkSource p0) {}
    private static android.os.WorkSource addWork(android.os.WorkSource p0, int p1) { return null; }
    private static android.os.WorkSource addWork(android.os.WorkSource p0, int p1, java.lang.String p2) { return null; }
    private void clearNames() {}
    private int compare(android.os.WorkSource p0, int p1, int p2) { return 0; }
    public static java.util.ArrayList<android.os.WorkSource.WorkChain>[] diffChains(android.os.WorkSource p0, android.os.WorkSource p1) { return null; }
    private void insert(int p0, int p1) {}
    private void insert(int p0, int p1, java.lang.String p2) {}
    public static boolean isChainedBatteryAttributionEnabled(android.content.Context p0) { return false; }
    public static boolean isChainedBatteryAttributionEnabled$ravenwood(android.content.Context p0) { return false; }
    private boolean removeUids(android.os.WorkSource p0) { return false; }
    private boolean removeUidsAndNames(android.os.WorkSource p0) { return false; }
    private boolean updateLocked(android.os.WorkSource p0, boolean p1, boolean p2) { return false; }
    private boolean updateUidsAndNamesLocked(android.os.WorkSource p0, boolean p1, boolean p2) { return false; }
    private boolean updateUidsLocked(android.os.WorkSource p0, boolean p1, boolean p2) { return false; }
    public boolean add(int p0) { return false; }
    public boolean add(int p0, java.lang.String p1) { return false; }
    public boolean add(android.os.WorkSource p0) { return false; }
    @java.lang.Deprecated
    public android.os.WorkSource addReturningNewbs(android.os.WorkSource p0) { return null; }
    public void clear() {}
    @android.annotation.SystemApi
    public android.os.WorkSource.WorkChain createWorkChain() { return null; }
    public int describeContents() { return 0; }
    public boolean diff(android.os.WorkSource p0) { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    @java.lang.Deprecated
    public int get(int p0) { return 0; }
    public int getAttributionUid() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getName(int p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.String getPackageName(int p0) { return null; }
    @android.annotation.SystemApi
    public int getUid(int p0) { return 0; }
    @android.annotation.SystemApi
    public java.util.List<android.os.WorkSource.WorkChain> getWorkChains() { return null; }
    public int hashCode() { return 0; }
    @android.annotation.SystemApi
    public boolean isEmpty() { return false; }
    public boolean remove(android.os.WorkSource p0) { return false; }
    public void set(int p0) {}
    public void set(int p0, java.lang.String p1) {}
    public void set(android.os.WorkSource p0) {}
    @java.lang.Deprecated
    public android.os.WorkSource[] setReturningDiffs(android.os.WorkSource p0) { return null; }
    @android.annotation.SystemApi
    public int size() { return 0; }
    public java.lang.String toString() { return null; }
    public void transferWorkChains(android.os.WorkSource p0) {}
    @android.annotation.SystemApi
    public android.os.WorkSource withoutNames() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class WorkChain implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.os.WorkSource.WorkChain> CREATOR = null;
        private int mSize;
        private java.lang.String[] mTags;
        private int[] mUids;
        public WorkChain() {}
        private WorkChain(android.os.Parcel p0) {}
        public WorkChain(android.os.WorkSource.WorkChain p0) {}
        private void resizeArrays() {}
        public android.os.WorkSource.WorkChain addNode(int p0, java.lang.String p1) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getAttributionTag() { return null; }
        public int getAttributionUid() { return 0; }
        public int getSize() { return 0; }
        public java.lang.String[] getTags() { return null; }
        public int[] getUids() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
