package com.android.internal.widget.remotecompose.core.operations.loom;

public class ExpansionContext {
    private static final int MAX_EXPANSION_DEPTH = 64;
    private final java.util.Map<java.lang.Integer, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation>> mBlocks = null;
    private final int mDepth = 0;
    private final com.android.internal.widget.remotecompose.core.CoreDocument mDocument = null;
    private final com.android.internal.widget.remotecompose.core.operations.loom.LoomManager mLoomManager = null;
    private final com.android.internal.widget.remotecompose.core.operations.loom.RemapContext mRemapContext = null;
    private boolean mSafeMode;
    public ExpansionContext(com.android.internal.widget.remotecompose.core.operations.loom.LoomManager p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.loom.RemapContext p2, java.util.Map<java.lang.Integer, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation>> p3) {}
    public ExpansionContext(com.android.internal.widget.remotecompose.core.operations.loom.LoomManager p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.loom.RemapContext p2, java.util.Map<java.lang.Integer, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation>> p3, boolean p4) {}
    public ExpansionContext(com.android.internal.widget.remotecompose.core.operations.loom.LoomManager p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.loom.RemapContext p2, java.util.Map<java.lang.Integer, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation>> p3, boolean p4, int p5) {}
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> expandRecursive(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0, com.android.internal.widget.remotecompose.core.operations.loom.LoomManager p1) { return null; }
    public void expandRecursive(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1, com.android.internal.widget.remotecompose.core.operations.loom.LoomManager p2) {}
    public com.android.internal.widget.remotecompose.core.operations.loom.ExpansionContext fork() { return null; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getBlock(int p0) { return null; }
    public java.util.Map<java.lang.Integer, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation>> getBlocksForCall(com.android.internal.widget.remotecompose.core.operations.loom.PatternInflation p0) { return null; }
    public int getDepth() { return 0; }
    public com.android.internal.widget.remotecompose.core.CoreDocument getDocument() { return null; }
    public com.android.internal.widget.remotecompose.core.operations.loom.LoomManager getMacroManager() { return null; }
    public com.android.internal.widget.remotecompose.core.operations.loom.RemapContext getRemapContext() { return null; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> inflateBody(byte[] p0, com.android.internal.widget.remotecompose.core.operations.loom.RemapContext p1) { return null; }
    public boolean isSafeMode() { return false; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> nestContainers(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0) { return null; }
    public void recordBlocks(com.android.internal.widget.remotecompose.core.operations.loom.PatternInflation p0) {}
}
