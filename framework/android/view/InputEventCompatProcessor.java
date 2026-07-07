package android.view;

public abstract class InputEventCompatProcessor {
    protected android.content.Context mContext;
    protected int mTargetSdkVersion;
    public InputEventCompatProcessor(android.content.Context p0) {}
    public InputEventCompatProcessor(android.content.Context p0, android.os.Handler p1) {}
    public android.view.InputEvent processInputEventBeforeFinish(android.view.InputEvent p0) { return null; }
    public java.util.List<android.view.InputEvent> processInputEventForCompatibility(android.view.InputEvent p0) { return null; }
}
