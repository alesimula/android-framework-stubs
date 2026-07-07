package com.android.internal.widget.remotecompose.player;

public class RemoteDocument {
    private com.android.internal.widget.remotecompose.core.CoreDocument mDocument;
    public RemoteDocument(com.android.internal.widget.remotecompose.core.CoreDocument p0) {}
    public RemoteDocument(java.io.InputStream p0) {}
    public RemoteDocument(java.io.InputStream p0, com.android.internal.widget.remotecompose.core.RemoteClock p1) {}
    public RemoteDocument(byte[] p0) {}
    public void applyDataOperations(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public boolean canBeDisplayed(int p0, int p1, long p2) { return false; }
    public com.android.internal.widget.remotecompose.core.RemoteClock getClock() { return null; }
    public com.android.internal.widget.remotecompose.core.operations.layout.Component getComponent(int p0) { return null; }
    public com.android.internal.widget.remotecompose.core.CoreDocument getDocument() { return null; }
    public int getHeight() { return 0; }
    public java.lang.String[] getNamedColors() { return null; }
    public java.lang.String[] getNamedVariables(int p0) { return null; }
    public java.lang.String[] getStats() { return null; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.ColorTheme> getThemedColors() { return null; }
    public int getWidth() { return 0; }
    public int hasSensorListeners(int[] p0) { return 0; }
    public void initializeContext(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void initializeContext(com.android.internal.widget.remotecompose.core.RemoteContext p0, java.util.Map<java.lang.Integer, java.lang.Object> p1) {}
    public void invalidate() {}
    public boolean isUpdateDoc() { return false; }
    public int needsRepaint() { return 0; }
    public void paint(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void setDocument(com.android.internal.widget.remotecompose.core.CoreDocument p0) {}
    public java.lang.String toString() { return null; }
    public boolean useFeature(short p0) { return false; }
}
