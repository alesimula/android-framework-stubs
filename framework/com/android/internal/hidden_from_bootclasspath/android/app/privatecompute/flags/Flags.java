package com.android.internal.hidden_from_bootclasspath.android.app.privatecompute.flags;

public final class Flags {
    public static final java.lang.String FLAG_ENABLE_ALLOW_COMPONENT_ACCESS = "android.app.privatecompute.flags.enable_allow_component_access";
    public static final java.lang.String FLAG_ENABLE_INTENT_CLASSIFICATION = "android.app.privatecompute.flags.enable_intent_classification";
    public static final java.lang.String FLAG_ENABLE_PCC_ASSISTANT_EGRESS = "android.app.privatecompute.flags.enable_pcc_assistant_egress";
    public static final java.lang.String FLAG_ENABLE_PCC_AUDITABILITY_UPDATES = "android.app.privatecompute.flags.enable_pcc_auditability_updates";
    public static final java.lang.String FLAG_ENABLE_PCC_AUDIT_LOG_PCC_TO_PCS_LOGGING = "android.app.privatecompute.flags.enable_pcc_audit_log_pcc_to_pcs_logging";
    public static final java.lang.String FLAG_ENABLE_PCC_FRAMEWORK_SUPPORT_V2 = "android.app.privatecompute.flags.enable_pcc_framework_support_v2";
    public static final java.lang.String FLAG_ENABLE_PCC_WEARABLE_SENSING_SERVICE = "android.app.privatecompute.flags.enable_pcc_wearable_sensing_service";
    public static final java.lang.String FLAG_IMPLEMENT_BACKOFF_ON_PCC_SERVICE_CRASH = "android.app.privatecompute.flags.implement_backoff_on_pcc_service_crash";
    public static final java.lang.String FLAG_IMPLEMENT_BACKOFF_ON_PCC_SERVICE_CRASH_V2 = "android.app.privatecompute.flags.implement_backoff_on_pcc_service_crash_v2";
    public static final java.lang.String FLAG_PCC_CALLER_CHECKS_CHANGES = "android.app.privatecompute.flags.pcc_caller_checks_changes";
    public static final java.lang.String FLAG_PCC_PERMISSION_CHANGES_V2 = "android.app.privatecompute.flags.pcc_permission_changes_v2";
    public Flags() {}
    public static boolean enableAllowComponentAccess() { return false; }
    public static boolean enableIntentClassification() { return false; }
    public static boolean enablePccAssistantEgress() { return false; }
    public static boolean enablePccAuditLogPccToPcsLogging() { return false; }
    public static boolean enablePccAuditabilityUpdates() { return false; }
    public static boolean enablePccFrameworkSupportV2() { return false; }
    public static boolean enablePccWearableSensingService() { return false; }
    public static boolean implementBackoffOnPccServiceCrash() { return false; }
    public static boolean implementBackoffOnPccServiceCrashV2() { return false; }
    public static boolean pccCallerChecksChanges() { return false; }
    public static boolean pccPermissionChangesV2() { return false; }
}
