package android.provider;

public class MediaStore {
    public MediaStore() {}
    public android.net.Uri scanFile(android.content.ContentResolver p0, java.io.File p1) { return null; }
    public android.os.ParcelFileDescriptor getOriginalMediaFormatFileDescriptor(android.content.Context p0, android.os.ParcelFileDescriptor p1) { return null; }
    public java.lang.String getVolumeName(android.net.Uri p0) { return null; }
    public java.lang.String restoreFileFromTrash(android.content.ContentResolver p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.String trashFile(android.content.ContentResolver p0, java.lang.String p1) { return null; }

    public static class Files {
        public Files() {}
        public android.net.Uri getContentUri(java.lang.String p0) { return null; }
    }
}
