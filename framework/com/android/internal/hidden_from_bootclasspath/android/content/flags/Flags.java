package com.android.internal.hidden_from_bootclasspath.android.content.flags;

public final class Flags {
    public static final java.lang.String FLAG_ENABLE_BIND_PACKAGE_ISOLATED_PROCESS = "android.content.flags.enable_bind_package_isolated_process";
    public static final java.lang.String FLAG_ENABLE_CONTENT_PROVIDER_CLIENT_ANR_ON_CANCEL = "android.content.flags.enable_content_provider_client_anr_on_cancel";
    public static final java.lang.String FLAG_ENABLE_SYSTEM_CONTACTS_PICKER = "android.content.flags.enable_system_contacts_picker";
    public static final java.lang.String FLAG_ENABLE_UPDATE_SERVICE_BINDINGS = "android.content.flags.enable_update_service_bindings";
    public static final java.lang.String FLAG_STOP_VOICE_COMMAND = "android.content.flags.stop_voice_command";
    public static final java.lang.String FLAG_SYNCOPERATION_ENFORCE_BUNDLE_SANITIZATION = "android.content.flags.syncoperation_enforce_bundle_sanitization";
    public Flags() {}
    public static boolean enableBindPackageIsolatedProcess() { return false; }
    public static boolean enableContentProviderClientAnrOnCancel() { return false; }
    public static boolean enableSystemContactsPicker() { return false; }
    public static boolean enableUpdateServiceBindings() { return false; }
    public static boolean stopVoiceCommand() { return false; }
    public static boolean syncoperationEnforceBundleSanitization() { return false; }
}
