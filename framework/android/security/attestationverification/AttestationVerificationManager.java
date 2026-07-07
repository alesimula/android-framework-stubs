package android.security.attestationverification;

public class AttestationVerificationManager {
    public static final int FLAG_FAILURE_BOOT_STATE = 32;
    public static final int FLAG_FAILURE_CERTS = 4;
    public static final int FLAG_FAILURE_KEYSTORE_REQUIREMENTS = 16;
    public static final int FLAG_FAILURE_LOCAL_BINDING_REQUIREMENTS = 8;
    public static final int FLAG_FAILURE_PATCH_LEVEL_DIFF = 64;
    public static final int FLAG_FAILURE_UNKNOWN = 1;
    public static final int FLAG_FAILURE_UNSUPPORTED_PROFILE = 2;
    private static final java.time.Duration MAX_TOKEN_AGE = null;
    public static final java.lang.String PARAM_CHALLENGE = "localbinding.challenge";
    public static final java.lang.String PARAM_ID = "localbinding.id";
    public static final java.lang.String PARAM_MAX_PATCH_LEVEL_DIFF_MONTHS = "param_max_patch_level_diff_months";
    public static final java.lang.String PARAM_PUBLIC_KEY = "localbinding.public_key";
    public static final int PROFILE_APP_DEFINED = 1;
    public static final int PROFILE_PEER_DEVICE = 3;
    public static final int PROFILE_SELF_TRUSTED = 2;
    public static final int PROFILE_UNKNOWN = 0;
    private static final java.lang.String TAG = "AVF";
    public static final int TYPE_APP_DEFINED = 1;
    public static final int TYPE_CHALLENGE = 3;
    public static final int TYPE_PUBLIC_KEY = 2;
    public static final int TYPE_UNKNOWN = 0;
    private final android.content.Context mContext = null;
    private final android.security.attestationverification.IAttestationVerificationManagerService mService = null;
    public AttestationVerificationManager(android.content.Context p0, android.security.attestationverification.IAttestationVerificationManagerService p1) {}
    public static java.lang.String localBindingTypeToString(int p0) { return null; }
    public void verifyAttestation(android.security.attestationverification.AttestationProfile p0, int p1, android.os.Bundle p2, byte[] p3, java.util.concurrent.Executor p4, java.util.function.BiConsumer<java.lang.Integer, android.security.attestationverification.VerificationToken> p5) {}
    public int verifyToken(android.security.attestationverification.AttestationProfile p0, int p1, android.os.Bundle p2, android.security.attestationverification.VerificationToken p3, java.time.Duration p4) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttestationProfileId {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LocalBindingType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface VerificationResultFlags {
    }
}
