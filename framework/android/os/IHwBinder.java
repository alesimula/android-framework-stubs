package android.os;

@android.annotation.SystemApi
public interface IHwBinder {
    public boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1);
    public android.os.IHwInterface queryLocalInterface(java.lang.String p0);
    public void transact(int p0, android.os.HwParcel p1, android.os.HwParcel p2, int p3) throws android.os.RemoteException;
    public boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0);

    public static interface DeathRecipient {
        public void serviceDied(long p0);
    }
}
