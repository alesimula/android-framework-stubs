package android.content.res;

public abstract class ComplexColor {
    private int mChangingConfigurations;
    public ComplexColor() {}
    public abstract boolean canApplyTheme();
    public int getChangingConfigurations() { return 0; }
    public abstract android.content.res.ConstantState<android.content.res.ComplexColor> getConstantState();
    public abstract int getDefaultColor();
    public boolean isStateful() { return false; }
    public abstract android.content.res.ComplexColor obtainForTheme(android.content.res.Resources.Theme p0);
    final void setBaseChangingConfigurations(int p0) {}
}
