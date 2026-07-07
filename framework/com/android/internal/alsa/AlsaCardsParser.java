package com.android.internal.alsa;

public class AlsaCardsParser {
    protected static final boolean DEBUG = false;
    public static final int SCANSTATUS_EMPTY = 2;
    public static final int SCANSTATUS_FAIL = 1;
    public static final int SCANSTATUS_NOTSCANNED = -1;
    public static final int SCANSTATUS_SUCCESS = 0;
    private static final java.lang.String TAG = "AlsaCardsParser";
    private static final java.lang.String kAlsaFolderPath = "/proc/asound";
    private static final java.lang.String kCardsFilePath = "/proc/asound/cards";
    private static final java.lang.String kDeviceAddressPrefix = "/dev/bus/usb/";
    private static com.android.internal.alsa.LineTokenizer mTokenizer;
    private java.util.ArrayList<com.android.internal.alsa.AlsaCardsParser.AlsaCardRecord> mCardRecords;
    private int mScanStatus;
    public AlsaCardsParser() {}
    private void Log(java.lang.String p0) {}
    public com.android.internal.alsa.AlsaCardsParser.AlsaCardRecord findCardNumFor(java.lang.String p0) { return null; }
    public int getScanStatus() { return 0; }
    public int scan() { return 0; }

    public class AlsaCardRecord {
        private static final java.lang.String TAG = "AlsaCardRecord";
        private static final java.lang.String kUsbCardKeyStr = "at usb-";
        java.lang.String mCardDescription;
        java.lang.String mCardName;
        int mCardNum;
        java.lang.String mField1;
        private java.lang.String mUsbDeviceAddress;
        public AlsaCardRecord(com.android.internal.alsa.AlsaCardsParser p0) {}
        private boolean parse(java.lang.String p0, int p1) { return false; }
        public java.lang.String getCardDescription() { return null; }
        public java.lang.String getCardName() { return null; }
        public int getCardNum() { return 0; }
        boolean isUsb() { return false; }
        public void log(int p0) {}
        public void setDeviceAddress(java.lang.String p0) {}
        public java.lang.String textFormat() { return null; }
    }
}
