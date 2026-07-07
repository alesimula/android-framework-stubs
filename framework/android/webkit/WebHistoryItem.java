package android.webkit;

public abstract class WebHistoryItem implements java.lang.Cloneable {
    public WebHistoryItem() {}
    protected abstract android.webkit.WebHistoryItem clone();
    public abstract android.graphics.Bitmap getFavicon();
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract int getId();
    public abstract java.lang.String getOriginalUrl();
    public abstract java.lang.String getTitle();
    public abstract java.lang.String getUrl();
}
