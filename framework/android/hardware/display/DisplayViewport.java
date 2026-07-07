package android.hardware.display;

public final class DisplayViewport {
    public static final int VIEWPORT_EXTERNAL = 2;
    public static final int VIEWPORT_INTERNAL = 1;
    public static final int VIEWPORT_VIRTUAL = 3;
    public int densityDpi;
    public int deviceHeight;
    public int deviceWidth;
    public int displayId;
    public boolean isActive;
    public final android.graphics.Rect logicalFrame = null;
    public int orientation;
    public final android.graphics.Rect physicalFrame = null;
    public java.lang.Integer physicalPort;
    public int type;
    public java.lang.String uniqueId;
    public boolean valid;
    public float xDpi;
    public float yDpi;
    public DisplayViewport() {}
    public static java.lang.String typeToString(int p0) { return null; }
    public void copyFrom(android.hardware.display.DisplayViewport p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public android.hardware.display.DisplayViewport makeCopy() { return null; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ViewportType {
    }
}
