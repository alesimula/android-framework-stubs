package com.android.internal.widget;

public interface IMessagingLayout {
    public android.content.Context getContext();
    public java.util.ArrayList<com.android.internal.widget.MessagingGroup> getMessagingGroups();
    public com.android.internal.widget.MessagingLinearLayout getMessagingLinearLayout();
    public void setMessagingClippingDisabled(boolean p0);
}
