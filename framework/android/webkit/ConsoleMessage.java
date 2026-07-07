package android.webkit;

public class ConsoleMessage {
    private android.webkit.ConsoleMessage.MessageLevel mLevel;
    private int mLineNumber;
    private java.lang.String mMessage;
    private java.lang.String mSourceId;
    public ConsoleMessage(java.lang.String p0, java.lang.String p1, int p2, android.webkit.ConsoleMessage.MessageLevel p3) {}
    public int lineNumber() { return 0; }
    public java.lang.String message() { return null; }
    public android.webkit.ConsoleMessage.MessageLevel messageLevel() { return null; }
    public java.lang.String sourceId() { return null; }

    public static enum MessageLevel {
        DEBUG,
        ERROR,
        LOG,
        TIP,
        WARNING;
        private static final android.webkit.ConsoleMessage.MessageLevel[] $VALUES = null;
        private MessageLevel() {}
    }
}
