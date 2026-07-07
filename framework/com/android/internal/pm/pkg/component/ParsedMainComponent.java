package com.android.internal.pm.pkg.component;

public interface ParsedMainComponent extends com.android.internal.pm.pkg.component.ParsedComponent {
    public java.lang.String[] getAttributionTags();
    public java.lang.String getClassName();
    public int getIntentMatchingFlags();
    public int getOrder();
    public java.lang.String getProcessName();
    public java.lang.String getSplitName();
    public boolean isDirectBootAware();
    public boolean isEnabled();
    public boolean isExported();
}
