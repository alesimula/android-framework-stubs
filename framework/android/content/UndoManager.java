package android.content;

public class UndoManager {
    public static final int MERGE_MODE_ANY = 2;
    public static final int MERGE_MODE_NONE = 0;
    public static final int MERGE_MODE_UNIQUE = 1;
    private int mCommitId;
    private int mHistorySize;
    private boolean mInUndo;
    private boolean mMerged;
    private int mNextSavedIdx;
    private final android.util.ArrayMap<java.lang.String, android.content.UndoOwner> mOwners = null;
    private final java.util.ArrayList<android.content.UndoManager.UndoState> mRedos = null;
    private android.content.UndoOwner[] mStateOwners;
    private int mStateSeq;
    private final java.util.ArrayList<android.content.UndoManager.UndoState> mUndos = null;
    private int mUpdateCount;
    private android.content.UndoManager.UndoState mWorking;
    public UndoManager() {}
    private void createWorkingState() {}
    private void pushWorkingState() {}
    public void addOperation(android.content.UndoOperation<?> p0, int p1) {}
    public void beginUpdate(java.lang.CharSequence p0) {}
    public int commitState(android.content.UndoOwner p0) { return 0; }
    public int countRedos(android.content.UndoOwner[] p0) { return 0; }
    public int countUndos(android.content.UndoOwner[] p0) { return 0; }
    public void endUpdate() {}
    int findNextState(java.util.ArrayList<android.content.UndoManager.UndoState> p0, android.content.UndoOwner[] p1, int p2) { return 0; }
    int findPrevState(java.util.ArrayList<android.content.UndoManager.UndoState> p0, android.content.UndoOwner[] p1, int p2) { return 0; }
    public int forgetRedos(android.content.UndoOwner[] p0, int p1) { return 0; }
    public int forgetUndos(android.content.UndoOwner[] p0, int p1) { return 0; }
    public int getHistorySize() { return 0; }
    public android.content.UndoOperation<?> getLastOperation(int p0) { return null; }
    public android.content.UndoOperation<?> getLastOperation(android.content.UndoOwner p0, int p1) { return null; }
    public <T extends android.content.UndoOperation> T getLastOperation(java.lang.Class<T> p0, android.content.UndoOwner p1, int p2) { return null; }
    public android.content.UndoOwner getOwner(java.lang.String p0, java.lang.Object p1) { return null; }
    public java.lang.CharSequence getRedoLabel(android.content.UndoOwner[] p0) { return null; }
    android.content.UndoManager.UndoState getTopRedo(android.content.UndoOwner[] p0) { return null; }
    android.content.UndoManager.UndoState getTopUndo(android.content.UndoOwner[] p0) { return null; }
    public java.lang.CharSequence getUndoLabel(android.content.UndoOwner[] p0) { return null; }
    public int getUpdateNestingLevel() { return 0; }
    public boolean hasOperation(android.content.UndoOwner p0) { return false; }
    public boolean isInUndo() { return false; }
    public boolean isInUpdate() { return false; }
    boolean matchOwners(android.content.UndoManager.UndoState p0, android.content.UndoOwner[] p1) { return false; }
    public int redo(android.content.UndoOwner[] p0, int p1) { return 0; }
    void removeOwner(android.content.UndoOwner p0) {}
    public void restoreInstanceState(android.os.Parcel p0, java.lang.ClassLoader p1) {}
    android.content.UndoOwner restoreOwner(android.os.Parcel p0) { return null; }
    public void saveInstanceState(android.os.Parcel p0) {}
    void saveOwner(android.content.UndoOwner p0, android.os.Parcel p1) {}
    public void setHistorySize(int p0) {}
    public void setUndoLabel(java.lang.CharSequence p0) {}
    public void suggestUndoLabel(java.lang.CharSequence p0) {}
    public boolean uncommitState(int p0, android.content.UndoOwner p1) { return false; }
    public int undo(android.content.UndoOwner[] p0, int p1) { return 0; }

    static final class UndoState {
        private boolean mCanMerge;
        private final int mCommitId = 0;
        private boolean mExecuted;
        private java.lang.CharSequence mLabel;
        private final android.content.UndoManager mManager = null;
        private final java.util.ArrayList<android.content.UndoOperation<?>> mOperations = null;
        private java.util.ArrayList<android.content.UndoOperation<?>> mRecent;
        UndoState(android.content.UndoManager p0, int p1) {}
        UndoState(android.content.UndoManager p0, android.os.Parcel p1, java.lang.ClassLoader p2) {}
        void addOperation(android.content.UndoOperation<?> p0) {}
        boolean canMerge() { return false; }
        void commit() {}
        int countOperations() { return 0; }
        void destroy() {}
        int getCommitId() { return 0; }
        java.lang.CharSequence getLabel() { return null; }
        <T extends android.content.UndoOperation> T getLastOperation(java.lang.Class<T> p0, android.content.UndoOwner p1) { return null; }
        boolean hasData() { return false; }
        boolean hasMultipleOwners() { return false; }
        boolean hasOperation(android.content.UndoOwner p0) { return false; }
        void makeExecuted() {}
        boolean matchOwner(android.content.UndoOwner p0) { return false; }
        void redo() {}
        boolean setCanMerge(boolean p0) { return false; }
        void setLabel(java.lang.CharSequence p0) {}
        void undo() {}
        void updateLabel(java.lang.CharSequence p0) {}
        void writeToParcel(android.os.Parcel p0) {}
    }
}
