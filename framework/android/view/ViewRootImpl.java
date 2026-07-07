package android.view;

public final class ViewRootImpl implements android.view.ViewParent, android.view.View.AttachInfo.Callbacks, android.view.ThreadedRenderer.DrawCallbacks, android.view.AttachedSurfaceControl {
    private static final int CONTENT_CAPTURE_ENABLED_FALSE = 2;
    private static final int CONTENT_CAPTURE_ENABLED_NOT_CHECKED = 0;
    private static final int CONTENT_CAPTURE_ENABLED_TRUE = 1;
    private static final boolean DBG = false;
    private static final boolean DEBUG_BLAST = false;
    private static final boolean DEBUG_CONFIGURATION = false;
    private static final boolean DEBUG_CONTENT_CAPTURE = false;
    private static final boolean DEBUG_DIALOG = false;
    private static final boolean DEBUG_DRAW = false;
    private static final boolean DEBUG_INPUT_RESIZE = false;
    private static final boolean DEBUG_INPUT_STAGES = false;
    private static final boolean DEBUG_KEEP_SCREEN_ON = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final boolean DEBUG_ORIENTATION = false;
    private static final boolean DEBUG_SCROLL_CAPTURE = false;
    private static final boolean DEBUG_SENSITIVE_CONTENT = false;
    private static final boolean DEBUG_TOUCH_NAVIGATION = false;
    private static final boolean DEBUG_TRACKBALL = false;
    private static final long DISABLE_DRAW_WAKE_LOCK = 349153669L;
    public static final long ENFORCE_THREAD_CHECKS_ON_VIEW_ROOT_IMPL_APIS = 464275874L;
    private static final int FRAME_RATE_BOOST_TIME = 3000;
    private static final int FRAME_RATE_CATEGORY_COUNT = 5;
    private static final int FRAME_RATE_INITIAL_TOUCH_BOOST_TIME = 30;
    private static final int FRAME_RATE_SETTING_REEVALUATE_TIME = 100;
    private static final int FRAME_RATE_SURFACE_REPLACED_TIME = 3000;
    private static final int FRAME_RATE_TOUCH_BOOST_TIME = 3000;
    private static final int IDLE_TIME_MILLIS = 750;
    private static final int INFREQUENT_UPDATE_COUNTS = 2;
    private static final int INFREQUENT_UPDATE_INTERVAL_MILLIS = 100;
    public static final int INTERMITTENT_STATE_INTERMITTENT = 0;
    public static final int INTERMITTENT_STATE_IN_TRANSITION = -1;
    public static final int INTERMITTENT_STATE_NOT_INTERMITTENT = 1;
    private static final int KEEP_CLEAR_AREA_REPORT_RATE_MILLIS = 100;
    private static final boolean LOCAL_LOGV = false;
    private static final int LOGTAG_INPUT_FOCUS = 62001;
    private static final int LOGTAG_VIEWROOT_DRAW_EVENT = 60004;
    private static final long LONG_CUJ_TIMEOUT_MS = Long.valueOf(0L);
    private static final int MAX_QUEUED_INPUT_EVENT_POOL_SIZE = 10;
    static final int MAX_TRACKBALL_DELAY = 250;
    private static final int MSG_CHECK_FOCUS = 13;
    private static final int MSG_CHECK_INVALIDATION_IDLE = 40;
    private static final int MSG_CLEAR_ACCESSIBILITY_FOCUS_HOST = 21;
    private static final int MSG_CLOSE_SYSTEM_DIALOGS = 14;
    private static final int MSG_DECOR_VIEW_GESTURE_INTERCEPTION = 38;
    private static final int MSG_DIE = 3;
    private static final int MSG_DISPATCH_APP_VISIBILITY = 8;
    private static final int MSG_DISPATCH_DRAG_EVENT = 15;
    private static final int MSG_DISPATCH_DRAG_LOCATION_EVENT = 16;
    private static final int MSG_DISPATCH_GET_NEW_SURFACE = 9;
    private static final int MSG_DISPATCH_INPUT_EVENT = 7;
    private static final int MSG_DISPATCH_KEY_FROM_AUTOFILL = 12;
    private static final int MSG_DISPATCH_KEY_FROM_IME = 11;
    private static final int MSG_DISPATCH_SYSTEM_UI_VISIBILITY = 17;
    private static final int MSG_FRAME_RATE_SETTING = 42;
    private static final int MSG_HIDE_INSETS = 32;
    private static final int MSG_INITIAL_TOUCH_BOOST_TIMEOUT = 44;
    private static final int MSG_INSETS_CONTROL_CHANGED = 29;
    private static final int MSG_INVALIDATE = 1;
    private static final int MSG_INVALIDATE_RECT = 2;
    private static final int MSG_INVALIDATE_WORLD = 22;
    private static final int MSG_KEEP_CLEAR_RECTS_CHANGED = 35;
    private static final int MSG_PAUSED_FOR_SYNC_TIMEOUT = 37;
    private static final int MSG_POINTER_CAPTURE_CHANGED = 28;
    private static final int MSG_PROCESS_INPUT_EVENTS = 19;
    private static final int MSG_REFRESH_POINTER_ICON = 41;
    private static final int MSG_REPORT_KEEP_CLEAR_RECTS = 36;
    private static final int MSG_REQUEST_A11Y_EMBEDDED_CONNECTION = 47;
    private static final int MSG_REQUEST_HARDWARE_RENDERER_OUTPUT_DISABLED = 45;
    private static final int MSG_REQUEST_KEYBOARD_SHORTCUTS = 26;
    private static final int MSG_REQUEST_SCROLL_CAPTURE = 33;
    private static final int MSG_REQUEST_VIEW_ANIMATIONS_DISABLED = 46;
    private static final int MSG_RESIZED = 4;
    private static final int MSG_RESIZED_REPORT = 5;
    private static final int MSG_SHOW_INSETS = 31;
    private static final int MSG_SURFACE_REPLACED_TIMEOUT = 43;
    private static final int MSG_SYNTHESIZE_INPUT_EVENT = 24;
    private static final int MSG_SYSTEM_GESTURE_EXCLUSION_CHANGED = 30;
    private static final int MSG_TOUCH_BOOST_TIMEOUT = 39;
    private static final int MSG_UPDATE_CONFIGURATION = 18;
    private static final int MSG_WINDOW_FOCUS_CHANGED = 6;
    private static final int MSG_WINDOW_MOVED = 23;
    private static final int MSG_WINDOW_TOUCH_MODE_CHANGED = 34;
    private static final boolean MT_RENDERER_AVAILABLE = true;
    private static final long NANOS_PER_MILLI = 1000000L;
    private static final long NANOS_PER_SEC = 1000000000L;
    private static final java.lang.String PROPERTY_PROFILE_RENDERING = "viewroot.profile_rendering";
    private static final int SCROLL_CAPTURE_REQUEST_TIMEOUT_MILLIS = 2500;
    private static final java.lang.String TAG = "ViewRootImpl";
    private static final int UNSET_SYNC_ID = -1;
    private static final long UNSET_TRAVERSAL_BARRIER = 9223372036854775807L;
    private static final int WMS_SYNC_MERGED = 3;
    private static final int WMS_SYNC_NONE = 0;
    private static final int WMS_SYNC_PENDING = 1;
    private static final int WMS_SYNC_RETURNED = 2;
    private static boolean sAlwaysAssignFocus;
    private static volatile boolean sAnrReported;
    static final java.util.concurrent.CopyOnWriteArrayList<android.view.View.CalledFromWrongThreadListener> sCalledFromWrongThreadListeners = null;
    private static boolean sCalledFromWrongThreadLogged;
    private static final boolean sCleanupInitialTouchBoostOnDetachValue = Boolean.valueOf(false);
    private static boolean sCompatibilityDone;
    private static final java.util.ArrayList<android.view.ViewRootImpl.ConfigChangedCallback> sConfigCallbacks = null;
    private static boolean sDebugWrongThreadInit;
    private static final boolean sEnableVrr = Boolean.valueOf(false);
    static boolean sFirstDrawComplete;
    static final java.util.ArrayList<java.lang.Runnable> sFirstDrawHandlers = null;
    private static boolean sPreInitializedBufferAllocator;
    private static boolean sProtoLogInitialized;
    static final java.lang.ThreadLocal<android.view.HandlerActionQueue> sRunQueues = null;
    private static final java.lang.Object sSyncProgressLock = null;
    private static boolean sToolkitDisableCategoryOnMrrFlagValue;
    private static boolean sToolkitFrameRateDebugFlagValue;
    private static boolean sToolkitMetricsForFrameRateDecisionFlagValue;
    private static boolean sToolkitSetFrameRateReadOnlyFlagValue;
    static android.gui.ITransactionHangCallback sTransactionHangCallback;
    private android.view.accessibility.IAccessibilityEmbeddedConnection mAccessibilityEmbeddedConnection;
    android.view.View mAccessibilityFocusedHost;
    android.view.accessibility.AccessibilityNodeInfo mAccessibilityFocusedVirtualView;
    final android.view.ViewRootImpl.AccessibilityInteractionConnectionManager mAccessibilityInteractionConnectionManager = null;
    android.view.AccessibilityInteractionController mAccessibilityInteractionController;
    final android.view.accessibility.AccessibilityManager mAccessibilityManager = null;
    private android.view.accessibility.AccessibilityWindowAttributes mAccessibilityWindowAttributes;
    private android.window.SurfaceSyncGroup mActiveSurfaceSyncGroup;
    private android.view.ViewRootImpl.ActivityConfigCallback mActivityConfigCallback;
    boolean mAdded;
    boolean mAddedTouchMode;
    private java.util.concurrent.atomic.AtomicBoolean mAppStartTimestampsSent;
    private boolean mAppStartTrackingStarted;
    private boolean mAppVisibilityChanged;
    boolean mAppVisible;
    boolean mApplyInsetsRequested;
    private final boolean mAtomicTraversalBarrier = false;
    final android.view.View.AttachInfo mAttachInfo = null;
    android.media.AudioManager mAudioManager;
    final java.lang.String mBasePackageName = null;
    private android.os.IBinder mBbqApplyToken;
    private android.graphics.BLASTBufferQueue mBlastBufferQueue;
    private final com.android.internal.graphics.drawable.BackgroundBlurDrawable.Aggregator mBlurRegionAggregator = null;
    private android.view.SurfaceControl mBoundsLayer;
    private android.view.SurfaceControl mCachedSurfaceControl;
    private int mCanvasOffsetX;
    private int mCanvasOffsetY;
    private boolean mCheckIfCanDraw;
    private final android.graphics.Rect mChildBoundingInsets = null;
    private boolean mChildBoundingInsetsChanged;
    final android.view.Choreographer mChoreographer = null;
    int mClientWindowLayoutFlags;
    private long mColorModeLastSetMillis;
    private android.window.CompatOnBackInvokedCallback mCompatOnBackInvokedCallback;
    final android.view.ViewRootImpl.SystemUiVisibilityInfo mCompatibleVisibilityInfo = null;
    final android.view.ViewRootImpl.ConsumeBatchedInputImmediatelyRunnable mConsumeBatchedInputImmediatelyRunnable = null;
    boolean mConsumeBatchedInputImmediatelyScheduled;
    boolean mConsumeBatchedInputScheduled;
    final android.view.ViewRootImpl.ConsumeBatchedInputCallback mConsumedBatchedInputCallback = null;
    int mContentCaptureEnabled;
    public final android.content.Context mContext = null;
    private android.view.ViewRootImpl.CornerRadii mCornerRadii;
    private boolean mCornerRadiiDirty;
    int mCurScrollY;
    private int mCurrentColorMode;
    android.view.View mCurrentDragView;
    private final int mDensity = 0;
    private android.graphics.Rect mDirty;
    private final boolean mDisableDrawWakeLock = false;
    int mDispatchedSystemBarAppearance;
    int mDispatchedSystemUiVisibility;
    android.view.Display mDisplay;
    boolean mDisplayDecorationCached;
    private final android.hardware.display.DisplayManager.DisplayListener mDisplayListener = null;
    android.content.ClipDescription mDragDescription;
    final android.graphics.PointF mDragPoint = null;
    private boolean mDragResizing;
    private boolean mDragResizingCujBegun;
    private java.lang.String mDrawTrace;
    private boolean mDrawnThisFrame;
    private boolean mDrewOnceForSync;
    private boolean mEnforceThreadChecksCompat;
    final java.util.concurrent.Executor mExecutor = null;
    final boolean mExtraDisplayListenerLogging = false;
    android.view.FallbackEventHandler mFallbackEventHandler;
    private boolean mFastScrollSoundEffectsEnabled;
    boolean mFirst;
    private long mFirstFramePresentedTimeNs;
    android.view.ViewRootImpl.InputStage mFirstInputStage;
    android.view.ViewRootImpl.InputStage mFirstPostImeInputStage;
    private boolean mForceInvertAllowed;
    private android.app.UiModeManager.ForceInvertStateChangeListener mForceInvertStateChangeListener;
    private boolean mForceNextConfigUpdate;
    boolean mForceNextWindowRelayout;
    private java.lang.String mFpsTraceName;
    private int mFrameRateCategoryChangeReason;
    private int mFrameRateCategoryHighCount;
    private int mFrameRateCategoryHighHintCount;
    private int mFrameRateCategoryLowCount;
    private int mFrameRateCategoryNormalCount;
    private java.lang.String mFrameRateCategoryView;
    int mFrameRateCompatibility;
    private final android.view.SurfaceControl.Transaction mFrameRateTransaction = null;
    boolean mFullRedrawNeeded;
    private final android.view.ViewRootRectTracker mGestureExclusionTracker = null;
    final android.view.ViewRootImpl.ViewRootHandler mHandler = null;
    boolean mHandlesWindowInsetsAnimation;
    boolean mHandlingLayoutInLayoutRequest;
    private final android.view.HandwritingInitiator mHandwritingInitiator = null;
    private android.graphics.HardwareRenderer.CornerRadiiCallback mHardwareRendererCornerRadiiCallback;
    android.graphics.HardwareRendererObserver mHardwareRendererObserver;
    int mHardwareXOffset;
    int mHardwareYOffset;
    private boolean mHasPendingKeepClearAreaChange;
    boolean mHasPendingTransactions;
    private final android.view.HdrRenderState mHdrRenderState = null;
    int mHeight;
    final android.view.ViewRootImpl.HighContrastTextManager mHighContrastTextManager = null;
    private final android.view.ImeBackAnimationController mImeBackAnimationController = null;
    private final android.view.ImeFocusController mImeFocusController = null;
    boolean mImmediateScrolling;
    private boolean mInLayout;
    private int mInfrequentUpdateCount;
    private final android.view.ViewRootImpl.CalledFromWrongThreadException mInitStack = null;
    private android.window.ActivityWindowInfo mInitialActivityWindowInfo;
    private final android.view.input.InputEventCompatHandler mInputCompatHandler = null;
    private final android.view.InputEventAssigner mInputEventAssigner = null;
    protected final android.view.InputEventConsistencyVerifier mInputEventConsistencyVerifier = null;
    private android.view.ViewRootImpl.WindowInputEventReceiver mInputEventReceiver;
    android.view.InputQueue mInputQueue;
    android.view.InputQueue.Callback mInputQueueCallback;
    private boolean mInsetsAnimationRunning;
    private final android.view.InsetsController mInsetsController = null;
    private float mInvCompatScale;
    final android.view.ViewRootImpl.InvalidateOnAnimationRunnable mInvalidateOnAnimationRunnable = null;
    private boolean mInvalidateRootRequested;
    private boolean mInvalidationIdleMessagePosted;
    private final android.view.ViewInvalidationTracer mInvalidationTracer = null;
    private boolean mIpcRenderingEnabled;
    boolean mIsAmbientMode;
    public boolean mIsAnimating;
    private boolean mIsDisablingViewAnimationsRequested;
    private boolean mIsDragResizeCropSet;
    boolean mIsDrawing;
    private boolean mIsFrameRateBoosting;
    private boolean mIsFrameRateConflicted;
    private boolean mIsHardwareRendererOutputDisabled;
    boolean mIsInTraversal;
    private boolean mIsPressedGesture;
    private final boolean mIsStylusPointerIconEnabled = false;
    private boolean mIsSurfaceColorSpaceAgnostic;
    private boolean mIsSurfaceOpaque;
    private boolean mIsTouchBoosting;
    private boolean mIsWouldBeOpaqueWithoutCorners;
    private android.graphics.Rect mKeepClearAccessibilityFocusRect;
    private final android.view.ViewRootRectTracker mKeepClearRectsTracker = null;
    private float mLargestChildPercentage;
    private java.lang.String mLargestViewTraceName;
    private int mLastClickToolType;
    private final android.content.res.Configuration mLastConfigurationFromResources = null;
    private boolean mLastDrawScreenOff;
    final android.view.ViewTreeObserver.InternalInsetsInfo mLastGivenInsets = null;
    android.view.WindowInsets mLastInsetsDuringAnimationProgress;
    private final android.graphics.Rect mLastLayoutFrame = null;
    private final android.graphics.Rect mLastLayoutParentFrame = null;
    java.lang.String mLastPerformDrawSkippedReason;
    java.lang.String mLastPerformTraversalsSkipDrawReason;
    private float mLastPreferredFrameRate;
    private int mLastPreferredFrameRateCategory;
    java.lang.String mLastReportNextDrawReason;
    private int mLastReportedActiveControlsSeq;
    private android.window.ActivityWindowInfo mLastReportedActivityWindowInfo;
    private final android.window.ClientWindowFrames mLastReportedFrames = null;
    private int mLastReportedInsetsStateSeq;
    private final android.util.MergedConfiguration mLastReportedMergedConfiguration = null;
    java.lang.ref.WeakReference<android.view.View> mLastScrolledFocus;
    int mLastSeqId;
    private android.graphics.RectF mLastSetClientDrawnRadiiBounds;
    private final android.graphics.Point mLastSurfaceSize = null;
    int mLastSyncSeqId;
    int mLastSystemUiVisibility;
    int mLastTouchDeviceId;
    int mLastTouchMetaState;
    final android.graphics.PointF mLastTouchPoint = null;
    int mLastTouchPointerId;
    int mLastTouchSource;
    private boolean mLastTraversalWasVisible;
    private long mLastUpdateTimeMillis;
    private android.view.WindowInsets mLastWindowInsets;
    boolean mLayoutRequested;
    java.util.ArrayList<android.view.View> mLayoutRequesters;
    private final android.os.IBinder mLeashToken = null;
    volatile java.lang.Object mLocalDragState;
    final android.view.WindowLeaked mLocation = null;
    final android.os.Looper mLooper = null;
    private int mMeasuredHeight;
    private int mMeasuredWidth;
    private int mMinusOneFrameIntervalMillis;
    private int mMinusTwoFrameIntervalMillis;
    private boolean mNeedsRendererSetup;
    boolean mNewSurfaceNeeded;
    private final int mNoncompatDensity = 0;
    private int mNumPausedForSync;
    private final android.window.WindowOnBackInvokedDispatcher mOnBackInvokedDispatcher = null;
    int mOrigWindowType;
    android.graphics.Rect mOverrideInsetsFrame;
    boolean mPausedForTransition;
    private android.window.ActivityWindowInfo mPendingActivityWindowInfo;
    private boolean mPendingDragResizing;
    int mPendingInputEventCount;
    android.view.ViewRootImpl.QueuedInputEvent mPendingInputEventHead;
    java.lang.String mPendingInputEventQueueLengthCounterName;
    android.view.ViewRootImpl.QueuedInputEvent mPendingInputEventTail;
    private final android.util.MergedConfiguration mPendingMergedConfiguration = null;
    private final android.view.SurfaceControl.Transaction mPendingTransaction = null;
    private java.util.ArrayList<android.animation.LayoutTransition> mPendingTransitions;
    private boolean mPerfHintSessionDisabled;
    boolean mPerformContentCapture;
    boolean mPointerCapture;
    private android.view.MotionEvent mPointerIconEvent;
    private float mPreferredFrameRate;
    private int mPreferredFrameRateCategory;
    private long mPreviousFrameDrawnTime;
    private android.window.SurfaceSyncGroup mPreviousSyncSafeguard;
    private final java.lang.Object mPreviousSyncSafeguardLock = null;
    android.graphics.Region mPreviousTouchableRegion;
    private int mPreviousTransformHint;
    final android.graphics.Region mPreviousTransparentRegion = null;
    boolean mProcessInputEventsScheduled;
    private boolean mProfileRendering;
    final android.os.MessageQueue mQueue = null;
    private android.view.ViewRootImpl.QueuedInputEvent mQueuedInputEventPool;
    private int mQueuedInputEventPoolSize;
    private boolean mRelayoutRequested;
    private final android.view.WindowRelayoutResult mRelayoutResult = null;
    private int mRelayoutSeq;
    private boolean mRemoved;
    private android.view.Choreographer.FrameCallback mRenderProfiler;
    private boolean mRenderProfilingEnabled;
    private boolean mRenderTargetIsValid;
    private long mRenderThreadDrawStartTimeNs;
    boolean mReportNextDraw;
    private android.view.PointerIcon mResolvedPointerIcon;
    private java.util.HashSet<android.view.ScrollCaptureCallback> mRootScrollCaptureCallbacks;
    android.graphics.Paint mRoundDisplayAccessibilityHighlightPaint;
    private long mScrollCaptureRequestTimeout;
    boolean mScrollMayChange;
    int mScrollY;
    android.widget.Scroller mScroller;
    private final boolean mSendPerfHintOnTouch = false;
    android.view.ViewRootImpl.SendWindowContentChangedAccessibilityEvent mSendWindowContentChangedAccessibilityEvent;
    private final android.view.ISensitiveContentProtectionManager mSensitiveContentProtectionService = null;
    int mSeqId;
    private final android.window.sharedsurface.SharedAnimationController mSharedAnimationController = null;
    private final java.util.concurrent.Executor mSimpleExecutor = null;
    int mSoftInputMode;
    android.view.View mStartedDragViewForA11y;
    boolean mStopped;
    public final android.view.Surface mSurface = null;
    private final java.util.ArrayList<android.view.ViewRootImpl.SurfaceChangedCallback> mSurfaceChangedCallbacks = null;
    private final android.view.SurfaceControl mSurfaceControl = null;
    private android.view.ViewRootImpl.TakenSurfaceHolder mSurfaceHolder;
    android.view.SurfaceHolder.Callback2 mSurfaceHolderCallback;
    private boolean mSurfaceReplaced;
    private int mSurfaceSequenceId;
    private final android.graphics.Point mSurfaceSize = null;
    private boolean mSyncBuffer;
    int mSyncSeqId;
    private int mSyncedWindowInsetsAnimationCount;
    android.view.ViewRootImpl.InputStage mSyntheticInputStage;
    private java.lang.String mTag;
    final int mTargetSdkVersion = 0;
    java.util.HashSet<android.view.View> mTempHashSet;
    private final android.view.InsetsState mTempInsets = null;
    private final android.graphics.Rect mTempRect = null;
    private final android.app.WindowConfiguration mTempWinConfig = null;
    final java.lang.Thread mThread = null;
    private java.util.ArrayList<android.view.View> mThreadedRendererViews;
    private java.util.ArrayList<android.view.View> mThreadedRendererViewsCache;
    private final android.window.ClientWindowFrames mTmpFrames = null;
    final int[] mTmpLocation = null;
    final android.util.TypedValue mTmpValue = null;
    private boolean mTouchAndDrawn;
    android.graphics.Region mTouchableRegion;
    private final android.view.SurfaceControl.Transaction mTransaction = null;
    private java.util.ArrayList<android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener> mTransformHintListeners;
    android.content.res.CompatibilityInfo.Translator mTranslator;
    final android.graphics.Region mTransparentRegion = null;
    int mTraversalBarrier;
    private final java.util.concurrent.atomic.AtomicLong mTraversalBarrierAtomic = null;
    final android.view.ViewRootImpl.TraversalCallback mTraversalCallback = null;
    public boolean mTraversalScheduled;
    private int mTypesHiddenByFlags;
    boolean mUnbufferedInputDispatch;
    int mUnbufferedInputSource;
    private final android.view.ViewRootImpl.UnhandledKeyManager mUnhandledKeyManager = null;
    private final android.view.ViewRootRectTracker mUnrestrictedKeepClearRectsTracker = null;
    boolean mUpcomingInTouchMode;
    boolean mUpcomingWindowFocus;
    private boolean mUpdateSurfaceNeeded;
    private boolean mUseMTRenderer;
    private boolean mUsesSyncedInsetsAnimationByDefault;
    android.os.Vibrator mVibrator;
    android.view.View mView;
    private final boolean mViewBoundsSandboxingEnabled = false;
    final android.view.ViewConfiguration mViewConfiguration = null;
    protected final android.view.ViewFrameInfo mViewFrameInfo = null;
    private int mViewLayoutDirectionInitial;
    private boolean mViewMeasureDeferred;
    int mViewVisibility;
    private final android.graphics.Rect mVisRect = null;
    private boolean mWasLastDrawCanceled;
    int mWidth;
    boolean mWillDrawSoon;
    final android.graphics.Rect mWinFrame = null;
    private final android.graphics.Rect mWinFrameInScreen = null;
    final android.view.ViewRootImpl.W mWindow = null;
    public final android.view.WindowManager.LayoutParams mWindowAttributes = null;
    boolean mWindowAttributesChanged;
    final java.util.ArrayList<android.view.WindowCallbacks> mWindowCallbacks = null;
    java.util.concurrent.CountDownLatch mWindowDrawCountDown;
    boolean mWindowFocusChanged;
    private int mWindowInsetsAnimationCount;
    private final android.view.WindowLayout mWindowLayout = null;
    final android.view.IWindowSession mWindowSession = null;
    private java.util.function.Predicate<android.view.KeyEvent> mWindowlessBackKeyCallback;
    private android.window.SurfaceSyncGroup mWmsRequestSyncGroup;
    int mWmsRequestSyncGroupState;
    public ViewRootImpl(android.content.Context p0, android.view.Display p1) {}
    public ViewRootImpl(android.content.Context p0, android.view.Display p1, android.view.IWindowSession p2, android.view.WindowLayout p3) {}
    public static void addConfigCallback(android.view.ViewRootImpl.ConfigChangedCallback p0) {}
    public static void addFirstDrawHandler(java.lang.Runnable p0) {}
    private void addFrameCommitCallbackIfNeeded() {}
    private int adjustLayoutInDisplayCutoutMode(android.view.WindowManager.LayoutParams p0) { return 0; }
    public static void adjustLayoutParamsForCompatibility(android.view.WindowManager.LayoutParams p0, int p1, boolean p2) {}
    private static void appendGfxInfo(android.view.View p0, android.view.ViewRootImpl.GfxInfo p1) {}
    private void applyKeepScreenOnFlag(android.view.WindowManager.LayoutParams p0) {}
    private void applyOpacity(boolean p0) {}
    private void applySensitiveContentAppProtection(boolean p0) {}
    private void boostFrameRate(int p0) {}
    private boolean canRelayoutAsync(java.lang.StringBuilder p0) { return false; }
    static java.lang.String categoryToString(int p0) { return null; }
    private boolean checkForLeavingTouchModeAndConsume(android.view.KeyEvent p0) { return false; }
    private void checkThreadCompat() {}
    private void clearLowProfileModeIfNeeded(int p0) {}
    private void collectFrameRateDecisionMetrics() {}
    private void collectRootScrollCaptureTargets(android.view.ScrollCaptureSearchResults p0) {}
    private boolean collectViewAttributes() { return false; }
    private static void computeRenderNodeUsage(android.graphics.RenderNode p0, android.view.ViewRootImpl.GfxInfo p1) {}
    private android.view.SurfaceControl createSurfaceControl() { return null; }
    private void createSyncIfNeeded() {}
    private void deliverInputEvent(android.view.ViewRootImpl.QueuedInputEvent p0) {}
    private void destroyAndInvalidate() {}
    private void destroyHardwareRenderer() {}
    private void destroySurface() {}
    private int determineForceInvertDarkOverride(boolean p0) { return 0; }
    private void dispatchDispatchSystemUiVisibilityChanged() {}
    private void dispatchFocusEvent(boolean p0, boolean p1) {}
    private void dispatchInsetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl.Array p1) {}
    private void dispatchPointerCaptureChanged(boolean p0) {}
    private void dispatchResized(android.view.WindowRelayoutResult p0, boolean p1, boolean p2, int p3, boolean p4, boolean p5) {}
    private void dispatchScrollCaptureSearchResponse(android.view.IScrollCaptureResponseListener p0, android.view.ScrollCaptureSearchResults p1) {}
    private void dispatchTransformHintChanged(int p0) {}
    private boolean draw(boolean p0, android.window.SurfaceSyncGroup p1, boolean p2) { return false; }
    private void drawAccessibilityFocusedBorderOnRoundDisplay(android.graphics.Canvas p0, android.graphics.Rect p1, int p2, android.graphics.Paint p3) {}
    private void drawAccessibilityFocusedDrawableIfNeeded(android.graphics.Canvas p0) {}
    private boolean drawSoftware(android.view.Surface p0, android.view.View.AttachInfo p1, int p2, int p3, boolean p4, android.graphics.Rect p5, android.graphics.Rect p6) { return false; }
    private void dumpViewHierarchy(java.lang.String p0, java.io.PrintWriter p1, android.view.View p2) {}
    private void enableHardwareAcceleration(android.view.WindowManager.LayoutParams p0) {}
    private void endDragResizing() {}
    private boolean ensureTouchModeLocally(boolean p0) { return false; }
    private boolean enterTouchMode() { return false; }
    private static android.view.ViewGroup findAncestorToTakeFocusInTouchMode(android.view.View p0) { return null; }
    private android.view.accessibility.AccessibilityNodeInfo findFocusedVirtualNode(android.view.accessibility.AccessibilityNodeProvider p0) { return null; }
    private void finishInputEvent(android.view.ViewRootImpl.QueuedInputEvent p0) {}
    private void fireAccessibilityFocusEventIfHasFocusedNode() {}
    private static void forceLayout(android.view.View p0) {}
    private android.graphics.drawable.Drawable getAccessibilityFocusedDrawable() { return null; }
    private boolean getAccessibilityFocusedRect(android.graphics.Rect p0) { return false; }
    private android.media.AudioManager getAudioManager() { return null; }
    private android.view.autofill.AutofillManager getAutofillManager() { return null; }
    private android.view.autofill.AutofillManager getAutofillManagerFromFirstChild() { return null; }
    private android.view.View getCommonPredecessor(android.view.View p0, android.view.View p1) { return null; }
    private android.app.WindowConfiguration getCompatWindowConfiguration() { return null; }
    private android.content.res.Configuration getConfiguration() { return null; }
    private android.view.View getFocusedViewOrNull() { return null; }
    private int getImpliedSystemUiVisibility(android.view.WindowManager.LayoutParams p0) { return 0; }
    private int getNightMode() { return 0; }
    private static int getRootMeasureSpec(int p0, int p1, int p2) { return 0; }
    private android.graphics.Paint getRoundDisplayAccessibilityHighlightPaint() { return null; }
    private int getRoundDisplayRadius() { return 0; }
    static android.view.HandlerActionQueue getRunQueue() { return null; }
    private android.view.View getSourceForAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return null; }
    private android.view.SurfaceControl getSurfaceControlForRelayout(int p0) { return null; }
    private android.os.Vibrator getSystemVibrator() { return null; }
    private java.util.ArrayList<android.view.View> getValidLayoutRequesters(java.util.ArrayList<android.view.View> p0, boolean p1) { return null; }
    private boolean getViewBoundsSandboxingEnabled() { return false; }
    private android.graphics.Rect getWindowBoundsInsetSystemBars() { return null; }
    private void handleContentCaptureFlush() {}
    private void handleDispatchSystemUiVisibilityChanged() {}
    private void handleDragEvent(android.view.DragEvent p0) {}
    private void handleOutOfResourcesException(android.view.Surface.OutOfResourcesException p0) {}
    private void handlePointerCaptureChanged(boolean p0) {}
    private void handleResized(android.window.ClientWindowFrames p0, boolean p1, android.util.MergedConfiguration p2, android.view.InsetsState p3, boolean p4, int p5, int p6, boolean p7, boolean p8, android.window.ActivityWindowInfo p9) {}
    private void handleSyncRequestWhenNoAsyncDraw(android.window.SurfaceSyncGroup p0, boolean p1, android.view.SurfaceControl.Transaction p2, java.lang.String p3) {}
    private void handleWindowContentChangedEvent(android.view.accessibility.AccessibilityEvent p0) {}
    private void handleWindowFocusChanged() {}
    private void handleWindowTouchModeChanged() {}
    private boolean hasSystemApplicationOverlayAppOp() { return false; }
    private void hideInsets(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
    private void initializeProtoLogInProcess() {}
    private void invalidateRectOnScreen(android.graphics.Rect p0) {}
    public static void invokeFunctor(long p0, boolean p1) {}
    private boolean isAccessibilityFocusDirty() { return false; }
    private boolean isAutofillUiShowing() { return false; }
    private boolean isContentCaptureReallyEnabled() { return false; }
    private boolean isInTouchMode() { return false; }
    private boolean isInputWindow() { return false; }
    private static boolean isNavigationKey(android.view.KeyEvent p0) { return false; }
    static boolean isTerminalInputEvent(android.view.InputEvent p0) { return false; }
    private static boolean isTypingKey(android.view.KeyEvent p0) { return false; }
    public static boolean isViewDescendantOf(android.view.View p0, android.view.View p1) { return false; }
    private boolean leaveTouchMode() { return false; }
    private void logAndTrace(java.lang.String p0) {}
    private void logColorMode(int p0, boolean p1) {}
    private void logHandledSystemKey(android.view.KeyEvent p0, boolean p1) {}
    private void maybeFireAccessibilityWindowStateChangedEvent() {}
    private void maybeHandleWindowMove(android.graphics.Rect p0) {}
    private void maybeSendAppStartTimes() {}
    private void maybeUpdateTooltip(android.view.MotionEvent p0) {}
    private boolean measureHierarchy(android.view.View p0, android.view.WindowManager.LayoutParams p1, android.content.res.Resources p2, int p3, int p4, boolean p5) { return false; }
    private android.view.ViewRootImpl.CalledFromWrongThreadException newCalledFromWrongThreadException(boolean p0) { return null; }
    private void notifyContentCaptureEvents() {}
    private void notifyDrawStarted(boolean p0) {}
    private void notifyHolderSurfaceDestroyed() {}
    private void notifySurfaceCreated(android.view.SurfaceControl.Transaction p0) {}
    private void notifySurfaceDestroyed() {}
    private void notifySurfaceReplaced(android.view.SurfaceControl.Transaction p0) {}
    private android.view.ViewRootImpl.QueuedInputEvent obtainQueuedInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1, int p2) { return null; }
    private void onActiveControlsChanged(android.view.InsetsSourceControl.Array p0) {}
    private void onClientWindowFramesChanged(android.window.ClientWindowFrames p0) {}
    private void onInsetsStateChanged(android.view.InsetsState p0) {}
    private void performConfigurationChange(android.util.MergedConfiguration p0, boolean p1, int p2, android.window.ActivityWindowInfo p3) {}
    private void performContentCaptureInitialReport() {}
    private boolean performDraw(android.window.SurfaceSyncGroup p0) { return false; }
    private void performLayout(android.view.WindowManager.LayoutParams p0, int p1, int p2) {}
    private void performMeasure(int p0, int p1) {}
    private void performTraversals(long p0) {}
    private void postSendWindowContentChangedCallback(android.view.View p0, int p1) {}
    private void postTraversalBarrier() {}
    private void preInitBufferAllocator() {}
    private void prepareCornerRadiiForDraw() {}
    private void prepareSurfaces() {}
    private void profileRendering(boolean p0) {}
    private static java.lang.String reasonToString(int p0) { return null; }
    private void recalculatePerformanceHintSessionNeeded() {}
    private void recycleQueuedInputEvent(android.view.ViewRootImpl.QueuedInputEvent p0) {}
    private void registerBackCallbackOnWindow() {}
    private void registerCallbackForPendingTransactions() {}
    private void registerCallbacksForSync(boolean p0, android.window.SurfaceSyncGroup p1) {}
    private void registerCompatOnBackInvokedCallback() {}
    private void registerListeners() {}
    private void registerSharedAnimationControllerOnWindow() {}
    private int relayoutWindow(android.view.WindowManager.LayoutParams p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
    public static void removeConfigCallback(android.view.ViewRootImpl.ConfigChangedCallback p0) {}
    private void removeSendWindowContentChangedCallback() {}
    private void removeTraversalBarrier() {}
    private void removeVrrMessages() {}
    private void reportDrawFinished(android.view.SurfaceControl.Transaction p0, int p1) {}
    private void reportNextDraw(java.lang.String p0) {}
    private void requestDrawWindow() {}
    private void resumeAfterSyncTimeout() {}
    private void safeguardOverlappingSyncs(android.window.SurfaceSyncGroup p0) {}
    private void scheduleProcessInputEvents() {}
    private boolean sendBackKeyEvent(int p0, boolean p1) { return false; }
    private void sendCheckInvalidationIdle() {}
    private void setAccessibilityWindowAttributesIfNeeded() {}
    private void setBoundsLayerCrop(android.view.SurfaceControl.Transaction p0) {}
    private void setCategoryFromCategoryCounts() {}
    public static boolean setDebugWrongThreadInit(boolean p0) { return false; }
    private void setFrame(android.graphics.Rect p0) {}
    private boolean setMeasuredRootSizeFromSpec(int p0, int p1) { return false; }
    private void setPreferredFrameRate(float p0) {}
    private void setPreferredFrameRateCategory(int p0) {}
    private void setTag() {}
    private boolean shouldDispatchCutout() { return false; }
    private boolean shouldEnableDvrr() { return false; }
    private boolean shouldKeepSystemApplicationOverlay(android.view.WindowManager.LayoutParams p0, android.view.WindowManager.LayoutParams p1) { return false; }
    private static boolean shouldOptimizeMeasure(android.view.WindowManager.LayoutParams p0) { return false; }
    private boolean shouldSetFrameRate() { return false; }
    private boolean shouldSetFrameRateCategory() { return false; }
    private boolean shouldTouchBoost(int p0, int p1) { return false; }
    private static boolean shouldUseDisplaySize(android.view.WindowManager.LayoutParams p0) { return false; }
    private void showInsets(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
    private void startDragResizing() {}
    private void throwCalledFromWrongThreadException() {}
    private void unregisterListeners() {}
    private boolean updateBoundsLayer(android.view.SurfaceControl.Transaction p0) { return false; }
    private void updateColorModeIfNeeded(int p0, float p1) {}
    private void updateCompatSystemUiVisibilityInfo(int p0, int p1, int p2, int p3) {}
    private boolean updateContentDrawBounds() { return false; }
    private void updateDisplayDecoration() {}
    private void updateForceDarkMode() {}
    private void updateFrameRateFromThreadedRendererViews() {}
    private void updateInfrequentCount() {}
    private void updateInternalDisplay(int p0, android.content.res.Resources p1) {}
    private void updateKeepClearForAccessibilityFocusRect() {}
    private void updateLastConfigurationFromResources(android.content.res.Configuration p0) {}
    private void updateOpacity(android.view.WindowManager.LayoutParams p0, boolean p1, boolean p2) {}
    private void updatePerformanceHintSession() {}
    private boolean updatePointerIcon(android.view.MotionEvent p0) { return false; }
    private void updateRendererSurfaceControlAndBbq(android.view.SurfaceControl p0, android.graphics.BLASTBufferQueue p1) {}
    private int updateSurfaceControl(int p0) { return 0; }
    private void updateSyncInProgressCount(android.window.SurfaceSyncGroup p0) {}
    public void addOnBufferTransformHintChangedListener(android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener p0) {}
    public void addScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    void addSensitiveContentAppProtection() {}
    public void addSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
    public void addThreadedRendererView(android.view.View p0) {}
    void addToSync(android.window.SurfaceSyncGroup p0) {}
    public void addWindowCallbacks(android.view.WindowCallbacks p0) {}
    public void adjustAccessibilityFocusedRectBoundsIfNeeded(android.graphics.Rect p0) {}
    public void applyTransactionInOrder(android.view.SurfaceControl.Transaction p0) {}
    public boolean applyTransactionOnDraw(android.view.SurfaceControl.Transaction p0) { return false; }
    void applyViewBoundsSandboxingIfNeeded(android.graphics.Rect p0) {}
    public void applyViewLocationSandboxingIfNeeded(int[] p0) {}
    public void bringChildToFront(android.view.View p0) {}
    public android.view.SurfaceControl.Transaction buildReparentTransaction(android.view.SurfaceControl p0) { return null; }
    public boolean canResolveLayoutDirection() { return false; }
    public boolean canResolveTextAlignment() { return false; }
    public boolean canResolveTextDirection() { return false; }
    public void cancelInvalidate(android.view.View p0) {}
    void changeCanvasOpacity(boolean p0) {}
    void checkThread() {}
    public void childDrawableStateChanged(android.view.View p0) {}
    public void childHasTransientStateChanged(android.view.View p0, boolean p1) {}
    public void clearChildFocus(android.view.View p0) {}
    public void clearSystemVibrator() {}
    public void controlInsetsForCompatibility(android.view.WindowManager.LayoutParams p0) {}
    public com.android.internal.graphics.drawable.BackgroundBlurDrawable createBackgroundBlurDrawable() { return null; }
    public void createContextMenu(android.view.ContextMenu p0) {}
    public android.view.SurfaceControl createMirror() { return null; }
    public void debug() {}
    void decorViewInterceptionChanged(boolean p0) {}
    void destroyHardwareResources() {}
    public void detachFunctor(long p0) {}
    public int determineForceDarkType() { return 0; }
    boolean die(boolean p0) { return false; }
    int dipToPx(int p0) { return 0; }
    public void dispatchAppVisibility(boolean p0, int p1) {}
    public void dispatchApplyInsets(android.view.View p0) {}
    public void dispatchBlurRegions(float[][] p0, long p1) {}
    public void dispatchCheckFocus() {}
    public void dispatchCloseSystemDialogs(java.lang.String p0) {}
    public void dispatchCompatFakeFocus() {}
    void dispatchDetachedFromWindow() {}
    public void dispatchDragEvent(android.view.DragEvent p0) {}
    public void dispatchGetNewSurface() {}
    public void dispatchInputEvent(android.view.InputEvent p0) {}
    public void dispatchInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1) {}
    public void dispatchInvalidateDelayed(android.view.View p0, long p1) {}
    public void dispatchInvalidateOnAnimation(android.view.View p0) {}
    public void dispatchInvalidateRectDelayed(android.view.View.AttachInfo.InvalidateInfo p0, long p1) {}
    public void dispatchInvalidateRectOnAnimation(android.view.View.AttachInfo.InvalidateInfo p0) {}
    public void dispatchKeyFromAutofill(android.view.KeyEvent p0) {}
    public void dispatchKeyFromIme(android.view.KeyEvent p0) {}
    public void dispatchMoved(int p0, int p1) {}
    public void dispatchRequestKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) {}
    public void dispatchScrollCaptureRequest(android.view.IScrollCaptureResponseListener p0) {}
    public void dispatchScrollToTop(int p0) {}
    public void dispatchUnhandledInputEvent(android.view.InputEvent p0) {}
    public boolean dispatchUnhandledKeyEvent(android.view.KeyEvent p0) { return false; }
    public void dispatchWindowInsetsAnimationEnd(android.view.WindowInsetsAnimation p0, boolean p1, boolean p2, boolean p3) {}
    public void dispatchWindowInsetsAnimationPrepare(android.view.WindowInsetsAnimation p0, boolean p1, boolean p2, boolean p3) {}
    public android.view.WindowInsets dispatchWindowInsetsAnimationProgress(android.view.WindowInsets p0, android.view.InsetsState p1, java.util.List<android.view.WindowInsetsAnimation> p2, boolean p3, boolean p4, boolean p5, int p6) { return null; }
    public android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(android.view.WindowInsetsAnimation p0, android.view.WindowInsetsAnimation.Bounds p1, boolean p2, boolean p3, boolean p4) { return null; }
    public boolean dispatchesApplyInsetsDuringAnimationProgress() { return false; }
    boolean doConsumeBatchedInput(long p0) { return false; }
    void doDie() {}
    void doProcessInputEvents() {}
    void doTraversal(long p0) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    android.view.ViewRootImpl.QueuedInputEvent enqueueInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1, int p2, boolean p3) { return null; }
    public void enqueueInputEvent(android.view.InputEvent p0) {}
    boolean ensureTouchMode(boolean p0) { return false; }
    public android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcherForChild(android.view.View p0, android.view.View p1) { return null; }
    public android.view.View focusSearch(android.view.View p0, int p1) { return null; }
    public void focusableViewAvailable(android.view.View p0) {}
    void forceWmRelayout() {}
    public android.view.accessibility.IAccessibilityEmbeddedConnection getAccessibilityEmbeddedConnection() { return null; }
    public android.view.View getAccessibilityFocusedHost() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getAccessibilityFocusedVirtualView() { return null; }
    public android.view.AccessibilityInteractionController getAccessibilityInteractionController() { return null; }
    public android.os.IBinder getAccessibilityLeashToken() { return null; }
    public int getBufferTransformHint() { return 0; }
    public boolean getChildLocalHitRegion(android.view.View p0, android.graphics.Region p1, android.graphics.Matrix p2, boolean p3) { return false; }
    public boolean getChildVisibleRect(android.view.View p0, android.graphics.Rect p1, android.graphics.Point p2) { return false; }
    public android.view.Choreographer getChoreographer() { return null; }
    public int getDirectAccessibilityConnectionId() { return 0; }
    void getDisplayFrame(android.graphics.Rect p0) {}
    public int getDisplayId() { return 0; }
    public boolean getFrameRateBoostOnTouchEnabled() { return false; }
    public int getFrameRateCompatibility() { return 0; }
    android.view.ViewRootImpl.GfxInfo getGfxInfo() { return null; }
    public android.view.HandwritingInitiator getHandwritingInitiator() { return null; }
    public boolean getHasArrSupport() { return false; }
    public int getHeight() { return 0; }
    int getHostVisibility() { return 0; }
    java.lang.String getHostVisibilityReason() { return null; }
    public android.view.ImeFocusController getImeFocusController() { return null; }
    public android.os.IBinder getInputToken() { return null; }
    public android.window.InputTransferToken getInputTransferToken() { return null; }
    public android.view.InsetsController getInsetsController() { return null; }
    public boolean getIsFrameRateBoosting() { return false; }
    public boolean getIsTouchBoosting() { return false; }
    public int getLastClickToolType() { return 0; }
    public float getLastPreferredFrameRate() { return 0.0f; }
    public int getLastPreferredFrameRateCategory() { return 0; }
    public int getLastTouchDeviceId() { return 0; }
    public int getLastTouchMetaState() { return 0; }
    public void getLastTouchPoint(android.graphics.Point p0) {}
    public int getLastTouchPointerId() { return 0; }
    public int getLastTouchSource() { return 0; }
    public int getLayoutDirection() { return 0; }
    final android.view.WindowLeaked getLocation() { return null; }
    public android.window.WindowOnBackInvokedDispatcher getOnBackInvokedDispatcher() { return null; }
    public android.window.SurfaceSyncGroup getOrCreateSurfaceSyncGroup() { return null; }
    public android.view.ViewParent getParent() { return null; }
    public android.view.ViewParent getParentForAccessibility() { return null; }
    public float getPreferredFrameRate() { return 0.0f; }
    public int getPreferredFrameRateCategory() { return 0; }
    public java.util.List<android.graphics.Rect> getRootSystemGestureExclusionRects() { return null; }
    public long getScrollCaptureRequestTimeout() { return 0L; }
    public int getScrollY() { return 0; }
    public android.view.SurfaceControl getSurfaceControl() { return null; }
    int getSurfaceSequenceId() { return 0; }
    public int getTextAlignment() { return 0; }
    public int getTextDirection() { return 0; }
    public java.lang.CharSequence getTitle() { return null; }
    protected android.graphics.FrameInfo getUpdatedFrameInfo() { return null; }
    public android.view.View getView() { return null; }
    public int getWidth() { return 0; }
    public int getWindowFlags() { return 0; }
    android.view.WindowInsets getWindowInsets(boolean p0) { return null; }
    android.view.IWindowSession getWindowSession() { return null; }
    public android.os.IBinder getWindowToken() { return null; }
    void getWindowVisibleDisplayFrame(android.graphics.Rect p0) {}
    void handleAppVisibility(boolean p0, int p1) {}
    void handleGetNewSurface() {}
    public void handleInsetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl.Array p1) {}
    public void handleRequestKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) {}
    public void handleScrollCaptureRequest(android.view.IScrollCaptureResponseListener p0) {}
    boolean hasPointerCapture() { return false; }
    void incrementSeqId() {}
    public boolean injectBackKeyEvents(boolean p0) { return false; }
    int intermittentUpdateState() { return 0; }
    void invalidate() {}
    void invalidate(android.view.View p0) {}
    public void invalidateChild(android.view.View p0, android.graphics.Rect p1) {}
    public android.view.ViewParent invalidateChildInParent(int[] p0, android.graphics.Rect p1) { return null; }
    void invalidateWorld(android.view.View p0) {}
    public boolean isContentCaptureEnabled() { return false; }
    public boolean isDisablingViewAnimationsRequested() { return false; }
    public boolean isFrameRateConflicted() { return false; }
    public boolean isFrameRatePowerSavingsBalanced() { return false; }
    public boolean isHandlingPointerEvent() { return false; }
    public boolean isHardwareEnabled() { return false; }
    boolean isInLayout() { return false; }
    public boolean isInWMSRequestedSync() { return false; }
    public boolean isIpcRenderingEnabled() { return false; }
    public boolean isLayoutDirectionResolved() { return false; }
    public boolean isLayoutRequested() { return false; }
    public boolean isTextAlignmentResolved() { return false; }
    public boolean isTextDirectionResolved() { return false; }
    void keepClearRectsChanged(boolean p0) {}
    public android.view.View keyboardNavigationClusterSearch(android.view.View p0, int p1) { return null; }
    public void loadSystemProperties() {}
    public void mergeWithNextTransaction(android.view.SurfaceControl.Transaction p0, long p1) {}
    public void notifyChildRebuilt() {}
    public void notifyImeVisibilityChanged(boolean p0, android.view.inputmethod.ImeTracker.Token p1) {}
    void notifyInsetsChanged() {}
    public void notifyRendererForGpuLoadUp(java.lang.String p0) {}
    public void notifyRendererOfExpensiveFrame() {}
    public void notifyRendererOfExpensiveFrame(java.lang.String p0) {}
    void notifyRendererOfFramePending() {}
    public void notifySubtreeAccessibilityStateChanged(android.view.View p0, android.view.View p1, int p2) {}
    public void onDescendantInvalidated(android.view.View p0, android.view.View p1) {}
    public void onDescendantUnbufferedRequested() {}
    public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public boolean onNestedPreFling(android.view.View p0, float p1, float p2) { return false; }
    public boolean onNestedPrePerformAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    public void onNestedPreScroll(android.view.View p0, int p1, int p2, int[] p3) {}
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    public void onPostDraw(android.graphics.RecordingCanvas p0) {}
    public void onPreDraw(android.graphics.RecordingCanvas p0) {}
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onStopNestedScroll(android.view.View p0) {}
    public void onWindowTitleChanged() {}
    void outputDisplayList(android.view.View p0) {}
    public boolean performHapticFeedback(int p0, int p1, int p2, int p3) { return false; }
    public void performHapticFeedbackForInputDevice(int p0, int p1, int p2, int p3, int p4) {}
    public void playSoundEffect(int p0) {}
    void pokeDrawLockIfNeeded() {}
    public boolean probablyHasInput() { return false; }
    public void processRawInputEvent(android.view.InputEvent p0) {}
    public void recomputeViewAttributes(android.view.View p0) {}
    void recordViewPercentage(float p0) {}
    public void refreshPointerIcon() {}
    public void registerAnimatingRenderNode(android.graphics.RenderNode p0) {}
    public android.view.SurfaceControl.OnJankDataListenerRegistration registerOnJankDataListener(java.util.concurrent.Executor p0, android.view.SurfaceControl.OnJankDataListener p1) { return null; }
    public void registerRtFrameCallback(android.graphics.HardwareRenderer.FrameDrawingCallback p0) {}
    public void registerVectorDrawableAnimator(android.view.NativeVectorDrawableAnimator p0) {}
    public void removeOnBufferTransformHintChangedListener(android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener p0) {}
    public void removeScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    void removeSensitiveContentAppProtection() {}
    public void removeSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
    public void removeThreadedRendererView(android.view.View p0) {}
    public void removeWindowCallbacks(android.view.WindowCallbacks p0) {}
    public void reportDrawFinish() {}
    void reportKeepClearAreasChanged() {}
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2, int p3) { return false; }
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public void requestFitSystemWindows() {}
    public void requestInvalidateRootRenderNode() {}
    public void requestLayout() {}
    boolean requestLayoutDuringLayout(android.view.View p0) { return false; }
    void requestPointerCapture(int p0) {}
    public boolean requestSendAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    public void requestTransitionStart(android.animation.LayoutTransition p0) {}
    public void requestTransparentRegion(android.view.View p0) {}
    public void requestUpdateConfiguration(android.content.res.Configuration p0) {}
    void scheduleConsumeBatchedInput() {}
    void scheduleConsumeBatchedInputImmediately() {}
    void scheduleTraversals() {}
    boolean scrollToRectOrFocus(android.graphics.Rect p0, boolean p1) { return false; }
    void setAccessibilityFocus(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
    public void setActivityConfigCallback(android.view.ViewRootImpl.ActivityConfigCallback p0) {}
    void setBackKeyCallbackForWindowlessWindow(java.util.function.Predicate<android.view.KeyEvent> p0) {}
    public void setChildBoundingInsets(android.graphics.Rect p0) {}
    public void setDisplayDecoration(boolean p0) {}
    public void setDragFocus(android.view.View p0, android.view.DragEvent p1) {}
    void setDragStartedViewForAccessibility(android.view.View p0) {}
    public void setForceInvertAllowed(boolean p0) {}
    public void setIsAmbientMode(boolean p0) {}
    public void setLayoutParams(android.view.WindowManager.LayoutParams p0, boolean p1) {}
    void setLocalDragState(java.lang.Object p0) {}
    public void setOnContentApplyWindowInsetsListener(android.view.Window.OnContentApplyWindowInsetsListener p0) {}
    void setOverrideInsetsFrame(android.graphics.Rect p0) {}
    public void setPausedForTransition(boolean p0) {}
    public void setReportNextDraw(boolean p0, java.lang.String p1) {}
    public void setRootSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    public void setScrollCaptureRequestTimeout(int p0) {}
    public void setScrollY(int p0) {}
    public void setTouchableRegion(android.graphics.Region p0) {}
    public void setUsesSyncedInsetsAnimationByDefault(boolean p0) {}
    public void setView(android.view.View p0, android.view.WindowManager.LayoutParams p1, android.view.View p2) {}
    public void setView(android.view.View p0, android.view.WindowManager.LayoutParams p1, android.view.View p2, int p3) {}
    void setWindowStopped(boolean p0) {}
    public boolean shouldCheckFrameRate(boolean p0) { return false; }
    public boolean shouldCheckFrameRateCategory() { return false; }
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1) { return null; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    public void synthesizeInputEvent(android.view.InputEvent p0) {}
    void systemGestureExclusionChanged() {}
    public void touchModeChanged(boolean p0) {}
    void transformMatrixToGlobal(android.graphics.Matrix p0) {}
    void transformMatrixToLocal(android.graphics.Matrix p0) {}
    void unscheduleConsumeBatchedInput() {}
    void unscheduleTraversals() {}
    public android.view.SurfaceControl updateAndGetBoundsLayer(android.view.SurfaceControl.Transaction p0) { return null; }
    public void updateAnimatingTypes(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
    void updateBlastSurfaceIfNeeded() {}
    void updateCompatSysUiVisibility(int p0, int p1, int p2) {}
    public void updateConfiguration(int p0) {}
    public void updateDecorViewGestureInterception(boolean p0) {}
    void updateKeepClearRectsForView(android.view.View p0) {}
    void updateRenderTargetIfNeeded() {}
    void updateSystemGestureExclusionRectsForView(android.view.View p0) {}
    public boolean usesSyncedInsetsAnimationByDefault() { return false; }
    public void votePreferredFrameRate(float p0, int p1) {}
    public void votePreferredFrameRateCategory(int p0, int p1, android.view.View p2) {}
    boolean wasRelayoutRequested() { return false; }
    public void windowFocusChanged(boolean p0) {}

    static final class AccessibilityInteractionConnection extends android.view.accessibility.IAccessibilityInteractionConnection.Stub {
        private final java.lang.ref.WeakReference<android.view.ViewRootImpl> mViewRootImpl = null;
        AccessibilityInteractionConnection(android.view.ViewRootImpl p0) { super(); }
        public void attachAccessibilityOverlayToWindow(android.view.SurfaceControl p0, int p1, android.view.accessibility.IAccessibilityInteractionConnectionCallback p2) {}
        public void clearAccessibilityFocus() {}
        public void findAccessibilityNodeInfoByAccessibilityId(long p0, android.graphics.Region p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, int p5, long p6, android.view.MagnificationSpec p7, float[] p8, android.os.Bundle p9) {}
        public void findAccessibilityNodeInfosByText(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
        public void findAccessibilityNodeInfosByViewId(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
        public void findFocus(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
        public void focusSearch(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
        public void getWindowSurfaceInfo(android.view.accessibility.IWindowSurfaceInfoCallback p0) {}
        public void notifyOutsideTouch() {}
        public void performAccessibilityAction(long p0, int p1, android.os.Bundle p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7) {}
        public void takeScreenshotOfWindow(int p0, android.window.ScreenCaptureInternal.ScreenCaptureListener p1, android.view.accessibility.IAccessibilityInteractionConnectionCallback p2) {}
    }

    final class AccessibilityInteractionConnectionManager implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {
        private int mDirectConnectionId;
        AccessibilityInteractionConnectionManager(android.view.ViewRootImpl p0) {}
        public void ensureConnection() {}
        public int ensureDirectConnection() { return 0; }
        public void ensureNoConnection() {}
        public void ensureNoDirectConnection() {}
        public void onAccessibilityStateChanged(boolean p0) {}
    }

    public static interface ActivityConfigCallback {
        default public void onConfigurationChanged(android.content.res.Configuration p0, int p1) {}
        default public void onConfigurationChanged(android.content.res.Configuration p0, int p1, android.window.ActivityWindowInfo p2) {}
    }

    abstract class AsyncInputStage extends android.view.ViewRootImpl.InputStage {
        protected static final int DEFER = 3;
        private android.view.ViewRootImpl.QueuedInputEvent mQueueHead;
        private int mQueueLength;
        private android.view.ViewRootImpl.QueuedInputEvent mQueueTail;
        private final java.lang.String mTraceCounter = null;
        public AsyncInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1, java.lang.String p2) { super(null, null); }
        private void dequeue(android.view.ViewRootImpl.QueuedInputEvent p0, android.view.ViewRootImpl.QueuedInputEvent p1) {}
        private void enqueue(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void apply(android.view.ViewRootImpl.QueuedInputEvent p0, int p1) {}
        protected void defer(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        void dump(java.lang.String p0, java.io.PrintWriter p1) {}
        protected void forward(android.view.ViewRootImpl.QueuedInputEvent p0) {}
    }

    public static final class CalledFromWrongThreadException extends android.util.AndroidRuntimeException {
        public CalledFromWrongThreadException(java.lang.String p0) { super(); }
        public CalledFromWrongThreadException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    }

    public static interface ConfigChangedCallback {
        public void onConfigurationChanged(android.content.res.Configuration p0);
    }

    final class ConsumeBatchedInputCallback implements android.view.Choreographer.VsyncCallback {
        ConsumeBatchedInputCallback(android.view.ViewRootImpl p0) {}
        public void onVsync(android.view.Choreographer.FrameData p0) {}
    }

    final class ConsumeBatchedInputImmediatelyRunnable implements java.lang.Runnable {
        ConsumeBatchedInputImmediatelyRunnable(android.view.ViewRootImpl p0) {}
        public void run() {}
    }

    static final class CornerRadii {
        public float bottomLeft;
        public float bottomRight;
        public float topLeft;
        public float topRight;
        CornerRadii() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        boolean isEmpty() { return false; }
        public java.lang.String toString() { return null; }
    }

    final class EarlyPostImeInputStage extends android.view.ViewRootImpl.InputStage {
        public EarlyPostImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1) { super(null, null); }
        private int processKeyEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        private int processMotionEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        private int processPointerEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
    }

    static final class GfxInfo {
        public long renderNodeMemoryAllocated;
        public long renderNodeMemoryUsage;
        public int viewCount;
        GfxInfo() {}
        void add(android.view.ViewRootImpl.GfxInfo p0) {}
    }

    final class HighContrastTextManager implements android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener {
        HighContrastTextManager(android.view.ViewRootImpl p0) {}
        public void onHighContrastTextStateChanged(boolean p0) {}
    }

    final class ImeInputStage extends android.view.ViewRootImpl.AsyncInputStage implements android.view.inputmethod.InputMethodManager.FinishedInputEventCallback {
        public ImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1, java.lang.String p2) { super(null, null, null); }
        public void onFinishedInputEvent(java.lang.Object p0, boolean p1) {}
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
    }

    abstract class InputStage {
        protected static final int FINISH_HANDLED = 1;
        protected static final int FINISH_NOT_HANDLED = 2;
        protected static final int FORWARD = 0;
        private final android.view.ViewRootImpl.InputStage mNext = null;
        private java.lang.String mTracePrefix;
        public InputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1) {}
        private void traceEvent(android.view.ViewRootImpl.QueuedInputEvent p0, long p1) {}
        protected void apply(android.view.ViewRootImpl.QueuedInputEvent p0, int p1) {}
        public final void deliver(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        void dump(java.lang.String p0, java.io.PrintWriter p1) {}
        protected void finish(android.view.ViewRootImpl.QueuedInputEvent p0, boolean p1) {}
        protected void forward(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        boolean isBack(android.view.InputEvent p0) { return false; }
        protected void onDeliverToNext(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void onDetachedFromWindow() {}
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        protected void onWindowFocusChanged(boolean p0) {}
        protected boolean shouldDropInputEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return false; }
    }

    final class InvalidateOnAnimationRunnable implements java.lang.Runnable {
        private boolean mPosted;
        private android.view.View.AttachInfo.InvalidateInfo[] mTempViewRects;
        private android.view.View[] mTempViews;
        private final java.util.ArrayList<android.view.View.AttachInfo.InvalidateInfo> mViewRects = null;
        private final java.util.ArrayList<android.view.View> mViews = null;
        InvalidateOnAnimationRunnable(android.view.ViewRootImpl p0) {}
        private void postIfNeededLocked() {}
        public void addView(android.view.View p0) {}
        public void addViewRect(android.view.View.AttachInfo.InvalidateInfo p0) {}
        public void removeView(android.view.View p0) {}
        public void run() {}
    }

    final class NativePostImeInputStage extends android.view.ViewRootImpl.AsyncInputStage implements android.view.InputQueue.FinishedInputEventCallback {
        public NativePostImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1, java.lang.String p2) { super(null, null, null); }
        public void onFinishedInputEvent(java.lang.Object p0, boolean p1) {}
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
    }

    final class NativePreImeInputStage extends android.view.ViewRootImpl.AsyncInputStage implements android.view.InputQueue.FinishedInputEventCallback {
        public NativePreImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1, java.lang.String p2) { super(null, null, null); }
        private int doOnBackKeyEvent(android.view.KeyEvent p0) { return 0; }
        private static boolean isImeCallback(android.window.OnBackInvokedCallback p0) { return false; }
        protected void onDeliverToNext(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        public void onFinishedInputEvent(java.lang.Object p0, boolean p1) {}
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
    }

    public static final class NoPreloadHolder {
        public static final boolean sAlwaysSeqId = Boolean.valueOf(false);
        public NoPreloadHolder() {}
    }

    private static final class QueuedInputEvent {
        public static final int FLAG_DEFERRED = 2;
        public static final int FLAG_FINISHED = 4;
        public static final int FLAG_FINISHED_HANDLED = 8;
        public static final int FLAG_MODIFIED_FOR_COMPATIBILITY = 64;
        public static final int FLAG_PRE_IME_ONLY = 128;
        public static final int FLAG_RESYNTHESIZED = 16;
        public static final int FLAG_SKIP_IME = 1;
        public static final int FLAG_UNHANDLED = 32;
        public android.view.InputEvent mEvent;
        public int mFlags;
        public android.view.ViewRootImpl.QueuedInputEvent mNext;
        public android.view.InputEventReceiver mReceiver;
        private QueuedInputEvent() {}
        private boolean flagToString(java.lang.String p0, int p1, boolean p2, java.lang.StringBuilder p3) { return false; }
        public boolean forPreImeOnly() { return false; }
        public boolean shouldSendToSynthesizer() { return false; }
        public boolean shouldSkipIme() { return false; }
        public java.lang.String toString() { return null; }
    }

    private class SendWindowContentChangedAccessibilityEvent implements java.lang.Runnable {
        public java.util.OptionalInt mAction;
        private int mChangeTypes;
        public long mLastEventTimeMillis;
        public java.lang.StackTraceElement[] mOrigin;
        public android.view.View mSource;
        private SendWindowContentChangedAccessibilityEvent(android.view.ViewRootImpl p0) {}
        private boolean canContinueThrottle(android.view.View p0, int p1) { return false; }
        public void removeCallbacksAndRun() {}
        public void run() {}
        public void runOrPost(android.view.View p0, int p1) {}
    }

    public static interface SurfaceChangedCallback {
        public void surfaceCreated(android.view.SurfaceControl.Transaction p0);
        public void surfaceDestroyed();
        public void surfaceReplaced(android.view.SurfaceControl.Transaction p0);
        default public void vriDrawStarted(boolean p0) {}
    }

    final class SyntheticInputStage extends android.view.ViewRootImpl.InputStage {
        private final android.view.ViewRootImpl.SyntheticJoystickHandler mJoystick = null;
        private final android.view.ViewRootImpl.SyntheticKeyboardHandler mKeyboard = null;
        private final android.view.ViewRootImpl.SyntheticTouchNavigationHandler mTouchNavigation = null;
        private final android.view.ViewRootImpl.SyntheticTrackballHandler mTrackball = null;
        public SyntheticInputStage(android.view.ViewRootImpl p0) { super(null, null); }
        protected void onDeliverToNext(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void onDetachedFromWindow() {}
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        protected void onWindowFocusChanged(boolean p0) {}
    }

    final class SyntheticJoystickHandler extends android.os.Handler {
        private static final int MSG_ENQUEUE_X_AXIS_KEY_REPEAT = 1;
        private static final int MSG_ENQUEUE_Y_AXIS_KEY_REPEAT = 2;
        private final android.util.SparseArray<android.view.KeyEvent> mDeviceKeyEvents = null;
        private final android.view.ViewRootImpl.SyntheticJoystickHandler.JoystickAxesState mJoystickAxesState = null;
        public SyntheticJoystickHandler(android.view.ViewRootImpl p0) { super(); }
        private void cancel() {}
        private void update(android.view.MotionEvent p0) {}
        public void handleMessage(android.os.Message p0) {}
        public void process(android.view.MotionEvent p0) {}

        final class JoystickAxesState {
            private static final int STATE_DOWN_OR_RIGHT = 1;
            private static final int STATE_NEUTRAL = 0;
            private static final int STATE_UP_OR_LEFT = -1;
            final int[] mAxisStatesHat = null;
            final int[] mAxisStatesStick = null;
            JoystickAxesState(android.view.ViewRootImpl.SyntheticJoystickHandler p0) {}
            private boolean isXAxis(int p0) { return false; }
            private boolean isYAxis(int p0) { return false; }
            private int joystickAxisAndStateToKeycode(int p0, int p1) { return 0; }
            private int joystickAxisValueToState(float p0) { return 0; }
            void resetState() {}
            void updateStateForAxis(android.view.MotionEvent p0, long p1, int p2, float p3) {}
        }
    }

    final class SyntheticKeyboardHandler {
        SyntheticKeyboardHandler(android.view.ViewRootImpl p0) {}
        public void process(android.view.KeyEvent p0) {}
    }

    final class SyntheticTouchNavigationHandler extends android.os.Handler {
        private static final java.lang.String LOCAL_TAG = "SyntheticTouchNavigationHandler";
        private int mCurrentDeviceId;
        private int mCurrentSource;
        private final android.view.GestureDetector mGestureDetector = null;
        private int mPendingKeyMetaState;
        SyntheticTouchNavigationHandler(android.view.ViewRootImpl p0) { super(); }
        private void dispatchEvent(long p0, int p1) {}
        private void dispatchFling(float p0, float p1, long p2) {}
        private void dispatchTap(long p0) {}
        public void process(android.view.MotionEvent p0) {}
    }

    final class SyntheticTrackballHandler {
        private long mLastTime;
        private final android.view.ViewRootImpl.TrackballAxis mX = null;
        private final android.view.ViewRootImpl.TrackballAxis mY = null;
        SyntheticTrackballHandler(android.view.ViewRootImpl p0) {}
        public void cancel() {}
        public void process(android.view.MotionEvent p0) {}
    }

    static final class SystemUiVisibilityInfo {
        int globalVisibility;
        int localChanges;
        int localValue;
        SystemUiVisibilityInfo() {}
    }

    class TakenSurfaceHolder extends com.android.internal.view.BaseSurfaceHolder {
        boolean mDrawingAllowed;
        boolean mIsCreating;
        TakenSurfaceHolder(android.view.ViewRootImpl p0) { super(); }
        public boolean isCreating() { return false; }
        public boolean onAllowLockCanvas() { return false; }
        public void onRelayoutContainer() {}
        public void onUpdateSurface() {}
        public void setFixedSize(int p0, int p1) {}
        public void setFormat(int p0) {}
        public void setKeepScreenOn(boolean p0) {}
        public void setType(int p0) {}
    }

    static final class TrackballAxis {
        static final float ACCEL_MOVE_SCALING_FACTOR = 0.02500000037252903f;
        static final long FAST_MOVE_TIME = 150L;
        static final float FIRST_MOVEMENT_THRESHOLD = 0.5f;
        static final float MAX_ACCELERATION = 20.0f;
        static final float SECOND_CUMULATIVE_MOVEMENT_THRESHOLD = 2.0f;
        static final float SUBSEQUENT_INCREMENTAL_MOVEMENT_THRESHOLD = 1.0f;
        float acceleration;
        int dir;
        long lastMoveTime;
        int nonAccelMovement;
        float position;
        int step;
        TrackballAxis() {}
        float collect(float p0, long p1, java.lang.String p2) { return 0.0f; }
        int generate() { return 0; }
        void reset(int p0) {}
    }

    final class TraversalCallback implements android.view.Choreographer.VsyncCallback {
        TraversalCallback(android.view.ViewRootImpl p0) {}
        public void onVsync(android.view.Choreographer.FrameData p0) {}
    }

    private static class UnhandledKeyManager {
        private final android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> mCapturedKeys = null;
        private java.lang.ref.WeakReference<android.view.View> mCurrentReceiver;
        private boolean mDispatched;
        private UnhandledKeyManager() {}
        boolean dispatch(android.view.View p0, android.view.KeyEvent p1) { return false; }
        void preDispatch(android.view.KeyEvent p0) {}
        boolean preViewDispatch(android.view.KeyEvent p0) { return false; }
    }

    final class ViewPostImeInputStage extends android.view.ViewRootImpl.InputStage {
        public ViewPostImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1) { super(null, null); }
        private void maybeUpdatePointerIcon(android.view.MotionEvent p0) {}
        private boolean moveFocusToAdjacentWindow(int p0) { return false; }
        private boolean performFocusNavigation(android.view.KeyEvent p0) { return false; }
        private boolean performKeyboardGroupNavigation(int p0) { return false; }
        private int processGenericMotionEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        private int processKeyEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        private int processPointerEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        private int processTrackballEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        protected void onDeliverToNext(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
    }

    final class ViewPreImeInputStage extends android.view.ViewRootImpl.InputStage {
        public ViewPreImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1) { super(null, null); }
        private int processKeyEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
    }

    final class ViewRootHandler extends android.os.Handler {
        ViewRootHandler(android.view.ViewRootImpl p0) { super(); }
        private void handleMessageImpl(android.os.Message p0) {}
        public java.lang.String getMessageName(android.os.Message p0) { return null; }
        public void handleMessage(android.os.Message p0) {}
    }

    static class W extends com.android.internal.view.WindowClientTransactionHandler {
        private boolean mIsFromTransactionItem;
        private final java.util.List<android.view.ViewRootImpl.W.InsetsControlArgs> mPendingInsetsControlArgsList = null;
        private android.view.ViewRootImpl.W.ResizeArgs mPendingResizeArgs;
        private final java.lang.ref.WeakReference<android.view.ViewRootImpl> mViewAncestor = null;
        W(android.view.ViewRootImpl p0) { super(); }
        private static int checkCallingPermission(java.lang.String p0) { return 0; }
        public void closeSystemDialogs(java.lang.String p0) {}
        public void dispatchAppVisibility(boolean p0, int p1) {}
        public void dispatchDragEvent(android.view.DragEvent p0) {}
        public void dispatchGetNewSurface() {}
        public void dispatchScrollToTop(int p0) {}
        public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4) {}
        public void dispatchWallpaperOffsets(float p0, float p1, float p2, float p3, float p4) {}
        public void dumpWindow(android.os.ParcelFileDescriptor p0) {}
        public void executeCommand(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2) {}
        public android.os.Handler getHandler() { return null; }
        public void handleInsetsControlChanged() {}
        public void handleResized() {}
        public void hideInsets(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
        public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl.Array p1) {}
        public void moved(int p0, int p1) {}
        public void onExecutingWindowStateTransactionItem() {}
        public void requestAccessibilityEmbeddedConnection(com.android.internal.os.IResultReceiver p0) {}
        public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) {}
        public void requestHardwareRendererOutputDisabled(boolean p0) {}
        public void requestScrollCapture(android.view.IScrollCaptureResponseListener p0) {}
        public void requestViewAnimationsDisabled(boolean p0) {}
        public void resized(android.view.WindowRelayoutResult p0, boolean p1, boolean p2, int p3, boolean p4, boolean p5) {}
        public void showInsets(int p0, android.view.inputmethod.ImeTracker.Token p1) {}
        public void updatePendingInsetsControls(android.view.InsetsState p0, android.view.InsetsSourceControl.Array p1) {}
        public void updatePendingResize(android.view.WindowRelayoutResult p0, boolean p1, boolean p2, int p3, boolean p4, boolean p5) {}

        private static class InsetsControlArgs {
            final android.view.InsetsSourceControl.Array mControls = null;
            final android.view.InsetsState mInsetsState = null;
            InsetsControlArgs(android.view.InsetsState p0, android.view.InsetsSourceControl.Array p1) {}
        }

        private static class ResizeArgs {
            final int mDisplayId = 0;
            final boolean mDragResizing = false;
            final boolean mForceLayout = false;
            final android.view.WindowRelayoutResult mLayout = null;
            final boolean mReportDraw = false;
            final boolean mSyncWithBuffers = false;
            ResizeArgs(android.view.WindowRelayoutResult p0, boolean p1, boolean p2, int p3, boolean p4, boolean p5) {}
        }
    }

    final class WindowInputEventReceiver extends android.view.InputEventReceiver {
        private final android.graphics.HardwareRenderer mRenderer = null;
        WindowInputEventReceiver(android.view.ViewRootImpl p0, android.view.InputChannel p1, android.os.Looper p2, android.graphics.HardwareRenderer p3) { super(null, null); }
        public void dispose() {}
        public void onBatchedInputEventPending(int p0) {}
        public void onDragEvent(boolean p0, float p1, float p2, int p3, int p4, int p5) {}
        public void onFocusEvent(boolean p0) {}
        public void onInputEvent(android.view.InputEvent p0) {}
        public void onPointerCaptureEvent(boolean p0) {}
        public void onTouchModeChanged(boolean p0) {}
    }
}
