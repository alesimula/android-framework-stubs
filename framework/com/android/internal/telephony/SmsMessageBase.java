package com.android.internal.telephony;

public abstract class SmsMessageBase {
    public static final java.util.regex.Pattern NAME_ADDR_EMAIL_PATTERN = null;
    protected java.lang.String mEmailBody;
    protected java.lang.String mEmailFrom;
    protected int mIndexOnIcc;
    protected boolean mIsEmail;
    protected boolean mIsMwi;
    protected java.lang.String mMessageBody;
    public int mMessageRef;
    protected boolean mMwiDontStore;
    protected boolean mMwiSense;
    protected com.android.internal.telephony.SmsAddress mOriginatingAddress;
    protected byte[] mPdu;
    protected java.lang.String mPseudoSubject;
    protected int mReceivedEncodingType;
    protected com.android.internal.telephony.SmsAddress mRecipientAddress;
    protected java.lang.String mScAddress;
    protected long mScTimeMillis;
    protected int mStatusOnIcc;
    protected byte[] mUserData;
    protected com.android.internal.telephony.SmsHeader mUserDataHeader;
    public SmsMessageBase() {}
    public static com.android.internal.telephony.GsmAlphabet.TextEncodingDetails calcUnicodeEncodingDetails(java.lang.CharSequence p0) { return null; }
    private static java.lang.String extractAddrSpec(java.lang.String p0) { return null; }
    public static int findNextUnicodePosition(int p0, int p1, java.lang.CharSequence p2) { return 0; }
    public static boolean isEmailAddress(java.lang.String p0) { return false; }
    private static boolean isRegionalIndicatorSymbol(int p0) { return false; }
    protected void extractEmailAddressFromMessageBody() {}
    public java.lang.String getDisplayMessageBody() { return null; }
    public java.lang.String getDisplayOriginatingAddress() { return null; }
    public java.lang.String getEmailBody() { return null; }
    public java.lang.String getEmailFrom() { return null; }
    public int getIndexOnIcc() { return 0; }
    public java.lang.String getMessageBody() { return null; }
    public abstract com.android.internal.telephony.SmsConstants.MessageClass getMessageClass();
    public android.telephony.NetworkSecurityEvent getNetworkSecurityEvent() { return null; }
    public java.lang.String getOriginatingAddress() { return null; }
    public byte[] getPdu() { return null; }
    public abstract int getProtocolIdentifier();
    public java.lang.String getPseudoSubject() { return null; }
    public int getReceivedEncodingType() { return 0; }
    public java.lang.String getRecipientAddress() { return null; }
    public java.lang.String getServiceCenterAddress() { return null; }
    public abstract int getStatus();
    public int getStatusOnIcc() { return 0; }
    public long getTimestampMillis() { return 0L; }
    public byte[] getUserData() { return null; }
    public com.android.internal.telephony.SmsHeader getUserDataHeader() { return null; }
    public abstract boolean isCphsMwiMessage();
    public boolean isEmail() { return false; }
    public abstract boolean isMWIClearMessage();
    public abstract boolean isMWISetMessage();
    public abstract boolean isMwiDontStore();
    public abstract boolean isReplace();
    public abstract boolean isReplyPathPresent();
    public abstract boolean isStatusReportMessage();
    protected void parseMessageBody() {}

    public static abstract class SubmitPduBase {
        public byte[] encodedMessage;
        public byte[] encodedScAddress;
        public SubmitPduBase() {}
        public java.lang.String toString() { return null; }
    }
}
