package android.telephony;

@java.lang.Deprecated
public abstract class CellLocation {
    public CellLocation() {}
    public static android.telephony.CellLocation getEmpty() { return null; }
    public static android.telephony.CellLocation newFromBundle(android.os.Bundle p0) { return null; }
    @java.lang.Deprecated
    public static void requestLocationUpdate() {}
    public abstract void fillInNotifierBundle(android.os.Bundle p0);
    public abstract boolean isEmpty();
    public abstract void setStateInvalid();
}
