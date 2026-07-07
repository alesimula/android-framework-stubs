package android.text;

@java.lang.Deprecated
public abstract class LoginFilter implements android.text.InputFilter {
    private boolean mAppendInvalid;
    LoginFilter() {}
    LoginFilter(boolean p0) {}
    public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return null; }
    public abstract boolean isAllowed(char p0);
    public void onInvalidCharacter(char p0) {}
    public void onStart() {}
    public void onStop() {}

    @java.lang.Deprecated
    public static class PasswordFilterGMail extends android.text.LoginFilter {
        public PasswordFilterGMail() { super(); }
        public PasswordFilterGMail(boolean p0) { super(); }
        public boolean isAllowed(char p0) { return false; }
    }

    public static class UsernameFilterGeneric extends android.text.LoginFilter {
        private static final java.lang.String mAllowed = "@_-+.";
        public UsernameFilterGeneric() { super(); }
        public UsernameFilterGeneric(boolean p0) { super(); }
        public boolean isAllowed(char p0) { return false; }
    }

    @java.lang.Deprecated
    public static class UsernameFilterGMail extends android.text.LoginFilter {
        public UsernameFilterGMail() { super(); }
        public UsernameFilterGMail(boolean p0) { super(); }
        public boolean isAllowed(char p0) { return false; }
    }
}
