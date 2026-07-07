package android.window;

public interface ObserverOnBackAnimationCallback extends android.window.OnBackAnimationCallback {
    public void onBackCancelled();
    public void onBackInvoked();
    public void onBackStarted(android.window.BackEvent p0);
}
