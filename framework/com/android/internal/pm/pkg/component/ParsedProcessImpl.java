package com.android.internal.pm.pkg.component;

public class ParsedProcessImpl implements com.android.internal.pm.pkg.component.ParsedProcess, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedProcessImpl> CREATOR = null;
    static com.android.internal.util.Parcelling<java.util.Set<java.lang.String>> sParcellingForDeniedPermissions;
    private android.util.ArrayMap<java.lang.String, java.lang.String> appClassNamesByPackage;
    private java.util.Set<java.lang.String> deniedPermissions;
    private int gwpAsanMode;
    private java.util.List<android.content.pm.MemoryBudget> memoryBudgets;
    private int memtagMode;
    private java.lang.String name;
    private int nativeHeapZeroInitialized;
    private boolean singleUser;
    private boolean useEmbeddedDex;
    public ParsedProcessImpl() {}
    protected ParsedProcessImpl(android.os.Parcel p0) {}
    public ParsedProcessImpl(com.android.internal.pm.pkg.component.ParsedProcess p0) {}
    public ParsedProcessImpl(java.lang.String p0, android.util.ArrayMap<java.lang.String, java.lang.String> p1, java.util.Set<java.lang.String> p2, int p3, int p4, int p5, boolean p6, java.util.List<android.content.pm.MemoryBudget> p7, boolean p8) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public void addMemoryBudget(android.content.pm.MemoryBudget p0) {}
    public void addStateFrom(com.android.internal.pm.pkg.component.ParsedProcess p0) {}
    public int describeContents() { return 0; }
    public android.util.ArrayMap<java.lang.String, java.lang.String> getAppClassNamesByPackage() { return null; }
    public java.util.Set<java.lang.String> getDeniedPermissions() { return null; }
    public int getGwpAsanMode() { return 0; }
    public java.util.List<android.content.pm.MemoryBudget> getMemoryBudgets() { return null; }
    public int getMemtagMode() { return 0; }
    public java.lang.String getName() { return null; }
    public int getNativeHeapZeroInitialized() { return 0; }
    public boolean isSingleUser() { return false; }
    public boolean isUseEmbeddedDex() { return false; }
    public void putAppClassNameForPackage(java.lang.String p0, java.lang.String p1) {}
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setAppClassNamesByPackage(android.util.ArrayMap<java.lang.String, java.lang.String> p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setDeniedPermissions(java.util.Set<java.lang.String> p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setGwpAsanMode(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setMemoryBudgets(java.util.List<android.content.pm.MemoryBudget> p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setMemtagMode(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setName(java.lang.String p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setNativeHeapZeroInitialized(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setSingleUser(boolean p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setUseEmbeddedDex(boolean p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
