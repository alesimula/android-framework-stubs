package com.android.internal.widget.remotecompose.player.accessibility.platform;

public class AndroidPlatformSemanticNodeApplier extends com.android.internal.widget.remotecompose.player.accessibility.BaseSemanticNodeApplier<android.view.accessibility.AccessibilityNodeInfo> {
    private static final java.lang.String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";
    private final android.view.View mPlayer = null;
    public AndroidPlatformSemanticNodeApplier(android.view.View p0) { super(); }
    public void addChildren(android.view.accessibility.AccessibilityNodeInfo p0, java.util.List<java.lang.Integer> p1) {}
    protected void applyListItem(android.view.accessibility.AccessibilityNodeInfo p0, int p1) {}
    protected void applyScrollable(android.view.accessibility.AccessibilityNodeInfo p0, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollAxisRange p1, int p2) {}
    protected java.lang.CharSequence getContentDescription(android.view.accessibility.AccessibilityNodeInfo p0) { return null; }
    protected java.lang.CharSequence getStateDescription(android.view.accessibility.AccessibilityNodeInfo p0) { return null; }
    protected java.lang.CharSequence getText(android.view.accessibility.AccessibilityNodeInfo p0) { return null; }
    protected void setBoundsInParentOrScreen(android.view.accessibility.AccessibilityNodeInfo p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, java.lang.Integer p2) {}
    protected void setClickable(android.view.accessibility.AccessibilityNodeInfo p0, boolean p1) {}
    protected void setContentDescription(android.view.accessibility.AccessibilityNodeInfo p0, java.lang.CharSequence p1) {}
    protected void setEnabled(android.view.accessibility.AccessibilityNodeInfo p0, boolean p1) {}
    protected void setRoleDescription(android.view.accessibility.AccessibilityNodeInfo p0, java.lang.String p1) {}
    protected void setStateDescription(android.view.accessibility.AccessibilityNodeInfo p0, java.lang.CharSequence p1) {}
    protected void setText(android.view.accessibility.AccessibilityNodeInfo p0, java.lang.CharSequence p1) {}
    protected void setUniqueId(android.view.accessibility.AccessibilityNodeInfo p0, java.lang.String p1) {}
}
