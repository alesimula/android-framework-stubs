package android.app.personalcontext.util;

public class BinderRequestProcessor<T extends java.lang.Object> {
    private static final java.lang.String TAG = "BinderRequestProcessor";
    private final java.util.concurrent.Executor mExecutor = null;
    private java.util.UUID mInitializedComponentId;
    private final android.app.personalcontext.util.BinderRequestProcessor.Initializer<T> mInitializer = null;
    private final java.lang.ref.WeakReference<T> mServiceReference = null;
    private BinderRequestProcessor(T p0, java.util.concurrent.Executor p1, android.app.personalcontext.util.BinderRequestProcessor.Initializer<T> p2) {}
    private T getServiceOrThrow() throws android.os.RemoteException { return null; }
    public final void execute(android.app.personalcontext.util.BinderRequestProcessor.ExecutionParams<T> p0) throws java.lang.IllegalStateException {}

    public static class ExecutionParams<T extends java.lang.Object> {
        private final android.app.personalcontext.IOpCallback mCallback = null;
        private final java.util.UUID mComponentId = null;
        private final android.app.personalcontext.util.BinderRequestProcessor.OperationHandler<T> mInputHandler = null;
        private ExecutionParams(android.app.personalcontext.IOpCallback p0, android.app.personalcontext.util.BinderRequestProcessor.OperationHandler<T> p1, java.util.UUID p2) {}
        public android.app.personalcontext.IOpCallback getCallback() { return null; }
        public java.util.UUID getComponentId() { return null; }
        public android.app.personalcontext.util.BinderRequestProcessor.OperationHandler<T> getHandler() { return null; }

        public static class Builder<T extends java.lang.Object> {
            private final android.app.personalcontext.IOpCallback mCallback = null;
            private java.util.UUID mComponentId;
            private final android.app.personalcontext.util.BinderRequestProcessor.OperationHandler<T> mInputHandler = null;
            public Builder(android.app.personalcontext.IOpCallback p0, android.app.personalcontext.util.BinderRequestProcessor.OperationHandler<T> p1) {}
            public android.app.personalcontext.util.BinderRequestProcessor.ExecutionParams<T> build() { return null; }
            public android.app.personalcontext.util.BinderRequestProcessor.ExecutionParams.Builder<T> setComponentId(android.os.ParcelUuid p0) { return null; }
            public android.app.personalcontext.util.BinderRequestProcessor.ExecutionParams.Builder<T> setComponentId(java.util.UUID p0) { return null; }
        }
    }

    public static interface Initializer<T extends java.lang.Object> {
        public void onInitialize(T p0, java.util.UUID p1) throws java.lang.Exception;
    }

    public static interface OperationHandler<T extends java.lang.Object> {
        public void handle(T p0) throws java.lang.Exception;
    }

    public static class Builder<T extends java.lang.Object> {
        private final java.util.concurrent.Executor mExecutor = null;
        private android.app.personalcontext.util.BinderRequestProcessor.Initializer<T> mInitializer;
        private final T mService = null;
        public Builder(T p0, java.util.concurrent.Executor p1) {}
        public android.app.personalcontext.util.BinderRequestProcessor<T> build() { return null; }
        public android.app.personalcontext.util.BinderRequestProcessor.Builder<T> setInitializer(android.app.personalcontext.util.BinderRequestProcessor.Initializer<T> p0) { return null; }
    }
}
