package com.android.internal.widget;

public interface DismissableView {
    public void setOnDismissListener(com.android.internal.widget.DismissableView.OnDismissListener p0);

    public static interface OnDismissListener {
        public void onDismiss();
    }
}
