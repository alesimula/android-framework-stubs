package android.app;

final class SharedPreferencesImpl implements android.content.SharedPreferences {
    private static final long CALLBACK_ON_CLEAR_CHANGE = 119147584L;
    private static final java.lang.Object CONTENT = null;
    private static final boolean DEBUG = false;
    private static final long MAX_FSYNC_DURATION_MILLIS = 256L;
    private static final java.lang.String TAG = "SharedPreferencesImpl";
    private static final java.util.concurrent.ThreadPoolExecutor sLoadExecutor = null;
    private final java.io.File mBackupFile = null;
    private long mCurrentMemoryStateGeneration;
    private long mDiskStateGeneration;
    private int mDiskWritesInFlight;
    private final java.io.File mFile = null;
    private final java.util.WeakHashMap<android.content.SharedPreferences.OnSharedPreferenceChangeListener, java.lang.Object> mListeners = null;
    private boolean mLoaded;
    private final java.lang.Object mLock = null;
    private java.util.Map<java.lang.String, java.lang.Object> mMap;
    private final int mMode = 0;
    private int mNumSync;
    private long mStatSize;
    private final com.android.internal.util.ExponentiallyBucketedHistogram mSyncTimes = null;
    private java.lang.Throwable mThrowable;
    private final java.lang.Object mWritingToDiskLock = null;
    SharedPreferencesImpl(java.io.File p0, int p1) {}
    private void awaitLoadedLocked() {}
    private static java.io.FileOutputStream createFileOutputStream(java.io.File p0) { return null; }
    private void enqueueDiskWrite(android.app.SharedPreferencesImpl.MemoryCommitResult p0, java.lang.Runnable p1) {}
    private boolean hasFileChangedUnexpectedly() { return false; }
    private void loadFromDisk() {}
    static java.io.File makeBackupFile(java.io.File p0) { return null; }
    private void startLoadFromDisk() {}
    private void writeToFile(android.app.SharedPreferencesImpl.MemoryCommitResult p0, boolean p1) {}
    public boolean contains(java.lang.String p0) { return false; }
    public android.content.SharedPreferences.Editor edit() { return null; }
    public java.util.Map<java.lang.String, ?> getAll() { return null; }
    public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    public float getFloat(java.lang.String p0, float p1) { return 0.0f; }
    public int getInt(java.lang.String p0, int p1) { return 0; }
    public long getLong(java.lang.String p0, long p1) { return 0L; }
    public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    public java.util.Set<java.lang.String> getStringSet(java.lang.String p0, java.util.Set<java.lang.String> p1) { return null; }
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener p0) {}
    void startReloadIfChangedUnexpectedly() {}
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener p0) {}

    public final class EditorImpl implements android.content.SharedPreferences.Editor {
        private boolean mClear;
        private final java.lang.Object mEditorLock = null;
        private final java.util.Map<java.lang.String, java.lang.Object> mModified = null;
        public EditorImpl(android.app.SharedPreferencesImpl p0) {}
        private android.app.SharedPreferencesImpl.MemoryCommitResult commitToMemory() { return null; }
        private void notifyListeners(android.app.SharedPreferencesImpl.MemoryCommitResult p0) {}
        public void apply() {}
        public android.content.SharedPreferences.Editor clear() { return null; }
        public boolean commit() { return false; }
        public android.content.SharedPreferences.Editor putBoolean(java.lang.String p0, boolean p1) { return null; }
        public android.content.SharedPreferences.Editor putFloat(java.lang.String p0, float p1) { return null; }
        public android.content.SharedPreferences.Editor putInt(java.lang.String p0, int p1) { return null; }
        public android.content.SharedPreferences.Editor putLong(java.lang.String p0, long p1) { return null; }
        public android.content.SharedPreferences.Editor putString(java.lang.String p0, java.lang.String p1) { return null; }
        public android.content.SharedPreferences.Editor putStringSet(java.lang.String p0, java.util.Set<java.lang.String> p1) { return null; }
        public android.content.SharedPreferences.Editor remove(java.lang.String p0) { return null; }
    }

    private static class MemoryCommitResult {
        final boolean keysCleared = false;
        final java.util.List<java.lang.String> keysModified = null;
        final java.util.Set<android.content.SharedPreferences.OnSharedPreferenceChangeListener> listeners = null;
        final java.util.Map<java.lang.String, java.lang.Object> mapToWriteToDisk = null;
        final long memoryStateGeneration = 0L;
        boolean wasWritten;
        volatile boolean writeToDiskResult;
        final java.util.concurrent.CountDownLatch writtenToDiskLatch = null;
        private MemoryCommitResult(long p0, boolean p1, java.util.List<java.lang.String> p2, java.util.Set<android.content.SharedPreferences.OnSharedPreferenceChangeListener> p3, java.util.Map<java.lang.String, java.lang.Object> p4) {}
        void setDiskWriteResult(boolean p0, boolean p1) {}
    }

    private static final class SharedPreferencesThreadFactory implements java.util.concurrent.ThreadFactory {
        private SharedPreferencesThreadFactory() {}
        public java.lang.Thread newThread(java.lang.Runnable p0) { return null; }
    }
}
