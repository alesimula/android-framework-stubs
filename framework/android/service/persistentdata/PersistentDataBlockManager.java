package android.service.persistentdata;

@android.annotation.RestrictedForEnvironment(environments="SDK Runtime", from=35)
public class PersistentDataBlockManager {
    @android.annotation.SystemApi
    public static final int FLASH_LOCK_LOCKED = 1;
    @android.annotation.SystemApi
    public static final int FLASH_LOCK_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int FLASH_LOCK_UNLOCKED = 0;
    private static final java.lang.String TAG = null;
    private android.service.persistentdata.IPersistentDataBlockService sService;
    public PersistentDataBlockManager(android.service.persistentdata.IPersistentDataBlockService p0) {}
    @android.annotation.SystemApi
    public boolean deactivateFactoryResetProtection(byte[] p0) { return false; }
    @android.annotation.SystemApi
    public int getDataBlockSize() { return 0; }
    @android.annotation.SystemApi
    public int getFlashLockState() { return 0; }
    @android.annotation.SystemApi
    public long getMaximumDataBlockSize() { return 0L; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean getOemUnlockEnabled() { return false; }
    @android.annotation.SystemApi
    public java.lang.String getPersistentDataPackageName() { return null; }
    public boolean isFactoryResetProtectionActive() { return false; }
    @android.annotation.SystemApi
    public byte[] read() { return null; }
    @android.annotation.SystemApi
    public boolean setFactoryResetProtectionSecret(byte[] p0) { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setOemUnlockEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public void wipe() {}
    @android.annotation.SystemApi
    public int write(byte[] p0) { return 0; }

    @android.annotation.SystemApi
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FlashLockState {
    }
}
