package android.service.personalcontext.embedded;

@android.annotation.SystemApi
public final class InsightSurfaceClientUpdate implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.embedded.InsightSurfaceClientUpdate> CREATOR = null;
    public static final java.lang.String KEY_BACKGROUND_COLOR = "key_background_color";
    public static final java.lang.String KEY_CONFIGURATION = "key_configuration";
    public static final java.lang.String KEY_MEASURE_SPEC_HEIGHT = "key_measure_spec_height";
    public static final java.lang.String KEY_MEASURE_SPEC_WIDTH = "key_measure_spec_width";
    public static final java.lang.String KEY_NESTED_SCROLL_AXES = "key_nested_scroll_axes";
    public static final java.lang.String KEY_NESTED_SCROLL_AXIS_LOCKED = "key_nested_scroll_axis_locked";
    public static final java.lang.String KEY_SHOULD_BLUR = "key_should_blur";
    public static final java.lang.String KEY_THEME_RESOURCE_NAME = "key_theme_resource_name";
    private final android.os.Bundle mUpdateValues = null;
    private InsightSurfaceClientUpdate(android.os.Bundle p0) {}
    private InsightSurfaceClientUpdate(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.graphics.Color getBackgroundColor() { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public int getMeasureSpecHeight() { return 0; }
    public int getMeasureSpecWidth() { return 0; }
    public int getNestedScrollAxes() { return 0; }
    public int getThemeResourceId() { return 0; }
    public boolean hasUpdate(java.lang.String p0) { return false; }
    public boolean isNestedScrollAxisLocked() { return false; }
    public boolean shouldBlur() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.os.Bundle mValues = null;
        public Builder() {}
        public android.service.personalcontext.embedded.InsightSurfaceClientUpdate build() { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClientUpdate.Builder setBackgroundColor(android.graphics.Color p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClientUpdate.Builder setConfiguration(android.content.res.Configuration p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClientUpdate.Builder setMeasureSpecHeight(int p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClientUpdate.Builder setMeasureSpecWidth(int p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClientUpdate.Builder setNestedScrollAxes(int p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClientUpdate.Builder setNestedScrollAxisLocked(boolean p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClientUpdate.Builder setShouldBlur(boolean p0) { return null; }
        public android.service.personalcontext.embedded.InsightSurfaceClientUpdate.Builder setThemeResourceId(int p0) { return null; }
    }
}
