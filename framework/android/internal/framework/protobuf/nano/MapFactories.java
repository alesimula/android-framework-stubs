package android.internal.framework.protobuf.nano;

public final class MapFactories {
    private static volatile android.internal.framework.protobuf.nano.MapFactories.MapFactory mapFactory;
    private MapFactories() {}
    public static android.internal.framework.protobuf.nano.MapFactories.MapFactory getMapFactory() { return null; }
    static void setMapFactory(android.internal.framework.protobuf.nano.MapFactories.MapFactory p0) {}

    private static class DefaultMapFactory implements android.internal.framework.protobuf.nano.MapFactories.MapFactory {
        private DefaultMapFactory() {}
        public <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> forMap(java.util.Map<K, V> p0) { return null; }
    }

    public static interface MapFactory {
        public <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> forMap(java.util.Map<K, V> p0);
    }
}
