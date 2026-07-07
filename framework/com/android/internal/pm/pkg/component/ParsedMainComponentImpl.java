package com.android.internal.pm.pkg.component;

public class ParsedMainComponentImpl extends com.android.internal.pm.pkg.component.ParsedComponentImpl implements com.android.internal.pm.pkg.component.ParsedMainComponent, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedMainComponentImpl> CREATOR = null;
    public static final int INTENT_MATCHING_FLAGS_ALLOW_NULL_ACTION = 4;
    public static final int INTENT_MATCHING_FLAGS_ENFORCE_INTENT_FILTER = 2;
    public static final int INTENT_MATCHING_FLAGS_NONE = 1;
    private java.lang.String[] attributionTags;
    private boolean directBootAware;
    private boolean enabled;
    private boolean exported;
    private int mIntentMatchingFlags;
    private int order;
    private java.lang.String processName;
    private java.lang.String splitName;
    public ParsedMainComponentImpl() { super(); }
    protected ParsedMainComponentImpl(android.os.Parcel p0) { super(); }
    public ParsedMainComponentImpl(com.android.internal.pm.pkg.component.ParsedMainComponent p0) { super(); }
    public ParsedMainComponentImpl(java.lang.String p0, boolean p1, boolean p2, boolean p3, int p4, java.lang.String p5, java.lang.String[] p6, int p7) { super(); }
    @java.lang.Deprecated
    private void __metadata() {}
    public static java.lang.String intentMatchingFlagsToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String[] getAttributionTags() { return null; }
    public java.lang.String getClassName() { return null; }
    public int getIntentMatchingFlags() { return 0; }
    public int getOrder() { return 0; }
    public java.lang.String getProcessName() { return null; }
    public java.lang.String getSplitName() { return null; }
    public boolean isDirectBootAware() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isExported() { return false; }
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setAttributionTags(java.lang.String... p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setDirectBootAware(boolean p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setEnabled(boolean p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setExported(boolean p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedMainComponent setIntentMatchingFlags(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setOrder(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setProcessName(java.lang.String p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setSplitName(java.lang.String p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IntentMatchingFlags {
    }
}
