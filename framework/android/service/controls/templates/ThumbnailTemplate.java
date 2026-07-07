package android.service.controls.templates;

public final class ThumbnailTemplate extends android.service.controls.templates.ControlTemplate {
    private static final java.lang.String KEY_ACTIVE = "key_active";
    private static final java.lang.String KEY_CONTENT_DESCRIPTION = "key_content_description";
    private static final java.lang.String KEY_ICON = "key_icon";
    private static final int TYPE = 3;
    private final boolean mActive = false;
    private final java.lang.CharSequence mContentDescription = null;
    private final android.graphics.drawable.Icon mThumbnail = null;
    ThumbnailTemplate(android.os.Bundle p0) { super((android.os.Bundle)null); }
    public ThumbnailTemplate(java.lang.String p0, boolean p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) { super((android.os.Bundle)null); }
    private void rescaleThumbnail(int p0, int p1) {}
    public java.lang.CharSequence getContentDescription() { return null; }
    android.os.Bundle getDataBundle() { return null; }
    public int getTemplateType() { return 0; }
    public android.graphics.drawable.Icon getThumbnail() { return null; }
    public boolean isActive() { return false; }
    public void prepareTemplateForBinder(android.content.Context p0) {}
}
