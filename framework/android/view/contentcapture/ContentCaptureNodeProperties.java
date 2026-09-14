package android.view.contentcapture;

public class ContentCaptureNodeProperties {
    private static final int FLAG_HAS_BOUNDS = 2;
    private static final int FLAG_HAS_CONTENT_DESCRIPTION = 8;
    private static final int FLAG_HAS_PARENT_ID = 1;
    private static final int FLAG_HAS_TEXT = 4;
    private int mBottom;
    private java.lang.CharSequence mContentDescription;
    private int mLeft;
    private android.view.autofill.AutofillId mParentId;
    private int mRight;
    private int mSetFlags;
    private java.lang.CharSequence mText;
    private int mTop;
    public ContentCaptureNodeProperties() {}
    public void clear() {}
    public void getBounds(android.graphics.Rect p0) {}
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.view.autofill.AutofillId getParentId() { return null; }
    public java.lang.CharSequence getText() { return null; }
    public boolean hasBounds() { return false; }
    public boolean hasContentDescription() { return false; }
    public boolean hasParentId() { return false; }
    public boolean hasText() { return false; }
    public void setBounds(int p0, int p1, int p2, int p3) {}
    public void setContentDescription(java.lang.CharSequence p0) {}
    public void setParentId(android.view.autofill.AutofillId p0) {}
    public void setText(java.lang.CharSequence p0) {}
}
