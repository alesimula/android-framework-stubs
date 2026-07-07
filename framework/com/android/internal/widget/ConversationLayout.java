package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class ConversationLayout extends com.android.internal.widget.NotificationFrameLayout implements com.android.internal.widget.ImageMessageConsumer, com.android.internal.widget.IMessagingLayout {
    public static final android.view.animation.Interpolator FAST_OUT_LINEAR_IN = null;
    public static final android.view.animation.Interpolator FAST_OUT_SLOW_IN = null;
    public static final int IMPORTANCE_ANIM_GROW_DURATION = 250;
    public static final int IMPORTANCE_ANIM_SHRINK_DELAY = 25;
    public static final int IMPORTANCE_ANIM_SHRINK_DURATION = 200;
    public static final android.view.animation.Interpolator LINEAR_OUT_SLOW_IN = null;
    private static final int MAX_SUMMARIZATION_LINES = 5;
    public static final android.view.animation.Interpolator OVERSHOOT = null;
    private static final java.lang.String TAG = "ConversationLayout";
    private final java.util.ArrayList<com.android.internal.widget.MessagingGroup> mAddedGroups = null;
    private android.graphics.drawable.Icon mAvatarReplacement;
    private android.widget.LinearLayout mConversationContentView;
    private android.view.View mConversationFacePile;
    private android.view.View mConversationIconBadge;
    private com.android.internal.widget.CachingIconView mConversationIconBadgeBg;
    private com.android.internal.widget.CachingIconView mConversationIconView;
    private android.widget.TextView mConversationText;
    private java.lang.CharSequence mConversationTitle;
    private int mDefaultStartMargin;
    private com.android.internal.widget.NotificationExpandButton mExpandButton;
    private java.lang.CharSequence mFallbackChatName;
    private java.lang.CharSequence mFallbackGroupChatName;
    private final java.util.ArrayList<com.android.internal.widget.MessagingGroup> mGroups = null;
    private java.util.List<com.android.internal.widget.MessagingMessage> mHistoricMessages;
    private com.android.internal.widget.CachingIconView mIcon;
    private com.android.internal.widget.MessagingLinearLayout mImageMessageContainer;
    private com.android.internal.widget.ImageResolver mImageResolver;
    private com.android.internal.widget.CachingIconView mImportanceRingView;
    private boolean mImportantConversation;
    private boolean mIsCollapsed;
    private boolean mIsOneToOne;
    private android.graphics.drawable.Icon mLargeIcon;
    private int mLayoutColor;
    private int mMessageTextColor;
    private java.util.List<com.android.internal.widget.MessagingMessage> mMessages;
    private android.graphics.Rect mMessagingClipRect;
    private com.android.internal.widget.MessagingLinearLayout mMessagingLinearLayout;
    private java.lang.CharSequence mNameReplacement;
    private int mNotificationBackgroundColor;
    private final com.android.internal.widget.PeopleHelper mPeopleHelper = null;
    private boolean mPrecomputedTextEnabled;
    private android.widget.ImageView mRightIconView;
    private int mSenderTextColor;
    private android.graphics.drawable.Icon mShortcutIcon;
    private boolean mShowHistoricMessages;
    private int mSpacingForExpander;
    private int mSpacingForImage;
    private int mSummarizationStartMargin;
    private java.lang.CharSequence mSummarizedContent;
    private final java.util.ArrayList<com.android.internal.widget.MessagingLinearLayout.MessagingChild> mToRecycle = null;
    private android.view.NotificationTopLineView mTopLine;
    private android.app.Person mUser;
    public ConversationLayout(android.content.Context p0) { super((android.content.Context)null); }
    public ConversationLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ConversationLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ConversationLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void addRemoteInputHistoryToMessages(java.util.List<android.app.Notification.MessagingStyle.Message> p0, android.app.RemoteInputHistoryItem[] p1) {}
    private void adjustSpacingForImage() {}
    private void applyNotificationBackgroundColor(android.widget.ImageView p0) {}
    private void bind(com.android.internal.widget.MessagingData p0) {}
    private void bindFacePile(com.android.internal.widget.ConversationAvatarData.GroupConversationAvatarData p0) {}
    private void createGroupViews(java.util.List<java.util.List<com.android.internal.widget.MessagingMessage>> p0, java.util.List<android.app.Person> p1, boolean p2) {}
    private java.util.List<com.android.internal.widget.MessagingMessage> createMessages(java.util.List<android.app.Notification.MessagingStyle.Message> p0, boolean p1, boolean p2, boolean p3) { return null; }
    private void finalizeInflate(java.util.List<com.android.internal.widget.MessagingMessage> p0) {}
    private com.android.internal.widget.MessagingMessage findAndRemoveMatchingMessage(android.app.Notification.MessagingStyle.Message p0) { return null; }
    private void findGroups(java.util.List<com.android.internal.widget.MessagingMessage> p0, java.util.List<com.android.internal.widget.MessagingMessage> p1, android.app.Person p2, java.util.List<java.util.List<com.android.internal.widget.MessagingMessage>> p3, java.util.List<android.app.Person> p4) {}
    private java.lang.CharSequence getKey(android.app.Person p0) { return null; }
    private android.view.View getNewImageMessage() { return null; }
    private int getSpacingForImage() { return 0; }
    private boolean isShowingSummarization() { return false; }
    private com.android.internal.widget.ConversationHeaderData loadConversationHeaderData(boolean p0, java.lang.CharSequence p1, android.graphics.drawable.Icon p2, android.graphics.drawable.Icon p3, java.util.List<com.android.internal.widget.MessagingMessage> p4, android.app.Person p5, java.util.List<java.util.List<com.android.internal.widget.MessagingMessage>> p6, int p7) { return null; }
    private android.graphics.drawable.Drawable loadDrawableFromIcon(android.graphics.drawable.Icon p0) { return null; }
    private com.android.internal.widget.MessagingData parseMessagingData(android.os.Bundle p0, boolean p1, boolean p2) { return null; }
    private void removeGroups(java.util.ArrayList<com.android.internal.widget.MessagingGroup> p0) {}
    private android.graphics.drawable.Drawable resolveAvatarImageForFacePile(android.graphics.drawable.Icon p0) { return null; }
    private android.graphics.drawable.Drawable resolveAvatarImageForOneToOne(android.graphics.drawable.Icon p0) { return null; }
    private void setConversationAvatarAndNameFromData(com.android.internal.widget.ConversationHeaderData p0) {}
    private void setUser(android.app.Person p0) {}
    private android.graphics.drawable.Drawable tryLoadingSizeRestrictedIconForOneToOne(android.graphics.drawable.Icon p0) { return null; }
    private void updateConversationLayout(com.android.internal.widget.MessagingData p0) {}
    private void updateHistoricMessageVisibility() {}
    private void updateImageMessages() {}
    private void updateMarginEnd(android.view.ViewGroup p0, int p1) {}
    private void updateTitleAndNamesDisplay() {}
    private void updateViewsForSummarization() {}
    public void bindFacePile(android.widget.ImageView p0, android.widget.ImageView p1, android.widget.ImageView p2) {}
    public void bindFacePileWithDrawable(android.widget.ImageView p0, android.widget.ImageView p1, android.widget.ImageView p2, com.android.internal.widget.ConversationAvatarData.GroupConversationAvatarData p3) {}
    public java.lang.CharSequence getConversationTitle() { return null; }
    public android.view.ViewGroup getImageMessageContainer() { return null; }
    public java.util.ArrayList<com.android.internal.widget.MessagingGroup> getMessagingGroups() { return null; }
    public com.android.internal.widget.MessagingLinearLayout getMessagingLinearLayout() { return null; }
    public boolean isImportantConversation() { return false; }
    public boolean isOneToOne() { return false; }
    protected void onFinishInflate() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    @android.view.RemotableViewMethod
    public void setAvatarReplacement(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setConversationTitleAsync")
    public void setConversationTitle(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable setConversationTitleAsync(java.lang.CharSequence p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setDataAsync")
    public void setData(android.os.Bundle p0) {}
    public java.lang.Runnable setDataAsync(android.os.Bundle p0) { return null; }
    public void setImageResolver(com.android.internal.widget.ImageResolver p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setIsCollapsedAsync")
    public void setIsCollapsed(boolean p0) {}
    public java.lang.Runnable setIsCollapsedAsync(boolean p0) { return null; }
    @android.view.RemotableViewMethod
    public void setIsImportantConversation(boolean p0) {}
    public void setIsImportantConversation(boolean p0, boolean p1) {}
    @android.view.RemotableViewMethod(asyncImpl="setIsOneToOneAsync")
    public void setIsOneToOne(boolean p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable setIsOneToOneAsync(boolean p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setLargeIconAsync")
    public void setLargeIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable setLargeIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setLayoutColorAsync")
    public void setLayoutColor(int p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable setLayoutColorAsync(int p0) { return null; }
    @android.view.RemotableViewMethod
    public void setMessageTextColor(int p0) {}
    public void setMessagingClippingDisabled(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setNameReplacement(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public void setNotificationBackgroundColor(int p0) {}
    public void setPrecomputedTextEnabled(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setSenderTextColor(int p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setShortcutIconAsync")
    public void setShortcutIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable setShortcutIconAsync(android.graphics.drawable.Icon p0) { return null; }
    public void setUnreadCount(int p0) {}
    public void showHistoricMessages(boolean p0) {}
}
