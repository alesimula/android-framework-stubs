package android.text;

@java.lang.Deprecated
public abstract class ClipboardManager {
    public ClipboardManager() {}
    public abstract java.lang.CharSequence getText();
    public abstract boolean hasText();
    public abstract void setText(java.lang.CharSequence p0);
}
