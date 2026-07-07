package android.app.wearable;

@android.annotation.SystemApi
public interface WearableConnection {
    public android.os.ParcelFileDescriptor getConnection();
    public android.os.PersistableBundle getMetadata();
    public void onConnectionAccepted();
    public void onError(int p0);
}
