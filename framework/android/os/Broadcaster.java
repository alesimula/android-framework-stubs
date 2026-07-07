package android.os;

public class Broadcaster {
    private android.os.Broadcaster.Registration mReg;
    public Broadcaster() {}
    public void broadcast(android.os.Message p0) {}
    public void cancelRequest(int p0, android.os.Handler p1, int p2) {}
    public void dumpRegistrations() {}
    public void request(int p0, android.os.Handler p1, int p2) {}

    private class Registration {
        android.os.Broadcaster.Registration next;
        android.os.Broadcaster.Registration prev;
        int senderWhat;
        int[] targetWhats;
        android.os.Handler[] targets;
        private Registration(android.os.Broadcaster p0) {}
    }
}
