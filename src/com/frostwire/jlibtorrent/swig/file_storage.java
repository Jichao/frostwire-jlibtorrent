/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class file_storage {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected file_storage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(file_storage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_file_storage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public file_storage() {
    this(libtorrent_jni.new_file_storage(), true);
  }

  public boolean is_valid() {
    return libtorrent_jni.file_storage_is_valid(swigCPtr, this);
  }

  public void reserve(int num_files) {
    libtorrent_jni.file_storage_reserve(swigCPtr, this, num_files);
  }

  public void add_file(file_entry e, String filehash) {
    libtorrent_jni.file_storage_add_file__SWIG_0(swigCPtr, this, file_entry.getCPtr(e), e, filehash);
  }

  public void add_file(file_entry e) {
    libtorrent_jni.file_storage_add_file__SWIG_1(swigCPtr, this, file_entry.getCPtr(e), e);
  }

  public void add_file(String p, SWIGTYPE_p_size_type size, int flags, int mtime, String s_p) {
    libtorrent_jni.file_storage_add_file__SWIG_2(swigCPtr, this, p, SWIGTYPE_p_size_type.getCPtr(size), flags, mtime, s_p);
  }

  public void add_file(String p, SWIGTYPE_p_size_type size, int flags, int mtime) {
    libtorrent_jni.file_storage_add_file__SWIG_3(swigCPtr, this, p, SWIGTYPE_p_size_type.getCPtr(size), flags, mtime);
  }

  public void add_file(String p, SWIGTYPE_p_size_type size, int flags) {
    libtorrent_jni.file_storage_add_file__SWIG_4(swigCPtr, this, p, SWIGTYPE_p_size_type.getCPtr(size), flags);
  }

  public void add_file(String p, SWIGTYPE_p_size_type size) {
    libtorrent_jni.file_storage_add_file__SWIG_5(swigCPtr, this, p, SWIGTYPE_p_size_type.getCPtr(size));
  }

  public void rename_file(int index, String new_filename) {
    libtorrent_jni.file_storage_rename_file(swigCPtr, this, index, new_filename);
  }

  public void rename_file_borrow(int index, String new_filename, int len) {
    libtorrent_jni.file_storage_rename_file_borrow(swigCPtr, this, index, new_filename, len);
  }

  public file_slice_vector map_block(int piece, SWIGTYPE_p_size_type offset, int size) {
    return new file_slice_vector(libtorrent_jni.file_storage_map_block(swigCPtr, this, piece, SWIGTYPE_p_size_type.getCPtr(offset), size), true);
  }

  public peer_request map_file(int file, SWIGTYPE_p_size_type offset, int size) {
    return new peer_request(libtorrent_jni.file_storage_map_file(swigCPtr, this, file, SWIGTYPE_p_size_type.getCPtr(offset), size), true);
  }

  public int num_files() {
    return libtorrent_jni.file_storage_num_files(swigCPtr, this);
  }

  public file_entry at(int index) {
    return new file_entry(libtorrent_jni.file_storage_at(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_size_type total_size() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.file_storage_total_size(swigCPtr, this), true);
  }

  public void set_num_pieces(int n) {
    libtorrent_jni.file_storage_set_num_pieces(swigCPtr, this, n);
  }

  public int num_pieces() {
    return libtorrent_jni.file_storage_num_pieces(swigCPtr, this);
  }

  public void set_piece_length(int l) {
    libtorrent_jni.file_storage_set_piece_length(swigCPtr, this, l);
  }

  public int piece_length() {
    return libtorrent_jni.file_storage_piece_length(swigCPtr, this);
  }

  public int piece_size(int index) {
    return libtorrent_jni.file_storage_piece_size(swigCPtr, this, index);
  }

  public void set_name(String n) {
    libtorrent_jni.file_storage_set_name(swigCPtr, this, n);
  }

  public String name() {
    return libtorrent_jni.file_storage_name(swigCPtr, this);
  }

  public void swap(file_storage ti) {
    libtorrent_jni.file_storage_swap(swigCPtr, this, file_storage.getCPtr(ti), ti);
  }

  public void optimize(int pad_file_limit, int alignment) {
    libtorrent_jni.file_storage_optimize__SWIG_0(swigCPtr, this, pad_file_limit, alignment);
  }

  public void optimize(int pad_file_limit) {
    libtorrent_jni.file_storage_optimize__SWIG_1(swigCPtr, this, pad_file_limit);
  }

  public void optimize() {
    libtorrent_jni.file_storage_optimize__SWIG_2(swigCPtr, this);
  }

  public sha1_hash hash(int index) {
    return new sha1_hash(libtorrent_jni.file_storage_hash(swigCPtr, this, index), true);
  }

  public String symlink(int index) {
    return libtorrent_jni.file_storage_symlink(swigCPtr, this, index);
  }

  public int mtime(int index) {
    return libtorrent_jni.file_storage_mtime(swigCPtr, this, index);
  }

  public String file_path(int index, String save_path) {
    return libtorrent_jni.file_storage_file_path__SWIG_0(swigCPtr, this, index, save_path);
  }

  public String file_path(int index) {
    return libtorrent_jni.file_storage_file_path__SWIG_1(swigCPtr, this, index);
  }

  public String file_name(int index) {
    return libtorrent_jni.file_storage_file_name(swigCPtr, this, index);
  }

  public SWIGTYPE_p_size_type file_size(int index) {
    return new SWIGTYPE_p_size_type(libtorrent_jni.file_storage_file_size(swigCPtr, this, index), true);
  }

  public boolean pad_file_at(int index) {
    return libtorrent_jni.file_storage_pad_file_at(swigCPtr, this, index);
  }

  public SWIGTYPE_p_size_type file_offset(int index) {
    return new SWIGTYPE_p_size_type(libtorrent_jni.file_storage_file_offset(swigCPtr, this, index), true);
  }

  public int file_flags(int index) {
    return libtorrent_jni.file_storage_file_flags(swigCPtr, this, index);
  }

  public SWIGTYPE_p_size_type file_base(int index) {
    return new SWIGTYPE_p_size_type(libtorrent_jni.file_storage_file_base(swigCPtr, this, index), true);
  }

  public void set_file_base(int index, SWIGTYPE_p_size_type off) {
    libtorrent_jni.file_storage_set_file_base(swigCPtr, this, index, SWIGTYPE_p_size_type.getCPtr(off));
  }

  public int file_index_at_offset(SWIGTYPE_p_size_type offset) {
    return libtorrent_jni.file_storage_file_index_at_offset(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(offset));
  }

  public String file_name_ptr(int index) {
    return libtorrent_jni.file_storage_file_name_ptr(swigCPtr, this, index);
  }

  public int file_name_len(int index) {
    return libtorrent_jni.file_storage_file_name_len(swigCPtr, this, index);
  }

  public enum flags_t {
    pad_file(libtorrent_jni.file_storage_pad_file_get()),
    attribute_hidden(libtorrent_jni.file_storage_attribute_hidden_get()),
    attribute_executable(libtorrent_jni.file_storage_attribute_executable_get()),
    attribute_symlink(libtorrent_jni.file_storage_attribute_symlink_get());

    public final int swigValue() {
      return swigValue;
    }

    public static flags_t swigToEnum(int swigValue) {
      flags_t[] swigValues = flags_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (flags_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + flags_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private flags_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private flags_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private flags_t(flags_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum file_flags_t {
    flag_pad_file(libtorrent_jni.file_storage_flag_pad_file_get()),
    flag_hidden(libtorrent_jni.file_storage_flag_hidden_get()),
    flag_executable(libtorrent_jni.file_storage_flag_executable_get()),
    flag_symlink(libtorrent_jni.file_storage_flag_symlink_get());

    public final int swigValue() {
      return swigValue;
    }

    public static file_flags_t swigToEnum(int swigValue) {
      file_flags_t[] swigValues = file_flags_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (file_flags_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + file_flags_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private file_flags_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private file_flags_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private file_flags_t(file_flags_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
