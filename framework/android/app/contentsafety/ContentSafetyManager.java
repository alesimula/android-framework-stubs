package android.app.contentsafety;

public final class ContentSafetyManager {
    public static final java.lang.String ACTION_SHOW_RESTRICTED_CONTENT_DETAILS = "android.app.contentsafety.action.SHOW_RESTRICTED_CONTENT_DETAILS";
    private static final java.lang.String CACHE_API_NAME = "get_supported_mime_types";
    private static final java.lang.String CACHE_MODULE = "contentsafety";
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_CHECK_CONTENT_CANCELLED = 9;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_CHECK_CONTENT_ERROR = 10;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_CHECK_CONTENT_INVOKE_ERROR = 11;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_FEATURE_NOT_READ_ONLY_ERROR = 7;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_GET_FEATURE_ERROR = 5;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_GET_FEATURE_INTERNAL_ERROR = 14;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_GET_FEATURE_INVOKE_ERROR = 12;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_LOAD_FEATURE_ERROR = 6;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_LOAD_FEATURE_INTERNAL_ERROR = 15;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_LOAD_FEATURE_INVOKE_ERROR = 13;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_PAYLOAD_NOT_READ_ONLY_ERROR = 8;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_SANDBOXED_SERVICE_ERROR_NOT_AVAILABLE = 4;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_SANDBOXED_SERVICE_ERROR_UNKNOWN = 3;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_SUCCESS_NONE = 1;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_SUCCESS_SENSITIVE = 2;
    @android.annotation.SystemApi
    public static final int CONTENT_SAFETY_UNKNOWN = 0;
    public static final java.lang.String EXTRA_CONTENT_LOCUS_ID = "android.app.contentsafety.extra.CONTENT_LOCUS_ID";
    private static final int MAX_CACHE_SIZE = 1;
    public static final int SENSITIVE_IMAGE = 0;
    public static final int SENSITIVE_VIDEO = 1;
    private static final java.lang.String TAG = "ContentSafety";
    private final android.content.Context mContext = null;
    private final android.os.IpcDataCache<java.lang.Void, java.util.List<java.lang.String>> mMimeTypesCache = null;
    private final android.os.IpcDataCache.QueryHandler<java.lang.Void, java.util.List<java.lang.String>> mMimeTypesQueryHandler = null;
    private final android.app.contentsafety.IContentRestrictionService mRestrictionService = null;
    private final android.app.contentsafety.IContentSafetyManager mService = null;
    public ContentSafetyManager(android.content.Context p0, android.app.contentsafety.IContentSafetyManager p1, android.app.contentsafety.IContentRestrictionService p2) {}
    public static void clearCache() {}
    private static com.android.internal.infra.AndroidFuture<android.os.IBinder> configureRemoteCancellationFuture(android.os.CancellationSignal p0, java.util.concurrent.Executor p1) { return null; }
    private android.os.Bundle packMapIntoBundle(java.util.Map<java.lang.Integer, java.util.List<android.os.ParcelFileDescriptor>> p0) { return null; }
    private java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> unpackMapFromBundle(android.os.Bundle p0) { return null; }
    public void cancelClassification(java.util.List<android.content.LocusId> p0) {}
    public android.content.Intent createContentRestrictedIntent(android.content.LocusId p0) { return null; }
    public java.lang.String getClassifyingPackage(int p0, java.lang.String p1, android.content.LocusId p2) { return null; }
    @android.annotation.SystemApi
    public java.lang.String getRemoteSandboxedServicePackageName() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getRemoteServicePackageName() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getRemoteSettingsServicePackageName() { return null; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getSupportedMimeTypes() { return null; }
    public boolean isContentSafetyEnabled() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void requestCheckContent(int p0, java.util.Map<java.lang.Integer, java.util.List<android.os.ParcelFileDescriptor>> p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>>> p4) {}
    @android.annotation.SystemApi
    public void requestCheckContent(java.util.List<android.app.contentsafety.ClassifiableContent> p0, java.util.concurrent.Executor p1, android.app.contentsafety.CheckContentCallback p2) {}
    public void requestContentClassification(android.app.contentsafety.ClassifiableContent p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.app.contentsafety.ContentClassificationResult, java.lang.Exception> p2) {}
    @android.annotation.SystemApi
    public void requestIsFeatureEnabled(int p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Boolean, android.app.contentsafety.FeatureException> p3) {}
    public void setShouldAllowBypassingContentSafetyRoleQualification(boolean p0) {}
    public void setShouldAllowBypassingContentSafetySandboxingForUser(int p0, boolean p1) {}
    @android.annotation.SystemApi
    public boolean shouldAllowBypassingContentSafetyRoleQualification() { return false; }
    public boolean shouldAllowBypassingContentSafetySandboxingForUser(int p0) { return false; }

    private static class CheckContentCallbackDelegate extends android.app.contentsafety.ICheckContentCallback.Stub {
        private final android.app.contentsafety.CheckContentCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        CheckContentCallbackDelegate(java.util.concurrent.Executor p0, android.app.contentsafety.CheckContentCallback p1) { super(); }
        public void onClassification(java.util.List<android.app.contentsafety.ContentClassificationResult> p0) {}
        public void onClassificationComplete() {}
        public void onResult(android.os.Bundle p0) {}
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD})
    public static @interface CheckContentParams {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD})
    public static @interface CheckContentStatus {
    }

    private static class ContentSafetyCallbackDelegate extends android.app.contentsafety.IContentSafetyCallback.Stub {
        private final android.os.OutcomeReceiver<android.app.contentsafety.ContentClassificationResult, java.lang.Exception> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        ContentSafetyCallbackDelegate(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.app.contentsafety.ContentClassificationResult, java.lang.Exception> p1) { super(); }
        public void onError(int p0, java.lang.String p1) {}
        public void onResult(android.app.contentsafety.ContentClassificationResult p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeatureType {
    }
}
