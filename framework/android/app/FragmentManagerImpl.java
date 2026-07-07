package android.app;

final class FragmentManagerImpl extends android.app.FragmentManager implements android.view.LayoutInflater.Factory2 {
    static boolean DEBUG;
    static final java.lang.String TAG = "FragmentManager";
    static final java.lang.String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    static final java.lang.String TARGET_STATE_TAG = "android:target_state";
    static final java.lang.String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    static final java.lang.String VIEW_STATE_TAG = "android:view_state";
    android.util.SparseArray<android.app.Fragment> mActive;
    final java.util.ArrayList<android.app.Fragment> mAdded = null;
    boolean mAllowOldReentrantBehavior;
    java.util.ArrayList<java.lang.Integer> mAvailBackStackIndices;
    java.util.ArrayList<android.app.BackStackRecord> mBackStack;
    java.util.ArrayList<android.app.FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
    java.util.ArrayList<android.app.BackStackRecord> mBackStackIndices;
    android.app.FragmentContainer mContainer;
    java.util.ArrayList<android.app.Fragment> mCreatedMenus;
    int mCurState;
    boolean mDestroyed;
    java.lang.Runnable mExecCommit;
    boolean mExecutingActions;
    boolean mHavePendingDeferredStart;
    android.app.FragmentHostCallback<?> mHost;
    final java.util.concurrent.CopyOnWriteArrayList<android.util.Pair<android.app.FragmentManager.FragmentLifecycleCallbacks, java.lang.Boolean>> mLifecycleCallbacks = null;
    boolean mNeedMenuInvalidate;
    int mNextFragmentIndex;
    java.lang.String mNoTransactionsBecause;
    android.app.Fragment mParent;
    java.util.ArrayList<android.app.FragmentManagerImpl.OpGenerator> mPendingActions;
    java.util.ArrayList<android.app.FragmentManagerImpl.StartEnterTransitionListener> mPostponedTransactions;
    android.app.Fragment mPrimaryNav;
    android.app.FragmentManagerNonConfig mSavedNonConfig;
    android.util.SparseArray<android.os.Parcelable> mStateArray;
    android.os.Bundle mStateBundle;
    boolean mStateSaved;
    java.util.ArrayList<android.app.Fragment> mTmpAddedFragments;
    java.util.ArrayList<java.lang.Boolean> mTmpIsPop;
    java.util.ArrayList<android.app.BackStackRecord> mTmpRecords;
    FragmentManagerImpl() { super(); }
    private void addAddedFragments(android.util.ArraySet<android.app.Fragment> p0) {}
    private void burpActive() {}
    private void checkStateLoss() {}
    private void cleanupExec() {}
    private void completeExecute(android.app.BackStackRecord p0, boolean p1, boolean p2, boolean p3) {}
    private void dispatchMoveToState(int p0) {}
    private void endAnimatingAwayFragments() {}
    private void ensureExecReady(boolean p0) {}
    private static void executeOps(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1, int p2, int p3) {}
    private void executeOpsTogether(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1, int p2, int p3) {}
    private void executePostponedTransaction(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1) {}
    private android.app.Fragment findFragmentUnder(android.app.Fragment p0) { return null; }
    private void forcePostponedTransactions() {}
    private boolean generateOpsForPendingActions(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1) { return false; }
    private void makeRemovedFragmentsInvisible(android.util.ArraySet<android.app.Fragment> p0) {}
    static boolean modifiesAlpha(android.animation.Animator p0) { return false; }
    private boolean popBackStackImmediate(java.lang.String p0, int p1, int p2) { return false; }
    private int postponePostponableTransactions(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1, int p2, int p3, android.util.ArraySet<android.app.Fragment> p4) { return 0; }
    private void removeRedundantOperationsAndExecute(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1) {}
    public static int reverseTransit(int p0) { return 0; }
    private void scheduleCommit() {}
    private void setHWLayerAnimListenerIfAlpha(android.view.View p0, android.animation.Animator p1) {}
    private static void setRetaining(android.app.FragmentManagerNonConfig p0) {}
    static boolean shouldRunOnHWLayer(android.view.View p0, android.animation.Animator p1) { return false; }
    private void throwException(java.lang.RuntimeException p0) {}
    public static int transitToStyleIndex(int p0, boolean p1) { return 0; }
    void addBackStackState(android.app.BackStackRecord p0) {}
    public void addFragment(android.app.Fragment p0, boolean p1) {}
    public void addOnBackStackChangedListener(android.app.FragmentManager.OnBackStackChangedListener p0) {}
    public int allocBackStackIndex(android.app.BackStackRecord p0) { return 0; }
    public void attachController(android.app.FragmentHostCallback<?> p0, android.app.FragmentContainer p1, android.app.Fragment p2) {}
    public void attachFragment(android.app.Fragment p0) {}
    public android.app.FragmentTransaction beginTransaction() { return null; }
    void completeShowHideFragment(android.app.Fragment p0) {}
    public void detachFragment(android.app.Fragment p0) {}
    public void dispatchActivityCreated() {}
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    public boolean dispatchContextItemSelected(android.view.MenuItem p0) { return false; }
    public void dispatchCreate() {}
    public boolean dispatchCreateOptionsMenu(android.view.Menu p0, android.view.MenuInflater p1) { return false; }
    public void dispatchDestroy() {}
    public void dispatchDestroyView() {}
    public void dispatchLowMemory() {}
    @java.lang.Deprecated
    public void dispatchMultiWindowModeChanged(boolean p0) {}
    public void dispatchMultiWindowModeChanged(boolean p0, android.content.res.Configuration p1) {}
    void dispatchOnFragmentActivityCreated(android.app.Fragment p0, android.os.Bundle p1, boolean p2) {}
    void dispatchOnFragmentAttached(android.app.Fragment p0, android.content.Context p1, boolean p2) {}
    void dispatchOnFragmentCreated(android.app.Fragment p0, android.os.Bundle p1, boolean p2) {}
    void dispatchOnFragmentDestroyed(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentDetached(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentPaused(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentPreAttached(android.app.Fragment p0, android.content.Context p1, boolean p2) {}
    void dispatchOnFragmentPreCreated(android.app.Fragment p0, android.os.Bundle p1, boolean p2) {}
    void dispatchOnFragmentResumed(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentSaveInstanceState(android.app.Fragment p0, android.os.Bundle p1, boolean p2) {}
    void dispatchOnFragmentStarted(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentStopped(android.app.Fragment p0, boolean p1) {}
    void dispatchOnFragmentViewCreated(android.app.Fragment p0, android.view.View p1, android.os.Bundle p2, boolean p3) {}
    void dispatchOnFragmentViewDestroyed(android.app.Fragment p0, boolean p1) {}
    public boolean dispatchOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public void dispatchOptionsMenuClosed(android.view.Menu p0) {}
    public void dispatchPause() {}
    @java.lang.Deprecated
    public void dispatchPictureInPictureModeChanged(boolean p0) {}
    public void dispatchPictureInPictureModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public boolean dispatchPrepareOptionsMenu(android.view.Menu p0) { return false; }
    public void dispatchResume() {}
    public void dispatchStart() {}
    public void dispatchStop() {}
    public void dispatchTrimMemory(int p0) {}
    void doPendingDeferredStart() {}
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    public void enqueueAction(android.app.FragmentManagerImpl.OpGenerator p0, boolean p1) {}
    void ensureInflatedFragmentView(android.app.Fragment p0) {}
    public boolean execPendingActions() { return false; }
    public void execSingleAction(android.app.FragmentManagerImpl.OpGenerator p0, boolean p1) {}
    public boolean executePendingTransactions() { return false; }
    public android.app.Fragment findFragmentById(int p0) { return null; }
    public android.app.Fragment findFragmentByTag(java.lang.String p0) { return null; }
    public android.app.Fragment findFragmentByWho(java.lang.String p0) { return null; }
    public void freeBackStackIndex(int p0) {}
    public android.app.FragmentManager.BackStackEntry getBackStackEntryAt(int p0) { return null; }
    public int getBackStackEntryCount() { return 0; }
    public android.app.Fragment getFragment(android.os.Bundle p0, java.lang.String p1) { return null; }
    public java.util.List<android.app.Fragment> getFragments() { return null; }
    android.view.LayoutInflater.Factory2 getLayoutInflaterFactory() { return null; }
    public android.app.Fragment getPrimaryNavigationFragment() { return null; }
    int getTargetSdk() { return 0; }
    public void hideFragment(android.app.Fragment p0) {}
    public void invalidateOptionsMenu() {}
    public boolean isDestroyed() { return false; }
    boolean isStateAtLeast(int p0) { return false; }
    public boolean isStateSaved() { return false; }
    android.animation.Animator loadAnimator(android.app.Fragment p0, int p1, boolean p2, int p3) { return null; }
    void makeActive(android.app.Fragment p0) {}
    void makeInactive(android.app.Fragment p0) {}
    void moveFragmentToExpectedState(android.app.Fragment p0) {}
    void moveToState(int p0, boolean p1) {}
    void moveToState(android.app.Fragment p0) {}
    void moveToState(android.app.Fragment p0, int p1, int p2, int p3, boolean p4) {}
    public void noteStateNotSaved() {}
    public android.view.View onCreateView(android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3) { return null; }
    public android.view.View onCreateView(java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2) { return null; }
    public void performPendingDeferredStart(android.app.Fragment p0) {}
    public void popBackStack() {}
    public void popBackStack(int p0, int p1) {}
    public void popBackStack(java.lang.String p0, int p1) {}
    public boolean popBackStackImmediate() { return false; }
    public boolean popBackStackImmediate(int p0, int p1) { return false; }
    public boolean popBackStackImmediate(java.lang.String p0, int p1) { return false; }
    boolean popBackStackState(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1, java.lang.String p2, int p3, int p4) { return false; }
    public void putFragment(android.os.Bundle p0, java.lang.String p1, android.app.Fragment p2) {}
    public void registerFragmentLifecycleCallbacks(android.app.FragmentManager.FragmentLifecycleCallbacks p0, boolean p1) {}
    public void removeFragment(android.app.Fragment p0) {}
    public void removeOnBackStackChangedListener(android.app.FragmentManager.OnBackStackChangedListener p0) {}
    void reportBackStackChanged() {}
    void restoreAllState(android.os.Parcelable p0, android.app.FragmentManagerNonConfig p1) {}
    android.app.FragmentManagerNonConfig retainNonConfig() { return null; }
    android.os.Parcelable saveAllState() { return null; }
    android.os.Bundle saveFragmentBasicState(android.app.Fragment p0) { return null; }
    public android.app.Fragment.SavedState saveFragmentInstanceState(android.app.Fragment p0) { return null; }
    void saveFragmentViewState(android.app.Fragment p0) {}
    void saveNonConfig() {}
    public void setBackStackIndex(int p0, android.app.BackStackRecord p1) {}
    public void setPrimaryNavigationFragment(android.app.Fragment p0) {}
    public void showFragment(android.app.Fragment p0) {}
    void startPendingDeferredFragments() {}
    public java.lang.String toString() { return null; }
    public void unregisterFragmentLifecycleCallbacks(android.app.FragmentManager.FragmentLifecycleCallbacks p0) {}

    static class AnimateOnHWLayerIfNeededListener implements android.animation.Animator.AnimatorListener {
        private boolean mShouldRunOnHWLayer;
        private android.view.View mView;
        public AnimateOnHWLayerIfNeededListener(android.view.View p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
    }

    static interface OpGenerator {
        public boolean generateOps(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1);
    }

    private class PopBackStackState implements android.app.FragmentManagerImpl.OpGenerator {
        final int mFlags = 0;
        final int mId = 0;
        final java.lang.String mName = null;
        public PopBackStackState(android.app.FragmentManagerImpl p0, java.lang.String p1, int p2, int p3) {}
        public boolean generateOps(java.util.ArrayList<android.app.BackStackRecord> p0, java.util.ArrayList<java.lang.Boolean> p1) { return false; }
    }

    static class StartEnterTransitionListener implements android.app.Fragment.OnStartEnterTransitionListener {
        private final boolean mIsBack = false;
        private int mNumPostponed;
        private final android.app.BackStackRecord mRecord = null;
        public StartEnterTransitionListener(android.app.BackStackRecord p0, boolean p1) {}
        public void cancelTransaction() {}
        public void completeTransaction() {}
        public boolean isReady() { return false; }
        public void onStartEnterTransition() {}
        public void startListening() {}
    }
}
