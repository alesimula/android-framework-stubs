package android.gui;

public class BLASTBufferQueueState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.gui.BLASTBufferQueueState> CREATOR = null;
    public boolean acquireSingleBuffer;
    public android.os.IBinder applyToken;
    public int format;
    public java.lang.String name;
    public int producerId;
    public android.gui.Size requestedSize;
    public boolean setBufferHasBarrier;
    public android.gui.Size size;
    public android.view.SurfaceControl surfaceControl;
    public android.view.SurfaceControl.Transaction syncTransaction;
    public android.gui.ITransactionHangCallback transactionHangCallback;
    public android.gui.ITransactionReadyCallback transactionReadyCallback;
    public int transformHint;
    public boolean updateDestinationFrame;
    public BLASTBufferQueueState() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
