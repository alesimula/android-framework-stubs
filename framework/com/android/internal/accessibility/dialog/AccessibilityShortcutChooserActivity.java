package com.android.internal.accessibility.dialog;

public class AccessibilityShortcutChooserActivity extends android.app.Activity {
    private static final java.lang.String KEY_ACCESSIBILITY_SHORTCUT_MENU_MODE = "accessibility_shortcut_menu_mode";
    private android.app.AlertDialog mMenuDialog;
    private android.app.Dialog mPermissionDialog;
    private int mShortcutType;
    private com.android.internal.accessibility.dialog.ShortcutTargetAdapter mTargetAdapter;
    private final java.util.List<com.android.internal.accessibility.dialog.AccessibilityTarget> mTargets = null;
    public AccessibilityShortcutChooserActivity() { super(); }
    private android.app.AlertDialog createMenuDialog() { return null; }
    private void onDoneButtonClicked() {}
    private void onEditButtonClicked() {}
    private void onTargetChecked(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
    private void onTargetSelected(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
    private boolean sendRestrictedDialogIntentIfNeeded(com.android.internal.accessibility.dialog.AccessibilityServiceTarget p0) { return false; }
    private void showPermissionDialogIfNeeded(android.content.Context p0, com.android.internal.accessibility.dialog.AccessibilityServiceTarget p1, int p2, com.android.internal.accessibility.dialog.ShortcutTargetAdapter p3) {}
    private void updateDialogListeners() {}
    public android.app.AlertDialog getMenuDialog() { return null; }
    public android.app.Dialog getPermissionDialog() { return null; }
    protected void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
}
