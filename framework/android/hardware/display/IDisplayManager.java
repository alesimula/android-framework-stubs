package android.hardware.display;

public interface IDisplayManager extends android.os.IInterface {
    public boolean areUserDisabledHdrTypesAllowed() throws android.os.RemoteException;
    public boolean canAccessPrivateDisplays(int p0) throws android.os.RemoteException;
    public void connectWifiDisplay(java.lang.String p0) throws android.os.RemoteException;
    public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.media.projection.IMediaProjection p2, java.lang.String p3) throws android.os.RemoteException;
    public void disableConnectedDisplay(int p0) throws android.os.RemoteException;
    public void disconnectWifiDisplay() throws android.os.RemoteException;
    public void enableConnectedDisplay(int p0) throws android.os.RemoteException;
    public void forgetWifiDisplay(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAmbientBrightnessStats() throws android.os.RemoteException;
    public float getBrightness(int p0) throws android.os.RemoteException;
    public float getBrightnessByUnit(int p0, int p1) throws android.os.RemoteException;
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForDisplay(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getBrightnessEvents(java.lang.String p0) throws android.os.RemoteException;
    public android.hardware.display.BrightnessInfo getBrightnessInfo(int p0) throws android.os.RemoteException;
    public int getConnectionPreference(java.lang.String p0) throws android.os.RemoteException;
    public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() throws android.os.RemoteException;
    public float getDefaultDozeBrightness(int p0) throws android.os.RemoteException;
    public android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport(int p0) throws android.os.RemoteException;
    public int[] getDisplayIds(boolean p0) throws android.os.RemoteException;
    public android.view.DisplayInfo getDisplayInfo(int p0) throws android.os.RemoteException;
    public android.hardware.display.DisplayTopology getDisplayTopology() throws android.os.RemoteException;
    public float[] getDozeBrightnessSensorValueToBrightness(int p0) throws android.os.RemoteException;
    public android.hardware.display.HdrConversionMode getHdrConversionMode() throws android.os.RemoteException;
    public android.hardware.display.HdrConversionMode getHdrConversionModeSetting() throws android.os.RemoteException;
    public float getHighestHdrSdrRatio(int p0) throws android.os.RemoteException;
    public android.hardware.display.Curve getMinimumBrightnessCurve() throws android.os.RemoteException;
    public android.hardware.OverlayProperties getOverlaySupport() throws android.os.RemoteException;
    public int getPreferredWideGamutColorSpaceId() throws android.os.RemoteException;
    public int getRefreshRateSwitchingType() throws android.os.RemoteException;
    public android.graphics.Point getStableDisplaySize() throws android.os.RemoteException;
    public int[] getSupportedHdrOutputTypes() throws android.os.RemoteException;
    public android.view.Display.Mode getSystemPreferredDisplayMode(int p0) throws android.os.RemoteException;
    public int[] getUserDisabledHdrTypes() throws android.os.RemoteException;
    public android.view.Display.Mode getUserPreferredDisplayMode(int p0) throws android.os.RemoteException;
    public int getUserPreferredHdrMode(int p0) throws android.os.RemoteException;
    public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() throws android.os.RemoteException;
    public boolean isMinimalPostProcessingRequested(int p0) throws android.os.RemoteException;
    public boolean isUidPresentOnDisplay(int p0, int p1) throws android.os.RemoteException;
    public void overrideHdrTypes(int p0, int[] p1) throws android.os.RemoteException;
    public void pauseWifiDisplay() throws android.os.RemoteException;
    public void registerCallback(android.hardware.display.IDisplayManagerCallback p0) throws android.os.RemoteException;
    public void registerCallbackWithEventMask(android.hardware.display.IDisplayManagerCallback p0, long p1) throws android.os.RemoteException;
    public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0) throws android.os.RemoteException;
    public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void requestColorMode(int p0, int p1) throws android.os.RemoteException;
    public void requestDisplayModes(android.os.IBinder p0, int p1, int[] p2) throws android.os.RemoteException;
    public boolean requestDisplayPower(int p0, int p1) throws android.os.RemoteException;
    public void resetUserPreferredDisplayMode(int p0) throws android.os.RemoteException;
    public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void resumeWifiDisplay() throws android.os.RemoteException;
    public void setAppRequestEnabledForTesting(boolean p0) throws android.os.RemoteException;
    public void setAreUserDisabledHdrTypesAllowed(boolean p0) throws android.os.RemoteException;
    public void setBrightness(int p0, float p1) throws android.os.RemoteException;
    public void setBrightnessByUnit(int p0, float p1, int p2) throws android.os.RemoteException;
    public void setBrightnessConfigurationForDisplay(android.hardware.display.BrightnessConfiguration p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setConnectionPreference(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setDisplayIdToMirror(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void setDisplayTopology(android.hardware.display.DisplayTopology p0) throws android.os.RemoteException;
    public void setHdrConversionMode(android.hardware.display.HdrConversionMode p0) throws android.os.RemoteException;
    public void setRefreshRateSwitchingType(int p0) throws android.os.RemoteException;
    public void setShouldAlwaysRespectAppRequestedMode(boolean p0) throws android.os.RemoteException;
    public void setTemporaryAutoBrightnessAdjustment(float p0) throws android.os.RemoteException;
    public void setTemporaryBrightness(int p0, float p1) throws android.os.RemoteException;
    public boolean setTemporaryBrightnessMode(int p0, int p1) throws android.os.RemoteException;
    public void setUserDisabledHdrTypes(int[] p0) throws android.os.RemoteException;
    public void setUserPreferredDisplayMode(int p0, android.view.Display.Mode p1, boolean p2) throws android.os.RemoteException;
    public void setUserPreferredHdrMode(int p0, int p1) throws android.os.RemoteException;
    public void setVirtualDisplayRotation(android.hardware.display.IVirtualDisplayCallback p0, int p1) throws android.os.RemoteException;
    public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) throws android.os.RemoteException;
    public boolean shouldAlwaysRespectAppRequestedMode() throws android.os.RemoteException;
    public void startWifiDisplayScan() throws android.os.RemoteException;
    public void stopWifiDisplayScan() throws android.os.RemoteException;

    public static class Default implements android.hardware.display.IDisplayManager {
        public Default() {}
        public boolean areUserDisabledHdrTypesAllowed() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
        public boolean canAccessPrivateDisplays(int p0) throws android.os.RemoteException { return false; }
        public void connectWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
        public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.media.projection.IMediaProjection p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public void disableConnectedDisplay(int p0) throws android.os.RemoteException {}
        public void disconnectWifiDisplay() throws android.os.RemoteException {}
        public void enableConnectedDisplay(int p0) throws android.os.RemoteException {}
        public void forgetWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getAmbientBrightnessStats() throws android.os.RemoteException { return null; }
        public float getBrightness(int p0) throws android.os.RemoteException { return 0.0f; }
        public float getBrightnessByUnit(int p0, int p1) throws android.os.RemoteException { return 0.0f; }
        public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForDisplay(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getBrightnessEvents(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.hardware.display.BrightnessInfo getBrightnessInfo(int p0) throws android.os.RemoteException { return null; }
        public int getConnectionPreference(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() throws android.os.RemoteException { return null; }
        public float getDefaultDozeBrightness(int p0) throws android.os.RemoteException { return 0.0f; }
        public android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport(int p0) throws android.os.RemoteException { return null; }
        public int[] getDisplayIds(boolean p0) throws android.os.RemoteException { return null; }
        public android.view.DisplayInfo getDisplayInfo(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.display.DisplayTopology getDisplayTopology() throws android.os.RemoteException { return null; }
        public float[] getDozeBrightnessSensorValueToBrightness(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.display.HdrConversionMode getHdrConversionMode() throws android.os.RemoteException { return null; }
        public android.hardware.display.HdrConversionMode getHdrConversionModeSetting() throws android.os.RemoteException { return null; }
        public float getHighestHdrSdrRatio(int p0) throws android.os.RemoteException { return 0.0f; }
        public android.hardware.display.Curve getMinimumBrightnessCurve() throws android.os.RemoteException { return null; }
        public android.hardware.OverlayProperties getOverlaySupport() throws android.os.RemoteException { return null; }
        public int getPreferredWideGamutColorSpaceId() throws android.os.RemoteException { return 0; }
        public int getRefreshRateSwitchingType() throws android.os.RemoteException { return 0; }
        public android.graphics.Point getStableDisplaySize() throws android.os.RemoteException { return null; }
        public int[] getSupportedHdrOutputTypes() throws android.os.RemoteException { return null; }
        public android.view.Display.Mode getSystemPreferredDisplayMode(int p0) throws android.os.RemoteException { return null; }
        public int[] getUserDisabledHdrTypes() throws android.os.RemoteException { return null; }
        public android.view.Display.Mode getUserPreferredDisplayMode(int p0) throws android.os.RemoteException { return null; }
        public int getUserPreferredHdrMode(int p0) throws android.os.RemoteException { return 0; }
        public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() throws android.os.RemoteException { return null; }
        public boolean isMinimalPostProcessingRequested(int p0) throws android.os.RemoteException { return false; }
        public boolean isUidPresentOnDisplay(int p0, int p1) throws android.os.RemoteException { return false; }
        public void overrideHdrTypes(int p0, int[] p1) throws android.os.RemoteException {}
        public void pauseWifiDisplay() throws android.os.RemoteException {}
        public void registerCallback(android.hardware.display.IDisplayManagerCallback p0) throws android.os.RemoteException {}
        public void registerCallbackWithEventMask(android.hardware.display.IDisplayManagerCallback p0, long p1) throws android.os.RemoteException {}
        public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0) throws android.os.RemoteException {}
        public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void requestColorMode(int p0, int p1) throws android.os.RemoteException {}
        public void requestDisplayModes(android.os.IBinder p0, int p1, int[] p2) throws android.os.RemoteException {}
        public boolean requestDisplayPower(int p0, int p1) throws android.os.RemoteException { return false; }
        public void resetUserPreferredDisplayMode(int p0) throws android.os.RemoteException {}
        public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void resumeWifiDisplay() throws android.os.RemoteException {}
        public void setAppRequestEnabledForTesting(boolean p0) throws android.os.RemoteException {}
        public void setAreUserDisabledHdrTypesAllowed(boolean p0) throws android.os.RemoteException {}
        public void setBrightness(int p0, float p1) throws android.os.RemoteException {}
        public void setBrightnessByUnit(int p0, float p1, int p2) throws android.os.RemoteException {}
        public void setBrightnessConfigurationForDisplay(android.hardware.display.BrightnessConfiguration p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setConnectionPreference(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setDisplayIdToMirror(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void setDisplayTopology(android.hardware.display.DisplayTopology p0) throws android.os.RemoteException {}
        public void setHdrConversionMode(android.hardware.display.HdrConversionMode p0) throws android.os.RemoteException {}
        public void setRefreshRateSwitchingType(int p0) throws android.os.RemoteException {}
        public void setShouldAlwaysRespectAppRequestedMode(boolean p0) throws android.os.RemoteException {}
        public void setTemporaryAutoBrightnessAdjustment(float p0) throws android.os.RemoteException {}
        public void setTemporaryBrightness(int p0, float p1) throws android.os.RemoteException {}
        public boolean setTemporaryBrightnessMode(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setUserDisabledHdrTypes(int[] p0) throws android.os.RemoteException {}
        public void setUserPreferredDisplayMode(int p0, android.view.Display.Mode p1, boolean p2) throws android.os.RemoteException {}
        public void setUserPreferredHdrMode(int p0, int p1) throws android.os.RemoteException {}
        public void setVirtualDisplayRotation(android.hardware.display.IVirtualDisplayCallback p0, int p1) throws android.os.RemoteException {}
        public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) throws android.os.RemoteException {}
        public boolean shouldAlwaysRespectAppRequestedMode() throws android.os.RemoteException { return false; }
        public void startWifiDisplayScan() throws android.os.RemoteException {}
        public void stopWifiDisplayScan() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.display.IDisplayManager {
        public static final java.lang.String DESCRIPTOR = "android.hardware.display.IDisplayManager";
        static final int TRANSACTION_areUserDisabledHdrTypesAllowed = 18;
        static final int TRANSACTION_canAccessPrivateDisplays = 4;
        static final int TRANSACTION_connectWifiDisplay = 9;
        static final int TRANSACTION_createVirtualDisplay = 22;
        static final int TRANSACTION_disableConnectedDisplay = 62;
        static final int TRANSACTION_disconnectWifiDisplay = 10;
        static final int TRANSACTION_enableConnectedDisplay = 61;
        static final int TRANSACTION_forgetWifiDisplay = 12;
        static final int TRANSACTION_getAmbientBrightnessStats = 29;
        static final int TRANSACTION_getBrightness = 40;
        static final int TRANSACTION_getBrightnessByUnit = 41;
        static final int TRANSACTION_getBrightnessConfigurationForDisplay = 32;
        static final int TRANSACTION_getBrightnessConfigurationForUser = 33;
        static final int TRANSACTION_getBrightnessEvents = 28;
        static final int TRANSACTION_getBrightnessInfo = 44;
        static final int TRANSACTION_getConnectionPreference = 66;
        static final int TRANSACTION_getDefaultBrightnessConfiguration = 34;
        static final int TRANSACTION_getDefaultDozeBrightness = 72;
        static final int TRANSACTION_getDisplayDecorationSupport = 58;
        static final int TRANSACTION_getDisplayIds = 2;
        static final int TRANSACTION_getDisplayInfo = 1;
        static final int TRANSACTION_getDisplayTopology = 73;
        static final int TRANSACTION_getDozeBrightnessSensorValueToBrightness = 71;
        static final int TRANSACTION_getHdrConversionMode = 52;
        static final int TRANSACTION_getHdrConversionModeSetting = 51;
        static final int TRANSACTION_getHighestHdrSdrRatio = 70;
        static final int TRANSACTION_getMinimumBrightnessCurve = 43;
        static final int TRANSACTION_getOverlaySupport = 60;
        static final int TRANSACTION_getPreferredWideGamutColorSpaceId = 45;
        static final int TRANSACTION_getRefreshRateSwitchingType = 57;
        static final int TRANSACTION_getStableDisplaySize = 27;
        static final int TRANSACTION_getSupportedHdrOutputTypes = 53;
        static final int TRANSACTION_getSystemPreferredDisplayMode = 49;
        static final int TRANSACTION_getUserDisabledHdrTypes = 19;
        static final int TRANSACTION_getUserPreferredDisplayMode = 48;
        static final int TRANSACTION_getUserPreferredHdrMode = 68;
        static final int TRANSACTION_getWifiDisplayStatus = 15;
        static final int TRANSACTION_isMinimalPostProcessingRequested = 35;
        static final int TRANSACTION_isUidPresentOnDisplay = 3;
        static final int TRANSACTION_overrideHdrTypes = 20;
        static final int TRANSACTION_pauseWifiDisplay = 13;
        static final int TRANSACTION_registerCallback = 5;
        static final int TRANSACTION_registerCallbackWithEventMask = 6;
        static final int TRANSACTION_releaseVirtualDisplay = 25;
        static final int TRANSACTION_renameWifiDisplay = 11;
        static final int TRANSACTION_requestColorMode = 21;
        static final int TRANSACTION_requestDisplayModes = 69;
        static final int TRANSACTION_requestDisplayPower = 64;
        static final int TRANSACTION_resetUserPreferredDisplayMode = 47;
        static final int TRANSACTION_resizeVirtualDisplay = 23;
        static final int TRANSACTION_resumeWifiDisplay = 14;
        static final int TRANSACTION_setAppRequestEnabledForTesting = 63;
        static final int TRANSACTION_setAreUserDisabledHdrTypesAllowed = 17;
        static final int TRANSACTION_setBrightness = 38;
        static final int TRANSACTION_setBrightnessByUnit = 39;
        static final int TRANSACTION_setBrightnessConfigurationForDisplay = 31;
        static final int TRANSACTION_setBrightnessConfigurationForUser = 30;
        static final int TRANSACTION_setConnectionPreference = 65;
        static final int TRANSACTION_setDisplayIdToMirror = 59;
        static final int TRANSACTION_setDisplayTopology = 74;
        static final int TRANSACTION_setHdrConversionMode = 50;
        static final int TRANSACTION_setRefreshRateSwitchingType = 56;
        static final int TRANSACTION_setShouldAlwaysRespectAppRequestedMode = 54;
        static final int TRANSACTION_setTemporaryAutoBrightnessAdjustment = 42;
        static final int TRANSACTION_setTemporaryBrightness = 36;
        static final int TRANSACTION_setTemporaryBrightnessMode = 37;
        static final int TRANSACTION_setUserDisabledHdrTypes = 16;
        static final int TRANSACTION_setUserPreferredDisplayMode = 46;
        static final int TRANSACTION_setUserPreferredHdrMode = 67;
        static final int TRANSACTION_setVirtualDisplayRotation = 26;
        static final int TRANSACTION_setVirtualDisplaySurface = 24;
        static final int TRANSACTION_shouldAlwaysRespectAppRequestedMode = 55;
        static final int TRANSACTION_startWifiDisplayScan = 7;
        static final int TRANSACTION_stopWifiDisplayScan = 8;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.display.IDisplayManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void connectWifiDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void disableConnectedDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void enableConnectedDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void forgetWifiDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void getAmbientBrightnessStats_enforcePermission() throws java.lang.SecurityException {}
        protected void getBrightnessConfigurationForDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void getBrightnessEvents_enforcePermission() throws java.lang.SecurityException {}
        protected void getBrightnessInfo_enforcePermission() throws java.lang.SecurityException {}
        protected void getBrightness_enforcePermission() throws java.lang.SecurityException {}
        protected void getDefaultBrightnessConfiguration_enforcePermission() throws java.lang.SecurityException {}
        protected void getDefaultDozeBrightness_enforcePermission() throws java.lang.SecurityException {}
        protected void getDozeBrightnessSensorValueToBrightness_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void getUserPreferredHdrMode_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void pauseWifiDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void renameWifiDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void requestColorMode_enforcePermission() throws java.lang.SecurityException {}
        protected void requestDisplayModes_enforcePermission() throws java.lang.SecurityException {}
        protected void requestDisplayPower_enforcePermission() throws java.lang.SecurityException {}
        protected void resetUserPreferredDisplayMode_enforcePermission() throws java.lang.SecurityException {}
        protected void resumeWifiDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void setAreUserDisabledHdrTypesAllowed_enforcePermission() throws java.lang.SecurityException {}
        protected void setBrightnessByUnit_enforcePermission() throws java.lang.SecurityException {}
        protected void setBrightnessConfigurationForDisplay_enforcePermission() throws java.lang.SecurityException {}
        protected void setBrightnessConfigurationForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void setBrightness_enforcePermission() throws java.lang.SecurityException {}
        protected void setConnectionPreference_enforcePermission() throws java.lang.SecurityException {}
        protected void setDisplayTopology_enforcePermission() throws java.lang.SecurityException {}
        protected void setHdrConversionMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setRefreshRateSwitchingType_enforcePermission() throws java.lang.SecurityException {}
        protected void setShouldAlwaysRespectAppRequestedMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setTemporaryAutoBrightnessAdjustment_enforcePermission() throws java.lang.SecurityException {}
        protected void setTemporaryBrightnessMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setTemporaryBrightness_enforcePermission() throws java.lang.SecurityException {}
        protected void setUserDisabledHdrTypes_enforcePermission() throws java.lang.SecurityException {}
        protected void setUserPreferredDisplayMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setUserPreferredHdrMode_enforcePermission() throws java.lang.SecurityException {}
        protected void shouldAlwaysRespectAppRequestedMode_enforcePermission() throws java.lang.SecurityException {}
        protected void startWifiDisplayScan_enforcePermission() throws java.lang.SecurityException {}
        protected void stopWifiDisplayScan_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.display.IDisplayManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public boolean areUserDisabledHdrTypesAllowed() throws android.os.RemoteException { return false; }
            public android.os.IBinder asBinder() { return null; }
            public boolean canAccessPrivateDisplays(int p0) throws android.os.RemoteException { return false; }
            public void connectWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
            public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.media.projection.IMediaProjection p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public void disableConnectedDisplay(int p0) throws android.os.RemoteException {}
            public void disconnectWifiDisplay() throws android.os.RemoteException {}
            public void enableConnectedDisplay(int p0) throws android.os.RemoteException {}
            public void forgetWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getAmbientBrightnessStats() throws android.os.RemoteException { return null; }
            public float getBrightness(int p0) throws android.os.RemoteException { return 0.0f; }
            public float getBrightnessByUnit(int p0, int p1) throws android.os.RemoteException { return 0.0f; }
            public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForDisplay(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getBrightnessEvents(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.hardware.display.BrightnessInfo getBrightnessInfo(int p0) throws android.os.RemoteException { return null; }
            public int getConnectionPreference(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() throws android.os.RemoteException { return null; }
            public float getDefaultDozeBrightness(int p0) throws android.os.RemoteException { return 0.0f; }
            public android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport(int p0) throws android.os.RemoteException { return null; }
            public int[] getDisplayIds(boolean p0) throws android.os.RemoteException { return null; }
            public android.view.DisplayInfo getDisplayInfo(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.display.DisplayTopology getDisplayTopology() throws android.os.RemoteException { return null; }
            public float[] getDozeBrightnessSensorValueToBrightness(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.display.HdrConversionMode getHdrConversionMode() throws android.os.RemoteException { return null; }
            public android.hardware.display.HdrConversionMode getHdrConversionModeSetting() throws android.os.RemoteException { return null; }
            public float getHighestHdrSdrRatio(int p0) throws android.os.RemoteException { return 0.0f; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.display.Curve getMinimumBrightnessCurve() throws android.os.RemoteException { return null; }
            public android.hardware.OverlayProperties getOverlaySupport() throws android.os.RemoteException { return null; }
            public int getPreferredWideGamutColorSpaceId() throws android.os.RemoteException { return 0; }
            public int getRefreshRateSwitchingType() throws android.os.RemoteException { return 0; }
            public android.graphics.Point getStableDisplaySize() throws android.os.RemoteException { return null; }
            public int[] getSupportedHdrOutputTypes() throws android.os.RemoteException { return null; }
            public android.view.Display.Mode getSystemPreferredDisplayMode(int p0) throws android.os.RemoteException { return null; }
            public int[] getUserDisabledHdrTypes() throws android.os.RemoteException { return null; }
            public android.view.Display.Mode getUserPreferredDisplayMode(int p0) throws android.os.RemoteException { return null; }
            public int getUserPreferredHdrMode(int p0) throws android.os.RemoteException { return 0; }
            public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() throws android.os.RemoteException { return null; }
            public boolean isMinimalPostProcessingRequested(int p0) throws android.os.RemoteException { return false; }
            public boolean isUidPresentOnDisplay(int p0, int p1) throws android.os.RemoteException { return false; }
            public void overrideHdrTypes(int p0, int[] p1) throws android.os.RemoteException {}
            public void pauseWifiDisplay() throws android.os.RemoteException {}
            public void registerCallback(android.hardware.display.IDisplayManagerCallback p0) throws android.os.RemoteException {}
            public void registerCallbackWithEventMask(android.hardware.display.IDisplayManagerCallback p0, long p1) throws android.os.RemoteException {}
            public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0) throws android.os.RemoteException {}
            public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void requestColorMode(int p0, int p1) throws android.os.RemoteException {}
            public void requestDisplayModes(android.os.IBinder p0, int p1, int[] p2) throws android.os.RemoteException {}
            public boolean requestDisplayPower(int p0, int p1) throws android.os.RemoteException { return false; }
            public void resetUserPreferredDisplayMode(int p0) throws android.os.RemoteException {}
            public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void resumeWifiDisplay() throws android.os.RemoteException {}
            public void setAppRequestEnabledForTesting(boolean p0) throws android.os.RemoteException {}
            public void setAreUserDisabledHdrTypesAllowed(boolean p0) throws android.os.RemoteException {}
            public void setBrightness(int p0, float p1) throws android.os.RemoteException {}
            public void setBrightnessByUnit(int p0, float p1, int p2) throws android.os.RemoteException {}
            public void setBrightnessConfigurationForDisplay(android.hardware.display.BrightnessConfiguration p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setConnectionPreference(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setDisplayIdToMirror(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void setDisplayTopology(android.hardware.display.DisplayTopology p0) throws android.os.RemoteException {}
            public void setHdrConversionMode(android.hardware.display.HdrConversionMode p0) throws android.os.RemoteException {}
            public void setRefreshRateSwitchingType(int p0) throws android.os.RemoteException {}
            public void setShouldAlwaysRespectAppRequestedMode(boolean p0) throws android.os.RemoteException {}
            public void setTemporaryAutoBrightnessAdjustment(float p0) throws android.os.RemoteException {}
            public void setTemporaryBrightness(int p0, float p1) throws android.os.RemoteException {}
            public boolean setTemporaryBrightnessMode(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setUserDisabledHdrTypes(int[] p0) throws android.os.RemoteException {}
            public void setUserPreferredDisplayMode(int p0, android.view.Display.Mode p1, boolean p2) throws android.os.RemoteException {}
            public void setUserPreferredHdrMode(int p0, int p1) throws android.os.RemoteException {}
            public void setVirtualDisplayRotation(android.hardware.display.IVirtualDisplayCallback p0, int p1) throws android.os.RemoteException {}
            public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) throws android.os.RemoteException {}
            public boolean shouldAlwaysRespectAppRequestedMode() throws android.os.RemoteException { return false; }
            public void startWifiDisplayScan() throws android.os.RemoteException {}
            public void stopWifiDisplayScan() throws android.os.RemoteException {}
        }
    }
}
