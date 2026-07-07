package android.provider;

public abstract class OneTimeUseBuilder<T extends java.lang.Object> {
    private boolean used;
    public OneTimeUseBuilder() {}
    public abstract T build();
    protected void checkNotUsed() {}
    protected void markUsed() {}
}
