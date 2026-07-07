package com.android.internal.pm.pkg.component;

public interface ParsedAttribution {
    public static final int MAX_ATTRIBUTION_TAG_LEN = 50;
    public java.util.List<java.lang.String> getInheritFrom();
    public int getLabel();
    public java.lang.String getTag();
}
