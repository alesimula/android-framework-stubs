package android.os;

public class GraphicsEnvironment {
    private static final java.lang.String ACTION_ANGLE_FOR_ANDROID = "android.app.action.ANGLE_FOR_ANDROID";
    private static final java.lang.String ACTION_ANGLE_FOR_ANDROID_TOAST_MESSAGE = "android.app.action.ANGLE_FOR_ANDROID_TOAST_MESSAGE";
    private static final java.lang.String ANGLE_DRIVER_NAME = "angle";
    private static final long ANGLE_DRIVER_VERSION_CODE = 0L;
    private static final java.lang.String ANGLE_DRIVER_VERSION_NAME = "";
    private static final int ANGLE_GL_DRIVER_ALL_ANGLE_OFF = 0;
    private static final int ANGLE_GL_DRIVER_ALL_ANGLE_ON = 1;
    private static final java.lang.String ANGLE_GL_DRIVER_CHOICE_ANGLE = "angle";
    private static final java.lang.String ANGLE_GL_DRIVER_CHOICE_DEFAULT = "default";
    private static final java.lang.String ANGLE_GL_DRIVER_CHOICE_NATIVE = "native";
    private static final boolean DEBUG = false;
    private static final java.lang.String INTENT_KEY_A4A_TOAST_MESSAGE = "A4A Toast Message";
    private static final java.lang.String METADATA_ANGLE_PREFER = "com.android.graphics.driver.prefer_angle";
    private static final java.lang.String METADATA_DEVELOPER_DRIVER_ENABLE = "com.android.graphics.developerdriver.enable";
    private static final java.lang.String METADATA_DRIVER_BUILD_TIME = "com.android.graphics.driver.build_time";
    private static final java.lang.String METADATA_INJECT_LAYERS_ENABLE = "com.android.graphics.injectLayers.enable";
    private static final java.lang.String PROPERTY_GFX_DRIVER_BUILD_TIME = "ro.gfx.driver_build_time";
    private static final java.lang.String PROPERTY_GFX_DRIVER_PRERELEASE = "ro.gfx.driver.1";
    private static final java.lang.String PROPERTY_GFX_DRIVER_PRODUCTION = "ro.gfx.driver.0";
    private static final java.lang.String PROPERTY_RO_HARDWARE_EGL = "ro.hardware.egl";
    private static final java.lang.String PROPERTY_SOC_ET = "ro.soc.et";
    private static final java.lang.String SYSTEM_ANGLE_STRING = "system";
    private static final java.lang.String SYSTEM_DRIVER_NAME = "system";
    private static final long SYSTEM_DRIVER_VERSION_CODE = 0L;
    private static final java.lang.String SYSTEM_DRIVER_VERSION_NAME = "";
    private static final java.lang.String TAG = "GraphicsEnvironment";
    private static final java.lang.String UPDATABLE_DRIVER_ALLOWLIST_ALL = "*";
    private static final int UPDATABLE_DRIVER_GLOBAL_OPT_IN_DEFAULT = 0;
    private static final int UPDATABLE_DRIVER_GLOBAL_OPT_IN_OFF = 3;
    private static final int UPDATABLE_DRIVER_GLOBAL_OPT_IN_PRERELEASE_DRIVER = 2;
    private static final int UPDATABLE_DRIVER_GLOBAL_OPT_IN_PRODUCTION_DRIVER = 1;
    private static final java.lang.String UPDATABLE_DRIVER_SPHAL_LIBRARIES_FILENAME = "sphal_libraries.txt";
    private static final int VULKAN_1_0 = 4194304;
    private static final int VULKAN_1_1 = 4198400;
    private static final int VULKAN_1_2 = 4202496;
    private static final int VULKAN_1_3 = 4206592;
    private static final int VULKAN_1_4 = 4210688;
    private static final android.os.GraphicsEnvironment sInstance = null;
    private int mAngleOptInIndex;
    private java.lang.ClassLoader mClassLoader;
    private boolean mForceEGLEarlyLoad;
    private java.lang.String mLibraryPermittedPaths;
    private java.lang.String mLibrarySearchPaths;
    private boolean mShouldUseAngle;
    public GraphicsEnvironment() {}
    private boolean canInjectLayers(android.content.pm.ApplicationInfo p0) { return false; }
    private static java.lang.String chooseAbi(android.content.pm.ApplicationInfo p0) { return null; }
    private boolean chooseDriver(android.content.Context p0, android.os.Bundle p1, android.content.pm.PackageManager p2, java.lang.String p3, android.content.pm.ApplicationInfo p4) { return false; }
    private java.lang.String chooseDriverInternal(android.os.Bundle p0, android.content.pm.ApplicationInfo p1) { return null; }
    private boolean debugLayerEnabled(android.os.Bundle p0, java.lang.String p1, android.content.pm.ApplicationInfo p2) { return false; }
    private java.lang.String getAngleDebugPackage(android.content.Context p0, android.os.Bundle p1) { return null; }
    private java.lang.String[] getAngleEglFeatures(android.content.Context p0, android.os.Bundle p1) { return null; }
    private java.lang.String getAnglePackageName(android.content.pm.PackageManager p0) { return null; }
    private static android.content.pm.ApplicationInfo getAppInfoWithMetadata(android.content.Context p0, android.content.pm.PackageManager p1, java.lang.String p2) { return null; }
    private java.lang.String getDebugLayerAppPaths(android.content.pm.IPackageManager p0, java.lang.String p1) { return null; }
    private static java.util.List<java.lang.String> getGlobalSettingsString(android.content.ContentResolver p0, android.os.Bundle p1, java.lang.String p2) { return null; }
    public static android.os.GraphicsEnvironment getInstance() { return null; }
    private static int getPackageIndex(java.lang.String p0, java.util.List<java.lang.String> p1) { return 0; }
    private java.lang.String getSphalLibraries(android.content.Context p0, java.lang.String p1) { return null; }
    private int getVulkanVersion(android.content.pm.PackageManager p0) { return 0; }
    public static native void hintActivityLaunch();
    private static native boolean isDebuggable();
    private static native void nativeEarlyInitEgl();
    private static native java.lang.String nativeGetPersistGraphicsEgl();
    private static native void nativeSetAngleInfo(java.lang.String p0, boolean p1, java.lang.String p2, java.lang.String[] p3);
    private static native void nativeToggleAngleAsSystemDriver(boolean p0);
    private java.lang.String queryAngleChoice(android.content.Context p0, android.os.Bundle p1, java.lang.String p2, android.content.pm.ApplicationInfo p3) { return null; }
    private static native void setDebugLayers(java.lang.String p0);
    private static native void setDebugLayersGLES(java.lang.String p0);
    private static native void setDriverPathAndSphalLibraries(java.lang.String p0, java.lang.String p1);
    private static native void setGpuStats(java.lang.String p0, java.lang.String p1, long p2, long p3, java.lang.String p4, int p5);
    private static native boolean setInjectLayersPrSetDumpable();
    private static native void setLayerPaths(java.lang.ClassLoader p0, java.lang.String p1);
    private boolean setupAngle(android.content.Context p0, android.os.Bundle p1, android.content.pm.PackageManager p2, java.lang.String p3, android.content.pm.ApplicationInfo p4) { return false; }
    private boolean setupAngleFromApk(android.content.Context p0, android.os.Bundle p1, android.content.pm.PackageManager p2, java.lang.String p3) { return false; }
    private boolean setupAngleFromSystem(android.content.Context p0, android.os.Bundle p1, java.lang.String p2) { return false; }
    private void setupGpuLayers(android.content.Context p0, android.os.Bundle p1, android.content.pm.PackageManager p2, java.lang.String p3, android.content.pm.ApplicationInfo p4) {}
    private boolean shouldShowAngleInUseDialogBox(android.content.Context p0) { return false; }
    public java.lang.String getDebugLayerPathsFromSettings(android.os.Bundle p0, android.content.pm.IPackageManager p1, java.lang.String p2, android.content.pm.ApplicationInfo p3) { return null; }
    public void setLayerPaths(java.lang.ClassLoader p0, java.lang.String p1, java.lang.String p2) {}
    public void setup(android.content.Context p0, android.os.Bundle p1) {}
    public void showAngleInUseDialogBox(android.content.Context p0) {}
    public void toggleAngleAsSystemDriver(boolean p0) {}
}
