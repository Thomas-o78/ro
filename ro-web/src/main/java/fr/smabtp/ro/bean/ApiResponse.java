package fr.smabtp.ro.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse<T> {

  @JsonProperty("datas")
  private T datas;

  @JsonProperty("error")
  private IError error;

  public ApiResponse() {
    super();
  }

  public ApiResponse(T datas) {
    this();
    this.datas = datas;
  }

  public ApiResponse(T datas, IError error) {
    this(datas);
    this.error = error;
  }

  public T getDatas() {
    return datas;
  }

  public void setDatas(T datas) {
    this.datas = datas;
  }

  public IError getError() {
    return error;
  }

  public void setError(IError error) {
    this.error = error;
  }

}
