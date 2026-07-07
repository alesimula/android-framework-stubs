package android.net.wifi.nl80211;

@android.annotation.SystemApi
public class WifiScanResultInterceptor {
    public static final java.lang.String EXTRA_PNO_SETTINGS = "android.net.wifi.nl80211.extra.PNO_SETTINGS";
    public static final java.lang.String EXTRA_SCANNING_PARAM_ENABLE_6GHZ_RNR = "android.net.wifi.nl80211.extra.SCANNING_PARAM_ENABLE_6GHZ_RNR";
    public static final java.lang.String EXTRA_SCANNING_PARAM_FREQUENCIES = "android.net.wifi.nl80211.extra.SCANNING_PARAM_FREQUENCIES";
    public static final java.lang.String EXTRA_SCANNING_PARAM_HIDDEN_SSIDS = "android.net.wifi.nl80211.extra.SCANNING_PARAM_HIDDEN_SSIDS";
    public static final java.lang.String EXTRA_SCANNING_PARAM_SCAN_TYPE = "android.net.wifi.nl80211.extra.SCANNING_PARAM_SCAN_TYPE";
    public static final java.lang.String EXTRA_SCANNING_PARAM_VENDOR_IES = "android.net.wifi.nl80211.extra.SCANNING_PARAM_VENDOR_IES";
    private WifiScanResultInterceptor() {}
    public static java.util.List<android.net.wifi.nl80211.NativeScanResult> interceptPnoScanResults(java.util.List<android.net.wifi.nl80211.NativeScanResult> p0, android.os.Bundle p1) { return null; }
    public static java.util.List<android.net.wifi.nl80211.NativeScanResult> interceptScanResults(java.util.List<android.net.wifi.nl80211.NativeScanResult> p0, android.os.Bundle p1) { return null; }
}
