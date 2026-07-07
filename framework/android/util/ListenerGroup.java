package android.util;

public class ListenerGroup<T extends java.lang.Object> {
    private final android.os.Handler mHandler = null;
    private T mLastValue;
    private final android.util.ArrayMap<java.util.function.Consumer<T>, java.util.concurrent.Executor> mListeners = null;
    public ListenerGroup(T p0, android.os.Handler p1) {}
    public void accept(T p0) {}
    public void addListener(java.util.concurrent.Executor p0, java.util.function.Consumer<T> p1) {}
    public void removeListener(java.util.function.Consumer<T> p0) {}
}
