package android.hardware.input;

public interface IInputManager extends android.os.IInterface {
    public void addAllowedPeripheralApp(int p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException;
    public int addCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException;
    public void addPeripheralCustomization(android.hardware.input.AidlPeripheralCustomizationData p0) throws android.os.RemoteException;
    public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void addUniqueIdAssociationByDescriptor(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void addUniqueIdAssociationByPort(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void cancelCurrentTouch() throws android.os.RemoteException;
    public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void clearAllControllerAxisRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException;
    public void clearAllControllerButtonRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException;
    public void clearAllControllerButtonToAxisRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException;
    public void clearAllModifierKeyRemappings() throws android.os.RemoteException;
    public void closeLightSession(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.hardware.input.IVirtualGamepad createVirtualGamepad(android.os.IBinder p0, android.hardware.input.VirtualGamepadConfig p1) throws android.os.RemoteException;
    public android.hardware.input.IVirtualKeyboard createVirtualKeyboard(android.os.IBinder p0, android.hardware.input.VirtualKeyboardConfig p1) throws android.os.RemoteException;
    public android.hardware.input.IVirtualMouse createVirtualMouse(android.os.IBinder p0, android.hardware.input.VirtualMouseConfig p1) throws android.os.RemoteException;
    public void disableInputDevice(int p0) throws android.os.RemoteException;
    public void disableSensor(int p0, int p1) throws android.os.RemoteException;
    public void enableInputDevice(int p0) throws android.os.RemoteException;
    public boolean enableSensor(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public boolean flushSensor(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.hardware.input.AidlPeripheralCustomizationData> getAllPeripheralCustomizations(int p0, int p1) throws android.os.RemoteException;
    public android.hardware.input.AidlInputGestureData[] getAppLaunchBookmarks() throws android.os.RemoteException;
    public android.hardware.input.IInputDeviceBatteryState getBatteryState(int p0) throws android.os.RemoteException;
    public java.util.Map getControllerAxisRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException;
    public java.util.Map getControllerButtonRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException;
    public android.graphics.PointF getCursorPositionInLogicalDisplay(int p0) throws android.os.RemoteException;
    public android.graphics.PointF getCursorPositionInPhysicalDisplay(int p0) throws android.os.RemoteException;
    public android.hardware.input.AidlInputGestureData[] getCustomInputGestures(int p0, int p1) throws android.os.RemoteException;
    public android.hardware.input.HostUsiVersion getHostUsiVersionFromDisplayConfig(int p0) throws android.os.RemoteException;
    public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException;
    public java.lang.String getInputDeviceBluetoothAddress(int p0) throws android.os.RemoteException;
    public int[] getInputDeviceIds() throws android.os.RemoteException;
    public android.hardware.input.AidlInputGestureData getInputGesture(int p0, android.hardware.input.AidlInputGestureData.Trigger p1) throws android.os.RemoteException;
    public android.view.KeyCharacterMap getKeyCharacterMap(java.lang.String p0) throws android.os.RemoteException;
    public int getKeyCodeForKeyLocation(int p0, int p1) throws android.os.RemoteException;
    public android.hardware.input.KeyGlyphMap getKeyGlyphMap(int p0) throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout getKeyboardLayout(java.lang.String p0) throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayoutSelectionResult getKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout[] getKeyboardLayoutListForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout[] getKeyboardLayouts() throws android.os.RemoteException;
    public android.hardware.lights.LightState getLightState(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.hardware.lights.Light> getLights(int p0) throws android.os.RemoteException;
    public java.util.Map getModifierKeyRemapping() throws android.os.RemoteException;
    public int getMousePointerSpeed() throws android.os.RemoteException;
    public android.hardware.input.AidlPeripheralCustomizationData getPeripheralCustomization(int p0, int p1, android.hardware.input.AidlCustomizationTrigger p2) throws android.os.RemoteException;
    public android.hardware.input.InputSensorInfo[] getSensorList(int p0) throws android.os.RemoteException;
    public int getSupportedButtons(int p0, int p1) throws android.os.RemoteException;
    public android.hardware.input.TouchCalibration getTouchCalibrationForInputDevice(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String getVelocityTrackerStrategy() throws android.os.RemoteException;
    public int[] getVibratorIds(int p0) throws android.os.RemoteException;
    public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException;
    public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException;
    public boolean injectInputEventToTarget(android.view.InputEvent p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isButtonAllowedForCustomization(int p0, int p1, int p2) throws android.os.RemoteException;
    public int isInTabletMode() throws android.os.RemoteException;
    public boolean isKeyAllowedForCustomization(int p0, int p1, int p2) throws android.os.RemoteException;
    public int isMicMuted() throws android.os.RemoteException;
    public boolean isVibrating(int p0) throws android.os.RemoteException;
    public android.view.InputMonitor monitorGestureInput(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void openLightSession(int p0, java.lang.String p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void pilferPointers(android.os.IBinder p0) throws android.os.RemoteException;
    public void registerBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException;
    public void registerInputDevicesChangedListener(android.hardware.input.IInputDevicesChangedListener p0) throws android.os.RemoteException;
    public boolean registerKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException;
    public void registerKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException;
    public void registerKeyGestureHandler(int[] p0, android.hardware.input.IKeyGestureHandler p1) throws android.os.RemoteException;
    public void registerKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException;
    public boolean registerSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException;
    public void registerStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException;
    public void registerTabletModeChangedListener(android.hardware.input.ITabletModeChangedListener p0) throws android.os.RemoteException;
    public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException;
    public void remapControllerAxis(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2, int p3) throws android.os.RemoteException;
    public void remapControllerButton(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2, int p3) throws android.os.RemoteException;
    public void remapControllerButtonToAxis(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2, int p3) throws android.os.RemoteException;
    public void remapModifierKey(int p0, int p1) throws android.os.RemoteException;
    public void removeAllCustomInputGestures(int p0, int p1) throws android.os.RemoteException;
    public void removeAllPeripheralCustomizations(int p0, int p1) throws android.os.RemoteException;
    public void removeAllowedPeripheralApp(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void removeControllerAxisRemapping(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2) throws android.os.RemoteException;
    public void removeControllerButtonRemapping(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2) throws android.os.RemoteException;
    public void removeControllerButtonToAxisRemapping(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2) throws android.os.RemoteException;
    public int removeCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException;
    public void removePeripheralCustomization(int p0, int p1, android.hardware.input.AidlCustomizationTrigger p2) throws android.os.RemoteException;
    public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException;
    public void removeUniqueIdAssociationByDescriptor(java.lang.String p0) throws android.os.RemoteException;
    public void removeUniqueIdAssociationByPort(java.lang.String p0) throws android.os.RemoteException;
    public void requestPointerCapture(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void resetLockedModifierState() throws android.os.RemoteException;
    public void setKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3, java.lang.String p4) throws android.os.RemoteException;
    public void setKeyboardLayoutOverrideForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException;
    public void setLightStates(int p0, int[] p1, android.hardware.lights.LightState[] p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void setMouseScalingEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public boolean setPointerIcon(android.view.PointerIcon p0, int p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException;
    public void setTouchCalibrationForInputDevice(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) throws android.os.RemoteException;
    public void tryPointerSpeed(int p0) throws android.os.RemoteException;
    public void unregisterBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException;
    public boolean unregisterKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException;
    public void unregisterKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException;
    public void unregisterKeyGestureHandler(android.hardware.input.IKeyGestureHandler p0) throws android.os.RemoteException;
    public void unregisterKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException;
    public void unregisterSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException;
    public void unregisterStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException;
    public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException;
    public android.view.VerifiedInputEvent verifyInputEvent(android.view.InputEvent p0) throws android.os.RemoteException;
    public void vibrate(int p0, android.os.VibrationEffect p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void vibrateCombined(int p0, android.os.CombinedVibration p1, android.os.IBinder p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IInputManager {
        public Default() {}
        public void addAllowedPeripheralApp(int p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException {}
        public int addCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException { return 0; }
        public void addPeripheralCustomization(android.hardware.input.AidlPeripheralCustomizationData p0) throws android.os.RemoteException {}
        public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void addUniqueIdAssociationByDescriptor(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void addUniqueIdAssociationByPort(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelCurrentTouch() throws android.os.RemoteException {}
        public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void clearAllControllerAxisRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException {}
        public void clearAllControllerButtonRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException {}
        public void clearAllControllerButtonToAxisRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException {}
        public void clearAllModifierKeyRemappings() throws android.os.RemoteException {}
        public void closeLightSession(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public android.hardware.input.IVirtualGamepad createVirtualGamepad(android.os.IBinder p0, android.hardware.input.VirtualGamepadConfig p1) throws android.os.RemoteException { return null; }
        public android.hardware.input.IVirtualKeyboard createVirtualKeyboard(android.os.IBinder p0, android.hardware.input.VirtualKeyboardConfig p1) throws android.os.RemoteException { return null; }
        public android.hardware.input.IVirtualMouse createVirtualMouse(android.os.IBinder p0, android.hardware.input.VirtualMouseConfig p1) throws android.os.RemoteException { return null; }
        public void disableInputDevice(int p0) throws android.os.RemoteException {}
        public void disableSensor(int p0, int p1) throws android.os.RemoteException {}
        public void enableInputDevice(int p0) throws android.os.RemoteException {}
        public boolean enableSensor(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public boolean flushSensor(int p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.hardware.input.AidlPeripheralCustomizationData> getAllPeripheralCustomizations(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.hardware.input.AidlInputGestureData[] getAppLaunchBookmarks() throws android.os.RemoteException { return null; }
        public android.hardware.input.IInputDeviceBatteryState getBatteryState(int p0) throws android.os.RemoteException { return null; }
        public java.util.Map getControllerAxisRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException { return null; }
        public java.util.Map getControllerButtonRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException { return null; }
        public android.graphics.PointF getCursorPositionInLogicalDisplay(int p0) throws android.os.RemoteException { return null; }
        public android.graphics.PointF getCursorPositionInPhysicalDisplay(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.input.AidlInputGestureData[] getCustomInputGestures(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.hardware.input.HostUsiVersion getHostUsiVersionFromDisplayConfig(int p0) throws android.os.RemoteException { return null; }
        public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getInputDeviceBluetoothAddress(int p0) throws android.os.RemoteException { return null; }
        public int[] getInputDeviceIds() throws android.os.RemoteException { return null; }
        public android.hardware.input.AidlInputGestureData getInputGesture(int p0, android.hardware.input.AidlInputGestureData.Trigger p1) throws android.os.RemoteException { return null; }
        public android.view.KeyCharacterMap getKeyCharacterMap(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getKeyCodeForKeyLocation(int p0, int p1) throws android.os.RemoteException { return 0; }
        public android.hardware.input.KeyGlyphMap getKeyGlyphMap(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.input.KeyboardLayout getKeyboardLayout(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.hardware.input.KeyboardLayoutSelectionResult getKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException { return null; }
        public android.hardware.input.KeyboardLayout[] getKeyboardLayoutListForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException { return null; }
        public android.hardware.input.KeyboardLayout[] getKeyboardLayouts() throws android.os.RemoteException { return null; }
        public android.hardware.lights.LightState getLightState(int p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.lights.Light> getLights(int p0) throws android.os.RemoteException { return null; }
        public java.util.Map getModifierKeyRemapping() throws android.os.RemoteException { return null; }
        public int getMousePointerSpeed() throws android.os.RemoteException { return 0; }
        public android.hardware.input.AidlPeripheralCustomizationData getPeripheralCustomization(int p0, int p1, android.hardware.input.AidlCustomizationTrigger p2) throws android.os.RemoteException { return null; }
        public android.hardware.input.InputSensorInfo[] getSensorList(int p0) throws android.os.RemoteException { return null; }
        public int getSupportedButtons(int p0, int p1) throws android.os.RemoteException { return 0; }
        public android.hardware.input.TouchCalibration getTouchCalibrationForInputDevice(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.String getVelocityTrackerStrategy() throws android.os.RemoteException { return null; }
        public int[] getVibratorIds(int p0) throws android.os.RemoteException { return null; }
        public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException { return false; }
        public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException { return false; }
        public boolean injectInputEventToTarget(android.view.InputEvent p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public boolean isButtonAllowedForCustomization(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public int isInTabletMode() throws android.os.RemoteException { return 0; }
        public boolean isKeyAllowedForCustomization(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public int isMicMuted() throws android.os.RemoteException { return 0; }
        public boolean isVibrating(int p0) throws android.os.RemoteException { return false; }
        public android.view.InputMonitor monitorGestureInput(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public void openLightSession(int p0, java.lang.String p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void pilferPointers(android.os.IBinder p0) throws android.os.RemoteException {}
        public void registerBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException {}
        public void registerInputDevicesChangedListener(android.hardware.input.IInputDevicesChangedListener p0) throws android.os.RemoteException {}
        public boolean registerKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException { return false; }
        public void registerKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException {}
        public void registerKeyGestureHandler(int[] p0, android.hardware.input.IKeyGestureHandler p1) throws android.os.RemoteException {}
        public void registerKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
        public boolean registerSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException { return false; }
        public void registerStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException {}
        public void registerTabletModeChangedListener(android.hardware.input.ITabletModeChangedListener p0) throws android.os.RemoteException {}
        public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
        public void remapControllerAxis(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2, int p3) throws android.os.RemoteException {}
        public void remapControllerButton(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2, int p3) throws android.os.RemoteException {}
        public void remapControllerButtonToAxis(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2, int p3) throws android.os.RemoteException {}
        public void remapModifierKey(int p0, int p1) throws android.os.RemoteException {}
        public void removeAllCustomInputGestures(int p0, int p1) throws android.os.RemoteException {}
        public void removeAllPeripheralCustomizations(int p0, int p1) throws android.os.RemoteException {}
        public void removeAllowedPeripheralApp(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void removeControllerAxisRemapping(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2) throws android.os.RemoteException {}
        public void removeControllerButtonRemapping(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2) throws android.os.RemoteException {}
        public void removeControllerButtonToAxisRemapping(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2) throws android.os.RemoteException {}
        public int removeCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException { return 0; }
        public void removePeripheralCustomization(int p0, int p1, android.hardware.input.AidlCustomizationTrigger p2) throws android.os.RemoteException {}
        public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException {}
        public void removeUniqueIdAssociationByDescriptor(java.lang.String p0) throws android.os.RemoteException {}
        public void removeUniqueIdAssociationByPort(java.lang.String p0) throws android.os.RemoteException {}
        public void requestPointerCapture(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void resetLockedModifierState() throws android.os.RemoteException {}
        public void setKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3, java.lang.String p4) throws android.os.RemoteException {}
        public void setKeyboardLayoutOverrideForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setLightStates(int p0, int[] p1, android.hardware.lights.LightState[] p2, android.os.IBinder p3) throws android.os.RemoteException {}
        public void setMouseScalingEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean setPointerIcon(android.view.PointerIcon p0, int p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException { return false; }
        public void setTouchCalibrationForInputDevice(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) throws android.os.RemoteException {}
        public void tryPointerSpeed(int p0) throws android.os.RemoteException {}
        public void unregisterBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException {}
        public boolean unregisterKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException { return false; }
        public void unregisterKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException {}
        public void unregisterKeyGestureHandler(android.hardware.input.IKeyGestureHandler p0) throws android.os.RemoteException {}
        public void unregisterKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
        public void unregisterSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException {}
        public void unregisterStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException {}
        public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
        public android.view.VerifiedInputEvent verifyInputEvent(android.view.InputEvent p0) throws android.os.RemoteException { return null; }
        public void vibrate(int p0, android.os.VibrationEffect p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void vibrateCombined(int p0, android.os.CombinedVibration p1, android.os.IBinder p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IInputManager {
        public static final java.lang.String DESCRIPTOR = "android.hardware.input.IInputManager";
        static final java.lang.String[] PERMISSIONS_createVirtualKeyboard = null;
        static final int TRANSACTION_addAllowedPeripheralApp = 106;
        static final int TRANSACTION_addCustomInputGesture = 90;
        static final int TRANSACTION_addPeripheralCustomization = 99;
        static final int TRANSACTION_addPortAssociation = 55;
        static final int TRANSACTION_addUniqueIdAssociationByDescriptor = 57;
        static final int TRANSACTION_addUniqueIdAssociationByPort = 59;
        static final int TRANSACTION_cancelCurrentTouch = 72;
        static final int TRANSACTION_cancelVibrate = 46;
        static final int TRANSACTION_clearAllControllerAxisRemappings = 38;
        static final int TRANSACTION_clearAllControllerButtonRemappings = 31;
        static final int TRANSACTION_clearAllControllerButtonToAxisRemappings = 35;
        static final int TRANSACTION_clearAllModifierKeyRemappings = 27;
        static final int TRANSACTION_closeLightSession = 71;
        static final int TRANSACTION_createVirtualGamepad = 14;
        static final int TRANSACTION_createVirtualKeyboard = 13;
        static final int TRANSACTION_createVirtualMouse = 15;
        static final int TRANSACTION_disableInputDevice = 5;
        static final int TRANSACTION_disableSensor = 65;
        static final int TRANSACTION_enableInputDevice = 4;
        static final int TRANSACTION_enableSensor = 64;
        static final int TRANSACTION_flushSensor = 66;
        static final int TRANSACTION_getAllPeripheralCustomizations = 105;
        static final int TRANSACTION_getAppLaunchBookmarks = 94;
        static final int TRANSACTION_getBatteryState = 51;
        static final int TRANSACTION_getControllerAxisRemappings = 39;
        static final int TRANSACTION_getControllerButtonRemappings = 32;
        static final int TRANSACTION_getCursorPositionInLogicalDisplay = 98;
        static final int TRANSACTION_getCursorPositionInPhysicalDisplay = 97;
        static final int TRANSACTION_getCustomInputGestures = 93;
        static final int TRANSACTION_getHostUsiVersionFromDisplayConfig = 81;
        static final int TRANSACTION_getInputDevice = 2;
        static final int TRANSACTION_getInputDeviceBluetoothAddress = 77;
        static final int TRANSACTION_getInputDeviceIds = 3;
        static final int TRANSACTION_getInputGesture = 89;
        static final int TRANSACTION_getKeyCharacterMap = 9;
        static final int TRANSACTION_getKeyCodeForKeyLocation = 8;
        static final int TRANSACTION_getKeyGlyphMap = 84;
        static final int TRANSACTION_getKeyboardLayout = 21;
        static final int TRANSACTION_getKeyboardLayoutForInputDevice = 22;
        static final int TRANSACTION_getKeyboardLayoutListForInputDevice = 25;
        static final int TRANSACTION_getKeyboardLayouts = 20;
        static final int TRANSACTION_getLightState = 68;
        static final int TRANSACTION_getLights = 67;
        static final int TRANSACTION_getModifierKeyRemapping = 28;
        static final int TRANSACTION_getMousePointerSpeed = 10;
        static final int TRANSACTION_getPeripheralCustomization = 104;
        static final int TRANSACTION_getSensorList = 61;
        static final int TRANSACTION_getSupportedButtons = 7;
        static final int TRANSACTION_getTouchCalibrationForInputDevice = 18;
        static final int TRANSACTION_getVelocityTrackerStrategy = 1;
        static final int TRANSACTION_getVibratorIds = 47;
        static final int TRANSACTION_hasKeys = 6;
        static final int TRANSACTION_injectInputEvent = 12;
        static final int TRANSACTION_injectInputEventToTarget = 16;
        static final int TRANSACTION_isButtonAllowedForCustomization = 103;
        static final int TRANSACTION_isInTabletMode = 41;
        static final int TRANSACTION_isKeyAllowedForCustomization = 102;
        static final int TRANSACTION_isMicMuted = 43;
        static final int TRANSACTION_isVibrating = 48;
        static final int TRANSACTION_monitorGestureInput = 54;
        static final int TRANSACTION_openLightSession = 70;
        static final int TRANSACTION_pilferPointers = 78;
        static final int TRANSACTION_registerBatteryListener = 73;
        static final int TRANSACTION_registerInputDevicesChangedListener = 40;
        static final int TRANSACTION_registerKeyEventActivityListener = 75;
        static final int TRANSACTION_registerKeyGestureEventListener = 85;
        static final int TRANSACTION_registerKeyGestureHandler = 87;
        static final int TRANSACTION_registerKeyboardBacklightListener = 79;
        static final int TRANSACTION_registerSensorListener = 62;
        static final int TRANSACTION_registerStickyModifierStateListener = 82;
        static final int TRANSACTION_registerTabletModeChangedListener = 42;
        static final int TRANSACTION_registerVibratorStateListener = 49;
        static final int TRANSACTION_remapControllerAxis = 36;
        static final int TRANSACTION_remapControllerButton = 29;
        static final int TRANSACTION_remapControllerButtonToAxis = 33;
        static final int TRANSACTION_remapModifierKey = 26;
        static final int TRANSACTION_removeAllCustomInputGestures = 92;
        static final int TRANSACTION_removeAllPeripheralCustomizations = 101;
        static final int TRANSACTION_removeAllowedPeripheralApp = 107;
        static final int TRANSACTION_removeControllerAxisRemapping = 37;
        static final int TRANSACTION_removeControllerButtonRemapping = 30;
        static final int TRANSACTION_removeControllerButtonToAxisRemapping = 34;
        static final int TRANSACTION_removeCustomInputGesture = 91;
        static final int TRANSACTION_removePeripheralCustomization = 100;
        static final int TRANSACTION_removePortAssociation = 56;
        static final int TRANSACTION_removeUniqueIdAssociationByDescriptor = 58;
        static final int TRANSACTION_removeUniqueIdAssociationByPort = 60;
        static final int TRANSACTION_requestPointerCapture = 53;
        static final int TRANSACTION_resetLockedModifierState = 95;
        static final int TRANSACTION_setKeyboardLayoutForInputDevice = 24;
        static final int TRANSACTION_setKeyboardLayoutOverrideForInputDevice = 23;
        static final int TRANSACTION_setLightStates = 69;
        static final int TRANSACTION_setMouseScalingEnabled = 96;
        static final int TRANSACTION_setPointerIcon = 52;
        static final int TRANSACTION_setTouchCalibrationForInputDevice = 19;
        static final int TRANSACTION_tryPointerSpeed = 11;
        static final int TRANSACTION_unregisterBatteryListener = 74;
        static final int TRANSACTION_unregisterKeyEventActivityListener = 76;
        static final int TRANSACTION_unregisterKeyGestureEventListener = 86;
        static final int TRANSACTION_unregisterKeyGestureHandler = 88;
        static final int TRANSACTION_unregisterKeyboardBacklightListener = 80;
        static final int TRANSACTION_unregisterSensorListener = 63;
        static final int TRANSACTION_unregisterStickyModifierStateListener = 83;
        static final int TRANSACTION_unregisterVibratorStateListener = 50;
        static final int TRANSACTION_verifyInputEvent = 17;
        static final int TRANSACTION_vibrate = 44;
        static final int TRANSACTION_vibrateCombined = 45;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.input.IInputManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void addAllowedPeripheralApp_enforcePermission() throws java.lang.SecurityException {}
        protected void addCustomInputGesture_enforcePermission() throws java.lang.SecurityException {}
        protected void addPeripheralCustomization_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void clearAllControllerAxisRemappings_enforcePermission() throws java.lang.SecurityException {}
        protected void clearAllControllerButtonRemappings_enforcePermission() throws java.lang.SecurityException {}
        protected void clearAllControllerButtonToAxisRemappings_enforcePermission() throws java.lang.SecurityException {}
        protected void clearAllModifierKeyRemappings_enforcePermission() throws java.lang.SecurityException {}
        protected void createVirtualGamepad_enforcePermission() throws java.lang.SecurityException {}
        protected void createVirtualKeyboard_enforcePermission() throws java.lang.SecurityException {}
        protected void createVirtualMouse_enforcePermission() throws java.lang.SecurityException {}
        protected void getAllPeripheralCustomizations_enforcePermission() throws java.lang.SecurityException {}
        protected void getControllerAxisRemappings_enforcePermission() throws java.lang.SecurityException {}
        protected void getControllerButtonRemappings_enforcePermission() throws java.lang.SecurityException {}
        protected void getInputDeviceBluetoothAddress_enforcePermission() throws java.lang.SecurityException {}
        protected void getInputGesture_enforcePermission() throws java.lang.SecurityException {}
        protected void getModifierKeyRemapping_enforcePermission() throws java.lang.SecurityException {}
        protected void getPeripheralCustomization_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void isButtonAllowedForCustomization_enforcePermission() throws java.lang.SecurityException {}
        protected void isKeyAllowedForCustomization_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void pilferPointers_enforcePermission() throws java.lang.SecurityException {}
        protected void registerKeyEventActivityListener_enforcePermission() throws java.lang.SecurityException {}
        protected void registerKeyGestureEventListener_enforcePermission() throws java.lang.SecurityException {}
        protected void registerKeyGestureHandler_enforcePermission() throws java.lang.SecurityException {}
        protected void registerKeyboardBacklightListener_enforcePermission() throws java.lang.SecurityException {}
        protected void registerStickyModifierStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void remapControllerAxis_enforcePermission() throws java.lang.SecurityException {}
        protected void remapControllerButtonToAxis_enforcePermission() throws java.lang.SecurityException {}
        protected void remapControllerButton_enforcePermission() throws java.lang.SecurityException {}
        protected void remapModifierKey_enforcePermission() throws java.lang.SecurityException {}
        protected void removeAllCustomInputGestures_enforcePermission() throws java.lang.SecurityException {}
        protected void removeAllPeripheralCustomizations_enforcePermission() throws java.lang.SecurityException {}
        protected void removeAllowedPeripheralApp_enforcePermission() throws java.lang.SecurityException {}
        protected void removeControllerAxisRemapping_enforcePermission() throws java.lang.SecurityException {}
        protected void removeControllerButtonRemapping_enforcePermission() throws java.lang.SecurityException {}
        protected void removeControllerButtonToAxisRemapping_enforcePermission() throws java.lang.SecurityException {}
        protected void removeCustomInputGesture_enforcePermission() throws java.lang.SecurityException {}
        protected void removePeripheralCustomization_enforcePermission() throws java.lang.SecurityException {}
        protected void setKeyboardLayoutForInputDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void setKeyboardLayoutOverrideForInputDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterKeyEventActivityListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterKeyGestureEventListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterKeyGestureHandler_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterKeyboardBacklightListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterStickyModifierStateListener_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.input.IInputManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addAllowedPeripheralApp(int p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException {}
            public int addCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException { return 0; }
            public void addPeripheralCustomization(android.hardware.input.AidlPeripheralCustomizationData p0) throws android.os.RemoteException {}
            public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void addUniqueIdAssociationByDescriptor(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void addUniqueIdAssociationByPort(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelCurrentTouch() throws android.os.RemoteException {}
            public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void clearAllControllerAxisRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException {}
            public void clearAllControllerButtonRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException {}
            public void clearAllControllerButtonToAxisRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException {}
            public void clearAllModifierKeyRemappings() throws android.os.RemoteException {}
            public void closeLightSession(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public android.hardware.input.IVirtualGamepad createVirtualGamepad(android.os.IBinder p0, android.hardware.input.VirtualGamepadConfig p1) throws android.os.RemoteException { return null; }
            public android.hardware.input.IVirtualKeyboard createVirtualKeyboard(android.os.IBinder p0, android.hardware.input.VirtualKeyboardConfig p1) throws android.os.RemoteException { return null; }
            public android.hardware.input.IVirtualMouse createVirtualMouse(android.os.IBinder p0, android.hardware.input.VirtualMouseConfig p1) throws android.os.RemoteException { return null; }
            public void disableInputDevice(int p0) throws android.os.RemoteException {}
            public void disableSensor(int p0, int p1) throws android.os.RemoteException {}
            public void enableInputDevice(int p0) throws android.os.RemoteException {}
            public boolean enableSensor(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public boolean flushSensor(int p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.hardware.input.AidlPeripheralCustomizationData> getAllPeripheralCustomizations(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.hardware.input.AidlInputGestureData[] getAppLaunchBookmarks() throws android.os.RemoteException { return null; }
            public android.hardware.input.IInputDeviceBatteryState getBatteryState(int p0) throws android.os.RemoteException { return null; }
            public java.util.Map getControllerAxisRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException { return null; }
            public java.util.Map getControllerButtonRemappings(int p0, android.hardware.input.InputDeviceIdentifier p1) throws android.os.RemoteException { return null; }
            public android.graphics.PointF getCursorPositionInLogicalDisplay(int p0) throws android.os.RemoteException { return null; }
            public android.graphics.PointF getCursorPositionInPhysicalDisplay(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.input.AidlInputGestureData[] getCustomInputGestures(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.hardware.input.HostUsiVersion getHostUsiVersionFromDisplayConfig(int p0) throws android.os.RemoteException { return null; }
            public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getInputDeviceBluetoothAddress(int p0) throws android.os.RemoteException { return null; }
            public int[] getInputDeviceIds() throws android.os.RemoteException { return null; }
            public android.hardware.input.AidlInputGestureData getInputGesture(int p0, android.hardware.input.AidlInputGestureData.Trigger p1) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.view.KeyCharacterMap getKeyCharacterMap(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getKeyCodeForKeyLocation(int p0, int p1) throws android.os.RemoteException { return 0; }
            public android.hardware.input.KeyGlyphMap getKeyGlyphMap(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.input.KeyboardLayout getKeyboardLayout(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.hardware.input.KeyboardLayoutSelectionResult getKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException { return null; }
            public android.hardware.input.KeyboardLayout[] getKeyboardLayoutListForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException { return null; }
            public android.hardware.input.KeyboardLayout[] getKeyboardLayouts() throws android.os.RemoteException { return null; }
            public android.hardware.lights.LightState getLightState(int p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.lights.Light> getLights(int p0) throws android.os.RemoteException { return null; }
            public java.util.Map getModifierKeyRemapping() throws android.os.RemoteException { return null; }
            public int getMousePointerSpeed() throws android.os.RemoteException { return 0; }
            public android.hardware.input.AidlPeripheralCustomizationData getPeripheralCustomization(int p0, int p1, android.hardware.input.AidlCustomizationTrigger p2) throws android.os.RemoteException { return null; }
            public android.hardware.input.InputSensorInfo[] getSensorList(int p0) throws android.os.RemoteException { return null; }
            public int getSupportedButtons(int p0, int p1) throws android.os.RemoteException { return 0; }
            public android.hardware.input.TouchCalibration getTouchCalibrationForInputDevice(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.String getVelocityTrackerStrategy() throws android.os.RemoteException { return null; }
            public int[] getVibratorIds(int p0) throws android.os.RemoteException { return null; }
            public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException { return false; }
            public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException { return false; }
            public boolean injectInputEventToTarget(android.view.InputEvent p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public boolean isButtonAllowedForCustomization(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public int isInTabletMode() throws android.os.RemoteException { return 0; }
            public boolean isKeyAllowedForCustomization(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public int isMicMuted() throws android.os.RemoteException { return 0; }
            public boolean isVibrating(int p0) throws android.os.RemoteException { return false; }
            public android.view.InputMonitor monitorGestureInput(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public void openLightSession(int p0, java.lang.String p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void pilferPointers(android.os.IBinder p0) throws android.os.RemoteException {}
            public void registerBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException {}
            public void registerInputDevicesChangedListener(android.hardware.input.IInputDevicesChangedListener p0) throws android.os.RemoteException {}
            public boolean registerKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException { return false; }
            public void registerKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException {}
            public void registerKeyGestureHandler(int[] p0, android.hardware.input.IKeyGestureHandler p1) throws android.os.RemoteException {}
            public void registerKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
            public boolean registerSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException { return false; }
            public void registerStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException {}
            public void registerTabletModeChangedListener(android.hardware.input.ITabletModeChangedListener p0) throws android.os.RemoteException {}
            public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
            public void remapControllerAxis(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2, int p3) throws android.os.RemoteException {}
            public void remapControllerButton(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2, int p3) throws android.os.RemoteException {}
            public void remapControllerButtonToAxis(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2, int p3) throws android.os.RemoteException {}
            public void remapModifierKey(int p0, int p1) throws android.os.RemoteException {}
            public void removeAllCustomInputGestures(int p0, int p1) throws android.os.RemoteException {}
            public void removeAllPeripheralCustomizations(int p0, int p1) throws android.os.RemoteException {}
            public void removeAllowedPeripheralApp(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void removeControllerAxisRemapping(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2) throws android.os.RemoteException {}
            public void removeControllerButtonRemapping(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2) throws android.os.RemoteException {}
            public void removeControllerButtonToAxisRemapping(int p0, android.hardware.input.InputDeviceIdentifier p1, int p2) throws android.os.RemoteException {}
            public int removeCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException { return 0; }
            public void removePeripheralCustomization(int p0, int p1, android.hardware.input.AidlCustomizationTrigger p2) throws android.os.RemoteException {}
            public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException {}
            public void removeUniqueIdAssociationByDescriptor(java.lang.String p0) throws android.os.RemoteException {}
            public void removeUniqueIdAssociationByPort(java.lang.String p0) throws android.os.RemoteException {}
            public void requestPointerCapture(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void resetLockedModifierState() throws android.os.RemoteException {}
            public void setKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3, java.lang.String p4) throws android.os.RemoteException {}
            public void setKeyboardLayoutOverrideForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setLightStates(int p0, int[] p1, android.hardware.lights.LightState[] p2, android.os.IBinder p3) throws android.os.RemoteException {}
            public void setMouseScalingEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean setPointerIcon(android.view.PointerIcon p0, int p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException { return false; }
            public void setTouchCalibrationForInputDevice(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) throws android.os.RemoteException {}
            public void tryPointerSpeed(int p0) throws android.os.RemoteException {}
            public void unregisterBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException {}
            public boolean unregisterKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException { return false; }
            public void unregisterKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException {}
            public void unregisterKeyGestureHandler(android.hardware.input.IKeyGestureHandler p0) throws android.os.RemoteException {}
            public void unregisterKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
            public void unregisterSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException {}
            public void unregisterStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException {}
            public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
            public android.view.VerifiedInputEvent verifyInputEvent(android.view.InputEvent p0) throws android.os.RemoteException { return null; }
            public void vibrate(int p0, android.os.VibrationEffect p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void vibrateCombined(int p0, android.os.CombinedVibration p1, android.os.IBinder p2) throws android.os.RemoteException {}
        }
    }
}
