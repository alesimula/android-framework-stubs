package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class MessagingGroup extends com.android.internal.widget.NotificationOptimizedLinearLayout implements com.android.internal.widget.MessagingLinearLayout.MessagingChild {
    public static final int IMAGE_DISPLAY_LOCATION_AT_END = 1;
    public static final int IMAGE_DISPLAY_LOCATION_EXTERNAL = 2;
    public static final int IMAGE_DISPLAY_LOCATION_INLINE = 0;
    private static final com.android.internal.widget.MessagingPool<com.android.internal.widget.MessagingGroup> sInstancePool = null;
    private final java.util.ArrayList<com.android.internal.widget.MessagingMessage> mAddedMessages = null;
    private android.graphics.drawable.Icon mAvatarIcon;
    private java.lang.CharSequence mAvatarName;
    private java.lang.String mAvatarSymbol;
    private android.widget.ImageView mAvatarView;
    private boolean mCanHideSenderIfFirst;
    private boolean mClippingDisabled;
    private android.widget.LinearLayout mContentContainer;
    private final android.graphics.Point mDisplaySize = null;
    private boolean mFirstLayout;
    private android.view.ViewGroup mImageContainer;
    private int mImageDisplayLocation;
    private boolean mIsCollapsed;
    private boolean mIsFirstGroupInLayout;
    private boolean mIsHidingAnimated;
    private boolean mIsInConversation;
    private com.android.internal.widget.MessagingImageMessage mIsolatedMessage;
    private int mLayoutColor;
    private com.android.internal.widget.MessagingLinearLayout mMessageContainer;
    private java.util.List<com.android.internal.widget.MessagingMessage> mMessages;
    private android.view.ViewGroup mMessagingIconContainer;
    private boolean mNeedsGeneratedAvatar;
    private int mNotificationTextMarginTop;
    private int mRequestedMaxDisplayedLines;
    private android.app.Person mSender;
    private java.lang.CharSequence mSenderName;
    private int mSenderTextPaddingSingleLine;
    com.android.internal.widget.ImageFloatingTextView mSenderView;
    private android.widget.ProgressBar mSendingSpinner;
    private android.view.View mSendingSpinnerContainer;
    private int mSendingTextColor;
    private boolean mShowingAvatar;
    private boolean mSingleLine;
    private int mTextColor;
    public MessagingGroup(android.content.Context p0) { super((android.content.Context)null); }
    public MessagingGroup(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MessagingGroup(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MessagingGroup(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private int calculateSendingTextColor() { return 0; }
    static com.android.internal.widget.MessagingGroup createGroup(com.android.internal.widget.MessagingLinearLayout p0) { return null; }
    public static void dropCache() {}
    private int getDistanceFromParent(android.view.View p0, android.view.ViewGroup p1) { return 0; }
    private static int getMessagingGroupLayoutResource() { return 0; }
    private void performRemoveAnimation(android.view.View p0, int p1, java.lang.Runnable p2) {}
    private boolean removeFromParentIfDifferent(com.android.internal.widget.MessagingMessage p0, android.view.ViewGroup p1) { return false; }
    private void setIsHidingAnimated(boolean p0) {}
    private void updateIconVisibility() {}
    private void updateImageContainerVisibility() {}
    private void updateMaxDisplayedLines() {}
    private void updateMessageColor() {}
    private void updateSenderVisibility() {}
    public int calculateGroupCompatibility(com.android.internal.widget.MessagingGroup p0) { return 0; }
    public android.view.View getAvatar() { return null; }
    public android.graphics.drawable.Icon getAvatarIcon() { return null; }
    public android.graphics.drawable.Icon getAvatarSymbolIfMatching(java.lang.CharSequence p0, java.lang.String p1, int p2) { return null; }
    public int getConsumedLines() { return 0; }
    public com.android.internal.widget.MessagingImageMessage getIsolatedMessage() { return null; }
    public int getMeasuredType() { return 0; }
    public com.android.internal.widget.MessagingLinearLayout getMessageContainer() { return null; }
    public java.util.List<com.android.internal.widget.MessagingMessage> getMessages() { return null; }
    public android.app.Person getSender() { return null; }
    public java.lang.CharSequence getSenderName() { return null; }
    public android.widget.TextView getSenderView() { return null; }
    public boolean hasDifferentHeightWhenFirst() { return false; }
    public boolean hasOverlappingRendering() { return false; }
    public boolean hasSenderNameHidden() { return false; }
    public void hideAnimated() {}
    public boolean isHidingAnimated() { return false; }
    public boolean isSingleLine() { return false; }
    public boolean needsGeneratedAvatar() { return false; }
    protected void onFinishInflate() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void performRemoveAnimation(android.view.View p0, java.lang.Runnable p1) {}
    public void recycle() {}
    public void removeGroupAnimated(java.lang.Runnable p0) {}
    public void removeMessage(com.android.internal.widget.MessagingMessage p0, java.util.ArrayList<com.android.internal.widget.MessagingLinearLayout.MessagingChild> p1) {}
    public void setAvatar(android.graphics.drawable.Icon p0) {}
    public void setCanHideSenderIfFirst(boolean p0) {}
    public void setClippingDisabled(boolean p0) {}
    public void setCreatedAvatar(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, java.lang.String p2, int p3) {}
    public void setImageDisplayLocation(int p0) {}
    public void setIsCollapsed(boolean p0) {}
    public void setIsFirstInLayout(boolean p0) {}
    public void setIsInConversation(boolean p0) {}
    public void setLayoutColor(int p0) {}
    public void setMaxDisplayedLines(int p0) {}
    public void setMessages(java.util.List<com.android.internal.widget.MessagingMessage> p0, boolean p1) {}
    public void setSender(android.app.Person p0, java.lang.CharSequence p1) {}
    public void setSending(boolean p0) {}
    public void setShowingAvatar(boolean p0) {}
    public void setSingleLine(boolean p0) {}
    public void setTextColors(int p0, int p1) {}
    public void updateClipRect() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ImageDisplayLocation {
    }
}
