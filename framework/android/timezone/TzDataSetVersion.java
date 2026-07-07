package android.timezone;

public final class TzDataSetVersion {
    private TzDataSetVersion(com.android.i18n.timezone.TzDataSetVersion p0) {}
    public static int currentFormatMajorVersion() { return 0; }
    public static int currentFormatMinorVersion() { return 0; }
    public static boolean isCompatibleWithThisDevice(android.timezone.TzDataSetVersion p0) { return false; }
    public static android.timezone.TzDataSetVersion read() throws java.io.IOException, android.timezone.TzDataSetVersion.TzDataSetException { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getFormatMajorVersion() { return 0; }
    public int getFormatMinorVersion() { return 0; }
    public int getRevision() { return 0; }
    public java.lang.String getRulesVersion() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class TzDataSetException extends java.lang.Exception {
        public TzDataSetException(java.lang.String p0) { super(); }
        public TzDataSetException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    }
}
