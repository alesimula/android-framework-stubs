package com.android.internal.widget;

public class PeopleHelper {
    private static final float COLOR_SHIFT_AMOUNT = 60.0f;
    private static final java.util.regex.Pattern IGNORABLE_CHAR_PATTERN = null;
    private static final java.util.regex.Pattern SPECIAL_CHAR_PATTERN = null;
    private int mAvatarSize;
    private android.content.Context mContext;
    private android.graphics.Paint mPaint;
    private android.graphics.Paint mTextPaint;
    public PeopleHelper() {}
    private int findColor(java.lang.CharSequence p0, int p1) { return 0; }
    public static android.view.ViewOutlineProvider getBadgeCutoutOutlineProvider(android.view.View p0, android.view.View p1) { return null; }
    private java.lang.String getPureName(java.lang.CharSequence p0) { return null; }
    public void animateViewForceHidden(com.android.internal.widget.CachingIconView p0, boolean p1) {}
    public android.graphics.drawable.Icon createAvatarSymbol(java.lang.CharSequence p0, java.lang.String p1, int p2) { return null; }
    public java.lang.String findNamePrefix(java.lang.CharSequence p0, java.lang.String p1) { return null; }
    public java.lang.String findNameSplit(java.lang.CharSequence p0) { return null; }
    public void init(android.content.Context p0) {}
    public java.util.Map<java.lang.CharSequence, java.lang.String> mapUniqueNamesToPrefix(java.util.List<com.android.internal.widget.MessagingGroup> p0) { return null; }
    public com.android.internal.widget.PeopleHelper.NameToPrefixMap mapUniqueNamesToPrefixWithGroupList(java.util.List<java.util.List<android.app.Notification.MessagingStyle.Message>> p0) { return null; }
    public void maybeHideFirstSenderName(java.util.List<com.android.internal.widget.MessagingGroup> p0, boolean p1, java.lang.CharSequence p2) {}

    public class NameToPrefixMap {
        java.util.Map<java.lang.String, java.lang.String> mMap;
        NameToPrefixMap(java.util.Map<java.lang.String, java.lang.String> p0) {}
        public java.lang.String getPrefix(java.lang.CharSequence p0) { return null; }
    }
}
