package android.accounts;

public class GrantCredentialsPermissionActivity extends android.app.Activity implements android.view.View.OnClickListener {
    public static final java.lang.String EXTRAS_ACCOUNT = "account";
    public static final java.lang.String EXTRAS_AUTH_TOKEN_TYPE = "authTokenType";
    public static final java.lang.String EXTRAS_REQUESTING_UID = "uid";
    public static final java.lang.String EXTRAS_RESPONSE = "response";
    private android.accounts.Account mAccount;
    private java.lang.String mAuthTokenType;
    private int mCallingUid;
    protected android.view.LayoutInflater mInflater;
    private android.os.Bundle mResultBundle;
    private int mUid;
    public GrantCredentialsPermissionActivity() { super(); }
    private java.lang.String getAccountLabel(android.accounts.Account p0) { return null; }
    private android.view.View newPackageView(java.lang.String p0) { return null; }
    public void finish() {}
    public void onClick(android.view.View p0) {}
    protected void onCreate(android.os.Bundle p0) {}
    public final void setAccountAuthenticatorResult(android.os.Bundle p0) {}
}
