package android.service.personalcontext.util;

public class BinderRequestProcessor<T extends java.lang.Object> {
    private static final java.lang.String TAG = "BinderRequestProcessor";
    private final java.util.concurrent.Executor mExecutor = null;
    private boolean mInitialized;
    private final android.service.personalcontext.util.BinderRequestProcessor.Initializer<T> mInitializer = null;
    private final java.lang.ref.WeakReference<T> mServiceReference = null;
    private BinderRequestProcessor(T p0, java.util.concurrent.Executor p1, android.service.personalcontext.util.BinderRequestProcessor.Initializer<T> p2) {}
    private T getServiceOrThrow() throws android.os.RemoteException { return null; }
    public final void execute(android.service.personalcontext.util.BinderRequestProcessor.ExecutionParams<T> p0) throws java.lang.IllegalStateException {}

    public static class Builder<T extends java.lang.Object> {
        private final java.util.concurrent.Executor mExecutor = null;
        private android.service.personalcontext.util.BinderRequestProcessor.Initializer<T> mInitializer;
        private final T mService = null;
        public Builder(T p0, java.util.concurrent.Executor p1) {}
        public android.service.personalcontext.util.BinderRequestProcessor<T> build() { return null; }
        public android.service.personalcontext.util.BinderRequestProcessor.Builder<T> setInitializer(android.service.personalcontext.util.BinderRequestProcessor.Initializer<T> p0) { return null; }
    }

    public static class ExecutionParams<T extends java.lang.Object> {
        private final android.service.personalcontext.IOpCallback mCallback = null;
        private final java.util.UUID mComponentId = null;
        private final android.service.personalcontext.util.BinderRequestProcessor.OperationHandler<T> mInputHandler = null;
        private ExecutionParams(android.service.personalcontext.IOpCallback p0, android.service.personalcontext.util.BinderRequestProcessor.OperationHandler<T> p1, java.util.UUID p2) {}
        public android.service.personalcontext.IOpCallback getCallback() { return null; }
        public java.util.UUID getComponentId() { return null; }
        public android.service.personalcontext.util.BinderRequestProcessor.OperationHandler<T> getHandler() { return null; }

        public static class Builder<T extends java.lang.Object> {
            private final android.service.personalcontext.IOpCallback mCallback = null;
            private java.util.UUID mComponentId;
            private final android.service.personalcontext.util.BinderRequestProcessor.OperationHandler<T> mInputHandler = null;
            public Builder(android.service.personalcontext.IOpCallback p0, android.service.personalcontext.util.BinderRequestProcessor.OperationHandler<T> p1) {}
            public android.service.personalcontext.util.BinderRequestProcessor.ExecutionParams<T> build() { return null; }
            public android.service.personalcontext.util.BinderRequestProcessor.ExecutionParams.Builder<T> setComponentId(android.os.ParcelUuid p0) { return null; }
            public android.service.personalcontext.util.BinderRequestProcessor.ExecutionParams.Builder<T> setComponentId(java.util.UUID p0) { return null; }
        }
    }

    public static interface Initializer<T extends java.lang.Object> {
        public void onInitialize(T p0, java.util.UUID p1) throws java.lang.Exception;
    }

    public static interface OperationHandler<T extends java.lang.Object> {
        public void handle(T p0) throws java.lang.Exception;
    }
}
