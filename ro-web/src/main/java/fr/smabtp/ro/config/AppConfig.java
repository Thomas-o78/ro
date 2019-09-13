package fr.smabtp.ro.config;


import fr.sma.s4p.application.SmaAppConfAdapter;
import fr.smabtp.ro.repositories.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.inject.Inject;
/*
*
 * Copyright SMABTP

*/


@Configuration
@Import({MvcConfig.class, PersistenceConfig.class, ServiceConfig.class, RestConfig.class})
public class AppConfig  extends SmaAppConfAdapter {
  @Bean
  public DefaultConversionService conversionService() {
    final DefaultConversionService defaultConversionService = new DefaultConversionService();
    return defaultConversionService;
  }

  @Bean
  public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }



}
