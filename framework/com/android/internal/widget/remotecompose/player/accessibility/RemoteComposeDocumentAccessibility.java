package com.android.internal.widget.remotecompose.player.accessibility;

public interface RemoteComposeDocumentAccessibility {
    public static final int ACTION_CLICK = 16;
    public static final int RootId = -1;
    public com.android.internal.widget.remotecompose.core.operations.layout.Component findComponentById(int p0);
    public java.lang.Integer getComponentIdAt(android.graphics.PointF p0);
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Mode mergeMode(com.android.internal.widget.remotecompose.core.operations.layout.Component p0);
    public boolean performAction(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, android.os.Bundle p2);
    public java.util.List<com.android.internal.widget.remotecompose.core.semantics.AccessibilitySemantics> semanticModifiersForComponent(com.android.internal.widget.remotecompose.core.operations.layout.Component p0);
    public java.util.List<java.lang.Integer> semanticallyRelevantChildComponents(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, boolean p1);
    public java.lang.String stringValue(int p0);
}
