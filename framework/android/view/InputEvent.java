package android.view;

public abstract class InputEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.InputEvent> CREATOR = null;
    protected static final int PARCEL_TOKEN_KEY_EVENT = 2;
    protected static final int PARCEL_TOKEN_MOTION_EVENT = 1;
    private static final boolean TRACK_RECYCLED_LOCATION = false;
    private static final java.util.concurrent.atomic.AtomicInteger mNextSeq = null;
    protected boolean mRecycled;
    private java.lang.RuntimeException mRecycledLocation;
    protected int mSeq;
    InputEvent() {}
    public abstract void cancel();
    public abstract android.view.InputEvent copy();
    public int describeContents() { return 0; }
    public final android.view.InputDevice getDevice() { return null; }
    public abstract int getDeviceId();
    public abstract int getDisplayId();
    public abstract long getEventTime();
    public abstract long getEventTimeNanos();
    public abstract int getId();
    public int getSequenceNumber() { return 0; }
    public abstract int getSource();
    public boolean isFromSource(int p0) { return false; }
    public abstract boolean isTainted();
    protected void prepareForReuse() {}
    public void recycle() {}
    public void recycleIfNeededAfterDispatch() {}
    public abstract void setDisplayId(int p0);
    public abstract void setSource(int p0);
    public abstract void setTainted(boolean p0);
}
