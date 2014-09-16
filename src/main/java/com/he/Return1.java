package com.he;

import java.io.Serializable;

public class Return1 implements Serializable {
  

  private static final long serialVersionUID = 9191848622042478716L;
  private String version;
  private String result;
  private String eid_cert;
  private String biz_sequence_id;
  private String result_time;
  private String eID_number;
  private String name;
  private String idnumber;
  private String extension;
  private String hmac_type;
  private String hmac_value;
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }
  public String getEid_cert() {
    return eid_cert;
  }
  public void setEid_cert(String eid_cert) {
    this.eid_cert = eid_cert;
  }
  public String getBiz_sequence_id() {
    return biz_sequence_id;
  }
  public void setBiz_sequence_id(String biz_sequence_id) {
    this.biz_sequence_id = biz_sequence_id;
  }
  public String getResult_time() {
    return result_time;
  }
  public void setResult_time(String result_time) {
    this.result_time = result_time;
  }
  public String geteID_number() {
    return eID_number;
  }
  public void seteID_number(String eID_number) {
    this.eID_number = eID_number;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getIdnumber() {
    return idnumber;
  }
  public void setIdnumber(String idnumber) {
    this.idnumber = idnumber;
  }
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }
  public String getHmac_type() {
    return hmac_type;
  }
  public void setHmac_type(String hmac_type) {
    this.hmac_type = hmac_type;
  }
  public String getHmac_value() {
    return hmac_value;
  }
  public void setHmac_value(String hmac_value) {
    this.hmac_value = hmac_value;
  }

}
