package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class CompactMessagingLayout extends android.widget.FrameLayout {
    private android.view.ViewStub mConversationFacePileViewStub;
    private int mFacePileAvatarSize;
    private int mFacePileProtectionWidth;
    private int mFacePileSize;
    private int mLayoutColor;
    private int mNotificationBackgroundColor;
    private final com.android.internal.widget.PeopleHelper mPeopleHelper = null;
    public CompactMessagingLayout(android.content.Context p0) { super((android.content.Context)null); }
    public CompactMessagingLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public CompactMessagingLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public CompactMessagingLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private static java.lang.CharSequence getPersonKey(android.app.Person p0) { return null; }
    private android.graphics.drawable.Icon getSenderIcon(android.app.Person p0, com.android.internal.widget.PeopleHelper.NameToPrefixMap p1, int p2) { return null; }
    private static java.util.List<java.util.List<android.app.Notification.MessagingStyle.Message>> groupMessages(java.util.List<android.app.Notification.MessagingStyle.Message> p0, java.util.List<android.app.Notification.MessagingStyle.Message> p1) { return null; }
    private static void setSize(android.view.View p0, int p1) {}
    protected void onFinishInflate() {}
    @android.view.RemotableViewMethod(asyncImpl="setGroupFacePileAsync")
    public void setGroupFacePile(android.os.Bundle p0) {}
    public java.lang.Runnable setGroupFacePileAsync(android.os.Bundle p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setLayoutColorAsync")
    public void setLayoutColor(int p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable setLayoutColorAsync(int p0) { return null; }
    @android.view.RemotableViewMethod
    public void setNotificationBackgroundColor(int p0) {}
}
