package com.android.internal.hidden_from_bootclasspath.com.android.providers.media.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.providers.media.flags.FeatureFlags {
    private java.util.Map<java.lang.String, java.lang.Boolean> mFinalizedFlags;
    private java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.providers.media.flags.FeatureFlags, ?>, ?> mGetGenericValueImpl;
    private java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.providers.media.flags.FeatureFlags>> mGetValueImpl;
    private java.util.Set<java.lang.String> mReadOnlyFlagsSet;
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.providers.media.flags.FeatureFlags>> p0) {}
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.providers.media.flags.FeatureFlags>> p0, java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.providers.media.flags.FeatureFlags, ?>, ?> p1) {}
    public boolean accessMediaOwnerPackageNamePermission() { return false; }
    public boolean audioSampleColumns() { return false; }
    public boolean cloudMediaProviderSearch() { return false; }
    public boolean cloudProviderAlbumsAsCategoryApi() { return false; }
    public boolean enableBackupAndRestore() { return false; }
    public boolean enableCloudMediaProviderCapabilities() { return false; }
    public boolean enableDeletedFilesApi() { return false; }
    public boolean enableEmbeddedPhotopicker() { return false; }
    public boolean enableEmbeddedPickerExpandedHighlightTypeApi() { return false; }
    public boolean enableEmbeddedPickerV2Apis() { return false; }
    public boolean enableExclusionListForDefaultFolders() { return false; }
    public boolean enableGainmapDetection() { return false; }
    public boolean enableLocalMediaProviderCapabilities() { return false; }
    public boolean enableMarkIsFavoriteStatusApi() { return false; }
    public boolean enableMarkMediaAsFavoriteApi() { return false; }
    public boolean enableMediaProcessingService() { return false; }
    public boolean enableMediaSearch() { return false; }
    public boolean enableMimeTypeFixForAndroid15() { return false; }
    public boolean enableModernPhotopicker() { return false; }
    public boolean enableOemMetadata() { return false; }
    public boolean enableOemMetadataUpdate() { return false; }
    public boolean enableOemMetadataUsingMimetype() { return false; }
    public boolean enablePhotopickerDatescrubber() { return false; }
    public boolean enablePhotopickerSearch() { return false; }
    public boolean enablePhotopickerSelectionParamsApi() { return false; }
    public boolean enablePhotopickerUiCustomizationParamsApi() { return false; }
    public boolean enablePickerHighlightSearchResultsApis() { return false; }
    public boolean enablePickerLocationMetadataApi() { return false; }
    public boolean enableSpecialFormatColumn() { return false; }
    public boolean enableStableUrisForExternalPrimaryVolume() { return false; }
    public boolean enableStableUrisForPublicVolume() { return false; }
    public boolean enableTrashAndRestoreByFilePathApi() { return false; }
    public boolean enableUnicodeCheck() { return false; }
    public boolean excludeUnreliableVolumes() { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    protected <T extends java.lang.Object> T getGenericValue(java.lang.String p0, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.providers.media.flags.FeatureFlags, T> p1) { return null; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.providers.media.flags.FeatureFlags> p1) { return false; }
    public boolean indexMediaLatitudeLongitude() { return false; }
    public boolean inferredMediaDate() { return false; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
    public boolean mediaCognitionService() { return false; }
    public boolean motionPhotoIntent() { return false; }
    public boolean pickOrderedImages() { return false; }
    public boolean pickerAccentColor() { return false; }
    public boolean pickerDefaultTab() { return false; }
    public boolean pickerPreSelectionExtra() { return false; }
    public boolean pickerRecentSelection() { return false; }
    public boolean revokeAccessOwnedPhotos() { return false; }
    public boolean versionLockdown() { return false; }
}
