package com.android.internal.telephony;

public interface ITelephony extends android.os.IInterface {
    public void addAttachRestrictionForCarrier(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public android.telephony.ims.RcsContactUceCapability addUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public void bootstrapAuthenticationRequest(int p0, int p1, android.net.Uri p2, android.telephony.gba.UaSecurityProtocolIdentifier p3, boolean p4, android.telephony.IBootstrapAuthenticationCallback p5) throws android.os.RemoteException;
    public void call(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean canChangeDtmfToneLength(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean canConnectTo5GInDsdsMode() throws android.os.RemoteException;
    public void carrierActionReportDefaultNetworkStatus(int p0, boolean p1) throws android.os.RemoteException;
    public void carrierActionResetAll(int p0) throws android.os.RemoteException;
    public void carrierActionSetRadioEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public int changeIccLockPassword(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int checkCarrierPrivilegesForPackage(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int checkCarrierPrivilegesForPackageAnyPhone(java.lang.String p0) throws android.os.RemoteException;
    public boolean clearCarrierImsServiceOverride(int p0) throws android.os.RemoteException;
    public boolean clearDomainSelectionServiceOverride() throws android.os.RemoteException;
    public boolean clearRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException;
    public void clearSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException;
    public android.telephony.ims.RcsContactUceCapability clearUceRegistrationOverrideShell(int p0) throws android.os.RemoteException;
    public void deprovisionSatellite(java.util.List<android.telephony.satellite.SatelliteSubscriberInfo> p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void deprovisionSatelliteService(java.lang.String p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void dial(java.lang.String p0) throws android.os.RemoteException;
    public boolean disableDataConnectivity(java.lang.String p0) throws android.os.RemoteException;
    public void disableIms(int p0) throws android.os.RemoteException;
    public void disableLocationUpdates() throws android.os.RemoteException;
    public void disableVisualVoicemailSmsFilter(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean doesSwitchMultiSimConfigTriggerReboot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean enableDataConnectivity(java.lang.String p0) throws android.os.RemoteException;
    public void enableIms(int p0) throws android.os.RemoteException;
    public void enableLocationUpdates() throws android.os.RemoteException;
    public boolean enableModemForSlot(int p0, boolean p1) throws android.os.RemoteException;
    public void enableVideoCalling(boolean p0) throws android.os.RemoteException;
    public void enableVisualVoicemailSmsFilter(java.lang.String p0, int p1, android.telephony.VisualVoicemailSmsFilterSettings p2) throws android.os.RemoteException;
    public void enqueueSmsPickResult(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public void enrollSimInAutoPinManagement(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public void factoryReset(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.VisualVoicemailSmsFilterSettings getActiveVisualVoicemailSmsFilterSettings(int p0) throws android.os.RemoteException;
    public java.lang.String getAidForAppType(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.CarrierRestrictionRules getAllowedCarriers() throws android.os.RemoteException;
    public int getAllowedNetworkTypesBitmask(int p0) throws android.os.RemoteException;
    public long getAllowedNetworkTypesForReason(int p0, int p1) throws android.os.RemoteException;
    public int[] getAttachRestrictionReasonsForCarrier(int p0) throws android.os.RemoteException;
    public void getAutoManagedPinForSim(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public java.lang.String getBoundGbaService(int p0) throws android.os.RemoteException;
    public java.lang.String getBoundImsServicePackage(int p0, boolean p1, int p2) throws android.os.RemoteException;
    public int getCallComposerStatus(int p0) throws android.os.RemoteException;
    public void getCallForwarding(int p0, int p1, com.android.internal.telephony.ICallForwardingInfoCallback p2) throws android.os.RemoteException;
    public int getCallState() throws android.os.RemoteException;
    public int getCallStateForSubscription(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void getCallWaitingStatus(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public java.lang.String getCapabilityFromEab(java.lang.String p0) throws android.os.RemoteException;
    public int getCardIdForDefaultEuicc(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getCarrierIdFromIdentifier(android.service.carrier.CarrierIdentifier p0) throws android.os.RemoteException;
    public int getCarrierIdFromMccMnc(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public int getCarrierIdListVersion(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCarrierPackageNamesForIntentAndPhone(android.content.Intent p0, int p1) throws android.os.RemoteException;
    public int getCarrierPrivilegeStatus(int p0) throws android.os.RemoteException;
    public int getCarrierPrivilegeStatusForUid(int p0, int p1) throws android.os.RemoteException;
    public void getCarrierRestrictionStatus(com.android.internal.telephony.IIntegerConsumer p0, java.lang.String p1) throws android.os.RemoteException;
    public int[] getCarrierRoamingNtnAvailableServices(int p0) throws android.os.RemoteException;
    public java.lang.String getCarrierServicePackageNameForLogicalSlot(int p0) throws android.os.RemoteException;
    public boolean getCarrierSingleRegistrationEnabled(int p0) throws android.os.RemoteException;
    public java.util.List<android.telephony.CellBroadcastIdRange> getCellBroadcastIdRanges(int p0) throws android.os.RemoteException;
    public android.telephony.CellIdentity getCellLocation(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public com.android.internal.telephony.CellNetworkScanResult getCellNetworkScanResults(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules(int p0) throws android.os.RemoteException;
    public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.lang.String getContactFromEab(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getCurrentPackageName() throws android.os.RemoteException;
    public int getCurrentTtyMode() throws android.os.RemoteException;
    public int getDataActivationState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getDataActivity() throws android.os.RemoteException;
    public int getDataActivityForSubId(int p0) throws android.os.RemoteException;
    public boolean getDataEnabled(int p0) throws android.os.RemoteException;
    public int getDataNetworkType(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getDataNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getDataState() throws android.os.RemoteException;
    public int getDataStateForSubId(int p0) throws android.os.RemoteException;
    public android.content.ComponentName getDefaultRespondViaMessageApplication(int p0, boolean p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getDeviceIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean getDeviceSingleRegistrationEnabled() throws android.os.RemoteException;
    public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean getDeviceUceEnabled() throws android.os.RemoteException;
    public boolean getEmergencyCallbackMode(int p0) throws android.os.RemoteException;
    public int getEmergencyNumberDbVersion(int p0) throws android.os.RemoteException;
    public java.util.Map getEmergencyNumberList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getEmergencyNumberListTestMode() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getEquivalentHomePlmns(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String[] getForbiddenPlmns(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public int getGbaReleaseTime(int p0) throws android.os.RemoteException;
    public int getHalVersion(int p0) throws android.os.RemoteException;
    public java.lang.String getImeiForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) throws android.os.RemoteException;
    public boolean getImsFeatureValidationOverride(int p0) throws android.os.RemoteException;
    public void getImsMmTelFeatureState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void getImsMmTelRegistrationState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void getImsMmTelRegistrationTransportType(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public int getImsProvisioningInt(int p0, int p1) throws android.os.RemoteException;
    public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException;
    public java.lang.String getImsProvisioningString(int p0, int p1) throws android.os.RemoteException;
    public int getImsRegTechnologyForMmTel(int p0) throws android.os.RemoteException;
    public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) throws android.os.RemoteException;
    public android.telephony.CellIdentity getLastKnownCellIdentity(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getLastUcePidfXmlShell(int p0) throws android.os.RemoteException;
    public android.telephony.ims.RcsContactUceCapability getLatestRcsContactUceCapabilityShell(int p0) throws android.os.RemoteException;
    public java.lang.String getLine1AlphaTagForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getLine1NumberForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getManualNetworkSelectionPlmn(int p0) throws android.os.RemoteException;
    public java.lang.String[] getMergedImsisFromGroup(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String[] getMergedSubscriberIds(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getMmsUAProfUrl(int p0) throws android.os.RemoteException;
    public java.lang.String getMmsUserAgent(int p0) throws android.os.RemoteException;
    public java.lang.String getMobileProvisioningUrl() throws android.os.RemoteException;
    public java.lang.String getModemService() throws android.os.RemoteException;
    public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getNetworkCountryIsoForPhone(int p0) throws android.os.RemoteException;
    public int getNetworkSelectionMode(int p0) throws android.os.RemoteException;
    public int getNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getNumberOfModemsWithSimultaneousDataConnections(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPackagesWithCarrierPrivileges(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPackagesWithCarrierPrivilegesForAllPhones() throws android.os.RemoteException;
    public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException;
    public android.telephony.PhoneCapability getPhoneCapability() throws android.os.RemoteException;
    public android.telephony.satellite.PlmnSatelliteConfig getPlmnSatelliteConfig(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getPrimaryImei(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int getRadioAccessFamily(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getRadioHalVersion() throws android.os.RemoteException;
    public java.util.List getRadioPowerOffReasons(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getRadioPowerState(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean getRcsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean getRcsSingleRegistrationTestModeEnabled() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getSatelliteDataOptimizedApps() throws android.os.RemoteException;
    public int getSatelliteDataSupportMode(int p0) throws android.os.RemoteException;
    public int[] getSatelliteDisallowedReasons() throws android.os.RemoteException;
    public java.lang.String getSatelliteEntitlementServerUrl(int p0) throws android.os.RemoteException;
    public int getSatelliteNtnConnectType(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getSatellitePlmnsForCarrier(int p0) throws android.os.RemoteException;
    public android.telephony.ServiceState getServiceStateForSlot(int p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getShaIdFromAllowList(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.telephony.SignalStrength getSignalStrength(int p0) throws android.os.RemoteException;
    public int getSimAutoPinManagementEnrollmentStatus(int p0) throws android.os.RemoteException;
    public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException;
    public int getSimStateForSlotIndex(int p0) throws android.os.RemoteException;
    public void getSlicingConfig(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public java.util.List<android.telephony.UiccSlotMapping> getSlotsMapping(java.lang.String p0) throws android.os.RemoteException;
    public int getSubIdForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getSubscriptionCarrierId(int p0) throws android.os.RemoteException;
    public java.lang.String getSubscriptionCarrierName(int p0) throws android.os.RemoteException;
    public int getSubscriptionSpecificCarrierId(int p0) throws android.os.RemoteException;
    public java.lang.String getSubscriptionSpecificCarrierName(int p0) throws android.os.RemoteException;
    public int[] getSupportedNetworkAlertCategories() throws android.os.RemoteException;
    public java.util.List<android.telephony.RadioAccessSpecifier> getSystemSelectionChannels(int p0) throws android.os.RemoteException;
    public java.util.List<android.telephony.TelephonyHistogram> getTelephonyHistograms() throws android.os.RemoteException;
    public android.content.ComponentName getTestEuiccUiComponent() throws android.os.RemoteException;
    public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException;
    public java.util.List<android.telephony.UiccCardInfo> getUiccCardsInfo(java.lang.String p0) throws android.os.RemoteException;
    public android.telephony.UiccSlotInfo[] getUiccSlotsInfo(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getVisualVoicemailPackageName(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.os.Bundle getVisualVoicemailSettings(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.telephony.VisualVoicemailSmsFilterSettings getVisualVoicemailSmsFilterSettings(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getVoWiFiModeSetting(int p0) throws android.os.RemoteException;
    public int getVoWiFiRoamingModeSetting(int p0) throws android.os.RemoteException;
    public int getVoiceActivationState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getVoiceMessageCountForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getVoiceNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.net.Uri getVoicemailRingtoneUri(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException;
    public boolean handlePinMmi(java.lang.String p0) throws android.os.RemoteException;
    public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void handleUssdRequest(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public boolean hasIccCard() throws android.os.RemoteException;
    public boolean hasIccCardUsingSlotIndex(int p0) throws android.os.RemoteException;
    public boolean iccCloseLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException;
    public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException;
    public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduBasicChannel(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduBasicChannelByPort(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException;
    public java.lang.String iccTransmitApduLogicalChannelByPort(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException;
    public boolean isAdvancedCallingSettingEnabled(int p0) throws android.os.RemoteException;
    public boolean isAospDomainSelectionService() throws android.os.RemoteException;
    public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException;
    public boolean isApplicationOnUicc(int p0, int p1) throws android.os.RemoteException;
    public boolean isAvailable(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isCellularIdentifierDisclosureNotificationsEnabled() throws android.os.RemoteException;
    public boolean isConcurrentVoiceAndDataAllowed(int p0) throws android.os.RemoteException;
    public boolean isCrossSimCallingEnabledByUser(int p0) throws android.os.RemoteException;
    public boolean isDataConnectivityPossible(int p0) throws android.os.RemoteException;
    public boolean isDataEnabled(int p0) throws android.os.RemoteException;
    public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isDataEnabledForReason(int p0, int p1) throws android.os.RemoteException;
    public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException;
    public boolean isDomainSelectionSupported() throws android.os.RemoteException;
    public boolean isEmergencyNumber(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean isHearingAidCompatibilitySupported() throws android.os.RemoteException;
    public boolean isIccLockEnabled(int p0) throws android.os.RemoteException;
    public boolean isImsRegistered(int p0) throws android.os.RemoteException;
    public boolean isInCarrierRoamingNtnMode(int p0) throws android.os.RemoteException;
    public boolean isInEmergencySmsMode() throws android.os.RemoteException;
    public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException;
    public void isMmTelCapabilitySupported(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2, int p3) throws android.os.RemoteException;
    public boolean isMobileDataPolicyEnabled(int p0, int p1) throws android.os.RemoteException;
    public boolean isModemEnabledForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int isMultiSimSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isMvnoMatched(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isNrDualConnectivityEnabled(int p0) throws android.os.RemoteException;
    public boolean isNullCipherAndIntegrityPreferenceEnabled() throws android.os.RemoteException;
    public boolean isNullCipherNotificationsEnabled() throws android.os.RemoteException;
    public boolean isPremiumCapabilityAvailableForPurchase(int p0, int p1) throws android.os.RemoteException;
    public boolean isProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isRadioInterfaceCapabilitySupported(java.lang.String p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean isRadioOn(java.lang.String p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean isRadioOnForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isRadioOnForSubscriberWithFeature(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isRadioOnWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isRcsProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isRcsVolteSingleRegistrationCapable(int p0) throws android.os.RemoteException;
    public boolean isRemovableEsimDefaultEuicc(java.lang.String p0) throws android.os.RemoteException;
    public boolean isRttSupported(int p0) throws android.os.RemoteException;
    public boolean isSatelliteAttachSupported(int p0) throws android.os.RemoteException;
    public boolean isSatelliteEntitlementSupported(int p0) throws android.os.RemoteException;
    public boolean isTetheringApnRequiredForSubscriber(int p0) throws android.os.RemoteException;
    public boolean isTtyModeSupported() throws android.os.RemoteException;
    public boolean isTtyOverVolteEnabled(int p0) throws android.os.RemoteException;
    public boolean isUserDataEnabled(int p0) throws android.os.RemoteException;
    public boolean isVideoCallingEnabled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isVideoTelephonyAvailable(int p0) throws android.os.RemoteException;
    public boolean isVoNrEnabled(int p0) throws android.os.RemoteException;
    public boolean isVoWiFiRoamingSettingEnabled(int p0) throws android.os.RemoteException;
    public boolean isVoWiFiSettingEnabled(int p0) throws android.os.RemoteException;
    public boolean isVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException;
    public boolean isVtSettingEnabled(int p0) throws android.os.RemoteException;
    public boolean isWifiCallingAvailable(int p0) throws android.os.RemoteException;
    public boolean isWorldPhone(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean needMobileRadioShutdown() throws android.os.RemoteException;
    public void notifyEntitlementStatusChanged(int p0, java.util.List<java.lang.String> p1, long p2) throws android.os.RemoteException;
    public void notifyOtaEmergencyNumberDbInstalled() throws android.os.RemoteException;
    public void notifyRcsAutoConfigurationReceived(int p0, byte[] p1, boolean p2) throws android.os.RemoteException;
    public boolean overrideCarrierRoamingNtnEligibilityChanged(boolean p0, boolean p1) throws android.os.RemoteException;
    public boolean overrideConfigDataVersion(boolean p0, int p1) throws android.os.RemoteException;
    public boolean overrideSatelliteEntilementQueryConditions(boolean p0, boolean p1) throws android.os.RemoteException;
    public boolean overrideSatelliteEntilementStatusResponseForCtsTest(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void persistEmergencyCallDiagnosticData(java.lang.String p0, boolean p1, long p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public void pollPendingDatagrams(com.android.internal.telephony.IIntegerConsumer p0) throws android.os.RemoteException;
    public int prepareForUnattendedReboot() throws android.os.RemoteException;
    public void provisionSatellite(java.util.List<android.telephony.satellite.SatelliteSubscriberInfo> p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public android.os.ICancellationSignal provisionSatelliteService(java.lang.String p0, byte[] p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public void purchasePremiumCapability(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2) throws android.os.RemoteException;
    public boolean rebootModem(int p0) throws android.os.RemoteException;
    public void refreshUiccProfile(int p0) throws android.os.RemoteException;
    public void registerFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException;
    public int registerForCapabilitiesChanged(android.telephony.satellite.ISatelliteCapabilitiesCallback p0) throws android.os.RemoteException;
    public int registerForCommunicationAccessStateChanged(int p0, android.telephony.satellite.ISatelliteCommunicationAccessStateCallback p1) throws android.os.RemoteException;
    public int registerForIncomingDatagram(android.telephony.satellite.ISatelliteDatagramCallback p0) throws android.os.RemoteException;
    public void registerForNtnSignalStrengthChanged(android.telephony.satellite.INtnSignalStrengthCallback p0) throws android.os.RemoteException;
    public void registerForSatelliteDisallowedReasonsChanged(android.telephony.satellite.ISatelliteDisallowedReasonsCallback p0) throws android.os.RemoteException;
    public int registerForSatelliteModemStateChanged(android.telephony.satellite.ISatelliteModemStateCallback p0) throws android.os.RemoteException;
    public int registerForSatelliteProvisionStateChanged(android.telephony.satellite.ISatelliteProvisionStateCallback p0) throws android.os.RemoteException;
    public int registerForSatelliteSupportedStateChanged(com.android.internal.telephony.IBooleanConsumer p0) throws android.os.RemoteException;
    public int registerForSelectedNbIotSatelliteSubscriptionChanged(android.telephony.satellite.ISelectedNbIotSatelliteSubscriptionCallback p0) throws android.os.RemoteException;
    public void registerImsEmergencyRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException;
    public void registerImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException;
    public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException;
    public void registerImsStateCallback(int p0, int p1, com.android.internal.telephony.IImsStateCallback p2, java.lang.String p3) throws android.os.RemoteException;
    public void registerMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException;
    public void registerMmTelFeatureCallback(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException;
    public void registerRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException;
    public void removeAttachRestrictionForCarrier(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public int removeContactFromEab(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.ims.RcsContactUceCapability removeUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public boolean removeUceRequestDisallowedStatus(int p0) throws android.os.RemoteException;
    public void requestCellInfoUpdate(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void requestCellInfoUpdateWithWorkSource(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4) throws android.os.RemoteException;
    public void requestEnableSatellite(int p0, android.telephony.satellite.EnableRequestAttributes p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public void requestEnableSatelliteStatus(int p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public void requestEntitlementRefresh(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void requestIsCommunicationAllowedForCurrentLocation(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void requestIsDemoModeEnabled(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void requestIsEmergencyModeEnabled(android.os.ResultReceiver p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void requestIsSatelliteEnabled(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void requestIsSatelliteProvisioned(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void requestIsSatelliteSupported(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public int requestNetworkScan(int p0, boolean p1, android.telephony.NetworkScanRequest p2, android.os.Messenger p3, android.os.IBinder p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException;
    public void requestNtnSignalStrength(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void requestNumberVerification(android.telephony.PhoneNumberRange p0, long p1, com.android.internal.telephony.INumberVerificationCallback p2, java.lang.String p3) throws android.os.RemoteException;
    public void requestPointingUiAppLaunchIntent(android.telephony.satellite.PointingUiAppLaunchIntentAttributes p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public boolean requestRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException;
    public void requestSatelliteAccessConfigurationForCurrentLocation(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void requestSatelliteCapabilities(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void requestSatelliteDisplayName(android.os.ResultReceiver p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void requestSatelliteEnabled(boolean p0, boolean p1, boolean p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException;
    public void requestSatelliteSessionStats(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void requestSatelliteSubscriberProvisionStatus(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void requestSelectedNbIotSatelliteSubscriptionId(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void requestSignalStrengthUpdate(int p0, android.telephony.ISignalStrengthOutcomeReceiver p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void requestTimeForNextSatelliteVisibility(android.os.ResultReceiver p0) throws android.os.RemoteException;
    public void requestUserActivityNotification() throws android.os.RemoteException;
    public void resetIms(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean resetModemConfig(int p0) throws android.os.RemoteException;
    public void resetOtaEmergencyNumberDbFilePath() throws android.os.RemoteException;
    public void sendDatagram(int p0, android.telephony.satellite.SatelliteDatagram p1, boolean p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException;
    public void sendDeviceToDeviceMessage(int p0, int p1) throws android.os.RemoteException;
    public void sendDialerSpecialCode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int sendThermalMitigationRequest(int p0, android.telephony.ThermalMitigationRequest p1, java.lang.String p2) throws android.os.RemoteException;
    public void sendVisualVoicemailSmsForSubscriber(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, java.lang.String p5, android.app.PendingIntent p6) throws android.os.RemoteException;
    public void setActiveDeviceToDeviceTransport(java.lang.String p0) throws android.os.RemoteException;
    public void setAdvancedCallingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public int setAllowedCarriers(android.telephony.CarrierRestrictionRules p0) throws android.os.RemoteException;
    public boolean setAllowedNetworkTypesForReason(int p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean setBoundGbaServiceOverride(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setBoundImsServiceOverride(int p0, int p1, boolean p2, int[] p3, java.lang.String p4) throws android.os.RemoteException;
    public void setCallComposerStatus(int p0, int p1) throws android.os.RemoteException;
    public void setCallForwarding(int p0, android.telephony.CallForwardingInfo p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public void setCallWaitingStatus(int p0, boolean p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public boolean setCapabilitiesRequestTimeout(int p0, long p1) throws android.os.RemoteException;
    public void setCarrierServicePackageOverride(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean setCarrierSingleRegistrationEnabledOverride(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException;
    public void setCellBroadcastIdRanges(int p0, java.util.List<android.telephony.CellBroadcastIdRange> p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public void setCellInfoListRate(int p0, int p1) throws android.os.RemoteException;
    public void setCepEnabled(boolean p0) throws android.os.RemoteException;
    public boolean setCountryCodes(boolean p0, java.util.List<java.lang.String> p1, java.util.Map p2, java.lang.String p3, long p4) throws android.os.RemoteException;
    public void setCrossSimCallingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setCtsMode(boolean p0) throws android.os.RemoteException;
    public void setDataActivationState(int p0, int p1) throws android.os.RemoteException;
    public void setDataEnabledForReason(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException;
    public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setDatagramControllerBooleanConfig(boolean p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean setDatagramControllerTimeoutDuration(boolean p0, int p1, long p2) throws android.os.RemoteException;
    public void setDeviceAlignedWithSatellite(boolean p0) throws android.os.RemoteException;
    public void setDeviceSingleRegistrationEnabledOverride(java.lang.String p0) throws android.os.RemoteException;
    public void setDeviceToDeviceForceEnabled(boolean p0) throws android.os.RemoteException;
    public void setDeviceUceEnabled(boolean p0) throws android.os.RemoteException;
    public boolean setDomainSelectionServiceOverride(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean setEmergencyCallToSatelliteHandoverType(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setEnableCellularIdentifierDisclosureNotifications(boolean p0) throws android.os.RemoteException;
    public int setForbiddenPlmns(int p0, int p1, java.util.List<java.lang.String> p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public boolean setGbaReleaseTimeOverride(int p0, int p1) throws android.os.RemoteException;
    public int setIccLockEnabled(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean setImsFeatureValidationOverride(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int setImsProvisioningInt(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public int setImsProvisioningString(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setImsRegistrationState(boolean p0) throws android.os.RemoteException;
    public boolean setIsSatelliteCommunicationAllowedForCurrentLocationCache(java.lang.String p0) throws android.os.RemoteException;
    public boolean setLine1NumberForDisplayForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean setMaxAllowedSatelliteDataModeForCtsTest(int p0) throws android.os.RemoteException;
    public void setMobileDataPolicyEnabled(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean setModemService(java.lang.String p0) throws android.os.RemoteException;
    public void setMultiSimCarrierRestriction(boolean p0) throws android.os.RemoteException;
    public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException;
    public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException;
    public int setNrDualConnectivityState(int p0, int p1) throws android.os.RemoteException;
    public void setNtnSmsSupported(boolean p0) throws android.os.RemoteException;
    public void setNullCipherAndIntegrityEnabled(boolean p0) throws android.os.RemoteException;
    public void setNullCipherNotificationsEnabled(boolean p0) throws android.os.RemoteException;
    public boolean setOemEnabledSatelliteProvisionStatus(boolean p0, boolean p1) throws android.os.RemoteException;
    public boolean setOperatorBrandOverride(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setRadio(boolean p0) throws android.os.RemoteException;
    public boolean setRadioForSubscriber(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setRadioPower(boolean p0) throws android.os.RemoteException;
    public void setRcsClientConfiguration(int p0, android.telephony.ims.RcsClientConfiguration p1) throws android.os.RemoteException;
    public void setRcsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public void setRcsSingleRegistrationTestModeEnabled(boolean p0) throws android.os.RemoteException;
    public void setRemovableEsimAsDefaultEuicc(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setRoamingOverride(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException;
    public void setRttCapabilitySetting(int p0, boolean p1) throws android.os.RemoteException;
    public boolean setSatelliteAccessAllowedForSubscriptions(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setSatelliteAccessControlOverlayConfigs(boolean p0, boolean p1, java.lang.String p2, long p3, java.util.List<java.lang.String> p4, java.lang.String p5) throws android.os.RemoteException;
    public boolean setSatelliteControllerTimeoutDuration(boolean p0, int p1, long p2) throws android.os.RemoteException;
    public boolean setSatelliteGatewayServicePackageName(java.lang.String p0) throws android.os.RemoteException;
    public boolean setSatelliteIgnoreCellularServiceState(boolean p0) throws android.os.RemoteException;
    public boolean setSatelliteIgnorePlmnListFromStorage(boolean p0) throws android.os.RemoteException;
    public boolean setSatelliteListeningTimeoutDuration(long p0) throws android.os.RemoteException;
    public boolean setSatellitePointingUiClassName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setSatelliteServicePackageName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setSatelliteSubscriberIdListChangedIntentComponent(java.lang.String p0) throws android.os.RemoteException;
    public boolean setShouldSendDatagramToModemInDemoMode(boolean p0) throws android.os.RemoteException;
    public void setSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException;
    public void setSimPowerStateForSlot(int p0, int p1) throws android.os.RemoteException;
    public void setSimPowerStateForSlotWithCallback(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public boolean setSimSlotMapping(java.util.List<android.telephony.UiccSlotMapping> p0) throws android.os.RemoteException;
    public boolean setSupportDisableSatelliteWhileEnableInProgress(boolean p0, boolean p1) throws android.os.RemoteException;
    public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, int p1, com.android.internal.telephony.IBooleanConsumer p2) throws android.os.RemoteException;
    public void setTestEuiccUiComponent(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean setTnScanningSupport(boolean p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public int setVoNrEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void setVoWiFiModeSetting(int p0, int p1) throws android.os.RemoteException;
    public void setVoWiFiNonPersistent(int p0, boolean p1, int p2) throws android.os.RemoteException;
    public void setVoWiFiRoamingModeSetting(int p0, int p1) throws android.os.RemoteException;
    public void setVoWiFiRoamingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void setVoWiFiSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void setVoiceActivationState(int p0, int p1) throws android.os.RemoteException;
    public boolean setVoiceMailNumber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setVoiceServiceStateOverride(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void setVoicemailRingtoneUri(java.lang.String p0, android.telecom.PhoneAccountHandle p1, android.net.Uri p2) throws android.os.RemoteException;
    public void setVoicemailVibrationEnabled(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException;
    public void setVtSettingEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void showSwitchToManagedProfileDialog() throws android.os.RemoteException;
    public void shutdownMobileRadios() throws android.os.RemoteException;
    public void startEmergencyCallbackMode() throws android.os.RemoteException;
    public void startSatelliteTransmissionUpdates(com.android.internal.telephony.IIntegerConsumer p0, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p1) throws android.os.RemoteException;
    public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException;
    public void stopSatelliteTransmissionUpdates(com.android.internal.telephony.IIntegerConsumer p0, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p1) throws android.os.RemoteException;
    public boolean supplyPinForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int[] supplyPinReportResultForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean supplyPukForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int[] supplyPukReportResultForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void switchMultiSimConfig(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean switchSlots(int[] p0) throws android.os.RemoteException;
    public void toggleRadioOnOff() throws android.os.RemoteException;
    public void toggleRadioOnOffForSubscriber(int p0) throws android.os.RemoteException;
    public void triggerRcsReconfiguration(int p0) throws android.os.RemoteException;
    public boolean uncapMaxAllowedSatelliteDataMode() throws android.os.RemoteException;
    public void unenrollSimFromAutoPinManagement(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void unregisterFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException;
    public void unregisterForCapabilitiesChanged(android.telephony.satellite.ISatelliteCapabilitiesCallback p0) throws android.os.RemoteException;
    public void unregisterForCommunicationAccessStateChanged(int p0, android.telephony.satellite.ISatelliteCommunicationAccessStateCallback p1) throws android.os.RemoteException;
    public void unregisterForIncomingDatagram(android.telephony.satellite.ISatelliteDatagramCallback p0) throws android.os.RemoteException;
    public void unregisterForModemStateChanged(android.telephony.satellite.ISatelliteModemStateCallback p0) throws android.os.RemoteException;
    public void unregisterForNtnSignalStrengthChanged(android.telephony.satellite.INtnSignalStrengthCallback p0) throws android.os.RemoteException;
    public void unregisterForSatelliteDisallowedReasonsChanged(android.telephony.satellite.ISatelliteDisallowedReasonsCallback p0) throws android.os.RemoteException;
    public void unregisterForSatelliteProvisionStateChanged(android.telephony.satellite.ISatelliteProvisionStateCallback p0) throws android.os.RemoteException;
    public void unregisterForSatelliteSupportedStateChanged(com.android.internal.telephony.IBooleanConsumer p0) throws android.os.RemoteException;
    public void unregisterForSelectedNbIotSatelliteSubscriptionChanged(android.telephony.satellite.ISelectedNbIotSatelliteSubscriptionCallback p0) throws android.os.RemoteException;
    public void unregisterImsEmergencyRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException;
    public void unregisterImsFeatureCallback(com.android.ims.internal.IImsServiceFeatureCallback p0) throws android.os.RemoteException;
    public void unregisterImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException;
    public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException;
    public void unregisterImsStateCallback(com.android.internal.telephony.IImsStateCallback p0) throws android.os.RemoteException;
    public void unregisterMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException;
    public void unregisterRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException;
    public void updateEmergencyNumberListTestMode(int p0, android.telephony.emergency.EmergencyNumber p1) throws android.os.RemoteException;
    public void updateOtaEmergencyNumberDbFilePath(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public void updateServiceLocation() throws android.os.RemoteException;
    public void updateServiceLocationWithPackageName(java.lang.String p0) throws android.os.RemoteException;
    public void uploadCallComposerPicture(int p0, java.lang.String p1, java.lang.String p2, android.os.ParcelFileDescriptor p3, android.os.ResultReceiver p4) throws android.os.RemoteException;
    public void userActivity() throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.ITelephony {
        public Default() {}
        public void addAttachRestrictionForCarrier(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public android.telephony.ims.RcsContactUceCapability addUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
        public void bootstrapAuthenticationRequest(int p0, int p1, android.net.Uri p2, android.telephony.gba.UaSecurityProtocolIdentifier p3, boolean p4, android.telephony.IBootstrapAuthenticationCallback p5) throws android.os.RemoteException {}
        public void call(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean canChangeDtmfToneLength(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean canConnectTo5GInDsdsMode() throws android.os.RemoteException { return false; }
        public void carrierActionReportDefaultNetworkStatus(int p0, boolean p1) throws android.os.RemoteException {}
        public void carrierActionResetAll(int p0) throws android.os.RemoteException {}
        public void carrierActionSetRadioEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public int changeIccLockPassword(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int checkCarrierPrivilegesForPackage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int checkCarrierPrivilegesForPackageAnyPhone(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public boolean clearCarrierImsServiceOverride(int p0) throws android.os.RemoteException { return false; }
        public boolean clearDomainSelectionServiceOverride() throws android.os.RemoteException { return false; }
        public boolean clearRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException { return false; }
        public void clearSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.telephony.ims.RcsContactUceCapability clearUceRegistrationOverrideShell(int p0) throws android.os.RemoteException { return null; }
        public void deprovisionSatellite(java.util.List<android.telephony.satellite.SatelliteSubscriberInfo> p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void deprovisionSatelliteService(java.lang.String p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void dial(java.lang.String p0) throws android.os.RemoteException {}
        public boolean disableDataConnectivity(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void disableIms(int p0) throws android.os.RemoteException {}
        public void disableLocationUpdates() throws android.os.RemoteException {}
        public void disableVisualVoicemailSmsFilter(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean doesSwitchMultiSimConfigTriggerReboot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean enableDataConnectivity(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void enableIms(int p0) throws android.os.RemoteException {}
        public void enableLocationUpdates() throws android.os.RemoteException {}
        public boolean enableModemForSlot(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public void enableVideoCalling(boolean p0) throws android.os.RemoteException {}
        public void enableVisualVoicemailSmsFilter(java.lang.String p0, int p1, android.telephony.VisualVoicemailSmsFilterSettings p2) throws android.os.RemoteException {}
        public void enqueueSmsPickResult(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public void enrollSimInAutoPinManagement(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public void factoryReset(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.telephony.VisualVoicemailSmsFilterSettings getActiveVisualVoicemailSmsFilterSettings(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getAidForAppType(int p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telephony.CarrierRestrictionRules getAllowedCarriers() throws android.os.RemoteException { return null; }
        public int getAllowedNetworkTypesBitmask(int p0) throws android.os.RemoteException { return 0; }
        public long getAllowedNetworkTypesForReason(int p0, int p1) throws android.os.RemoteException { return 0L; }
        public int[] getAttachRestrictionReasonsForCarrier(int p0) throws android.os.RemoteException { return null; }
        public void getAutoManagedPinForSim(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public java.lang.String getBoundGbaService(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getBoundImsServicePackage(int p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
        public int getCallComposerStatus(int p0) throws android.os.RemoteException { return 0; }
        public void getCallForwarding(int p0, int p1, com.android.internal.telephony.ICallForwardingInfoCallback p2) throws android.os.RemoteException {}
        public int getCallState() throws android.os.RemoteException { return 0; }
        public int getCallStateForSubscription(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void getCallWaitingStatus(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public java.lang.String getCapabilityFromEab(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getCardIdForDefaultEuicc(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getCarrierIdFromIdentifier(android.service.carrier.CarrierIdentifier p0) throws android.os.RemoteException { return 0; }
        public int getCarrierIdFromMccMnc(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getCarrierIdListVersion(int p0) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getCarrierPackageNamesForIntentAndPhone(android.content.Intent p0, int p1) throws android.os.RemoteException { return null; }
        public int getCarrierPrivilegeStatus(int p0) throws android.os.RemoteException { return 0; }
        public int getCarrierPrivilegeStatusForUid(int p0, int p1) throws android.os.RemoteException { return 0; }
        public void getCarrierRestrictionStatus(com.android.internal.telephony.IIntegerConsumer p0, java.lang.String p1) throws android.os.RemoteException {}
        public int[] getCarrierRoamingNtnAvailableServices(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getCarrierServicePackageNameForLogicalSlot(int p0) throws android.os.RemoteException { return null; }
        public boolean getCarrierSingleRegistrationEnabled(int p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.telephony.CellBroadcastIdRange> getCellBroadcastIdRanges(int p0) throws android.os.RemoteException { return null; }
        public android.telephony.CellIdentity getCellLocation(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public com.android.internal.telephony.CellNetworkScanResult getCellNetworkScanResults(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public java.lang.String getContactFromEab(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getCurrentPackageName() throws android.os.RemoteException { return null; }
        public int getCurrentTtyMode() throws android.os.RemoteException { return 0; }
        public int getDataActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getDataActivity() throws android.os.RemoteException { return 0; }
        public int getDataActivityForSubId(int p0) throws android.os.RemoteException { return 0; }
        public boolean getDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public int getDataNetworkType(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getDataNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int getDataState() throws android.os.RemoteException { return 0; }
        public int getDataStateForSubId(int p0) throws android.os.RemoteException { return 0; }
        public android.content.ComponentName getDefaultRespondViaMessageApplication(int p0, boolean p1) throws android.os.RemoteException { return null; }
        @java.lang.Deprecated
        public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getDeviceIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean getDeviceSingleRegistrationEnabled() throws android.os.RemoteException { return false; }
        public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean getDeviceUceEnabled() throws android.os.RemoteException { return false; }
        public boolean getEmergencyCallbackMode(int p0) throws android.os.RemoteException { return false; }
        public int getEmergencyNumberDbVersion(int p0) throws android.os.RemoteException { return 0; }
        public java.util.Map getEmergencyNumberList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getEmergencyNumberListTestMode() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getEquivalentHomePlmns(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String[] getForbiddenPlmns(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public int getGbaReleaseTime(int p0) throws android.os.RemoteException { return 0; }
        public int getHalVersion(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getImeiForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) throws android.os.RemoteException { return null; }
        public boolean getImsFeatureValidationOverride(int p0) throws android.os.RemoteException { return false; }
        public void getImsMmTelFeatureState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void getImsMmTelRegistrationState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void getImsMmTelRegistrationTransportType(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public int getImsProvisioningInt(int p0, int p1) throws android.os.RemoteException { return 0; }
        public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public java.lang.String getImsProvisioningString(int p0, int p1) throws android.os.RemoteException { return null; }
        public int getImsRegTechnologyForMmTel(int p0) throws android.os.RemoteException { return 0; }
        public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.telephony.CellIdentity getLastKnownCellIdentity(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getLastUcePidfXmlShell(int p0) throws android.os.RemoteException { return null; }
        public android.telephony.ims.RcsContactUceCapability getLatestRcsContactUceCapabilityShell(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getLine1AlphaTagForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getLine1NumberForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getManualNetworkSelectionPlmn(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getMergedImsisFromGroup(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String[] getMergedSubscriberIds(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.lang.String getMmsUAProfUrl(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getMmsUserAgent(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getMobileProvisioningUrl() throws android.os.RemoteException { return null; }
        public java.lang.String getModemService() throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getNetworkCountryIsoForPhone(int p0) throws android.os.RemoteException { return null; }
        public int getNetworkSelectionMode(int p0) throws android.os.RemoteException { return 0; }
        public int getNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int getNumberOfModemsWithSimultaneousDataConnections(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getPackagesWithCarrierPrivileges(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPackagesWithCarrierPrivilegesForAllPhones() throws android.os.RemoteException { return null; }
        public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException { return null; }
        public android.telephony.PhoneCapability getPhoneCapability() throws android.os.RemoteException { return null; }
        public android.telephony.satellite.PlmnSatelliteConfig getPlmnSatelliteConfig(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getPrimaryImei(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int getRadioAccessFamily(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getRadioHalVersion() throws android.os.RemoteException { return 0; }
        public java.util.List getRadioPowerOffReasons(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public int getRadioPowerState(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public boolean getRcsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean getRcsSingleRegistrationTestModeEnabled() throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getSatelliteDataOptimizedApps() throws android.os.RemoteException { return null; }
        public int getSatelliteDataSupportMode(int p0) throws android.os.RemoteException { return 0; }
        public int[] getSatelliteDisallowedReasons() throws android.os.RemoteException { return null; }
        public java.lang.String getSatelliteEntitlementServerUrl(int p0) throws android.os.RemoteException { return null; }
        public int getSatelliteNtnConnectType(int p0) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getSatellitePlmnsForCarrier(int p0) throws android.os.RemoteException { return null; }
        public android.telephony.ServiceState getServiceStateForSlot(int p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getShaIdFromAllowList(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.telephony.SignalStrength getSignalStrength(int p0) throws android.os.RemoteException { return null; }
        public int getSimAutoPinManagementEnrollmentStatus(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException { return null; }
        public int getSimStateForSlotIndex(int p0) throws android.os.RemoteException { return 0; }
        public void getSlicingConfig(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public java.util.List<android.telephony.UiccSlotMapping> getSlotsMapping(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getSubIdForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int getSubscriptionCarrierId(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getSubscriptionCarrierName(int p0) throws android.os.RemoteException { return null; }
        public int getSubscriptionSpecificCarrierId(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getSubscriptionSpecificCarrierName(int p0) throws android.os.RemoteException { return null; }
        public int[] getSupportedNetworkAlertCategories() throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.RadioAccessSpecifier> getSystemSelectionChannels(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.TelephonyHistogram> getTelephonyHistograms() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getTestEuiccUiComponent() throws android.os.RemoteException { return null; }
        public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.telephony.UiccCardInfo> getUiccCardsInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.telephony.UiccSlotInfo[] getUiccSlotsInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getVisualVoicemailPackageName(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.os.Bundle getVisualVoicemailSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.telephony.VisualVoicemailSmsFilterSettings getVisualVoicemailSmsFilterSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int getVoWiFiModeSetting(int p0) throws android.os.RemoteException { return 0; }
        public int getVoWiFiRoamingModeSetting(int p0) throws android.os.RemoteException { return 0; }
        public int getVoiceActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getVoiceMessageCountForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int getVoiceNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public android.net.Uri getVoicemailRingtoneUri(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return null; }
        public boolean handlePinMmi(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void handleUssdRequest(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public boolean hasIccCard() throws android.os.RemoteException { return false; }
        public boolean hasIccCardUsingSlotIndex(int p0) throws android.os.RemoteException { return false; }
        public boolean iccCloseLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException { return false; }
        public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException { return null; }
        public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException { return null; }
        public java.lang.String iccTransmitApduBasicChannel(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
        public java.lang.String iccTransmitApduBasicChannelByPort(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException { return null; }
        public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
        public java.lang.String iccTransmitApduLogicalChannelByPort(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException { return null; }
        public boolean isAdvancedCallingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isAospDomainSelectionService() throws android.os.RemoteException { return false; }
        public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isApplicationOnUicc(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isAvailable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isCellularIdentifierDisclosureNotificationsEnabled() throws android.os.RemoteException { return false; }
        public boolean isConcurrentVoiceAndDataAllowed(int p0) throws android.os.RemoteException { return false; }
        public boolean isCrossSimCallingEnabledByUser(int p0) throws android.os.RemoteException { return false; }
        public boolean isDataConnectivityPossible(int p0) throws android.os.RemoteException { return false; }
        public boolean isDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isDataEnabledForReason(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isDomainSelectionSupported() throws android.os.RemoteException { return false; }
        public boolean isEmergencyNumber(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean isHearingAidCompatibilitySupported() throws android.os.RemoteException { return false; }
        public boolean isIccLockEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isImsRegistered(int p0) throws android.os.RemoteException { return false; }
        public boolean isInCarrierRoamingNtnMode(int p0) throws android.os.RemoteException { return false; }
        public boolean isInEmergencySmsMode() throws android.os.RemoteException { return false; }
        public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException { return false; }
        public void isMmTelCapabilitySupported(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2, int p3) throws android.os.RemoteException {}
        public boolean isMobileDataPolicyEnabled(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isModemEnabledForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public int isMultiSimSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public boolean isMvnoMatched(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isNrDualConnectivityEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isNullCipherAndIntegrityPreferenceEnabled() throws android.os.RemoteException { return false; }
        public boolean isNullCipherNotificationsEnabled() throws android.os.RemoteException { return false; }
        public boolean isPremiumCapabilityAvailableForPurchase(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isRadioInterfaceCapabilitySupported(java.lang.String p0) throws android.os.RemoteException { return false; }
        @java.lang.Deprecated
        public boolean isRadioOn(java.lang.String p0) throws android.os.RemoteException { return false; }
        @java.lang.Deprecated
        public boolean isRadioOnForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isRadioOnForSubscriberWithFeature(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isRadioOnWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isRcsProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isRcsVolteSingleRegistrationCapable(int p0) throws android.os.RemoteException { return false; }
        public boolean isRemovableEsimDefaultEuicc(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isRttSupported(int p0) throws android.os.RemoteException { return false; }
        public boolean isSatelliteAttachSupported(int p0) throws android.os.RemoteException { return false; }
        public boolean isSatelliteEntitlementSupported(int p0) throws android.os.RemoteException { return false; }
        public boolean isTetheringApnRequiredForSubscriber(int p0) throws android.os.RemoteException { return false; }
        public boolean isTtyModeSupported() throws android.os.RemoteException { return false; }
        public boolean isTtyOverVolteEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserDataEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isVideoCallingEnabled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isVideoTelephonyAvailable(int p0) throws android.os.RemoteException { return false; }
        public boolean isVoNrEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isVoWiFiRoamingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isVoWiFiSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return false; }
        public boolean isVtSettingEnabled(int p0) throws android.os.RemoteException { return false; }
        public boolean isWifiCallingAvailable(int p0) throws android.os.RemoteException { return false; }
        public boolean isWorldPhone(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean needMobileRadioShutdown() throws android.os.RemoteException { return false; }
        public void notifyEntitlementStatusChanged(int p0, java.util.List<java.lang.String> p1, long p2) throws android.os.RemoteException {}
        public void notifyOtaEmergencyNumberDbInstalled() throws android.os.RemoteException {}
        public void notifyRcsAutoConfigurationReceived(int p0, byte[] p1, boolean p2) throws android.os.RemoteException {}
        public boolean overrideCarrierRoamingNtnEligibilityChanged(boolean p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean overrideConfigDataVersion(boolean p0, int p1) throws android.os.RemoteException { return false; }
        public boolean overrideSatelliteEntilementQueryConditions(boolean p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean overrideSatelliteEntilementStatusResponseForCtsTest(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public void persistEmergencyCallDiagnosticData(java.lang.String p0, boolean p1, long p2, boolean p3, boolean p4) throws android.os.RemoteException {}
        public void pollPendingDatagrams(com.android.internal.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
        public int prepareForUnattendedReboot() throws android.os.RemoteException { return 0; }
        public void provisionSatellite(java.util.List<android.telephony.satellite.SatelliteSubscriberInfo> p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public android.os.ICancellationSignal provisionSatelliteService(java.lang.String p0, byte[] p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException { return null; }
        public void purchasePremiumCapability(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2) throws android.os.RemoteException {}
        public boolean rebootModem(int p0) throws android.os.RemoteException { return false; }
        public void refreshUiccProfile(int p0) throws android.os.RemoteException {}
        public void registerFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException {}
        public int registerForCapabilitiesChanged(android.telephony.satellite.ISatelliteCapabilitiesCallback p0) throws android.os.RemoteException { return 0; }
        public int registerForCommunicationAccessStateChanged(int p0, android.telephony.satellite.ISatelliteCommunicationAccessStateCallback p1) throws android.os.RemoteException { return 0; }
        public int registerForIncomingDatagram(android.telephony.satellite.ISatelliteDatagramCallback p0) throws android.os.RemoteException { return 0; }
        public void registerForNtnSignalStrengthChanged(android.telephony.satellite.INtnSignalStrengthCallback p0) throws android.os.RemoteException {}
        public void registerForSatelliteDisallowedReasonsChanged(android.telephony.satellite.ISatelliteDisallowedReasonsCallback p0) throws android.os.RemoteException {}
        public int registerForSatelliteModemStateChanged(android.telephony.satellite.ISatelliteModemStateCallback p0) throws android.os.RemoteException { return 0; }
        public int registerForSatelliteProvisionStateChanged(android.telephony.satellite.ISatelliteProvisionStateCallback p0) throws android.os.RemoteException { return 0; }
        public int registerForSatelliteSupportedStateChanged(com.android.internal.telephony.IBooleanConsumer p0) throws android.os.RemoteException { return 0; }
        public int registerForSelectedNbIotSatelliteSubscriptionChanged(android.telephony.satellite.ISelectedNbIotSatelliteSubscriptionCallback p0) throws android.os.RemoteException { return 0; }
        public void registerImsEmergencyRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
        public void registerImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
        public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
        public void registerImsStateCallback(int p0, int p1, com.android.internal.telephony.IImsStateCallback p2, java.lang.String p3) throws android.os.RemoteException {}
        public void registerMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public void registerMmTelFeatureCallback(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException {}
        public void registerRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException {}
        public void removeAttachRestrictionForCarrier(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public int removeContactFromEab(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public android.telephony.ims.RcsContactUceCapability removeUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
        public boolean removeUceRequestDisallowedStatus(int p0) throws android.os.RemoteException { return false; }
        public void requestCellInfoUpdate(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void requestCellInfoUpdateWithWorkSource(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4) throws android.os.RemoteException {}
        public void requestEnableSatellite(int p0, android.telephony.satellite.EnableRequestAttributes p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public void requestEnableSatelliteStatus(int p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public void requestEntitlementRefresh(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void requestIsCommunicationAllowedForCurrentLocation(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void requestIsDemoModeEnabled(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void requestIsEmergencyModeEnabled(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        @java.lang.Deprecated
        public void requestIsSatelliteEnabled(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void requestIsSatelliteProvisioned(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void requestIsSatelliteSupported(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public int requestNetworkScan(int p0, boolean p1, android.telephony.NetworkScanRequest p2, android.os.Messenger p3, android.os.IBinder p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException { return 0; }
        public void requestNtnSignalStrength(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void requestNumberVerification(android.telephony.PhoneNumberRange p0, long p1, com.android.internal.telephony.INumberVerificationCallback p2, java.lang.String p3) throws android.os.RemoteException {}
        public void requestPointingUiAppLaunchIntent(android.telephony.satellite.PointingUiAppLaunchIntentAttributes p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public boolean requestRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException { return false; }
        public void requestSatelliteAccessConfigurationForCurrentLocation(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void requestSatelliteCapabilities(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void requestSatelliteDisplayName(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        @java.lang.Deprecated
        public void requestSatelliteEnabled(boolean p0, boolean p1, boolean p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException {}
        public void requestSatelliteSessionStats(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void requestSatelliteSubscriberProvisionStatus(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void requestSelectedNbIotSatelliteSubscriptionId(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void requestSignalStrengthUpdate(int p0, android.telephony.ISignalStrengthOutcomeReceiver p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void requestTimeForNextSatelliteVisibility(android.os.ResultReceiver p0) throws android.os.RemoteException {}
        public void requestUserActivityNotification() throws android.os.RemoteException {}
        public void resetIms(int p0) throws android.os.RemoteException {}
        @java.lang.Deprecated
        public boolean resetModemConfig(int p0) throws android.os.RemoteException { return false; }
        public void resetOtaEmergencyNumberDbFilePath() throws android.os.RemoteException {}
        public void sendDatagram(int p0, android.telephony.satellite.SatelliteDatagram p1, boolean p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException {}
        public void sendDeviceToDeviceMessage(int p0, int p1) throws android.os.RemoteException {}
        public void sendDialerSpecialCode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int sendThermalMitigationRequest(int p0, android.telephony.ThermalMitigationRequest p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void sendVisualVoicemailSmsForSubscriber(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, java.lang.String p5, android.app.PendingIntent p6) throws android.os.RemoteException {}
        public void setActiveDeviceToDeviceTransport(java.lang.String p0) throws android.os.RemoteException {}
        public void setAdvancedCallingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public int setAllowedCarriers(android.telephony.CarrierRestrictionRules p0) throws android.os.RemoteException { return 0; }
        public boolean setAllowedNetworkTypesForReason(int p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public boolean setBoundGbaServiceOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean setBoundImsServiceOverride(int p0, int p1, boolean p2, int[] p3, java.lang.String p4) throws android.os.RemoteException { return false; }
        public void setCallComposerStatus(int p0, int p1) throws android.os.RemoteException {}
        public void setCallForwarding(int p0, android.telephony.CallForwardingInfo p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public void setCallWaitingStatus(int p0, boolean p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public boolean setCapabilitiesRequestTimeout(int p0, long p1) throws android.os.RemoteException { return false; }
        public void setCarrierServicePackageOverride(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public boolean setCarrierSingleRegistrationEnabledOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException {}
        public void setCellBroadcastIdRanges(int p0, java.util.List<android.telephony.CellBroadcastIdRange> p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public void setCellInfoListRate(int p0, int p1) throws android.os.RemoteException {}
        public void setCepEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean setCountryCodes(boolean p0, java.util.List<java.lang.String> p1, java.util.Map p2, java.lang.String p3, long p4) throws android.os.RemoteException { return false; }
        public void setCrossSimCallingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setCtsMode(boolean p0) throws android.os.RemoteException { return false; }
        public void setDataActivationState(int p0, int p1) throws android.os.RemoteException {}
        public void setDataEnabledForReason(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setDatagramControllerBooleanConfig(boolean p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean setDatagramControllerTimeoutDuration(boolean p0, int p1, long p2) throws android.os.RemoteException { return false; }
        public void setDeviceAlignedWithSatellite(boolean p0) throws android.os.RemoteException {}
        public void setDeviceSingleRegistrationEnabledOverride(java.lang.String p0) throws android.os.RemoteException {}
        public void setDeviceToDeviceForceEnabled(boolean p0) throws android.os.RemoteException {}
        public void setDeviceUceEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean setDomainSelectionServiceOverride(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean setEmergencyCallToSatelliteHandoverType(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void setEnableCellularIdentifierDisclosureNotifications(boolean p0) throws android.os.RemoteException {}
        public int setForbiddenPlmns(int p0, int p1, java.util.List<java.lang.String> p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public boolean setGbaReleaseTimeOverride(int p0, int p1) throws android.os.RemoteException { return false; }
        public int setIccLockEnabled(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public boolean setImsFeatureValidationOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int setImsProvisioningInt(int p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public int setImsProvisioningString(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void setImsRegistrationState(boolean p0) throws android.os.RemoteException {}
        public boolean setIsSatelliteCommunicationAllowedForCurrentLocationCache(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean setLine1NumberForDisplayForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean setMaxAllowedSatelliteDataModeForCtsTest(int p0) throws android.os.RemoteException { return false; }
        public void setMobileDataPolicyEnabled(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean setModemService(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setMultiSimCarrierRestriction(boolean p0) throws android.os.RemoteException {}
        public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException {}
        public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException { return false; }
        public int setNrDualConnectivityState(int p0, int p1) throws android.os.RemoteException { return 0; }
        public void setNtnSmsSupported(boolean p0) throws android.os.RemoteException {}
        public void setNullCipherAndIntegrityEnabled(boolean p0) throws android.os.RemoteException {}
        public void setNullCipherNotificationsEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean setOemEnabledSatelliteProvisionStatus(boolean p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setOperatorBrandOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean setRadio(boolean p0) throws android.os.RemoteException { return false; }
        public boolean setRadioForSubscriber(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setRadioPower(boolean p0) throws android.os.RemoteException { return false; }
        public void setRcsClientConfiguration(int p0, android.telephony.ims.RcsClientConfiguration p1) throws android.os.RemoteException {}
        public void setRcsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void setRcsSingleRegistrationTestModeEnabled(boolean p0) throws android.os.RemoteException {}
        public void setRemovableEsimAsDefaultEuicc(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean setRoamingOverride(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException { return false; }
        public void setRttCapabilitySetting(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean setSatelliteAccessAllowedForSubscriptions(boolean p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean setSatelliteAccessControlOverlayConfigs(boolean p0, boolean p1, java.lang.String p2, long p3, java.util.List<java.lang.String> p4, java.lang.String p5) throws android.os.RemoteException { return false; }
        public boolean setSatelliteControllerTimeoutDuration(boolean p0, int p1, long p2) throws android.os.RemoteException { return false; }
        public boolean setSatelliteGatewayServicePackageName(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean setSatelliteIgnoreCellularServiceState(boolean p0) throws android.os.RemoteException { return false; }
        public boolean setSatelliteIgnorePlmnListFromStorage(boolean p0) throws android.os.RemoteException { return false; }
        public boolean setSatelliteListeningTimeoutDuration(long p0) throws android.os.RemoteException { return false; }
        public boolean setSatellitePointingUiClassName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean setSatelliteServicePackageName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean setSatelliteSubscriberIdListChangedIntentComponent(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean setShouldSendDatagramToModemInDemoMode(boolean p0) throws android.os.RemoteException { return false; }
        public void setSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setSimPowerStateForSlot(int p0, int p1) throws android.os.RemoteException {}
        public void setSimPowerStateForSlotWithCallback(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public boolean setSimSlotMapping(java.util.List<android.telephony.UiccSlotMapping> p0) throws android.os.RemoteException { return false; }
        public boolean setSupportDisableSatelliteWhileEnableInProgress(boolean p0, boolean p1) throws android.os.RemoteException { return false; }
        public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, int p1, com.android.internal.telephony.IBooleanConsumer p2) throws android.os.RemoteException {}
        public void setTestEuiccUiComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
        public boolean setTnScanningSupport(boolean p0, boolean p1, boolean p2) throws android.os.RemoteException { return false; }
        public int setVoNrEnabled(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public void setVoWiFiModeSetting(int p0, int p1) throws android.os.RemoteException {}
        public void setVoWiFiNonPersistent(int p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void setVoWiFiRoamingModeSetting(int p0, int p1) throws android.os.RemoteException {}
        public void setVoWiFiRoamingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void setVoWiFiSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void setVoiceActivationState(int p0, int p1) throws android.os.RemoteException {}
        public boolean setVoiceMailNumber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setVoiceServiceStateOverride(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setVoicemailRingtoneUri(java.lang.String p0, android.telecom.PhoneAccountHandle p1, android.net.Uri p2) throws android.os.RemoteException {}
        public void setVoicemailVibrationEnabled(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException {}
        public void setVtSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void showSwitchToManagedProfileDialog() throws android.os.RemoteException {}
        public void shutdownMobileRadios() throws android.os.RemoteException {}
        public void startEmergencyCallbackMode() throws android.os.RemoteException {}
        public void startSatelliteTransmissionUpdates(com.android.internal.telephony.IIntegerConsumer p0, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p1) throws android.os.RemoteException {}
        public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException {}
        public void stopSatelliteTransmissionUpdates(com.android.internal.telephony.IIntegerConsumer p0, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p1) throws android.os.RemoteException {}
        public boolean supplyPinForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int[] supplyPinReportResultForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean supplyPukForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public int[] supplyPukReportResultForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void switchMultiSimConfig(int p0) throws android.os.RemoteException {}
        @java.lang.Deprecated
        public boolean switchSlots(int[] p0) throws android.os.RemoteException { return false; }
        public void toggleRadioOnOff() throws android.os.RemoteException {}
        public void toggleRadioOnOffForSubscriber(int p0) throws android.os.RemoteException {}
        public void triggerRcsReconfiguration(int p0) throws android.os.RemoteException {}
        public boolean uncapMaxAllowedSatelliteDataMode() throws android.os.RemoteException { return false; }
        public void unenrollSimFromAutoPinManagement(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void unregisterFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException {}
        public void unregisterForCapabilitiesChanged(android.telephony.satellite.ISatelliteCapabilitiesCallback p0) throws android.os.RemoteException {}
        public void unregisterForCommunicationAccessStateChanged(int p0, android.telephony.satellite.ISatelliteCommunicationAccessStateCallback p1) throws android.os.RemoteException {}
        public void unregisterForIncomingDatagram(android.telephony.satellite.ISatelliteDatagramCallback p0) throws android.os.RemoteException {}
        public void unregisterForModemStateChanged(android.telephony.satellite.ISatelliteModemStateCallback p0) throws android.os.RemoteException {}
        public void unregisterForNtnSignalStrengthChanged(android.telephony.satellite.INtnSignalStrengthCallback p0) throws android.os.RemoteException {}
        public void unregisterForSatelliteDisallowedReasonsChanged(android.telephony.satellite.ISatelliteDisallowedReasonsCallback p0) throws android.os.RemoteException {}
        public void unregisterForSatelliteProvisionStateChanged(android.telephony.satellite.ISatelliteProvisionStateCallback p0) throws android.os.RemoteException {}
        public void unregisterForSatelliteSupportedStateChanged(com.android.internal.telephony.IBooleanConsumer p0) throws android.os.RemoteException {}
        public void unregisterForSelectedNbIotSatelliteSubscriptionChanged(android.telephony.satellite.ISelectedNbIotSatelliteSubscriptionCallback p0) throws android.os.RemoteException {}
        public void unregisterImsEmergencyRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
        public void unregisterImsFeatureCallback(com.android.ims.internal.IImsServiceFeatureCallback p0) throws android.os.RemoteException {}
        public void unregisterImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
        public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
        public void unregisterImsStateCallback(com.android.internal.telephony.IImsStateCallback p0) throws android.os.RemoteException {}
        public void unregisterMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
        public void unregisterRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException {}
        public void updateEmergencyNumberListTestMode(int p0, android.telephony.emergency.EmergencyNumber p1) throws android.os.RemoteException {}
        public void updateOtaEmergencyNumberDbFilePath(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void updateServiceLocation() throws android.os.RemoteException {}
        public void updateServiceLocationWithPackageName(java.lang.String p0) throws android.os.RemoteException {}
        public void uploadCallComposerPicture(int p0, java.lang.String p1, java.lang.String p2, android.os.ParcelFileDescriptor p3, android.os.ResultReceiver p4) throws android.os.RemoteException {}
        public void userActivity() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ITelephony {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ITelephony";
        static final int TRANSACTION_addAttachRestrictionForCarrier = 386;
        static final int TRANSACTION_addUceRegistrationOverrideShell = 303;
        static final int TRANSACTION_bootstrapAuthenticationRequest = 276;
        static final int TRANSACTION_call = 2;
        static final int TRANSACTION_canChangeDtmfToneLength = 121;
        static final int TRANSACTION_canConnectTo5GInDsdsMode = 268;
        static final int TRANSACTION_carrierActionReportDefaultNetworkStatus = 159;
        static final int TRANSACTION_carrierActionResetAll = 160;
        static final int TRANSACTION_carrierActionSetRadioEnabled = 158;
        static final int TRANSACTION_changeIccLockPassword = 264;
        static final int TRANSACTION_checkCarrierPrivilegesForPackage = 105;
        static final int TRANSACTION_checkCarrierPrivilegesForPackageAnyPhone = 106;
        static final int TRANSACTION_clearCarrierImsServiceOverride = 85;
        static final int TRANSACTION_clearDomainSelectionServiceOverride = 396;
        static final int TRANSACTION_clearRadioPowerOffForReason = 22;
        static final int TRANSACTION_clearSignalStrengthUpdateRequest = 311;
        static final int TRANSACTION_clearUceRegistrationOverrideShell = 305;
        static final int TRANSACTION_deprovisionSatellite = 422;
        static final int TRANSACTION_deprovisionSatelliteService = 348;
        static final int TRANSACTION_dial = 1;
        static final int TRANSACTION_disableDataConnectivity = 29;
        static final int TRANSACTION_disableIms = 78;
        static final int TRANSACTION_disableLocationUpdates = 27;
        static final int TRANSACTION_disableVisualVoicemailSmsFilter = 50;
        static final int TRANSACTION_doesSwitchMultiSimConfigTriggerReboot = 242;
        static final int TRANSACTION_enableDataConnectivity = 28;
        static final int TRANSACTION_enableIms = 77;
        static final int TRANSACTION_enableLocationUpdates = 26;
        static final int TRANSACTION_enableModemForSlot = 238;
        static final int TRANSACTION_enableVideoCalling = 119;
        static final int TRANSACTION_enableVisualVoicemailSmsFilter = 49;
        static final int TRANSACTION_enqueueSmsPickResult = 254;
        static final int TRANSACTION_enrollSimInAutoPinManagement = 431;
        static final int TRANSACTION_factoryReset = 139;
        static final int TRANSACTION_getActiveVisualVoicemailSmsFilterSettings = 52;
        static final int TRANSACTION_getAidForAppType = 149;
        static final int TRANSACTION_getAllCellInfo = 61;
        static final int TRANSACTION_getAllowedCarriers = 152;
        static final int TRANSACTION_getAllowedNetworkTypesBitmask = 75;
        static final int TRANSACTION_getAllowedNetworkTypesForReason = 93;
        static final int TRANSACTION_getAttachRestrictionReasonsForCarrier = 388;
        static final int TRANSACTION_getAutoManagedPinForSim = 433;
        static final int TRANSACTION_getBoundGbaService = 278;
        static final int TRANSACTION_getBoundImsServicePackage = 86;
        static final int TRANSACTION_getCallComposerStatus = 8;
        static final int TRANSACTION_getCallForwarding = 161;
        static final int TRANSACTION_getCallState = 34;
        static final int TRANSACTION_getCallStateForSubscription = 35;
        static final int TRANSACTION_getCallWaitingStatus = 163;
        static final int TRANSACTION_getCapabilityFromEab = 300;
        static final int TRANSACTION_getCardIdForDefaultEuicc = 173;
        static final int TRANSACTION_getCarrierIdFromIdentifier = 424;
        static final int TRANSACTION_getCarrierIdFromMccMnc = 157;
        static final int TRANSACTION_getCarrierIdListVersion = 182;
        static final int TRANSACTION_getCarrierPackageNamesForIntentAndPhone = 107;
        static final int TRANSACTION_getCarrierPrivilegeStatus = 103;
        static final int TRANSACTION_getCarrierPrivilegeStatusForUid = 104;
        static final int TRANSACTION_getCarrierRestrictionStatus = 336;
        static final int TRANSACTION_getCarrierRoamingNtnAvailableServices = 435;
        static final int TRANSACTION_getCarrierServicePackageNameForLogicalSlot = 325;
        static final int TRANSACTION_getCarrierSingleRegistrationEnabled = 294;
        static final int TRANSACTION_getCellBroadcastIdRanges = 333;
        static final int TRANSACTION_getCellLocation = 31;
        static final int TRANSACTION_getCellNetworkScanResults = 89;
        static final int TRANSACTION_getCertsFromCarrierPrivilegeAccessRules = 218;
        static final int TRANSACTION_getClientRequestStats = 165;
        static final int TRANSACTION_getContactFromEab = 299;
        static final int TRANSACTION_getCurrentPackageName = 246;
        static final int TRANSACTION_getCurrentTtyMode = 124;
        static final int TRANSACTION_getDataActivationState = 44;
        static final int TRANSACTION_getDataActivity = 36;
        static final int TRANSACTION_getDataActivityForSubId = 37;
        static final int TRANSACTION_getDataEnabled = 95;
        static final int TRANSACTION_getDataNetworkType = 56;
        static final int TRANSACTION_getDataNetworkTypeForSubscriber = 57;
        static final int TRANSACTION_getDataState = 38;
        static final int TRANSACTION_getDataStateForSubId = 39;
        static final int TRANSACTION_getDefaultRespondViaMessageApplication = 328;
        static final int TRANSACTION_getDeviceId = 131;
        static final int TRANSACTION_getDeviceIdWithFeature = 132;
        static final int TRANSACTION_getDeviceSingleRegistrationEnabled = 289;
        static final int TRANSACTION_getDeviceSoftwareVersionForSlot = 136;
        static final int TRANSACTION_getDeviceUceEnabled = 301;
        static final int TRANSACTION_getEmergencyCallbackMode = 170;
        static final int TRANSACTION_getEmergencyNumberDbVersion = 234;
        static final int TRANSACTION_getEmergencyNumberList = 216;
        static final int TRANSACTION_getEmergencyNumberListTestMode = 233;
        static final int TRANSACTION_getEquivalentHomePlmns = 269;
        static final int TRANSACTION_getForbiddenPlmns = 168;
        static final int TRANSACTION_getGbaReleaseTime = 280;
        static final int TRANSACTION_getHalVersion = 245;
        static final int TRANSACTION_getImeiForSlot = 133;
        static final int TRANSACTION_getImsConfig = 83;
        static final int TRANSACTION_getImsFeatureValidationOverride = 296;
        static final int TRANSACTION_getImsMmTelFeatureState = 87;
        static final int TRANSACTION_getImsMmTelRegistrationState = 192;
        static final int TRANSACTION_getImsMmTelRegistrationTransportType = 193;
        static final int TRANSACTION_getImsProvisioningInt = 227;
        static final int TRANSACTION_getImsProvisioningStatusForCapability = 224;
        static final int TRANSACTION_getImsProvisioningString = 228;
        static final int TRANSACTION_getImsRegTechnologyForMmTel = 130;
        static final int TRANSACTION_getImsRegistration = 82;
        static final int TRANSACTION_getLastKnownCellIdentity = 319;
        static final int TRANSACTION_getLastUcePidfXmlShell = 307;
        static final int TRANSACTION_getLatestRcsContactUceCapabilityShell = 306;
        static final int TRANSACTION_getLine1AlphaTagForDisplay = 110;
        static final int TRANSACTION_getLine1NumberForDisplay = 109;
        static final int TRANSACTION_getManualNetworkSelectionPlmn = 267;
        static final int TRANSACTION_getMergedImsisFromGroup = 112;
        static final int TRANSACTION_getMergedSubscriberIds = 111;
        static final int TRANSACTION_getMmsUAProfUrl = 257;
        static final int TRANSACTION_getMmsUserAgent = 256;
        static final int TRANSACTION_getMobileProvisioningUrl = 297;
        static final int TRANSACTION_getModemService = 321;
        static final int TRANSACTION_getNeighboringCellInfo = 33;
        static final int TRANSACTION_getNetworkCountryIsoForPhone = 32;
        static final int TRANSACTION_getNetworkSelectionMode = 185;
        static final int TRANSACTION_getNetworkTypeForSubscriber = 55;
        static final int TRANSACTION_getNumberOfModemsWithSimultaneousDataConnections = 184;
        static final int TRANSACTION_getPackagesWithCarrierPrivileges = 147;
        static final int TRANSACTION_getPackagesWithCarrierPrivilegesForAllPhones = 148;
        static final int TRANSACTION_getPhoneAccountHandleForSubscriptionId = 138;
        static final int TRANSACTION_getPhoneCapability = 312;
        static final int TRANSACTION_getPlmnSatelliteConfig = 428;
        static final int TRANSACTION_getPrimaryImei = 134;
        static final int TRANSACTION_getRadioAccessFamily = 117;
        static final int TRANSACTION_getRadioHalVersion = 244;
        static final int TRANSACTION_getRadioPowerOffReasons = 23;
        static final int TRANSACTION_getRadioPowerState = 187;
        static final int TRANSACTION_getRcsProvisioningStatusForCapability = 225;
        static final int TRANSACTION_getRcsSingleRegistrationTestModeEnabled = 287;
        static final int TRANSACTION_getSatelliteDataOptimizedApps = 425;
        static final int TRANSACTION_getSatelliteDataSupportMode = 426;
        static final int TRANSACTION_getSatelliteDisallowedReasons = 358;
        static final int TRANSACTION_getSatelliteEntitlementServerUrl = 439;
        static final int TRANSACTION_getSatelliteNtnConnectType = 440;
        static final int TRANSACTION_getSatellitePlmnsForCarrier = 403;
        static final int TRANSACTION_getServiceStateForSlot = 142;
        static final int TRANSACTION_getShaIdFromAllowList = 385;
        static final int TRANSACTION_getSignalStrength = 172;
        static final int TRANSACTION_getSimAutoPinManagementEnrollmentStatus = 430;
        static final int TRANSACTION_getSimLocaleForSubscriber = 140;
        static final int TRANSACTION_getSimStateForSlotIndex = 329;
        static final int TRANSACTION_getSlicingConfig = 314;
        static final int TRANSACTION_getSlotsMapping = 243;
        static final int TRANSACTION_getSubIdForPhoneAccountHandle = 137;
        static final int TRANSACTION_getSubscriptionCarrierId = 153;
        static final int TRANSACTION_getSubscriptionCarrierName = 154;
        static final int TRANSACTION_getSubscriptionSpecificCarrierId = 155;
        static final int TRANSACTION_getSubscriptionSpecificCarrierName = 156;
        static final int TRANSACTION_getSupportedNetworkAlertCategories = 402;
        static final int TRANSACTION_getSystemSelectionChannels = 252;
        static final int TRANSACTION_getTelephonyHistograms = 150;
        static final int TRANSACTION_getTestEuiccUiComponent = 420;
        static final int TRANSACTION_getTypeAllocationCodeForSlot = 135;
        static final int TRANSACTION_getUiccCardsInfo = 174;
        static final int TRANSACTION_getUiccSlotsInfo = 175;
        static final int TRANSACTION_getVisualVoicemailPackageName = 48;
        static final int TRANSACTION_getVisualVoicemailSettings = 47;
        static final int TRANSACTION_getVisualVoicemailSmsFilterSettings = 51;
        static final int TRANSACTION_getVoWiFiModeSetting = 210;
        static final int TRANSACTION_getVoWiFiRoamingModeSetting = 212;
        static final int TRANSACTION_getVoiceActivationState = 43;
        static final int TRANSACTION_getVoiceMessageCountForSubscriber = 45;
        static final int TRANSACTION_getVoiceNetworkTypeForSubscriber = 58;
        static final int TRANSACTION_getVoicemailRingtoneUri = 143;
        static final int TRANSACTION_handlePinMmi = 13;
        static final int TRANSACTION_handlePinMmiForSubscriber = 15;
        static final int TRANSACTION_handleUssdRequest = 14;
        static final int TRANSACTION_hasIccCard = 59;
        static final int TRANSACTION_hasIccCardUsingSlotIndex = 60;
        static final int TRANSACTION_iccCloseLogicalChannel = 66;
        static final int TRANSACTION_iccExchangeSimIO = 71;
        static final int TRANSACTION_iccOpenLogicalChannel = 65;
        static final int TRANSACTION_iccTransmitApduBasicChannel = 70;
        static final int TRANSACTION_iccTransmitApduBasicChannelByPort = 69;
        static final int TRANSACTION_iccTransmitApduLogicalChannel = 68;
        static final int TRANSACTION_iccTransmitApduLogicalChannelByPort = 67;
        static final int TRANSACTION_isAdvancedCallingSettingEnabled = 199;
        static final int TRANSACTION_isAospDomainSelectionService = 397;
        static final int TRANSACTION_isApnMetered = 250;
        static final int TRANSACTION_isApplicationOnUicc = 247;
        static final int TRANSACTION_isAvailable = 197;
        static final int TRANSACTION_isCapable = 196;
        static final int TRANSACTION_isCellularIdentifierDisclosureNotificationsEnabled = 399;
        static final int TRANSACTION_isConcurrentVoiceAndDataAllowed = 46;
        static final int TRANSACTION_isCrossSimCallingEnabledByUser = 205;
        static final int TRANSACTION_isDataConnectivityPossible = 30;
        static final int TRANSACTION_isDataEnabled = 97;
        static final int TRANSACTION_isDataEnabledForApn = 249;
        static final int TRANSACTION_isDataEnabledForReason = 99;
        static final int TRANSACTION_isDataRoamingEnabled = 178;
        static final int TRANSACTION_isDomainSelectionSupported = 335;
        static final int TRANSACTION_isEmergencyNumber = 217;
        static final int TRANSACTION_isHearingAidCompatibilitySupported = 126;
        static final int TRANSACTION_isIccLockEnabled = 262;
        static final int TRANSACTION_isImsRegistered = 127;
        static final int TRANSACTION_isInCarrierRoamingNtnMode = 429;
        static final int TRANSACTION_isInEmergencySmsMode = 186;
        static final int TRANSACTION_isManualNetworkSelectionAllowed = 100;
        static final int TRANSACTION_isMmTelCapabilitySupported = 198;
        static final int TRANSACTION_isMobileDataPolicyEnabled = 259;
        static final int TRANSACTION_isModemEnabledForSlot = 248;
        static final int TRANSACTION_isMultiSimSupported = 240;
        static final int TRANSACTION_isMvnoMatched = 253;
        static final int TRANSACTION_isNrDualConnectivityEnabled = 273;
        static final int TRANSACTION_isNullCipherAndIntegrityPreferenceEnabled = 332;
        static final int TRANSACTION_isNullCipherNotificationsEnabled = 401;
        static final int TRANSACTION_isPremiumCapabilityAvailableForPurchase = 315;
        static final int TRANSACTION_isProvisioningRequiredForCapability = 322;
        static final int TRANSACTION_isRadioInterfaceCapabilitySupported = 274;
        static final int TRANSACTION_isRadioOn = 3;
        static final int TRANSACTION_isRadioOnForSubscriber = 5;
        static final int TRANSACTION_isRadioOnForSubscriberWithFeature = 6;
        static final int TRANSACTION_isRadioOnWithFeature = 4;
        static final int TRANSACTION_isRcsProvisioningRequiredForCapability = 323;
        static final int TRANSACTION_isRcsVolteSingleRegistrationCapable = 282;
        static final int TRANSACTION_isRemovableEsimDefaultEuicc = 327;
        static final int TRANSACTION_isRttSupported = 125;
        static final int TRANSACTION_isSatelliteAttachSupported = 437;
        static final int TRANSACTION_isSatelliteEntitlementSupported = 438;
        static final int TRANSACTION_isTetheringApnRequiredForSubscriber = 76;
        static final int TRANSACTION_isTtyModeSupported = 123;
        static final int TRANSACTION_isTtyOverVolteEnabled = 215;
        static final int TRANSACTION_isUserDataEnabled = 96;
        static final int TRANSACTION_isVideoCallingEnabled = 120;
        static final int TRANSACTION_isVideoTelephonyAvailable = 129;
        static final int TRANSACTION_isVoNrEnabled = 271;
        static final int TRANSACTION_isVoWiFiRoamingSettingEnabled = 207;
        static final int TRANSACTION_isVoWiFiSettingEnabled = 203;
        static final int TRANSACTION_isVoicemailVibrationEnabled = 145;
        static final int TRANSACTION_isVtSettingEnabled = 201;
        static final int TRANSACTION_isWifiCallingAvailable = 128;
        static final int TRANSACTION_isWorldPhone = 122;
        static final int TRANSACTION_needMobileRadioShutdown = 115;
        static final int TRANSACTION_notifyEntitlementStatusChanged = 434;
        static final int TRANSACTION_notifyOtaEmergencyNumberDbInstalled = 235;
        static final int TRANSACTION_notifyRcsAutoConfigurationReceived = 261;
        static final int TRANSACTION_overrideCarrierRoamingNtnEligibilityChanged = 421;
        static final int TRANSACTION_overrideConfigDataVersion = 384;
        static final int TRANSACTION_overrideSatelliteEntilementQueryConditions = 411;
        static final int TRANSACTION_overrideSatelliteEntilementStatusResponseForCtsTest = 410;
        static final int TRANSACTION_persistEmergencyCallDiagnosticData = 330;
        static final int TRANSACTION_pollPendingDatagrams = 356;
        static final int TRANSACTION_prepareForUnattendedReboot = 313;
        static final int TRANSACTION_provisionSatellite = 417;
        static final int TRANSACTION_provisionSatelliteService = 347;
        static final int TRANSACTION_purchasePremiumCapability = 316;
        static final int TRANSACTION_rebootModem = 74;
        static final int TRANSACTION_refreshUiccProfile = 183;
        static final int TRANSACTION_registerFeatureProvisioningChangedCallback = 221;
        static final int TRANSACTION_registerForCapabilitiesChanged = 392;
        static final int TRANSACTION_registerForCommunicationAccessStateChanged = 406;
        static final int TRANSACTION_registerForIncomingDatagram = 354;
        static final int TRANSACTION_registerForNtnSignalStrengthChanged = 390;
        static final int TRANSACTION_registerForSatelliteDisallowedReasonsChanged = 359;
        static final int TRANSACTION_registerForSatelliteModemStateChanged = 352;
        static final int TRANSACTION_registerForSatelliteProvisionStateChanged = 349;
        static final int TRANSACTION_registerForSatelliteSupportedStateChanged = 404;
        static final int TRANSACTION_registerForSelectedNbIotSatelliteSubscriptionChanged = 366;
        static final int TRANSACTION_registerImsEmergencyRegistrationCallback = 190;
        static final int TRANSACTION_registerImsProvisioningChangedCallback = 219;
        static final int TRANSACTION_registerImsRegistrationCallback = 188;
        static final int TRANSACTION_registerImsStateCallback = 317;
        static final int TRANSACTION_registerMmTelCapabilityCallback = 194;
        static final int TRANSACTION_registerMmTelFeatureCallback = 80;
        static final int TRANSACTION_registerRcsProvisioningCallback = 283;
        static final int TRANSACTION_removeAttachRestrictionForCarrier = 387;
        static final int TRANSACTION_removeContactFromEab = 298;
        static final int TRANSACTION_removeUceRegistrationOverrideShell = 304;
        static final int TRANSACTION_removeUceRequestDisallowedStatus = 308;
        static final int TRANSACTION_requestCellInfoUpdate = 62;
        static final int TRANSACTION_requestCellInfoUpdateWithWorkSource = 63;
        static final int TRANSACTION_requestEnableSatellite = 341;
        static final int TRANSACTION_requestEnableSatelliteStatus = 342;
        static final int TRANSACTION_requestEntitlementRefresh = 361;
        static final int TRANSACTION_requestIsCommunicationAllowedForCurrentLocation = 362;
        static final int TRANSACTION_requestIsDemoModeEnabled = 339;
        static final int TRANSACTION_requestIsEmergencyModeEnabled = 340;
        static final int TRANSACTION_requestIsSatelliteEnabled = 338;
        static final int TRANSACTION_requestIsSatelliteProvisioned = 351;
        static final int TRANSACTION_requestIsSatelliteSupported = 343;
        static final int TRANSACTION_requestModemActivityInfo = 141;
        static final int TRANSACTION_requestNetworkScan = 90;
        static final int TRANSACTION_requestNtnSignalStrength = 389;
        static final int TRANSACTION_requestNumberVerification = 102;
        static final int TRANSACTION_requestPointingUiAppLaunchIntent = 436;
        static final int TRANSACTION_requestRadioPowerOffForReason = 21;
        static final int TRANSACTION_requestSatelliteAccessConfigurationForCurrentLocation = 363;
        static final int TRANSACTION_requestSatelliteCapabilities = 344;
        static final int TRANSACTION_requestSatelliteDisplayName = 416;
        static final int TRANSACTION_requestSatelliteEnabled = 337;
        static final int TRANSACTION_requestSatelliteSessionStats = 414;
        static final int TRANSACTION_requestSatelliteSubscriberProvisionStatus = 415;
        static final int TRANSACTION_requestSelectedNbIotSatelliteSubscriptionId = 365;
        static final int TRANSACTION_requestSignalStrengthUpdate = 171;
        static final int TRANSACTION_requestTimeForNextSatelliteVisibility = 364;
        static final int TRANSACTION_requestUserActivityNotification = 265;
        static final int TRANSACTION_resetIms = 79;
        static final int TRANSACTION_resetModemConfig = 73;
        static final int TRANSACTION_resetOtaEmergencyNumberDbFilePath = 237;
        static final int TRANSACTION_sendDatagram = 357;
        static final int TRANSACTION_sendDeviceToDeviceMessage = 291;
        static final int TRANSACTION_sendDialerSpecialCode = 54;
        static final int TRANSACTION_sendEnvelopeWithStatus = 72;
        static final int TRANSACTION_sendThermalMitigationRequest = 275;
        static final int TRANSACTION_sendVisualVoicemailSmsForSubscriber = 53;
        static final int TRANSACTION_setActiveDeviceToDeviceTransport = 292;
        static final int TRANSACTION_setAdvancedCallingSettingEnabled = 200;
        static final int TRANSACTION_setAllowedCarriers = 151;
        static final int TRANSACTION_setAllowedNetworkTypesForReason = 94;
        static final int TRANSACTION_setBoundGbaServiceOverride = 277;
        static final int TRANSACTION_setBoundImsServiceOverride = 84;
        static final int TRANSACTION_setCallComposerStatus = 7;
        static final int TRANSACTION_setCallForwarding = 162;
        static final int TRANSACTION_setCallWaitingStatus = 164;
        static final int TRANSACTION_setCapabilitiesRequestTimeout = 309;
        static final int TRANSACTION_setCarrierServicePackageOverride = 181;
        static final int TRANSACTION_setCarrierSingleRegistrationEnabledOverride = 290;
        static final int TRANSACTION_setCarrierTestOverride = 180;
        static final int TRANSACTION_setCellBroadcastIdRanges = 334;
        static final int TRANSACTION_setCellInfoListRate = 64;
        static final int TRANSACTION_setCepEnabled = 260;
        static final int TRANSACTION_setCountryCodes = 379;
        static final int TRANSACTION_setCrossSimCallingEnabled = 206;
        static final int TRANSACTION_setCtsMode = 369;
        static final int TRANSACTION_setDataActivationState = 42;
        static final int TRANSACTION_setDataEnabledForReason = 98;
        static final int TRANSACTION_setDataRoamingEnabled = 179;
        static final int TRANSACTION_setDatagramControllerBooleanConfig = 408;
        static final int TRANSACTION_setDatagramControllerTimeoutDuration = 376;
        static final int TRANSACTION_setDeviceAlignedWithSatellite = 368;
        static final int TRANSACTION_setDeviceSingleRegistrationEnabledOverride = 288;
        static final int TRANSACTION_setDeviceToDeviceForceEnabled = 293;
        static final int TRANSACTION_setDeviceUceEnabled = 302;
        static final int TRANSACTION_setDomainSelectionServiceOverride = 395;
        static final int TRANSACTION_setEmergencyCallToSatelliteHandoverType = 378;
        static final int TRANSACTION_setEnableCellularIdentifierDisclosureNotifications = 398;
        static final int TRANSACTION_setForbiddenPlmns = 169;
        static final int TRANSACTION_setGbaReleaseTimeOverride = 279;
        static final int TRANSACTION_setIccLockEnabled = 263;
        static final int TRANSACTION_setImsFeatureValidationOverride = 295;
        static final int TRANSACTION_setImsProvisioningInt = 229;
        static final int TRANSACTION_setImsProvisioningStatusForCapability = 223;
        static final int TRANSACTION_setImsProvisioningString = 230;
        static final int TRANSACTION_setImsRegistrationState = 101;
        static final int TRANSACTION_setIsSatelliteCommunicationAllowedForCurrentLocationCache = 409;
        static final int TRANSACTION_setLine1NumberForDisplayForSubscriber = 108;
        static final int TRANSACTION_setMaxAllowedSatelliteDataModeForCtsTest = 412;
        static final int TRANSACTION_setMobileDataPolicyEnabled = 258;
        static final int TRANSACTION_setModemService = 320;
        static final int TRANSACTION_setMultiSimCarrierRestriction = 239;
        static final int TRANSACTION_setNetworkSelectionModeAutomatic = 88;
        static final int TRANSACTION_setNetworkSelectionModeManual = 92;
        static final int TRANSACTION_setNrDualConnectivityState = 272;
        static final int TRANSACTION_setNtnSmsSupported = 423;
        static final int TRANSACTION_setNullCipherAndIntegrityEnabled = 331;
        static final int TRANSACTION_setNullCipherNotificationsEnabled = 400;
        static final int TRANSACTION_setOemEnabledSatelliteProvisionStatus = 383;
        static final int TRANSACTION_setOperatorBrandOverride = 113;
        static final int TRANSACTION_setRadio = 18;
        static final int TRANSACTION_setRadioForSubscriber = 19;
        static final int TRANSACTION_setRadioPower = 20;
        static final int TRANSACTION_setRcsClientConfiguration = 281;
        static final int TRANSACTION_setRcsProvisioningStatusForCapability = 226;
        static final int TRANSACTION_setRcsSingleRegistrationTestModeEnabled = 286;
        static final int TRANSACTION_setRemovableEsimAsDefaultEuicc = 326;
        static final int TRANSACTION_setRoamingOverride = 114;
        static final int TRANSACTION_setRttCapabilitySetting = 214;
        static final int TRANSACTION_setSatelliteAccessAllowedForSubscriptions = 381;
        static final int TRANSACTION_setSatelliteAccessControlOverlayConfigs = 380;
        static final int TRANSACTION_setSatelliteControllerTimeoutDuration = 377;
        static final int TRANSACTION_setSatelliteGatewayServicePackageName = 371;
        static final int TRANSACTION_setSatelliteIgnoreCellularServiceState = 373;
        static final int TRANSACTION_setSatelliteIgnorePlmnListFromStorage = 427;
        static final int TRANSACTION_setSatelliteListeningTimeoutDuration = 372;
        static final int TRANSACTION_setSatellitePointingUiClassName = 375;
        static final int TRANSACTION_setSatelliteServicePackageName = 370;
        static final int TRANSACTION_setSatelliteSubscriberIdListChangedIntentComponent = 418;
        static final int TRANSACTION_setShouldSendDatagramToModemInDemoMode = 394;
        static final int TRANSACTION_setSignalStrengthUpdateRequest = 310;
        static final int TRANSACTION_setSimPowerStateForSlot = 166;
        static final int TRANSACTION_setSimPowerStateForSlotWithCallback = 167;
        static final int TRANSACTION_setSimSlotMapping = 177;
        static final int TRANSACTION_setSupportDisableSatelliteWhileEnableInProgress = 374;
        static final int TRANSACTION_setSystemSelectionChannels = 251;
        static final int TRANSACTION_setTestEuiccUiComponent = 419;
        static final int TRANSACTION_setTnScanningSupport = 382;
        static final int TRANSACTION_setVoNrEnabled = 270;
        static final int TRANSACTION_setVoWiFiModeSetting = 211;
        static final int TRANSACTION_setVoWiFiNonPersistent = 209;
        static final int TRANSACTION_setVoWiFiRoamingModeSetting = 213;
        static final int TRANSACTION_setVoWiFiRoamingSettingEnabled = 208;
        static final int TRANSACTION_setVoWiFiSettingEnabled = 204;
        static final int TRANSACTION_setVoiceActivationState = 41;
        static final int TRANSACTION_setVoiceMailNumber = 40;
        static final int TRANSACTION_setVoiceServiceStateOverride = 324;
        static final int TRANSACTION_setVoicemailRingtoneUri = 144;
        static final int TRANSACTION_setVoicemailVibrationEnabled = 146;
        static final int TRANSACTION_setVtSettingEnabled = 202;
        static final int TRANSACTION_showSwitchToManagedProfileDialog = 255;
        static final int TRANSACTION_shutdownMobileRadios = 116;
        static final int TRANSACTION_startEmergencyCallbackMode = 231;
        static final int TRANSACTION_startSatelliteTransmissionUpdates = 345;
        static final int TRANSACTION_stopNetworkScan = 91;
        static final int TRANSACTION_stopSatelliteTransmissionUpdates = 346;
        static final int TRANSACTION_supplyPinForSubscriber = 9;
        static final int TRANSACTION_supplyPinReportResultForSubscriber = 11;
        static final int TRANSACTION_supplyPukForSubscriber = 10;
        static final int TRANSACTION_supplyPukReportResultForSubscriber = 12;
        static final int TRANSACTION_switchMultiSimConfig = 241;
        static final int TRANSACTION_switchSlots = 176;
        static final int TRANSACTION_toggleRadioOnOff = 16;
        static final int TRANSACTION_toggleRadioOnOffForSubscriber = 17;
        static final int TRANSACTION_triggerRcsReconfiguration = 285;
        static final int TRANSACTION_uncapMaxAllowedSatelliteDataMode = 413;
        static final int TRANSACTION_unenrollSimFromAutoPinManagement = 432;
        static final int TRANSACTION_unregisterFeatureProvisioningChangedCallback = 222;
        static final int TRANSACTION_unregisterForCapabilitiesChanged = 393;
        static final int TRANSACTION_unregisterForCommunicationAccessStateChanged = 407;
        static final int TRANSACTION_unregisterForIncomingDatagram = 355;
        static final int TRANSACTION_unregisterForModemStateChanged = 353;
        static final int TRANSACTION_unregisterForNtnSignalStrengthChanged = 391;
        static final int TRANSACTION_unregisterForSatelliteDisallowedReasonsChanged = 360;
        static final int TRANSACTION_unregisterForSatelliteProvisionStateChanged = 350;
        static final int TRANSACTION_unregisterForSatelliteSupportedStateChanged = 405;
        static final int TRANSACTION_unregisterForSelectedNbIotSatelliteSubscriptionChanged = 367;
        static final int TRANSACTION_unregisterImsEmergencyRegistrationCallback = 191;
        static final int TRANSACTION_unregisterImsFeatureCallback = 81;
        static final int TRANSACTION_unregisterImsProvisioningChangedCallback = 220;
        static final int TRANSACTION_unregisterImsRegistrationCallback = 189;
        static final int TRANSACTION_unregisterImsStateCallback = 318;
        static final int TRANSACTION_unregisterMmTelCapabilityCallback = 195;
        static final int TRANSACTION_unregisterRcsProvisioningCallback = 284;
        static final int TRANSACTION_updateEmergencyNumberListTestMode = 232;
        static final int TRANSACTION_updateOtaEmergencyNumberDbFilePath = 236;
        static final int TRANSACTION_updateServiceLocation = 24;
        static final int TRANSACTION_updateServiceLocationWithPackageName = 25;
        static final int TRANSACTION_uploadCallComposerPicture = 118;
        static final int TRANSACTION_userActivity = 266;
        public Stub() { super(); }
        public static com.android.internal.telephony.ITelephony asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        private boolean onTransact$addAttachRestrictionForCarrier$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$addUceRegistrationOverrideShell$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$bootstrapAuthenticationRequest$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$canChangeDtmfToneLength$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$changeIccLockPassword$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$clearSignalStrengthUpdateRequest$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$deprovisionSatellite$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$deprovisionSatelliteService$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$doesSwitchMultiSimConfigTriggerReboot$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$enableModemForSlot$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$enableVisualVoicemailSmsFilter$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$enqueueSmsPickResult$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$enrollSimInAutoPinManagement$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getAutoManagedPinForSim$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getBoundImsServicePackage$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getCallForwarding$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getCallStateForSubscription$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getCarrierIdFromMccMnc$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getCarrierRestrictionStatus$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getCellNetworkScanResults$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getClientRequestStats$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getDataNetworkTypeForSubscriber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getDefaultRespondViaMessageApplication$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getDeviceSoftwareVersionForSlot$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getEmergencyNumberList$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getEquivalentHomePlmns$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getForbiddenPlmns$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getImeiForSlot$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getImsProvisioningInt$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getImsProvisioningStatusForCapability$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getImsProvisioningString$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getLastKnownCellIdentity$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getLine1AlphaTagForDisplay$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getLine1NumberForDisplay$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getMergedSubscriberIds$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getNetworkTypeForSubscriber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getNumberOfModemsWithSimultaneousDataConnections$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPlmnSatelliteConfig$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getRadioPowerOffReasons$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getRadioPowerState$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getRcsProvisioningStatusForCapability$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getServiceStateForSlot$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getShaIdFromAllowList$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getSubIdForPhoneAccountHandle$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getVisualVoicemailPackageName$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getVoiceMessageCountForSubscriber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getVoiceNetworkTypeForSubscriber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$handleUssdRequest$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccExchangeSimIO$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccTransmitApduBasicChannel$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccTransmitApduBasicChannelByPort$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccTransmitApduLogicalChannel$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$iccTransmitApduLogicalChannelByPort$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isApnMetered$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isApplicationOnUicc$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isAvailable$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isCapable$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isDataEnabledForApn$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isEmergencyNumber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isMmTelCapabilitySupported$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isMobileDataPolicyEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isModemEnabledForSlot$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isMultiSimSupported$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isMvnoMatched$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isPremiumCapabilityAvailableForPurchase$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isProvisioningRequiredForCapability$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isRadioOnForSubscriberWithFeature$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isRcsProvisioningRequiredForCapability$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isWorldPhone$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$notifyEntitlementStatusChanged$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$notifyRcsAutoConfigurationReceived$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$overrideCarrierRoamingNtnEligibilityChanged$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$overrideConfigDataVersion$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$overrideSatelliteEntilementQueryConditions$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$overrideSatelliteEntilementStatusResponseForCtsTest$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$persistEmergencyCallDiagnosticData$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$provisionSatellite$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$provisionSatelliteService$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$purchasePremiumCapability$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$registerFeatureProvisioningChangedCallback$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$registerForCommunicationAccessStateChanged$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$registerImsProvisioningChangedCallback$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$registerImsStateCallback$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$registerRcsProvisioningCallback$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$removeAttachRestrictionForCarrier$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$removeContactFromEab$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$removeUceRegistrationOverrideShell$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestCellInfoUpdate$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestCellInfoUpdateWithWorkSource$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestEnableSatellite$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestEnableSatelliteStatus$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestEntitlementRefresh$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestIsCommunicationAllowedForCurrentLocation$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestNetworkScan$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestNumberVerification$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestPointingUiAppLaunchIntent$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestSatelliteEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestSatelliteSessionStats$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$requestSignalStrengthUpdate$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$sendDatagram$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$sendDeviceToDeviceMessage$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$sendThermalMitigationRequest$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$sendVisualVoicemailSmsForSubscriber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setAllowedNetworkTypesForReason$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setBoundGbaServiceOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setBoundImsServiceOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCallForwarding$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCallWaitingStatus$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCapabilitiesRequestTimeout$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCarrierServicePackageOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCarrierSingleRegistrationEnabledOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCarrierTestOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCellBroadcastIdRanges$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setCountryCodes$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setDataEnabledForReason$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setDatagramControllerBooleanConfig$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setDatagramControllerTimeoutDuration$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setEmergencyCallToSatelliteHandoverType$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setForbiddenPlmns$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setGbaReleaseTimeOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setIccLockEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setImsFeatureValidationOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setImsProvisioningInt$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setImsProvisioningStatusForCapability$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setImsProvisioningString$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setLine1NumberForDisplayForSubscriber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setMobileDataPolicyEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setNetworkSelectionModeManual$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setNrDualConnectivityState$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setOemEnabledSatelliteProvisionStatus$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setRcsClientConfiguration$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setRcsProvisioningStatusForCapability$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setRemovableEsimAsDefaultEuicc$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setRoamingOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setRttCapabilitySetting$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSatelliteAccessAllowedForSubscriptions$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSatelliteAccessControlOverlayConfigs$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSatelliteControllerTimeoutDuration$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSatellitePointingUiClassName$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSatelliteServicePackageName$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSignalStrengthUpdateRequest$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSimPowerStateForSlotWithCallback$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSupportDisableSatelliteWhileEnableInProgress$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSystemSelectionChannels$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setTnScanningSupport$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoNrEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoWiFiModeSetting$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoWiFiNonPersistent$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoWiFiRoamingModeSetting$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoWiFiRoamingSettingEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoiceMailNumber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoiceServiceStateOverride$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoicemailRingtoneUri$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setVoicemailVibrationEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$startSatelliteTransmissionUpdates$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$stopSatelliteTransmissionUpdates$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$supplyPukForSubscriber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$supplyPukReportResultForSubscriber$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$unenrollSimFromAutoPinManagement$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$unregisterFeatureProvisioningChangedCallback$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$unregisterForCommunicationAccessStateChanged$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$unregisterImsProvisioningChangedCallback$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$unregisterRcsProvisioningCallback$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$updateEmergencyNumberListTestMode$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$uploadCallComposerPicture$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.telephony.ITelephony {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addAttachRestrictionForCarrier(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public android.telephony.ims.RcsContactUceCapability addUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
            public android.os.IBinder asBinder() { return null; }
            public void bootstrapAuthenticationRequest(int p0, int p1, android.net.Uri p2, android.telephony.gba.UaSecurityProtocolIdentifier p3, boolean p4, android.telephony.IBootstrapAuthenticationCallback p5) throws android.os.RemoteException {}
            public void call(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean canChangeDtmfToneLength(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean canConnectTo5GInDsdsMode() throws android.os.RemoteException { return false; }
            public void carrierActionReportDefaultNetworkStatus(int p0, boolean p1) throws android.os.RemoteException {}
            public void carrierActionResetAll(int p0) throws android.os.RemoteException {}
            public void carrierActionSetRadioEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public int changeIccLockPassword(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int checkCarrierPrivilegesForPackage(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int checkCarrierPrivilegesForPackageAnyPhone(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public boolean clearCarrierImsServiceOverride(int p0) throws android.os.RemoteException { return false; }
            public boolean clearDomainSelectionServiceOverride() throws android.os.RemoteException { return false; }
            public boolean clearRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException { return false; }
            public void clearSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.telephony.ims.RcsContactUceCapability clearUceRegistrationOverrideShell(int p0) throws android.os.RemoteException { return null; }
            public void deprovisionSatellite(java.util.List<android.telephony.satellite.SatelliteSubscriberInfo> p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void deprovisionSatelliteService(java.lang.String p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void dial(java.lang.String p0) throws android.os.RemoteException {}
            public boolean disableDataConnectivity(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void disableIms(int p0) throws android.os.RemoteException {}
            public void disableLocationUpdates() throws android.os.RemoteException {}
            public void disableVisualVoicemailSmsFilter(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean doesSwitchMultiSimConfigTriggerReboot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean enableDataConnectivity(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void enableIms(int p0) throws android.os.RemoteException {}
            public void enableLocationUpdates() throws android.os.RemoteException {}
            public boolean enableModemForSlot(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public void enableVideoCalling(boolean p0) throws android.os.RemoteException {}
            public void enableVisualVoicemailSmsFilter(java.lang.String p0, int p1, android.telephony.VisualVoicemailSmsFilterSettings p2) throws android.os.RemoteException {}
            public void enqueueSmsPickResult(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public void enrollSimInAutoPinManagement(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public void factoryReset(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.telephony.VisualVoicemailSmsFilterSettings getActiveVisualVoicemailSmsFilterSettings(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getAidForAppType(int p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telephony.CarrierRestrictionRules getAllowedCarriers() throws android.os.RemoteException { return null; }
            public int getAllowedNetworkTypesBitmask(int p0) throws android.os.RemoteException { return 0; }
            public long getAllowedNetworkTypesForReason(int p0, int p1) throws android.os.RemoteException { return 0L; }
            public int[] getAttachRestrictionReasonsForCarrier(int p0) throws android.os.RemoteException { return null; }
            public void getAutoManagedPinForSim(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public java.lang.String getBoundGbaService(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getBoundImsServicePackage(int p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
            public int getCallComposerStatus(int p0) throws android.os.RemoteException { return 0; }
            public void getCallForwarding(int p0, int p1, com.android.internal.telephony.ICallForwardingInfoCallback p2) throws android.os.RemoteException {}
            public int getCallState() throws android.os.RemoteException { return 0; }
            public int getCallStateForSubscription(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void getCallWaitingStatus(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public java.lang.String getCapabilityFromEab(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getCardIdForDefaultEuicc(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getCarrierIdFromIdentifier(android.service.carrier.CarrierIdentifier p0) throws android.os.RemoteException { return 0; }
            public int getCarrierIdFromMccMnc(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getCarrierIdListVersion(int p0) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getCarrierPackageNamesForIntentAndPhone(android.content.Intent p0, int p1) throws android.os.RemoteException { return null; }
            public int getCarrierPrivilegeStatus(int p0) throws android.os.RemoteException { return 0; }
            public int getCarrierPrivilegeStatusForUid(int p0, int p1) throws android.os.RemoteException { return 0; }
            public void getCarrierRestrictionStatus(com.android.internal.telephony.IIntegerConsumer p0, java.lang.String p1) throws android.os.RemoteException {}
            public int[] getCarrierRoamingNtnAvailableServices(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getCarrierServicePackageNameForLogicalSlot(int p0) throws android.os.RemoteException { return null; }
            public boolean getCarrierSingleRegistrationEnabled(int p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.telephony.CellBroadcastIdRange> getCellBroadcastIdRanges(int p0) throws android.os.RemoteException { return null; }
            public android.telephony.CellIdentity getCellLocation(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public com.android.internal.telephony.CellNetworkScanResult getCellNetworkScanResults(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.ClientRequestStats> getClientRequestStats(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public java.lang.String getContactFromEab(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getCurrentPackageName() throws android.os.RemoteException { return null; }
            public int getCurrentTtyMode() throws android.os.RemoteException { return 0; }
            public int getDataActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getDataActivity() throws android.os.RemoteException { return 0; }
            public int getDataActivityForSubId(int p0) throws android.os.RemoteException { return 0; }
            public boolean getDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public int getDataNetworkType(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getDataNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int getDataState() throws android.os.RemoteException { return 0; }
            public int getDataStateForSubId(int p0) throws android.os.RemoteException { return 0; }
            public android.content.ComponentName getDefaultRespondViaMessageApplication(int p0, boolean p1) throws android.os.RemoteException { return null; }
            @java.lang.Deprecated
            public java.lang.String getDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getDeviceIdWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean getDeviceSingleRegistrationEnabled() throws android.os.RemoteException { return false; }
            public java.lang.String getDeviceSoftwareVersionForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean getDeviceUceEnabled() throws android.os.RemoteException { return false; }
            public boolean getEmergencyCallbackMode(int p0) throws android.os.RemoteException { return false; }
            public int getEmergencyNumberDbVersion(int p0) throws android.os.RemoteException { return 0; }
            public java.util.Map getEmergencyNumberList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getEmergencyNumberListTestMode() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getEquivalentHomePlmns(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String[] getForbiddenPlmns(int p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public int getGbaReleaseTime(int p0) throws android.os.RemoteException { return 0; }
            public int getHalVersion(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getImeiForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) throws android.os.RemoteException { return null; }
            public boolean getImsFeatureValidationOverride(int p0) throws android.os.RemoteException { return false; }
            public void getImsMmTelFeatureState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void getImsMmTelRegistrationState(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void getImsMmTelRegistrationTransportType(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public int getImsProvisioningInt(int p0, int p1) throws android.os.RemoteException { return 0; }
            public boolean getImsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public java.lang.String getImsProvisioningString(int p0, int p1) throws android.os.RemoteException { return null; }
            public int getImsRegTechnologyForMmTel(int p0) throws android.os.RemoteException { return 0; }
            public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.telephony.CellIdentity getLastKnownCellIdentity(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getLastUcePidfXmlShell(int p0) throws android.os.RemoteException { return null; }
            public android.telephony.ims.RcsContactUceCapability getLatestRcsContactUceCapabilityShell(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getLine1AlphaTagForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getLine1NumberForDisplay(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getManualNetworkSelectionPlmn(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getMergedImsisFromGroup(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String[] getMergedSubscriberIds(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.lang.String getMmsUAProfUrl(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getMmsUserAgent(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getMobileProvisioningUrl() throws android.os.RemoteException { return null; }
            public java.lang.String getModemService() throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getNetworkCountryIsoForPhone(int p0) throws android.os.RemoteException { return null; }
            public int getNetworkSelectionMode(int p0) throws android.os.RemoteException { return 0; }
            public int getNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int getNumberOfModemsWithSimultaneousDataConnections(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getPackagesWithCarrierPrivileges(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPackagesWithCarrierPrivilegesForAllPhones() throws android.os.RemoteException { return null; }
            public android.telecom.PhoneAccountHandle getPhoneAccountHandleForSubscriptionId(int p0) throws android.os.RemoteException { return null; }
            public android.telephony.PhoneCapability getPhoneCapability() throws android.os.RemoteException { return null; }
            public android.telephony.satellite.PlmnSatelliteConfig getPlmnSatelliteConfig(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getPrimaryImei(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int getRadioAccessFamily(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getRadioHalVersion() throws android.os.RemoteException { return 0; }
            public java.util.List getRadioPowerOffReasons(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public int getRadioPowerState(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public boolean getRcsProvisioningStatusForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean getRcsSingleRegistrationTestModeEnabled() throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getSatelliteDataOptimizedApps() throws android.os.RemoteException { return null; }
            public int getSatelliteDataSupportMode(int p0) throws android.os.RemoteException { return 0; }
            public int[] getSatelliteDisallowedReasons() throws android.os.RemoteException { return null; }
            public java.lang.String getSatelliteEntitlementServerUrl(int p0) throws android.os.RemoteException { return null; }
            public int getSatelliteNtnConnectType(int p0) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getSatellitePlmnsForCarrier(int p0) throws android.os.RemoteException { return null; }
            public android.telephony.ServiceState getServiceStateForSlot(int p0, boolean p1, boolean p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getShaIdFromAllowList(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.telephony.SignalStrength getSignalStrength(int p0) throws android.os.RemoteException { return null; }
            public int getSimAutoPinManagementEnrollmentStatus(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getSimLocaleForSubscriber(int p0) throws android.os.RemoteException { return null; }
            public int getSimStateForSlotIndex(int p0) throws android.os.RemoteException { return 0; }
            public void getSlicingConfig(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public java.util.List<android.telephony.UiccSlotMapping> getSlotsMapping(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getSubIdForPhoneAccountHandle(android.telecom.PhoneAccountHandle p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int getSubscriptionCarrierId(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getSubscriptionCarrierName(int p0) throws android.os.RemoteException { return null; }
            public int getSubscriptionSpecificCarrierId(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getSubscriptionSpecificCarrierName(int p0) throws android.os.RemoteException { return null; }
            public int[] getSupportedNetworkAlertCategories() throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.RadioAccessSpecifier> getSystemSelectionChannels(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.TelephonyHistogram> getTelephonyHistograms() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getTestEuiccUiComponent() throws android.os.RemoteException { return null; }
            public java.lang.String getTypeAllocationCodeForSlot(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.telephony.UiccCardInfo> getUiccCardsInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.telephony.UiccSlotInfo[] getUiccSlotsInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getVisualVoicemailPackageName(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public android.os.Bundle getVisualVoicemailSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.telephony.VisualVoicemailSmsFilterSettings getVisualVoicemailSmsFilterSettings(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int getVoWiFiModeSetting(int p0) throws android.os.RemoteException { return 0; }
            public int getVoWiFiRoamingModeSetting(int p0) throws android.os.RemoteException { return 0; }
            public int getVoiceActivationState(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getVoiceMessageCountForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int getVoiceNetworkTypeForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public android.net.Uri getVoicemailRingtoneUri(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return null; }
            public boolean handlePinMmi(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean handlePinMmiForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void handleUssdRequest(int p0, java.lang.String p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public boolean hasIccCard() throws android.os.RemoteException { return false; }
            public boolean hasIccCardUsingSlotIndex(int p0) throws android.os.RemoteException { return false; }
            public boolean iccCloseLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException { return false; }
            public byte[] iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException { return null; }
            public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(com.android.internal.telephony.IccLogicalChannelRequest p0) throws android.os.RemoteException { return null; }
            public java.lang.String iccTransmitApduBasicChannel(int p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
            public java.lang.String iccTransmitApduBasicChannelByPort(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException { return null; }
            public java.lang.String iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.String p7) throws android.os.RemoteException { return null; }
            public java.lang.String iccTransmitApduLogicalChannelByPort(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.String p8) throws android.os.RemoteException { return null; }
            public boolean isAdvancedCallingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isAospDomainSelectionService() throws android.os.RemoteException { return false; }
            public boolean isApnMetered(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isApplicationOnUicc(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isAvailable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isCapable(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isCellularIdentifierDisclosureNotificationsEnabled() throws android.os.RemoteException { return false; }
            public boolean isConcurrentVoiceAndDataAllowed(int p0) throws android.os.RemoteException { return false; }
            public boolean isCrossSimCallingEnabledByUser(int p0) throws android.os.RemoteException { return false; }
            public boolean isDataConnectivityPossible(int p0) throws android.os.RemoteException { return false; }
            public boolean isDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isDataEnabledForApn(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isDataEnabledForReason(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isDataRoamingEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isDomainSelectionSupported() throws android.os.RemoteException { return false; }
            public boolean isEmergencyNumber(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean isHearingAidCompatibilitySupported() throws android.os.RemoteException { return false; }
            public boolean isIccLockEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isImsRegistered(int p0) throws android.os.RemoteException { return false; }
            public boolean isInCarrierRoamingNtnMode(int p0) throws android.os.RemoteException { return false; }
            public boolean isInEmergencySmsMode() throws android.os.RemoteException { return false; }
            public boolean isManualNetworkSelectionAllowed(int p0) throws android.os.RemoteException { return false; }
            public void isMmTelCapabilitySupported(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2, int p3) throws android.os.RemoteException {}
            public boolean isMobileDataPolicyEnabled(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isModemEnabledForSlot(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public int isMultiSimSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public boolean isMvnoMatched(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isNrDualConnectivityEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isNullCipherAndIntegrityPreferenceEnabled() throws android.os.RemoteException { return false; }
            public boolean isNullCipherNotificationsEnabled() throws android.os.RemoteException { return false; }
            public boolean isPremiumCapabilityAvailableForPurchase(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isRadioInterfaceCapabilitySupported(java.lang.String p0) throws android.os.RemoteException { return false; }
            @java.lang.Deprecated
            public boolean isRadioOn(java.lang.String p0) throws android.os.RemoteException { return false; }
            @java.lang.Deprecated
            public boolean isRadioOnForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isRadioOnForSubscriberWithFeature(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isRadioOnWithFeature(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isRcsProvisioningRequiredForCapability(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isRcsVolteSingleRegistrationCapable(int p0) throws android.os.RemoteException { return false; }
            public boolean isRemovableEsimDefaultEuicc(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isRttSupported(int p0) throws android.os.RemoteException { return false; }
            public boolean isSatelliteAttachSupported(int p0) throws android.os.RemoteException { return false; }
            public boolean isSatelliteEntitlementSupported(int p0) throws android.os.RemoteException { return false; }
            public boolean isTetheringApnRequiredForSubscriber(int p0) throws android.os.RemoteException { return false; }
            public boolean isTtyModeSupported() throws android.os.RemoteException { return false; }
            public boolean isTtyOverVolteEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserDataEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isVideoCallingEnabled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isVideoTelephonyAvailable(int p0) throws android.os.RemoteException { return false; }
            public boolean isVoNrEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isVoWiFiRoamingSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isVoWiFiSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isVoicemailVibrationEnabled(android.telecom.PhoneAccountHandle p0) throws android.os.RemoteException { return false; }
            public boolean isVtSettingEnabled(int p0) throws android.os.RemoteException { return false; }
            public boolean isWifiCallingAvailable(int p0) throws android.os.RemoteException { return false; }
            public boolean isWorldPhone(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean needMobileRadioShutdown() throws android.os.RemoteException { return false; }
            public void notifyEntitlementStatusChanged(int p0, java.util.List<java.lang.String> p1, long p2) throws android.os.RemoteException {}
            public void notifyOtaEmergencyNumberDbInstalled() throws android.os.RemoteException {}
            public void notifyRcsAutoConfigurationReceived(int p0, byte[] p1, boolean p2) throws android.os.RemoteException {}
            public boolean overrideCarrierRoamingNtnEligibilityChanged(boolean p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean overrideConfigDataVersion(boolean p0, int p1) throws android.os.RemoteException { return false; }
            public boolean overrideSatelliteEntilementQueryConditions(boolean p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean overrideSatelliteEntilementStatusResponseForCtsTest(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public void persistEmergencyCallDiagnosticData(java.lang.String p0, boolean p1, long p2, boolean p3, boolean p4) throws android.os.RemoteException {}
            public void pollPendingDatagrams(com.android.internal.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
            public int prepareForUnattendedReboot() throws android.os.RemoteException { return 0; }
            public void provisionSatellite(java.util.List<android.telephony.satellite.SatelliteSubscriberInfo> p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public android.os.ICancellationSignal provisionSatelliteService(java.lang.String p0, byte[] p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException { return null; }
            public void purchasePremiumCapability(int p0, com.android.internal.telephony.IIntegerConsumer p1, int p2) throws android.os.RemoteException {}
            public boolean rebootModem(int p0) throws android.os.RemoteException { return false; }
            public void refreshUiccProfile(int p0) throws android.os.RemoteException {}
            public void registerFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException {}
            public int registerForCapabilitiesChanged(android.telephony.satellite.ISatelliteCapabilitiesCallback p0) throws android.os.RemoteException { return 0; }
            public int registerForCommunicationAccessStateChanged(int p0, android.telephony.satellite.ISatelliteCommunicationAccessStateCallback p1) throws android.os.RemoteException { return 0; }
            public int registerForIncomingDatagram(android.telephony.satellite.ISatelliteDatagramCallback p0) throws android.os.RemoteException { return 0; }
            public void registerForNtnSignalStrengthChanged(android.telephony.satellite.INtnSignalStrengthCallback p0) throws android.os.RemoteException {}
            public void registerForSatelliteDisallowedReasonsChanged(android.telephony.satellite.ISatelliteDisallowedReasonsCallback p0) throws android.os.RemoteException {}
            public int registerForSatelliteModemStateChanged(android.telephony.satellite.ISatelliteModemStateCallback p0) throws android.os.RemoteException { return 0; }
            public int registerForSatelliteProvisionStateChanged(android.telephony.satellite.ISatelliteProvisionStateCallback p0) throws android.os.RemoteException { return 0; }
            public int registerForSatelliteSupportedStateChanged(com.android.internal.telephony.IBooleanConsumer p0) throws android.os.RemoteException { return 0; }
            public int registerForSelectedNbIotSatelliteSubscriptionChanged(android.telephony.satellite.ISelectedNbIotSatelliteSubscriptionCallback p0) throws android.os.RemoteException { return 0; }
            public void registerImsEmergencyRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
            public void registerImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
            public void registerImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
            public void registerImsStateCallback(int p0, int p1, com.android.internal.telephony.IImsStateCallback p2, java.lang.String p3) throws android.os.RemoteException {}
            public void registerMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
            public void registerMmTelFeatureCallback(int p0, com.android.ims.internal.IImsServiceFeatureCallback p1) throws android.os.RemoteException {}
            public void registerRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException {}
            public void removeAttachRestrictionForCarrier(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public int removeContactFromEab(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public android.telephony.ims.RcsContactUceCapability removeUceRegistrationOverrideShell(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
            public boolean removeUceRequestDisallowedStatus(int p0) throws android.os.RemoteException { return false; }
            public void requestCellInfoUpdate(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void requestCellInfoUpdateWithWorkSource(int p0, android.telephony.ICellInfoCallback p1, java.lang.String p2, java.lang.String p3, android.os.WorkSource p4) throws android.os.RemoteException {}
            public void requestEnableSatellite(int p0, android.telephony.satellite.EnableRequestAttributes p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public void requestEnableSatelliteStatus(int p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public void requestEntitlementRefresh(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void requestIsCommunicationAllowedForCurrentLocation(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void requestIsDemoModeEnabled(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void requestIsEmergencyModeEnabled(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            @java.lang.Deprecated
            public void requestIsSatelliteEnabled(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void requestIsSatelliteProvisioned(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void requestIsSatelliteSupported(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void requestModemActivityInfo(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public int requestNetworkScan(int p0, boolean p1, android.telephony.NetworkScanRequest p2, android.os.Messenger p3, android.os.IBinder p4, java.lang.String p5, java.lang.String p6) throws android.os.RemoteException { return 0; }
            public void requestNtnSignalStrength(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void requestNumberVerification(android.telephony.PhoneNumberRange p0, long p1, com.android.internal.telephony.INumberVerificationCallback p2, java.lang.String p3) throws android.os.RemoteException {}
            public void requestPointingUiAppLaunchIntent(android.telephony.satellite.PointingUiAppLaunchIntentAttributes p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public boolean requestRadioPowerOffForReason(int p0, int p1) throws android.os.RemoteException { return false; }
            public void requestSatelliteAccessConfigurationForCurrentLocation(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void requestSatelliteCapabilities(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void requestSatelliteDisplayName(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            @java.lang.Deprecated
            public void requestSatelliteEnabled(boolean p0, boolean p1, boolean p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException {}
            public void requestSatelliteSessionStats(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void requestSatelliteSubscriberProvisionStatus(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void requestSelectedNbIotSatelliteSubscriptionId(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void requestSignalStrengthUpdate(int p0, android.telephony.ISignalStrengthOutcomeReceiver p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void requestTimeForNextSatelliteVisibility(android.os.ResultReceiver p0) throws android.os.RemoteException {}
            public void requestUserActivityNotification() throws android.os.RemoteException {}
            public void resetIms(int p0) throws android.os.RemoteException {}
            @java.lang.Deprecated
            public boolean resetModemConfig(int p0) throws android.os.RemoteException { return false; }
            public void resetOtaEmergencyNumberDbFilePath() throws android.os.RemoteException {}
            public void sendDatagram(int p0, android.telephony.satellite.SatelliteDatagram p1, boolean p2, com.android.internal.telephony.IIntegerConsumer p3) throws android.os.RemoteException {}
            public void sendDeviceToDeviceMessage(int p0, int p1) throws android.os.RemoteException {}
            public void sendDialerSpecialCode(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String sendEnvelopeWithStatus(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int sendThermalMitigationRequest(int p0, android.telephony.ThermalMitigationRequest p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void sendVisualVoicemailSmsForSubscriber(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, java.lang.String p5, android.app.PendingIntent p6) throws android.os.RemoteException {}
            public void setActiveDeviceToDeviceTransport(java.lang.String p0) throws android.os.RemoteException {}
            public void setAdvancedCallingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public int setAllowedCarriers(android.telephony.CarrierRestrictionRules p0) throws android.os.RemoteException { return 0; }
            public boolean setAllowedNetworkTypesForReason(int p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public boolean setBoundGbaServiceOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean setBoundImsServiceOverride(int p0, int p1, boolean p2, int[] p3, java.lang.String p4) throws android.os.RemoteException { return false; }
            public void setCallComposerStatus(int p0, int p1) throws android.os.RemoteException {}
            public void setCallForwarding(int p0, android.telephony.CallForwardingInfo p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public void setCallWaitingStatus(int p0, boolean p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public boolean setCapabilitiesRequestTimeout(int p0, long p1) throws android.os.RemoteException { return false; }
            public void setCarrierServicePackageOverride(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public boolean setCarrierSingleRegistrationEnabledOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void setCarrierTestOverride(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) throws android.os.RemoteException {}
            public void setCellBroadcastIdRanges(int p0, java.util.List<android.telephony.CellBroadcastIdRange> p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public void setCellInfoListRate(int p0, int p1) throws android.os.RemoteException {}
            public void setCepEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean setCountryCodes(boolean p0, java.util.List<java.lang.String> p1, java.util.Map p2, java.lang.String p3, long p4) throws android.os.RemoteException { return false; }
            public void setCrossSimCallingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setCtsMode(boolean p0) throws android.os.RemoteException { return false; }
            public void setDataActivationState(int p0, int p1) throws android.os.RemoteException {}
            public void setDataEnabledForReason(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setDataRoamingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setDatagramControllerBooleanConfig(boolean p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean setDatagramControllerTimeoutDuration(boolean p0, int p1, long p2) throws android.os.RemoteException { return false; }
            public void setDeviceAlignedWithSatellite(boolean p0) throws android.os.RemoteException {}
            public void setDeviceSingleRegistrationEnabledOverride(java.lang.String p0) throws android.os.RemoteException {}
            public void setDeviceToDeviceForceEnabled(boolean p0) throws android.os.RemoteException {}
            public void setDeviceUceEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean setDomainSelectionServiceOverride(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean setEmergencyCallToSatelliteHandoverType(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void setEnableCellularIdentifierDisclosureNotifications(boolean p0) throws android.os.RemoteException {}
            public int setForbiddenPlmns(int p0, int p1, java.util.List<java.lang.String> p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public boolean setGbaReleaseTimeOverride(int p0, int p1) throws android.os.RemoteException { return false; }
            public int setIccLockEnabled(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public boolean setImsFeatureValidationOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int setImsProvisioningInt(int p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public void setImsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public int setImsProvisioningString(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void setImsRegistrationState(boolean p0) throws android.os.RemoteException {}
            public boolean setIsSatelliteCommunicationAllowedForCurrentLocationCache(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean setLine1NumberForDisplayForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean setMaxAllowedSatelliteDataModeForCtsTest(int p0) throws android.os.RemoteException { return false; }
            public void setMobileDataPolicyEnabled(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean setModemService(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setMultiSimCarrierRestriction(boolean p0) throws android.os.RemoteException {}
            public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException {}
            public boolean setNetworkSelectionModeManual(int p0, com.android.internal.telephony.OperatorInfo p1, boolean p2) throws android.os.RemoteException { return false; }
            public int setNrDualConnectivityState(int p0, int p1) throws android.os.RemoteException { return 0; }
            public void setNtnSmsSupported(boolean p0) throws android.os.RemoteException {}
            public void setNullCipherAndIntegrityEnabled(boolean p0) throws android.os.RemoteException {}
            public void setNullCipherNotificationsEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean setOemEnabledSatelliteProvisionStatus(boolean p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setOperatorBrandOverride(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean setRadio(boolean p0) throws android.os.RemoteException { return false; }
            public boolean setRadioForSubscriber(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setRadioPower(boolean p0) throws android.os.RemoteException { return false; }
            public void setRcsClientConfiguration(int p0, android.telephony.ims.RcsClientConfiguration p1) throws android.os.RemoteException {}
            public void setRcsProvisioningStatusForCapability(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void setRcsSingleRegistrationTestModeEnabled(boolean p0) throws android.os.RemoteException {}
            public void setRemovableEsimAsDefaultEuicc(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean setRoamingOverride(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4) throws android.os.RemoteException { return false; }
            public void setRttCapabilitySetting(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean setSatelliteAccessAllowedForSubscriptions(boolean p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean setSatelliteAccessControlOverlayConfigs(boolean p0, boolean p1, java.lang.String p2, long p3, java.util.List<java.lang.String> p4, java.lang.String p5) throws android.os.RemoteException { return false; }
            public boolean setSatelliteControllerTimeoutDuration(boolean p0, int p1, long p2) throws android.os.RemoteException { return false; }
            public boolean setSatelliteGatewayServicePackageName(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean setSatelliteIgnoreCellularServiceState(boolean p0) throws android.os.RemoteException { return false; }
            public boolean setSatelliteIgnorePlmnListFromStorage(boolean p0) throws android.os.RemoteException { return false; }
            public boolean setSatelliteListeningTimeoutDuration(long p0) throws android.os.RemoteException { return false; }
            public boolean setSatellitePointingUiClassName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean setSatelliteServicePackageName(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean setSatelliteSubscriberIdListChangedIntentComponent(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean setShouldSendDatagramToModemInDemoMode(boolean p0) throws android.os.RemoteException { return false; }
            public void setSignalStrengthUpdateRequest(int p0, android.telephony.SignalStrengthUpdateRequest p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setSimPowerStateForSlot(int p0, int p1) throws android.os.RemoteException {}
            public void setSimPowerStateForSlotWithCallback(int p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public boolean setSimSlotMapping(java.util.List<android.telephony.UiccSlotMapping> p0) throws android.os.RemoteException { return false; }
            public boolean setSupportDisableSatelliteWhileEnableInProgress(boolean p0, boolean p1) throws android.os.RemoteException { return false; }
            public void setSystemSelectionChannels(java.util.List<android.telephony.RadioAccessSpecifier> p0, int p1, com.android.internal.telephony.IBooleanConsumer p2) throws android.os.RemoteException {}
            public void setTestEuiccUiComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
            public boolean setTnScanningSupport(boolean p0, boolean p1, boolean p2) throws android.os.RemoteException { return false; }
            public int setVoNrEnabled(int p0, boolean p1) throws android.os.RemoteException { return 0; }
            public void setVoWiFiModeSetting(int p0, int p1) throws android.os.RemoteException {}
            public void setVoWiFiNonPersistent(int p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void setVoWiFiRoamingModeSetting(int p0, int p1) throws android.os.RemoteException {}
            public void setVoWiFiRoamingSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void setVoWiFiSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void setVoiceActivationState(int p0, int p1) throws android.os.RemoteException {}
            public boolean setVoiceMailNumber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setVoiceServiceStateOverride(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setVoicemailRingtoneUri(java.lang.String p0, android.telecom.PhoneAccountHandle p1, android.net.Uri p2) throws android.os.RemoteException {}
            public void setVoicemailVibrationEnabled(java.lang.String p0, android.telecom.PhoneAccountHandle p1, boolean p2) throws android.os.RemoteException {}
            public void setVtSettingEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void showSwitchToManagedProfileDialog() throws android.os.RemoteException {}
            public void shutdownMobileRadios() throws android.os.RemoteException {}
            public void startEmergencyCallbackMode() throws android.os.RemoteException {}
            public void startSatelliteTransmissionUpdates(com.android.internal.telephony.IIntegerConsumer p0, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p1) throws android.os.RemoteException {}
            public void stopNetworkScan(int p0, int p1) throws android.os.RemoteException {}
            public void stopSatelliteTransmissionUpdates(com.android.internal.telephony.IIntegerConsumer p0, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p1) throws android.os.RemoteException {}
            public boolean supplyPinForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int[] supplyPinReportResultForSubscriber(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean supplyPukForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public int[] supplyPukReportResultForSubscriber(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void switchMultiSimConfig(int p0) throws android.os.RemoteException {}
            @java.lang.Deprecated
            public boolean switchSlots(int[] p0) throws android.os.RemoteException { return false; }
            public void toggleRadioOnOff() throws android.os.RemoteException {}
            public void toggleRadioOnOffForSubscriber(int p0) throws android.os.RemoteException {}
            public void triggerRcsReconfiguration(int p0) throws android.os.RemoteException {}
            public boolean uncapMaxAllowedSatelliteDataMode() throws android.os.RemoteException { return false; }
            public void unenrollSimFromAutoPinManagement(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void unregisterFeatureProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IFeatureProvisioningCallback p1) throws android.os.RemoteException {}
            public void unregisterForCapabilitiesChanged(android.telephony.satellite.ISatelliteCapabilitiesCallback p0) throws android.os.RemoteException {}
            public void unregisterForCommunicationAccessStateChanged(int p0, android.telephony.satellite.ISatelliteCommunicationAccessStateCallback p1) throws android.os.RemoteException {}
            public void unregisterForIncomingDatagram(android.telephony.satellite.ISatelliteDatagramCallback p0) throws android.os.RemoteException {}
            public void unregisterForModemStateChanged(android.telephony.satellite.ISatelliteModemStateCallback p0) throws android.os.RemoteException {}
            public void unregisterForNtnSignalStrengthChanged(android.telephony.satellite.INtnSignalStrengthCallback p0) throws android.os.RemoteException {}
            public void unregisterForSatelliteDisallowedReasonsChanged(android.telephony.satellite.ISatelliteDisallowedReasonsCallback p0) throws android.os.RemoteException {}
            public void unregisterForSatelliteProvisionStateChanged(android.telephony.satellite.ISatelliteProvisionStateCallback p0) throws android.os.RemoteException {}
            public void unregisterForSatelliteSupportedStateChanged(com.android.internal.telephony.IBooleanConsumer p0) throws android.os.RemoteException {}
            public void unregisterForSelectedNbIotSatelliteSubscriptionChanged(android.telephony.satellite.ISelectedNbIotSatelliteSubscriptionCallback p0) throws android.os.RemoteException {}
            public void unregisterImsEmergencyRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
            public void unregisterImsFeatureCallback(com.android.ims.internal.IImsServiceFeatureCallback p0) throws android.os.RemoteException {}
            public void unregisterImsProvisioningChangedCallback(int p0, android.telephony.ims.aidl.IImsConfigCallback p1) throws android.os.RemoteException {}
            public void unregisterImsRegistrationCallback(int p0, android.telephony.ims.aidl.IImsRegistrationCallback p1) throws android.os.RemoteException {}
            public void unregisterImsStateCallback(com.android.internal.telephony.IImsStateCallback p0) throws android.os.RemoteException {}
            public void unregisterMmTelCapabilityCallback(int p0, android.telephony.ims.aidl.IImsCapabilityCallback p1) throws android.os.RemoteException {}
            public void unregisterRcsProvisioningCallback(int p0, android.telephony.ims.aidl.IRcsConfigCallback p1) throws android.os.RemoteException {}
            public void updateEmergencyNumberListTestMode(int p0, android.telephony.emergency.EmergencyNumber p1) throws android.os.RemoteException {}
            public void updateOtaEmergencyNumberDbFilePath(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
            public void updateServiceLocation() throws android.os.RemoteException {}
            public void updateServiceLocationWithPackageName(java.lang.String p0) throws android.os.RemoteException {}
            public void uploadCallComposerPicture(int p0, java.lang.String p1, java.lang.String p2, android.os.ParcelFileDescriptor p3, android.os.ResultReceiver p4) throws android.os.RemoteException {}
            public void userActivity() throws android.os.RemoteException {}
        }
    }
}
