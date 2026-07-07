package android.app.timezonedetector;

public interface ITimeZoneDetectorService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.timezonedetector.ITimeZoneDetectorService";
    public void addListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException;
    public boolean confirmTimeZone(java.lang.String p0) throws android.os.RemoteException;
    public android.app.time.TimeZoneCapabilitiesAndConfig getCapabilitiesAndConfig() throws android.os.RemoteException;
    public java.lang.String getHomeTimeZone() throws android.os.RemoteException;
    public android.app.time.TimeZoneState getTimeZoneState() throws android.os.RemoteException;
    public void removeListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException;
    public boolean setManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException;
    public boolean suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException;
    public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0) throws android.os.RemoteException;
    public boolean updateConfiguration(android.app.time.TimeZoneConfiguration p0) throws android.os.RemoteException;

    public static class Default implements android.app.timezonedetector.ITimeZoneDetectorService {
        public Default() {}
        public void addListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public boolean confirmTimeZone(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.app.time.TimeZoneCapabilitiesAndConfig getCapabilitiesAndConfig() throws android.os.RemoteException { return null; }
        public java.lang.String getHomeTimeZone() throws android.os.RemoteException { return null; }
        public android.app.time.TimeZoneState getTimeZoneState() throws android.os.RemoteException { return null; }
        public void removeListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException {}
        public boolean setManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException { return false; }
        public boolean suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException { return false; }
        public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0) throws android.os.RemoteException {}
        public boolean updateConfiguration(android.app.time.TimeZoneConfiguration p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.timezonedetector.ITimeZoneDetectorService {
        static final int TRANSACTION_addListener = 2;
        static final int TRANSACTION_confirmTimeZone = 6;
        static final int TRANSACTION_getCapabilitiesAndConfig = 1;
        static final int TRANSACTION_getHomeTimeZone = 10;
        static final int TRANSACTION_getTimeZoneState = 5;
        static final int TRANSACTION_removeListener = 3;
        static final int TRANSACTION_setManualTimeZone = 7;
        static final int TRANSACTION_suggestManualTimeZone = 8;
        static final int TRANSACTION_suggestTelephonyTimeZone = 9;
        static final int TRANSACTION_updateConfiguration = 4;
        public Stub() { super(); }
        public static android.app.timezonedetector.ITimeZoneDetectorService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.timezonedetector.ITimeZoneDetectorService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public boolean confirmTimeZone(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.app.time.TimeZoneCapabilitiesAndConfig getCapabilitiesAndConfig() throws android.os.RemoteException { return null; }
            public java.lang.String getHomeTimeZone() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.app.time.TimeZoneState getTimeZoneState() throws android.os.RemoteException { return null; }
            public void removeListener(android.app.time.ITimeZoneDetectorListener p0) throws android.os.RemoteException {}
            public boolean setManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException { return false; }
            public boolean suggestManualTimeZone(android.app.timezonedetector.ManualTimeZoneSuggestion p0) throws android.os.RemoteException { return false; }
            public void suggestTelephonyTimeZone(android.app.timezonedetector.TelephonyTimeZoneSuggestion p0) throws android.os.RemoteException {}
            public boolean updateConfiguration(android.app.time.TimeZoneConfiguration p0) throws android.os.RemoteException { return false; }
        }
    }
}
