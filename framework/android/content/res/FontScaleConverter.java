package android.content.res;

public interface FontScaleConverter {
    public static android.content.res.FontScaleConverter forScale(float p0) { return null; }
    public static boolean isNonLinearFontScalingActive(float p0) { return false; }
    public float convertDpToSp(float p0);
    public float convertSpToDp(float p0);
}
