package android.content.theming;

public final class ThemeStyle {
    public static final int CLOCK = 8;
    public static final int CLOCK_VIBRANT = 9;
    public static final int CMF = 10;
    public static final int CONTENT = 6;
    public static final int EXPRESSIVE = 3;
    public static final int FRUIT_SALAD = 5;
    public static final int MONOCHROMATIC = 7;
    public static final int RAINBOW = 4;
    public static final int SPRITZ = 0;
    public static final int TONAL_SPOT = 1;
    public static final int VIBRANT = 2;
    private ThemeStyle() {}
    public static int getRequiredSeedCount(int p0) { return 0; }
    public static java.lang.String name(int p0) { return null; }
    public static java.lang.String toString(int p0) { return null; }
    public static int valueOf(java.lang.String p0) { return 0; }
    public static int[] values() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.FIELD})
    public static @interface Type {
    }
}
