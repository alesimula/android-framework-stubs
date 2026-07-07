package android.hardware.radio;

@android.annotation.SystemApi
public final class ProgramList implements java.lang.AutoCloseable {
    private boolean mIsClosed;
    private boolean mIsComplete;
    private final java.util.List<android.hardware.radio.ProgramList.ListCallback> mListCallbacks = null;
    private final java.lang.Object mLock = null;
    private android.hardware.radio.ProgramList.OnCloseListener mOnCloseListener;
    private final java.util.List<android.hardware.radio.ProgramList.OnCompleteListener> mOnCompleteListeners = null;
    private final android.util.ArrayMap<android.hardware.radio.ProgramSelector.Identifier, android.util.ArrayMap<android.hardware.radio.UniqueProgramIdentifier, android.hardware.radio.RadioManager.ProgramInfo>> mPrograms = null;
    ProgramList() {}
    private void putLocked(android.hardware.radio.RadioManager.ProgramInfo p0, java.util.Set<android.hardware.radio.ProgramSelector.Identifier> p1) {}
    private void removeLocked(android.hardware.radio.UniqueProgramIdentifier p0, java.util.List<android.hardware.radio.ProgramSelector.Identifier> p1) {}
    public void addOnCompleteListener(android.hardware.radio.ProgramList.OnCompleteListener p0) {}
    public void addOnCompleteListener(java.util.concurrent.Executor p0, android.hardware.radio.ProgramList.OnCompleteListener p1) {}
    void apply(android.hardware.radio.ProgramList.Chunk p0) {}
    public void close() {}
    @java.lang.Deprecated
    public android.hardware.radio.RadioManager.ProgramInfo get(android.hardware.radio.ProgramSelector.Identifier p0) { return null; }
    public java.util.List<android.hardware.radio.RadioManager.ProgramInfo> getProgramInfos(android.hardware.radio.ProgramSelector.Identifier p0) { return null; }
    public void registerListCallback(android.hardware.radio.ProgramList.ListCallback p0) {}
    public void registerListCallback(java.util.concurrent.Executor p0, android.hardware.radio.ProgramList.ListCallback p1) {}
    public void removeOnCompleteListener(android.hardware.radio.ProgramList.OnCompleteListener p0) {}
    void setOnCloseListener(android.hardware.radio.ProgramList.OnCloseListener p0) {}
    public java.util.List<android.hardware.radio.RadioManager.ProgramInfo> toList() { return null; }
    public void unregisterListCallback(android.hardware.radio.ProgramList.ListCallback p0) {}

    public static final class Chunk implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.ProgramList.Chunk> CREATOR = null;
        private final boolean mComplete = false;
        private final java.util.Set<android.hardware.radio.RadioManager.ProgramInfo> mModified = null;
        private final boolean mPurge = false;
        private final java.util.Set<android.hardware.radio.UniqueProgramIdentifier> mRemoved = null;
        private Chunk(android.os.Parcel p0) {}
        public Chunk(boolean p0, boolean p1, java.util.Set<android.hardware.radio.RadioManager.ProgramInfo> p2, java.util.Set<android.hardware.radio.UniqueProgramIdentifier> p3) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.util.Set<android.hardware.radio.RadioManager.ProgramInfo> getModified() { return null; }
        public java.util.Set<android.hardware.radio.UniqueProgramIdentifier> getRemoved() { return null; }
        public boolean isComplete() { return false; }
        public boolean isPurge() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Filter implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.ProgramList.Filter> CREATOR = null;
        private final boolean mExcludeModifications = false;
        private final java.util.Set<java.lang.Integer> mIdentifierTypes = null;
        private final java.util.Set<android.hardware.radio.ProgramSelector.Identifier> mIdentifiers = null;
        private final boolean mIncludeCategories = false;
        private final java.util.Map<java.lang.String, java.lang.String> mVendorFilter = null;
        public Filter() {}
        private Filter(android.os.Parcel p0) {}
        public Filter(java.util.Map<java.lang.String, java.lang.String> p0) {}
        public Filter(java.util.Set<java.lang.Integer> p0, java.util.Set<android.hardware.radio.ProgramSelector.Identifier> p1, boolean p2, boolean p3) {}
        public boolean areCategoriesIncluded() { return false; }
        public boolean areModificationsExcluded() { return false; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.util.Set<java.lang.Integer> getIdentifierTypes() { return null; }
        public java.util.Set<android.hardware.radio.ProgramSelector.Identifier> getIdentifiers() { return null; }
        public java.util.Map<java.lang.String, java.lang.String> getVendorFilter() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static abstract class ListCallback {
        public ListCallback() {}
        public void onItemChanged(android.hardware.radio.ProgramSelector.Identifier p0) {}
        public void onItemRemoved(android.hardware.radio.ProgramSelector.Identifier p0) {}
    }

    static interface OnCloseListener {
        public void onClose();
    }

    public static interface OnCompleteListener {
        public void onComplete();
    }
}
