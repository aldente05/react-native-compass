
package com.welvarend;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.welvarend.sensor.AcceleroMeter;
import com.facebook.react.bridge.ReactMethod;
import com.welvarend.sensor.Gyroscope;
import com.welvarend.sensor.LightSensor;
import com.welvarend.sensor.MagnetoMeter;
import com.welvarend.sensor.MotionValue;
import com.welvarend.sensor.Orientation;
import com.welvarend.sensor.Proximity;
import com.welvarend.sensor.StepCounter;
import com.welvarend.sensor.ThermoMeter;

public class CompassModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private AcceleroMeter		mAccelerometer = null;
  private Gyroscope mGyroscope = null;
  private MagnetoMeter mMagnetometer = null;
  private StepCounter mStepCounter = null;
  private ThermoMeter mThermometer = null;
  private MotionValue mMotionValue = null;
  private Orientation mOrientation = null;
  private Proximity mProximity = null;
  private LightSensor mLightSensor = null;

  public CompassModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "ReactNativeCompass";
  }

    @ReactMethod
    public int startAccelerometer(int delay) {
        if (mAccelerometer == null)
            mAccelerometer = new AcceleroMeter(reactContext);
        return (mAccelerometer.start(delay));
    }

    @ReactMethod
    public void stopAccelerometer() {
        if (mAccelerometer != null)
            mAccelerometer.stop();
    }

    @ReactMethod
    public int startGyroscope(int delay) {
        if (mGyroscope == null)
            mGyroscope = new Gyroscope(reactContext);
        return (mGyroscope.start(delay));
    }

    @ReactMethod
    public void stopGyroscope() {
        if (mGyroscope != null)
            mGyroscope.stop();
    }

    @ReactMethod
    public int startMagnetometer(int delay) {
        if (mMagnetometer == null)
            mMagnetometer = new MagnetoMeter(reactContext);
        return (mMagnetometer.start(delay));
    }

    @ReactMethod
    public void stopMagnetometer() {
        if (mMagnetometer != null)
            mMagnetometer.stop();
    }

    @ReactMethod
    public int startStepCounter(int delay) {
        if (mStepCounter == null)
            mStepCounter = new StepCounter(reactContext);
        return (mStepCounter.start(delay));
    }

    @ReactMethod
    public void stopStepCounter() {
        if (mStepCounter != null)
            mStepCounter.stop();
    }

    @ReactMethod
    public int startThermometer(int delay) {
        if (mThermometer == null)
            mThermometer = new ThermoMeter(reactContext);
        return (mThermometer.start(delay));
    }

    @ReactMethod
    public void stopThermometer() {
        if (mThermometer != null)
            mThermometer.stop();
    }

    @ReactMethod
    public int startMotionValue(int delay) {
        if (mMotionValue == null)
            mMotionValue = new MotionValue(reactContext);
        return (mMotionValue.start(delay));
    }

    @ReactMethod
    public void stopMotionValue() {
        if (mMotionValue != null)
            mMotionValue.stop();
    }

    @ReactMethod
    public int startOrientation(int delay) {
        if (mOrientation == null)
            mOrientation = new Orientation(reactContext);
        return (mOrientation.start(delay));
    }

    @ReactMethod
    public void stopOrientation() {
        if (mOrientation != null)
            mOrientation.stop();
    }

    @ReactMethod
    public int startProximity(int delay) {
        if (mProximity == null)
            mProximity = new Proximity(reactContext);
        return (mProximity.start(delay));
    }

    @ReactMethod
    public void stopProximity() {
        if (mProximity != null)
            mProximity.stop();
    }

    @ReactMethod
    public int startLightSensor(int delay) {
        if(mLightSensor == null)
            mLightSensor = new LightSensor(reactContext);
        return (mLightSensor.start(delay));
    }

    @ReactMethod
    public void stopLightSensor() {
        if(mLightSensor != null)
            mLightSensor.stop();
    }
}