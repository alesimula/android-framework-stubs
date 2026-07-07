package android.app.admin;

public final class PasswordMetrics implements android.os.Parcelable {
    private static final int CHAR_DIGIT = 2;
    private static final int CHAR_LOWER_CASE = 0;
    private static final int CHAR_SYMBOL = 3;
    private static final int CHAR_UPPER_CASE = 1;
    public static final android.os.Parcelable.Creator<android.app.admin.PasswordMetrics> CREATOR = null;
    public static final int MAX_ALLOWED_SEQUENCE = 3;
    private static final java.lang.String TAG = "PasswordMetrics";
    public int credType;
    public int length;
    public int letters;
    public int lowerCase;
    public int nonLetter;
    public int nonNumeric;
    public int numeric;
    public int seqLength;
    public int symbols;
    public int upperCase;
    public PasswordMetrics(int p0) {}
    public PasswordMetrics(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    private PasswordMetrics(android.app.admin.PasswordMetrics p0) {}
    public static android.app.admin.PasswordMetrics applyComplexity(android.app.admin.PasswordMetrics p0, boolean p1, int p2) { return null; }
    private static android.app.admin.PasswordMetrics applyComplexity(android.app.admin.PasswordMetrics p0, boolean p1, android.app.admin.PasswordMetrics.ComplexityBucket p2) { return null; }
    private static int categoryChar(char p0) { return 0; }
    private static void comparePasswordMetrics(android.app.admin.PasswordMetrics p0, android.app.admin.PasswordMetrics.ComplexityBucket p1, android.app.admin.PasswordMetrics p2, java.util.ArrayList<com.android.internal.widget.PasswordValidationError> p3) {}
    public static int complexityLevelToMinQuality(int p0) { return 0; }
    public static android.app.admin.PasswordMetrics computeForCredential(com.android.internal.widget.LockscreenCredential p0) { return null; }
    private static android.app.admin.PasswordMetrics computeForPasswordOrPin(byte[] p0, boolean p1) { return null; }
    public static boolean isNumericOnly(java.lang.String p0) { return false; }
    private static int maxDiffCategory(int p0) { return 0; }
    public static int maxLengthSequence(byte[] p0) { return 0; }
    public static android.app.admin.PasswordMetrics merge(java.util.List<android.app.admin.PasswordMetrics> p0) { return null; }
    private void removeOverlapping() {}
    public static int sanitizeComplexityLevel(int p0) { return 0; }
    private boolean satisfiesBucket(android.app.admin.PasswordMetrics.ComplexityBucket p0) { return false; }
    public static java.util.List<com.android.internal.widget.PasswordValidationError> validateCredential(android.app.admin.PasswordMetrics p0, int p1, com.android.internal.widget.LockscreenCredential p2) { return null; }
    public static java.util.List<com.android.internal.widget.PasswordValidationError> validatePasswordMetrics(android.app.admin.PasswordMetrics p0, int p1, android.app.admin.PasswordMetrics p2) { return null; }
    public int describeContents() { return 0; }
    public int determineComplexity() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void maxWith(android.app.admin.PasswordMetrics p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface CharacterCatagory {
    }

    private static enum ComplexityBucket {
        BUCKET_HIGH,
        BUCKET_LOW,
        BUCKET_MEDIUM,
        BUCKET_NONE;
        private static final android.app.admin.PasswordMetrics.ComplexityBucket[] $VALUES = null;
        int mComplexityLevel;
        private ComplexityBucket() {}
        static android.app.admin.PasswordMetrics.ComplexityBucket forComplexity(int p0) { return null; }
        boolean allowsCredType(int p0) { return false; }
        boolean canHaveSequence() { return false; }
        int getMinimumLength(boolean p0) { return 0; }
    }
}
