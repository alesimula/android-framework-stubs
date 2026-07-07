package com.android.internal.widget.remotecompose.player.accessibility;

public class CoreDocumentAccessibility implements com.android.internal.widget.remotecompose.player.accessibility.RemoteComposeDocumentAccessibility {
    private final com.android.internal.widget.remotecompose.core.CoreDocument mDocument = null;
    private final com.android.internal.widget.remotecompose.core.RemoteContextActions mRemoteContextActions = null;
    public CoreDocumentAccessibility(com.android.internal.widget.remotecompose.core.CoreDocument p0, com.android.internal.widget.remotecompose.core.RemoteContextActions p1) {}
    static java.util.stream.Stream<com.android.internal.widget.remotecompose.core.operations.layout.Component> componentStream(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return null; }
    private boolean contains(int[] p0, float p1, float p2) { return false; }
    private int getComponentIdAt(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, android.graphics.PointF p1, int[] p2) { return 0; }
    private static boolean isClickAction(int p0) { return false; }
    static boolean isContainerWithSemantics(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return false; }
    static boolean isInteresting(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return false; }
    static boolean isModifierWithSemantics(com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation p0) { return false; }
    private static boolean isScrollBackwardAction(int p0) { return false; }
    private static boolean isScrollForwardAction(int p0) { return false; }
    private static boolean isShowOnScreenAction(int p0) { return false; }
    static java.util.stream.Stream<com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation> modifiersStream(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return null; }
    private boolean showOnScreen(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return false; }
    public com.android.internal.widget.remotecompose.core.operations.layout.Component findComponentById(int p0) { return null; }
    public java.lang.Integer getComponentIdAt(android.graphics.PointF p0) { return null; }
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Mode mergeMode(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return null; }
    public boolean performAction(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, android.os.Bundle p2) { return false; }
    public boolean performClick(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return false; }
    public int scrollByOffset(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1) { return 0; }
    public boolean scrollDirection(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollDirection p1) { return false; }
    public java.util.List<com.android.internal.widget.remotecompose.core.semantics.AccessibilitySemantics> semanticModifiersForComponent(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return null; }
    public java.util.List<java.lang.Integer> semanticallyRelevantChildComponents(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, boolean p1) { return null; }
    public java.lang.String stringValue(int p0) { return null; }
}
