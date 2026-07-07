package com.android.internal.os;

public final class LongArrayMultiStateCounter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.os.LongArrayMultiStateCounter> CREATOR = null;
    private final int mLength = 0;
    final long mNativeObject = 0L;
    private final int mStateCount = 0;
    public LongArrayMultiStateCounter(int p0, int p1) {}
    private LongArrayMultiStateCounter(android.os.Parcel p0) {}
    private static native void native_addCounts(long p0, long[] p1);
    private static native void native_copyStatesFrom(long p0, long p1);
    private static native int native_getArrayLength(long p0);
    private static native boolean native_getCounts(long p0, long[] p1, int p2);
    private static native long native_getReleaseFunc();
    private static native int native_getStateCount(long p0);
    private static native void native_incrementValues(long p0, long[] p1, long p2);
    private static native long native_init(int p0, int p1);
    private static native long native_initFromParcel(android.os.Parcel p0);
    private static native void native_reset(long p0);
    private static native void native_setEnabled(long p0, boolean p1, long p2);
    private static native void native_setState(long p0, int p1, long p2);
    private static native void native_setValues(long p0, int p1, long[] p2);
    private static native java.lang.String native_toString(long p0);
    private static native void native_updateValues(long p0, long[] p1, long p2);
    private static native void native_writeToParcel(long p0, android.os.Parcel p1, int p2);
    private void registerNativeAllocation() {}
    private void registerNativeAllocation$ravenwood() {}
    public void addCounts(long[] p0) {}
    public void copyStatesFrom(com.android.internal.os.LongArrayMultiStateCounter p0) {}
    public int describeContents() { return 0; }
    public int getArrayLength() { return 0; }
    public boolean getCounts(long[] p0, int p1) { return false; }
    public int getStateCount() { return 0; }
    public void incrementValues(long[] p0, long p1) {}
    public void reset() {}
    public void setEnabled(boolean p0, long p1) {}
    public void setState(int p0, long p1) {}
    public void setValues(int p0, long[] p1) {}
    public java.lang.String toString() { return null; }
    public void updateValues(long[] p0, long p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
