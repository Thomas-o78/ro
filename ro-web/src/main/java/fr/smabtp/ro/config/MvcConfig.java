package fr.smabtp.ro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Validator;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright SMABTP
 */


@Configuration
@EnableWebMvc
@ComponentScan("fr.smabtp.ro.controller")
public class MvcConfig extends WebMvcConfigurerAdapter {

  private <T> List<T> buildList(T element){
    List<T> l= new ArrayList<T>();
    l.add(element);
    return l;
  }

  @Bean
  public Validator validator(){
    return new LocalValidatorFactoryBean();
  }

  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    // application/json
    MappingJackson2HttpMessageConverter jacksonConverter = new MappingJackson2HttpMessageConverter();
    jacksonConverter.setSupportedMediaTypes(buildList(MediaType.APPLICATION_JSON));
    jacksonConverter.setJsonPrefix(")]}',\n");
    converters.add(jacksonConverter);
    // application/octet-stream
    converters.add(new ByteArrayHttpMessageConverter());
  }
}
