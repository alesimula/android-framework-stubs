package com.android.internal.hidden_from_bootclasspath.com.android.telephony.flags;

public final class Flags {
    private static com.android.internal.hidden_from_bootclasspath.com.android.telephony.flags.FeatureFlags FEATURE_FLAGS;
    public static final java.lang.String FLAG_ENABLE_ONS_MAINLINE_API = "com.android.telephony.flags.enable_ons_mainline_api";
    public static final java.lang.String FLAG_PHONE_NUMBER_PARSING_API = "com.android.telephony.flags.phone_number_parsing_api";
    public static final java.lang.String FLAG_SUPPORT_GET_PHONE_NUMBER_TS43 = "com.android.telephony.flags.support_get_phone_number_ts43";
    public Flags() {}
    public static boolean enableOnsMainlineApi() { return false; }
    public static boolean phoneNumberParsingApi() { return false; }
    public static boolean supportGetPhoneNumberTs43() { return false; }
}
