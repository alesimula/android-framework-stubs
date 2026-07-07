package com.android.internal.telephony;

public class IccCardConstants {
    public static final java.lang.String INTENT_KEY_ICC_STATE = "ss";
    public static final java.lang.String INTENT_KEY_LOCKED_REASON = "reason";
    public static final java.lang.String INTENT_VALUE_ABSENT_ON_PERM_DISABLED = "PERM_DISABLED";
    public static final java.lang.String INTENT_VALUE_ICC_ABSENT = "ABSENT";
    public static final java.lang.String INTENT_VALUE_ICC_CARD_IO_ERROR = "CARD_IO_ERROR";
    public static final java.lang.String INTENT_VALUE_ICC_CARD_RESTRICTED = "CARD_RESTRICTED";
    public static final java.lang.String INTENT_VALUE_ICC_IMSI = "IMSI";
    public static final java.lang.String INTENT_VALUE_ICC_LOADED = "LOADED";
    public static final java.lang.String INTENT_VALUE_ICC_LOCKED = "LOCKED";
    public static final java.lang.String INTENT_VALUE_ICC_NOT_READY = "NOT_READY";
    public static final java.lang.String INTENT_VALUE_ICC_PRESENT = "PRESENT";
    public static final java.lang.String INTENT_VALUE_ICC_READY = "READY";
    public static final java.lang.String INTENT_VALUE_ICC_UNKNOWN = "UNKNOWN";
    public static final java.lang.String INTENT_VALUE_LOCKED_NETWORK = "NETWORK";
    public static final java.lang.String INTENT_VALUE_LOCKED_ON_PIN = "PIN";
    public static final java.lang.String INTENT_VALUE_LOCKED_ON_PUK = "PUK";
    public IccCardConstants() {}

    public static enum State {
        ABSENT,
        CARD_IO_ERROR,
        CARD_RESTRICTED,
        LOADED,
        NETWORK_LOCKED,
        NOT_READY,
        PERM_DISABLED,
        PIN_REQUIRED,
        PUK_REQUIRED,
        READY,
        UNKNOWN;
        private static final com.android.internal.telephony.IccCardConstants.State[] $VALUES = null;
        private State() {}
        public static com.android.internal.telephony.IccCardConstants.State intToState(int p0) throws java.lang.IllegalArgumentException { return null; }
        public boolean iccCardExist() { return false; }
        public boolean isPinLocked() { return false; }
    }
}
