package android.app.permissionui;

public interface LocationButtonSession extends java.lang.AutoCloseable {
    public static final int TEXT_TYPE_NEAR_MY_PRECISE_LOCATION = 4;
    public static final int TEXT_TYPE_NEAR_YOUR_PRECISE_LOCATION = 5;
    public static final int TEXT_TYPE_NONE = 0;
    public static final int TEXT_TYPE_PRECISE_LOCATION = 1;
    public static final int TEXT_TYPE_SHARE_PRECISE_LOCATION = 3;
    public static final int TEXT_TYPE_USE_PRECISE_LOCATION = 2;
    public void changeConfiguration(android.content.res.Configuration p0);
    public void close();
    public android.view.SurfaceControlViewHost.SurfacePackage getSurfacePackage();
    public void resize(int p0, int p1);
    public void setBackgroundColor(int p0);
    public void setCornerRadius(float p0);
    public void setIconTint(int p0);
    public void setPadding(int p0, int p1, int p2, int p3);
    public void setPressedCornerRadius(float p0);
    public void setStrokeColor(int p0);
    public void setStrokeWidth(int p0);
    public void setTextColor(int p0);
    public void setTextType(int p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TextType {
    }
}
