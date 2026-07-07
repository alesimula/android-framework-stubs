package android.text.method;

public abstract class MetaKeyKeyListener {
    private static final java.lang.Object ALT = null;
    private static final java.lang.Object CAP = null;
    private static final int LOCKED = 67108881;
    private static final int LOCKED_RETURN_VALUE = 2;
    public static final int META_ALT_LOCKED = 512;
    private static final long META_ALT_MASK = 565157566611970L;
    public static final int META_ALT_ON = 2;
    private static final long META_ALT_PRESSED = 2199023255552L;
    private static final long META_ALT_RELEASED = 562949953421312L;
    private static final long META_ALT_USED = 8589934592L;
    public static final int META_CAP_LOCKED = 256;
    private static final long META_CAP_PRESSED = 1099511627776L;
    private static final long META_CAP_RELEASED = 281474976710656L;
    private static final long META_CAP_USED = 4294967296L;
    public static final int META_SELECTING = 2048;
    private static final long META_SHIFT_MASK = 282578783305985L;
    public static final int META_SHIFT_ON = 1;
    public static final int META_SYM_LOCKED = 1024;
    private static final long META_SYM_MASK = 1130315133223940L;
    public static final int META_SYM_ON = 4;
    private static final long META_SYM_PRESSED = 4398046511104L;
    private static final long META_SYM_RELEASED = 1125899906842624L;
    private static final long META_SYM_USED = 17179869184L;
    private static final int PRESSED = 16777233;
    private static final int PRESSED_RETURN_VALUE = 1;
    private static final int RELEASED = 33554449;
    private static final java.lang.Object SELECTING = null;
    private static final java.lang.Object SYM = null;
    private static final int USED = 50331665;
    public MetaKeyKeyListener() {}
    private static void adjust(android.text.Spannable p0, java.lang.Object p1) {}
    public static long adjustMetaAfterKeypress(long p0) { return 0L; }
    public static void adjustMetaAfterKeypress(android.text.Spannable p0) {}
    public static void clearMetaKeyState(android.text.Editable p0, int p1) {}
    private static int getActive(java.lang.CharSequence p0, java.lang.Object p1, int p2, int p3) { return 0; }
    public static final int getMetaState(long p0) { return 0; }
    public static final int getMetaState(long p0, int p1) { return 0; }
    public static final int getMetaState(java.lang.CharSequence p0) { return 0; }
    public static final int getMetaState(java.lang.CharSequence p0, int p1) { return 0; }
    public static final int getMetaState(java.lang.CharSequence p0, int p1, android.view.KeyEvent p2) { return 0; }
    public static final int getMetaState(java.lang.CharSequence p0, android.view.KeyEvent p1) { return 0; }
    public static long handleKeyDown(long p0, int p1, android.view.KeyEvent p2) { return 0L; }
    public static long handleKeyUp(long p0, int p1, android.view.KeyEvent p2) { return 0L; }
    public static boolean isMetaTracker(java.lang.CharSequence p0, java.lang.Object p1) { return false; }
    public static boolean isSelectingMetaTracker(java.lang.CharSequence p0, java.lang.Object p1) { return false; }
    private static long press(long p0, int p1, long p2, long p3, long p4, long p5, long p6) { return 0L; }
    private void press(android.text.Editable p0, java.lang.Object p1) {}
    private static long release(long p0, int p1, long p2, long p3, long p4, long p5, android.view.KeyEvent p6) { return 0L; }
    private void release(android.text.Editable p0, java.lang.Object p1, android.view.KeyEvent p2) {}
    private static void resetLock(android.text.Spannable p0, java.lang.Object p1) {}
    public static long resetLockedMeta(long p0) { return 0L; }
    protected static void resetLockedMeta(android.text.Spannable p0) {}
    public static void resetMetaState(android.text.Spannable p0) {}
    public static void startSelecting(android.view.View p0, android.text.Spannable p1) {}
    public static void stopSelecting(android.view.View p0, android.text.Spannable p1) {}
    public long clearMetaKeyState(long p0, int p1) { return 0L; }
    public void clearMetaKeyState(android.view.View p0, android.text.Editable p1, int p2) {}
    public boolean onKeyDown(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public boolean onKeyUp(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
}
