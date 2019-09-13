package fr.smabtp.ro.controller;

import fr.smabtp.ro.bean.ApiResponse;
import fr.smabtp.ro.bean.ApiResponseEntity;
import fr.smabtp.ro.entities.RefActivite;
import fr.smabtp.ro.services.impl.RefActiviteService;
import fr.smabtp.s4p.rest.service.RestErrorException;
import fr.smabtp.s4p.rest.service.RestService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

import java.util.List;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping("/api/ctrl")
public class ApiController {

  @Inject
  private RefActiviteService refActiviteService;

  @RequestMapping(value = "/refActivite", produces = {APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
  @Transactional
  @ResponseBody
  public List<RefActivite> getListActivite() throws RestErrorException {
    return refActiviteService.getAll();
  }




}



  //____________________________________________________________ Ref Activite _____________________________________________//


  //____________________________________________________________ Ref Groupe Activite _____________________________________________//

