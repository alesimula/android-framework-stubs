package android.os;

public final class CpuHeadroomParams {
    public static final int CPU_HEADROOM_CALCULATION_TYPE_AVERAGE = 1;
    public static final int CPU_HEADROOM_CALCULATION_TYPE_MIN = 0;
    public final android.os.CpuHeadroomParamsInternal mInternal = null;
    private CpuHeadroomParams() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCalculationType() { return 0; }
    public long getCalculationWindowMillis() { return 0L; }
    public int[] getTids() { return null; }
    public int hashCode() { return 0; }
    public android.os.CpuHeadroomParams.Builder toBuilder() { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private int mCalculationType;
        private int mCalculationWindowMillis;
        private int[] mTids;
        public Builder() {}
        public Builder(android.os.CpuHeadroomParams p0) {}
        public android.os.CpuHeadroomParams build() { return null; }
        public android.os.CpuHeadroomParams.Builder setCalculationType(int p0) { return null; }
        public android.os.CpuHeadroomParams.Builder setCalculationWindowMillis(int p0) { return null; }
        public android.os.CpuHeadroomParams.Builder setTids(int... p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CpuHeadroomCalculationType {
    }
}
