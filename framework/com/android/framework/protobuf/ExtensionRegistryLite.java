package com.android.framework.protobuf;

public class ExtensionRegistryLite {
    static final com.android.framework.protobuf.ExtensionRegistryLite EMPTY_REGISTRY_LITE = null;
    static final java.lang.String EXTENSION_CLASS_NAME = "com.android.framework.protobuf.Extension";
    private static volatile boolean eagerlyParseMessageSets;
    private static volatile com.android.framework.protobuf.ExtensionRegistryLite emptyRegistry;
    private final java.util.Map<com.android.framework.protobuf.ExtensionRegistryLite.ObjectIntPair, com.android.framework.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber = null;
    ExtensionRegistryLite() {}
    ExtensionRegistryLite(com.android.framework.protobuf.ExtensionRegistryLite p0) {}
    ExtensionRegistryLite(boolean p0) {}
    public static com.android.framework.protobuf.ExtensionRegistryLite getEmptyRegistry() { return null; }
    public static boolean isEagerlyParseMessageSets() { return false; }
    public static com.android.framework.protobuf.ExtensionRegistryLite newInstance() { return null; }
    public static void setEagerlyParseMessageSets(boolean p0) {}
    public final void add(com.android.framework.protobuf.ExtensionLite<?, ?> p0) {}
    public final void add(com.android.framework.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> p0) {}
    public <ContainingType extends com.android.framework.protobuf.MessageLite> com.android.framework.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType p0, int p1) { return null; }
    public com.android.framework.protobuf.ExtensionRegistryLite getUnmodifiable() { return null; }

    private static class ExtensionClassHolder {
        static final java.lang.Class<?> INSTANCE = null;
        private ExtensionClassHolder() {}
        static java.lang.Class<?> resolveExtensionClass() { return null; }
    }

    private static final class ObjectIntPair {
        private final int number = 0;
        private final java.lang.Object object = null;
        ObjectIntPair(java.lang.Object p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
