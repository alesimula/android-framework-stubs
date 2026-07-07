package android.telephony;

@android.annotation.SystemApi
public interface DomainSelector {
    public void finishSelection();
    public void reselectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0);
}
