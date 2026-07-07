package android.gui;

public class TransactionBarrier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.gui.TransactionBarrier> CREATOR = null;
    public java.lang.String barrierToken;
    public byte kind;
    public TransactionBarrier() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface BarrierKind {
        public static final byte KIND_INVALID = 0;
        public static final byte KIND_SIGNAL = 1;
        public static final byte KIND_WAIT = 2;
    }
}
