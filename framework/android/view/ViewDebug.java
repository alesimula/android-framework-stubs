package android.view;

public class ViewDebug {
    private static final int CAPTURE_TIMEOUT = 6000;
    public static final boolean DEBUG_DRAG = false;
    public static final boolean DEBUG_POSITIONING = false;
    private static final java.lang.String REMOTE_COMMAND_CAPTURE = "CAPTURE";
    private static final java.lang.String REMOTE_COMMAND_CAPTURE_LAYERS = "CAPTURE_LAYERS";
    private static final java.lang.String REMOTE_COMMAND_DUMP = "DUMP";
    public static final java.lang.String REMOTE_COMMAND_DUMP_ENCODED = "DUMP_ENCODED";
    private static final java.lang.String REMOTE_COMMAND_DUMP_THEME = "DUMP_THEME";
    private static final java.lang.String REMOTE_COMMAND_INVALIDATE = "INVALIDATE";
    private static final java.lang.String REMOTE_COMMAND_INVOKE_METHOD = "INVOKE_METHOD";
    private static final java.lang.String REMOTE_COMMAND_OUTPUT_DISPLAYLIST = "OUTPUT_DISPLAYLIST";
    private static final java.lang.String REMOTE_COMMAND_REQUEST_LAYOUT = "REQUEST_LAYOUT";
    private static final java.lang.String REMOTE_PROFILE = "PROFILE";
    private static final char SIG_ARRAY = '[';
    private static final char SIG_BOOLEAN = 'Z';
    private static final char SIG_BYTE = 'B';
    private static final char SIG_CHAR = 'C';
    private static final char SIG_DOUBLE = 'D';
    private static final char SIG_FLOAT = 'F';
    private static final char SIG_INT = 'I';
    private static final char SIG_LONG = 'J';
    private static final char SIG_SHORT = 'S';
    private static final char SIG_STRING = 'R';
    private static final char SIG_VOID = 'V';
    private static final java.lang.String TAG = "ViewDebug";
    @java.lang.Deprecated
    public static final boolean TRACE_HIERARCHY = false;
    @java.lang.Deprecated
    public static final boolean TRACE_RECYCLER = false;
    private static java.util.HashMap<java.lang.Class<?>, android.view.ViewDebug.PropertyInfo<android.view.ViewDebug.CapturedViewProperty, ?>[]> sCapturedViewProperties;
    private static java.util.HashMap<java.lang.Class<?>, android.view.ViewDebug.PropertyInfo<android.view.ViewDebug.ExportedProperty, ?>[]> sExportProperties;
    public ViewDebug() {}
    private static void cacheExportedProperties(java.lang.Class<?> p0) {}
    private static void cacheExportedPropertiesForChildren(android.view.ViewGroup p0) {}
    public static void capture(android.view.View p0, java.io.OutputStream p1, android.view.View p2) throws java.io.IOException {}
    private static void capture(android.view.View p0, java.io.OutputStream p1, java.lang.String p2) throws java.io.IOException {}
    public static void captureLayers(android.view.View p0, java.io.DataOutputStream p1) throws java.io.IOException {}
    private static void captureViewLayer(android.view.View p0, java.io.DataOutputStream p1, boolean p2) throws java.io.IOException {}
    private static <T extends java.lang.annotation.Annotation> android.view.ViewDebug.PropertyInfo<T, ?>[] convertToPropertyInfos(java.lang.reflect.Method[] p0, java.lang.reflect.Field[] p1, java.lang.Class<T> p2) { return null; }
    public static void deserializeMethodParameters(java.lang.Object[] p0, java.lang.Class<?>[] p1, java.nio.ByteBuffer p2) throws android.view.ViewDebug.ViewMethodInvocationSerializationException {}
    static void dispatchCommand(android.view.View p0, java.lang.String p1, java.lang.String p2, java.io.OutputStream p3) throws java.io.IOException {}
    @java.lang.Deprecated
    public static void dump(android.view.View p0, boolean p1, boolean p2, java.io.OutputStream p3) throws java.io.IOException {}
    public static void dumpCapturedView(java.lang.String p0, java.lang.Object p1) {}
    private static void dumpEncoded(android.view.View p0, java.io.OutputStream p1) throws java.io.IOException {}
    public static void dumpTheme(android.view.View p0, java.io.OutputStream p1) throws java.io.IOException {}
    private static boolean dumpView(android.content.Context p0, android.view.View p1, java.io.BufferedWriter p2, int p3, boolean p4) { return false; }
    private static void dumpViewHierarchy(android.content.Context p0, android.view.ViewGroup p1, java.io.BufferedWriter p2, int p3, boolean p4, boolean p5) {}
    private static void dumpViewHierarchyOnUIThread(android.content.Context p0, android.view.ViewGroup p1, java.io.BufferedWriter p2, int p3, boolean p4, boolean p5) {}
    private static void dumpViewProperties(android.content.Context p0, java.lang.Object p1, java.io.BufferedWriter p2) throws java.io.IOException {}
    private static void dumpViewProperties(android.content.Context p0, java.lang.Object p1, java.io.BufferedWriter p2, java.lang.String p3) throws java.io.IOException {}
    public static void dumpv2(android.view.View p0, java.io.ByteArrayOutputStream p1) throws java.lang.InterruptedException {}
    private static java.lang.String exportCapturedViewProperties(java.lang.Object p0, java.lang.Class<?> p1, java.lang.String p2) { return null; }
    private static void exportUnrolledArray(android.content.Context p0, java.io.BufferedWriter p1, android.view.ViewDebug.ExportedProperty p2, int[] p3, java.lang.String p4, java.lang.String p5) throws java.io.IOException {}
    private static void exportUnrolledFlags(java.io.BufferedWriter p0, android.view.ViewDebug.FlagToString[] p1, int p2, java.lang.String p3) throws java.io.IOException {}
    public static android.view.View findView(android.view.View p0, java.lang.String p1) { return null; }
    private static android.view.View findView(android.view.ViewGroup p0, java.lang.String p1, int p2) { return null; }
    public static java.lang.String flagsToString(java.lang.Class<?> p0, java.lang.String p1, int p2) { return null; }
    private static java.lang.String formatIntToHexString(int p0) { return null; }
    private static android.view.ViewDebug.PropertyInfo<android.view.ViewDebug.CapturedViewProperty, ?>[] getCapturedViewProperties(java.lang.Class<?> p0) { return null; }
    private static android.view.ViewDebug.PropertyInfo<android.view.ViewDebug.ExportedProperty, ?>[] getExportedProperties(java.lang.Class<?> p0) { return null; }
    private static android.view.ViewDebug.FlagToString[] getFlagMapping(java.lang.Class<?> p0, java.lang.String p1) { return null; }
    private static android.view.ViewDebug.IntToString[] getMapping(java.lang.Class<?> p0, java.lang.String p1) { return null; }
    private static java.lang.String[] getStyleAttributesDump(android.content.res.Resources p0, android.content.res.Resources.Theme p1) { return null; }
    public static long getViewInstanceCount() { return 0L; }
    public static long getViewRootImplCount() { return 0L; }
    public static java.lang.String intToString(java.lang.Class<?> p0, java.lang.String p1, int p2) { return null; }
    private static void invalidate(android.view.View p0, java.lang.String p1) {}
    private static void invokeViewMethod(android.view.View p0, java.io.OutputStream p1, java.lang.String[] p2) throws java.io.IOException {}
    public static byte[] invokeViewMethod(android.view.View p0, java.lang.String p1, java.nio.ByteBuffer p2) throws android.view.ViewDebug.ViewMethodInvocationSerializationException { return null; }
    private static boolean isRequestedView(android.view.View p0, java.lang.String p1, int p2) { return false; }
    public static void outputDisplayList(android.view.View p0, android.view.View p1) {}
    private static void outputDisplayList(android.view.View p0, java.lang.String p1) throws java.io.IOException {}
    private static android.graphics.Bitmap performViewCapture(android.view.View p0, boolean p1) { return null; }
    private static void profile(android.view.View p0, java.io.OutputStream p1, java.lang.String p2) throws java.io.IOException {}
    private static void profileViewAndChildren(android.view.View p0, android.graphics.RenderNode p1, java.io.BufferedWriter p2, boolean p3) throws java.io.IOException {}
    public static void profileViewAndChildren(android.view.View p0, java.io.BufferedWriter p1) throws java.io.IOException {}
    private static long profileViewDraw(android.view.View p0, android.graphics.RenderNode p1) { return 0L; }
    private static long profileViewLayout(android.view.View p0) { return 0L; }
    private static long profileViewMeasure(android.view.View p0) { return 0L; }
    private static long profileViewOperation(android.view.View p0, android.view.ViewDebug.ViewOperation p1) { return 0L; }
    private static void requestLayout(android.view.View p0, java.lang.String p1) {}
    static java.lang.Object resolveId(android.content.Context p0, int p1) { return null; }
    public static byte[] serializeReturnValue(java.lang.Class<?> p0, java.lang.Object p1) throws android.view.ViewDebug.ViewMethodInvocationSerializationException, java.io.IOException { return null; }
    public static void setLayoutParameter(android.view.View p0, java.lang.String p1, int p2) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {}
    @java.lang.Deprecated
    public static void startHierarchyTracing(java.lang.String p0, android.view.View p1) {}
    @java.lang.Deprecated
    public static void startRecyclerTracing(java.lang.String p0, android.view.View p1) {}
    public static java.lang.AutoCloseable startRenderingCommandsCapture(android.view.View p0, java.util.concurrent.Executor p1, java.util.concurrent.Callable<java.io.OutputStream> p2) { return null; }
    @java.lang.Deprecated
    public static java.lang.AutoCloseable startRenderingCommandsCapture(android.view.View p0, java.util.concurrent.Executor p1, java.util.function.Function<android.graphics.Picture, java.lang.Boolean> p2) { return null; }
    @java.lang.Deprecated
    public static void stopHierarchyTracing() {}
    @java.lang.Deprecated
    public static void stopRecyclerTracing() {}
    @java.lang.Deprecated
    public static void trace(android.view.View p0, android.view.ViewDebug.HierarchyTraceType p1) {}
    @java.lang.Deprecated
    public static void trace(android.view.View p0, android.view.ViewDebug.RecyclerTraceType p1, int... p2) {}
    private static void writeEntry(java.io.BufferedWriter p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.Object p4) throws java.io.IOException {}
    private static void writeExportedProperties(android.content.Context p0, java.lang.Object p1, java.io.BufferedWriter p2, java.lang.Class<?> p3, java.lang.String p4) throws java.io.IOException {}
    private static void writeValue(java.io.BufferedWriter p0, java.lang.Object p1) throws java.io.IOException {}

    public static interface CanvasProvider {
        public android.graphics.Bitmap createBitmap();
        public android.graphics.Canvas getCanvas(android.view.View p0, int p1, int p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
    public static @interface CapturedViewProperty {
        public boolean retrieveReturn() default false;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
    public static @interface ExportedProperty {
        public java.lang.String category() default "";
        public boolean deepExport() default false;
        public android.view.ViewDebug.FlagToString[] flagMapping() default {};
        public boolean formatToHexString() default false;
        public boolean hasAdjacentMapping() default false;
        public android.view.ViewDebug.IntToString[] indexMapping() default {};
        public android.view.ViewDebug.IntToString[] mapping() default {};
        public java.lang.String prefix() default "";
        public boolean resolveId() default false;
    }

    private static class FieldPI<T extends java.lang.annotation.Annotation> extends android.view.ViewDebug.PropertyInfo<T, java.lang.reflect.Field> {
        FieldPI(java.lang.reflect.Field p0, java.lang.Class<T> p1) { super(null, null, null); }
        public java.lang.Object invoke(java.lang.Object p0) throws java.lang.Exception { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface FlagToString {
        public int equals();
        public int mask();
        public java.lang.String name();
        public boolean outputIf() default true;
    }

    public static class HardwareCanvasProvider implements android.view.ViewDebug.CanvasProvider {
        private android.graphics.Picture mPicture;
        public HardwareCanvasProvider() {}
        public android.graphics.Bitmap createBitmap() { return null; }
        public android.graphics.Canvas getCanvas(android.view.View p0, int p1, int p2) { return null; }
    }

    public static interface HierarchyHandler {
        public void dumpViewHierarchyWithProperties(java.io.BufferedWriter p0, int p1);
        public android.view.View findHierarchyView(java.lang.String p0, int p1);
    }

    @java.lang.Deprecated
    public static enum HierarchyTraceType {
        BUILD_CACHE,
        DRAW,
        INVALIDATE,
        INVALIDATE_CHILD,
        INVALIDATE_CHILD_IN_PARENT,
        ON_LAYOUT,
        ON_MEASURE,
        REQUEST_LAYOUT;
        private static final android.view.ViewDebug.HierarchyTraceType[] $VALUES = null;
        private HierarchyTraceType() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface IntToString {
        public int from();
        public java.lang.String to();
    }

    private static class MethodPI<T extends java.lang.annotation.Annotation> extends android.view.ViewDebug.PropertyInfo<T, java.lang.reflect.Method> {
        MethodPI(java.lang.reflect.Method p0, java.lang.Class<T> p1) { super(null, null, null); }
        public java.lang.Object invoke(java.lang.Object p0) throws java.lang.Exception { return null; }
    }

    private static class PictureCallbackHandler implements java.lang.AutoCloseable, android.graphics.HardwareRenderer.PictureCapturedCallback, java.lang.Runnable {
        private final java.util.function.Function<android.graphics.Picture, java.lang.Boolean> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.concurrent.locks.ReentrantLock mLock = null;
        private final java.util.ArrayDeque<android.graphics.Picture> mQueue = null;
        private java.lang.Thread mRenderThread;
        private final android.graphics.HardwareRenderer mRenderer = null;
        private boolean mStopListening;
        private PictureCallbackHandler(android.graphics.HardwareRenderer p0, java.util.function.Function<android.graphics.Picture, java.lang.Boolean> p1, java.util.concurrent.Executor p2) {}
        public void close() {}
        public void onPictureCaptured(android.graphics.Picture p0) {}
        public void run() {}
    }

    private static abstract class PropertyInfo<T extends java.lang.annotation.Annotation, R extends java.lang.reflect.AccessibleObject & java.lang.reflect.Member> {
        public java.lang.String entrySuffix;
        public final R member = null;
        public final java.lang.String name = null;
        public final T property = null;
        public final java.lang.Class<?> returnType = null;
        public java.lang.String valueSuffix;
        PropertyInfo(java.lang.Class<T> p0, R p1, java.lang.Class<?> p2) {}
        static <T extends java.lang.annotation.Annotation> android.view.ViewDebug.PropertyInfo<T, ?> forField(java.lang.reflect.Field p0, java.lang.Class<T> p1) { return null; }
        static <T extends java.lang.annotation.Annotation> android.view.ViewDebug.PropertyInfo<T, ?> forMethod(java.lang.reflect.Method p0, java.lang.Class<T> p1) { return null; }
        public abstract java.lang.Object invoke(java.lang.Object p0) throws java.lang.Exception;
    }

    @java.lang.Deprecated
    public static enum RecyclerTraceType {
        BIND_VIEW,
        MOVE_FROM_ACTIVE_TO_SCRAP_HEAP,
        MOVE_TO_SCRAP_HEAP,
        NEW_VIEW,
        RECYCLE_FROM_ACTIVE_HEAP,
        RECYCLE_FROM_SCRAP_HEAP;
        private static final android.view.ViewDebug.RecyclerTraceType[] $VALUES = null;
        private RecyclerTraceType() {}
    }

    public static class SoftwareCanvasProvider implements android.view.ViewDebug.CanvasProvider {
        private android.graphics.Bitmap mBitmap;
        private android.graphics.Canvas mCanvas;
        private boolean mEnabledHwFeaturesInSwMode;
        public SoftwareCanvasProvider() {}
        public android.graphics.Bitmap createBitmap() { return null; }
        public android.graphics.Canvas getCanvas(android.view.View p0, int p1, int p2) { return null; }
    }

    private static class StreamingPictureCallbackHandler implements java.lang.AutoCloseable, android.graphics.HardwareRenderer.PictureCapturedCallback, java.lang.Runnable {
        private final java.util.concurrent.Callable<java.io.OutputStream> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.concurrent.locks.ReentrantLock mLock = null;
        private final java.util.ArrayDeque<android.graphics.Picture> mQueue = null;
        private java.lang.Thread mRenderThread;
        private final android.graphics.HardwareRenderer mRenderer = null;
        private boolean mStopListening;
        private StreamingPictureCallbackHandler(android.graphics.HardwareRenderer p0, java.util.concurrent.Callable<java.io.OutputStream> p1, java.util.concurrent.Executor p2) {}
        public void close() {}
        public void onPictureCaptured(android.graphics.Picture p0) {}
        public void run() {}
    }

    public static class ViewMethodInvocationSerializationException extends java.lang.Exception {
        ViewMethodInvocationSerializationException(java.lang.String p0) { super(); }
    }

    static interface ViewOperation {
        default public void pre() {}
        public void run();
    }
}
