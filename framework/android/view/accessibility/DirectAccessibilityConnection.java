package android.view.accessibility;

class DirectAccessibilityConnection extends android.accessibilityservice.IAccessibilityServiceConnection.Default {
    private static final int FETCH_FLAGS = 384;
    private static final android.graphics.Region INTERACTIVE_REGION = null;
    private final android.view.accessibility.IAccessibilityInteractionConnection mAccessibilityInteractionConnection = null;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager = null;
    private final int mMyProcessId = 0;
    DirectAccessibilityConnection(android.view.accessibility.IAccessibilityInteractionConnection p0, android.view.accessibility.AccessibilityManager p1) { super(); }
    public java.lang.String[] findAccessibilityNodeInfoByAccessibilityId(int p0, long p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, long p5, android.os.Bundle p6) throws android.os.RemoteException { return null; }
    public java.lang.String[] findAccessibilityNodeInfosByText(int p0, long p1, java.lang.String p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
    public java.lang.String[] findAccessibilityNodeInfosByViewId(int p0, long p1, java.lang.String p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
    public java.lang.String[] findFocus(int p0, long p1, int p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
    public java.lang.String[] focusSearch(int p0, long p1, int p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, long p5) throws android.os.RemoteException { return null; }
    public boolean performAccessibilityAction(int p0, long p1, int p2, android.os.Bundle p3, int p4, android.view.accessibility.IAccessibilityInteractionConnectionCallback p5, long p6) throws android.os.RemoteException { return false; }
}
