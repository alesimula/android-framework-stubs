package android.view.input;

public class StylusButtonCompatibility extends android.view.InputEventCompatProcessor {
    private static final int STYLUS_BUTTONS_MASK = 96;
    public StylusButtonCompatibility(android.content.Context p0, android.os.Handler p1) { super((android.content.Context)null); }
    public static boolean isCompatibilityNeeded(android.content.Context p0) { return false; }
    public java.util.List<android.view.InputEvent> processInputEventForCompatibility(android.view.InputEvent p0) { return null; }
}
