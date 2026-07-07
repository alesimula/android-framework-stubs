package android.widget;

public class ToggleButton extends android.widget.CompoundButton {
    private static final int NO_ALPHA = 255;
    private float mDisabledAlpha;
    private android.graphics.drawable.Drawable mIndicatorDrawable;
    private java.lang.CharSequence mTextOff;
    private java.lang.CharSequence mTextOn;
    public ToggleButton(android.content.Context p0) { super((android.content.Context)null); }
    public ToggleButton(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ToggleButton(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ToggleButton(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void syncTextState() {}
    private void updateReferenceToIndicatorDrawable(android.graphics.drawable.Drawable p0) {}
    protected void drawableStateChanged() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected java.lang.CharSequence getButtonStateDescription() { return null; }
    public float getDisabledAlpha() { return 0.0f; }
    public java.lang.CharSequence getTextOff() { return null; }
    public java.lang.CharSequence getTextOn() { return null; }
    protected void onFinishInflate() {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setChecked(boolean p0) {}
    public void setTextOff(java.lang.CharSequence p0) {}
    public void setTextOn(java.lang.CharSequence p0) {}

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ToggleButton> {
        private int mDisabledAlphaId;
        private boolean mPropertiesMapped;
        private int mTextOffId;
        private int mTextOnId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ToggleButton p0, android.view.inspector.PropertyReader p1) {}
    }
}
