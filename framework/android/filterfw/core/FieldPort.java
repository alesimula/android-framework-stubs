package android.filterfw.core;

public class FieldPort extends android.filterfw.core.InputPort {
    protected java.lang.reflect.Field mField;
    protected boolean mHasFrame;
    protected java.lang.Object mValue;
    protected boolean mValueWaiting;
    public FieldPort(android.filterfw.core.Filter p0, java.lang.String p1, java.lang.reflect.Field p2, boolean p3) { super(null, null); }
    public boolean acceptsFrame() { return false; }
    public void clear() {}
    public java.lang.Object getTarget() { return null; }
    public boolean hasFrame() { return false; }
    public android.filterfw.core.Frame pullFrame() { return null; }
    public void pushFrame(android.filterfw.core.Frame p0) {}
    protected void setFieldFrame(android.filterfw.core.Frame p0, boolean p1) {}
    public void setFrame(android.filterfw.core.Frame p0) {}
    public java.lang.String toString() { return null; }
    public void transfer(android.filterfw.core.FilterContext p0) {}
}
