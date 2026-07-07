package android.webkit;

public abstract class ServiceWorkerWebSettings {
    public ServiceWorkerWebSettings() {}
    public abstract boolean getAllowContentAccess();
    public abstract boolean getAllowFileAccess();
    public abstract boolean getBlockNetworkLoads();
    public abstract int getCacheMode();
    public abstract void setAllowContentAccess(boolean p0);
    public abstract void setAllowFileAccess(boolean p0);
    public abstract void setBlockNetworkLoads(boolean p0);
    public abstract void setCacheMode(int p0);
}
