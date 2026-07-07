package android.hardware.camera2.utils;

public abstract class TypeReference<T extends java.lang.Object> {
    private final int mHash = 0;
    private final java.lang.reflect.Type mType = null;
    protected TypeReference() {}
    private TypeReference(java.lang.reflect.Type p0) {}
    public static boolean containsTypeVariable(java.lang.reflect.Type p0) { return false; }
    private static boolean containsTypeVariable(java.lang.reflect.Type[] p0) { return false; }
    public static <T extends java.lang.Object> android.hardware.camera2.utils.TypeReference<T> createSpecializedTypeReference(java.lang.Class<T> p0) { return null; }
    public static android.hardware.camera2.utils.TypeReference<?> createSpecializedTypeReference(java.lang.reflect.Type p0) { return null; }
    private static final java.lang.Class<?> getArrayClass(java.lang.Class<?> p0) { return null; }
    private static java.lang.reflect.Type getComponentType(java.lang.reflect.Type p0) { return null; }
    private static final java.lang.Class<?> getRawType(java.lang.reflect.Type p0) { return null; }
    private static final java.lang.Class<?> getRawType(java.lang.reflect.Type[] p0) { return null; }
    private static void toString(java.lang.reflect.Type p0, java.lang.StringBuilder p1) {}
    private static void toString(java.lang.reflect.Type[] p0, java.lang.StringBuilder p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.camera2.utils.TypeReference<?> getComponentType() { return null; }
    public final java.lang.Class<? super T> getRawType() { return null; }
    public java.lang.reflect.Type getType() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    private static class SpecializedBaseTypeReference extends android.hardware.camera2.utils.TypeReference {
        public SpecializedBaseTypeReference(java.lang.reflect.Type p0) { super(); }
    }

    private static class SpecializedTypeReference<T extends java.lang.Object> extends android.hardware.camera2.utils.TypeReference<T> {
        public SpecializedTypeReference(java.lang.Class<T> p0) { super(); }
    }
}
