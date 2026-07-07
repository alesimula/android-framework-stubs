package android.hardware.radio;

@android.annotation.SystemApi
public class RadioManager {
    public static final int BAND_AM = 0;
    public static final int BAND_AM_HD = 3;
    public static final int BAND_FM = 1;
    public static final int BAND_FM_HD = 2;
    public static final int BAND_INVALID = -1;
    public static final int CLASS_AM_FM = 0;
    public static final int CLASS_DT = 2;
    public static final int CLASS_SAT = 1;
    public static final int CONFIG_DAB_DAB_LINKING = 6;
    public static final int CONFIG_DAB_DAB_SOFT_LINKING = 8;
    public static final int CONFIG_DAB_FM_LINKING = 7;
    public static final int CONFIG_DAB_FM_SOFT_LINKING = 9;
    @java.lang.Deprecated
    public static final int CONFIG_FORCE_ANALOG = 2;
    public static final int CONFIG_FORCE_ANALOG_AM = 11;
    public static final int CONFIG_FORCE_ANALOG_FM = 10;
    public static final int CONFIG_FORCE_DIGITAL = 3;
    public static final int CONFIG_FORCE_MONO = 1;
    public static final int CONFIG_RDS_AF = 4;
    public static final int CONFIG_RDS_REG = 5;
    public static final int REGION_ITU_1 = 0;
    public static final int REGION_ITU_2 = 1;
    public static final int REGION_JAPAN = 3;
    public static final int REGION_KOREA = 4;
    public static final int REGION_OIRT = 2;
    public static final int STATUS_BAD_VALUE = -22;
    public static final int STATUS_DEAD_OBJECT = -32;
    public static final int STATUS_ERROR = -2147483648;
    public static final int STATUS_INVALID_OPERATION = -38;
    public static final int STATUS_NO_INIT = -19;
    public static final int STATUS_OK = 0;
    public static final int STATUS_PERMISSION_DENIED = -1;
    public static final int STATUS_TIMED_OUT = -110;
    private static final java.lang.String TAG = "BroadcastRadio.manager";
    private final java.util.Map<android.hardware.radio.Announcement.OnListUpdatedListener, android.hardware.radio.ICloseHandle> mAnnouncementListeners = null;
    private final android.content.Context mContext = null;
    private final android.hardware.radio.IRadioService mService = null;
    public RadioManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public RadioManager(android.content.Context p0, android.hardware.radio.IRadioService p1) {}
    private native int nativeListModules(java.util.List<android.hardware.radio.RadioManager.ModuleProperties> p0);
    public void addAnnouncementListener(java.util.Set<java.lang.Integer> p0, android.hardware.radio.Announcement.OnListUpdatedListener p1) {}
    public void addAnnouncementListener(java.util.concurrent.Executor p0, java.util.Set<java.lang.Integer> p1, android.hardware.radio.Announcement.OnListUpdatedListener p2) {}
    public int listModules(java.util.List<android.hardware.radio.RadioManager.ModuleProperties> p0) { return 0; }
    public android.hardware.radio.RadioTuner openTuner(int p0, android.hardware.radio.RadioManager.BandConfig p1, boolean p2, android.hardware.radio.RadioTuner.Callback p3, android.os.Handler p4) { return null; }
    public void removeAnnouncementListener(android.hardware.radio.Announcement.OnListUpdatedListener p0) {}

    public static class AmBandConfig extends android.hardware.radio.RadioManager.BandConfig {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.AmBandConfig> CREATOR = null;
        private final boolean mStereo = false;
        AmBandConfig(int p0, int p1, int p2, int p3, int p4, boolean p5) { super((android.hardware.radio.RadioManager.BandDescriptor)null); }
        public AmBandConfig(android.hardware.radio.RadioManager.AmBandDescriptor p0) { super((android.hardware.radio.RadioManager.BandDescriptor)null); }
        private AmBandConfig(android.os.Parcel p0) { super((android.hardware.radio.RadioManager.BandDescriptor)null); }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public boolean getStereo() { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static class Builder {
            private final android.hardware.radio.RadioManager.BandDescriptor mDescriptor = null;
            private boolean mStereo;
            public Builder(android.hardware.radio.RadioManager.AmBandConfig p0) {}
            public Builder(android.hardware.radio.RadioManager.AmBandDescriptor p0) {}
            public android.hardware.radio.RadioManager.AmBandConfig build() { return null; }
            public android.hardware.radio.RadioManager.AmBandConfig.Builder setStereo(boolean p0) { return null; }
        }
    }

    public static class AmBandDescriptor extends android.hardware.radio.RadioManager.BandDescriptor {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.AmBandDescriptor> CREATOR = null;
        private final boolean mStereo = false;
        public AmBandDescriptor(int p0, int p1, int p2, int p3, int p4, boolean p5) { super(0, 0, 0, 0, 0); }
        private AmBandDescriptor(android.os.Parcel p0) { super(0, 0, 0, 0, 0); }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public boolean isStereoSupported() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Band {
    }

    public static class BandConfig implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.BandConfig> CREATOR = null;
        final android.hardware.radio.RadioManager.BandDescriptor mDescriptor = null;
        BandConfig(int p0, int p1, int p2, int p3, int p4) {}
        BandConfig(android.hardware.radio.RadioManager.BandDescriptor p0) {}
        private BandConfig(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        android.hardware.radio.RadioManager.BandDescriptor getDescriptor() { return null; }
        public int getLowerLimit() { return 0; }
        public int getRegion() { return 0; }
        public int getSpacing() { return 0; }
        public int getType() { return 0; }
        public int getUpperLimit() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class BandDescriptor implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.BandDescriptor> CREATOR = null;
        private final int mLowerLimit = 0;
        private final int mRegion = 0;
        private final int mSpacing = 0;
        private final int mType = 0;
        private final int mUpperLimit = 0;
        BandDescriptor(int p0, int p1, int p2, int p3, int p4) {}
        private BandDescriptor(android.os.Parcel p0) {}
        private static int lookupTypeFromParcel(android.os.Parcel p0) { return 0; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getLowerLimit() { return 0; }
        public int getRegion() { return 0; }
        public int getSpacing() { return 0; }
        public int getType() { return 0; }
        public int getUpperLimit() { return 0; }
        public int hashCode() { return 0; }
        public boolean isAmBand() { return false; }
        public boolean isFmBand() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConfigFlag {
    }

    public static class FmBandConfig extends android.hardware.radio.RadioManager.BandConfig {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.FmBandConfig> CREATOR = null;
        private final boolean mAf = false;
        private final boolean mEa = false;
        private final boolean mRds = false;
        private final boolean mStereo = false;
        private final boolean mTa = false;
        FmBandConfig(int p0, int p1, int p2, int p3, int p4, boolean p5, boolean p6, boolean p7, boolean p8, boolean p9) { super((android.hardware.radio.RadioManager.BandDescriptor)null); }
        public FmBandConfig(android.hardware.radio.RadioManager.FmBandDescriptor p0) { super((android.hardware.radio.RadioManager.BandDescriptor)null); }
        private FmBandConfig(android.os.Parcel p0) { super((android.hardware.radio.RadioManager.BandDescriptor)null); }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public boolean getAf() { return false; }
        public boolean getEa() { return false; }
        public boolean getRds() { return false; }
        public boolean getStereo() { return false; }
        public boolean getTa() { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static class Builder {
            private boolean mAf;
            private final android.hardware.radio.RadioManager.BandDescriptor mDescriptor = null;
            private boolean mEa;
            private boolean mRds;
            private boolean mStereo;
            private boolean mTa;
            public Builder(android.hardware.radio.RadioManager.FmBandConfig p0) {}
            public Builder(android.hardware.radio.RadioManager.FmBandDescriptor p0) {}
            public android.hardware.radio.RadioManager.FmBandConfig build() { return null; }
            public android.hardware.radio.RadioManager.FmBandConfig.Builder setAf(boolean p0) { return null; }
            public android.hardware.radio.RadioManager.FmBandConfig.Builder setEa(boolean p0) { return null; }
            public android.hardware.radio.RadioManager.FmBandConfig.Builder setRds(boolean p0) { return null; }
            public android.hardware.radio.RadioManager.FmBandConfig.Builder setStereo(boolean p0) { return null; }
            public android.hardware.radio.RadioManager.FmBandConfig.Builder setTa(boolean p0) { return null; }
        }
    }

    public static class FmBandDescriptor extends android.hardware.radio.RadioManager.BandDescriptor {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.FmBandDescriptor> CREATOR = null;
        private final boolean mAf = false;
        private final boolean mEa = false;
        private final boolean mRds = false;
        private final boolean mStereo = false;
        private final boolean mTa = false;
        public FmBandDescriptor(int p0, int p1, int p2, int p3, int p4, boolean p5, boolean p6, boolean p7, boolean p8, boolean p9) { super(0, 0, 0, 0, 0); }
        private FmBandDescriptor(android.os.Parcel p0) { super(0, 0, 0, 0, 0); }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public boolean isAfSupported() { return false; }
        public boolean isEaSupported() { return false; }
        public boolean isRdsSupported() { return false; }
        public boolean isStereoSupported() { return false; }
        public boolean isTaSupported() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class ModuleProperties implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.ModuleProperties> CREATOR = null;
        private final android.hardware.radio.RadioManager.BandDescriptor[] mBands = null;
        private final int mClassId = 0;
        private final java.util.Map<java.lang.String, java.lang.Integer> mDabFrequencyTable = null;
        private final int mId = 0;
        private final java.lang.String mImplementor = null;
        private final boolean mIsBgScanSupported = false;
        private final boolean mIsCaptureSupported = false;
        private final boolean mIsInitializationRequired = false;
        private final int mNumAudioSources = 0;
        private final int mNumTuners = 0;
        private final java.lang.String mProduct = null;
        private final java.lang.String mSerial = null;
        private final java.lang.String mServiceName = null;
        private final java.util.Set<java.lang.Integer> mSupportedIdentifierTypes = null;
        private final java.util.Set<java.lang.Integer> mSupportedProgramTypes = null;
        private final java.util.Map<java.lang.String, java.lang.String> mVendorInfo = null;
        private final java.lang.String mVersion = null;
        public ModuleProperties(int p0, java.lang.String p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, int p7, int p8, boolean p9, boolean p10, android.hardware.radio.RadioManager.BandDescriptor[] p11, boolean p12, int[] p13, int[] p14, java.util.Map<java.lang.String, java.lang.Integer> p15, java.util.Map<java.lang.String, java.lang.String> p16) {}
        private ModuleProperties(android.os.Parcel p0) {}
        private static java.util.Set<java.lang.Integer> arrayToSet(int[] p0) { return null; }
        private static int[] setToArray(java.util.Set<java.lang.Integer> p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.hardware.radio.RadioManager.BandDescriptor[] getBands() { return null; }
        public int getClassId() { return 0; }
        public java.util.Map<java.lang.String, java.lang.Integer> getDabFrequencyTable() { return null; }
        public int getId() { return 0; }
        public java.lang.String getImplementor() { return null; }
        public int getNumAudioSources() { return 0; }
        public int getNumTuners() { return 0; }
        public java.lang.String getProduct() { return null; }
        public java.lang.String getSerial() { return null; }
        public java.lang.String getServiceName() { return null; }
        public java.util.Map<java.lang.String, java.lang.String> getVendorInfo() { return null; }
        public java.lang.String getVersion() { return null; }
        public int hashCode() { return 0; }
        public boolean isBackgroundScanningSupported() { return false; }
        public boolean isCaptureSupported() { return false; }
        public boolean isInitializationRequired() { return false; }
        public boolean isProgramIdentifierSupported(int p0) { return false; }
        public boolean isProgramTypeSupported(int p0) { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class ProgramInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.ProgramInfo> CREATOR = null;
        private static final int FLAG_HD_AUDIO_ACQUIRED = 256;
        private static final int FLAG_HD_SIS_ACQUIRED = 128;
        private static final int FLAG_LIVE = 1;
        private static final int FLAG_MUTED = 2;
        private static final int FLAG_SIGNAL_ACQUIRED = 64;
        private static final int FLAG_STEREO = 32;
        private static final int FLAG_TRAFFIC_ANNOUNCEMENT = 8;
        private static final int FLAG_TRAFFIC_PROGRAM = 4;
        private static final int FLAG_TUNED = 16;
        private final android.hardware.radio.RadioAlert mAlert = null;
        private final int mInfoFlags = 0;
        private final android.hardware.radio.ProgramSelector.Identifier mLogicallyTunedTo = null;
        private final android.hardware.radio.RadioMetadata mMetadata = null;
        private final android.hardware.radio.ProgramSelector.Identifier mPhysicallyTunedTo = null;
        private final java.util.Collection<android.hardware.radio.ProgramSelector.Identifier> mRelatedContent = null;
        private final android.hardware.radio.ProgramSelector mSelector = null;
        private final int mSignalQuality = 0;
        private final java.util.Map<java.lang.String, java.lang.String> mVendorInfo = null;
        public ProgramInfo(android.hardware.radio.ProgramSelector p0, android.hardware.radio.ProgramSelector.Identifier p1, android.hardware.radio.ProgramSelector.Identifier p2, java.util.Collection<android.hardware.radio.ProgramSelector.Identifier> p3, int p4, int p5, android.hardware.radio.RadioMetadata p6, java.util.Map<java.lang.String, java.lang.String> p7) {}
        public ProgramInfo(android.hardware.radio.ProgramSelector p0, android.hardware.radio.ProgramSelector.Identifier p1, android.hardware.radio.ProgramSelector.Identifier p2, java.util.Collection<android.hardware.radio.ProgramSelector.Identifier> p3, int p4, int p5, android.hardware.radio.RadioMetadata p6, java.util.Map<java.lang.String, java.lang.String> p7, android.hardware.radio.RadioAlert p8) {}
        private ProgramInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.hardware.radio.RadioAlert getAlert() { return null; }
        @java.lang.Deprecated
        public int getChannel() { return 0; }
        public android.hardware.radio.ProgramSelector.Identifier getLogicallyTunedTo() { return null; }
        public android.hardware.radio.RadioMetadata getMetadata() { return null; }
        public android.hardware.radio.ProgramSelector.Identifier getPhysicallyTunedTo() { return null; }
        public java.util.Collection<android.hardware.radio.ProgramSelector.Identifier> getRelatedContent() { return null; }
        public android.hardware.radio.ProgramSelector getSelector() { return null; }
        public int getSignalStrength() { return 0; }
        @java.lang.Deprecated
        public int getSubChannel() { return 0; }
        public java.util.Map<java.lang.String, java.lang.String> getVendorInfo() { return null; }
        public int hashCode() { return 0; }
        @java.lang.Deprecated
        public boolean isDigital() { return false; }
        public boolean isHdAudioAvailable() { return false; }
        public boolean isHdSisAvailable() { return false; }
        public boolean isLive() { return false; }
        public boolean isMuted() { return false; }
        public boolean isSignalAcquired() { return false; }
        public boolean isStereo() { return false; }
        public boolean isTrafficAnnouncementActive() { return false; }
        public boolean isTrafficProgram() { return false; }
        public boolean isTuned() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RadioStatusType {
    }
}
