package android.filterfw.core;

public abstract class Filter {
    static final int STATUS_ERROR = 6;
    static final int STATUS_FINISHED = 5;
    static final int STATUS_PREINIT = 0;
    static final int STATUS_PREPARED = 2;
    static final int STATUS_PROCESSING = 3;
    static final int STATUS_RELEASED = 7;
    static final int STATUS_SLEEPING = 4;
    static final int STATUS_UNPREPARED = 1;
    private static final java.lang.String TAG = "Filter";
    private long mCurrentTimestamp;
    private java.util.HashSet<android.filterfw.core.Frame> mFramesToRelease;
    private java.util.HashMap<java.lang.String, android.filterfw.core.Frame> mFramesToSet;
    private int mInputCount;
    private java.util.HashMap<java.lang.String, android.filterfw.core.InputPort> mInputPorts;
    private boolean mIsOpen;
    private boolean mLogVerbose;
    private java.lang.String mName;
    private int mOutputCount;
    private java.util.HashMap<java.lang.String, android.filterfw.core.OutputPort> mOutputPorts;
    private int mSleepDelay;
    private int mStatus;
    public Filter(java.lang.String p0) {}
    private final void addAndSetFinalPorts(android.filterfw.core.KeyValueMap p0) {}
    private final void addAnnotatedPorts() {}
    private final void addFieldGenerator(android.filterfw.core.GenerateFieldPort p0, java.lang.reflect.Field p1) {}
    private final void addProgramGenerator(android.filterfw.core.GenerateProgramPort p0, java.lang.reflect.Field p1) {}
    private final void closePorts() {}
    private final boolean filterMustClose() { return false; }
    private final void initFinalPorts(android.filterfw.core.KeyValueMap p0) {}
    private final void initRemainingPorts(android.filterfw.core.KeyValueMap p0) {}
    private final boolean inputConditionsMet() { return false; }
    public static final boolean isAvailable(java.lang.String p0) { return false; }
    private final boolean outputConditionsMet() { return false; }
    private final void releasePulledFrames(android.filterfw.core.FilterContext p0) {}
    private final void setImmediateInputValue(java.lang.String p0, java.lang.Object p1) {}
    private final void setInitialInputValues(android.filterfw.core.KeyValueMap p0) {}
    private final void transferInputFrames(android.filterfw.core.FilterContext p0) {}
    private final android.filterfw.core.Frame wrapInputValue(java.lang.String p0, java.lang.Object p1) { return null; }
    protected void addFieldPort(java.lang.String p0, java.lang.reflect.Field p1, boolean p2, boolean p3) {}
    protected void addInputPort(java.lang.String p0) {}
    protected void addMaskedInputPort(java.lang.String p0, android.filterfw.core.FrameFormat p1) {}
    protected void addOutputBasedOnInput(java.lang.String p0, java.lang.String p1) {}
    protected void addOutputPort(java.lang.String p0, android.filterfw.core.FrameFormat p1) {}
    protected void addProgramPort(java.lang.String p0, java.lang.String p1, java.lang.reflect.Field p2, java.lang.Class p3, boolean p4) {}
    final boolean canProcess() { return false; }
    final void clearInputs() {}
    final void clearOutputs() {}
    public void close(android.filterfw.core.FilterContext p0) {}
    protected void closeOutputPort(java.lang.String p0) {}
    protected void delayNextProcess(int p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public java.lang.String getFilterClassName() { return null; }
    public final android.filterfw.core.FrameFormat getInputFormat(java.lang.String p0) { return null; }
    public final android.filterfw.core.InputPort getInputPort(java.lang.String p0) { return null; }
    final java.util.Collection<android.filterfw.core.InputPort> getInputPorts() { return null; }
    public final java.lang.String getName() { return null; }
    public final int getNumberOfConnectedInputs() { return 0; }
    public final int getNumberOfConnectedOutputs() { return 0; }
    public final int getNumberOfInputs() { return 0; }
    public final int getNumberOfOutputs() { return 0; }
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public final android.filterfw.core.OutputPort getOutputPort(java.lang.String p0) { return null; }
    final java.util.Collection<android.filterfw.core.OutputPort> getOutputPorts() { return null; }
    public final int getSleepDelay() { return 0; }
    final int getStatus() { return 0; }
    public final void init() throws android.filterfw.core.ProtocolException {}
    protected void initProgramInputs(android.filterfw.core.Program p0, android.filterfw.core.FilterContext p1) {}
    public final void initWithAssignmentList(java.lang.Object... p0) {}
    public final void initWithAssignmentString(java.lang.String p0) {}
    public final void initWithValueMap(android.filterfw.core.KeyValueMap p0) {}
    public boolean isOpen() { return false; }
    final void notifyFieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    final void openOutputs() {}
    protected void parametersUpdated(java.util.Set<java.lang.String> p0) {}
    final void performClose(android.filterfw.core.FilterContext p0) {}
    final void performOpen(android.filterfw.core.FilterContext p0) {}
    final void performProcess(android.filterfw.core.FilterContext p0) {}
    final void performTearDown(android.filterfw.core.FilterContext p0) {}
    protected void prepare(android.filterfw.core.FilterContext p0) {}
    public abstract void process(android.filterfw.core.FilterContext p0);
    protected final android.filterfw.core.Frame pullInput(java.lang.String p0) { return null; }
    final void pushInputFrame(java.lang.String p0, android.filterfw.core.Frame p1) {}
    final void pushInputValue(java.lang.String p0, java.lang.Object p1) {}
    protected final void pushOutput(java.lang.String p0, android.filterfw.core.Frame p1) {}
    public void setInputFrame(java.lang.String p0, android.filterfw.core.Frame p1) {}
    public final void setInputValue(java.lang.String p0, java.lang.Object p1) {}
    protected void setWaitsOnInputPort(java.lang.String p0, boolean p1) {}
    protected void setWaitsOnOutputPort(java.lang.String p0, boolean p1) {}
    public abstract void setupPorts();
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public java.lang.String toString() { return null; }
    protected void transferInputPortFrame(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    final void unsetStatus(int p0) {}
}
