package android.os;

@android.annotation.SystemApi
public abstract class UpdateEngineCallback {
    public UpdateEngineCallback() {}
    public abstract void onPayloadApplicationComplete(int p0);
    public abstract void onStatusUpdate(int p0, float p1);
}
