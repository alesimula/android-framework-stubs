package com.android.internal.app;

public class ConfirmUserCreationActivity extends com.android.internal.app.AlertActivity implements android.content.DialogInterface.OnClickListener {
    private static final java.lang.String TAG = "CreateUser";
    private static final java.lang.String USER_TYPE = "android.os.usertype.full.SECONDARY";
    private java.lang.String mAccountName;
    private android.os.PersistableBundle mAccountOptions;
    private java.lang.String mAccountType;
    private boolean mCanProceed;
    private boolean mIsFirstClick;
    private android.os.UserManager mUserManager;
    private java.lang.String mUserName;
    public ConfirmUserCreationActivity() { super(); }
    private java.lang.String checkUserCreationRequirements() { return null; }
    private boolean isUserPropertyWithinLimit(java.lang.String p0, int p1) { return false; }
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public void onCreate(android.os.Bundle p0) {}
}
