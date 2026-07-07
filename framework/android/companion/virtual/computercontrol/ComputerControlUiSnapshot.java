package android.companion.virtual.computercontrol;

public final class ComputerControlUiSnapshot {
    private final java.util.List<android.companion.virtual.computercontrol.ComputerControlUiSnapshot.WindowNode> mWindows = null;
    private ComputerControlUiSnapshot(java.util.List<android.companion.virtual.computercontrol.ComputerControlUiSnapshot.WindowNode> p0) {}
    public static android.companion.virtual.computercontrol.ComputerControlUiSnapshot fromAccessibilityWindowInfos(java.util.List<android.view.accessibility.AccessibilityWindowInfo> p0) { return null; }
    public java.util.List<android.companion.virtual.computercontrol.ComputerControlUiSnapshot.WindowNode> getWindows() { return null; }

    public static final class UiNode {
        private static final int FLAG_CHECKABLE = 4;
        private static final int FLAG_CHECKED = 8;
        private static final int FLAG_CLICKABLE = 1;
        private static final int FLAG_EDITABLE = 64;
        private static final int FLAG_ENABLED = 256;
        private static final int FLAG_FOCUSABLE = 16;
        private static final int FLAG_FOCUSED = 32;
        private static final int FLAG_LONG_CLICKABLE = 2;
        private static final int FLAG_PASSWORD = 512;
        private static final int FLAG_SCROLLABLE = 128;
        private static final int FLAG_SELECTED = 1024;
        private static final int MAX_DEPTH = 50;
        private final android.graphics.Rect mBounds = null;
        private final java.util.List<android.companion.virtual.computercontrol.ComputerControlUiSnapshot.UiNode> mChildren = null;
        private final java.lang.String mClassName = null;
        private final java.lang.String mContentDescription = null;
        private final java.lang.String mEntryId = null;
        private final int mFlags = 0;
        private final java.lang.String mHintText = null;
        private final java.lang.String mPackageName = null;
        private final java.lang.String mText = null;
        private UiNode(android.view.accessibility.AccessibilityNodeInfo p0, java.util.List<android.companion.virtual.computercontrol.ComputerControlUiSnapshot.UiNode> p1) {}
        private static android.companion.virtual.computercontrol.ComputerControlUiSnapshot.UiNode buildUiNodeRecursively(android.view.accessibility.AccessibilityNodeInfo p0, int p1, java.util.Set<android.companion.virtual.computercontrol.ComputerControlUiSnapshot.UiNode.NodeKey> p2) { return null; }
        public static android.companion.virtual.computercontrol.ComputerControlUiSnapshot.UiNode fromAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) { return null; }
        public android.graphics.Rect getBounds() { return null; }
        public java.util.List<android.companion.virtual.computercontrol.ComputerControlUiSnapshot.UiNode> getChildren() { return null; }
        public java.lang.String getClassName() { return null; }
        public java.lang.String getContentDescription() { return null; }
        public java.lang.String getEntryId() { return null; }
        public java.lang.String getHintText() { return null; }
        public java.lang.String getPackageName() { return null; }
        public java.lang.String getText() { return null; }
        public boolean isCheckable() { return false; }
        public boolean isChecked() { return false; }
        public boolean isClickable() { return false; }
        public boolean isEditable() { return false; }
        public boolean isEnabled() { return false; }
        public boolean isFocusable() { return false; }
        public boolean isFocused() { return false; }
        public boolean isLongClickable() { return false; }
        public boolean isPassword() { return false; }
        public boolean isScrollable() { return false; }
        public boolean isSelected() { return false; }

        private static final class NodeKey {
            private final long mId = 0L;
            private final android.view.accessibility.AccessibilityNodeInfo mNode = null;
            NodeKey(android.view.accessibility.AccessibilityNodeInfo p0) {}
            public boolean equals(java.lang.Object p0) { return false; }
            public int hashCode() { return 0; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface UiNodeFlag {
        }
    }

    public static final class WindowNode {
        private final android.graphics.Rect mBounds = null;
        private final android.companion.virtual.computercontrol.ComputerControlUiSnapshot.UiNode mRoot = null;
        private final java.lang.String mTitle = null;
        private WindowNode(android.view.accessibility.AccessibilityWindowInfo p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        public android.graphics.Rect getBounds() { return null; }
        public android.companion.virtual.computercontrol.ComputerControlUiSnapshot.UiNode getRoot() { return null; }
        public java.lang.String getTitle() { return null; }
    }
}
