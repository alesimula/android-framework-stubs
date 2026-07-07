package android.accounts;

public class ChooseAccountTypeActivity extends android.app.Activity {
    private static final java.lang.String TAG = "AccountChooser";
    private java.util.ArrayList<android.accounts.ChooseAccountTypeActivity.AuthInfo> mAuthenticatorInfosToDisplay;
    private java.util.HashMap<java.lang.String, android.accounts.ChooseAccountTypeActivity.AuthInfo> mTypeToAuthenticatorInfo;
    public ChooseAccountTypeActivity() { super(); }
    private void buildTypeToAuthDescriptionMap() {}
    private void setResultAndFinish(java.lang.String p0) {}
    public void onCreate(android.os.Bundle p0) {}

    private static class AccountArrayAdapter extends android.widget.ArrayAdapter<android.accounts.ChooseAccountTypeActivity.AuthInfo> {
        private java.util.ArrayList<android.accounts.ChooseAccountTypeActivity.AuthInfo> mInfos;
        private android.view.LayoutInflater mLayoutInflater;
        public AccountArrayAdapter(android.content.Context p0, int p1, java.util.ArrayList<android.accounts.ChooseAccountTypeActivity.AuthInfo> p2) { super((android.content.Context)null, 0); }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    }

    private static class AuthInfo {
        final android.accounts.AuthenticatorDescription desc = null;
        final android.graphics.drawable.Drawable drawable = null;
        final java.lang.String name = null;
        AuthInfo(android.accounts.AuthenticatorDescription p0, java.lang.String p1, android.graphics.drawable.Drawable p2) {}
    }

    private static class ViewHolder {
        android.widget.ImageView icon;
        android.widget.TextView text;
        private ViewHolder() {}
    }
}
