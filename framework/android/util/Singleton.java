package android.util;

public abstract class Singleton<T extends java.lang.Object> {
    private volatile T mInstance;
    public Singleton() {}
    private T maybeCreate() { return null; }
    protected abstract T create();
    public final T get() { return null; }
}
