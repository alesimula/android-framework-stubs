package android.net;

public abstract class NetworkSpecifier {
    public NetworkSpecifier() {}
    @android.annotation.SystemApi
    public boolean canBeSatisfiedBy(android.net.NetworkSpecifier p0) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public long getApplicableRedactions() { return 0L; }
    @android.annotation.SystemApi
    public android.net.NetworkSpecifier redact() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public android.net.NetworkSpecifier redact(long p0) { return null; }
}
