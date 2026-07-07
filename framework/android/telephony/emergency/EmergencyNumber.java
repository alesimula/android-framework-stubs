package android.telephony.emergency;

public final class EmergencyNumber implements android.os.Parcelable, java.lang.Comparable<android.telephony.emergency.EmergencyNumber> {
    public static final android.os.Parcelable.Creator<android.telephony.emergency.EmergencyNumber> CREATOR = null;
    public static final int EMERGENCY_CALL_ROUTING_EMERGENCY = 1;
    public static final int EMERGENCY_CALL_ROUTING_NORMAL = 2;
    public static final int EMERGENCY_CALL_ROUTING_UNKNOWN = 0;
    public static final int EMERGENCY_NUMBER_SOURCE_DATABASE = 16;
    public static final int EMERGENCY_NUMBER_SOURCE_DEFAULT = 8;
    public static final int EMERGENCY_NUMBER_SOURCE_MODEM_CONFIG = 4;
    public static final int EMERGENCY_NUMBER_SOURCE_NETWORK_SIGNALING = 1;
    private static final int[] EMERGENCY_NUMBER_SOURCE_PRECEDENCE = null;
    private static final java.util.Set<java.lang.Integer> EMERGENCY_NUMBER_SOURCE_SET = null;
    public static final int EMERGENCY_NUMBER_SOURCE_SIM = 2;
    public static final int EMERGENCY_NUMBER_SOURCE_TEST = 32;
    public static final int EMERGENCY_SERVICE_CATEGORY_AIEC = 64;
    public static final int EMERGENCY_SERVICE_CATEGORY_AMBULANCE = 2;
    public static final int EMERGENCY_SERVICE_CATEGORY_FIRE_BRIGADE = 4;
    public static final int EMERGENCY_SERVICE_CATEGORY_MARINE_GUARD = 8;
    public static final int EMERGENCY_SERVICE_CATEGORY_MIEC = 32;
    public static final int EMERGENCY_SERVICE_CATEGORY_MOUNTAIN_RESCUE = 16;
    public static final int EMERGENCY_SERVICE_CATEGORY_POLICE = 1;
    private static final java.util.Set<java.lang.Integer> EMERGENCY_SERVICE_CATEGORY_SET = null;
    public static final int EMERGENCY_SERVICE_CATEGORY_UNSPECIFIED = 0;
    private static final java.lang.String LOG_TAG = "EmergencyNumber";
    private final java.lang.String mCountryIso = null;
    private final int mEmergencyCallRouting = 0;
    private final int mEmergencyNumberSourceBitmask = 0;
    private final int mEmergencyServiceCategoryBitmask = 0;
    private final java.util.List<java.lang.String> mEmergencyUrns = null;
    private final java.lang.String mMnc = null;
    private final java.lang.String mNumber = null;
    public EmergencyNumber(android.os.Parcel p0) {}
    public EmergencyNumber(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, java.util.List<java.lang.String> p4, int p5, int p6) {}
    public static boolean areSameEmergencyNumbers(android.telephony.emergency.EmergencyNumber p0, android.telephony.emergency.EmergencyNumber p1, boolean p2) { return false; }
    private java.lang.String categoriesToString(int p0) { return null; }
    private static void fillServiceCategoryAndUrns(android.telephony.emergency.EmergencyNumber p0, android.util.SparseIntArray p1, android.util.SparseArray<java.util.List<java.lang.String>> p2) {}
    private int getDisplayPriorityScore() { return 0; }
    private static java.util.List<java.lang.String> mergeEmergencyUrns(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1) { return null; }
    public static android.telephony.emergency.EmergencyNumber mergeSameEmergencyNumbers(android.telephony.emergency.EmergencyNumber p0, android.telephony.emergency.EmergencyNumber p1) { return null; }
    public static android.telephony.emergency.EmergencyNumber mergeSameEmergencyNumbers(android.telephony.emergency.EmergencyNumber p0, android.telephony.emergency.EmergencyNumber p1, boolean p2) { return null; }
    public static void mergeSameNumbersInEmergencyNumberList(java.util.List<android.telephony.emergency.EmergencyNumber> p0) {}
    public static void mergeSameNumbersInEmergencyNumberList(java.util.List<android.telephony.emergency.EmergencyNumber> p0, boolean p1) {}
    private java.lang.String routingToString(int p0) { return null; }
    private boolean serviceUnspecified() { return false; }
    private java.lang.String sourceBitmaskToString(int p0) { return null; }
    public static boolean validateEmergencyNumberAddress(java.lang.String p0) { return false; }
    public int compareTo(android.telephony.emergency.EmergencyNumber p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getCountryIso() { return null; }
    public int getEmergencyCallRouting() { return 0; }
    public int getEmergencyNumberSourceBitmask() { return 0; }
    public java.util.List<java.lang.Integer> getEmergencyNumberSources() { return null; }
    public java.util.List<java.lang.Integer> getEmergencyServiceCategories() { return null; }
    public int getEmergencyServiceCategoryBitmask() { return 0; }
    public int getEmergencyServiceCategoryBitmaskInternalDial() { return 0; }
    public java.util.List<java.lang.String> getEmergencyUrns() { return null; }
    public java.lang.String getMnc() { return null; }
    public java.lang.String getNumber() { return null; }
    public int hashCode() { return 0; }
    public boolean isFromSources(int p0) { return false; }
    public boolean isInEmergencyServiceCategories(int p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EmergencyCallRouting {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EmergencyNumberSources {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EmergencyServiceCategories {
    }
}
