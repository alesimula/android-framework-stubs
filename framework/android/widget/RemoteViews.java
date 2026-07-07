package android.widget;

public class RemoteViews implements android.os.Parcelable, android.view.LayoutInflater.Filter {
    private static final android.widget.RemoteViews.Action ACTION_NOOP = null;
    private static final int ATTRIBUTE_REFLECTION_ACTION_TAG = 32;
    private static final int COMPLEX_UNIT_DIMENSION_REFLECTION_ACTION_TAG = 25;
    public static final android.os.Parcelable.Creator<android.widget.RemoteViews> CREATOR = null;
    private static final android.widget.RemoteViews.InteractionHandler DEFAULT_INTERACTION_HANDLER = null;
    public static final java.lang.String EXTRA_CHECKED = "android.widget.extra.CHECKED";
    public static final java.lang.String EXTRA_SHARED_ELEMENT_BOUNDS = "android.widget.extra.SHARED_ELEMENT_BOUNDS";
    static final int FLAG_MASK_TO_PROPAGATE = 6;
    public static final int FLAG_REAPPLY_DISALLOWED = 1;
    public static final int FLAG_USE_LIGHT_BACKGROUND_LAYOUT = 4;
    public static final int FLAG_WIDGET_IS_COLLECTION_CHILD = 2;
    private static final int IMAGE_REFLECTION_ACTION_TAG = 12;
    private static final android.view.LayoutInflater.Filter INFLATER_FILTER = null;
    private static final int LAYOUT_PARAM_ACTION_TAG = 19;
    private static final java.lang.String LOG_TAG = "RemoteViews";
    public static final int MARGIN_BOTTOM = 3;
    public static final int MARGIN_END = 5;
    public static final int MARGIN_LEFT = 0;
    public static final int MARGIN_RIGHT = 2;
    public static final int MARGIN_START = 4;
    public static final int MARGIN_TOP = 1;
    private static final int MAX_INIT_VIEW_COUNT = 16;
    private static final int MAX_NESTED_VIEWS = 10;
    private static final int MAX_SINGLE_PARCEL_SIZE = 800000;
    private static final int MODE_HAS_LANDSCAPE_AND_PORTRAIT = 1;
    private static final int MODE_HAS_SIZED_REMOTEVIEWS = 2;
    private static final int MODE_NORMAL = 0;
    private static final int NIGHT_MODE_REFLECTION_ACTION_TAG = 30;
    private static final int REFLECTION_ACTION_TAG = 2;
    private static final int REMOVE_FROM_PARENT_ACTION_TAG = 23;
    private static final int RESOURCE_REFLECTION_ACTION_TAG = 24;
    private static final int SET_COMPOUND_BUTTON_CHECKED_TAG = 26;
    private static final int SET_DRAWABLE_TINT_TAG = 3;
    private static final int SET_DRAW_INSTRUCTION_TAG = 35;
    private static final int SET_EMPTY_VIEW_ACTION_TAG = 6;
    private static final int SET_INT_TAG_TAG = 22;
    private static final int SET_ON_CHECKED_CHANGE_RESPONSE_TAG = 29;
    private static final int SET_ON_CLICK_RESPONSE_TAG = 1;
    private static final int SET_ON_STYLUS_HANDWRITING_RESPONSE_TAG = 34;
    private static final int SET_PENDING_INTENT_TEMPLATE_TAG = 8;
    private static final int SET_RADIO_GROUP_CHECKED = 27;
    private static final int SET_REMOTE_ADAPTER_TAG = 33;
    private static final int SET_REMOTE_COLLECTION_ITEMS_ADAPTER_TAG = 31;
    private static final int SET_REMOTE_INPUTS_ACTION_TAG = 18;
    private static final int SET_RIPPLE_DRAWABLE_COLOR_TAG = 21;
    private static final int SET_VIEW_OUTLINE_RADIUS_TAG = 28;
    private static final int TEXT_VIEW_DRAWABLE_ACTION_TAG = 11;
    private static final int TEXT_VIEW_SIZE_ACTION_TAG = 13;
    static final int VALUE_TYPE_ATTRIBUTE = 4;
    static final int VALUE_TYPE_COMPLEX_UNIT = 2;
    static final int VALUE_TYPE_RAW = 1;
    static final int VALUE_TYPE_RESOURCE = 3;
    private static final int VIEW_CONTENT_NAVIGATION_TAG = 5;
    private static final int VIEW_GROUP_ACTION_ADD_TAG = 4;
    private static final int VIEW_GROUP_ACTION_REMOVE_TAG = 7;
    private static final int VIEW_PADDING_ACTION_TAG = 14;
    private static final android.widget.RemoteViews.MethodKey sLookupKey = null;
    private static final android.util.ArrayMap<android.widget.RemoteViews.MethodKey, android.widget.RemoteViews.MethodArgs> sMethods = null;
    private java.util.ArrayList<android.widget.RemoteViews.Action> mActions;
    public android.content.pm.ApplicationInfo mApplication;
    private int mApplicationId;
    private android.widget.RemoteViews.ApplicationInfoCache mApplicationInfoCache;
    private int mApplyFlags;
    private java.util.Map<java.lang.Class, java.lang.Object> mClassCookies;
    private android.widget.RemoteViews.RemoteCollectionCache mCollectionCache;
    private android.util.SparseArray<android.content.Intent> mFillInIntent;
    private boolean mHasDrawInstructions;
    private android.util.SizeF mIdealSize;
    private android.widget.RemoteViews.ImageCache mImageCache;
    private boolean mIsRoot;
    private android.widget.RemoteViews mLandscape;
    private int mLayoutId;
    private android.view.LayoutInflater.Factory2 mLayoutInflaterFactory2;
    private int mLightBackgroundLayoutId;
    private float mOriginalDensity;
    private android.util.SparseArray<android.app.PendingIntent> mPendingIntentTemplate;
    private android.widget.RemoteViews mPortrait;
    private long mProviderInstanceId;
    private java.util.List<android.widget.RemoteViews> mSizedRemoteViews;
    private int mViewId;
    private RemoteViews() {}
    protected RemoteViews(android.content.pm.ApplicationInfo p0, int p1) {}
    public RemoteViews(android.os.Parcel p0) {}
    private RemoteViews(android.os.Parcel p0, android.widget.RemoteViews.HierarchyRootData p1, android.content.pm.ApplicationInfo p2, int p3) {}
    public RemoteViews(android.widget.RemoteViews.DrawInstructions p0) {}
    public RemoteViews(android.widget.RemoteViews p0) {}
    public RemoteViews(android.widget.RemoteViews p0, android.widget.RemoteViews p1) {}
    public RemoteViews(java.lang.String p0, int p1) {}
    public RemoteViews(java.lang.String p0, int p1, int p2) {}
    public RemoteViews(java.util.Map<android.util.SizeF, android.widget.RemoteViews> p0) {}
    private void addAction(android.widget.RemoteViews.Action p0) {}
    private android.view.View apply(android.content.Context p0, android.view.ViewGroup p1, android.view.ViewGroup p2, android.util.SizeF p3, android.widget.RemoteViews.ActionApplyParams p4) { return null; }
    private static void checkContainsKeys(android.util.LongSparseArray<?> p0, long[] p1) {}
    private static void checkProtoResultNotNull(java.lang.Object p0, java.lang.String p1) throws android.widget.RemoteViews.InvalidProtoException {}
    private static void checkValidResource(int p0, java.lang.String p1, java.lang.String p2) throws java.lang.Exception {}
    private void configureAsChild(android.widget.RemoteViews.HierarchyRootData p0) {}
    private void configureDescendantsAsChildren() {}
    private static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createActionFromProto(android.widget.RemoteViews p0, android.util.proto.ProtoInputStream p1) throws java.lang.Exception { return null; }
    private static java.lang.CharSequence createCharSequenceFromProto(android.util.proto.ProtoInputStream p0, long p1) throws java.lang.Exception { return null; }
    private static java.util.List<java.lang.CharSequence> createCharSequenceListFromProto(android.util.proto.ProtoInputStream p0, long p1) throws java.lang.Exception { return null; }
    private static android.content.res.ColorStateList createColorStateListFromProto(android.util.proto.ProtoInputStream p0, long p1) throws java.lang.Exception { return null; }
    private static java.time.Duration createDurationFromProto(android.util.proto.ProtoInputStream p0, long p1) throws java.lang.Exception { return null; }
    private android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromBitmapReflectionActionFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
    private android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromImageReflectionActionFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
    private static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
    private static android.widget.RemoteViews.PendingResources<android.graphics.drawable.Icon> createIconFromProto(android.util.proto.ProtoInputStream p0, long p1) throws java.lang.Exception { return null; }
    private static android.widget.RemoteViews createInitializedFrom(android.widget.RemoteViews p0, android.widget.RemoteViews p1) { return null; }
    private static java.time.Instant createInstantFromProto(android.util.proto.ProtoInputStream p0, long p1) throws java.lang.Exception { return null; }
    public static android.widget.RemoteViews createPreviewFromProto(android.content.Context p0, android.util.proto.ProtoInputStream p1) throws java.lang.Exception { return null; }
    private android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createSetDrawInstructionActionFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
    private android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createSetRemoteCollectionItemListAdapterActionFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
    private static android.util.SizeF createSizeFFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
    private android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createViewGroupActionAddFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
    private void finalizeViewRecycling(android.view.ViewGroup p0) {}
    private android.widget.RemoteViews findBestFitLayout(android.util.SizeF p0) { return null; }
    private android.widget.RemoteViews findSmallestRemoteView() { return null; }
    private static boolean fitsIn(android.util.SizeF p0, android.util.SizeF p1) { return false; }
    private android.widget.RemoteViews.Action getActionFromParcel(android.os.Parcel p0, int p1) { return null; }
    private static android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1) { return null; }
    private static int getAsIdentifier(android.content.res.Resources p0, android.util.LongSparseArray<?> p1, long p2) throws java.lang.Exception { return 0; }
    private static int getAsIdentifier(android.content.res.Resources p0, android.util.SparseArray<?> p1, int p2) throws java.lang.Exception { return 0; }
    private int getBitmapMemoryUsedByActions() { return 0; }
    private int getChildId(android.widget.RemoteViews p0) { return 0; }
    private android.content.Context getContextForResourcesEnsuringCorrectCachedApkPaths(android.content.Context p0) { return null; }
    private android.util.SparseArray<android.content.Intent> getFillInIntent() { return null; }
    private android.widget.RemoteViews.HierarchyRootData getHierarchyRootData() { return null; }
    private android.util.SizeF getIdealSize() { return null; }
    private java.util.Set<java.lang.Integer> getImageIdsUsedByActions(java.util.Set<java.lang.Integer> p0) { return null; }
    private android.widget.RemoteViews.AsyncApplyTask getInternalAsyncApplyTask(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.OnViewAppliedListener p2, android.widget.RemoteViews.ActionApplyParams p3, android.util.SizeF p4, android.view.View p5) { return null; }
    private static java.lang.invoke.MethodHandle getMethod(android.view.View p0, java.lang.String p1, java.lang.Class<?> p2, java.lang.Class<?> p3, boolean p4) { return null; }
    private static int getNextRecyclableChild(android.view.ViewGroup p0) { return 0; }
    private static java.lang.Class<?> getParameterType(int p0) { return null; }
    private static java.lang.Class<?> getParameterTypeArgument(int p0) { return null; }
    private android.util.SparseArray<android.app.PendingIntent> getPendingIntentTemplate() { return null; }
    private android.widget.RemoteViews getRemoteViewsToApply(android.content.Context p0) { return null; }
    private android.widget.RemoteViews getRemoteViewsToReapply(android.content.Context p0, android.view.View p1, android.util.SizeF p2) { return null; }
    private static float getScaledFloatingPixelsFromComplexValue(android.widget.RemoteViews.ActionApplyParams p0, android.util.DisplayMetrics p1, int p2) { return 0.0f; }
    private static float getScaledFloatingPixelsFromValueWithUnit(android.widget.RemoteViews.ActionApplyParams p0, android.util.DisplayMetrics p1, float p2, int p3) { return 0.0f; }
    private static int getScaledPixelsFromComplexValue(android.widget.RemoteViews.ActionApplyParams p0, android.util.DisplayMetrics p1, int p2, boolean p3) { return 0; }
    private static int getScaledPixelsFromValueWithUnit(android.widget.RemoteViews.ActionApplyParams p0, android.util.DisplayMetrics p1, float p2, int p3, boolean p4) { return 0; }
    public static android.graphics.Rect getSourceBounds(android.view.View p0) { return null; }
    private static int getStableId(android.view.View p0) { return 0; }
    private static int getViewLayoutId(android.view.View p0) { return 0; }
    private boolean hasDrawInstructions() { return false; }
    private boolean hasLandscapeAndPortraitLayouts() { return false; }
    private boolean hasMultipleLayouts() { return false; }
    private boolean hasSizedRemoteViews() { return false; }
    private static boolean hasStableId(android.view.View p0) { return false; }
    private android.view.View inflateView(android.content.Context p0, android.widget.RemoteViews p1, android.view.ViewGroup p2, int p3, android.widget.RemoteViews.ColorResources p4) { return null; }
    private android.view.View inflateViewInternal(android.content.Context p0, android.widget.RemoteViews p1, android.view.ViewGroup p2, int p3, android.widget.RemoteViews.ColorResources p4) { return null; }
    private void initializeFrom(android.widget.RemoteViews p0, android.widget.RemoteViews p1) {}
    private java.util.Map<java.lang.Class, java.lang.Object> initializeSizedRemoteViews(java.util.Iterator<android.widget.RemoteViews> p0) { return null; }
    private static java.lang.String parametersToString(java.lang.Class<?> p0, java.lang.Class<?> p1) { return null; }
    private void performApply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
    private android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.RemoteCollectionCache> populateRemoteCollectionCacheFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
    private void readActionsFromParcel(android.os.Parcel p0, int p1) {}
    private void reapply(android.content.Context p0, android.view.View p1, android.view.ViewGroup p2, android.util.SizeF p3, android.widget.RemoteViews.ActionApplyParams p4, boolean p5) {}
    private void reapplyNestedViews(android.content.Context p0, android.view.View p1, android.view.ViewGroup p2, android.widget.RemoteViews.ActionApplyParams p3) {}
    private void reconstructCaches() {}
    private void setIdealSize(android.util.SizeF p0) {}
    private static void setNextRecyclableChild(android.view.ViewGroup p0, int p1, int p2) {}
    private static void setStableId(android.view.View p0, int p1) {}
    private static float squareDistance(android.util.SizeF p0, android.util.SizeF p1) { return 0.0f; }
    public static boolean startPendingIntent(android.view.View p0, android.app.PendingIntent p1, android.util.Pair<android.content.Intent, android.app.ActivityOptions> p2) { return false; }
    private void tryAddRemoteResponse(int p0) {}
    private void updateActionsImageCacheReferencesInternal(android.widget.RemoteViews.ImageCache p0) {}
    private static void visitIconUri(android.graphics.drawable.Icon p0, java.util.function.Consumer<android.net.Uri> p1) {}
    private void writeActionsToParcel(android.os.Parcel p0, int p1) {}
    private static void writeCharSequenceListToProto(android.util.proto.ProtoOutputStream p0, java.util.List<java.lang.CharSequence> p1, long p2) {}
    private static void writeColorStateListToProto(android.util.proto.ProtoOutputStream p0, android.content.res.ColorStateList p1, long p2) {}
    private static void writeDurationToProto(android.util.proto.ProtoOutputStream p0, java.time.Duration p1, long p2) {}
    private static void writeIconToProto(android.util.proto.ProtoOutputStream p0, android.content.res.Resources p1, android.graphics.drawable.Icon p2, long p3) {}
    private static void writeInstantToProto(android.util.proto.ProtoOutputStream p0, java.time.Instant p1, long p2) {}
    private void writeToParcel(android.os.Parcel p0, int p1, android.util.SparseArray<android.content.Intent> p2) {}
    public void addFlags(int p0) {}
    public void addStableView(int p0, android.widget.RemoteViews p1, int p2) {}
    public void addView(int p0, android.widget.RemoteViews p1) {}
    public void addView(int p0, android.widget.RemoteViews p1, int p2) {}
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1) { return null; }
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1, android.util.SizeF p2, android.widget.RemoteViews.ActionApplyParams p3) { return null; }
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.InteractionHandler p2) { return null; }
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.InteractionHandler p2, android.util.SizeF p3) { return null; }
    public android.view.View apply(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.InteractionHandler p2, android.util.SizeF p3, android.widget.RemoteViews.ColorResources p4) { return null; }
    public android.os.CancellationSignal applyAsync(android.content.Context p0, android.view.ViewGroup p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3) { return null; }
    public android.os.CancellationSignal applyAsync(android.content.Context p0, android.view.ViewGroup p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.InteractionHandler p4) { return null; }
    public android.os.CancellationSignal applyAsync(android.content.Context p0, android.view.ViewGroup p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.InteractionHandler p4, android.util.SizeF p5) { return null; }
    public android.os.CancellationSignal applyAsync(android.content.Context p0, android.view.ViewGroup p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.InteractionHandler p4, android.util.SizeF p5, android.widget.RemoteViews.ColorResources p6) { return null; }
    public android.view.View applyWithTheme(android.content.Context p0, android.view.ViewGroup p1, android.widget.RemoteViews.InteractionHandler p2, int p3) { return null; }
    public boolean canRecycleView(android.view.View p0) { return false; }
    @java.lang.Deprecated
    public android.widget.RemoteViews clone() { return null; }
    public java.util.concurrent.CompletableFuture<java.lang.Void> collectAllIntents(int p0, boolean p1, android.appwidget.AppWidgetManager.ServiceCollectionCache p2) { return null; }
    public long computeUniqueId(android.widget.RemoteViews p0) { return 0L; }
    public int describeContents() { return 0; }
    public long estimateIconMemoryUsage() { return 0L; }
    public long estimateMemoryUsage() { return 0L; }
    public long estimateTotalBitmapMemoryUsage() { return 0L; }
    public android.widget.RemoteViews getDarkTextViews() { return null; }
    android.widget.RemoteViews.ImageCache getImageCache() { return null; }
    public int getLayoutId() { return 0; }
    public android.view.LayoutInflater.Factory2 getLayoutInflaterFactory() { return null; }
    public java.lang.String getPackage() { return null; }
    public long getProviderInstanceId() { return 0L; }
    public android.widget.RemoteViews getRemoteViewsToApply(android.content.Context p0, android.util.SizeF p1) { return null; }
    public android.widget.RemoteViews getRemoteViewsToApplyIfDifferent(android.util.SizeF p0, android.util.SizeF p1) { return null; }
    public int getSequenceNumber() { return 0; }
    public int getViewId() { return 0; }
    public boolean hasFlags(int p0) { return false; }
    public boolean hasLegacyLists() { return false; }
    public boolean hasSameAppInfo(android.content.pm.ApplicationInfo p0) { return false; }
    public boolean isLegacyListRemoteViews() { return false; }
    public void mergeRemoteViews(android.widget.RemoteViews p0) {}
    public void offloadBitmaps(java.util.function.Function<android.graphics.Bitmap, android.net.Uri> p0) {}
    @java.lang.Deprecated
    public boolean onLoadClass(java.lang.Class p0) { return false; }
    public boolean prefersAsyncApply() { return false; }
    public void reapply(android.content.Context p0, android.view.View p1) {}
    public void reapply(android.content.Context p0, android.view.View p1, android.util.SizeF p2, android.widget.RemoteViews.ActionApplyParams p3) {}
    public void reapply(android.content.Context p0, android.view.View p1, android.widget.RemoteViews.InteractionHandler p2) {}
    public void reapply(android.content.Context p0, android.view.View p1, android.widget.RemoteViews.InteractionHandler p2, android.util.SizeF p3, android.widget.RemoteViews.ColorResources p4) {}
    public android.os.CancellationSignal reapplyAsync(android.content.Context p0, android.view.View p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3) { return null; }
    public android.os.CancellationSignal reapplyAsync(android.content.Context p0, android.view.View p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.InteractionHandler p4) { return null; }
    public android.os.CancellationSignal reapplyAsync(android.content.Context p0, android.view.View p1, java.util.concurrent.Executor p2, android.widget.RemoteViews.OnViewAppliedListener p3, android.widget.RemoteViews.InteractionHandler p4, android.util.SizeF p5, android.widget.RemoteViews.ColorResources p6) { return null; }
    public void reduceImageSizes(int p0, int p1) {}
    public void removeAllViews(int p0) {}
    public void removeAllViewsExceptId(int p0, int p1) {}
    public void removeFromParent(int p0) {}
    public void replaceAllIntentsWithEmptyList() {}
    public boolean replaceRemoteCollections(int p0) { return false; }
    public void setAccessibilityTraversalAfter(int p0, int p1) {}
    public void setAccessibilityTraversalBefore(int p0, int p1) {}
    public void setAppWidgetEventTag(int p0, int p1) {}
    public void setBitmap(int p0, java.lang.String p1, android.graphics.Bitmap p2) {}
    public void setBlendMode(int p0, java.lang.String p1, android.graphics.BlendMode p2) {}
    public void setBoolean(int p0, java.lang.String p1, boolean p2) {}
    public void setBundle(int p0, java.lang.String p1, android.os.Bundle p2) {}
    public void setByte(int p0, java.lang.String p1, byte p2) {}
    public void setChar(int p0, java.lang.String p1, char p2) {}
    public void setCharSequence(int p0, java.lang.String p1, int p2) {}
    public void setCharSequence(int p0, java.lang.String p1, java.lang.CharSequence p2) {}
    public void setCharSequenceAttr(int p0, java.lang.String p1, int p2) {}
    public void setCharSequenceList(int p0, java.lang.String p1, java.util.List<java.lang.CharSequence> p2) {}
    public void setChronometer(int p0, long p1, java.lang.String p2, boolean p3) {}
    public void setChronometer(int p0, java.time.Instant p1, java.lang.String p2, boolean p3) {}
    public void setChronometerCountDown(int p0, boolean p1) {}
    public void setChronometerPaused(int p0, java.time.Duration p1) {}
    public void setColor(int p0, java.lang.String p1, int p2) {}
    public void setColorAttr(int p0, java.lang.String p1, int p2) {}
    public void setColorInt(int p0, java.lang.String p1, int p2, int p3) {}
    public void setColorStateList(int p0, java.lang.String p1, int p2) {}
    public void setColorStateList(int p0, java.lang.String p1, android.content.res.ColorStateList p2) {}
    public void setColorStateList(int p0, java.lang.String p1, android.content.res.ColorStateList p2, android.content.res.ColorStateList p3) {}
    public void setColorStateListAttr(int p0, java.lang.String p1, int p2) {}
    public void setCompoundButtonChecked(int p0, boolean p1) {}
    public void setContentDescription(int p0, java.lang.CharSequence p1) {}
    public void setDisplayedChild(int p0, int p1) {}
    public void setDouble(int p0, java.lang.String p1, double p2) {}
    public void setDrawableTint(int p0, boolean p1, int p2, android.graphics.PorterDuff.Mode p3) {}
    public void setDuration(int p0, java.lang.String p1, java.time.Duration p2) {}
    public void setEmptyView(int p0, int p1) {}
    public void setFloat(int p0, java.lang.String p1, float p2) {}
    public void setFloatDimen(int p0, java.lang.String p1, float p2, int p3) {}
    public void setFloatDimen(int p0, java.lang.String p1, int p2) {}
    public void setFloatDimenAttr(int p0, java.lang.String p1, int p2) {}
    public void setIcon(int p0, java.lang.String p1, android.graphics.drawable.Icon p2) {}
    public void setIcon(int p0, java.lang.String p1, android.graphics.drawable.Icon p2, android.graphics.drawable.Icon p3) {}
    public void setImageViewBitmap(int p0, android.graphics.Bitmap p1) {}
    public void setImageViewIcon(int p0, android.graphics.drawable.Icon p1) {}
    public void setImageViewResource(int p0, int p1) {}
    public void setImageViewUri(int p0, android.net.Uri p1) {}
    public void setInstant(int p0, java.lang.String p1, java.time.Instant p2) {}
    public void setInt(int p0, java.lang.String p1, int p2) {}
    public void setIntDimen(int p0, java.lang.String p1, float p2, int p3) {}
    public void setIntDimen(int p0, java.lang.String p1, int p2) {}
    public void setIntDimenAttr(int p0, java.lang.String p1, int p2) {}
    public void setIntTag(int p0, int p1, int p2) {}
    public void setIntent(int p0, java.lang.String p1, android.content.Intent p2) {}
    public void setLabelFor(int p0, int p1) {}
    public void setLayoutInflaterFactory(android.view.LayoutInflater.Factory2 p0) {}
    public void setLightBackgroundLayoutId(int p0) {}
    public void setLong(int p0, java.lang.String p1, long p2) {}
    public void setOnCheckedChangeResponse(int p0, android.widget.RemoteViews.RemoteResponse p1) {}
    public void setOnClickFillInIntent(int p0, android.content.Intent p1) {}
    public void setOnClickPendingIntent(int p0, android.app.PendingIntent p1) {}
    public void setOnClickResponse(int p0, android.widget.RemoteViews.RemoteResponse p1) {}
    public void setOnStylusHandwritingPendingIntent(int p0, android.app.PendingIntent p1) {}
    public void setOriginalDensity(float p0) {}
    public void setPendingIntentTemplate(int p0, android.app.PendingIntent p1) {}
    public void setProgressBackgroundTintList(int p0, android.content.res.ColorStateList p1) {}
    public void setProgressBar(int p0, int p1, int p2, boolean p3) {}
    public void setProgressIndeterminateTintList(int p0, android.content.res.ColorStateList p1) {}
    public void setProgressTintList(int p0, android.content.res.ColorStateList p1) {}
    public void setProviderInstanceId(long p0) {}
    public void setRadioGroupChecked(int p0, int p1) {}
    public void setRelativeScrollPosition(int p0, int p1) {}
    @java.lang.Deprecated
    public void setRemoteAdapter(int p0, int p1, android.content.Intent p2) {}
    @java.lang.Deprecated
    public void setRemoteAdapter(int p0, android.content.Intent p1) {}
    public void setRemoteAdapter(int p0, android.widget.RemoteViews.RemoteCollectionItems p1) {}
    @java.lang.Deprecated
    public void setRemoteAdapter(int p0, java.util.ArrayList<android.widget.RemoteViews> p1, int p2) {}
    public void setRemoteInputs(int p0, android.app.RemoteInput[] p1) {}
    public void setRippleDrawableColor(int p0, android.content.res.ColorStateList p1) {}
    public void setScrollPosition(int p0, int p1) {}
    public void setShort(int p0, java.lang.String p1, short p2) {}
    public void setString(int p0, java.lang.String p1, java.lang.String p2) {}
    public void setTextColor(int p0, int p1) {}
    public void setTextColor(int p0, android.content.res.ColorStateList p1) {}
    public void setTextViewCompoundDrawables(int p0, int p1, int p2, int p3, int p4) {}
    public void setTextViewCompoundDrawables(int p0, android.graphics.drawable.Icon p1, android.graphics.drawable.Icon p2, android.graphics.drawable.Icon p3, android.graphics.drawable.Icon p4) {}
    public void setTextViewCompoundDrawablesRelative(int p0, int p1, int p2, int p3, int p4) {}
    public void setTextViewCompoundDrawablesRelative(int p0, android.graphics.drawable.Icon p1, android.graphics.drawable.Icon p2, android.graphics.drawable.Icon p3, android.graphics.drawable.Icon p4) {}
    public void setTextViewText(int p0, java.lang.CharSequence p1) {}
    public void setTextViewTextSize(int p0, int p1, float p2) {}
    public void setUri(int p0, java.lang.String p1, android.net.Uri p2) {}
    public void setViewLayoutHeight(int p0, float p1, int p2) {}
    public void setViewLayoutHeightAttr(int p0, int p1) {}
    public void setViewLayoutHeightDimen(int p0, int p1) {}
    public void setViewLayoutMargin(int p0, int p1, float p2, int p3) {}
    public void setViewLayoutMarginAttr(int p0, int p1, int p2) {}
    public void setViewLayoutMarginDimen(int p0, int p1, int p2) {}
    public void setViewLayoutWidth(int p0, float p1, int p2) {}
    public void setViewLayoutWidthAttr(int p0, int p1) {}
    public void setViewLayoutWidthDimen(int p0, int p1) {}
    public void setViewOutlinePreferredRadius(int p0, float p1, int p2) {}
    public void setViewOutlinePreferredRadiusAttr(int p0, int p1) {}
    public void setViewOutlinePreferredRadiusDimen(int p0, int p1) {}
    public void setViewPadding(int p0, float p1, float p2, float p3, float p4, int p5) {}
    public void setViewPadding(int p0, int p1, int p2, int p3, int p4) {}
    public void setViewVisibility(int p0, int p1) {}
    protected boolean shouldUseStaticFilter() { return false; }
    @java.lang.Deprecated
    public void showNext(int p0) {}
    @java.lang.Deprecated
    public void showPrevious(int p0) {}
    public void updateAppInfo(android.content.pm.ApplicationInfo p0) {}
    public void visitIcons(java.util.function.Consumer<android.graphics.drawable.Icon> p0) {}
    public void visitRemoteViews(java.util.function.Consumer<android.widget.RemoteViews> p0) {}
    public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
    public void writePreviewToProto(android.content.Context p0, android.util.proto.ProtoOutputStream p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static abstract class Action {
        public static final int MERGE_APPEND = 1;
        public static final int MERGE_IGNORE = 2;
        public static final int MERGE_REPLACE = 0;
        int mViewId;
        private Action() {}
        public abstract void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException;
        public boolean canWriteToProto() { return false; }
        public abstract int getActionTag();
        public java.lang.String getUniqueKey() { return null; }
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public int mergeBehavior() { return 0; }
        public boolean prefersAsyncApply() { return false; }
        public void setHierarchyRootData(android.widget.RemoteViews.HierarchyRootData p0) {}
        public void updateActionImageCacheReferences(android.widget.RemoteViews.ImageCache p0) {}
        public void visitIcons(java.util.function.Consumer<android.graphics.drawable.Icon> p0) {}
        protected void visitRemoteViews(java.util.function.Consumer<android.widget.RemoteViews> p0) {}
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
        public abstract void writeToParcel(android.os.Parcel p0, int p1);
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    public class ActionApplyParams {
        public int applyThemeResId;
        public android.widget.RemoteViews.ColorResources colorResources;
        public java.util.concurrent.Executor executor;
        public android.widget.RemoteViews.InteractionHandler handler;
        public float originalDensity;
        public ActionApplyParams(android.widget.RemoteViews p0) {}
        public android.widget.RemoteViews.ActionApplyParams clone() { return null; }
        public boolean hasOriginalDensity() { return false; }
        public android.widget.RemoteViews.ActionApplyParams withColorResources(android.widget.RemoteViews.ColorResources p0) { return null; }
        public android.widget.RemoteViews.ActionApplyParams withExecutor(java.util.concurrent.Executor p0) { return null; }
        public android.widget.RemoteViews.ActionApplyParams withInteractionHandler(android.widget.RemoteViews.InteractionHandler p0) { return null; }
        public android.widget.RemoteViews.ActionApplyParams withOriginalDensity(float p0) { return null; }
        public android.widget.RemoteViews.ActionApplyParams withThemeResId(int p0) { return null; }
    }

    public static class ActionException extends java.lang.RuntimeException {
        public ActionException(java.lang.Exception p0) { super(); }
        public ActionException(java.lang.String p0) { super(); }
        public ActionException(java.lang.String p0, java.lang.Throwable p1) { super(); }
        public ActionException(java.lang.Throwable p0) { super(); }
    }

    private static class ApplicationInfoCache {
        private final java.util.List<android.content.pm.ApplicationInfo> mCachedApplicationInfos = null;
        ApplicationInfoCache() {}
        ApplicationInfoCache(android.os.Parcel p0) {}
        int findId(android.content.pm.ApplicationInfo p0) { return 0; }
        android.content.pm.ApplicationInfo get(int p0) { return null; }
        int getOrPut(android.content.pm.ApplicationInfo p0) { return 0; }
        int updateAndGetId(android.content.pm.ApplicationInfo p0) { return 0; }
        void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ApplyFlags {
    }

    private class AsyncApplyTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.widget.RemoteViews.ViewTree> implements android.os.CancellationSignal.OnCancelListener {
        private android.widget.RemoteViews.Action[] mActions;
        final android.widget.RemoteViews.ActionApplyParams mApplyParams = null;
        final android.os.CancellationSignal mCancelSignal = null;
        final android.content.Context mContext = null;
        private java.lang.Exception mError;
        final android.widget.RemoteViews.OnViewAppliedListener mListener = null;
        final android.view.ViewGroup mParent = null;
        final android.widget.RemoteViews mRV = null;
        private android.view.View mResult;
        final boolean mTopLevel = false;
        private android.widget.RemoteViews.ViewTree mTree;
        private AsyncApplyTask(android.widget.RemoteViews p0, android.widget.RemoteViews p1, android.view.ViewGroup p2, android.content.Context p3, android.widget.RemoteViews.OnViewAppliedListener p4, android.widget.RemoteViews.ActionApplyParams p5, android.view.View p6, boolean p7) { super(); }
        private android.os.CancellationSignal startTaskOnExecutor(java.util.concurrent.Executor p0) { return null; }
        protected android.widget.RemoteViews.ViewTree doInBackground(java.lang.Void... p0) { return null; }
        public void onCancel() {}
        protected void onPostExecute(android.widget.RemoteViews.ViewTree p0) {}
    }

    private static final class AttributeReflectionAction extends android.widget.RemoteViews.BaseReflectionAction {
        static final int COLOR_RESOURCE = 2;
        static final int DIMEN_RESOURCE = 1;
        static final int STRING_RESOURCE = 3;
        private final int mAttrId = 0;
        private final int mResourceType = 0;
        AttributeReflectionAction(int p0, java.lang.String p1, int p2, int p3, int p4) { super((android.os.Parcel)null); }
        AttributeReflectionAction(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        protected java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static abstract class BaseReflectionAction extends android.widget.RemoteViews.Action {
        static final int BLEND_MODE = 17;
        static final int BOOLEAN = 1;
        static final int BUNDLE = 13;
        static final int BYTE = 2;
        static final int CHAR = 8;
        static final int CHAR_SEQUENCE = 10;
        static final int COLOR_STATE_LIST = 15;
        static final int DOUBLE = 7;
        static final int DURATION = 19;
        static final int FLOAT = 6;
        static final int ICON = 16;
        static final int INSTANT = 18;
        static final int INT = 4;
        static final int INTENT = 14;
        static final int LIST_CHAR_SEQUENCE = 20;
        static final int LONG = 5;
        static final int SHORT = 3;
        static final int STRING = 9;
        static final int URI = 11;
        java.lang.String mMethodName;
        int mType;
        BaseReflectionAction(int p0, java.lang.String p1, int p2) { super(); }
        BaseReflectionAction(android.os.Parcel p0) { super(); }
        public final void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        protected abstract java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException;
        public final java.lang.String getUniqueKey() { return null; }
        public final android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public final int mergeBehavior() { return 0; }
        public final boolean prefersAsyncApply() { return false; }
        public void visitIcons(java.util.function.Consumer<android.graphics.drawable.Icon> p0) {}
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class ColorResources {
        private static final int ARSC_ENTRY_SIZE = 16;
        private static final int FIRST_RESOURCE_COLOR_ID = 17170461;
        private static final int LAST_RESOURCE_COLOR_ID = 17170641;
        private static final java.lang.String OVERLAY_NAME = "remote_views_color_resources";
        private static final java.lang.String OVERLAY_TARGET_PACKAGE_NAME = "android";
        private final android.util.SparseIntArray mColorMapping = null;
        private final android.content.res.loader.ResourcesLoader mLoader = null;
        private ColorResources(android.content.res.loader.ResourcesLoader p0, android.util.SparseIntArray p1) {}
        public static android.widget.RemoteViews.ColorResources create(android.content.Context p0, android.util.SparseIntArray p1) { return null; }
        private static byte[] createCompiledResourcesContent(android.content.Context p0, android.util.SparseIntArray p1) throws java.io.IOException { return null; }
        private static android.content.res.loader.ResourcesLoader createLoaderWithOverlay(android.content.Context p0, android.content.om.FabricatedOverlay p1) { return null; }
        public static android.widget.RemoteViews.ColorResources createWithOverlay(android.content.Context p0, android.util.SparseIntArray p1) { return null; }
        public static android.widget.RemoteViews.ColorResources createWithOverlay(android.content.Context p0, int[] p1, int p2) { return null; }
        private static java.io.ByteArrayOutputStream readFileContent(java.io.InputStream p0) throws java.io.IOException { return null; }
        public void apply(android.content.Context p0) {}
        public android.util.SparseIntArray getColorMapping() { return null; }
    }

    private static final class ComplexUnitDimensionReflectionAction extends android.widget.RemoteViews.BaseReflectionAction {
        private final int mUnit = 0;
        private final float mValue = 0.0f;
        ComplexUnitDimensionReflectionAction(int p0, java.lang.String p1, int p2, float p3, int p4) { super((android.os.Parcel)null); }
        ComplexUnitDimensionReflectionAction(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        protected java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    public static final class DrawInstructions {
        private static final long VERSION = 1L;
        final java.util.List<byte[]> mInstructions = null;
        private DrawInstructions() {}
        private DrawInstructions(java.util.List<byte[]> p0) {}
        public static long getSupportedVersion() { return 0L; }
        private static android.widget.RemoteViews.DrawInstructions readFromParcel(android.os.Parcel p0) { return null; }
        private static void writeToParcel(android.widget.RemoteViews.DrawInstructions p0, android.os.Parcel p1, int p2) {}

        public static final class Builder {
            private final java.util.List<byte[]> mInstructions = null;
            public Builder(java.util.List<byte[]> p0) {}
            public android.widget.RemoteViews.DrawInstructions build() { return null; }
        }
    }

    private static final class HierarchyRootData {
        final android.widget.RemoteViews.ApplicationInfoCache mApplicationInfoCache = null;
        final java.util.Map<java.lang.Class, java.lang.Object> mClassCookies = null;
        final android.widget.RemoteViews.ImageCache mImageCache = null;
        final android.widget.RemoteViews.RemoteCollectionCache mRemoteCollectionCache = null;
        HierarchyRootData(android.widget.RemoteViews.ImageCache p0, android.widget.RemoteViews.RemoteCollectionCache p1, android.widget.RemoteViews.ApplicationInfoCache p2, java.util.Map<java.lang.Class, java.lang.Object> p3) {}
    }

    static class ImageCache {
        private long mBitmapMemory;
        private final java.util.ArrayList<android.widget.RemoteViews.LocalImage> mEntries = null;
        private final java.util.HashMap<android.widget.RemoteViews.LocalImage, java.lang.Integer> mLocalImageToId = null;
        ImageCache() {}
        ImageCache(android.os.Parcel p0) {}
        ImageCache(android.widget.RemoteViews.ImageCache p0) {}
        public android.graphics.Bitmap getBitmapForId(int p0) { return null; }
        public long getBitmapMemory() { return 0L; }
        public long getConvertedFromBitmapMemory() { return 0L; }
        public long getIconBitmapMemory() { return 0L; }
        public android.graphics.drawable.Icon getIconForId(int p0) { return null; }
        public int getImageId(android.graphics.Bitmap p0) { return 0; }
        public int getImageId(android.graphics.drawable.Icon p0) { return 0; }
        public int getImageId(android.widget.RemoteViews.LocalImage p0) { return 0; }
        public android.widget.RemoteViews.LocalImage getLocalImage(int p0) { return null; }
        public void markImageConvertedFromBitmap(int p0) {}
        public void mergeWithCache(android.widget.RemoteViews.ImageCache p0) {}
        public boolean offloadBitmaps(java.util.function.Function<android.graphics.Bitmap, android.net.Uri> p0) { return false; }
        public void rebuildHashes() {}
        public void writeImagesToParcel(android.os.Parcel p0, int p1) {}
        public void writeImagesToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1) {}
    }

    class ImageReflectionAction extends android.widget.RemoteViews.BaseReflectionAction {
        int mImageId;
        android.widget.RemoteViews.LocalImage mLocalImage;
        ImageReflectionAction(android.widget.RemoteViews p0, int p1, java.lang.String p2, int p3) { super((android.os.Parcel)null); }
        ImageReflectionAction(android.widget.RemoteViews p0, int p1, java.lang.String p2, android.graphics.drawable.Icon p3) { super((android.os.Parcel)null); }
        ImageReflectionAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super((android.os.Parcel)null); }
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        protected java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException { return null; }
        public void setHierarchyRootData(android.widget.RemoteViews.HierarchyRootData p0) {}
        public void updateActionImageCacheReferences(android.widget.RemoteViews.ImageCache p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    public static interface InteractionHandler {
        public boolean onInteraction(android.view.View p0, android.app.PendingIntent p1, android.widget.RemoteViews.RemoteResponse p2);
        default public void onScroll(android.widget.AbsListView p0) {}
    }

    private static class InvalidProtoException extends java.lang.Exception {
        InvalidProtoException(java.lang.String p0) { super(); }
    }

    private static class LayoutParamAction extends android.widget.RemoteViews.Action {
        static final int LAYOUT_HEIGHT = 9;
        static final int LAYOUT_MARGIN_BOTTOM = 3;
        static final int LAYOUT_MARGIN_END = 5;
        static final int LAYOUT_MARGIN_LEFT = 0;
        static final int LAYOUT_MARGIN_RIGHT = 2;
        static final int LAYOUT_MARGIN_START = 4;
        static final int LAYOUT_MARGIN_TOP = 1;
        static final int LAYOUT_WIDTH = 8;
        final int mProperty = 0;
        final int mValue = 0;
        final int mValueType = 0;
        LayoutParamAction(int p0, int p1, float p2, int p3) { super(); }
        LayoutParamAction(int p0, int p1, int p2, int p3) { super(); }
        public LayoutParamAction(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        private int getPixelOffset(android.view.View p0, android.widget.RemoteViews.ActionApplyParams p1) { return 0; }
        private int getPixelSize(android.view.View p0, android.widget.RemoteViews.ActionApplyParams p1) { return 0; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public java.lang.String getUniqueKey() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    static final class LocalImage {
        private android.graphics.Bitmap mBitmap;
        private android.graphics.drawable.Icon mIcon;
        private boolean mIsConvertedFromBitmap;
        LocalImage(android.graphics.Bitmap p0) {}
        LocalImage(android.graphics.drawable.Icon p0, boolean p1) {}
        LocalImage(android.os.Parcel p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        android.graphics.Bitmap getBitmap() { return null; }
        long getBitmapMemory() { return 0L; }
        android.graphics.drawable.Icon getIcon() { return null; }
        public int hashCode() { return 0; }
        boolean isConvertedFromBitmap() { return false; }
        void setConvertedFromBitmap(boolean p0) {}
        void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MarginType {
    }

    static class MethodArgs {
        public java.lang.invoke.MethodHandle asyncMethod;
        public java.lang.String asyncMethodName;
        public java.lang.invoke.MethodHandle syncMethod;
        MethodArgs() {}
    }

    static class MethodKey {
        public java.lang.String methodName;
        public java.lang.Class<?> paramClass;
        public java.lang.Class<?> paramTypeArgumentClass;
        public java.lang.Class<?> targetClass;
        MethodKey() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public void set(java.lang.Class<?> p0, java.lang.Class<?> p1, java.lang.Class<?> p2, java.lang.String p3) {}
    }

    private static final class NightModeReflectionAction extends android.widget.RemoteViews.BaseReflectionAction {
        private final java.lang.Object mDarkValue = null;
        private final java.lang.Object mLightValue = null;
        NightModeReflectionAction(int p0, java.lang.String p1, int p2, java.lang.Object p3, java.lang.Object p4) { super((android.os.Parcel)null); }
        NightModeReflectionAction(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        protected java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException { return null; }
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    public static interface OnViewAppliedListener {
        public void onError(java.lang.Exception p0);
        public void onViewApplied(android.view.View p0);
        default public void onViewInflated(android.view.View p0) {}
    }

    static interface PendingResources<T extends java.lang.Object> {
        public T create(android.content.Context p0, android.content.res.Resources p1, android.widget.RemoteViews.HierarchyRootData p2, int p3) throws java.lang.Exception;
    }

    private static final class ReflectionAction extends android.widget.RemoteViews.BaseReflectionAction {
        java.lang.Object mValue;
        ReflectionAction(int p0, java.lang.String p1, int p2, java.lang.Object p3) { super((android.os.Parcel)null); }
        ReflectionAction(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        protected java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private class RemoteCollectionCache {
        private final android.util.SparseArray<java.lang.String> mIdToUriMapping = null;
        private final java.util.Map<java.lang.String, android.widget.RemoteViews.RemoteCollectionItems> mUriToCollectionMapping = null;
        RemoteCollectionCache(android.widget.RemoteViews p0) {}
        RemoteCollectionCache(android.widget.RemoteViews p0, android.os.Parcel p1) {}
        RemoteCollectionCache(android.widget.RemoteViews p0, android.widget.RemoteViews.RemoteCollectionCache p1) {}
        private void collectAllIntentsInternal(android.widget.RemoteViews p0, android.util.SparseArray<android.content.Intent> p1) {}
        private java.util.concurrent.CompletableFuture<java.lang.Void> connectAllUniqueIntents(int p0, int p1, android.util.SparseArray<android.content.Intent> p2, boolean p3, android.appwidget.AppWidgetManager.ServiceCollectionCache p4) { return null; }
        private static java.util.concurrent.CompletableFuture<android.widget.RemoteViews.RemoteCollectionItems> getItemsFutureFromIntent(android.content.Intent p0, int p1, int p2, boolean p3, android.appwidget.AppWidgetManager.ServiceCollectionCache p4) { return null; }
        void addMapping(int p0, java.lang.String p1, android.widget.RemoteViews.RemoteCollectionItems p2) {}
        public java.util.concurrent.CompletableFuture<java.lang.Void> collectAllIntentsNoComplete(android.widget.RemoteViews p0, int p1, boolean p2, android.appwidget.AppWidgetManager.ServiceCollectionCache p3) { return null; }
        android.widget.RemoteViews.RemoteCollectionItems getItemsForId(int p0) { return null; }
        public void replaceAllIntentsWithEmptyList(android.widget.RemoteViews p0) {}
        void setHierarchyDataForId(int p0, android.widget.RemoteViews.HierarchyRootData p1) {}
        public void writeToParcel(android.os.Parcel p0, int p1, android.util.SparseArray<android.content.Intent> p2) {}
        public void writeToProto(android.content.Context p0, android.util.proto.ProtoOutputStream p1) {}
    }

    public static final class RemoteCollectionItems implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.widget.RemoteViews.RemoteCollectionItems> CREATOR = null;
        private final boolean mHasLegacyNullItems = false;
        private final boolean mHasStableIds = false;
        private android.widget.RemoteViews.HierarchyRootData mHierarchyRootData;
        private final long[] mIds = null;
        private final int mViewTypeCount = 0;
        private final android.widget.RemoteViews[] mViews = null;
        RemoteCollectionItems(android.os.Parcel p0, android.widget.RemoteViews.HierarchyRootData p1) {}
        RemoteCollectionItems(long[] p0, android.widget.RemoteViews[] p1, boolean p2, int p3) {}
        RemoteCollectionItems(long[] p0, android.widget.RemoteViews[] p1, boolean p2, int p3, boolean p4) {}
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.RemoteCollectionItems> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public static android.widget.RemoteViews.RemoteCollectionItems createFromProto(android.content.Context p0, android.util.proto.ProtoInputStream p1) throws java.lang.Exception { return null; }
        private void visitIcons(java.util.function.Consumer<android.graphics.drawable.Icon> p0) {}
        private void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
        private void writeToParcel(android.os.Parcel p0, int p1, boolean p2) {}
        private void writeToProto(android.content.Context p0, android.util.proto.ProtoOutputStream p1, boolean p2) {}
        public int describeContents() { return 0; }
        public int getItemCount() { return 0; }
        public long getItemId(int p0) { return 0L; }
        public android.widget.RemoteViews getItemView(int p0) { return null; }
        public int getViewTypeCount() { return 0; }
        boolean hasLegacyNullItems() { return false; }
        public boolean hasStableIds() { return false; }
        void setHierarchyRootData(android.widget.RemoteViews.HierarchyRootData p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.content.Context p0, android.util.proto.ProtoOutputStream p1) {}

        public static final class Builder {
            private boolean mHasLegacyNullItems;
            private boolean mHasStableIds;
            private final android.util.LongArray mIds = null;
            private int mViewTypeCount;
            private final java.util.List<android.widget.RemoteViews> mViews = null;
            public Builder() {}
            public android.widget.RemoteViews.RemoteCollectionItems.Builder addItem(long p0, android.widget.RemoteViews p1) { return null; }
            public android.widget.RemoteViews.RemoteCollectionItems build() { return null; }
            public android.widget.RemoteViews.RemoteCollectionItems.Builder setHasLegacyNullItems(boolean p0) { return null; }
            public android.widget.RemoteViews.RemoteCollectionItems.Builder setHasStableIds(boolean p0) { return null; }
            public android.widget.RemoteViews.RemoteCollectionItems.Builder setViewTypeCount(int p0) { return null; }
        }
    }

    public static class RemoteResponse {
        public static final int INTERACTION_TYPE_CHECKED_CHANGE = 1;
        public static final int INTERACTION_TYPE_CLICK = 0;
        private java.util.ArrayList<java.lang.String> mElementNames;
        private android.content.Intent mFillIntent;
        private int mInteractionType;
        private android.app.PendingIntent mPendingIntent;
        private android.util.IntArray mViewIds;
        public RemoteResponse() {}
        public static android.widget.RemoteViews.RemoteResponse fromFillInIntent(android.content.Intent p0) { return null; }
        public static android.widget.RemoteViews.RemoteResponse fromPendingIntent(android.app.PendingIntent p0) { return null; }
        private static android.widget.RemoteViews.RemoteResponse fromPendingIntentTemplateAndFillInIntent(android.app.PendingIntent p0, android.content.Intent p1) { return null; }
        private static android.widget.AdapterView<?> getAdapterViewAncestor(android.view.View p0) { return null; }
        private void handleViewInteraction(android.view.View p0, android.widget.RemoteViews.InteractionHandler p1) {}
        private void readFromParcel(android.os.Parcel p0) {}
        private void writeToParcel(android.os.Parcel p0, int p1) {}
        public android.widget.RemoteViews.RemoteResponse addSharedElement(int p0, java.lang.String p1) { return null; }
        public android.util.Pair<android.content.Intent, android.app.ActivityOptions> getLaunchOptions(android.view.View p0) { return null; }
        public android.widget.RemoteViews.RemoteResponse setInteractionType(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface InteractionType {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    public static @interface RemoteView {
    }

    public static final class RemoteViewOutlineProvider extends android.view.ViewOutlineProvider {
        private final float mRadius = 0.0f;
        public RemoteViewOutlineProvider(float p0) { super(); }
        public void getOutline(android.view.View p0, android.graphics.Outline p1) {}
        public float getRadius() { return 0.0f; }
    }

    private static class RemoteViewsContextWrapper extends android.content.ContextWrapper {
        private final android.content.Context mContextForResources = null;
        RemoteViewsContextWrapper(android.content.Context p0, android.content.Context p1) { super(null); }
        public java.lang.String getPackageName() { return null; }
        public android.content.res.Resources getResources() { return null; }
        public android.content.res.Resources.Theme getTheme() { return null; }
        public android.os.UserHandle getUser() { return null; }
        public int getUserId() { return 0; }
        public boolean isRestricted() { return false; }
    }

    private static class RemoveFromParentAction extends android.widget.RemoteViews.Action {
        RemoveFromParentAction(int p0) { super(); }
        RemoveFromParentAction(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public int mergeBehavior() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static final class ResourceReflectionAction extends android.widget.RemoteViews.BaseReflectionAction {
        static final int COLOR_RESOURCE = 2;
        static final int DIMEN_RESOURCE = 1;
        static final int STRING_RESOURCE = 3;
        private final int mResId = 0;
        private final int mResourceType = 0;
        ResourceReflectionAction(int p0, java.lang.String p1, int p2, int p3, int p4) { super((android.os.Parcel)null); }
        ResourceReflectionAction(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        protected java.lang.Object getParameterValue(android.view.View p0) throws android.widget.RemoteViews.ActionException { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static final class RunnableAction extends android.widget.RemoteViews.RuntimeAction {
        private final java.lang.Runnable mRunnable = null;
        RunnableAction(java.lang.Runnable p0) { super(); }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
    }

    private static abstract class RuntimeAction extends android.widget.RemoteViews.Action {
        private RuntimeAction() { super(); }
        public final int getActionTag() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class SetCompoundButtonCheckedAction extends android.widget.RemoteViews.Action {
        private final boolean mChecked = false;
        SetCompoundButtonCheckedAction(int p0, boolean p1) { super(); }
        SetCompoundButtonCheckedAction(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static class SetDrawableTint extends android.widget.RemoteViews.Action {
        int mColorFilter;
        android.graphics.PorterDuff.Mode mFilterMode;
        boolean mTargetBackground;
        SetDrawableTint(int p0, boolean p1, int p2, android.graphics.PorterDuff.Mode p3) { super(); }
        SetDrawableTint(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private class SetDrawInstructionAction extends android.widget.RemoteViews.Action {
        private final android.widget.RemoteViews.DrawInstructions mInstructions = null;
        SetDrawInstructionAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        SetDrawInstructionAction(android.widget.RemoteViews p0, android.widget.RemoteViews.DrawInstructions p1) { super(); }
        private android.widget.RemoteViews.Action applyAction(android.view.View p0, java.util.function.BiFunction<com.android.internal.widget.remotecompose.player.RemoteComposePlayer, com.android.internal.widget.remotecompose.player.RemoteDocument, android.widget.RemoteViews.Action> p1) { return null; }
        private void applyActionListener(com.android.internal.widget.remotecompose.player.RemoteComposePlayer p0, android.widget.RemoteViews.ActionApplyParams p1) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public final android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public boolean prefersAsyncApply() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static class SetEmptyView extends android.widget.RemoteViews.Action {
        int mEmptyViewId;
        SetEmptyView(int p0, int p1) { super(); }
        SetEmptyView(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static class SetIntTagAction extends android.widget.RemoteViews.Action {
        private final int mKey = 0;
        private final int mTag = 0;
        private final int mViewId = 0;
        SetIntTagAction(int p0, int p1, int p2) { super(); }
        SetIntTagAction(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private class SetOnCheckedChangeResponse extends android.widget.RemoteViews.Action {
        private final android.widget.RemoteViews.RemoteResponse mResponse = null;
        SetOnCheckedChangeResponse(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews.RemoteResponse p2) { super(); }
        SetOnCheckedChangeResponse(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private class SetOnClickResponse extends android.widget.RemoteViews.Action {
        final android.widget.RemoteViews.RemoteResponse mResponse = null;
        SetOnClickResponse(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews.RemoteResponse p2) { super(); }
        SetOnClickResponse(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private class SetOnStylusHandwritingResponse extends android.widget.RemoteViews.Action {
        final android.app.PendingIntent mPendingIntent = null;
        SetOnStylusHandwritingResponse(android.widget.RemoteViews p0, int p1, android.app.PendingIntent p2) { super(); }
        SetOnStylusHandwritingResponse(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class SetPendingIntentTemplate extends android.widget.RemoteViews.Action {
        android.app.PendingIntent mPendingIntentTemplate;
        public SetPendingIntentTemplate(int p0, android.app.PendingIntent p1) { super(); }
        public SetPendingIntentTemplate(android.os.Parcel p0) { super(); }
        private android.widget.RemoteViews.RemoteResponse findRemoteResponseTag(android.view.View p0) { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class SetRadioGroupCheckedAction extends android.widget.RemoteViews.Action {
        private final int mCheckedId = 0;
        SetRadioGroupCheckedAction(int p0, int p1) { super(); }
        SetRadioGroupCheckedAction(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private class SetRemoteCollectionItemListAdapterAction extends android.widget.RemoteViews.Action {
        int mIntentId;
        boolean mIsReplacedIntoAction;
        private android.widget.RemoteViews.RemoteCollectionItems mItems;
        final android.content.Intent mServiceIntent = null;
        SetRemoteCollectionItemListAdapterAction(android.widget.RemoteViews p0, int p1, android.content.Intent p2) { super(); }
        SetRemoteCollectionItemListAdapterAction(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews.RemoteCollectionItems p2) { super(); }
        SetRemoteCollectionItemListAdapterAction(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public java.lang.String getUniqueKey() { return null; }
        public void setHierarchyRootData(android.widget.RemoteViews.HierarchyRootData p0) {}
        public void visitIcons(java.util.function.Consumer<android.graphics.drawable.Icon> p0) {}
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static class SetRemoteInputsAction extends android.widget.RemoteViews.Action {
        final android.os.Parcelable[] mRemoteInputs = null;
        public SetRemoteInputsAction(int p0, android.app.RemoteInput[] p1) { super(); }
        public SetRemoteInputsAction(android.os.Parcel p0) { super(); }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class SetRippleDrawableColor extends android.widget.RemoteViews.Action {
        android.content.res.ColorStateList mColorStateList;
        SetRippleDrawableColor(int p0, android.content.res.ColorStateList p1) { super(); }
        SetRippleDrawableColor(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static class SetViewOutlinePreferredRadiusAction extends android.widget.RemoteViews.Action {
        private final int mValue = 0;
        private final int mValueType = 0;
        SetViewOutlinePreferredRadiusAction(int p0, float p1, int p2) { super(); }
        SetViewOutlinePreferredRadiusAction(int p0, int p1, int p2) { super(); }
        SetViewOutlinePreferredRadiusAction(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) throws android.widget.RemoteViews.ActionException {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static class TextViewDrawableAction extends android.widget.RemoteViews.Action {
        int mD1;
        int mD2;
        int mD3;
        int mD4;
        boolean mDrawablesLoaded;
        android.graphics.drawable.Icon mI1;
        android.graphics.drawable.Icon mI2;
        android.graphics.drawable.Icon mI3;
        android.graphics.drawable.Icon mI4;
        android.graphics.drawable.Drawable mId1;
        android.graphics.drawable.Drawable mId2;
        android.graphics.drawable.Drawable mId3;
        android.graphics.drawable.Drawable mId4;
        boolean mIsRelative;
        boolean mUseIcons;
        public TextViewDrawableAction(int p0, boolean p1, int p2, int p3, int p4, int p5) { super(); }
        public TextViewDrawableAction(int p0, boolean p1, android.graphics.drawable.Icon p2, android.graphics.drawable.Icon p3, android.graphics.drawable.Icon p4, android.graphics.drawable.Icon p5) { super(); }
        public TextViewDrawableAction(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public boolean prefersAsyncApply() { return false; }
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static class TextViewSizeAction extends android.widget.RemoteViews.Action {
        float mSize;
        int mUnits;
        TextViewSizeAction(int p0, int p1, float p2) { super(); }
        TextViewSizeAction(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ValueType {
    }

    @java.lang.Deprecated
    private final class ViewContentNavigation extends android.widget.RemoteViews.Action {
        final boolean mNext = false;
        ViewContentNavigation(android.widget.RemoteViews p0, int p1, boolean p2) { super(); }
        ViewContentNavigation(android.widget.RemoteViews p0, android.os.Parcel p1) { super(); }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public int getActionTag() { return 0; }
        public int mergeBehavior() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private class ViewGroupActionAdd extends android.widget.RemoteViews.Action {
        static final int NO_ID = -1;
        private int mIndex;
        private android.widget.RemoteViews mNestedViews;
        private int mStableId;
        ViewGroupActionAdd(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews p2) { super(); }
        ViewGroupActionAdd(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews p2, int p3) { super(); }
        ViewGroupActionAdd(android.widget.RemoteViews p0, int p1, android.widget.RemoteViews p2, int p3, int p4) { super(); }
        ViewGroupActionAdd(android.widget.RemoteViews p0, android.os.Parcel p1, android.content.pm.ApplicationInfo p2, int p3) { super(); }
        private int findViewIndexToRecycle(android.view.ViewGroup p0, android.widget.RemoteViews p1) { return 0; }
        private android.widget.RemoteViews.Action insertNewView(android.content.Context p0, android.widget.RemoteViews.ViewTree p1, android.widget.RemoteViews.ActionApplyParams p2, java.lang.Runnable p3) { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public int mergeBehavior() { return 0; }
        public boolean prefersAsyncApply() { return false; }
        public void setHierarchyRootData(android.widget.RemoteViews.HierarchyRootData p0) {}
        public void visitIcons(java.util.function.Consumer<android.graphics.drawable.Icon> p0) {}
        protected void visitRemoteViews(java.util.function.Consumer<android.widget.RemoteViews> p0) {}
        public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static class ViewGroupActionRemove extends android.widget.RemoteViews.Action {
        private static final int REMOVE_ALL_VIEWS_ID = -2;
        private int mViewIdToKeep;
        ViewGroupActionRemove(int p0) { super(); }
        ViewGroupActionRemove(int p0, int p1) { super(); }
        ViewGroupActionRemove(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        private void removeAllViewsExceptIdToKeep(android.view.ViewGroup p0) {}
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public android.widget.RemoteViews.Action initActionAsync(android.widget.RemoteViews.ViewTree p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) { return null; }
        public int mergeBehavior() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static class ViewPaddingAction extends android.widget.RemoteViews.Action {
        float mBottom;
        float mLeft;
        float mRight;
        float mTop;
        int mUnits;
        ViewPaddingAction(int p0, float p1, float p2, float p3, float p4, int p5) { super(); }
        public ViewPaddingAction(android.os.Parcel p0) { super(); }
        public static android.widget.RemoteViews.PendingResources<android.widget.RemoteViews.Action> createFromProto(android.util.proto.ProtoInputStream p0) throws java.lang.Exception { return null; }
        public void apply(android.view.View p0, android.view.ViewGroup p1, android.widget.RemoteViews.ActionApplyParams p2) {}
        public boolean canWriteToProto() { return false; }
        public int getActionTag() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToProto(android.util.proto.ProtoOutputStream p0, android.content.Context p1, android.content.res.Resources p2) {}
    }

    private static class ViewTree {
        private static final int INSERT_AT_END_INDEX = -1;
        private java.util.ArrayList<android.widget.RemoteViews.ViewTree> mChildren;
        android.view.View mRoot;
        private ViewTree(android.view.View p0) {}
        private void addViewChild(android.view.View p0) {}
        public void addChild(android.widget.RemoteViews.ViewTree p0) {}
        public void addChild(android.widget.RemoteViews.ViewTree p0, int p1) {}
        public void createTree() {}
        public int findChildIndex(int p0, java.util.function.Predicate<android.view.View> p1) { return 0; }
        public int findChildIndex(java.util.function.Predicate<android.view.View> p0) { return 0; }
        public <T extends android.view.View> T findViewById(int p0) { return null; }
        public android.widget.RemoteViews.ViewTree findViewTreeById(int p0) { return null; }
        public android.widget.RemoteViews.ViewTree findViewTreeParentOf(android.widget.RemoteViews.ViewTree p0) { return null; }
        public void removeChildren(int p0, int p1) {}
        public void replaceView(android.view.View p0) {}
    }
}
