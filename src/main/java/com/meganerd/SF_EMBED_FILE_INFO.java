/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.meganerd;

public class SF_EMBED_FILE_INFO {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SF_EMBED_FILE_INFO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SF_EMBED_FILE_INFO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsndfileJNI.delete_SF_EMBED_FILE_INFO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOffset(long value) {
    libsndfileJNI.SF_EMBED_FILE_INFO_offset_set(swigCPtr, this, value);
  }

  public long getOffset() {
    return libsndfileJNI.SF_EMBED_FILE_INFO_offset_get(swigCPtr, this);
  }

  public void setLength(long value) {
    libsndfileJNI.SF_EMBED_FILE_INFO_length_set(swigCPtr, this, value);
  }

  public long getLength() {
    return libsndfileJNI.SF_EMBED_FILE_INFO_length_get(swigCPtr, this);
  }

  public SF_EMBED_FILE_INFO() {
    this(libsndfileJNI.new_SF_EMBED_FILE_INFO(), true);
  }

}
