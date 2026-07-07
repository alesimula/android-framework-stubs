package com.android.internal.globalactions;

public interface Action {
    public android.view.View create(android.content.Context p0, android.view.View p1, android.view.ViewGroup p2, android.view.LayoutInflater p3);
    public java.lang.CharSequence getLabelForAccessibility(android.content.Context p0);
    public boolean isEnabled();
    public void onPress();
    public boolean showBeforeProvisioning();
    public boolean showDuringKeyguard();
}
