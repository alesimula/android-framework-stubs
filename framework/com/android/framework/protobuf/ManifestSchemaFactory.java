package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
final class ManifestSchemaFactory implements com.android.framework.protobuf.SchemaFactory {
    private static final com.android.framework.protobuf.MessageInfoFactory EMPTY_FACTORY = null;
    private final com.android.framework.protobuf.MessageInfoFactory messageInfoFactory = null;
    public ManifestSchemaFactory() {}
    private ManifestSchemaFactory(com.android.framework.protobuf.MessageInfoFactory p0) {}
    private static boolean allowExtensions(com.android.framework.protobuf.MessageInfo p0) { return false; }
    private static com.android.framework.protobuf.MessageInfoFactory getDefaultMessageInfoFactory() { return null; }
    private static com.android.framework.protobuf.MessageInfoFactory getDescriptorMessageInfoFactory() { return null; }
    private static <T extends java.lang.Object> com.android.framework.protobuf.Schema<T> newSchema(java.lang.Class<T> p0, com.android.framework.protobuf.MessageInfo p1) { return null; }
    private static boolean useLiteRuntime(java.lang.Class<?> p0) { return false; }
    public <T extends java.lang.Object> com.android.framework.protobuf.Schema<T> createSchema(java.lang.Class<T> p0) { return null; }

    private static class CompositeMessageInfoFactory implements com.android.framework.protobuf.MessageInfoFactory {
        private com.android.framework.protobuf.MessageInfoFactory[] factories;
        CompositeMessageInfoFactory(com.android.framework.protobuf.MessageInfoFactory... p0) {}
        public boolean isSupported(java.lang.Class<?> p0) { return false; }
        public com.android.framework.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> p0) { return null; }
    }
}
