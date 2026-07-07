package android.content.pm;

abstract class BaseParceledListSlice<T extends java.lang.Object> implements android.os.Parcelable {
    private static final boolean DEBUG = false;
    private static final int MAX_IPC_SIZE = Integer.valueOf(0);
    private static final java.lang.String TAG = "ParceledListSlice";
    private static final int WARN_ELM_SIZE = Integer.valueOf(0);
    private boolean mHasBeenParceled;
    private int mInlineCountLimit;
    private java.util.List<T> mList;
    BaseParceledListSlice(android.os.Parcel p0, java.lang.ClassLoader p1) {}
    public BaseParceledListSlice(java.util.List<T> p0) {}
    private T readCreator(android.os.Parcelable.Creator<?> p0, android.os.Parcel p1, java.lang.ClassLoader p2) { return null; }
    private java.lang.Class<?> readVerifyAndAddElement(android.os.Parcelable.Creator<?> p0, android.os.Parcel p1, java.lang.ClassLoader p2, java.lang.Class<?> p3) { return null; }
    private static void verifySameType(java.lang.Class<?> p0, java.lang.Class<?> p1) {}
    protected android.os.Parcel.ReadWriteHelper createReadWriteHelper() { return null; }
    public java.util.List<T> getList() { return null; }
    protected abstract android.os.Parcelable.Creator<?> readParcelableCreator(android.os.Parcel p0, java.lang.ClassLoader p1);
    public void setInlineCountLimit(int p0) {}
    protected abstract void writeElement(T p0, android.os.Parcel p1, int p2);
    protected abstract void writeParcelableCreator(T p0, android.os.Parcel p1);
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
