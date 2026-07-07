package com.android.internal.hidden_from_bootclasspath.android.security.keystore2;

public final class Flags {
    public static final java.lang.String FLAG_ATOMS_V2 = "android.security.keystore2.atoms_v2";
    public static final java.lang.String FLAG_DISABLE_LEGACY_KEYSTORE_GET = "android.security.keystore2.disable_legacy_keystore_get";
    public static final java.lang.String FLAG_DISABLE_LEGACY_KEYSTORE_PUT_V2 = "android.security.keystore2.disable_legacy_keystore_put_v2";
    public static final java.lang.String FLAG_IMPORT_PREVIOUSLY_EMULATED_KEYS = "android.security.keystore2.import_previously_emulated_keys";
    public static final java.lang.String FLAG_LIMIT_KEYS_PER_UID = "android.security.keystore2.limit_keys_per_uid";
    public static final java.lang.String FLAG_MAKE_ID_ATTESTATION_FEATURE_PUBLIC = "android.security.keystore2.make_id_attestation_feature_public";
    public static final java.lang.String FLAG_MLDSA_SUPPORT = "android.security.keystore2.mldsa_support";
    public static final java.lang.String FLAG_MLKEM_SUPPORT = "android.security.keystore2.mlkem_support";
    public static final java.lang.String FLAG_WAL_DB_JOURNALMODE_V3 = "android.security.keystore2.wal_db_journalmode_v3";
    public Flags() {}
    public static boolean atomsV2() { return false; }
    public static boolean disableLegacyKeystoreGet() { return false; }
    public static boolean disableLegacyKeystorePutV2() { return false; }
    public static boolean importPreviouslyEmulatedKeys() { return false; }
    public static boolean limitKeysPerUid() { return false; }
    public static boolean makeIdAttestationFeaturePublic() { return false; }
    public static boolean mldsaSupport() { return false; }
    public static boolean mlkemSupport() { return false; }
    public static boolean walDbJournalmodeV3() { return false; }
}
