package com.android.framework.protobuf;

final class FieldSet<T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> {
    private static final com.android.framework.protobuf.FieldSet<?> DEFAULT_INSTANCE = null;
    private final com.android.framework.protobuf.SmallSortedMap<T, java.lang.Object> fields = null;
    private boolean hasLazyField;
    private boolean isImmutable;
    private FieldSet() {}
    private FieldSet(com.android.framework.protobuf.SmallSortedMap<T, java.lang.Object> p0) {}
    private FieldSet(boolean p0) {}
    private static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> com.android.framework.protobuf.SmallSortedMap<T, java.lang.Object> cloneAllFieldsMap(com.android.framework.protobuf.SmallSortedMap<T, java.lang.Object> p0, boolean p1, boolean p2) { return null; }
    private static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> void cloneFieldEntry(java.util.Map<T, java.lang.Object> p0, java.util.Map.Entry<T, java.lang.Object> p1, boolean p2, boolean p3) {}
    private static java.lang.Object cloneIfMutable(java.lang.Object p0) { return null; }
    static int computeElementSize(com.android.framework.protobuf.WireFormat.FieldType p0, int p1, java.lang.Object p2) { return 0; }
    static int computeElementSizeNoTag(com.android.framework.protobuf.WireFormat.FieldType p0, java.lang.Object p1) { return 0; }
    public static int computeFieldSize(com.android.framework.protobuf.FieldSet.FieldDescriptorLite<?> p0, java.lang.Object p1) { return 0; }
    public static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> com.android.framework.protobuf.FieldSet<T> emptySet() { return null; }
    private int getMessageSetSerializedSize(java.util.Map.Entry<T, java.lang.Object> p0) { return 0; }
    static int getWireFormatForFieldType(com.android.framework.protobuf.WireFormat.FieldType p0, boolean p1) { return 0; }
    private static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> boolean isInitialized(java.util.Map.Entry<T, java.lang.Object> p0) { return false; }
    private static boolean isMessageFieldValueInitialized(java.lang.Object p0) { return false; }
    private static boolean isValidType(com.android.framework.protobuf.WireFormat.FieldType p0, java.lang.Object p1) { return false; }
    private void mergeFromField(java.util.Map.Entry<T, java.lang.Object> p0) {}
    public static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> com.android.framework.protobuf.FieldSet.Builder<T> newBuilder() { return null; }
    public static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> com.android.framework.protobuf.FieldSet<T> newFieldSet() { return null; }
    public static java.lang.Object readPrimitiveField(com.android.framework.protobuf.CodedInputStream p0, com.android.framework.protobuf.WireFormat.FieldType p1, boolean p2) throws java.io.IOException { return null; }
    private void verifyType(T p0, java.lang.Object p1) {}
    static void writeElement(com.android.framework.protobuf.CodedOutputStream p0, com.android.framework.protobuf.WireFormat.FieldType p1, int p2, java.lang.Object p3) throws java.io.IOException {}
    static void writeElementNoTag(com.android.framework.protobuf.CodedOutputStream p0, com.android.framework.protobuf.WireFormat.FieldType p1, java.lang.Object p2) throws java.io.IOException {}
    public static void writeField(com.android.framework.protobuf.FieldSet.FieldDescriptorLite<?> p0, java.lang.Object p1, com.android.framework.protobuf.CodedOutputStream p2) throws java.io.IOException {}
    private void writeMessageSetTo(java.util.Map.Entry<T, java.lang.Object> p0, com.android.framework.protobuf.CodedOutputStream p1) throws java.io.IOException {}
    public void addRepeatedField(T p0, java.lang.Object p1) {}
    public void clear() {}
    public void clearField(T p0) {}
    public com.android.framework.protobuf.FieldSet<T> clone() { return null; }
    java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> descendingIterator() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Map<T, java.lang.Object> getAllFields() { return null; }
    public java.lang.Object getField(T p0) { return null; }
    public int getMessageSetSerializedSize() { return 0; }
    public java.lang.Object getRepeatedField(T p0, int p1) { return null; }
    public int getRepeatedFieldCount(T p0) { return 0; }
    public int getSerializedSize() { return 0; }
    public boolean hasField(T p0) { return false; }
    public int hashCode() { return 0; }
    boolean isEmpty() { return false; }
    public boolean isImmutable() { return false; }
    public boolean isInitialized() { return false; }
    public java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> iterator() { return null; }
    boolean lazyFieldCorrupted(T p0) { return false; }
    public void makeImmutable() {}
    public void mergeFrom(com.android.framework.protobuf.FieldSet<T> p0) {}
    public void setField(T p0, java.lang.Object p1) {}
    public void setRepeatedField(T p0, int p1, java.lang.Object p2) {}
    public void writeMessageSetTo(com.android.framework.protobuf.CodedOutputStream p0) throws java.io.IOException {}
    public void writeTo(com.android.framework.protobuf.CodedOutputStream p0) throws java.io.IOException {}

    static final class Builder<T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> {
        private com.android.framework.protobuf.SmallSortedMap<T, java.lang.Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;
        private Builder() {}
        private Builder(com.android.framework.protobuf.SmallSortedMap<T, java.lang.Object> p0) {}
        private com.android.framework.protobuf.FieldSet<T> buildImpl(boolean p0) { return null; }
        private void ensureIsMutable() {}
        public static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> com.android.framework.protobuf.FieldSet.Builder<T> fromFieldSet(com.android.framework.protobuf.FieldSet<T> p0) { return null; }
        private void mergeFromField(java.util.Map.Entry<T, java.lang.Object> p0) {}
        private static java.lang.Object replaceBuilder(java.lang.Object p0, boolean p1) { return null; }
        private static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> java.lang.Object replaceBuilders(T p0, java.lang.Object p1, boolean p2) { return null; }
        private static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(com.android.framework.protobuf.SmallSortedMap<T, java.lang.Object> p0, boolean p1) {}
        private static <T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(java.util.Map.Entry<T, java.lang.Object> p0, boolean p1) {}
        private void verifyType(T p0, java.lang.Object p1) {}
        public void addRepeatedField(T p0, java.lang.Object p1) {}
        public com.android.framework.protobuf.FieldSet<T> build() { return null; }
        public com.android.framework.protobuf.FieldSet<T> buildPartial() { return null; }
        public void clearField(T p0) {}
        public java.util.Map<T, java.lang.Object> getAllFields() { return null; }
        public java.lang.Object getField(T p0) { return null; }
        java.lang.Object getFieldAllowBuilders(T p0) { return null; }
        public java.lang.Object getRepeatedField(T p0, int p1) { return null; }
        java.lang.Object getRepeatedFieldAllowBuilders(T p0, int p1) { return null; }
        public int getRepeatedFieldCount(T p0) { return 0; }
        public boolean hasField(T p0) { return false; }
        public boolean isInitialized() { return false; }
        public void mergeFrom(com.android.framework.protobuf.FieldSet<T> p0) {}
        public void setField(T p0, java.lang.Object p1) {}
        public void setRepeatedField(T p0, int p1, java.lang.Object p2) {}
    }

    public static interface FieldDescriptorLite<T extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<T>> extends java.lang.Comparable<T> {
        public com.android.framework.protobuf.Internal.EnumLiteMap<?> getEnumType();
        public com.android.framework.protobuf.WireFormat.JavaType getLiteJavaType();
        public com.android.framework.protobuf.WireFormat.FieldType getLiteType();
        public int getNumber();
        public void internalMergeFrom(java.lang.Object p0, java.lang.Object p1);
        public boolean internalMessageIsImmutable(java.lang.Object p0);
        public boolean isPacked();
        public boolean isRepeated();
    }
}
