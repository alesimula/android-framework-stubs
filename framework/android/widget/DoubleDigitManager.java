package android.widget;

class DoubleDigitManager {
    private java.lang.Integer intermediateDigit;
    private final android.widget.DoubleDigitManager.CallBack mCallBack = null;
    private final long timeoutInMillis = 0L;
    public DoubleDigitManager(long p0, android.widget.DoubleDigitManager.CallBack p1) {}
    public void reportDigit(int p0) {}

    static interface CallBack {
        public void singleDigitFinal(int p0);
        public boolean singleDigitIntermediate(int p0);
        public boolean twoDigitsFinal(int p0, int p1);
    }
}
