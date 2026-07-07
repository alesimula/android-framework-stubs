package android.hardware.input;

public final class UriCustomizationAction extends android.hardware.input.CustomizationAction {
    public static final int TYPE_OPEN_FILE = 1;
    public static final int TYPE_OPEN_FOLDER = 2;
    public static final int TYPE_OPEN_URL = 3;
    private final android.hardware.input.AidlUriAction mAidlUriAction = null;
    public UriCustomizationAction(int p0, android.net.Uri p1) { super(); }
    public UriCustomizationAction(android.hardware.input.AidlUriAction p0) { super(); }
    private void validateActionType(int p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.input.AidlUriAction getAidl() { return null; }
    public int getType() { return 0; }
    public android.net.Uri getUri() { return null; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
