package com.android.internal.os;

public abstract class BaseCommand {
    public static final java.lang.String FATAL_ERROR_CODE = "Error type 1";
    public static final java.lang.String NO_CLASS_ERROR_CODE = "Error type 3";
    public static final java.lang.String NO_SYSTEM_ERROR_CODE = "Error type 2";
    protected final com.android.modules.utils.BasicShellCommandHandler mArgs = null;
    private java.lang.String[] mRawArgs;
    public BaseCommand() {}
    public java.lang.String[] getRawArgs() { return null; }
    public java.lang.String nextArg() { return null; }
    public java.lang.String nextArgRequired() { return null; }
    public java.lang.String nextOption() { return null; }
    public abstract void onRun() throws java.lang.Exception;
    public abstract void onShowUsage(java.io.PrintStream p0);
    public java.lang.String peekNextArg() { return null; }
    public void run(java.lang.String[] p0) {}
    public void showError(java.lang.String p0) {}
    public void showUsage() {}
}
