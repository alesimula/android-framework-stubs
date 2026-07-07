package com.android.internal.widget;

public class LockscreenCredential implements android.os.Parcelable, java.lang.AutoCloseable {
    public static final android.os.Parcelable.Creator<com.android.internal.widget.LockscreenCredential> CREATOR = null;
    private byte[] mCredential;
    private final boolean mHasInvalidChars = false;
    private final boolean mIsFromParcel = false;
    private final boolean mIsUnifiedProfilePassword = false;
    private final int mType = 0;
    private LockscreenCredential(int p0, java.lang.CharSequence p1) {}
    private LockscreenCredential(int p0, byte[] p1, boolean p2, boolean p3, boolean p4) {}
    private static byte[] charsToBytesTruncating(java.lang.CharSequence p0) { return null; }
    public static com.android.internal.widget.LockscreenCredential createNone() { return null; }
    public static com.android.internal.widget.LockscreenCredential createPassword(java.lang.CharSequence p0) { return null; }
    public static com.android.internal.widget.LockscreenCredential createPasswordOrNone(java.lang.CharSequence p0) { return null; }
    public static com.android.internal.widget.LockscreenCredential createPattern(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0) { return null; }
    public static com.android.internal.widget.LockscreenCredential createPin(java.lang.CharSequence p0) { return null; }
    public static com.android.internal.widget.LockscreenCredential createPinOrNone(java.lang.CharSequence p0) { return null; }
    public static com.android.internal.widget.LockscreenCredential createUnifiedProfilePassword(byte[] p0) { return null; }
    private void ensureNotZeroized() {}
    private static boolean hasInvalidChars(java.lang.CharSequence p0) { return false; }
    public static java.lang.String passwordToHistoryHash(byte[] p0, byte[] p1, byte[] p2) { return null; }
    public static void zeroizeIfFromParcel(com.android.internal.widget.LockscreenCredential p0) {}
    public boolean checkAgainstStoredType(int p0) { return false; }
    public void close() {}
    public int describeContents() { return 0; }
    public com.android.internal.widget.LockscreenCredential duplicate() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void finalize() {}
    public byte[] getCredential() { return null; }
    public int getType() { return 0; }
    public boolean hasInvalidChars() { return false; }
    public int hashCode() { return 0; }
    public boolean isNone() { return false; }
    public boolean isPassword() { return false; }
    public boolean isPattern() { return false; }
    public boolean isPin() { return false; }
    public boolean isUnifiedProfilePassword() { return false; }
    public java.lang.String passwordToHistoryHash(byte[] p0, byte[] p1) { return null; }
    public int size() { return 0; }
    public void validateBasicRequirements() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void zeroize() {}
}
