package com.android.internal.widget;

public class MessagingPool<T extends android.view.View> implements android.util.Pools.Pool<T> {
    private static final boolean ENABLED = false;
    private static final java.lang.String TAG = "MessagingPool";
    private android.util.Pools.SynchronizedPool<T> mCurrentPool;
    private final int mMaxPoolSize = 0;
    public MessagingPool(int p0) {}
    public T acquire() { return null; }
    public void clear() {}
    public boolean release(T p0) { return false; }
}
