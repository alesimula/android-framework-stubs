package com.android.internal.org.bouncycastle.math.ec;

class ValidityPrecompInfo implements com.android.internal.org.bouncycastle.math.ec.PreCompInfo {
    static final java.lang.String PRECOMP_NAME = "bc_validity";
    private boolean curveEquationPassed;
    private boolean failed;
    private boolean orderPassed;
    ValidityPrecompInfo() {}
    boolean hasCurveEquationPassed() { return false; }
    boolean hasFailed() { return false; }
    boolean hasOrderPassed() { return false; }
    void reportCurveEquationPassed() {}
    void reportFailed() {}
    void reportOrderPassed() {}
}
