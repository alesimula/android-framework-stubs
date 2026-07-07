package android.os;

public class Registrant {
    java.lang.ref.WeakReference refH;
    java.lang.Object userObj;
    int what;
    public Registrant(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void clear() {}
    public android.os.Handler getHandler() { return null; }
    void internalNotifyRegistrant(java.lang.Object p0, java.lang.Throwable p1) {}
    public android.os.Message messageForRegistrant() { return null; }
    public void notifyException(java.lang.Throwable p0) {}
    public void notifyRegistrant() {}
    public void notifyRegistrant(android.os.AsyncResult p0) {}
    public void notifyResult(java.lang.Object p0) {}
}
