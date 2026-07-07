package android.app.modes;

public interface IContextualModeManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.modes.IContextualModeManager";
    public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void cleanUpCallersAfter(long p0) throws android.os.RemoteException;
    public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException;
    public int getAutomaticZenRuleState(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAutomaticZenRules() throws android.os.RemoteException;
    public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException;
    public android.service.notification.ZenPolicy getDefaultZenPolicy() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getEnabledZenPackages() throws android.os.RemoteException;
    public java.util.List<android.app.modes.ContextualMode> getModes(android.os.UserHandle p0) throws android.os.RemoteException;
    public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException;
    public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getZenMode() throws android.os.RemoteException;
    public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException;
    public boolean isModeSyncEnabled(android.os.UserHandle p0) throws android.os.RemoteException;
    public boolean isModeSyncSupported() throws android.os.RemoteException;
    public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException;
    public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException;
    public boolean matchesCallFilter(android.os.Bundle p0) throws android.os.RemoteException;
    public void mutateModes(android.os.UserHandle p0, android.app.modes.ContextualModesMutation p1) throws android.os.RemoteException;
    public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException;
    public void registerModeListener(android.os.UserHandle p0, android.app.modes.IContextualModeListener p1) throws android.os.RemoteException;
    public void registerModeSyncListener(android.os.UserHandle p0, android.app.modes.IContextualModeSyncListener p1) throws android.os.RemoteException;
    public boolean removeAutomaticZenRule(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean removeAutomaticZenRules(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException;
    public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException;
    public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException;
    public void setInterruptionFilter(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setManualZenRuleDeviceEffects(android.service.notification.ZenDeviceEffects p0) throws android.os.RemoteException;
    public void setModeSyncEnabled(android.os.UserHandle p0, boolean p1) throws android.os.RemoteException;
    public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void unregisterModeListener(android.app.modes.IContextualModeListener p0) throws android.os.RemoteException;
    public void unregisterModeSyncListener(android.app.modes.IContextualModeSyncListener p0) throws android.os.RemoteException;
    public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1, boolean p2) throws android.os.RemoteException;

    public static class Default implements android.app.modes.IContextualModeManager {
        public Default() {}
        public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
        public void cleanUpCallersAfter(long p0) throws android.os.RemoteException {}
        public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getAutomaticZenRuleState(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.content.pm.ParceledListSlice getAutomaticZenRules() throws android.os.RemoteException { return null; }
        public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException { return null; }
        public android.service.notification.ZenPolicy getDefaultZenPolicy() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getEnabledZenPackages() throws android.os.RemoteException { return null; }
        public java.util.List<android.app.modes.ContextualMode> getModes(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
        public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public int getZenMode() throws android.os.RemoteException { return 0; }
        public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException { return null; }
        public boolean isModeSyncEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
        public boolean isModeSyncSupported() throws android.os.RemoteException { return false; }
        public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean matchesCallFilter(android.os.Bundle p0) throws android.os.RemoteException { return false; }
        public void mutateModes(android.os.UserHandle p0, android.app.modes.ContextualModesMutation p1) throws android.os.RemoteException {}
        public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException {}
        public void registerModeListener(android.os.UserHandle p0, android.app.modes.IContextualModeListener p1) throws android.os.RemoteException {}
        public void registerModeSyncListener(android.os.UserHandle p0, android.app.modes.IContextualModeSyncListener p1) throws android.os.RemoteException {}
        public boolean removeAutomaticZenRule(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean removeAutomaticZenRules(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException {}
        public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException {}
        public void setInterruptionFilter(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setManualZenRuleDeviceEffects(android.service.notification.ZenDeviceEffects p0) throws android.os.RemoteException {}
        public void setModeSyncEnabled(android.os.UserHandle p0, boolean p1) throws android.os.RemoteException {}
        public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void unregisterModeListener(android.app.modes.IContextualModeListener p0) throws android.os.RemoteException {}
        public void unregisterModeSyncListener(android.app.modes.IContextualModeSyncListener p0) throws android.os.RemoteException {}
        public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1, boolean p2) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.modes.IContextualModeManager {
        static final int TRANSACTION_addAutomaticZenRule = 20;
        static final int TRANSACTION_cleanUpCallersAfter = 30;
        static final int TRANSACTION_getAutomaticZenRule = 18;
        static final int TRANSACTION_getAutomaticZenRuleState = 25;
        static final int TRANSACTION_getAutomaticZenRules = 19;
        static final int TRANSACTION_getConsolidatedNotificationPolicy = 12;
        static final int TRANSACTION_getDefaultZenPolicy = 17;
        static final int TRANSACTION_getEnabledZenPackages = 38;
        static final int TRANSACTION_getModes = 4;
        static final int TRANSACTION_getNotificationPolicy = 15;
        static final int TRANSACTION_getRuleInstanceCount = 24;
        static final int TRANSACTION_getZenMode = 10;
        static final int TRANSACTION_getZenModeConfig = 11;
        static final int TRANSACTION_isModeSyncEnabled = 2;
        static final int TRANSACTION_isModeSyncSupported = 1;
        static final int TRANSACTION_isNotificationPolicyAccessGranted = 34;
        static final int TRANSACTION_isNotificationPolicyAccessGrantedForPackage = 35;
        static final int TRANSACTION_matchesCallFilter = 29;
        static final int TRANSACTION_mutateModes = 5;
        static final int TRANSACTION_notifyConditions = 14;
        static final int TRANSACTION_registerModeListener = 8;
        static final int TRANSACTION_registerModeSyncListener = 6;
        static final int TRANSACTION_removeAutomaticZenRule = 22;
        static final int TRANSACTION_removeAutomaticZenRules = 23;
        static final int TRANSACTION_requestBindProvider = 31;
        static final int TRANSACTION_requestInterruptionFilterFromListener = 33;
        static final int TRANSACTION_requestUnbindProvider = 32;
        static final int TRANSACTION_setAutomaticZenRuleState = 26;
        static final int TRANSACTION_setInterruptionFilter = 28;
        static final int TRANSACTION_setManualZenRuleDeviceEffects = 27;
        static final int TRANSACTION_setModeSyncEnabled = 3;
        static final int TRANSACTION_setNotificationPolicy = 16;
        static final int TRANSACTION_setNotificationPolicyAccessGranted = 36;
        static final int TRANSACTION_setNotificationPolicyAccessGrantedForUser = 37;
        static final int TRANSACTION_setZenMode = 13;
        static final int TRANSACTION_unregisterModeListener = 9;
        static final int TRANSACTION_unregisterModeSyncListener = 7;
        static final int TRANSACTION_updateAutomaticZenRule = 21;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.app.modes.IContextualModeManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void getModes_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void mutateModes_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void registerModeListener_enforcePermission() throws java.lang.SecurityException {}
        protected void setModeSyncEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterModeListener_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.app.modes.IContextualModeManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.os.IBinder asBinder() { return null; }
            public void cleanUpCallersAfter(long p0) throws android.os.RemoteException {}
            public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getAutomaticZenRuleState(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public android.content.pm.ParceledListSlice getAutomaticZenRules() throws android.os.RemoteException { return null; }
            public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException { return null; }
            public android.service.notification.ZenPolicy getDefaultZenPolicy() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getEnabledZenPackages() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.app.modes.ContextualMode> getModes(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
            public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public int getZenMode() throws android.os.RemoteException { return 0; }
            public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException { return null; }
            public boolean isModeSyncEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
            public boolean isModeSyncSupported() throws android.os.RemoteException { return false; }
            public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean matchesCallFilter(android.os.Bundle p0) throws android.os.RemoteException { return false; }
            public void mutateModes(android.os.UserHandle p0, android.app.modes.ContextualModesMutation p1) throws android.os.RemoteException {}
            public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException {}
            public void registerModeListener(android.os.UserHandle p0, android.app.modes.IContextualModeListener p1) throws android.os.RemoteException {}
            public void registerModeSyncListener(android.os.UserHandle p0, android.app.modes.IContextualModeSyncListener p1) throws android.os.RemoteException {}
            public boolean removeAutomaticZenRule(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean removeAutomaticZenRules(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException {}
            public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException {}
            public void setInterruptionFilter(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setManualZenRuleDeviceEffects(android.service.notification.ZenDeviceEffects p0) throws android.os.RemoteException {}
            public void setModeSyncEnabled(android.os.UserHandle p0, boolean p1) throws android.os.RemoteException {}
            public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public void unregisterModeListener(android.app.modes.IContextualModeListener p0) throws android.os.RemoteException {}
            public void unregisterModeSyncListener(android.app.modes.IContextualModeSyncListener p0) throws android.os.RemoteException {}
            public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1, boolean p2) throws android.os.RemoteException { return false; }
        }
    }
}
