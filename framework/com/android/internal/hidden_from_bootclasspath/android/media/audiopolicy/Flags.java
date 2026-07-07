package com.android.internal.hidden_from_bootclasspath.android.media.audiopolicy;

public final class Flags {
    public static final java.lang.String FLAG_AUDIO_MIX_POLICY_ORDERING = "android.media.audiopolicy.audio_mix_policy_ordering";
    public static final java.lang.String FLAG_AUDIO_POLICY_UPDATE_MIXING_RULES_API = "android.media.audiopolicy.audio_policy_update_mixing_rules_api";
    public static final java.lang.String FLAG_ENABLE_FADE_MANAGER_CONFIGURATION = "android.media.audiopolicy.enable_fade_manager_configuration";
    public static final java.lang.String FLAG_MULTI_ZONE_AUDIO = "android.media.audiopolicy.multi_zone_audio";
    public static final java.lang.String FLAG_VOLUME_GROUP_MANAGEMENT_UPDATE = "android.media.audiopolicy.volume_group_management_update";
    public Flags() {}
    public static boolean audioMixPolicyOrdering() { return false; }
    public static boolean audioPolicyUpdateMixingRulesApi() { return false; }
    public static boolean enableFadeManagerConfiguration() { return false; }
    public static boolean multiZoneAudio() { return false; }
    public static boolean volumeGroupManagementUpdate() { return false; }
}
