package android.audio.policy.configuration.V7_0;

public class DevicePorts {
    private java.util.List<android.audio.policy.configuration.V7_0.DevicePorts.DevicePort> devicePort;
    public DevicePorts() {}
    static android.audio.policy.configuration.V7_0.DevicePorts read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    public java.util.List<android.audio.policy.configuration.V7_0.DevicePorts.DevicePort> getDevicePort() { return null; }

    public static class DevicePort {
        private java.lang.Boolean _default;
        private java.lang.String address;
        private java.util.List<java.lang.String> encodedFormats;
        private android.audio.policy.configuration.V7_0.Gains gains;
        private java.util.List<android.audio.policy.configuration.V7_0.Profile> profile;
        private android.audio.policy.configuration.V7_0.Role role;
        private java.lang.String tagName;
        private java.lang.String type;
        public DevicePort() {}
        static android.audio.policy.configuration.V7_0.DevicePorts.DevicePort read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
        public java.lang.String getAddress() { return null; }
        public java.util.List<java.lang.String> getEncodedFormats() { return null; }
        public android.audio.policy.configuration.V7_0.Gains getGains() { return null; }
        public java.util.List<android.audio.policy.configuration.V7_0.Profile> getProfile() { return null; }
        public android.audio.policy.configuration.V7_0.Role getRole() { return null; }
        public java.lang.String getTagName() { return null; }
        public java.lang.String getType() { return null; }
        public boolean get_default() { return false; }
        boolean hasAddress() { return false; }
        boolean hasEncodedFormats() { return false; }
        boolean hasGains() { return false; }
        boolean hasRole() { return false; }
        boolean hasTagName() { return false; }
        boolean hasType() { return false; }
        boolean has_default() { return false; }
        public void setAddress(java.lang.String p0) {}
        public void setEncodedFormats(java.util.List<java.lang.String> p0) {}
        public void setGains(android.audio.policy.configuration.V7_0.Gains p0) {}
        public void setRole(android.audio.policy.configuration.V7_0.Role p0) {}
        public void setTagName(java.lang.String p0) {}
        public void setType(java.lang.String p0) {}
        public void set_default(boolean p0) {}
    }
}
