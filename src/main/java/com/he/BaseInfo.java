package com.he;

import java.io.Serializable;

public class BaseInfo implements Serializable {

  private static final long serialVersionUID = 4140289361791664678L;

  private String version;
  private String app_id;
  private String return_url;
  private String biz_sequence_id;
  private String biz_type;
  private String apply_time;

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getApp_id() {
    return app_id;
  }

  public void setApp_id(String app_id) {
    this.app_id = app_id;
  }

  public String getReturn_url() {
    return return_url;
  }

  public void setReturn_url(String return_url) {
    this.return_url = return_url;
  }

  public String getBiz_sequence_id() {
    return biz_sequence_id;
  }

  public void setBiz_sequence_id(String biz_sequence_id) {
    this.biz_sequence_id = biz_sequence_id;
  }

  public String getBiz_type() {
    return biz_type;
  }

  public void setBiz_type(String biz_type) {
    this.biz_type = biz_type;
  }

  public String getApply_time() {
    return apply_time;
  }

  public void setApply_time(String apply_time) {
    this.apply_time = apply_time;
  }

}
