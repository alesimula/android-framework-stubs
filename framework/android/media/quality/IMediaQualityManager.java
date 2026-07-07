package android.media.quality;

public interface IMediaQualityManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.quality.IMediaQualityManager";
    public void changeStreamStatus(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void createPictureProfile(android.media.quality.PictureProfile p0, int p1) throws android.os.RemoteException;
    public void createSoundProfile(android.media.quality.SoundProfile p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.media.quality.PictureProfile> getAllPictureProfilesForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.media.quality.PictureProfile> getAvailablePictureProfiles(boolean p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.media.quality.SoundProfile> getAvailableSoundProfiles(boolean p0, int p1) throws android.os.RemoteException;
    public android.media.quality.PictureProfile getCurrentPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.media.quality.PictureProfileHandle getCurrentPictureProfileHandleForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.media.quality.PictureProfile getDefaultPictureProfile() throws android.os.RemoteException;
    public long getDefaultPictureProfileHandleValue(int p0) throws android.os.RemoteException;
    public android.media.quality.SoundProfile getDefaultSoundProfile() throws android.os.RemoteException;
    public android.media.quality.DolbyAudioProcessingCapabilities getDolbyAudioProcessingCapabilities(int p0) throws android.os.RemoteException;
    public android.media.quality.DolbyAudioProcessingSettings getDolbyAudioProcessingSettings(int p0) throws android.os.RemoteException;
    public android.media.quality.DtsVirtualXCapabilities getDtsVirtualXCapabilities(int p0) throws android.os.RemoteException;
    public android.media.quality.DtsVirtualXSettings getDtsVirtualXSettings(int p0) throws android.os.RemoteException;
    public android.media.quality.EqualizerCapabilities getEqualizerCapabilities(int p0) throws android.os.RemoteException;
    public android.media.quality.EqualizerSettings getEqualizerSettings(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.quality.ParameterCapability> getParameterCapabilities(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException;
    public android.media.quality.PictureProfile getPictureProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPictureProfileAllowList(int p0) throws android.os.RemoteException;
    public long getPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.media.quality.PictureProfileHandle> getPictureProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public long getPictureProfileHandleValue(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.media.quality.PictureProfileHandle> getPictureProfileHandles(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPictureProfilePackageNames(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.quality.PictureProfile> getPictureProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public android.media.quality.SoundProfile getSoundProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getSoundProfileAllowList(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.quality.SoundProfileHandle> getSoundProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.media.quality.SoundProfileHandle> getSoundProfileHandles(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getSoundProfilePackageNames(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.quality.SoundProfile> getSoundProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean isAmbientBacklightEnabled(int p0) throws android.os.RemoteException;
    public boolean isAutoPictureQualityEnabled(int p0) throws android.os.RemoteException;
    public boolean isAutoSoundQualityEnabled(int p0) throws android.os.RemoteException;
    public boolean isPanelMuted(int p0) throws android.os.RemoteException;
    public boolean isSuperResolutionEnabled(int p0) throws android.os.RemoteException;
    public boolean isSupported(int p0) throws android.os.RemoteException;
    public void notifyPictureProfileHandleSelection(long p0, int p1) throws android.os.RemoteException;
    public void registerActiveProcessingPictureListener(android.media.quality.IActiveProcessingPictureListener p0) throws android.os.RemoteException;
    public void registerAmbientBacklightCallback(android.media.quality.IAmbientBacklightCallback p0) throws android.os.RemoteException;
    public void registerPictureProfileCallback(android.media.quality.IPictureProfileCallback p0) throws android.os.RemoteException;
    public void registerSoundProfileCallback(android.media.quality.ISoundProfileCallback p0) throws android.os.RemoteException;
    public void removePictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void removeSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setAmbientBacklightEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public void setAmbientBacklightSettings(android.media.quality.AmbientBacklightSettings p0, int p1) throws android.os.RemoteException;
    public void setAutoPictureQualityEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public void setAutoSoundQualityEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public void setColorMuteEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public boolean setDefaultPictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setDefaultSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setDolbyAudioProcessingSettings(android.media.quality.DolbyAudioProcessingSettings p0, int p1) throws android.os.RemoteException;
    public void setDtsVirtualXSettings(android.media.quality.DtsVirtualXSettings p0, int p1) throws android.os.RemoteException;
    public void setEqualizerSettings(android.media.quality.EqualizerSettings p0, int p1) throws android.os.RemoteException;
    public void setMutedColor(int p0, int p1) throws android.os.RemoteException;
    public boolean setPanelMute(boolean p0, int p1) throws android.os.RemoteException;
    public void setPictureProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException;
    public void setSoundProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException;
    public void setSuperResolutionEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public void updatePictureProfile(java.lang.String p0, android.media.quality.PictureProfile p1, int p2) throws android.os.RemoteException;
    public void updatePictureProfileVariant(java.lang.String p0, java.lang.String p1, android.os.PersistableBundle p2, int p3) throws android.os.RemoteException;
    public void updateSoundProfile(java.lang.String p0, android.media.quality.SoundProfile p1, int p2) throws android.os.RemoteException;
    public boolean usesDisplayTechnology(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.quality.IMediaQualityManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void changeStreamStatus(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void createPictureProfile(android.media.quality.PictureProfile p0, int p1) throws android.os.RemoteException {}
        public void createSoundProfile(android.media.quality.SoundProfile p0, int p1) throws android.os.RemoteException {}
        public java.util.List<android.media.quality.PictureProfile> getAllPictureProfilesForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.PictureProfile> getAvailablePictureProfiles(boolean p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.SoundProfile> getAvailableSoundProfiles(boolean p0, int p1) throws android.os.RemoteException { return null; }
        public android.media.quality.PictureProfile getCurrentPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.media.quality.PictureProfileHandle getCurrentPictureProfileHandleForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.media.quality.PictureProfile getDefaultPictureProfile() throws android.os.RemoteException { return null; }
        public long getDefaultPictureProfileHandleValue(int p0) throws android.os.RemoteException { return 0L; }
        public android.media.quality.SoundProfile getDefaultSoundProfile() throws android.os.RemoteException { return null; }
        public android.media.quality.DolbyAudioProcessingCapabilities getDolbyAudioProcessingCapabilities(int p0) throws android.os.RemoteException { return null; }
        public android.media.quality.DolbyAudioProcessingSettings getDolbyAudioProcessingSettings(int p0) throws android.os.RemoteException { return null; }
        public android.media.quality.DtsVirtualXCapabilities getDtsVirtualXCapabilities(int p0) throws android.os.RemoteException { return null; }
        public android.media.quality.DtsVirtualXSettings getDtsVirtualXSettings(int p0) throws android.os.RemoteException { return null; }
        public android.media.quality.EqualizerCapabilities getEqualizerCapabilities(int p0) throws android.os.RemoteException { return null; }
        public android.media.quality.EqualizerSettings getEqualizerSettings(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.ParameterCapability> getParameterCapabilities(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException { return null; }
        public android.media.quality.PictureProfile getPictureProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPictureProfileAllowList(int p0) throws android.os.RemoteException { return null; }
        public long getPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
        public java.util.List<android.media.quality.PictureProfileHandle> getPictureProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
        public long getPictureProfileHandleValue(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
        public java.util.List<android.media.quality.PictureProfileHandle> getPictureProfileHandles(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPictureProfilePackageNames(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.PictureProfile> getPictureProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
        public android.media.quality.SoundProfile getSoundProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getSoundProfileAllowList(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.SoundProfileHandle> getSoundProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.SoundProfileHandle> getSoundProfileHandles(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getSoundProfilePackageNames(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.SoundProfile> getSoundProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
        public boolean isAmbientBacklightEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isAutoPictureQualityEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isAutoSoundQualityEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isPanelMuted(int p0) throws android.os.RemoteException { return false; }
        public boolean isSuperResolutionEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isSupported(int p0) throws android.os.RemoteException { return false; }
        public void notifyPictureProfileHandleSelection(long p0, int p1) throws android.os.RemoteException {}
        public void registerActiveProcessingPictureListener(android.media.quality.IActiveProcessingPictureListener p0) throws android.os.RemoteException {}
        public void registerAmbientBacklightCallback(android.media.quality.IAmbientBacklightCallback p0) throws android.os.RemoteException {}
        public void registerPictureProfileCallback(android.media.quality.IPictureProfileCallback p0) throws android.os.RemoteException {}
        public void registerSoundProfileCallback(android.media.quality.ISoundProfileCallback p0) throws android.os.RemoteException {}
        public void removePictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void removeSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setAmbientBacklightEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public void setAmbientBacklightSettings(android.media.quality.AmbientBacklightSettings p0, int p1) throws android.os.RemoteException {}
        public void setAutoPictureQualityEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public void setAutoSoundQualityEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public void setColorMuteEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean setDefaultPictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setDefaultSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setDolbyAudioProcessingSettings(android.media.quality.DolbyAudioProcessingSettings p0, int p1) throws android.os.RemoteException {}
        public void setDtsVirtualXSettings(android.media.quality.DtsVirtualXSettings p0, int p1) throws android.os.RemoteException {}
        public void setEqualizerSettings(android.media.quality.EqualizerSettings p0, int p1) throws android.os.RemoteException {}
        public void setMutedColor(int p0, int p1) throws android.os.RemoteException {}
        public boolean setPanelMute(boolean p0, int p1) throws android.os.RemoteException { return false; }
        public void setPictureProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
        public void setSoundProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
        public void setSuperResolutionEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public void updatePictureProfile(java.lang.String p0, android.media.quality.PictureProfile p1, int p2) throws android.os.RemoteException {}
        public void updatePictureProfileVariant(java.lang.String p0, java.lang.String p1, android.os.PersistableBundle p2, int p3) throws android.os.RemoteException {}
        public void updateSoundProfile(java.lang.String p0, android.media.quality.SoundProfile p1, int p2) throws android.os.RemoteException {}
        public boolean usesDisplayTechnology(int p0, int p1) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.quality.IMediaQualityManager {
        static final int TRANSACTION_changeStreamStatus = 18;
        static final int TRANSACTION_createPictureProfile = 1;
        static final int TRANSACTION_createSoundProfile = 26;
        static final int TRANSACTION_getAllPictureProfilesForTvInput = 25;
        static final int TRANSACTION_getAvailablePictureProfiles = 12;
        static final int TRANSACTION_getAvailableSoundProfiles = 32;
        static final int TRANSACTION_getCurrentPictureProfileForTvInput = 24;
        static final int TRANSACTION_getCurrentPictureProfileHandleForTvInput = 23;
        static final int TRANSACTION_getDefaultPictureProfile = 5;
        static final int TRANSACTION_getDefaultPictureProfileHandleValue = 20;
        static final int TRANSACTION_getDefaultSoundProfile = 6;
        static final int TRANSACTION_getDolbyAudioProcessingCapabilities = 57;
        static final int TRANSACTION_getDolbyAudioProcessingSettings = 58;
        static final int TRANSACTION_getDtsVirtualXCapabilities = 62;
        static final int TRANSACTION_getDtsVirtualXSettings = 63;
        static final int TRANSACTION_getEqualizerCapabilities = 54;
        static final int TRANSACTION_getEqualizerSettings = 55;
        static final int TRANSACTION_getParameterCapabilities = 42;
        static final int TRANSACTION_getPictureProfile = 10;
        static final int TRANSACTION_getPictureProfileAllowList = 14;
        static final int TRANSACTION_getPictureProfileForTvInput = 22;
        static final int TRANSACTION_getPictureProfileHandle = 16;
        static final int TRANSACTION_getPictureProfileHandleValue = 19;
        static final int TRANSACTION_getPictureProfileHandles = 17;
        static final int TRANSACTION_getPictureProfilePackageNames = 13;
        static final int TRANSACTION_getPictureProfilesByPackage = 11;
        static final int TRANSACTION_getSoundProfile = 30;
        static final int TRANSACTION_getSoundProfileAllowList = 34;
        static final int TRANSACTION_getSoundProfileHandle = 36;
        static final int TRANSACTION_getSoundProfileHandles = 37;
        static final int TRANSACTION_getSoundProfilePackageNames = 33;
        static final int TRANSACTION_getSoundProfilesByPackage = 31;
        static final int TRANSACTION_isAmbientBacklightEnabled = 53;
        static final int TRANSACTION_isAutoPictureQualityEnabled = 45;
        static final int TRANSACTION_isAutoSoundQualityEnabled = 49;
        static final int TRANSACTION_isPanelMuted = 61;
        static final int TRANSACTION_isSuperResolutionEnabled = 47;
        static final int TRANSACTION_isSupported = 43;
        static final int TRANSACTION_notifyPictureProfileHandleSelection = 21;
        static final int TRANSACTION_registerActiveProcessingPictureListener = 41;
        static final int TRANSACTION_registerAmbientBacklightCallback = 40;
        static final int TRANSACTION_registerPictureProfileCallback = 38;
        static final int TRANSACTION_registerSoundProfileCallback = 39;
        static final int TRANSACTION_removePictureProfile = 4;
        static final int TRANSACTION_removeSoundProfile = 28;
        static final int TRANSACTION_setAmbientBacklightEnabled = 52;
        static final int TRANSACTION_setAmbientBacklightSettings = 51;
        static final int TRANSACTION_setAutoPictureQualityEnabled = 44;
        static final int TRANSACTION_setAutoSoundQualityEnabled = 48;
        static final int TRANSACTION_setColorMuteEnabled = 9;
        static final int TRANSACTION_setDefaultPictureProfile = 7;
        static final int TRANSACTION_setDefaultSoundProfile = 29;
        static final int TRANSACTION_setDolbyAudioProcessingSettings = 59;
        static final int TRANSACTION_setDtsVirtualXSettings = 64;
        static final int TRANSACTION_setEqualizerSettings = 56;
        static final int TRANSACTION_setMutedColor = 8;
        static final int TRANSACTION_setPanelMute = 60;
        static final int TRANSACTION_setPictureProfileAllowList = 15;
        static final int TRANSACTION_setSoundProfileAllowList = 35;
        static final int TRANSACTION_setSuperResolutionEnabled = 46;
        static final int TRANSACTION_updatePictureProfile = 2;
        static final int TRANSACTION_updatePictureProfileVariant = 3;
        static final int TRANSACTION_updateSoundProfile = 27;
        static final int TRANSACTION_usesDisplayTechnology = 50;
        public Stub() { super(); }
        public static android.media.quality.IMediaQualityManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.quality.IMediaQualityManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void changeStreamStatus(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void createPictureProfile(android.media.quality.PictureProfile p0, int p1) throws android.os.RemoteException {}
            public void createSoundProfile(android.media.quality.SoundProfile p0, int p1) throws android.os.RemoteException {}
            public java.util.List<android.media.quality.PictureProfile> getAllPictureProfilesForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.quality.PictureProfile> getAvailablePictureProfiles(boolean p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.quality.SoundProfile> getAvailableSoundProfiles(boolean p0, int p1) throws android.os.RemoteException { return null; }
            public android.media.quality.PictureProfile getCurrentPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.media.quality.PictureProfileHandle getCurrentPictureProfileHandleForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.media.quality.PictureProfile getDefaultPictureProfile() throws android.os.RemoteException { return null; }
            public long getDefaultPictureProfileHandleValue(int p0) throws android.os.RemoteException { return 0L; }
            public android.media.quality.SoundProfile getDefaultSoundProfile() throws android.os.RemoteException { return null; }
            public android.media.quality.DolbyAudioProcessingCapabilities getDolbyAudioProcessingCapabilities(int p0) throws android.os.RemoteException { return null; }
            public android.media.quality.DolbyAudioProcessingSettings getDolbyAudioProcessingSettings(int p0) throws android.os.RemoteException { return null; }
            public android.media.quality.DtsVirtualXCapabilities getDtsVirtualXCapabilities(int p0) throws android.os.RemoteException { return null; }
            public android.media.quality.DtsVirtualXSettings getDtsVirtualXSettings(int p0) throws android.os.RemoteException { return null; }
            public android.media.quality.EqualizerCapabilities getEqualizerCapabilities(int p0) throws android.os.RemoteException { return null; }
            public android.media.quality.EqualizerSettings getEqualizerSettings(int p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.media.quality.ParameterCapability> getParameterCapabilities(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException { return null; }
            public android.media.quality.PictureProfile getPictureProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPictureProfileAllowList(int p0) throws android.os.RemoteException { return null; }
            public long getPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
            public java.util.List<android.media.quality.PictureProfileHandle> getPictureProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
            public long getPictureProfileHandleValue(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
            public java.util.List<android.media.quality.PictureProfileHandle> getPictureProfileHandles(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPictureProfilePackageNames(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.quality.PictureProfile> getPictureProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
            public android.media.quality.SoundProfile getSoundProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getSoundProfileAllowList(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.quality.SoundProfileHandle> getSoundProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.quality.SoundProfileHandle> getSoundProfileHandles(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getSoundProfilePackageNames(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.quality.SoundProfile> getSoundProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
            public boolean isAmbientBacklightEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isAutoPictureQualityEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isAutoSoundQualityEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isPanelMuted(int p0) throws android.os.RemoteException { return false; }
            public boolean isSuperResolutionEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isSupported(int p0) throws android.os.RemoteException { return false; }
            public void notifyPictureProfileHandleSelection(long p0, int p1) throws android.os.RemoteException {}
            public void registerActiveProcessingPictureListener(android.media.quality.IActiveProcessingPictureListener p0) throws android.os.RemoteException {}
            public void registerAmbientBacklightCallback(android.media.quality.IAmbientBacklightCallback p0) throws android.os.RemoteException {}
            public void registerPictureProfileCallback(android.media.quality.IPictureProfileCallback p0) throws android.os.RemoteException {}
            public void registerSoundProfileCallback(android.media.quality.ISoundProfileCallback p0) throws android.os.RemoteException {}
            public void removePictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void removeSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setAmbientBacklightEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public void setAmbientBacklightSettings(android.media.quality.AmbientBacklightSettings p0, int p1) throws android.os.RemoteException {}
            public void setAutoPictureQualityEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public void setAutoSoundQualityEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public void setColorMuteEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean setDefaultPictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setDefaultSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setDolbyAudioProcessingSettings(android.media.quality.DolbyAudioProcessingSettings p0, int p1) throws android.os.RemoteException {}
            public void setDtsVirtualXSettings(android.media.quality.DtsVirtualXSettings p0, int p1) throws android.os.RemoteException {}
            public void setEqualizerSettings(android.media.quality.EqualizerSettings p0, int p1) throws android.os.RemoteException {}
            public void setMutedColor(int p0, int p1) throws android.os.RemoteException {}
            public boolean setPanelMute(boolean p0, int p1) throws android.os.RemoteException { return false; }
            public void setPictureProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
            public void setSoundProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
            public void setSuperResolutionEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public void updatePictureProfile(java.lang.String p0, android.media.quality.PictureProfile p1, int p2) throws android.os.RemoteException {}
            public void updatePictureProfileVariant(java.lang.String p0, java.lang.String p1, android.os.PersistableBundle p2, int p3) throws android.os.RemoteException {}
            public void updateSoundProfile(java.lang.String p0, android.media.quality.SoundProfile p1, int p2) throws android.os.RemoteException {}
            public boolean usesDisplayTechnology(int p0, int p1) throws android.os.RemoteException { return false; }
        }
    }
}
