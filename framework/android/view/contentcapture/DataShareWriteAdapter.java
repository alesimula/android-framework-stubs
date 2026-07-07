package android.view.contentcapture;

public interface DataShareWriteAdapter {
    default public void onError(int p0) {}
    public void onRejected();
    public void onWrite(android.os.ParcelFileDescriptor p0);
}
