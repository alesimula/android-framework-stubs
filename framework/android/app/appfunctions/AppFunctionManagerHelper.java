package android.app.appfunctions;

public class AppFunctionManagerHelper {
    private static final java.lang.String TAG = "AppFunctionManagerHelper";
    public AppFunctionManagerHelper() {}
    private static android.app.appfunctions.AppFunctionSearchSpec applyVisiblePackageFilter(android.app.appfunctions.AppFunctionSearchSpec p0, android.content.Context p1) { return null; }
    static android.os.CancellationSignal buildCancellationSignal(android.app.appfunctions.ICancellationCallback p0) { return null; }
    private static java.lang.String buildFilerRuntimeMetadataByFunctionIdQuery(java.lang.String p0) { return null; }
    private static java.lang.String buildFilerStaticMetadataByFunctionIdQuery(java.lang.String p0) { return null; }
    static int executionExceptionToErrorCode(java.lang.Throwable p0) { return 0; }
    private static java.lang.Exception failedResultToException(android.app.appsearch.AppSearchResult p0) { return null; }
    private static void fetchAllAppSearchDocuments(android.app.appsearch.SearchResults p0, android.app.appsearch.GlobalSearchSession p1, java.util.List<android.app.appsearch.GenericDocument> p2, com.android.internal.infra.AndroidFuture<java.util.List<android.app.appsearch.GenericDocument>> p3, java.util.concurrent.Executor p4) {}
    private static android.app.appsearch.SearchSpec getAppFunctionRuntimeMetadataSearchSpecByPackageName(java.lang.String p0) { return null; }
    private static boolean getEffectiveEnabledStateFromSearchResults(java.util.List<android.app.appsearch.SearchResult> p0) { return false; }
    private static boolean hasPermissionsToQueryRuntimeMetadata(android.content.Context p0) { return false; }
    public static void isAppFunctionEnabled(java.lang.String p0, java.lang.String p1, android.app.appsearch.AppSearchManager p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p4) {}
    private static com.android.internal.infra.AndroidFuture<java.util.List<android.app.appsearch.GenericDocument>> searchAppFunctionPackageMetadata(android.app.appsearch.AppSearchManager p0, android.app.appfunctions.AppFunctionSearchSpec p1, java.util.concurrent.Executor p2) { return null; }
    private static com.android.internal.infra.AndroidFuture<java.util.List<android.app.appsearch.GenericDocument>> searchAppFunctionStaticMetadata(android.app.appsearch.AppSearchManager p0, android.app.appfunctions.AppFunctionSearchSpec p1, java.util.concurrent.Executor p2) { return null; }
    public static com.android.internal.infra.AndroidFuture<java.util.List<android.app.appfunctions.AppFunctionMetadata>> searchAppFunctions(android.content.Context p0, android.app.appsearch.AppSearchManager p1, android.app.appfunctions.AppFunctionSearchSpec p2, java.util.concurrent.Executor p3) { return null; }
    private static android.app.appsearch.SearchResults searchJoinedStaticWithRuntimeAppFunctions(android.app.appsearch.GlobalSearchSession p0, java.lang.String p1, java.lang.String p2) { return null; }

    public static class AppFunctionNotFoundException extends java.lang.RuntimeException {
        public AppFunctionNotFoundException(java.lang.String p0) { super(); }
    }
}
