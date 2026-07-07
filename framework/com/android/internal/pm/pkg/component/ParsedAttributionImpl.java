package com.android.internal.pm.pkg.component;

public class ParsedAttributionImpl implements com.android.internal.pm.pkg.component.ParsedAttribution, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedAttributionImpl> CREATOR = null;
    static final int MAX_NUM_ATTRIBUTIONS = 400;
    private java.util.List<java.lang.String> inheritFrom;
    private int label;
    private java.lang.String tag;
    public ParsedAttributionImpl() {}
    protected ParsedAttributionImpl(android.os.Parcel p0) {}
    public ParsedAttributionImpl(java.lang.String p0, int p1, java.util.List<java.lang.String> p2) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public java.util.List<java.lang.String> getInheritFrom() { return null; }
    public int getLabel() { return 0; }
    public java.lang.String getTag() { return null; }
    public com.android.internal.pm.pkg.component.ParsedAttributionImpl setInheritFrom(java.util.List<java.lang.String> p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedAttributionImpl setLabel(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedAttributionImpl setTag(java.lang.String p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
