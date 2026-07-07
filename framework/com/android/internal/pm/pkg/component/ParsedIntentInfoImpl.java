package com.android.internal.pm.pkg.component;

public class ParsedIntentInfoImpl implements com.android.internal.pm.pkg.component.ParsedIntentInfo, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedIntentInfoImpl> CREATOR = null;
    private boolean mHasDefault;
    private int mIcon;
    private android.content.IntentFilter mIntentFilter;
    private int mLabelRes;
    private java.lang.CharSequence mNonLocalizedLabel;
    public ParsedIntentInfoImpl() {}
    protected ParsedIntentInfoImpl(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public int getIcon() { return 0; }
    public android.content.IntentFilter getIntentFilter() { return null; }
    public int getLabelRes() { return 0; }
    public java.lang.CharSequence getNonLocalizedLabel() { return null; }
    public boolean isHasDefault() { return false; }
    public com.android.internal.pm.pkg.component.ParsedIntentInfoImpl setHasDefault(boolean p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedIntentInfoImpl setIcon(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedIntentInfoImpl setLabelRes(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedIntentInfoImpl setNonLocalizedLabel(java.lang.CharSequence p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
