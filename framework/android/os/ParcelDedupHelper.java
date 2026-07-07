package android.os;

public final class ParcelDedupHelper extends android.os.Parcel.ReadWriteHelper {
    private final android.os.ParcelDedupHelper.DedupCache<android.os.IBinder> mBinderCache = null;
    private final android.os.ParcelDedupHelper.DedupCache<java.lang.String> mString16Cache = null;
    private final android.os.ParcelDedupHelper.DedupCache<java.lang.String> mString8Cache = null;
    private ParcelDedupHelper(boolean p0, boolean p1, boolean p2) { super(); }
    public java.lang.String readString16(android.os.Parcel p0) { return null; }
    public java.lang.String readString8(android.os.Parcel p0) { return null; }
    public android.os.IBinder readStrongBinder(android.os.Parcel p0) { return null; }
    public void writeString16(android.os.Parcel p0, java.lang.String p1) {}
    public void writeString8(android.os.Parcel p0, java.lang.String p1) {}
    public void writeStrongBinder(android.os.Parcel p0, android.os.IBinder p1) {}

    public static final class Builder {
        private boolean mDedupBinders;
        private boolean mDedupString16;
        private boolean mDedupString8;
        public Builder() {}
        public android.os.ParcelDedupHelper build() { return null; }
        public android.os.ParcelDedupHelper.Builder dedupBinders(boolean p0) { return null; }
        public android.os.ParcelDedupHelper.Builder dedupString16(boolean p0) { return null; }
        public android.os.ParcelDedupHelper.Builder dedupString8(boolean p0) { return null; }
    }

    private static final class DedupCache<T extends java.lang.Object> {
        private static final int NEW_ENTRY_INDEX = -1;
        private final java.util.ArrayList<T> mRead = null;
        private final java.util.function.Function<android.os.Parcel, T> mReader = null;
        private final java.util.function.BiConsumer<android.os.Parcel, T> mWriter = null;
        private final android.util.ArrayMap<T, java.lang.Integer> mWritten = null;
        DedupCache(java.util.function.BiConsumer<android.os.Parcel, T> p0, java.util.function.Function<android.os.Parcel, T> p1) {}
        T read(android.os.Parcel p0) { return null; }
        void write(android.os.Parcel p0, T p1) {}
    }
}
