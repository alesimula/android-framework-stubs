package com.android.internal.os;

public class CpuScalingPolicyReader {
    private static final java.lang.String CPUFREQ_DIR = "/sys/devices/system/cpu/cpufreq";
    private static final java.lang.String FILE_NAME_CPUINFO_CUR_FREQ = "cpuinfo_cur_freq";
    private static final java.lang.String FILE_NAME_RELATED_CPUS = "related_cpus";
    private static final java.lang.String FILE_NAME_SCALING_AVAILABLE_FREQUENCIES = "scaling_available_frequencies";
    private static final java.lang.String FILE_NAME_SCALING_BOOST_FREQUENCIES = "scaling_boost_frequencies";
    private static final java.util.regex.Pattern POLICY_PATTERN = null;
    private static final java.lang.String TAG = "CpuScalingPolicyReader";
    private final java.lang.String mCpuFreqDir = null;
    public CpuScalingPolicyReader() {}
    public CpuScalingPolicyReader(java.lang.String p0) {}
    private static int[] readIntsFromFile(java.io.File p0) { return null; }
    public com.android.internal.os.CpuScalingPolicies read() { return null; }
}
