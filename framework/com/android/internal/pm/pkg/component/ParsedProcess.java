package com.android.internal.pm.pkg.component;

public interface ParsedProcess {
    public android.util.ArrayMap<java.lang.String, java.lang.String> getAppClassNamesByPackage();
    public java.util.Set<java.lang.String> getDeniedPermissions();
    public int getGwpAsanMode();
    public java.util.List<android.content.pm.MemoryBudget> getMemoryBudgets();
    public int getMemtagMode();
    public java.lang.String getName();
    public int getNativeHeapZeroInitialized();
    public boolean isSingleUser();
    public boolean isUseEmbeddedDex();
}
