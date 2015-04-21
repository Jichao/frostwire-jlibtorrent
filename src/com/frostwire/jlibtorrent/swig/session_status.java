/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class session_status {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected session_status(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(session_status obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_session_status(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHas_incoming_connections(boolean value) {
    libtorrent_jni.session_status_has_incoming_connections_set(swigCPtr, this, value);
  }

  public boolean getHas_incoming_connections() {
    return libtorrent_jni.session_status_has_incoming_connections_get(swigCPtr, this);
  }

  public void setUpload_rate(int value) {
    libtorrent_jni.session_status_upload_rate_set(swigCPtr, this, value);
  }

  public int getUpload_rate() {
    return libtorrent_jni.session_status_upload_rate_get(swigCPtr, this);
  }

  public void setDownload_rate(int value) {
    libtorrent_jni.session_status_download_rate_set(swigCPtr, this, value);
  }

  public int getDownload_rate() {
    return libtorrent_jni.session_status_download_rate_get(swigCPtr, this);
  }

  public void setTotal_download(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_download_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_download() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_download_get(swigCPtr, this), true);
  }

  public void setTotal_upload(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_upload_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_upload() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_upload_get(swigCPtr, this), true);
  }

  public void setPayload_upload_rate(int value) {
    libtorrent_jni.session_status_payload_upload_rate_set(swigCPtr, this, value);
  }

  public int getPayload_upload_rate() {
    return libtorrent_jni.session_status_payload_upload_rate_get(swigCPtr, this);
  }

  public void setPayload_download_rate(int value) {
    libtorrent_jni.session_status_payload_download_rate_set(swigCPtr, this, value);
  }

  public int getPayload_download_rate() {
    return libtorrent_jni.session_status_payload_download_rate_get(swigCPtr, this);
  }

  public void setTotal_payload_download(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_payload_download_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_payload_download() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_payload_download_get(swigCPtr, this), true);
  }

  public void setTotal_payload_upload(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_payload_upload_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_payload_upload() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_payload_upload_get(swigCPtr, this), true);
  }

  public void setIp_overhead_upload_rate(int value) {
    libtorrent_jni.session_status_ip_overhead_upload_rate_set(swigCPtr, this, value);
  }

  public int getIp_overhead_upload_rate() {
    return libtorrent_jni.session_status_ip_overhead_upload_rate_get(swigCPtr, this);
  }

  public void setIp_overhead_download_rate(int value) {
    libtorrent_jni.session_status_ip_overhead_download_rate_set(swigCPtr, this, value);
  }

  public int getIp_overhead_download_rate() {
    return libtorrent_jni.session_status_ip_overhead_download_rate_get(swigCPtr, this);
  }

  public void setTotal_ip_overhead_download(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_ip_overhead_download_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_ip_overhead_download() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_ip_overhead_download_get(swigCPtr, this), true);
  }

  public void setTotal_ip_overhead_upload(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_ip_overhead_upload_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_ip_overhead_upload() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_ip_overhead_upload_get(swigCPtr, this), true);
  }

  public void setDht_upload_rate(int value) {
    libtorrent_jni.session_status_dht_upload_rate_set(swigCPtr, this, value);
  }

  public int getDht_upload_rate() {
    return libtorrent_jni.session_status_dht_upload_rate_get(swigCPtr, this);
  }

  public void setDht_download_rate(int value) {
    libtorrent_jni.session_status_dht_download_rate_set(swigCPtr, this, value);
  }

  public int getDht_download_rate() {
    return libtorrent_jni.session_status_dht_download_rate_get(swigCPtr, this);
  }

  public void setTotal_dht_download(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_dht_download_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_dht_download() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_dht_download_get(swigCPtr, this), true);
  }

  public void setTotal_dht_upload(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_dht_upload_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_dht_upload() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_dht_upload_get(swigCPtr, this), true);
  }

  public void setTracker_upload_rate(int value) {
    libtorrent_jni.session_status_tracker_upload_rate_set(swigCPtr, this, value);
  }

  public int getTracker_upload_rate() {
    return libtorrent_jni.session_status_tracker_upload_rate_get(swigCPtr, this);
  }

  public void setTracker_download_rate(int value) {
    libtorrent_jni.session_status_tracker_download_rate_set(swigCPtr, this, value);
  }

  public int getTracker_download_rate() {
    return libtorrent_jni.session_status_tracker_download_rate_get(swigCPtr, this);
  }

  public void setTotal_tracker_download(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_tracker_download_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_tracker_download() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_tracker_download_get(swigCPtr, this), true);
  }

  public void setTotal_tracker_upload(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_tracker_upload_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_tracker_upload() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_tracker_upload_get(swigCPtr, this), true);
  }

  public void setTotal_redundant_bytes(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_redundant_bytes_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_redundant_bytes() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_redundant_bytes_get(swigCPtr, this), true);
  }

  public void setTotal_failed_bytes(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_total_failed_bytes_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getTotal_failed_bytes() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_total_failed_bytes_get(swigCPtr, this), true);
  }

  public void setNum_peers(int value) {
    libtorrent_jni.session_status_num_peers_set(swigCPtr, this, value);
  }

  public int getNum_peers() {
    return libtorrent_jni.session_status_num_peers_get(swigCPtr, this);
  }

  public void setNum_unchoked(int value) {
    libtorrent_jni.session_status_num_unchoked_set(swigCPtr, this, value);
  }

  public int getNum_unchoked() {
    return libtorrent_jni.session_status_num_unchoked_get(swigCPtr, this);
  }

  public void setAllowed_upload_slots(int value) {
    libtorrent_jni.session_status_allowed_upload_slots_set(swigCPtr, this, value);
  }

  public int getAllowed_upload_slots() {
    return libtorrent_jni.session_status_allowed_upload_slots_get(swigCPtr, this);
  }

  public void setUp_bandwidth_queue(int value) {
    libtorrent_jni.session_status_up_bandwidth_queue_set(swigCPtr, this, value);
  }

  public int getUp_bandwidth_queue() {
    return libtorrent_jni.session_status_up_bandwidth_queue_get(swigCPtr, this);
  }

  public void setDown_bandwidth_queue(int value) {
    libtorrent_jni.session_status_down_bandwidth_queue_set(swigCPtr, this, value);
  }

  public int getDown_bandwidth_queue() {
    return libtorrent_jni.session_status_down_bandwidth_queue_get(swigCPtr, this);
  }

  public void setUp_bandwidth_bytes_queue(int value) {
    libtorrent_jni.session_status_up_bandwidth_bytes_queue_set(swigCPtr, this, value);
  }

  public int getUp_bandwidth_bytes_queue() {
    return libtorrent_jni.session_status_up_bandwidth_bytes_queue_get(swigCPtr, this);
  }

  public void setDown_bandwidth_bytes_queue(int value) {
    libtorrent_jni.session_status_down_bandwidth_bytes_queue_set(swigCPtr, this, value);
  }

  public int getDown_bandwidth_bytes_queue() {
    return libtorrent_jni.session_status_down_bandwidth_bytes_queue_get(swigCPtr, this);
  }

  public void setOptimistic_unchoke_counter(int value) {
    libtorrent_jni.session_status_optimistic_unchoke_counter_set(swigCPtr, this, value);
  }

  public int getOptimistic_unchoke_counter() {
    return libtorrent_jni.session_status_optimistic_unchoke_counter_get(swigCPtr, this);
  }

  public void setUnchoke_counter(int value) {
    libtorrent_jni.session_status_unchoke_counter_set(swigCPtr, this, value);
  }

  public int getUnchoke_counter() {
    return libtorrent_jni.session_status_unchoke_counter_get(swigCPtr, this);
  }

  public void setDisk_write_queue(int value) {
    libtorrent_jni.session_status_disk_write_queue_set(swigCPtr, this, value);
  }

  public int getDisk_write_queue() {
    return libtorrent_jni.session_status_disk_write_queue_get(swigCPtr, this);
  }

  public void setDisk_read_queue(int value) {
    libtorrent_jni.session_status_disk_read_queue_set(swigCPtr, this, value);
  }

  public int getDisk_read_queue() {
    return libtorrent_jni.session_status_disk_read_queue_get(swigCPtr, this);
  }

  public void setDht_nodes(int value) {
    libtorrent_jni.session_status_dht_nodes_set(swigCPtr, this, value);
  }

  public int getDht_nodes() {
    return libtorrent_jni.session_status_dht_nodes_get(swigCPtr, this);
  }

  public void setDht_node_cache(int value) {
    libtorrent_jni.session_status_dht_node_cache_set(swigCPtr, this, value);
  }

  public int getDht_node_cache() {
    return libtorrent_jni.session_status_dht_node_cache_get(swigCPtr, this);
  }

  public void setDht_torrents(int value) {
    libtorrent_jni.session_status_dht_torrents_set(swigCPtr, this, value);
  }

  public int getDht_torrents() {
    return libtorrent_jni.session_status_dht_torrents_get(swigCPtr, this);
  }

  public void setDht_global_nodes(SWIGTYPE_p_size_type value) {
    libtorrent_jni.session_status_dht_global_nodes_set(swigCPtr, this, SWIGTYPE_p_size_type.getCPtr(value));
  }

  public SWIGTYPE_p_size_type getDht_global_nodes() {
    return new SWIGTYPE_p_size_type(libtorrent_jni.session_status_dht_global_nodes_get(swigCPtr, this), true);
  }

  public void setActive_requests(dht_lookup_vector value) {
    libtorrent_jni.session_status_active_requests_set(swigCPtr, this, dht_lookup_vector.getCPtr(value), value);
  }

  public dht_lookup_vector getActive_requests() {
    long cPtr = libtorrent_jni.session_status_active_requests_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dht_lookup_vector(cPtr, false);
  }

  public void setDht_routing_table(dht_routing_bucket_vector value) {
    libtorrent_jni.session_status_dht_routing_table_set(swigCPtr, this, dht_routing_bucket_vector.getCPtr(value), value);
  }

  public dht_routing_bucket_vector getDht_routing_table() {
    long cPtr = libtorrent_jni.session_status_dht_routing_table_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dht_routing_bucket_vector(cPtr, false);
  }

  public void setDht_total_allocations(int value) {
    libtorrent_jni.session_status_dht_total_allocations_set(swigCPtr, this, value);
  }

  public int getDht_total_allocations() {
    return libtorrent_jni.session_status_dht_total_allocations_get(swigCPtr, this);
  }

  public void setUtp_stats(utp_status value) {
    libtorrent_jni.session_status_utp_stats_set(swigCPtr, this, utp_status.getCPtr(value), value);
  }

  public utp_status getUtp_stats() {
    long cPtr = libtorrent_jni.session_status_utp_stats_get(swigCPtr, this);
    return (cPtr == 0) ? null : new utp_status(cPtr, false);
  }

  public void setPeerlist_size(int value) {
    libtorrent_jni.session_status_peerlist_size_set(swigCPtr, this, value);
  }

  public int getPeerlist_size() {
    return libtorrent_jni.session_status_peerlist_size_get(swigCPtr, this);
  }

  public session_status() {
    this(libtorrent_jni.new_session_status(), true);
  }

}
