package android.mtp;

public class MtpStorageManager {
    private static final int IN_IGNORED = 32768;
    private static final int IN_ISDIR = 1073741824;
    private static final int IN_ONLYDIR = 16777216;
    private static final int IN_Q_OVERFLOW = 16384;
    private static final java.lang.String TAG = null;
    public static boolean sDebug;
    private volatile boolean mCheckConsistency;
    private java.lang.Thread mConsistencyThread;
    private android.mtp.MtpStorageManager.MtpNotifier mMtpNotifier;
    private int mNextObjectId;
    private int mNextStorageId;
    private java.util.HashMap<java.lang.Integer, android.mtp.MtpStorageManager.MtpObject> mObjects;
    private java.util.HashMap<java.lang.Integer, android.mtp.MtpStorageManager.MtpObject> mRoots;
    private java.util.Set<java.lang.String> mSubdirectories;
    public MtpStorageManager(android.mtp.MtpStorageManager.MtpNotifier p0, java.util.Set<java.lang.String> p1) {}
    private android.mtp.MtpStorageManager.MtpObject addObjectToCache(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1, boolean p2) { return null; }
    private boolean generalBeginCopyObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1) { return false; }
    private boolean generalBeginRemoveObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpOperation p1) { return false; }
    private boolean generalBeginRenameObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpObject p1) { return false; }
    private boolean generalEndAddObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1, boolean p2) { return false; }
    private boolean generalEndCopyObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1, boolean p2) { return false; }
    private boolean generalEndRemoveObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1, boolean p2) { return false; }
    private boolean generalEndRenameObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpObject p1, boolean p2) { return false; }
    private java.util.Collection<android.mtp.MtpStorageManager.MtpObject> getChildren(android.mtp.MtpStorageManager.MtpObject p0) { return null; }
    private int getNextObjectId() { return 0; }
    private int getNextStorageId() { return 0; }
    private boolean getObjects(java.util.List<android.mtp.MtpStorageManager.MtpObject> p0, android.mtp.MtpStorageManager.MtpObject p1, int p2, boolean p3) { return false; }
    private void handleAddedObject(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1, boolean p2) {}
    private void handleChangedObject(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1) {}
    private void handleRemovedObject(android.mtp.MtpStorageManager.MtpObject p0) {}
    private boolean isSpecialSubDir(android.mtp.MtpStorageManager.MtpObject p0) { return false; }
    private boolean removeObjectFromCache(android.mtp.MtpStorageManager.MtpObject p0, boolean p1, boolean p2) { return false; }
    public android.mtp.MtpStorage addMtpStorage(android.os.storage.StorageVolume p0, java.util.function.Supplier<java.lang.Boolean> p1) { return null; }
    public int beginCopyObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpObject p1) { return 0; }
    public boolean beginMoveObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpObject p1) { return false; }
    public boolean beginRemoveObject(android.mtp.MtpStorageManager.MtpObject p0) { return false; }
    public boolean beginRenameObject(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1) { return false; }
    public int beginSendObject(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1, int p2) { return 0; }
    public boolean checkConsistency() { return false; }
    public void close() {}
    public void dump() {}
    public boolean endCopyObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1) { return false; }
    public boolean endMoveObject(android.mtp.MtpStorageManager.MtpObject p0, android.mtp.MtpStorageManager.MtpObject p1, java.lang.String p2, boolean p3) { return false; }
    public boolean endRemoveObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1) { return false; }
    public boolean endRenameObject(android.mtp.MtpStorageManager.MtpObject p0, java.lang.String p1, boolean p2) { return false; }
    public boolean endSendObject(android.mtp.MtpStorageManager.MtpObject p0, boolean p1) { return false; }
    public void flushEvents() {}
    public android.mtp.MtpStorageManager.MtpObject getByPath(java.lang.String p0) { return null; }
    public android.mtp.MtpStorageManager.MtpObject getObject(int p0) { return null; }
    public java.util.List<android.mtp.MtpStorageManager.MtpObject> getObjects(int p0, int p1, int p2) { return null; }
    public android.mtp.MtpStorageManager.MtpObject getStorageRoot(int p0) { return null; }
    public void removeMtpStorage(android.mtp.MtpStorage p0) {}
    public void setSubdirectories(java.util.Set<java.lang.String> p0) {}

    public static abstract class MtpNotifier {
        public MtpNotifier() {}
        public abstract void sendObjectAdded(int p0);
        public abstract void sendObjectInfoChanged(int p0);
        public abstract void sendObjectRemoved(int p0);
    }

    public static class MtpObject {
        private java.util.HashMap<java.lang.String, android.mtp.MtpStorageManager.MtpObject> mChildren;
        private int mId;
        private boolean mIsDir;
        private java.lang.String mName;
        private android.os.FileObserver mObserver;
        private android.mtp.MtpStorageManager.MtpOperation mOp;
        private android.mtp.MtpStorageManager.MtpObject mParent;
        private android.mtp.MtpStorageManager.MtpObjectState mState;
        private android.mtp.MtpStorage mStorage;
        private boolean mVisited;
        MtpObject(java.lang.String p0, int p1, android.mtp.MtpStorage p2, android.mtp.MtpStorageManager.MtpObject p3, boolean p4) {}
        private void addChild(android.mtp.MtpStorageManager.MtpObject p0) {}
        private android.mtp.MtpStorageManager.MtpObject copy(boolean p0) { return null; }
        private boolean exists() { return false; }
        private android.mtp.MtpStorageManager.MtpObject getChild(java.lang.String p0) { return null; }
        private java.util.Collection<android.mtp.MtpStorageManager.MtpObject> getChildren() { return null; }
        private android.os.FileObserver getObserver() { return null; }
        private android.mtp.MtpStorageManager.MtpOperation getOperation() { return null; }
        private android.mtp.MtpStorageManager.MtpObjectState getState() { return null; }
        private android.mtp.MtpStorage getStorage() { return null; }
        private boolean isFileTranscodeSupported() { return false; }
        private boolean isTranscodeMtpEnabled() { return false; }
        private boolean isVisited() { return false; }
        private long maybeApplyTranscodeLengthWorkaround(long p0) { return 0L; }
        private void setDir(boolean p0) {}
        private void setId(int p0) {}
        private void setName(java.lang.String p0) {}
        private void setObserver(android.os.FileObserver p0) {}
        private void setOperation(android.mtp.MtpStorageManager.MtpOperation p0) {}
        private void setParent(android.mtp.MtpStorageManager.MtpObject p0) {}
        private void setState(android.mtp.MtpStorageManager.MtpObjectState p0) {}
        private void setVisited(boolean p0) {}
        public int getFormat() { return 0; }
        public int getId() { return 0; }
        public long getModifiedTime() { return 0L; }
        public java.lang.String getName() { return null; }
        public android.mtp.MtpStorageManager.MtpObject getParent() { return null; }
        public java.nio.file.Path getPath() { return null; }
        public android.mtp.MtpStorageManager.MtpObject getRoot() { return null; }
        public long getSize() { return 0L; }
        public int getStorageId() { return 0; }
        public java.lang.String getVolumeName() { return null; }
        public boolean isDir() { return false; }
        public boolean isRoot() { return false; }
    }

    private class MtpObjectObserver extends android.os.FileObserver {
        android.mtp.MtpStorageManager.MtpObject mObject;
        MtpObjectObserver(android.mtp.MtpStorageManager p0, android.mtp.MtpStorageManager.MtpObject p1) { super((java.io.File)null); }
        public void finalize() {}
        public void onEvent(int p0, java.lang.String p1) {}
    }

    private static enum MtpObjectState {
        FROZEN,
        FROZEN_ADDED,
        FROZEN_ONESHOT_ADD,
        FROZEN_ONESHOT_DEL,
        FROZEN_REMOVED,
        NORMAL;
        private static final android.mtp.MtpStorageManager.MtpObjectState[] $VALUES = null;
        private MtpObjectState() {}
    }

    private static enum MtpOperation {
        ADD,
        COPY,
        DELETE,
        NONE,
        RENAME;
        private static final android.mtp.MtpStorageManager.MtpOperation[] $VALUES = null;
        private MtpOperation() {}
    }
}
