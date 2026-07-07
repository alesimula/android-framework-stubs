package android.hardware.biometrics;

public final class PromptContentViewWithMoreOptionsButton implements android.hardware.biometrics.PromptContentViewParcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.PromptContentViewWithMoreOptionsButton> CREATOR = null;
    static final int MAX_DESCRIPTION_CHARACTER_NUMBER = 225;
    private static final java.lang.String TAG = "PromptContentViewWithMoreOptionsButton";
    private android.hardware.biometrics.BiometricPrompt.ButtonInfo mButtonInfo;
    private final java.lang.String mDescription = null;
    private android.content.DialogInterface.OnClickListener mListener;
    private PromptContentViewWithMoreOptionsButton(android.os.Parcel p0) {}
    private PromptContentViewWithMoreOptionsButton(java.lang.String p0, java.util.concurrent.Executor p1, android.content.DialogInterface.OnClickListener p2) {}
    public int describeContents() { return 0; }
    android.hardware.biometrics.BiometricPrompt.ButtonInfo getButtonInfo() { return null; }
    public java.lang.String getDescription() { return null; }
    public android.content.DialogInterface.OnClickListener getMoreOptionsButtonListener() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mDescription;
        private java.util.concurrent.Executor mExecutor;
        private android.content.DialogInterface.OnClickListener mListener;
        public Builder() {}
        public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton build() { return null; }
        public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder setDescription(java.lang.String p0) { return null; }
        public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder setMoreOptionsButtonListener(java.util.concurrent.Executor p0, android.content.DialogInterface.OnClickListener p1) { return null; }
    }
}
