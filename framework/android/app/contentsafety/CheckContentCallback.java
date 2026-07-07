package android.app.contentsafety;

@android.annotation.SystemApi
public interface CheckContentCallback {
    public void onClassification(java.util.List<android.app.contentsafety.ContentClassificationResult> p0);
    public void onClassificationComplete();
}
