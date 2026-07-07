package com.android.internal.widget;

public class NumericTextView extends android.widget.TextView {
    private static final double LOG_RADIX = Double.valueOf(0.0);
    private static final int RADIX = 10;
    private int mCount;
    private com.android.internal.widget.NumericTextView.OnValueChangedListener mListener;
    private int mMaxCount;
    private int mMaxValue;
    private int mMinValue;
    private int mPreviousValue;
    private boolean mShowLeadingZeroes;
    private int mValue;
    public NumericTextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private boolean handleKeyUp(int p0) { return false; }
    private static boolean isKeyCodeNumeric(int p0) { return false; }
    private static int numericKeyCodeToInt(int p0) { return 0; }
    private void updateDisplayedValue() {}
    private void updateMinimumWidth() {}
    public final com.android.internal.widget.NumericTextView.OnValueChangedListener getOnDigitEnteredListener() { return null; }
    public final int getRangeMaximum() { return 0; }
    public final int getRangeMinimum() { return 0; }
    public final boolean getShowLeadingZeroes() { return false; }
    public final int getValue() { return 0; }
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public final void setOnDigitEnteredListener(com.android.internal.widget.NumericTextView.OnValueChangedListener p0) {}
    public final void setRange(int p0, int p1) {}
    public final void setShowLeadingZeroes(boolean p0) {}
    public final void setValue(int p0) {}

    public static interface OnValueChangedListener {
        public void onValueChanged(com.android.internal.widget.NumericTextView p0, int p1, boolean p2, boolean p3);
    }
}
