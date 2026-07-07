package android.renderscript;

@java.lang.Deprecated
public final class ScriptGroup extends android.renderscript.BaseObj {
    private static final java.lang.String TAG = "ScriptGroup";
    private java.util.List<android.renderscript.ScriptGroup.Closure> mClosures;
    android.renderscript.ScriptGroup.IO[] mInputs;
    private java.util.List<android.renderscript.ScriptGroup.Input> mInputs2;
    private java.lang.String mName;
    android.renderscript.ScriptGroup.IO[] mOutputs;
    private android.renderscript.ScriptGroup.Future[] mOutputs2;
    ScriptGroup(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    ScriptGroup(android.renderscript.RenderScript p0, java.lang.String p1, java.util.List<android.renderscript.ScriptGroup.Closure> p2, java.util.List<android.renderscript.ScriptGroup.Input> p3, android.renderscript.ScriptGroup.Future[] p4) { super(0L, null); }
    public void destroy() {}
    public void execute() {}
    public java.lang.Object[] execute(java.lang.Object... p0) { return null; }
    public void setInput(android.renderscript.Script.KernelID p0, android.renderscript.Allocation p1) {}
    public void setOutput(android.renderscript.Script.KernelID p0, android.renderscript.Allocation p1) {}

    public static final class Binding {
        private final android.renderscript.Script.FieldID mField = null;
        private final java.lang.Object mValue = null;
        public Binding(android.renderscript.Script.FieldID p0, java.lang.Object p1) {}
        android.renderscript.Script.FieldID getField() { return null; }
        java.lang.Object getValue() { return null; }
    }

    public static final class Builder {
        private int mKernelCount;
        private java.util.ArrayList<android.renderscript.ScriptGroup.ConnectLine> mLines;
        private java.util.ArrayList<android.renderscript.ScriptGroup.Node> mNodes;
        private android.renderscript.RenderScript mRS;
        public Builder(android.renderscript.RenderScript p0) {}
        private android.renderscript.ScriptGroup.Node findNode(android.renderscript.Script.KernelID p0) { return null; }
        private android.renderscript.ScriptGroup.Node findNode(android.renderscript.Script p0) { return null; }
        private void mergeDAGs(int p0, int p1) {}
        private void validateCycle(android.renderscript.ScriptGroup.Node p0, android.renderscript.ScriptGroup.Node p1) {}
        private void validateDAG() {}
        private void validateDAGRecurse(android.renderscript.ScriptGroup.Node p0, int p1) {}
        public android.renderscript.ScriptGroup.Builder addConnection(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.FieldID p2) { return null; }
        public android.renderscript.ScriptGroup.Builder addConnection(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.KernelID p2) { return null; }
        public android.renderscript.ScriptGroup.Builder addKernel(android.renderscript.Script.KernelID p0) { return null; }
        public android.renderscript.ScriptGroup create() { return null; }
    }

    public static final class Builder2 {
        private static final java.lang.String TAG = "ScriptGroup.Builder2";
        java.util.List<android.renderscript.ScriptGroup.Closure> mClosures;
        java.util.List<android.renderscript.ScriptGroup.Input> mInputs;
        android.renderscript.RenderScript mRS;
        public Builder2(android.renderscript.RenderScript p0) {}
        private android.renderscript.ScriptGroup.Closure addInvokeInternal(android.renderscript.Script.InvokeID p0, java.lang.Object[] p1, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p2) { return null; }
        private android.renderscript.ScriptGroup.Closure addKernelInternal(android.renderscript.Script.KernelID p0, android.renderscript.Type p1, java.lang.Object[] p2, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p3) { return null; }
        private boolean seperateArgsAndBindings(java.lang.Object[] p0, java.util.ArrayList<java.lang.Object> p1, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p2) { return false; }
        public android.renderscript.ScriptGroup.Input addInput() { return null; }
        public android.renderscript.ScriptGroup.Closure addInvoke(android.renderscript.Script.InvokeID p0, java.lang.Object... p1) { return null; }
        public android.renderscript.ScriptGroup.Closure addKernel(android.renderscript.Script.KernelID p0, android.renderscript.Type p1, java.lang.Object... p2) { return null; }
        public android.renderscript.ScriptGroup create(java.lang.String p0, android.renderscript.ScriptGroup.Future... p1) { return null; }
    }

    public static final class Closure extends android.renderscript.BaseObj {
        private static final java.lang.String TAG = "Closure";
        private java.lang.Object[] mArgs;
        private java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> mBindings;
        private android.renderscript.FieldPacker mFP;
        private java.util.Map<android.renderscript.Script.FieldID, android.renderscript.ScriptGroup.Future> mGlobalFuture;
        private android.renderscript.ScriptGroup.Future mReturnFuture;
        private android.renderscript.Allocation mReturnValue;
        Closure(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
        Closure(android.renderscript.RenderScript p0, android.renderscript.Script.InvokeID p1, java.lang.Object[] p2, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p3) { super(0L, null); }
        Closure(android.renderscript.RenderScript p0, android.renderscript.Script.KernelID p1, android.renderscript.Type p2, java.lang.Object[] p3, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p4) { super(0L, null); }
        private void retrieveValueAndDependenceInfo(android.renderscript.RenderScript p0, int p1, android.renderscript.Script.FieldID p2, java.lang.Object p3, long[] p4, int[] p5, long[] p6, long[] p7) {}
        public void destroy() {}
        protected void finalize() throws java.lang.Throwable {}
        public android.renderscript.ScriptGroup.Future getGlobal(android.renderscript.Script.FieldID p0) { return null; }
        public android.renderscript.ScriptGroup.Future getReturn() { return null; }
        void setArg(int p0, java.lang.Object p1) {}
        void setGlobal(android.renderscript.Script.FieldID p0, java.lang.Object p1) {}

        private static final class ValueAndSize {
            public int size;
            public long value;
            public ValueAndSize(android.renderscript.RenderScript p0, java.lang.Object p1) {}
        }
    }

    static class ConnectLine {
        android.renderscript.Type mAllocationType;
        android.renderscript.Script.KernelID mFrom;
        android.renderscript.Script.FieldID mToF;
        android.renderscript.Script.KernelID mToK;
        ConnectLine(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.FieldID p2) {}
        ConnectLine(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.KernelID p2) {}
    }

    public static final class Future {
        android.renderscript.ScriptGroup.Closure mClosure;
        android.renderscript.Script.FieldID mFieldID;
        java.lang.Object mValue;
        Future(android.renderscript.ScriptGroup.Closure p0, android.renderscript.Script.FieldID p1, java.lang.Object p2) {}
        android.renderscript.ScriptGroup.Closure getClosure() { return null; }
        android.renderscript.Script.FieldID getFieldID() { return null; }
        java.lang.Object getValue() { return null; }
    }

    public static final class Input {
        java.util.List<android.util.Pair<android.renderscript.ScriptGroup.Closure, java.lang.Integer>> mArgIndex;
        java.util.List<android.util.Pair<android.renderscript.ScriptGroup.Closure, android.renderscript.Script.FieldID>> mFieldID;
        java.lang.Object mValue;
        Input() {}
        void addReference(android.renderscript.ScriptGroup.Closure p0, int p1) {}
        void addReference(android.renderscript.ScriptGroup.Closure p0, android.renderscript.Script.FieldID p1) {}
        java.lang.Object get() { return null; }
        void set(java.lang.Object p0) {}
    }

    static class IO {
        android.renderscript.Allocation mAllocation;
        android.renderscript.Script.KernelID mKID;
        IO(android.renderscript.Script.KernelID p0) {}
    }

    static class Node {
        int dagNumber;
        java.util.ArrayList<android.renderscript.ScriptGroup.ConnectLine> mInputs;
        java.util.ArrayList<android.renderscript.Script.KernelID> mKernels;
        android.renderscript.ScriptGroup.Node mNext;
        java.util.ArrayList<android.renderscript.ScriptGroup.ConnectLine> mOutputs;
        android.renderscript.Script mScript;
        Node(android.renderscript.Script p0) {}
    }
}
