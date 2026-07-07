package android.media.tv.tuner;

@android.annotation.SystemApi
public interface LnbCallback {
    public void onDiseqcMessage(byte[] p0);
    public void onEvent(int p0);
}
