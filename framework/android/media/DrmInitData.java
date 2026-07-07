package android.media;

public abstract class DrmInitData {
    DrmInitData() {}
    @java.lang.Deprecated
    public abstract android.media.DrmInitData.SchemeInitData get(java.util.UUID p0);
    public android.media.DrmInitData.SchemeInitData getSchemeInitDataAt(int p0) { return null; }
    public int getSchemeInitDataCount() { return 0; }

    public static final class SchemeInitData {
        public static final java.util.UUID UUID_NIL = null;
        public final byte[] data = null;
        public final java.lang.String mimeType = null;
        public final java.util.UUID uuid = null;
        public SchemeInitData(java.util.UUID p0, java.lang.String p1, byte[] p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
