package android.app.permissionui;

public final class LocationButtonRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.permissionui.LocationButtonRequest> CREATOR = null;
    private static final int PROPERTY_BACKGROUND_COLOR = 16;
    private static final int PROPERTY_CORNER_RADIUS = 128;
    private static final int PROPERTY_ICON_TINT = 512;
    private static final int PROPERTY_PADDING_BOTTOM = 8;
    private static final int PROPERTY_PADDING_LEFT = 1;
    private static final int PROPERTY_PADDING_RIGHT = 4;
    private static final int PROPERTY_PADDING_TOP = 2;
    private static final int PROPERTY_PRESSED_CORNER_RADIUS = 256;
    private static final int PROPERTY_STROKE_COLOR = 32;
    private static final int PROPERTY_STROKE_WIDTH = 64;
    private static final int PROPERTY_TEXT_COLOR = 2048;
    private static final int PROPERTY_TEXT_TYPE = 1024;
    private final int mBackgroundColor = 0;
    private final android.content.res.Configuration mConfiguration = null;
    private final float mCornerRadius = 0.0f;
    private final int mHeight = 0;
    private final int mIconTint = 0;
    private final int mPaddingBottom = 0;
    private final int mPaddingLeft = 0;
    private final int mPaddingRight = 0;
    private final int mPaddingTop = 0;
    private final float mPressedCornerRadius = 0.0f;
    private final int mPropertiesSet = 0;
    private final int mStrokeColor = 0;
    private final int mStrokeWidth = 0;
    private final int mTextColor = 0;
    private final int mTextType = 0;
    private final int mWidth = 0;
    private LocationButtonRequest(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, float p9, float p10, int p11, int p12, int p13, android.content.res.Configuration p14, int p15) {}
    public int describeContents() { return 0; }
    public int getBackgroundColor() { return 0; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public float getCornerRadius() { return 0.0f; }
    public int getHeight() { return 0; }
    public int getIconTint() { return 0; }
    public int getPaddingBottom() { return 0; }
    public int getPaddingLeft() { return 0; }
    public int getPaddingRight() { return 0; }
    public int getPaddingTop() { return 0; }
    public float getPressedCornerRadius() { return 0.0f; }
    public int getStrokeColor() { return 0; }
    public int getStrokeWidth() { return 0; }
    public int getTextColor() { return 0; }
    public int getTextType() { return 0; }
    public int getWidth() { return 0; }
    public boolean hasBackgroundColor() { return false; }
    public boolean hasCornerRadius() { return false; }
    public boolean hasIconTint() { return false; }
    public boolean hasPaddingBottom() { return false; }
    public boolean hasPaddingLeft() { return false; }
    public boolean hasPaddingRight() { return false; }
    public boolean hasPaddingTop() { return false; }
    public boolean hasPressedCornerRadius() { return false; }
    public boolean hasStrokeColor() { return false; }
    public boolean hasStrokeWidth() { return false; }
    public boolean hasTextColor() { return false; }
    public boolean hasTextType() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mBackgroundColor;
        private final android.content.res.Configuration mConfiguration = null;
        private float mCornerRadius;
        private final int mHeight = 0;
        private int mIconTint;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private float mPressedCornerRadius;
        private int mPropertiesSet;
        private int mStrokeColor;
        private int mStrokeWidth;
        private int mTextColor;
        private int mTextType;
        private final int mWidth = 0;
        public Builder(int p0, int p1, android.content.res.Configuration p2) {}
        public android.app.permissionui.LocationButtonRequest build() { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setBackgroundColor(int p0) { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setCornerRadius(float p0) { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setIconTint(int p0) { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setPaddingBottom(int p0) { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setPaddingLeft(int p0) { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setPaddingRight(int p0) { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setPaddingTop(int p0) { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setPressedCornerRadius(float p0) { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setStrokeColor(int p0) { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setStrokeWidth(int p0) { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setTextColor(int p0) { return null; }
        public android.app.permissionui.LocationButtonRequest.Builder setTextType(int p0) { return null; }
    }
}
