package android.webkit;

public abstract class WebResourceError {
    @android.annotation.SystemApi
    public WebResourceError() {}
    public abstract java.lang.CharSequence getDescription();
    public abstract int getErrorCode();
}
