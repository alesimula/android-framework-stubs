package com.android.framework.protobuf;

public abstract class ExtensionLite<ContainingType extends com.android.framework.protobuf.MessageLite, Type extends java.lang.Object> {
    public ExtensionLite() {}
    public abstract Type getDefaultValue();
    public abstract com.android.framework.protobuf.WireFormat.FieldType getLiteType();
    public abstract com.android.framework.protobuf.MessageLite getMessageDefaultInstance();
    public abstract int getNumber();
    boolean isLite() { return false; }
    public abstract boolean isRepeated();
}
