package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class MessagingLayout extends com.android.internal.widget.NotificationFrameLayout implements com.android.internal.widget.ImageMessageConsumer, com.android.internal.widget.IMessagingLayout {
    public static final android.view.animation.Interpolator FAST_OUT_LINEAR_IN = null;
    public static final android.view.animation.Interpolator FAST_OUT_SLOW_IN = null;
    public static final android.view.animation.Interpolator LINEAR_OUT_SLOW_IN = null;
    private static final int MAX_SUMMARIZATION_LINES = 5;
    public static final android.view.View.OnLayoutChangeListener MESSAGING_PROPERTY_ANIMATOR = null;
    private static final java.lang.String TAG = "MessagingLayout";
    private final java.util.ArrayList<com.android.internal.widget.MessagingGroup> mAddedGroups = null;
    private android.graphics.drawable.Icon mAvatarReplacement;
    private java.lang.CharSequence mConversationTitle;
    private int mDefaultStartMargin;
    private final java.util.ArrayList<com.android.internal.widget.MessagingGroup> mGroups = null;
    private java.util.List<com.android.internal.widget.MessagingMessage> mHistoricMessages;
    private com.android.internal.widget.MessagingLinearLayout mImageMessageContainer;
    private com.android.internal.widget.ImageResolver mImageResolver;
    private boolean mIsCollapsed;
    private boolean mIsOneToOne;
    private int mLayoutColor;
    private android.widget.LinearLayout mMessageContentView;
    private int mMessageTextColor;
    private java.util.List<com.android.internal.widget.MessagingMessage> mMessages;
    private android.graphics.Rect mMessagingClipRect;
    private com.android.internal.widget.MessagingLinearLayout mMessagingLinearLayout;
    private java.lang.CharSequence mNameReplacement;
    private final com.android.internal.widget.PeopleHelper mPeopleHelper = null;
    private boolean mPrecomputedTextEnabled;
    private android.widget.ImageView mRightIconView;
    private int mSenderTextColor;
    private boolean mShowHistoricMessages;
    private int mSpacingForExpander;
    private int mSpacingForImage;
    private int mSummarizationStartMargin;
    private java.lang.CharSequence mSummarizedContent;
    private final java.util.ArrayList<com.android.internal.widget.MessagingLinearLayout.MessagingChild> mToRecycle = null;
    private android.view.NotificationTopLineView mTopLine;
    private android.app.Person mUser;
    public MessagingLayout(android.content.Context p0) { super((android.content.Context)null); }
    public MessagingLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MessagingLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MessagingLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void addRemoteInputHistoryToMessages(java.util.List<android.app.Notification.MessagingStyle.Message> p0, android.app.RemoteInputHistoryItem[] p1) {}
    private void adjustSpacingForImage() {}
    private void bind(com.android.internal.widget.MessagingData p0) {}
    private void createGroupViews(java.util.List<java.util.List<com.android.internal.widget.MessagingMessage>> p0, java.util.List<android.app.Person> p1, boolean p2) {}
    private java.util.List<com.android.internal.widget.MessagingMessage> createMessages(java.util.List<android.app.Notification.MessagingStyle.Message> p0, boolean p1, boolean p2, boolean p3) { return null; }
    private void finalizeInflate(java.util.List<com.android.internal.widget.MessagingMessage> p0) {}
    private com.android.internal.widget.MessagingMessage findAndRemoveMatchingMessage(android.app.Notification.MessagingStyle.Message p0) { return null; }
    private void findGroups(java.util.List<com.android.internal.widget.MessagingMessage> p0, java.util.List<com.android.internal.widget.MessagingMessage> p1, java.util.List<java.util.List<com.android.internal.widget.MessagingMessage>> p2, java.util.List<android.app.Person> p3) {}
    private android.view.View getNewImageMessage() { return null; }
    private int getSpacingForImage() { return 0; }
    private boolean isShowingSummarization() { return false; }
    private com.android.internal.widget.MessagingData parseMessagingData(android.os.Bundle p0, boolean p1) { return null; }
    private void removeGroups(java.util.ArrayList<com.android.internal.widget.MessagingGroup> p0) {}
    private void updateHistoricMessageVisibility() {}
    private void updateImageMessages() {}
    private void updateMarginEnd(android.view.ViewGroup p0, int p1) {}
    private void updateTitleAndNamesDisplay() {}
    private void updateViewsForSummarization() {}
    public android.graphics.drawable.Icon createAvatarSymbol(java.lang.CharSequence p0, java.lang.String p1, int p2) { return null; }
    public android.view.ViewGroup getImageMessageContainer() { return null; }
    public java.util.ArrayList<com.android.internal.widget.MessagingGroup> getMessagingGroups() { return null; }
    public com.android.internal.widget.MessagingLinearLayout getMessagingLinearLayout() { return null; }
    protected void onFinishInflate() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    @android.view.RemotableViewMethod(asyncImpl="setAvatarReplacementAsync")
    public void setAvatarReplacement(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setAvatarReplacementAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setConversationTitleAsync")
    public void setConversationTitle(java.lang.CharSequence p0) {}
    public java.lang.Runnable setConversationTitleAsync(java.lang.CharSequence p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setDataAsync")
    public void setData(android.os.Bundle p0) {}
    public java.lang.Runnable setDataAsync(android.os.Bundle p0) { return null; }
    public void setImageResolver(com.android.internal.widget.ImageResolver p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setIsCollapsedAsync")
    public void setIsCollapsed(boolean p0) {}
    public java.lang.Runnable setIsCollapsedAsync(boolean p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setIsOneToOneAsync")
    public void setIsOneToOne(boolean p0) {}
    public java.lang.Runnable setIsOneToOneAsync(boolean p0) { return null; }
    @android.view.RemotableViewMethod
    public void setLargeIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setLayoutColorAsync")
    public void setLayoutColor(int p0) {}
    public java.lang.Runnable setLayoutColorAsync(int p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setMessageTextColorAsync")
    public void setMessageTextColor(int p0) {}
    public java.lang.Runnable setMessageTextColorAsync(int p0) { return null; }
    public void setMessagingClippingDisabled(boolean p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setNameReplacementAsync")
    public void setNameReplacement(java.lang.CharSequence p0) {}
    public java.lang.Runnable setNameReplacementAsync(java.lang.CharSequence p0) { return null; }
    @android.view.RemotableViewMethod
    public void setNotificationBackgroundColor(int p0) {}
    public void setPrecomputedTextEnabled(boolean p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setSenderTextColorAsync")
    public void setSenderTextColor(int p0) {}
    public java.lang.Runnable setSenderTextColorAsync(int p0) { return null; }
    public void setUser(android.app.Person p0) {}
    public void showHistoricMessages(boolean p0) {}
}
