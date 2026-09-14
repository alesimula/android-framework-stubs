package com.android.internal.widget.remotecompose.core.operations.loom;

public class RemapContext {
    private final com.android.internal.widget.remotecompose.core.CoreDocument mDocument = null;
    private java.util.Map<java.lang.Integer, java.lang.Integer> mIdMap;
    private final boolean mIsInsideMacro = false;
    private boolean mIsMapShared;
    public RemapContext(com.android.internal.widget.remotecompose.core.CoreDocument p0) {}
    private RemapContext(java.util.Map<java.lang.Integer, java.lang.Integer> p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, boolean p2) {}
    private int allocateNewId(int p0) { return 0; }
    private void ensureMapWritable() {}
    private int handleMacroLocalId(int p0) { return 0; }
    private int handleRegularIdInsideMacro(int p0) { return 0; }
    public static com.android.internal.widget.remotecompose.core.operations.loom.RemapContext identity() { return null; }
    public void addMapping(int p0, int p1) {}
    public int declareId(int p0) { return 0; }
    public com.android.internal.widget.remotecompose.core.operations.loom.RemapContext fork() { return null; }
    public java.util.Map<java.lang.Integer, java.lang.Integer> getIdMap() { return null; }
    public boolean isInsideMacro() { return false; }
    public int resolveId(int p0) { return 0; }
    public long resolveLongNanId(long p0) { return 0L; }
    public float resolveNanId(float p0) { return 0.0f; }
    public com.android.internal.widget.remotecompose.core.operations.loom.RemapContext withInsideMacro(boolean p0) { return null; }
    public com.android.internal.widget.remotecompose.core.WireBuffer wrap(com.android.internal.widget.remotecompose.core.WireBuffer p0) { return null; }

    private static final class IdentityRemapContext extends com.android.internal.widget.remotecompose.core.operations.loom.RemapContext {
        IdentityRemapContext() { super((com.android.internal.widget.remotecompose.core.CoreDocument)null); }
        public int declareId(int p0) { return 0; }
        public int resolveId(int p0) { return 0; }
        public long resolveLongNanId(long p0) { return 0L; }
        public float resolveNanId(float p0) { return 0.0f; }
        public com.android.internal.widget.remotecompose.core.operations.loom.RemapContext withInsideMacro(boolean p0) { return null; }
        public com.android.internal.widget.remotecompose.core.WireBuffer wrap(com.android.internal.widget.remotecompose.core.WireBuffer p0) { return null; }
    }
}
