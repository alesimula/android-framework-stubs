package android.content.om;

public class FabricatedOverlay {
    final android.os.FabricatedOverlayInternal mOverlay = null;
    public FabricatedOverlay(android.os.FabricatedOverlayInternal p0) {}
    public FabricatedOverlay(java.lang.String p0, java.lang.String p1) {}
    private static java.lang.String ensureValidResourceName(java.lang.String p0) { return null; }
    private static android.os.FabricatedOverlayInternal generateFabricatedOverlayInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.ArrayList<android.os.FabricatedOverlayInternalEntry> p4) { return null; }
    private static android.os.FabricatedOverlayInternalEntry generateFabricatedOverlayInternalEntry(java.lang.String p0, float p1, int p2, java.lang.String p3) { return null; }
    private static android.os.FabricatedOverlayInternalEntry generateFabricatedOverlayInternalEntry(java.lang.String p0, float p1, java.lang.String p2) { return null; }
    private static android.os.FabricatedOverlayInternalEntry generateFabricatedOverlayInternalEntry(java.lang.String p0, int p1, int p2, java.lang.String p3) { return null; }
    private static android.os.FabricatedOverlayInternalEntry generateFabricatedOverlayInternalEntry(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) { return null; }
    private static android.os.FabricatedOverlayInternalEntry generateFabricatedOverlayInternalEntry(java.lang.String p0, android.content.res.AssetFileDescriptor p1, java.lang.String p2) { return null; }
    private static android.os.FabricatedOverlayInternalEntry generateFabricatedOverlayInternalEntry(java.lang.String p0, android.os.ParcelFileDescriptor p1, java.lang.String p2, boolean p3) { return null; }
    public java.util.List<android.os.FabricatedOverlayInternalEntry> getEntries(int... p0) { return null; }
    public android.content.om.OverlayIdentifier getIdentifier() { return null; }
    public android.os.FabricatedOverlayInternal getInternal() { return null; }
    public java.lang.String getTargetOverlayable() { return null; }
    public void setNinePatchResourceValue(java.lang.String p0, android.os.ParcelFileDescriptor p1, java.lang.String p2) {}
    public void setOwningPackage(java.lang.String p0) {}
    public void setResourceValue(java.lang.String p0, float p1, int p2, java.lang.String p3) {}
    public void setResourceValue(java.lang.String p0, float p1, java.lang.String p2) {}
    public void setResourceValue(java.lang.String p0, int p1, int p2, java.lang.String p3) {}
    public void setResourceValue(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public void setResourceValue(java.lang.String p0, android.content.res.AssetFileDescriptor p1, java.lang.String p2) {}
    public void setResourceValue(java.lang.String p0, android.os.ParcelFileDescriptor p1, java.lang.String p2) {}
    public void setTargetOverlayable(java.lang.String p0) {}

    public static final class Builder {
        private final java.util.ArrayList<android.os.FabricatedOverlayInternalEntry> mEntries = null;
        private final java.lang.String mName = null;
        private final java.lang.String mOwningPackage = null;
        private java.lang.String mTargetOverlayable;
        private final java.lang.String mTargetPackage = null;
        public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public android.content.om.FabricatedOverlay build() { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, int p2) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, int p2, java.lang.String p3) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, java.lang.String p2) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, android.content.res.AssetFileDescriptor p1, java.lang.String p2) { return null; }
        @java.lang.Deprecated(since="Please use FabricatedOverlay#setResourceValue instead")
        public android.content.om.FabricatedOverlay.Builder setResourceValue(java.lang.String p0, android.os.ParcelFileDescriptor p1, java.lang.String p2) { return null; }
        public android.content.om.FabricatedOverlay.Builder setTargetOverlayable(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StringTypeOverlayResource {
    }
}
