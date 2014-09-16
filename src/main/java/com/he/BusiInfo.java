package com.he;

import java.io.Serializable;

public class BusiInfo implements Serializable {

  private static final long serialVersionUID = 6049112868833249684L;
  private String real_name_info;
  private String data_to_sign;
  private String data_to_sign_mac;
  public String getReal_name_info() {
    return real_name_info;
  }
  public void setReal_name_info(String real_name_info) {
    this.real_name_info = real_name_info;
  }
  public String getData_to_sign() {
    return data_to_sign;
  }
  public void setData_to_sign(String data_to_sign) {
    this.data_to_sign = data_to_sign;
  }
  public String getData_to_sign_mac() {
    return data_to_sign_mac;
  }
  public void setData_to_sign_mac(String data_to_sign_mac) {
    this.data_to_sign_mac = data_to_sign_mac;
  }

}
