package com.android.internal.os;

public final class LongMultiStateCounter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.os.LongMultiStateCounter> CREATOR = null;
    final long mNativeObject = 0L;
    private final int mStateCount = 0;
    public LongMultiStateCounter(int p0) {}
    private LongMultiStateCounter(android.os.Parcel p0) {}
    private static native void native_addCount(long p0, long p1);
    private static native long native_getCount(long p0, int p1);
    private static native long native_getReleaseFunc();
    private static native int native_getStateCount(long p0);
    private static native void native_incrementValue(long p0, long p1, long p2);
    private static native long native_init(int p0);
    private static native long native_initFromParcel(android.os.Parcel p0);
    private static native void native_reset(long p0);
    private static native void native_setEnabled(long p0, boolean p1, long p2);
    private static native void native_setState(long p0, int p1, long p2);
    private static native java.lang.String native_toString(long p0);
    private static native long native_updateValue(long p0, long p1, long p2);
    private static native void native_writeToParcel(long p0, android.os.Parcel p1, int p2);
    private void registerNativeAllocation() {}
    private void registerNativeAllocation$ravenwood() {}
    public void addCount(long p0) {}
    public int describeContents() { return 0; }
    public long getCount(int p0) { return 0L; }
    public int getStateCount() { return 0; }
    public long getTotalCount() { return 0L; }
    public void incrementValue(long p0, long p1) {}
    public void reset() {}
    public void setEnabled(boolean p0, long p1) {}
    public void setState(int p0, long p1) {}
    public java.lang.String toString() { return null; }
    public long updateValue(long p0, long p1) { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
