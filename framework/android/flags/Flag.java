package android.flags;

public interface Flag<T extends java.lang.Object> {
    public android.flags.Flag<T> defineMetaData(java.lang.String p0, java.lang.String p1, java.lang.String p2);
    default public java.lang.String getCategoryName() { return null; }
    public T getDefault();
    default public java.lang.String getDescription() { return null; }
    default public java.lang.String getLabel() { return null; }
    public java.lang.String getName();
    public java.lang.String getNamespace();
    default public boolean isDynamic() { return false; }
}
