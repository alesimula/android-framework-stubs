package android.service.dreams;

public abstract class DreamManagerInternal {
    public DreamManagerInternal() {}
    public abstract boolean canStartDreaming(boolean p0);
    public abstract boolean dreamConditionActive();
    public abstract boolean isDreaming();
    public abstract void registerDreamManagerPolicyListener(android.service.dreams.DreamManagerInternal.DreamManagerPolicyListener p0);
    public abstract void registerDreamManagerStateListener(android.service.dreams.DreamManagerInternal.DreamManagerStateListener p0);
    public abstract void requestDream(int p0);
    public abstract void startDream(boolean p0, int p1);
    public abstract void stopDream(boolean p0, int p1);
    public abstract void unregisterDreamManagerPolicyListener(android.service.dreams.DreamManagerInternal.DreamManagerPolicyListener p0);
    public abstract void unregisterDreamManagerStateListener(android.service.dreams.DreamManagerInternal.DreamManagerStateListener p0);

    public static interface DreamManagerStateListener {
        default public void onDreamingStarted(int p0) {}
        default public void onDreamingStopped(int p0) {}
    }

    public static interface DreamManagerPolicyListener {
        default public void onDreamPolicyChanged(android.service.dreams.DreamPolicy p0) {}
        default public void onKeepDreamingWhenUnpluggingChanged(boolean p0) {}
    }
}
