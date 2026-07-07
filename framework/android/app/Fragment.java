package android.app;

@java.lang.Deprecated
public class Fragment implements android.content.ComponentCallbacks2, android.view.View.OnCreateContextMenuListener {
    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int INVALID_STATE = -1;
    static final int RESUMED = 5;
    static final int STARTED = 4;
    static final int STOPPED = 3;
    private static final android.transition.Transition USE_DEFAULT_TRANSITION = null;
    private static final android.util.ArrayMap<java.lang.String, java.lang.Class<?>> sClassMap = null;
    boolean mAdded;
    android.app.Fragment.AnimationInfo mAnimationInfo;
    android.os.Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    boolean mCheckedForLoaderManager;
    android.app.FragmentManagerImpl mChildFragmentManager;
    android.app.FragmentManagerNonConfig mChildNonConfig;
    android.view.ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    android.app.FragmentManagerImpl mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    android.app.FragmentHostCallback mHost;
    boolean mInLayout;
    int mIndex;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    android.view.LayoutInflater mLayoutInflater;
    android.app.LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mMenuVisible;
    android.app.Fragment mParentFragment;
    boolean mPerformedCreateView;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetaining;
    android.os.Bundle mSavedFragmentState;
    android.util.SparseArray<android.os.Parcelable> mSavedViewState;
    int mState;
    java.lang.String mTag;
    android.app.Fragment mTarget;
    int mTargetIndex;
    int mTargetRequestCode;
    boolean mUserVisibleHint;
    android.view.View mView;
    java.lang.String mWho;
    public Fragment() {}
    private void callStartTransitionListener() {}
    private android.app.Fragment.AnimationInfo ensureAnimationInfo() { return null; }
    public static android.app.Fragment instantiate(android.content.Context p0, java.lang.String p1) { return null; }
    public static android.app.Fragment instantiate(android.content.Context p0, java.lang.String p1, android.os.Bundle p2) { return null; }
    private static android.transition.Transition loadTransition(android.content.Context p0, android.content.res.TypedArray p1, android.transition.Transition p2, android.transition.Transition p3, int p4) { return null; }
    private boolean shouldChangeTransition(android.transition.Transition p0, android.transition.Transition p1) { return false; }
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    public final boolean equals(java.lang.Object p0) { return false; }
    android.app.Fragment findFragmentByWho(java.lang.String p0) { return null; }
    public final android.app.Activity getActivity() { return null; }
    public boolean getAllowEnterTransitionOverlap() { return false; }
    public boolean getAllowReturnTransitionOverlap() { return false; }
    android.animation.Animator getAnimatingAway() { return null; }
    public final android.os.Bundle getArguments() { return null; }
    public final android.app.FragmentManager getChildFragmentManager() { return null; }
    public android.content.Context getContext() { return null; }
    public android.transition.Transition getEnterTransition() { return null; }
    android.app.SharedElementCallback getEnterTransitionCallback() { return null; }
    public android.transition.Transition getExitTransition() { return null; }
    android.app.SharedElementCallback getExitTransitionCallback() { return null; }
    public final android.app.FragmentManager getFragmentManager() { return null; }
    public final java.lang.Object getHost() { return null; }
    public final int getId() { return 0; }
    public final android.view.LayoutInflater getLayoutInflater() { return null; }
    @java.lang.Deprecated
    public android.app.LoaderManager getLoaderManager() { return null; }
    int getNextAnim() { return 0; }
    int getNextTransition() { return 0; }
    int getNextTransitionStyle() { return 0; }
    public final android.app.Fragment getParentFragment() { return null; }
    public android.transition.Transition getReenterTransition() { return null; }
    public final android.content.res.Resources getResources() { return null; }
    public final boolean getRetainInstance() { return false; }
    public android.transition.Transition getReturnTransition() { return null; }
    public android.transition.Transition getSharedElementEnterTransition() { return null; }
    public android.transition.Transition getSharedElementReturnTransition() { return null; }
    int getStateAfterAnimating() { return 0; }
    public final java.lang.String getString(int p0) { return null; }
    public final java.lang.String getString(int p0, java.lang.Object... p1) { return null; }
    public final java.lang.String getTag() { return null; }
    public final android.app.Fragment getTargetFragment() { return null; }
    public final int getTargetRequestCode() { return 0; }
    public final java.lang.CharSequence getText(int p0) { return null; }
    public boolean getUserVisibleHint() { return false; }
    public android.view.View getView() { return null; }
    public final int hashCode() { return 0; }
    void initState() {}
    void instantiateChildFragmentManager() {}
    public final boolean isAdded() { return false; }
    public final boolean isDetached() { return false; }
    public final boolean isHidden() { return false; }
    boolean isHideReplaced() { return false; }
    final boolean isInBackStack() { return false; }
    public final boolean isInLayout() { return false; }
    boolean isPostponed() { return false; }
    public final boolean isRemoving() { return false; }
    public final boolean isResumed() { return false; }
    public final boolean isStateSaved() { return false; }
    public final boolean isVisible() { return false; }
    void noteStateNotSaved() {}
    public void onActivityCreated(android.os.Bundle p0) {}
    public void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    @java.lang.Deprecated
    public void onAttach(android.app.Activity p0) {}
    public void onAttach(android.content.Context p0) {}
    public void onAttachFragment(android.app.Fragment p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public boolean onContextItemSelected(android.view.MenuItem p0) { return false; }
    public void onCreate(android.os.Bundle p0) {}
    public android.animation.Animator onCreateAnimator(int p0, boolean p1, int p2) { return null; }
    public void onCreateContextMenu(android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu.ContextMenuInfo p2) {}
    public void onCreateOptionsMenu(android.view.Menu p0, android.view.MenuInflater p1) {}
    public android.view.View onCreateView(android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2) { return null; }
    public void onDestroy() {}
    public void onDestroyOptionsMenu() {}
    public void onDestroyView() {}
    public void onDetach() {}
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle p0) { return null; }
    public void onHiddenChanged(boolean p0) {}
    @java.lang.Deprecated
    public void onInflate(android.app.Activity p0, android.util.AttributeSet p1, android.os.Bundle p2) {}
    public void onInflate(android.content.Context p0, android.util.AttributeSet p1, android.os.Bundle p2) {}
    @java.lang.Deprecated
    public void onInflate(android.util.AttributeSet p0, android.os.Bundle p1) {}
    public void onLowMemory() {}
    @java.lang.Deprecated
    public void onMultiWindowModeChanged(boolean p0) {}
    public void onMultiWindowModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public boolean onOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public void onOptionsMenuClosed(android.view.Menu p0) {}
    public void onPause() {}
    @java.lang.Deprecated
    public void onPictureInPictureModeChanged(boolean p0) {}
    public void onPictureInPictureModeChanged(boolean p0, android.content.res.Configuration p1) {}
    public void onPrepareOptionsMenu(android.view.Menu p0) {}
    public void onRequestPermissionsResult(int p0, java.lang.String[] p1, int[] p2) {}
    public void onResume() {}
    public void onSaveInstanceState(android.os.Bundle p0) {}
    public void onStart() {}
    public void onStop() {}
    public void onTrimMemory(int p0) {}
    public void onViewCreated(android.view.View p0, android.os.Bundle p1) {}
    public void onViewStateRestored(android.os.Bundle p0) {}
    void performActivityCreated(android.os.Bundle p0) {}
    void performConfigurationChanged(android.content.res.Configuration p0) {}
    boolean performContextItemSelected(android.view.MenuItem p0) { return false; }
    void performCreate(android.os.Bundle p0) {}
    boolean performCreateOptionsMenu(android.view.Menu p0, android.view.MenuInflater p1) { return false; }
    android.view.View performCreateView(android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2) { return null; }
    void performDestroy() {}
    void performDestroyView() {}
    void performDetach() {}
    android.view.LayoutInflater performGetLayoutInflater(android.os.Bundle p0) { return null; }
    void performLowMemory() {}
    @java.lang.Deprecated
    void performMultiWindowModeChanged(boolean p0) {}
    void performMultiWindowModeChanged(boolean p0, android.content.res.Configuration p1) {}
    boolean performOptionsItemSelected(android.view.MenuItem p0) { return false; }
    void performOptionsMenuClosed(android.view.Menu p0) {}
    void performPause() {}
    @java.lang.Deprecated
    void performPictureInPictureModeChanged(boolean p0) {}
    void performPictureInPictureModeChanged(boolean p0, android.content.res.Configuration p1) {}
    boolean performPrepareOptionsMenu(android.view.Menu p0) { return false; }
    void performResume() {}
    void performSaveInstanceState(android.os.Bundle p0) {}
    void performStart() {}
    void performStop() {}
    void performTrimMemory(int p0) {}
    public void postponeEnterTransition() {}
    public void registerForContextMenu(android.view.View p0) {}
    public final void requestPermissions(java.lang.String[] p0, int p1) {}
    void restoreChildFragmentState(android.os.Bundle p0, boolean p1) {}
    final void restoreViewState(android.os.Bundle p0) {}
    public void setAllowEnterTransitionOverlap(boolean p0) {}
    public void setAllowReturnTransitionOverlap(boolean p0) {}
    void setAnimatingAway(android.animation.Animator p0) {}
    public void setArguments(android.os.Bundle p0) {}
    public void setEnterSharedElementCallback(android.app.SharedElementCallback p0) {}
    public void setEnterTransition(android.transition.Transition p0) {}
    public void setExitSharedElementCallback(android.app.SharedElementCallback p0) {}
    public void setExitTransition(android.transition.Transition p0) {}
    public void setHasOptionsMenu(boolean p0) {}
    void setHideReplaced(boolean p0) {}
    final void setIndex(int p0, android.app.Fragment p1) {}
    public void setInitialSavedState(android.app.Fragment.SavedState p0) {}
    public void setMenuVisibility(boolean p0) {}
    void setNextAnim(int p0) {}
    void setNextTransition(int p0, int p1) {}
    void setOnStartEnterTransitionListener(android.app.Fragment.OnStartEnterTransitionListener p0) {}
    public void setReenterTransition(android.transition.Transition p0) {}
    public void setRetainInstance(boolean p0) {}
    public void setReturnTransition(android.transition.Transition p0) {}
    public void setSharedElementEnterTransition(android.transition.Transition p0) {}
    public void setSharedElementReturnTransition(android.transition.Transition p0) {}
    void setStateAfterAnimating(int p0) {}
    public void setTargetFragment(android.app.Fragment p0, int p1) {}
    public void setUserVisibleHint(boolean p0) {}
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0) { return false; }
    public void startActivity(android.content.Intent p0) {}
    public void startActivity(android.content.Intent p0, android.os.Bundle p1) {}
    public void startActivityForResult(android.content.Intent p0, int p1) {}
    public void startActivityForResult(android.content.Intent p0, int p1, android.os.Bundle p2) {}
    public final void startActivityForResultAsUser(android.content.Intent p0, int p1, android.os.Bundle p2, android.os.UserHandle p3) {}
    public void startIntentSenderForResult(android.content.IntentSender p0, int p1, android.content.Intent p2, int p3, int p4, int p5, android.os.Bundle p6) throws android.content.IntentSender.SendIntentException {}
    public void startPostponedEnterTransition() {}
    public java.lang.String toString() { return null; }
    public void unregisterForContextMenu(android.view.View p0) {}

    static class AnimationInfo {
        private java.lang.Boolean mAllowEnterTransitionOverlap;
        private java.lang.Boolean mAllowReturnTransitionOverlap;
        android.animation.Animator mAnimatingAway;
        private android.transition.Transition mEnterTransition;
        android.app.SharedElementCallback mEnterTransitionCallback;
        boolean mEnterTransitionPostponed;
        private android.transition.Transition mExitTransition;
        android.app.SharedElementCallback mExitTransitionCallback;
        boolean mIsHideReplaced;
        int mNextAnim;
        int mNextTransition;
        int mNextTransitionStyle;
        private android.transition.Transition mReenterTransition;
        private android.transition.Transition mReturnTransition;
        private android.transition.Transition mSharedElementEnterTransition;
        private android.transition.Transition mSharedElementReturnTransition;
        android.app.Fragment.OnStartEnterTransitionListener mStartEnterTransitionListener;
        int mStateAfterAnimating;
        AnimationInfo() {}
    }

    @java.lang.Deprecated
    public static class InstantiationException extends android.util.AndroidRuntimeException {
        public InstantiationException(java.lang.String p0, java.lang.Exception p1) { super(); }
    }

    static interface OnStartEnterTransitionListener {
        public void onStartEnterTransition();
        public void startListening();
    }

    @java.lang.Deprecated
    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.ClassLoaderCreator<android.app.Fragment.SavedState> CREATOR = null;
        final android.os.Bundle mState = null;
        SavedState(android.os.Bundle p0) {}
        SavedState(android.os.Parcel p0, java.lang.ClassLoader p1) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
