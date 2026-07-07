package android.view.autofill;

public abstract class AutofillManagerInternal {
    public AutofillManagerInternal() {}
    public abstract android.content.AutofillOptions getAutofillOptions(java.lang.String p0, long p1, int p2);
    public abstract boolean isAugmentedAutofillServiceForUser(int p0, int p1);
    public abstract void onBackKeyPressed(int p0);
    public abstract void onDisplayRestrictionChanged(int p0, boolean p1);
}
