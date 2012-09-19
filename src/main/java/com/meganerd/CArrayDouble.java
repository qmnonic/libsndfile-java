/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.meganerd;

public class CArrayDouble {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CArrayDouble(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CArrayDouble obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsndfileJNI.delete_CArrayDouble(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CArrayDouble(int nelements) {
    this(libsndfileJNI.new_CArrayDouble(nelements), true);
  }

  public double getitem(int index) {
    return libsndfileJNI.CArrayDouble_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, double value) {
    libsndfileJNI.CArrayDouble_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_double cast() {
    long cPtr = libsndfileJNI.CArrayDouble_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public static CArrayDouble frompointer(SWIGTYPE_p_double t) {
    long cPtr = libsndfileJNI.CArrayDouble_frompointer(SWIGTYPE_p_double.getCPtr(t));
    return (cPtr == 0) ? null : new CArrayDouble(cPtr, false);
  }

}
