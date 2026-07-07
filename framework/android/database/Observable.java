package android.database;

public abstract class Observable<T extends java.lang.Object> {
    protected final java.util.ArrayList<T> mObservers = null;
    public Observable() {}
    public void registerObserver(T p0) {}
    public void unregisterAll() {}
    public void unregisterObserver(T p0) {}
}
