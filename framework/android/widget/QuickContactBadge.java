package android.widget;

public class QuickContactBadge extends android.widget.ImageView implements android.view.View.OnClickListener {
    static final int EMAIL_ID_COLUMN_INDEX = 0;
    static final java.lang.String[] EMAIL_LOOKUP_PROJECTION = null;
    static final int EMAIL_LOOKUP_STRING_COLUMN_INDEX = 1;
    private static final java.lang.String EXTRA_URI_CONTENT = "uri_content";
    static final int PHONE_ID_COLUMN_INDEX = 0;
    static final java.lang.String[] PHONE_LOOKUP_PROJECTION = null;
    static final int PHONE_LOOKUP_STRING_COLUMN_INDEX = 1;
    private static final int TOKEN_EMAIL_LOOKUP = 0;
    private static final int TOKEN_EMAIL_LOOKUP_AND_TRIGGER = 2;
    private static final int TOKEN_PHONE_LOOKUP = 1;
    private static final int TOKEN_PHONE_LOOKUP_AND_TRIGGER = 3;
    private java.lang.String mContactEmail;
    private java.lang.String mContactPhone;
    private android.net.Uri mContactUri;
    private android.graphics.drawable.Drawable mDefaultAvatar;
    protected java.lang.String[] mExcludeMimes;
    private android.os.Bundle mExtras;
    private android.graphics.drawable.Drawable mOverlay;
    private java.lang.String mPrioritizedMimeType;
    private android.widget.QuickContactBadge.QueryHandler mQueryHandler;
    public QuickContactBadge(android.content.Context p0) { super((android.content.Context)null); }
    public QuickContactBadge(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public QuickContactBadge(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public QuickContactBadge(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private boolean isAssigned() { return false; }
    private void onContactUriChanged() {}
    public void assignContactFromEmail(java.lang.String p0, boolean p1) {}
    public void assignContactFromEmail(java.lang.String p0, boolean p1, android.os.Bundle p2) {}
    public void assignContactFromPhone(java.lang.String p0, boolean p1) {}
    public void assignContactFromPhone(java.lang.String p0, boolean p1, android.os.Bundle p2) {}
    public void assignContactUri(android.net.Uri p0) {}
    public void drawableHotspotChanged(float p0, float p1) {}
    protected void drawableStateChanged() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected void onAttachedToWindow() {}
    public void onClick(android.view.View p0) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public void setExcludeMimes(java.lang.String[] p0) {}
    public void setImageToDefault() {}
    public void setMode(int p0) {}
    public void setOverlay(android.graphics.drawable.Drawable p0) {}
    public void setPrioritizedMimeType(java.lang.String p0) {}

    private class QueryHandler extends android.content.AsyncQueryHandler {
        public QueryHandler(android.widget.QuickContactBadge p0, android.content.ContentResolver p1) { super(null); }
        protected void onQueryComplete(int p0, java.lang.Object p1, android.database.Cursor p2) {}
    }
}
