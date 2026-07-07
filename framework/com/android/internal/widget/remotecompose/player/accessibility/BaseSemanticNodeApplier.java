package com.android.internal.widget.remotecompose.player.accessibility;

public abstract class BaseSemanticNodeApplier<N extends java.lang.Object> implements com.android.internal.widget.remotecompose.player.accessibility.SemanticNodeApplier<N> {
    private static final java.lang.String LOG_TAG = "RemoteCompose";
    public BaseSemanticNodeApplier() {}
    private java.lang.CharSequence appendNullable(java.lang.CharSequence p0, java.lang.String p1) { return null; }
    public void applyComponent(com.android.internal.widget.remotecompose.player.accessibility.RemoteComposeDocumentAccessibility p0, N p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, java.util.List<com.android.internal.widget.remotecompose.core.semantics.AccessibilitySemantics> p3, java.lang.Integer p4) {}
    protected void applyContentDescription(java.lang.Integer p0, N p1, com.android.internal.widget.remotecompose.player.accessibility.RemoteComposeDocumentAccessibility p2) {}
    protected void applyCoreSemantics(com.android.internal.widget.remotecompose.player.accessibility.RemoteComposeDocumentAccessibility p0, N p1, com.android.internal.widget.remotecompose.core.semantics.CoreSemantics p2) {}
    protected abstract void applyListItem(N p0, int p1);
    protected void applyRole(com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Role p0, N p1) {}
    protected abstract void applyScrollable(N p0, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollAxisRange p1, int p2);
    protected void applySemantics(com.android.internal.widget.remotecompose.player.accessibility.RemoteComposeDocumentAccessibility p0, N p1, java.util.List<com.android.internal.widget.remotecompose.core.semantics.AccessibilitySemantics> p2) {}
    protected void applyStateDescription(java.lang.Integer p0, N p1, com.android.internal.widget.remotecompose.player.accessibility.RemoteComposeDocumentAccessibility p2) {}
    protected void applyText(java.lang.Integer p0, N p1, com.android.internal.widget.remotecompose.player.accessibility.RemoteComposeDocumentAccessibility p2) {}
    protected abstract java.lang.CharSequence getContentDescription(N p0);
    protected abstract java.lang.CharSequence getStateDescription(N p0);
    protected abstract java.lang.CharSequence getText(N p0);
    protected abstract void setBoundsInParentOrScreen(N p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, java.lang.Integer p2);
    protected abstract void setClickable(N p0, boolean p1);
    protected abstract void setContentDescription(N p0, java.lang.CharSequence p1);
    protected abstract void setEnabled(N p0, boolean p1);
    protected abstract void setRoleDescription(N p0, java.lang.String p1);
    protected abstract void setStateDescription(N p0, java.lang.CharSequence p1);
    protected abstract void setText(N p0, java.lang.CharSequence p1);
    protected abstract void setUniqueId(N p0, java.lang.String p1);
}
