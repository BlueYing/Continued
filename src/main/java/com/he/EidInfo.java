package com.he;

import java.io.Serializable;

public class EidInfo implements Serializable{

  private static final long serialVersionUID = 8720741750540577185L;

  private String eid_user_info;
  private String eidlink_number;
  private String eid_sign_info;
  private String eid_sign_type;
  public String getEid_user_info() {
    return eid_user_info;
  }
  public void setEid_user_info(String eid_user_info) {
    this.eid_user_info = eid_user_info;
  }
  public String getEidlink_number() {
    return eidlink_number;
  }
  public void setEidlink_number(String eidlink_number) {
    this.eidlink_number = eidlink_number;
  }
  public String getEid_sign_info() {
    return eid_sign_info;
  }
  public void setEid_sign_info(String eid_sign_info) {
    this.eid_sign_info = eid_sign_info;
  }
  public String getEid_sign_type() {
    return eid_sign_type;
  }
  public void setEid_sign_type(String eid_sign_type) {
    this.eid_sign_type = eid_sign_type;
  }
  
}
