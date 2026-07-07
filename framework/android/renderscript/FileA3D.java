package android.renderscript;

@java.lang.Deprecated
public class FileA3D extends android.renderscript.BaseObj {
    android.renderscript.FileA3D.IndexEntry[] mFileEntries;
    java.io.InputStream mInputStream;
    FileA3D(long p0, android.renderscript.RenderScript p1, java.io.InputStream p2) { super(0L, null); }
    public static android.renderscript.FileA3D createFromAsset(android.renderscript.RenderScript p0, android.content.res.AssetManager p1, java.lang.String p2) { return null; }
    public static android.renderscript.FileA3D createFromFile(android.renderscript.RenderScript p0, java.io.File p1) { return null; }
    public static android.renderscript.FileA3D createFromFile(android.renderscript.RenderScript p0, java.lang.String p1) { return null; }
    public static android.renderscript.FileA3D createFromResource(android.renderscript.RenderScript p0, android.content.res.Resources p1, int p2) { return null; }
    private void initEntries() {}
    public android.renderscript.FileA3D.IndexEntry getIndexEntry(int p0) { return null; }
    public int getIndexEntryCount() { return 0; }

    public static enum EntryType {
        MESH,
        UNKNOWN;
        private static final android.renderscript.FileA3D.EntryType[] $VALUES = null;
        int mID;
        private EntryType() {}
        static android.renderscript.FileA3D.EntryType toEntryType(int p0) { return null; }
    }

    public static class IndexEntry {
        android.renderscript.FileA3D.EntryType mEntryType;
        long mID;
        int mIndex;
        android.renderscript.BaseObj mLoadedObj;
        java.lang.String mName;
        android.renderscript.RenderScript mRS;
        IndexEntry(android.renderscript.RenderScript p0, int p1, long p2, java.lang.String p3, android.renderscript.FileA3D.EntryType p4) {}
        static android.renderscript.BaseObj internalCreate(android.renderscript.RenderScript p0, android.renderscript.FileA3D.IndexEntry p1) { return null; }
        public android.renderscript.FileA3D.EntryType getEntryType() { return null; }
        public android.renderscript.Mesh getMesh() { return null; }
        public java.lang.String getName() { return null; }
        public android.renderscript.BaseObj getObject() { return null; }
    }
}
