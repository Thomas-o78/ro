package fr.smabtp.ro.bean;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class ApiResponseEntity<R extends ApiResponse> extends ResponseEntity<R> {

  public ApiResponseEntity(HttpStatus statusCode) {
    super(statusCode);
  }

  public ApiResponseEntity(R body, HttpStatus statusCode) {
    super(body, statusCode);
  }

  public ApiResponseEntity(MultiValueMap<String, String> headers, HttpStatus statusCode) {
    super(headers, statusCode);
  }

  public ApiResponseEntity(R body, MultiValueMap<String, String> headers, HttpStatus statusCode) {
    super(body, headers, statusCode);
  }
}
