package android.os;

public class RegistrantList {
    java.util.ArrayList registrants;
    public RegistrantList() {}
    private void internalNotifyRegistrants(java.lang.Object p0, java.lang.Throwable p1) {}
    public void add(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void add(android.os.Registrant p0) {}
    public void addUnique(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public java.lang.Object get(int p0) { return null; }
    public void notifyException(java.lang.Throwable p0) {}
    public void notifyRegistrants() {}
    public void notifyRegistrants(android.os.AsyncResult p0) {}
    public void notifyResult(java.lang.Object p0) {}
    public void remove(android.os.Handler p0) {}
    public void removeAll() {}
    public void removeCleared() {}
    public int size() { return 0; }
}
