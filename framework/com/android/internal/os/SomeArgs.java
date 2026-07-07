package com.android.internal.os;

public final class SomeArgs {
    private static final int MAX_POOL_SIZE = 10;
    static final int WAIT_FINISHED = 2;
    static final int WAIT_NONE = 0;
    static final int WAIT_WAITING = 1;
    private static com.android.internal.os.SomeArgs sPool;
    private static java.lang.Object sPoolLock;
    private static int sPoolSize;
    public java.lang.Object arg1;
    public java.lang.Object arg2;
    public java.lang.Object arg3;
    public java.lang.Object arg4;
    public java.lang.Object arg5;
    public java.lang.Object arg6;
    public java.lang.Object arg7;
    public int argi1;
    public int argi2;
    public int argi3;
    public int argi4;
    public int argi5;
    public int argi6;
    public long argl1;
    public long argl2;
    private boolean mInPool;
    private com.android.internal.os.SomeArgs mNext;
    int mWaitState;
    private SomeArgs() {}
    private void clear() {}
    public static com.android.internal.os.SomeArgs obtain() { return null; }
    public void complete() {}
    public void recycle() {}
}
