package com.android.internal.app;

public class BilingualSuggestedLocaleAdapter extends com.android.internal.app.SuggestedLocaleAdapter {
    private final java.util.Locale mSecondaryLocale = null;
    private final int mSecondaryLocaleTextDir = 0;
    private com.android.internal.app.LocaleStore.LocaleInfo mSelectedLocaleInfo;
    private final boolean mShowSelection = false;
    public BilingualSuggestedLocaleAdapter(java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> p0, boolean p1, java.util.Locale p2) { super((java.util.Set)null, false); }
    public BilingualSuggestedLocaleAdapter(java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> p0, boolean p1, java.util.Locale p2, boolean p3) { super((java.util.Set)null, false); }
    private boolean isSelectedLocaleInfo(com.android.internal.app.LocaleStore.LocaleInfo p0) { return false; }
    private void setHeaderText(android.widget.TextView p0, int p1, int p2) {}
    private void setItemState(boolean p0, android.view.View p1) {}
    private void setLocaleToListItem(android.view.View p0, com.android.internal.app.LocaleStore.LocaleInfo p1) {}
    public com.android.internal.app.LocaleStore.LocaleInfo getSelectedLocaleInfo() { return null; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public void setSelectedLocaleInfo(com.android.internal.app.LocaleStore.LocaleInfo p0) {}
}
