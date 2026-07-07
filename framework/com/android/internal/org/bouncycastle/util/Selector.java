package com.android.internal.org.bouncycastle.util;

public interface Selector<T extends java.lang.Object> extends java.lang.Cloneable {
    public java.lang.Object clone();
    public boolean match(T p0);
}
