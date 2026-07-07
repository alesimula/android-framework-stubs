package android.telephony;

public final class VisualVoicemailSms implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.VisualVoicemailSms> CREATOR = null;
    private final android.os.Bundle mFields = null;
    private final java.lang.String mMessageBody = null;
    private final java.lang.String mPrefix = null;
    VisualVoicemailSms(android.telephony.VisualVoicemailSms.Builder p0) {}
    public int describeContents() { return 0; }
    public android.os.Bundle getFields() { return null; }
    public java.lang.String getMessageBody() { return null; }
    public android.telecom.PhoneAccountHandle getPhoneAccountHandle() { return null; }
    public java.lang.String getPrefix() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private android.os.Bundle mFields;
        private java.lang.String mMessageBody;
        private java.lang.String mPrefix;
        public Builder() {}
        public android.telephony.VisualVoicemailSms build() { return null; }
        public android.telephony.VisualVoicemailSms.Builder setFields(android.os.Bundle p0) { return null; }
        public android.telephony.VisualVoicemailSms.Builder setMessageBody(java.lang.String p0) { return null; }
        public android.telephony.VisualVoicemailSms.Builder setPhoneAccountHandle(android.telecom.PhoneAccountHandle p0) { return null; }
        public android.telephony.VisualVoicemailSms.Builder setPrefix(java.lang.String p0) { return null; }
    }
}
