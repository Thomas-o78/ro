package fr.smabtp.ro.config;

import fr.smabtp.ro.resolver.UserSessionResolver;
import fr.smabtp.s4p.rest.service.EnableSmaREST;
import fr.smabtp.s4p.rest.service.RestConfigurerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

@Configuration
@EnableTransactionManagement
@EnableAspectJAutoProxy
@ComponentScan({ "fr.smabtp.ro.controller" })
@EnableSmaREST
public class RestConfig extends RestConfigurerAdapter {

  @Bean
  public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
      return new PropertySourcesPlaceholderConfigurer();
  }

@Bean
  public UserSessionResolver userResolver(){
    return new UserSessionResolver();
  }

  @Override
  public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
    argumentResolvers.add(userResolver());
  }


  @Bean
  public ViewResolver getViewResolver() {
      InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
      viewResolver.setViewClass(JstlView.class);
      viewResolver.setContentType("text/html");
      viewResolver.setPrefix("/WEB-INF/views/jsp/");
      viewResolver.setSuffix(".jsp");
      return viewResolver;
  }

}
