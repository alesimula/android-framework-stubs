package android.app;

public interface INotificationManager extends android.os.IInterface {
    public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public android.app.NotificationRule addNotificationRule(int p0, android.app.NotificationRule p1, int p2) throws android.os.RemoteException;
    public void allowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean appCanBePromoted(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void applyAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException;
    public void applyAdjustmentsFromAssistant(android.service.notification.INotificationListener p0, java.util.List<android.service.notification.Adjustment> p1) throws android.os.RemoteException;
    public void applyEnqueuedAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException;
    public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException;
    public boolean areBubblesAllowed(java.lang.String p0) throws android.os.RemoteException;
    public boolean areBubblesEnabled(android.os.UserHandle p0) throws android.os.RemoteException;
    public boolean areChannelsBypassingDnd() throws android.os.RemoteException;
    public boolean areNotificationsEnabledForPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean canBePromoted(java.lang.String p0) throws android.os.RemoteException;
    public boolean canNotifyAsPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean canShowBadge(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean canUseFullScreenIntent(android.content.AttributionSource p0) throws android.os.RemoteException;
    public void cancelAllNotifications(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void cancelNotificationFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void cancelNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    public void cancelNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void cancelToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void cleanUpCallersAfter(long p0) throws android.os.RemoteException;
    public void clearData(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void clearRequestedListenerHints(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public void createConversationNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2, java.lang.String p3) throws android.os.RemoteException;
    public android.app.NotificationChannel createConversationNotificationChannelForPackageFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public void createNotificationChannelGroups(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException;
    public void createNotificationChannels(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException;
    public void createNotificationChannelsForPackage(java.lang.String p0, int p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException;
    public void deleteConversationNotificationChannelFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3) throws android.os.RemoteException;
    public void deleteNotificationChannel(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void deleteNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void deleteNotificationHistoryItem(java.lang.String p0, int p1, long p2) throws android.os.RemoteException;
    public void disallowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void enqueueNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.app.Notification p4, int p5) throws android.os.RemoteException;
    public boolean enqueueTextToast(java.lang.String p0, android.os.IBinder p1, java.lang.CharSequence p2, int p3, boolean p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException;
    public boolean enqueueToast(java.lang.String p0, android.os.IBinder p1, android.app.ITransientNotification p2, int p3, boolean p4, int p5) throws android.os.RemoteException;
    public void finishToken(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1, int p2) throws android.os.RemoteException;
    public android.service.notification.StatusBarNotification[] getActiveNotificationsWithAttribution(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.service.notification.StatusBarNotification[] getActiveNotificationsWithAttributionForUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.lang.String[] getAdjustmentDeniedPackages(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllowedAssistantAdjustments(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllowedAssistantAdjustmentsForUser(int p0) throws android.os.RemoteException;
    public int[] getAllowedClassificationTypes() throws android.os.RemoteException;
    public android.content.ComponentName getAllowedNotificationAssistant() throws android.os.RemoteException;
    public android.content.ComponentName getAllowedNotificationAssistantForUser(int p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException;
    public int getAutomaticZenRuleState(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAutomaticZenRules() throws android.os.RemoteException;
    public byte[] getBackupPayload(int p0) throws android.os.RemoteException;
    public int getBlockedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getBubblePreferenceForPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException;
    public android.app.NotificationChannel getConversationNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getConversations(boolean p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getConversationsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.ComponentName getDefaultNotificationAssistant() throws android.os.RemoteException;
    public android.service.notification.ZenPolicy getDefaultZenPolicy() throws android.os.RemoteException;
    public int getDeletedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.ComponentName getEffectsSuppressor() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() throws android.os.RemoteException;
    public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getEnabledZenPackages() throws android.os.RemoteException;
    public int getHintsFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public int getHintsFromListenerNoToken() throws android.os.RemoteException;
    public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.service.notification.StatusBarNotification[] getHistoricalNotificationsWithAttribution(java.lang.String p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public int getInterruptionFilterFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public android.service.notification.NotificationListenerFilter getListenerFilter(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public android.app.NotificationChannel getNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public android.app.NotificationChannel getNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException;
    public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.NotificationChannelGroup getNotificationChannelGroupForPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelGroups(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelGroupsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelGroupsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelGroupsWithoutChannels(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannels(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelsBypassingDnd(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public java.lang.String getNotificationDelegate(java.lang.String p0) throws android.os.RemoteException;
    public android.app.NotificationHistory getNotificationHistory(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException;
    public android.app.NotificationRule getNotificationRule(int p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationRules(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public int getNumNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPackageImportance(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getPackagesBypassingDnd(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPackagesWithAnyChannels(int p0) throws android.os.RemoteException;
    public android.app.NotificationChannelGroup getPopulatedNotificationChannelGroupForPackage(java.lang.String p0, int p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public boolean getPrivateNotificationsAllowed() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getRecentBlockedNotificationChannelGroupsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getSnoozedNotificationsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getUnsupportedAdjustmentTypes() throws android.os.RemoteException;
    public int getZenMode() throws android.os.RemoteException;
    public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException;
    public boolean hasEnabledNotificationListener(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasSentValidBubble(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasSentValidMsg(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasUserDemotedInvalidMsgApp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isImportanceLocked(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isInCall(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isInInvalidMsgState(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isNotificationAssistantAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isNotificationListenerAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException;
    public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException;
    public boolean isPackagePaused(java.lang.String p0) throws android.os.RemoteException;
    public boolean isPermissionFixed(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isSystemConditionProviderEnabled(java.lang.String p0) throws android.os.RemoteException;
    public void logHsuNotificationPostStatus(android.service.notification.StatusBarNotification p0, int p1) throws android.os.RemoteException;
    public boolean matchesCallFilter(android.os.Bundle p0) throws android.os.RemoteException;
    public void migrateNotificationFilter(android.service.notification.INotificationListener p0, int p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException;
    public boolean onlyHasDefaultChannel(java.lang.String p0, int p1) throws android.os.RemoteException;
    public long pullStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException;
    public void registerCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException;
    public void registerListener(android.service.notification.INotificationListener p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException;
    public boolean removeAutomaticZenRule(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean removeAutomaticZenRules(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean removeNotificationRule(int p0, int p1) throws android.os.RemoteException;
    public void requestBindListener(android.content.ComponentName p0) throws android.os.RemoteException;
    public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException;
    public void requestHintsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public void requestSystemAdjustments(java.util.List<android.service.notification.Adjustment> p0) throws android.os.RemoteException;
    public void requestUnbindListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public void requestUnbindListenerComponent(android.content.ComponentName p0) throws android.os.RemoteException;
    public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException;
    public void setAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void setAdjustmentTypeSupportedState(android.service.notification.INotificationListener p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setAssistantClassificationTypeState(int p0, boolean p1) throws android.os.RemoteException;
    public void setAssistantClassificationTypeStateForUser(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException;
    public void setBubblesAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void setCanBePromoted(java.lang.String p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public void setHideSilentStatusIcons(boolean p0) throws android.os.RemoteException;
    public void setInterruptionFilter(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setInvalidMsgAppDemoted(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setListenerFilter(android.content.ComponentName p0, int p1, android.service.notification.NotificationListenerFilter p2) throws android.os.RemoteException;
    public void setManualZenRuleDeviceEffects(android.service.notification.ZenDeviceEffects p0) throws android.os.RemoteException;
    public void setNASMigrationDoneAndResetDefault(int p0, boolean p1) throws android.os.RemoteException;
    public void setNotificationAssistantAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setNotificationAssistantAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationDelegate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationsEnabledForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationsEnabledWithImportanceLockForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationsShownFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public void setPrivateNotificationsAllowed(boolean p0) throws android.os.RemoteException;
    public void setShowBadge(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setToastRateLimitingEnabled(boolean p0) throws android.os.RemoteException;
    public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public boolean shouldHideSilentStatusIcons(java.lang.String p0) throws android.os.RemoteException;
    public void silenceNotificationSound() throws android.os.RemoteException;
    public void snoozeNotificationUntilContextFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void snoozeNotificationUntilFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public void unlockAllNotificationChannels() throws android.os.RemoteException;
    public void unlockNotificationChannel(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void unregisterCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException;
    public void unregisterListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public void unsnoozeNotificationFromAssistant(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException;
    public void unsnoozeNotificationFromSystemListener(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1, boolean p2) throws android.os.RemoteException;
    public void updateNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2) throws android.os.RemoteException;
    public void updateNotificationChannelFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, android.app.NotificationChannel p3) throws android.os.RemoteException;
    public void updateNotificationChannelGroupForPackage(java.lang.String p0, int p1, android.app.NotificationChannelGroup p2) throws android.os.RemoteException;
    public android.app.NotificationRule updateNotificationRule(int p0, android.app.NotificationRule p1) throws android.os.RemoteException;

    public static class Default implements android.app.INotificationManager {
        public Default() {}
        public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.app.NotificationRule addNotificationRule(int p0, android.app.NotificationRule p1, int p2) throws android.os.RemoteException { return null; }
        public void allowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean appCanBePromoted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void applyAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException {}
        public void applyAdjustmentsFromAssistant(android.service.notification.INotificationListener p0, java.util.List<android.service.notification.Adjustment> p1) throws android.os.RemoteException {}
        public void applyEnqueuedAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException {}
        public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException {}
        public boolean areBubblesAllowed(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean areBubblesEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
        public boolean areChannelsBypassingDnd() throws android.os.RemoteException { return false; }
        public boolean areNotificationsEnabledForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
        public boolean canBePromoted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean canNotifyAsPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean canShowBadge(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean canUseFullScreenIntent(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public void cancelAllNotifications(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void cancelNotificationFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void cancelNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
        public void cancelNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void cancelToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void cleanUpCallersAfter(long p0) throws android.os.RemoteException {}
        public void clearData(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void clearRequestedListenerHints(android.service.notification.INotificationListener p0) throws android.os.RemoteException {}
        public void createConversationNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2, java.lang.String p3) throws android.os.RemoteException {}
        public android.app.NotificationChannel createConversationNotificationChannelForPackageFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
        public void createNotificationChannelGroups(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
        public void createNotificationChannels(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
        public void createNotificationChannelsForPackage(java.lang.String p0, int p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException {}
        public void deleteConversationNotificationChannelFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3) throws android.os.RemoteException {}
        public void deleteNotificationChannel(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void deleteNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void deleteNotificationHistoryItem(java.lang.String p0, int p1, long p2) throws android.os.RemoteException {}
        public void disallowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void enqueueNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.app.Notification p4, int p5) throws android.os.RemoteException {}
        public boolean enqueueTextToast(java.lang.String p0, android.os.IBinder p1, java.lang.CharSequence p2, int p3, boolean p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException { return false; }
        public boolean enqueueToast(java.lang.String p0, android.os.IBinder p1, android.app.ITransientNotification p2, int p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
        public void finishToken(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
        public android.service.notification.StatusBarNotification[] getActiveNotificationsWithAttribution(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.service.notification.StatusBarNotification[] getActiveNotificationsWithAttributionForUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.String[] getAdjustmentDeniedPackages(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAllowedAssistantAdjustments(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAllowedAssistantAdjustmentsForUser(int p0) throws android.os.RemoteException { return null; }
        public int[] getAllowedClassificationTypes() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getAllowedNotificationAssistant() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getAllowedNotificationAssistantForUser(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getAutomaticZenRuleState(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.content.pm.ParceledListSlice getAutomaticZenRules() throws android.os.RemoteException { return null; }
        public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
        public int getBlockedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int getBubblePreferenceForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException { return null; }
        public android.app.NotificationChannel getConversationNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getConversations(boolean p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getConversationsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getDefaultNotificationAssistant() throws android.os.RemoteException { return null; }
        public android.service.notification.ZenPolicy getDefaultZenPolicy() throws android.os.RemoteException { return null; }
        public int getDeletedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public android.content.ComponentName getEffectsSuppressor() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() throws android.os.RemoteException { return null; }
        public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getEnabledZenPackages() throws android.os.RemoteException { return null; }
        public int getHintsFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
        public int getHintsFromListenerNoToken() throws android.os.RemoteException { return 0; }
        public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.service.notification.StatusBarNotification[] getHistoricalNotificationsWithAttribution(java.lang.String p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
        public int getInterruptionFilterFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
        public android.service.notification.NotificationListenerFilter getListenerFilter(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public android.app.NotificationChannel getNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.app.NotificationChannel getNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return null; }
        public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.app.NotificationChannelGroup getNotificationChannelGroupForPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelGroups(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelGroupsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelGroupsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelGroupsWithoutChannels(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannels(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelsBypassingDnd(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
        public java.lang.String getNotificationDelegate(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.app.NotificationHistory getNotificationHistory(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.app.NotificationRule getNotificationRule(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationRules(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException { return null; }
        public int getNumNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getPackageImportance(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.content.pm.ParceledListSlice getPackagesBypassingDnd(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPackagesWithAnyChannels(int p0) throws android.os.RemoteException { return null; }
        public android.app.NotificationChannelGroup getPopulatedNotificationChannelGroupForPackage(java.lang.String p0, int p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
        public boolean getPrivateNotificationsAllowed() throws android.os.RemoteException { return false; }
        public android.content.pm.ParceledListSlice getRecentBlockedNotificationChannelGroupsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public android.content.pm.ParceledListSlice getSnoozedNotificationsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getUnsupportedAdjustmentTypes() throws android.os.RemoteException { return null; }
        public int getZenMode() throws android.os.RemoteException { return 0; }
        public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException { return null; }
        public boolean hasEnabledNotificationListener(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasSentValidBubble(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasSentValidMsg(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasUserDemotedInvalidMsgApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isImportanceLocked(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isInCall(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isInInvalidMsgState(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isNotificationAssistantAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isNotificationListenerAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isPackagePaused(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isPermissionFixed(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isSystemConditionProviderEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void logHsuNotificationPostStatus(android.service.notification.StatusBarNotification p0, int p1) throws android.os.RemoteException {}
        public boolean matchesCallFilter(android.os.Bundle p0) throws android.os.RemoteException { return false; }
        public void migrateNotificationFilter(android.service.notification.INotificationListener p0, int p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException {}
        public boolean onlyHasDefaultChannel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public long pullStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException { return 0L; }
        public void registerCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException {}
        public void registerListener(android.service.notification.INotificationListener p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
        public boolean removeAutomaticZenRule(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean removeAutomaticZenRules(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean removeNotificationRule(int p0, int p1) throws android.os.RemoteException { return false; }
        public void requestBindListener(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void requestHintsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public void requestSystemAdjustments(java.util.List<android.service.notification.Adjustment> p0) throws android.os.RemoteException {}
        public void requestUnbindListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException {}
        public void requestUnbindListenerComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException {}
        public void setAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void setAdjustmentTypeSupportedState(android.service.notification.INotificationListener p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setAssistantClassificationTypeState(int p0, boolean p1) throws android.os.RemoteException {}
        public void setAssistantClassificationTypeStateForUser(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException {}
        public void setBubblesAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void setCanBePromoted(java.lang.String p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public void setHideSilentStatusIcons(boolean p0) throws android.os.RemoteException {}
        public void setInterruptionFilter(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setInvalidMsgAppDemoted(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setListenerFilter(android.content.ComponentName p0, int p1, android.service.notification.NotificationListenerFilter p2) throws android.os.RemoteException {}
        public void setManualZenRuleDeviceEffects(android.service.notification.ZenDeviceEffects p0) throws android.os.RemoteException {}
        public void setNASMigrationDoneAndResetDefault(int p0, boolean p1) throws android.os.RemoteException {}
        public void setNotificationAssistantAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setNotificationAssistantAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationDelegate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationsEnabledForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationsEnabledWithImportanceLockForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationsShownFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public void setPrivateNotificationsAllowed(boolean p0) throws android.os.RemoteException {}
        public void setShowBadge(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setToastRateLimitingEnabled(boolean p0) throws android.os.RemoteException {}
        public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public boolean shouldHideSilentStatusIcons(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void silenceNotificationSound() throws android.os.RemoteException {}
        public void snoozeNotificationUntilContextFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void snoozeNotificationUntilFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public void unlockAllNotificationChannels() throws android.os.RemoteException {}
        public void unlockNotificationChannel(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void unregisterCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException {}
        public void unregisterListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public void unsnoozeNotificationFromAssistant(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unsnoozeNotificationFromSystemListener(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1, boolean p2) throws android.os.RemoteException { return false; }
        public void updateNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2) throws android.os.RemoteException {}
        public void updateNotificationChannelFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, android.app.NotificationChannel p3) throws android.os.RemoteException {}
        public void updateNotificationChannelGroupForPackage(java.lang.String p0, int p1, android.app.NotificationChannelGroup p2) throws android.os.RemoteException {}
        public android.app.NotificationRule updateNotificationRule(int p0, android.app.NotificationRule p1) throws android.os.RemoteException { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.INotificationManager {
        public static final java.lang.String DESCRIPTOR = "android.app.INotificationManager";
        static final java.lang.String[] PERMISSIONS_registerCallNotificationEventListener = null;
        static final java.lang.String[] PERMISSIONS_unregisterCallNotificationEventListener = null;
        static final int TRANSACTION_addAutomaticZenRule = 173;
        static final int TRANSACTION_addNotificationRule = 144;
        static final int TRANSACTION_allowAssistantAdjustment = 24;
        static final int TRANSACTION_appCanBePromoted = 133;
        static final int TRANSACTION_applyAdjustmentFromAssistant = 97;
        static final int TRANSACTION_applyAdjustmentsFromAssistant = 98;
        static final int TRANSACTION_applyEnqueuedAdjustmentFromAssistant = 96;
        static final int TRANSACTION_applyRestore = 117;
        static final int TRANSACTION_areBubblesAllowed = 29;
        static final int TRANSACTION_areBubblesEnabled = 30;
        static final int TRANSACTION_areChannelsBypassingDnd = 60;
        static final int TRANSACTION_areNotificationsEnabledForPackage = 19;
        static final int TRANSACTION_canBePromoted = 134;
        static final int TRANSACTION_canNotifyAsPackage = 121;
        static final int TRANSACTION_canShowBadge = 11;
        static final int TRANSACTION_canUseFullScreenIntent = 122;
        static final int TRANSACTION_cancelAllNotifications = 1;
        static final int TRANSACTION_cancelNotificationFromListener = 76;
        static final int TRANSACTION_cancelNotificationWithTag = 8;
        static final int TRANSACTION_cancelNotificationsFromListener = 77;
        static final int TRANSACTION_cancelToast = 5;
        static final int TRANSACTION_cleanUpCallersAfter = 156;
        static final int TRANSACTION_clearData = 2;
        static final int TRANSACTION_clearRequestedListenerHints = 86;
        static final int TRANSACTION_createConversationNotificationChannelForPackage = 47;
        static final int TRANSACTION_createConversationNotificationChannelForPackageFromPrivilegedListener = 91;
        static final int TRANSACTION_createNotificationChannelGroups = 32;
        static final int TRANSACTION_createNotificationChannels = 33;
        static final int TRANSACTION_createNotificationChannelsForPackage = 34;
        static final int TRANSACTION_deleteConversationNotificationChannelFromPrivilegedListener = 92;
        static final int TRANSACTION_deleteNotificationChannel = 49;
        static final int TRANSACTION_deleteNotificationChannelGroup = 55;
        static final int TRANSACTION_deleteNotificationHistoryItem = 65;
        static final int TRANSACTION_disallowAssistantAdjustment = 25;
        static final int TRANSACTION_enqueueNotificationWithTag = 7;
        static final int TRANSACTION_enqueueTextToast = 3;
        static final int TRANSACTION_enqueueToast = 4;
        static final int TRANSACTION_finishToken = 6;
        static final int TRANSACTION_getActiveNotifications = 68;
        static final int TRANSACTION_getActiveNotificationsFromListener = 84;
        static final int TRANSACTION_getActiveNotificationsWithAttribution = 69;
        static final int TRANSACTION_getActiveNotificationsWithAttributionForUser = 70;
        static final int TRANSACTION_getAdjustmentDeniedPackages = 140;
        static final int TRANSACTION_getAllowedAssistantAdjustments = 22;
        static final int TRANSACTION_getAllowedAssistantAdjustmentsForUser = 23;
        static final int TRANSACTION_getAllowedClassificationTypes = 137;
        static final int TRANSACTION_getAllowedNotificationAssistant = 112;
        static final int TRANSACTION_getAllowedNotificationAssistantForUser = 111;
        static final int TRANSACTION_getAppActiveNotifications = 118;
        static final int TRANSACTION_getAutomaticZenRule = 171;
        static final int TRANSACTION_getAutomaticZenRuleState = 178;
        static final int TRANSACTION_getAutomaticZenRules = 172;
        static final int TRANSACTION_getBackupPayload = 116;
        static final int TRANSACTION_getBlockedChannelCount = 54;
        static final int TRANSACTION_getBubblePreferenceForPackage = 31;
        static final int TRANSACTION_getConsolidatedNotificationPolicy = 161;
        static final int TRANSACTION_getConversationNotificationChannel = 46;
        static final int TRANSACTION_getConversations = 35;
        static final int TRANSACTION_getConversationsForPackage = 36;
        static final int TRANSACTION_getDefaultNotificationAssistant = 113;
        static final int TRANSACTION_getDefaultZenPolicy = 170;
        static final int TRANSACTION_getDeletedChannelCount = 53;
        static final int TRANSACTION_getEffectsSuppressor = 101;
        static final int TRANSACTION_getEnabledNotificationListenerPackages = 109;
        static final int TRANSACTION_getEnabledNotificationListeners = 110;
        static final int TRANSACTION_getEnabledZenPackages = 158;
        static final int TRANSACTION_getHintsFromListener = 88;
        static final int TRANSACTION_getHintsFromListenerNoToken = 89;
        static final int TRANSACTION_getHistoricalNotifications = 71;
        static final int TRANSACTION_getHistoricalNotificationsWithAttribution = 72;
        static final int TRANSACTION_getInterruptionFilterFromListener = 153;
        static final int TRANSACTION_getListenerFilter = 126;
        static final int TRANSACTION_getNotificationChannel = 45;
        static final int TRANSACTION_getNotificationChannelForPackage = 48;
        static final int TRANSACTION_getNotificationChannelGroup = 56;
        static final int TRANSACTION_getNotificationChannelGroupForPackage = 38;
        static final int TRANSACTION_getNotificationChannelGroups = 57;
        static final int TRANSACTION_getNotificationChannelGroupsForPackage = 37;
        static final int TRANSACTION_getNotificationChannelGroupsFromPrivilegedListener = 95;
        static final int TRANSACTION_getNotificationChannelGroupsWithoutChannels = 58;
        static final int TRANSACTION_getNotificationChannels = 50;
        static final int TRANSACTION_getNotificationChannelsBypassingDnd = 61;
        static final int TRANSACTION_getNotificationChannelsForPackage = 51;
        static final int TRANSACTION_getNotificationChannelsFromPrivilegedListener = 94;
        static final int TRANSACTION_getNotificationDelegate = 120;
        static final int TRANSACTION_getNotificationHistory = 73;
        static final int TRANSACTION_getNotificationPolicy = 165;
        static final int TRANSACTION_getNotificationRule = 148;
        static final int TRANSACTION_getNotificationRules = 147;
        static final int TRANSACTION_getNumNotificationChannelsForPackage = 52;
        static final int TRANSACTION_getPackageImportance = 20;
        static final int TRANSACTION_getPackagesBypassingDnd = 62;
        static final int TRANSACTION_getPackagesWithAnyChannels = 63;
        static final int TRANSACTION_getPopulatedNotificationChannelGroupForPackage = 39;
        static final int TRANSACTION_getPrivateNotificationsAllowed = 124;
        static final int TRANSACTION_getRecentBlockedNotificationChannelGroupsForPackage = 40;
        static final int TRANSACTION_getRuleInstanceCount = 177;
        static final int TRANSACTION_getSnoozedNotificationsFromListener = 85;
        static final int TRANSACTION_getUnsupportedAdjustmentTypes = 136;
        static final int TRANSACTION_getZenMode = 159;
        static final int TRANSACTION_getZenModeConfig = 160;
        static final int TRANSACTION_hasEnabledNotificationListener = 115;
        static final int TRANSACTION_hasSentValidBubble = 16;
        static final int TRANSACTION_hasSentValidMsg = 12;
        static final int TRANSACTION_hasUserDemotedInvalidMsgApp = 14;
        static final int TRANSACTION_isAdjustmentSupportedForPackage = 141;
        static final int TRANSACTION_isImportanceLocked = 21;
        static final int TRANSACTION_isInCall = 9;
        static final int TRANSACTION_isInInvalidMsgState = 13;
        static final int TRANSACTION_isNotificationAssistantAccessGranted = 104;
        static final int TRANSACTION_isNotificationListenerAccessGranted = 102;
        static final int TRANSACTION_isNotificationListenerAccessGrantedForUser = 103;
        static final int TRANSACTION_isNotificationPolicyAccessGranted = 164;
        static final int TRANSACTION_isNotificationPolicyAccessGrantedForPackage = 167;
        static final int TRANSACTION_isPackagePaused = 64;
        static final int TRANSACTION_isPermissionFixed = 66;
        static final int TRANSACTION_isSystemConditionProviderEnabled = 157;
        static final int TRANSACTION_logHsuNotificationPostStatus = 149;
        static final int TRANSACTION_matchesCallFilter = 155;
        static final int TRANSACTION_migrateNotificationFilter = 128;
        static final int TRANSACTION_notifyConditions = 163;
        static final int TRANSACTION_onlyHasDefaultChannel = 59;
        static final int TRANSACTION_pullStats = 125;
        static final int TRANSACTION_registerCallNotificationEventListener = 130;
        static final int TRANSACTION_registerListener = 74;
        static final int TRANSACTION_removeAutomaticZenRule = 175;
        static final int TRANSACTION_removeAutomaticZenRules = 176;
        static final int TRANSACTION_removeNotificationRule = 146;
        static final int TRANSACTION_requestBindListener = 80;
        static final int TRANSACTION_requestBindProvider = 150;
        static final int TRANSACTION_requestHintsFromListener = 87;
        static final int TRANSACTION_requestInterruptionFilterFromListener = 152;
        static final int TRANSACTION_requestSystemAdjustments = 143;
        static final int TRANSACTION_requestUnbindListener = 81;
        static final int TRANSACTION_requestUnbindListenerComponent = 82;
        static final int TRANSACTION_requestUnbindProvider = 151;
        static final int TRANSACTION_setAdjustmentSupportedForPackage = 142;
        static final int TRANSACTION_setAdjustmentTypeSupportedState = 135;
        static final int TRANSACTION_setAssistantClassificationTypeState = 138;
        static final int TRANSACTION_setAssistantClassificationTypeStateForUser = 139;
        static final int TRANSACTION_setAutomaticZenRuleState = 179;
        static final int TRANSACTION_setBubblesAllowed = 28;
        static final int TRANSACTION_setCanBePromoted = 132;
        static final int TRANSACTION_setHideSilentStatusIcons = 27;
        static final int TRANSACTION_setInterruptionFilter = 154;
        static final int TRANSACTION_setInvalidMsgAppDemoted = 15;
        static final int TRANSACTION_setListenerFilter = 127;
        static final int TRANSACTION_setManualZenRuleDeviceEffects = 180;
        static final int TRANSACTION_setNASMigrationDoneAndResetDefault = 114;
        static final int TRANSACTION_setNotificationAssistantAccessGranted = 106;
        static final int TRANSACTION_setNotificationAssistantAccessGrantedForUser = 108;
        static final int TRANSACTION_setNotificationDelegate = 119;
        static final int TRANSACTION_setNotificationListenerAccessGranted = 105;
        static final int TRANSACTION_setNotificationListenerAccessGrantedForUser = 107;
        static final int TRANSACTION_setNotificationPolicy = 166;
        static final int TRANSACTION_setNotificationPolicyAccessGranted = 168;
        static final int TRANSACTION_setNotificationPolicyAccessGrantedForUser = 169;
        static final int TRANSACTION_setNotificationsEnabledForPackage = 17;
        static final int TRANSACTION_setNotificationsEnabledWithImportanceLockForPackage = 18;
        static final int TRANSACTION_setNotificationsShownFromListener = 83;
        static final int TRANSACTION_setOnNotificationPostedTrimFromListener = 90;
        static final int TRANSACTION_setPrivateNotificationsAllowed = 123;
        static final int TRANSACTION_setShowBadge = 10;
        static final int TRANSACTION_setToastRateLimitingEnabled = 129;
        static final int TRANSACTION_setZenMode = 162;
        static final int TRANSACTION_shouldHideSilentStatusIcons = 26;
        static final int TRANSACTION_silenceNotificationSound = 67;
        static final int TRANSACTION_snoozeNotificationUntilContextFromListener = 78;
        static final int TRANSACTION_snoozeNotificationUntilFromListener = 79;
        static final int TRANSACTION_unlockAllNotificationChannels = 44;
        static final int TRANSACTION_unlockNotificationChannel = 43;
        static final int TRANSACTION_unregisterCallNotificationEventListener = 131;
        static final int TRANSACTION_unregisterListener = 75;
        static final int TRANSACTION_unsnoozeNotificationFromAssistant = 99;
        static final int TRANSACTION_unsnoozeNotificationFromSystemListener = 100;
        static final int TRANSACTION_updateAutomaticZenRule = 174;
        static final int TRANSACTION_updateNotificationChannelForPackage = 42;
        static final int TRANSACTION_updateNotificationChannelFromPrivilegedListener = 93;
        static final int TRANSACTION_updateNotificationChannelGroupForPackage = 41;
        static final int TRANSACTION_updateNotificationRule = 145;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.app.INotificationManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void getActiveNotificationsWithAttributionForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void getActiveNotificationsWithAttribution_enforcePermission() throws java.lang.SecurityException {}
        protected void getHistoricalNotificationsWithAttribution_enforcePermission() throws java.lang.SecurityException {}
        protected void getNotificationHistory_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void logHsuNotificationPostStatus_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void registerCallNotificationEventListener_enforcePermission() throws java.lang.SecurityException {}
        protected void setToastRateLimitingEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterCallNotificationEventListener_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.app.INotificationManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.app.NotificationRule addNotificationRule(int p0, android.app.NotificationRule p1, int p2) throws android.os.RemoteException { return null; }
            public void allowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean appCanBePromoted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void applyAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException {}
            public void applyAdjustmentsFromAssistant(android.service.notification.INotificationListener p0, java.util.List<android.service.notification.Adjustment> p1) throws android.os.RemoteException {}
            public void applyEnqueuedAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException {}
            public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException {}
            public boolean areBubblesAllowed(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean areBubblesEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
            public boolean areChannelsBypassingDnd() throws android.os.RemoteException { return false; }
            public boolean areNotificationsEnabledForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.os.IBinder asBinder() { return null; }
            public boolean canBePromoted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean canNotifyAsPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean canShowBadge(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean canUseFullScreenIntent(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public void cancelAllNotifications(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void cancelNotificationFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void cancelNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
            public void cancelNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void cancelToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void cleanUpCallersAfter(long p0) throws android.os.RemoteException {}
            public void clearData(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void clearRequestedListenerHints(android.service.notification.INotificationListener p0) throws android.os.RemoteException {}
            public void createConversationNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2, java.lang.String p3) throws android.os.RemoteException {}
            public android.app.NotificationChannel createConversationNotificationChannelForPackageFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
            public void createNotificationChannelGroups(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
            public void createNotificationChannels(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
            public void createNotificationChannelsForPackage(java.lang.String p0, int p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException {}
            public void deleteConversationNotificationChannelFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3) throws android.os.RemoteException {}
            public void deleteNotificationChannel(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void deleteNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void deleteNotificationHistoryItem(java.lang.String p0, int p1, long p2) throws android.os.RemoteException {}
            public void disallowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void enqueueNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.app.Notification p4, int p5) throws android.os.RemoteException {}
            public boolean enqueueTextToast(java.lang.String p0, android.os.IBinder p1, java.lang.CharSequence p2, int p3, boolean p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException { return false; }
            public boolean enqueueToast(java.lang.String p0, android.os.IBinder p1, android.app.ITransientNotification p2, int p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
            public void finishToken(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
            public android.service.notification.StatusBarNotification[] getActiveNotificationsWithAttribution(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.service.notification.StatusBarNotification[] getActiveNotificationsWithAttributionForUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.String[] getAdjustmentDeniedPackages(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAllowedAssistantAdjustments(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAllowedAssistantAdjustmentsForUser(int p0) throws android.os.RemoteException { return null; }
            public int[] getAllowedClassificationTypes() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getAllowedNotificationAssistant() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getAllowedNotificationAssistantForUser(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getAutomaticZenRuleState(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public android.content.pm.ParceledListSlice getAutomaticZenRules() throws android.os.RemoteException { return null; }
            public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
            public int getBlockedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int getBubblePreferenceForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException { return null; }
            public android.app.NotificationChannel getConversationNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getConversations(boolean p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getConversationsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getDefaultNotificationAssistant() throws android.os.RemoteException { return null; }
            public android.service.notification.ZenPolicy getDefaultZenPolicy() throws android.os.RemoteException { return null; }
            public int getDeletedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public android.content.ComponentName getEffectsSuppressor() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() throws android.os.RemoteException { return null; }
            public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getEnabledZenPackages() throws android.os.RemoteException { return null; }
            public int getHintsFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
            public int getHintsFromListenerNoToken() throws android.os.RemoteException { return 0; }
            public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.service.notification.StatusBarNotification[] getHistoricalNotificationsWithAttribution(java.lang.String p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getInterruptionFilterFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
            public android.service.notification.NotificationListenerFilter getListenerFilter(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public android.app.NotificationChannel getNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.app.NotificationChannel getNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return null; }
            public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.app.NotificationChannelGroup getNotificationChannelGroupForPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelGroups(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelGroupsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelGroupsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelGroupsWithoutChannels(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannels(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelsBypassingDnd(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
            public java.lang.String getNotificationDelegate(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.app.NotificationHistory getNotificationHistory(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.app.NotificationRule getNotificationRule(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationRules(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException { return null; }
            public int getNumNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getPackageImportance(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public android.content.pm.ParceledListSlice getPackagesBypassingDnd(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPackagesWithAnyChannels(int p0) throws android.os.RemoteException { return null; }
            public android.app.NotificationChannelGroup getPopulatedNotificationChannelGroupForPackage(java.lang.String p0, int p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
            public boolean getPrivateNotificationsAllowed() throws android.os.RemoteException { return false; }
            public android.content.pm.ParceledListSlice getRecentBlockedNotificationChannelGroupsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public android.content.pm.ParceledListSlice getSnoozedNotificationsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getUnsupportedAdjustmentTypes() throws android.os.RemoteException { return null; }
            public int getZenMode() throws android.os.RemoteException { return 0; }
            public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException { return null; }
            public boolean hasEnabledNotificationListener(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasSentValidBubble(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasSentValidMsg(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasUserDemotedInvalidMsgApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isImportanceLocked(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isInCall(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isInInvalidMsgState(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isNotificationAssistantAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isNotificationListenerAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isPackagePaused(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isPermissionFixed(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isSystemConditionProviderEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void logHsuNotificationPostStatus(android.service.notification.StatusBarNotification p0, int p1) throws android.os.RemoteException {}
            public boolean matchesCallFilter(android.os.Bundle p0) throws android.os.RemoteException { return false; }
            public void migrateNotificationFilter(android.service.notification.INotificationListener p0, int p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException {}
            public boolean onlyHasDefaultChannel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public long pullStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException { return 0L; }
            public void registerCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException {}
            public void registerListener(android.service.notification.INotificationListener p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
            public boolean removeAutomaticZenRule(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean removeAutomaticZenRules(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean removeNotificationRule(int p0, int p1) throws android.os.RemoteException { return false; }
            public void requestBindListener(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void requestHintsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public void requestSystemAdjustments(java.util.List<android.service.notification.Adjustment> p0) throws android.os.RemoteException {}
            public void requestUnbindListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException {}
            public void requestUnbindListenerComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException {}
            public void setAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public void setAdjustmentTypeSupportedState(android.service.notification.INotificationListener p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setAssistantClassificationTypeState(int p0, boolean p1) throws android.os.RemoteException {}
            public void setAssistantClassificationTypeStateForUser(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException {}
            public void setBubblesAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void setCanBePromoted(java.lang.String p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public void setHideSilentStatusIcons(boolean p0) throws android.os.RemoteException {}
            public void setInterruptionFilter(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setInvalidMsgAppDemoted(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setListenerFilter(android.content.ComponentName p0, int p1, android.service.notification.NotificationListenerFilter p2) throws android.os.RemoteException {}
            public void setManualZenRuleDeviceEffects(android.service.notification.ZenDeviceEffects p0) throws android.os.RemoteException {}
            public void setNASMigrationDoneAndResetDefault(int p0, boolean p1) throws android.os.RemoteException {}
            public void setNotificationAssistantAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setNotificationAssistantAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationDelegate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationsEnabledForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationsEnabledWithImportanceLockForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationsShownFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public void setPrivateNotificationsAllowed(boolean p0) throws android.os.RemoteException {}
            public void setShowBadge(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setToastRateLimitingEnabled(boolean p0) throws android.os.RemoteException {}
            public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public boolean shouldHideSilentStatusIcons(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void silenceNotificationSound() throws android.os.RemoteException {}
            public void snoozeNotificationUntilContextFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void snoozeNotificationUntilFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public void unlockAllNotificationChannels() throws android.os.RemoteException {}
            public void unlockNotificationChannel(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void unregisterCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException {}
            public void unregisterListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public void unsnoozeNotificationFromAssistant(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unsnoozeNotificationFromSystemListener(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1, boolean p2) throws android.os.RemoteException { return false; }
            public void updateNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2) throws android.os.RemoteException {}
            public void updateNotificationChannelFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, android.app.NotificationChannel p3) throws android.os.RemoteException {}
            public void updateNotificationChannelGroupForPackage(java.lang.String p0, int p1, android.app.NotificationChannelGroup p2) throws android.os.RemoteException {}
            public android.app.NotificationRule updateNotificationRule(int p0, android.app.NotificationRule p1) throws android.os.RemoteException { return null; }
        }
    }
}
