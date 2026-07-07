package android.telephony;

@android.annotation.SystemApi
public interface TransportSelectorCallback {
    public void onCreated(android.telephony.DomainSelector p0);
    public void onSelectionTerminated(int p0);
    public void onWlanSelected(boolean p0);
    public void onWwanSelected(java.util.function.Consumer<android.telephony.WwanSelectorCallback> p0);
}
