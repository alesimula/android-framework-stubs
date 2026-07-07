package android.os.storage.operations.targets;

public abstract class OperationTarget {
    static final android.os.storage.operations.targets.OperationTarget INVALID_TARGET = null;
    static final java.lang.String KEY_TARGET_TYPE = "key_target_type";
    private static final java.lang.String TAG = "OperationTarget";
    public static final int TYPE_INVALID = -1;
    public static final int TYPE_PCC = 1;
    OperationTarget() {}
    OperationTarget(android.os.Bundle p0) {}
    public static android.os.storage.operations.targets.OperationTarget createTargetFromBundle(android.os.Bundle p0) { return null; }
    public static android.os.storage.operations.targets.OperationTarget getInvalidTarget() { return null; }
    android.os.Bundle getDataBundle() { return null; }
    public abstract int getTargetType();
    public abstract boolean isValid();
    public abstract java.lang.String toString();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TargetType {
    }
}
