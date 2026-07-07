package android.webkit;

@java.lang.Deprecated
public final class CacheManager {
    static final boolean $assertionsDisabled = false;
    public CacheManager() {}
    @java.lang.Deprecated
    public static boolean cacheDisabled() { return false; }
    @java.lang.Deprecated
    public static boolean endCacheTransaction() { return false; }
    @java.lang.Deprecated
    public static android.webkit.CacheManager.CacheResult getCacheFile(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) { return null; }
    @java.lang.Deprecated
    public static java.io.File getCacheFileBaseDir() { return null; }
    static void saveCacheFile(java.lang.String p0, long p1, android.webkit.CacheManager.CacheResult p2) {}
    @java.lang.Deprecated
    public static void saveCacheFile(java.lang.String p0, android.webkit.CacheManager.CacheResult p1) {}
    @java.lang.Deprecated
    public static boolean startCacheTransaction() { return false; }

    @java.lang.Deprecated
    public static class CacheResult {
        long contentLength;
        java.lang.String contentdisposition;
        java.lang.String crossDomain;
        java.lang.String encoding;
        java.lang.String etag;
        long expires;
        java.lang.String expiresString;
        int httpStatusCode;
        java.io.InputStream inStream;
        java.lang.String lastModified;
        java.lang.String localPath;
        java.lang.String location;
        java.lang.String mimeType;
        java.io.File outFile;
        java.io.OutputStream outStream;
        public CacheResult() {}
        public java.lang.String getContentDisposition() { return null; }
        public long getContentLength() { return 0L; }
        public java.lang.String getETag() { return null; }
        public java.lang.String getEncoding() { return null; }
        public long getExpires() { return 0L; }
        public java.lang.String getExpiresString() { return null; }
        public int getHttpStatusCode() { return 0; }
        public java.io.InputStream getInputStream() { return null; }
        public java.lang.String getLastModified() { return null; }
        public java.lang.String getLocalPath() { return null; }
        public java.lang.String getLocation() { return null; }
        public java.lang.String getMimeType() { return null; }
        public java.io.OutputStream getOutputStream() { return null; }
        public void setContentLength(long p0) {}
        public void setEncoding(java.lang.String p0) {}
        public void setInputStream(java.io.InputStream p0) {}
    }
}
