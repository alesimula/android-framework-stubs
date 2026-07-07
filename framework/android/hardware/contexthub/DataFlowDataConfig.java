package android.hardware.contexthub;

@android.annotation.SystemApi
public final class DataFlowDataConfig {
    private static final int ELEMENT_SIZE_VARIABLE = -1;
    public static final int FORMAT_FIXED_SIZE = 0;
    public static final int FORMAT_VARIABLE_SIZE = 1;
    public static final int FORMAT_VARIABLE_SIZE_ALIGNED = 2;
    private final int mElementAlignment = 0;
    private final int mElementSize = 0;
    private final int mFormat = 0;
    private DataFlowDataConfig(int p0, int p1, int p2) {}
    public static android.hardware.contexthub.DataFlowDataConfig createFixedSize(int p0, int p1) { return null; }
    public static android.hardware.contexthub.DataFlowDataConfig createVariableSize() { return null; }
    public static android.hardware.contexthub.DataFlowDataConfig createVariableSizeAligned(int p0) { return null; }
    public int getElementAlignment() { return 0; }
    public int getElementSize() { return 0; }
    public int getFormat() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface DataFormat {
    }
}
