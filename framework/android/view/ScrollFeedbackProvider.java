package android.view;

public interface ScrollFeedbackProvider {
    public static android.view.ScrollFeedbackProvider createProvider(android.view.View p0) { return null; }
    public void onScrollLimit(int p0, int p1, int p2, boolean p3);
    public void onScrollProgress(int p0, int p1, int p2, int p3);
    public void onSnapToItem(int p0, int p1, int p2);
}
