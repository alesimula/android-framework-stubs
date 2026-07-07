package android.os;

public class SynchronousResultReceiver extends android.os.ResultReceiver {
    private final java.util.concurrent.CompletableFuture<android.os.SynchronousResultReceiver.Result> mFuture = null;
    private final java.lang.String mName = null;
    public SynchronousResultReceiver() { super((android.os.Handler)null); }
    public SynchronousResultReceiver(java.lang.String p0) { super((android.os.Handler)null); }
    public android.os.SynchronousResultReceiver.Result awaitResult(long p0) throws java.util.concurrent.TimeoutException { return null; }
    public java.lang.String getName() { return null; }
    protected final void onReceiveResult(int p0, android.os.Bundle p1) {}

    public static class Result {
        public android.os.Bundle bundle;
        public int resultCode;
        public Result(int p0, android.os.Bundle p1) {}
    }
}
