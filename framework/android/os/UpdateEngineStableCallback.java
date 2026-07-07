package android.os;

public abstract class UpdateEngineStableCallback {
    public UpdateEngineStableCallback() {}
    public abstract void onPayloadApplicationComplete(int p0);
    public abstract void onStatusUpdate(int p0, float p1);
}
