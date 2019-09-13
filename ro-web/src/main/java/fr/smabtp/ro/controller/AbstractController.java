package fr.smabtp.ro.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
public class AbstractController {

  private static final Logger TECH_LOGGER= LoggerFactory.getLogger(AbstractController.class);

  @ExceptionHandler()
  public ResponseEntity<JsonError> handleIOException(Exception ex) {

    TECH_LOGGER.warn("mvc error: ",ex);

    return new ResponseEntity<JsonError>(new JsonError(ex),HttpStatus.INTERNAL_SERVER_ERROR);

  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  @ResponseBody
  public List<ObjectError> handleValidationFailure(MethodArgumentNotValidException exception) {
    return exception.getBindingResult().getAllErrors();
  }
}
