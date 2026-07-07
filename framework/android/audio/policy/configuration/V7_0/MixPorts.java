package android.audio.policy.configuration.V7_0;

public class MixPorts {
    private java.util.List<android.audio.policy.configuration.V7_0.MixPorts.MixPort> mixPort;
    public MixPorts() {}
    static android.audio.policy.configuration.V7_0.MixPorts read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    public java.util.List<android.audio.policy.configuration.V7_0.MixPorts.MixPort> getMixPort() { return null; }

    public static class MixPort {
        private java.util.List<android.audio.policy.configuration.V7_0.AudioInOutFlag> flags;
        private android.audio.policy.configuration.V7_0.Gains gains;
        private java.lang.Long maxActiveCount;
        private java.lang.Long maxOpenCount;
        private java.lang.String name;
        private java.util.List<android.audio.policy.configuration.V7_0.AudioUsage> preferredUsage;
        private java.util.List<android.audio.policy.configuration.V7_0.Profile> profile;
        private android.audio.policy.configuration.V7_0.Role role;
        public MixPort() {}
        static android.audio.policy.configuration.V7_0.MixPorts.MixPort read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
        public java.util.List<android.audio.policy.configuration.V7_0.AudioInOutFlag> getFlags() { return null; }
        public android.audio.policy.configuration.V7_0.Gains getGains() { return null; }
        public long getMaxActiveCount() { return 0L; }
        public long getMaxOpenCount() { return 0L; }
        public java.lang.String getName() { return null; }
        public java.util.List<android.audio.policy.configuration.V7_0.AudioUsage> getPreferredUsage() { return null; }
        public java.util.List<android.audio.policy.configuration.V7_0.Profile> getProfile() { return null; }
        public android.audio.policy.configuration.V7_0.Role getRole() { return null; }
        boolean hasFlags() { return false; }
        boolean hasGains() { return false; }
        boolean hasMaxActiveCount() { return false; }
        boolean hasMaxOpenCount() { return false; }
        boolean hasName() { return false; }
        boolean hasPreferredUsage() { return false; }
        boolean hasRole() { return false; }
        public void setFlags(java.util.List<android.audio.policy.configuration.V7_0.AudioInOutFlag> p0) {}
        public void setGains(android.audio.policy.configuration.V7_0.Gains p0) {}
        public void setMaxActiveCount(long p0) {}
        public void setMaxOpenCount(long p0) {}
        public void setName(java.lang.String p0) {}
        public void setPreferredUsage(java.util.List<android.audio.policy.configuration.V7_0.AudioUsage> p0) {}
        public void setRole(android.audio.policy.configuration.V7_0.Role p0) {}
    }
}
