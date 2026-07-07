package com.android.internal.app;

public class AlertController {
    public static final int MICRO = 1;
    private static final long WEAR_MATERIAL3_ALERTDIALOG = 379365266L;
    private static boolean sUseWearMaterial3Style;
    private android.widget.ListAdapter mAdapter;
    private int mAlertDialogLayout;
    private final android.view.View.OnClickListener mButtonHandler = null;
    private android.widget.Button mButtonNegative;
    private android.os.Message mButtonNegativeMessage;
    private java.lang.CharSequence mButtonNegativeText;
    private android.widget.Button mButtonNeutral;
    private android.os.Message mButtonNeutralMessage;
    private java.lang.CharSequence mButtonNeutralText;
    private int mButtonPanelLayoutHint;
    private int mButtonPanelSideLayout;
    private android.widget.Button mButtonPositive;
    private android.os.Message mButtonPositiveMessage;
    private java.lang.CharSequence mButtonPositiveText;
    private int mCheckedItem;
    private final android.content.Context mContext = null;
    private android.view.View mCustomTitleView;
    private final android.content.DialogInterface mDialogInterface = null;
    private boolean mForceInverseBackground;
    private android.os.Handler mHandler;
    private android.graphics.drawable.Drawable mIcon;
    private int mIconId;
    private android.widget.ImageView mIconView;
    private int mListItemLayout;
    private int mListLayout;
    protected android.widget.ListView mListView;
    protected java.lang.CharSequence mMessage;
    private java.lang.Integer mMessageHyphenationFrequency;
    private android.text.method.MovementMethod mMessageMovementMethod;
    protected android.widget.TextView mMessageView;
    private int mMultiChoiceItemLayout;
    protected android.widget.ScrollView mScrollView;
    private boolean mShowTitle;
    private int mSingleChoiceItemLayout;
    private java.lang.CharSequence mTitle;
    private android.widget.TextView mTitleView;
    private android.view.View mView;
    private int mViewLayoutResId;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private boolean mViewSpacingSpecified;
    private int mViewSpacingTop;
    protected final android.view.Window mWindow = null;
    protected AlertController(android.content.Context p0, android.content.DialogInterface p1, android.view.Window p2) {}
    static boolean canTextInput(android.view.View p0) { return false; }
    private void centerButton(android.widget.Button p0) {}
    public static final com.android.internal.app.AlertController create(android.content.Context p0, android.content.DialogInterface p1, android.view.Window p2) { return null; }
    private int getAlertDialogDefStyleAttr(android.content.Context p0) { return 0; }
    private int getAlertDialogDefStyleRes() { return 0; }
    private static void manageScrollIndicators(android.view.View p0, android.view.View p1, android.view.View p2) {}
    private boolean requestFocusForContent(android.view.View p0) { return false; }
    private void requestFocusForDefaultButton() {}
    private android.view.ViewGroup resolvePanel(android.view.View p0, android.view.View p1) { return null; }
    private int selectContentView() { return 0; }
    private void setBackground(android.content.res.TypedArray p0, android.view.View p1, android.view.View p2, android.view.View p3, android.view.View p4, boolean p5, boolean p6, boolean p7) {}
    private void setupCustomContent(android.view.ViewGroup p0) {}
    private void setupView() {}
    private static boolean shouldCenterSingleButton(android.content.Context p0) { return false; }
    private static boolean useWearMaterial3Style(android.content.Context p0) { return false; }
    public android.widget.Button getButton(int p0) { return null; }
    public int getIconAttributeResId(int p0) { return 0; }
    public android.widget.ListView getListView() { return null; }
    public void installContent() {}
    public void installContent(com.android.internal.app.AlertController.AlertParams p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public void setButton(int p0, java.lang.CharSequence p1, android.content.DialogInterface.OnClickListener p2, android.os.Message p3) {}
    public void setButtonPanelLayoutHint(int p0) {}
    public void setCustomTitle(android.view.View p0) {}
    public void setIcon(int p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setInverseBackgroundForced(boolean p0) {}
    public void setMessage(java.lang.CharSequence p0) {}
    public void setMessageHyphenationFrequency(int p0) {}
    public void setMessageMovementMethod(android.text.method.MovementMethod p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setView(int p0) {}
    public void setView(android.view.View p0) {}
    public void setView(android.view.View p0, int p1, int p2, int p3, int p4) {}
    protected void setupButtons(android.view.ViewGroup p0) {}
    protected void setupContent(android.view.ViewGroup p0) {}
    protected void setupTitle(android.view.ViewGroup p0) {}

    public static class AlertParams {
        public android.widget.ListAdapter mAdapter;
        public boolean mCancelable;
        public int mCheckedItem;
        public boolean[] mCheckedItems;
        public final android.content.Context mContext = null;
        public android.database.Cursor mCursor;
        public android.view.View mCustomTitleView;
        public boolean mForceInverseBackground;
        public android.graphics.drawable.Drawable mIcon;
        public int mIconAttrId;
        public int mIconId;
        public final android.view.LayoutInflater mInflater = null;
        public java.lang.String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public java.lang.CharSequence[] mItems;
        public java.lang.String mLabelColumn;
        public java.lang.CharSequence mMessage;
        public android.content.DialogInterface.OnClickListener mNegativeButtonListener;
        public java.lang.CharSequence mNegativeButtonText;
        public android.content.DialogInterface.OnClickListener mNeutralButtonListener;
        public java.lang.CharSequence mNeutralButtonText;
        public android.content.DialogInterface.OnCancelListener mOnCancelListener;
        public android.content.DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public android.content.DialogInterface.OnClickListener mOnClickListener;
        public android.content.DialogInterface.OnDismissListener mOnDismissListener;
        public android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public android.content.DialogInterface.OnKeyListener mOnKeyListener;
        public com.android.internal.app.AlertController.AlertParams.OnPrepareListViewListener mOnPrepareListViewListener;
        public android.content.DialogInterface.OnClickListener mPositiveButtonListener;
        public java.lang.CharSequence mPositiveButtonText;
        public boolean mRecycleOnMeasure;
        public java.lang.CharSequence mTitle;
        public android.view.View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public boolean mViewSpacingSpecified;
        public int mViewSpacingTop;
        public AlertParams(android.content.Context p0) {}
        private void createListView(com.android.internal.app.AlertController p0) {}
        public void apply(com.android.internal.app.AlertController p0) {}

        public static interface OnPrepareListViewListener {
            public void onPrepareListView(android.widget.ListView p0);
        }
    }

    private static final class ButtonHandler extends android.os.Handler {
        private static final int MSG_DISMISS_DIALOG = 1;
        private java.lang.ref.WeakReference<android.content.DialogInterface> mDialog;
        public ButtonHandler(android.content.DialogInterface p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private static class CheckedItemAdapter extends android.widget.ArrayAdapter<java.lang.CharSequence> {
        public CheckedItemAdapter(android.content.Context p0, int p1, int p2, java.lang.CharSequence[] p3) { super((android.content.Context)null, 0); }
        public long getItemId(int p0) { return 0L; }
        public boolean hasStableIds() { return false; }
    }

    public static class RecycleListView extends android.widget.ListView {
        private final int mPaddingBottomNoButtons = 0;
        private final int mPaddingTopNoTitle = 0;
        boolean mRecycleOnMeasure;
        public RecycleListView(android.content.Context p0) { super((android.content.Context)null); }
        public RecycleListView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        protected boolean recycleOnMeasure() { return false; }
        public void setHasDecor(boolean p0, boolean p1) {}
    }
}
