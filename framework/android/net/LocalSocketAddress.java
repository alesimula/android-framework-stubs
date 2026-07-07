package android.net;

public class LocalSocketAddress {
    private final java.lang.String name = null;
    private final android.net.LocalSocketAddress.Namespace namespace = null;
    public LocalSocketAddress(java.lang.String p0) {}
    public LocalSocketAddress(java.lang.String p0, android.net.LocalSocketAddress.Namespace p1) {}
    public java.lang.String getName() { return null; }
    public android.net.LocalSocketAddress.Namespace getNamespace() { return null; }

    public static enum Namespace {
        ABSTRACT,
        FILESYSTEM,
        RESERVED;
        private static final android.net.LocalSocketAddress.Namespace[] $VALUES = null;
        private int id;
        private Namespace() {}
        int getId() { return 0; }
    }
}
