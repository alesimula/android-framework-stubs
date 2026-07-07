package com.android.internal.app;

public class ResolverAppPredictorCallback {
    private volatile java.util.function.Consumer<java.util.List<android.app.prediction.AppTarget>> mCallback;
    public ResolverAppPredictorCallback(java.util.function.Consumer<java.util.List<android.app.prediction.AppTarget>> p0) {}
    private void notifyCallback(java.util.List<android.app.prediction.AppTarget> p0) {}
    public android.app.prediction.AppPredictor.Callback asCallback() { return null; }
    public java.util.function.Consumer<java.util.List<android.app.prediction.AppTarget>> asConsumer() { return null; }
    public void destroy() {}
}
