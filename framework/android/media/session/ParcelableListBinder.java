package android.media.session;

public class ParcelableListBinder<T extends android.os.Parcelable> extends android.os.Binder {
    private static final int END_OF_PARCEL = 0;
    private static final int ITEM_CONTINUED = 1;
    private static final int SUGGESTED_MAX_IPC_SIZE = Integer.valueOf(0);
    private boolean mConsumed;
    private final java.util.function.Consumer<java.util.List<T>> mConsumer = null;
    private int mCount;
    private final java.util.List<T> mList = null;
    private final java.lang.Class<T> mListElementsClass = null;
    private final java.lang.Object mLock = null;
    public ParcelableListBinder(java.lang.Class<T> p0, java.util.function.Consumer<java.util.List<T>> p1) { super(); }
    public static <T extends android.os.Parcelable> void send(android.os.IBinder p0, java.util.List<T> p1) throws android.os.RemoteException {}
    protected boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
}
