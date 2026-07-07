package android.util;

public class Base64 {
    static final boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;
    private Base64() {}
    public static byte[] decode(java.lang.String p0, int p1) { return null; }
    public static byte[] decode(byte[] p0, int p1) { return null; }
    public static byte[] decode(byte[] p0, int p1, int p2, int p3) { return null; }
    public static byte[] encode(byte[] p0, int p1) { return null; }
    public static byte[] encode(byte[] p0, int p1, int p2, int p3) { return null; }
    public static java.lang.String encodeToString(byte[] p0, int p1) { return null; }
    public static java.lang.String encodeToString(byte[] p0, int p1, int p2, int p3) { return null; }

    static abstract class Coder {
        public int op;
        public byte[] output;
        Coder() {}
        public abstract int maxOutputSize(int p0);
        public abstract boolean process(byte[] p0, int p1, int p2, boolean p3);
    }

    static class Decoder extends android.util.Base64.Coder {
        private static final int[] DECODE = null;
        private static final int[] DECODE_WEBSAFE = null;
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet = null;
        private int state;
        private int value;
        public Decoder(int p0, byte[] p1) { super(); }
        public int maxOutputSize(int p0) { return 0; }
        public boolean process(byte[] p0, int p1, int p2, boolean p3) { return false; }
        private static long[] $d2j$hex$bce79157$decode_J(java.lang.String p0) { return null; }
        private static int[] $d2j$hex$bce79157$decode_I(java.lang.String p0) { return null; }
        private static short[] $d2j$hex$bce79157$decode_S(java.lang.String p0) { return null; }
        private static byte[] $d2j$hex$bce79157$decode_B(java.lang.String p0) { return null; }
    }

    static class Encoder extends android.util.Base64.Coder {
        static final boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = null;
        private static final byte[] ENCODE_WEBSAFE = null;
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet = null;
        private int count;
        public final boolean do_cr = false;
        public final boolean do_newline = false;
        public final boolean do_padding = false;
        private final byte[] tail = null;
        int tailLen;
        public Encoder(int p0, byte[] p1) { super(); }
        public int maxOutputSize(int p0) { return 0; }
        public boolean process(byte[] p0, int p1, int p2, boolean p3) { return false; }
    }
}
