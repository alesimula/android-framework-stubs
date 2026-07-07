package android.hardware.input;

public final class AppCustomizationAction extends android.hardware.input.CustomizationAction {
    private final android.hardware.input.AidlAppAction mAidlAppAction = null;
    public AppCustomizationAction(android.hardware.input.AidlAppAction p0) { super(); }
    private AppCustomizationAction(android.hardware.input.AppCustomizationAction.Builder p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.input.AidlAppAction getAidl() { return null; }
    public android.content.ComponentName getComponent() { return null; }
    public android.net.Uri getData() { return null; }
    public java.lang.String getIntentAction() { return null; }
    public int hashCode() { return 0; }

    public static final class Builder {
        private final android.content.ComponentName mComponent = null;
        private java.lang.String mComponentAction;
        private android.net.Uri mData;
        public Builder(android.content.ComponentName p0, java.lang.String p1) {}
        public android.hardware.input.AppCustomizationAction build() { return null; }
        public android.hardware.input.AppCustomizationAction.Builder setData(android.net.Uri p0) { return null; }
    }
}
