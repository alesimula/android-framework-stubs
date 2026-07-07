package com.android.internal.inputmethod;

public abstract class AbstractSafeList<T extends android.os.Parcelable> implements android.os.Parcelable {
    private byte[] mBuffer;
    protected AbstractSafeList(java.util.List<T> p0) {}
    protected AbstractSafeList(byte[] p0) {}
    protected static <T extends android.os.Parcelable> java.util.List<T> extractFrom(com.android.internal.inputmethod.AbstractSafeList<T> p0, android.os.Parcelable.Creator<T> p1) { return null; }
    public static <T extends android.os.Parcelable> byte[] marshall(java.util.List<T> p0) { return null; }
    public static <T extends android.os.Parcelable> java.util.List<T> unmarshall(byte[] p0, android.os.Parcelable.Creator<T> p1) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
