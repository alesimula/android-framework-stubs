package android.companion.virtual.computercontrol;

public final class InteractiveMirror implements java.lang.AutoCloseable {
    public static final boolean DEFAULT_INTERACTIVE = false;
    private final android.companion.virtual.computercontrol.IInteractiveMirror mMirror = null;
    private final android.view.SurfaceControl mMirrorSurface = null;
    private final java.util.function.Supplier<android.view.SurfaceControl> mSurfaceControlSupplier = null;
    InteractiveMirror(android.companion.virtual.computercontrol.IInteractiveMirror p0, android.view.SurfaceControl p1) {}
    public InteractiveMirror(android.companion.virtual.computercontrol.IInteractiveMirror p0, android.view.SurfaceControl p1, java.util.function.Supplier<android.view.SurfaceControl> p2) {}
    public void close() {}
    public android.view.SurfaceControl getMirrorSurfaceControl() { return null; }
    public void setHostDisplayId(int p0) {}
    public void setInteractive(boolean p0) {}
    public void updateInsets(android.graphics.Insets p0) {}
    public void updateScale(float p0) {}
}
