package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
interface ListFieldSchema {
    public void makeImmutableListAt(java.lang.Object p0, long p1);
    public <L extends java.lang.Object> void mergeListsAt(java.lang.Object p0, java.lang.Object p1, long p2);
    public <L extends java.lang.Object> java.util.List<L> mutableListAt(java.lang.Object p0, long p1);
}
