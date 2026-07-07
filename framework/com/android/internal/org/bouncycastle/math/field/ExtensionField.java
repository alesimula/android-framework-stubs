package com.android.internal.org.bouncycastle.math.field;

public interface ExtensionField extends com.android.internal.org.bouncycastle.math.field.FiniteField {
    public int getDegree();
    public com.android.internal.org.bouncycastle.math.field.FiniteField getSubfield();
}
