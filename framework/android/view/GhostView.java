package android.view;

public class GhostView extends android.view.View {
    private boolean mBeingMoved;
    private int mReferences;
    private final android.view.View mView = null;
    private GhostView(android.view.View p0) { super((android.content.Context)null); }
    public static android.view.GhostView addGhost(android.view.View p0, android.view.ViewGroup p1) { return null; }
    public static android.view.GhostView addGhost(android.view.View p0, android.view.ViewGroup p1, android.graphics.Matrix p2) { return null; }
    public static void calculateMatrix(android.view.View p0, android.view.ViewGroup p1, android.graphics.Matrix p2) {}
    private static void copySize(android.view.View p0, android.view.View p1) {}
    public static android.view.GhostView getGhost(android.view.View p0) { return null; }
    private static int getInsertIndex(android.view.ViewGroup p0, java.util.ArrayList<android.view.View> p1, java.util.ArrayList<android.view.View> p2, int p3) { return 0; }
    private static void getParents(android.view.View p0, java.util.ArrayList<android.view.View> p1) {}
    private static void insertIntoOverlay(android.view.ViewGroup p0, android.view.ViewGroup p1, android.view.GhostView p2, java.util.ArrayList<android.view.View> p3, int p4) {}
    private static boolean isGhostWrapper(android.view.View p0) { return false; }
    private static boolean isOnTop(android.view.View p0, android.view.View p1) { return false; }
    private static boolean isOnTop(java.util.ArrayList<android.view.View> p0, java.util.ArrayList<android.view.View> p1) { return false; }
    private static int moveGhostViewsToTop(android.view.ViewGroup p0, java.util.ArrayList<android.view.View> p1) { return 0; }
    public static void removeGhost(android.view.View p0) {}
    protected void onDetachedFromWindow() {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public void setMatrix(android.graphics.Matrix p0) {}
    public void setVisibility(int p0) {}
}
