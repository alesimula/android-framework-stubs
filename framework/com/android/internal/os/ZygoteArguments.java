package com.android.internal.os;

public class ZygoteArguments {
    boolean mAbiListQuery;
    java.lang.String[] mAllowlistedDataInfoList;
    java.lang.String[] mApiDenylistExemptions;
    java.lang.String mAppDataDir;
    boolean mAppDataIsolationEnabled;
    boolean mBindMountAppDataDirs;
    boolean mBindMountAppStorageDirs;
    boolean mBindMountSyspropOverrides;
    boolean mBootCompleted;
    private boolean mCapabilitiesSpecified;
    long[] mDisabledCompatChanges;
    long mEffectiveCapabilities;
    long[] mEnabledCompatChanges;
    int mGid;
    boolean mGidSpecified;
    int[] mGids;
    int mHiddenApiAccessLogSampleRate;
    int mHiddenApiAccessStatslogSampleRate;
    java.lang.String mInstructionSet;
    java.lang.String mInvokeWith;
    boolean mIsTopApp;
    int mMountExternal;
    java.lang.String mNiceName;
    java.lang.String mPackageName;
    long mPermittedCapabilities;
    boolean mPidQuery;
    java.lang.String[] mPkgDataInfoList;
    java.lang.String mPreloadApp;
    boolean mPreloadDefault;
    java.lang.String mPreloadPackage;
    java.util.ArrayList<int[]> mRLimits;
    java.lang.String[] mRemainingArgs;
    int mRuntimeFlags;
    java.lang.String mSeInfo;
    private boolean mSeInfoSpecified;
    boolean mStartChildZygote;
    int mTargetSdkVersion;
    private boolean mTargetSdkVersionSpecified;
    int mUid;
    boolean mUidSpecified;
    boolean mUsapPoolEnabled;
    boolean mUsapPoolStatusSpecified;
    private ZygoteArguments(com.android.internal.os.ZygoteCommandBuffer p0, int p1) throws java.lang.IllegalArgumentException, java.io.EOFException {}
    private static java.lang.String[] getAssignmentList(java.lang.String p0) { return null; }
    private static java.lang.String getAssignmentValue(java.lang.String p0) { return null; }
    public static com.android.internal.os.ZygoteArguments getInstance(com.android.internal.os.ZygoteCommandBuffer p0) throws java.lang.IllegalArgumentException, java.io.EOFException { return null; }
    static long[] parseAndMergeCompatChanges(java.lang.String p0, long[] p1) { return null; }
    private void parseArgs(com.android.internal.os.ZygoteCommandBuffer p0, int p1) throws java.lang.IllegalArgumentException, java.io.EOFException {}
}
