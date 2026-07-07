package android.content.om;

public interface CriticalOverlayInfo {
    public android.content.om.OverlayIdentifier getOverlayIdentifier();
    public java.lang.String getOverlayName();
    public java.lang.String getPackageName();
    public java.lang.String getTargetOverlayableName();
    public java.lang.String getTargetPackageName();
    public boolean isFabricated();
}
