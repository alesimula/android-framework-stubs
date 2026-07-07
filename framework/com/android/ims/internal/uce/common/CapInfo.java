package com.android.ims.internal.uce.common;

public class CapInfo implements android.os.Parcelable {
    public static final java.lang.String CALLCOMPOSER = "+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gppservice.ims.icsi.gsma.callcomposer\"";
    public static final java.lang.String CAPDISC_VIA_PRESENCE = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.dp\"";
    public static final java.lang.String CHATBOT = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.chatbot\"";
    public static final java.lang.String CHATBOTROLE = "+g.gsma.rcs.isbot";
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.common.CapInfo> CREATOR = null;
    public static final java.lang.String FILE_TRANSFER = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.ft\"";
    public static final java.lang.String FILE_TRANSFER_HTTP = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp\"";
    public static final java.lang.String FILE_TRANSFER_SNF = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftstandfw\"";
    public static final java.lang.String FILE_TRANSFER_THUMBNAIL = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb\"";
    public static final java.lang.String FULL_SNF_GROUPCHAT = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fullsfgroupchat\"";
    public static final java.lang.String GEOPULL = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopull\"";
    public static final java.lang.String GEOPULL_FT = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopullft\"";
    public static final java.lang.String GEOPUSH = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush\"";
    public static final java.lang.String GEOSMS = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms\"";
    public static final java.lang.String IMAGE_SHARE = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.gsma-is\"";
    public static final java.lang.String INSTANT_MSG = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im\"";
    public static final java.lang.String IP_VIDEO = "+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel\";video";
    public static final java.lang.String IP_VOICE = "+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel\"";
    public static final java.lang.String MMTEL_CALLCOMPOSER = "+g.gsma.callcomposer";
    public static final java.lang.String POSTCALL = "+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gppservice.ims.icsi.gsma.callunanswered\"";
    public static final java.lang.String RCS_IP_VIDEO_CALL = "+g.gsma.rcs.ipvideocall";
    public static final java.lang.String RCS_IP_VIDEO_ONLY_CALL = "+g.gsma.rcs.ipvideoonlycall";
    public static final java.lang.String RCS_IP_VOICE_CALL = "+g.gsma.rcs.ipcall";
    public static final java.lang.String SHAREDMAP = "+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gppservice.ims.icsi.gsma.sharedmap\"";
    public static final java.lang.String SHAREDSKETCH = "+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gppservice.ims.icsi.gsma.sharedsketch\"";
    public static final java.lang.String SOCIAL_PRESENCE = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.sp\"";
    public static final java.lang.String STANDALONE_CHATBOT = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot.sa\"";
    public static final java.lang.String STANDALONE_MSG = "+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.msg;urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.largemsg\"";
    public static final java.lang.String VIDEO_SHARE = "+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.gsma-vs\"";
    public static final java.lang.String VIDEO_SHARE_DURING_CS = "+g.3gpp.cs-voice";
    private boolean mCallComposerSupported;
    private java.util.Map<java.lang.String, java.lang.String> mCapInfoMap;
    private long mCapTimestamp;
    private boolean mCdViaPresenceSupported;
    private boolean mChatbotRoleSupported;
    private boolean mChatbotSupported;
    private java.lang.String[] mExts;
    private boolean mFtHttpSupported;
    private boolean mFtSnFSupported;
    private boolean mFtSupported;
    private boolean mFtThumbSupported;
    private boolean mFullSnFGroupChatSupported;
    private boolean mGeoPullFtSupported;
    private boolean mGeoPullSupported;
    private boolean mGeoPushSupported;
    private boolean mGeoSmsSupported;
    private boolean mImSupported;
    private boolean mIpVideoSupported;
    private boolean mIpVoiceSupported;
    private boolean mIsSupported;
    private boolean mMmtelCallComposerSupported;
    private boolean mPostCallSupported;
    private boolean mRcsIpVideoCallSupported;
    private boolean mRcsIpVideoOnlyCallSupported;
    private boolean mRcsIpVoiceCallSupported;
    private boolean mSharedMapSupported;
    private boolean mSharedSketchSupported;
    private boolean mSmChatbotSupported;
    private boolean mSmSupported;
    private boolean mSpSupported;
    private boolean mVsDuringCSSupported;
    private boolean mVsSupported;
    public CapInfo() {}
    private CapInfo(android.os.Parcel p0) {}
    public void addCapability(java.lang.String p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public java.util.Map<java.lang.String, java.lang.String> getCapInfoMap() { return null; }
    public long getCapTimestamp() { return 0L; }
    public java.lang.String getCapabilityVersions(java.lang.String p0) { return null; }
    public java.lang.String[] getExts() { return null; }
    public boolean isCallComposerSupported() { return false; }
    public boolean isCapabilitySupported(java.lang.String p0) { return false; }
    public boolean isCdViaPresenceSupported() { return false; }
    public boolean isChatbotRoleSupported() { return false; }
    public boolean isChatbotSupported() { return false; }
    public boolean isFtHttpSupported() { return false; }
    public boolean isFtSnFSupported() { return false; }
    public boolean isFtSupported() { return false; }
    public boolean isFtThumbSupported() { return false; }
    public boolean isFullSnFGroupChatSupported() { return false; }
    public boolean isGeoPullFtSupported() { return false; }
    public boolean isGeoPullSupported() { return false; }
    public boolean isGeoPushSupported() { return false; }
    public boolean isGeoSmsSupported() { return false; }
    public boolean isImSupported() { return false; }
    public boolean isIpVideoSupported() { return false; }
    public boolean isIpVoiceSupported() { return false; }
    public boolean isIsSupported() { return false; }
    public boolean isMmtelCallComposerSupported() { return false; }
    public boolean isPostCallSupported() { return false; }
    public boolean isRcsIpVideoCallSupported() { return false; }
    public boolean isRcsIpVideoOnlyCallSupported() { return false; }
    public boolean isRcsIpVoiceCallSupported() { return false; }
    public boolean isSharedMapSupported() { return false; }
    public boolean isSharedSketchSupported() { return false; }
    public boolean isSmChatbotSupported() { return false; }
    public boolean isSmSupported() { return false; }
    public boolean isSpSupported() { return false; }
    public boolean isVsDuringCSSupported() { return false; }
    public boolean isVsSupported() { return false; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void removeCapability(java.lang.String p0) {}
    public void setCallComposerSupported(boolean p0) {}
    public void setCapInfoMap(java.util.Map<java.lang.String, java.lang.String> p0) {}
    public void setCapTimestamp(long p0) {}
    public void setCdViaPresenceSupported(boolean p0) {}
    public void setChatbotRoleSupported(boolean p0) {}
    public void setChatbotSupported(boolean p0) {}
    public void setExts(java.lang.String[] p0) {}
    public void setFtHttpSupported(boolean p0) {}
    public void setFtSnFSupported(boolean p0) {}
    public void setFtSupported(boolean p0) {}
    public void setFtThumbSupported(boolean p0) {}
    public void setFullSnFGroupChatSupported(boolean p0) {}
    public void setGeoPullFtSupported(boolean p0) {}
    public void setGeoPullSupported(boolean p0) {}
    public void setGeoPushSupported(boolean p0) {}
    public void setGeoSmsSupported(boolean p0) {}
    public void setImSupported(boolean p0) {}
    public void setIpVideoSupported(boolean p0) {}
    public void setIpVoiceSupported(boolean p0) {}
    public void setIsSupported(boolean p0) {}
    public void setMmtelCallComposerSupported(boolean p0) {}
    public void setPostCallSupported(boolean p0) {}
    public void setRcsIpVideoCallSupported(boolean p0) {}
    public void setRcsIpVideoOnlyCallSupported(boolean p0) {}
    public void setRcsIpVoiceCallSupported(boolean p0) {}
    public void setSharedMapSupported(boolean p0) {}
    public void setSharedSketchSupported(boolean p0) {}
    public void setSmChatbotSupported(boolean p0) {}
    public void setSmSupported(boolean p0) {}
    public void setSpSupported(boolean p0) {}
    public void setVsDuringCSSupported(boolean p0) {}
    public void setVsSupported(boolean p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
