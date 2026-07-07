package android.os;

public final class MessageHeap {
    static final boolean DEBUG = false;
    static final int INITIAL_SIZE = 16;
    private static final java.lang.String TAG = "MessageHeap";
    android.os.Message[] mHeap;
    int mNumElements;
    public MessageHeap() {}
    private boolean checkDanglingReferences(java.lang.String p0) { return false; }
    private int compareMessagesByIdx(int p0, int p1) { return 0; }
    private android.os.Message getLeftNode(int p0) { return null; }
    private android.os.Message getParentNode(int p0) { return null; }
    private android.os.Message getRightNode(int p0) { return null; }
    private static int leftNodeIdx(int p0) { return 0; }
    private void maybeGrow() {}
    private static int parentNodeIdx(int p0) { return 0; }
    private static int rightNodeIdx(int p0) { return 0; }
    private void siftDown(int p0) {}
    private boolean siftUp(int p0) { return false; }
    private boolean verify(int p0) { return false; }
    public void add(android.os.Message p0) {}
    public int capacity() { return 0; }
    android.os.Message getMessageAt(int p0) { return null; }
    public boolean isEmpty() { return false; }
    public boolean maybeShrink() { return false; }
    public android.os.Message peek() { return null; }
    public android.os.Message poll() { return null; }
    public void remove(int p0) throws java.lang.IllegalArgumentException {}
    public void removeAll() {}
    public void removeMessage(android.os.Message p0) throws java.lang.IllegalArgumentException {}
    public int size() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean verify() { return false; }
}
