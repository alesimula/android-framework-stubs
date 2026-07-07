package com.android.internal.hidden_from_bootclasspath.android.net.http;

public final class Flags {
    public static final java.lang.String FLAG_PRELOAD_HTTPENGINE_IN_ZYGOTE = "android.net.http.preload_httpengine_in_zygote";
    public static final java.lang.String FLAG_PROXY_APIS = "android.net.http.proxy_apis";
    public Flags() {}
    public static boolean preloadHttpengineInZygote() { return false; }
    public static boolean proxyApis() { return false; }
}
