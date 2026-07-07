package android.accounts;

public class ChooseTypeAndAccountActivity extends android.app.Activity implements android.accounts.AccountManagerCallback<android.os.Bundle> {
    public static final java.lang.String EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING = "authTokenType";
    public static final java.lang.String EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE = "addAccountOptions";
    public static final java.lang.String EXTRA_ADD_ACCOUNT_REQUIRED_FEATURES_STRING_ARRAY = "addAccountRequiredFeatures";
    public static final java.lang.String EXTRA_ALLOWABLE_ACCOUNTS_ARRAYLIST = "allowableAccounts";
    public static final java.lang.String EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY = "allowableAccountTypes";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_ALWAYS_PROMPT_FOR_ACCOUNT = "alwaysPromptForAccount";
    public static final java.lang.String EXTRA_DESCRIPTION_TEXT_OVERRIDE = "descriptionTextOverride";
    public static final java.lang.String EXTRA_SELECTED_ACCOUNT = "selectedAccount";
    private static final java.lang.String KEY_INSTANCE_STATE_ACCOUNTS_LIST = "accountsList";
    private static final java.lang.String KEY_INSTANCE_STATE_EXISTING_ACCOUNTS = "existingAccounts";
    private static final java.lang.String KEY_INSTANCE_STATE_PENDING_REQUEST = "pendingRequest";
    private static final java.lang.String KEY_INSTANCE_STATE_SELECTED_ACCOUNT_NAME = "selectedAccountName";
    private static final java.lang.String KEY_INSTANCE_STATE_SELECTED_ADD_ACCOUNT = "selectedAddAccount";
    private static final java.lang.String KEY_INSTANCE_STATE_VISIBILITY_LIST = "visibilityList";
    public static final int REQUEST_ADD_ACCOUNT = 2;
    public static final int REQUEST_CHOOSE_TYPE = 1;
    public static final int REQUEST_NULL = 0;
    private static final int SELECTED_ITEM_NONE = -1;
    private static final java.lang.String TAG = "AccountChooser";
    private java.util.LinkedHashMap<android.accounts.Account, java.lang.Integer> mAccounts;
    private java.lang.String mCallingPackage;
    private int mCallingUid;
    private java.lang.String mDescriptionOverride;
    private boolean mDisallowAddAccounts;
    private boolean mDontShowPicker;
    private android.os.Parcelable[] mExistingAccounts;
    private android.widget.Button mOkButton;
    private int mPendingRequest;
    private java.util.ArrayList<android.accounts.Account> mPossiblyVisibleAccounts;
    private java.lang.String mSelectedAccountName;
    private boolean mSelectedAddNewAccount;
    private int mSelectedItemIndex;
    private java.util.Set<android.accounts.Account> mSetOfAllowableAccounts;
    private java.util.Set<java.lang.String> mSetOfRelevantAccountTypes;
    public ChooseTypeAndAccountActivity() { super(); }
    private java.util.LinkedHashMap<android.accounts.Account, java.lang.Integer> getAcceptableAccountChoices(android.accounts.AccountManager p0) { return null; }
    private java.util.Set<android.accounts.Account> getAllowableAccountSet(android.content.Intent p0) { return null; }
    private int getItemIndexToSelect(java.util.ArrayList<android.accounts.Account> p0, java.lang.String p1, boolean p2) { return 0; }
    private java.lang.String[] getListOfDisplayableOptions(java.util.ArrayList<android.accounts.Account> p0) { return null; }
    private java.util.Set<java.lang.String> getReleventAccountTypes(android.content.Intent p0) { return null; }
    private void onAccountSelected(android.accounts.Account p0) {}
    private void overrideDescriptionIfSupplied(java.lang.String p0) {}
    private final void populateUIAccountList(java.lang.String[] p0) {}
    private void setNonLabelThemeAndCallSuperCreate(android.os.Bundle p0) {}
    private void setResultAndFinish(java.lang.String p0, java.lang.String p1) {}
    private void startChooseAccountTypeActivity() {}
    protected void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    public void onCancelButtonClicked(android.view.View p0) {}
    public void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    public void onOkButtonClicked(android.view.View p0) {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    public void run(android.accounts.AccountManagerFuture<android.os.Bundle> p0) {}
    protected void runAddAccountForAuthenticator(java.lang.String p0) {}
}
