package android.app;

interface ActivityThreadInternal {
    public java.util.ArrayList<android.content.ComponentCallbacks2> collectComponentCallbacks(boolean p0);
    public android.app.Application getApplication();
    public android.app.ContextImpl getSystemContext();
    public android.content.Context getSystemUiContextNoCreate();
    public boolean isInDensityCompatMode();
}
