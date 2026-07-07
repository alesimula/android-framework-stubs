package android.speech;

public interface ModelDownloadListener {
    public void onError(int p0);
    public void onProgress(int p0);
    public void onScheduled();
    public void onSuccess();
}
