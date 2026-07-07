package android.view.translation;

public interface ViewTranslationCallback {
    default public void enableContentPadding() {}
    public boolean onClearTranslation(android.view.View p0);
    public boolean onHideTranslation(android.view.View p0);
    public boolean onShowTranslation(android.view.View p0);
    default public void setAnimationDurationMillis(int p0) {}
}
