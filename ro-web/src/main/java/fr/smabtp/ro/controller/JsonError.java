package fr.smabtp.ro.controller;
public class JsonError {

  private String error;

  public JsonError(Exception exception) {
    this.error= exception.getMessage();
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

}
