package android.hardware.radio.network;

public @interface AlertStatus {
    public static final int DETECTED = 2;
    public static final int MITIGATED_CELL_BARRED = 3;
    public static final int MITIGATED_CELL_DEPRIORITIZED = 4;
    public static final int MITIGATED_UNSPECIFIED = 5;
    public static final int NOT_DETECTED = 1;
    public static final int UNSPECIFIED = 0;

    public static interface $ {
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
        public static java.lang.String toString(int p0) { return null; }
    }
}
