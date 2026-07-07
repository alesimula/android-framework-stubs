package android.filterfw.core;

public class NativeProgram extends android.filterfw.core.Program {
    private boolean mHasGetValueFunction;
    private boolean mHasInitFunction;
    private boolean mHasResetFunction;
    private boolean mHasSetValueFunction;
    private boolean mHasTeardownFunction;
    private boolean mTornDown;
    private int nativeProgramId;
    public NativeProgram(java.lang.String p0, java.lang.String p1) { super(); }
    private native boolean allocate();
    private native boolean bindGetValueFunction(java.lang.String p0);
    private native boolean bindInitFunction(java.lang.String p0);
    private native boolean bindProcessFunction(java.lang.String p0);
    private native boolean bindResetFunction(java.lang.String p0);
    private native boolean bindSetValueFunction(java.lang.String p0);
    private native boolean bindTeardownFunction(java.lang.String p0);
    private native java.lang.String callNativeGetValue(java.lang.String p0);
    private native boolean callNativeInit();
    private native boolean callNativeProcess(android.filterfw.core.NativeFrame[] p0, android.filterfw.core.NativeFrame p1);
    private native boolean callNativeReset();
    private native boolean callNativeSetValue(java.lang.String p0, java.lang.String p1);
    private native boolean callNativeTeardown();
    private native boolean deallocate();
    private native boolean nativeInit();
    private native boolean openNativeLibrary(java.lang.String p0);
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.Object getHostValue(java.lang.String p0) { return null; }
    public void process(android.filterfw.core.Frame[] p0, android.filterfw.core.Frame p1) {}
    public void reset() {}
    public void setHostValue(java.lang.String p0, java.lang.Object p1) {}
    public void tearDown() {}
}
