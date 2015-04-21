/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class ipv4_peer_entry_vector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ipv4_peer_entry_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ipv4_peer_entry_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_ipv4_peer_entry_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ipv4_peer_entry_vector() {
    this(libtorrent_jni.new_ipv4_peer_entry_vector(), true);
  }

  public long size() {
    return libtorrent_jni.ipv4_peer_entry_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.ipv4_peer_entry_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.ipv4_peer_entry_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libtorrent_jni.ipv4_peer_entry_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.ipv4_peer_entry_vector_clear(swigCPtr, this);
  }

  public void add(SWIGTYPE_p_libtorrent__ipv4_peer_entry x) {
    libtorrent_jni.ipv4_peer_entry_vector_add(swigCPtr, this, SWIGTYPE_p_libtorrent__ipv4_peer_entry.getCPtr(x));
  }

  public SWIGTYPE_p_libtorrent__ipv4_peer_entry get(int i) {
    return new SWIGTYPE_p_libtorrent__ipv4_peer_entry(libtorrent_jni.ipv4_peer_entry_vector_get(swigCPtr, this, i), false);
  }

  public void set(int i, SWIGTYPE_p_libtorrent__ipv4_peer_entry val) {
    libtorrent_jni.ipv4_peer_entry_vector_set(swigCPtr, this, i, SWIGTYPE_p_libtorrent__ipv4_peer_entry.getCPtr(val));
  }

}
