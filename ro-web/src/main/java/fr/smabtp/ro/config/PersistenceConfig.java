package fr.smabtp.ro.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * Copyright SMABTP
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="fr.smabtp.ro.repositories")
public class PersistenceConfig {

  @Value("#{systemProperties['jdbc.show-sql']?:false}")
  private boolean showSql;

  public @Bean DataSource roDS() throws Exception {
    Context ctx = new InitialContext();
    return (DataSource) ctx.lookup("java:comp/env/jdbc/RefGEDVieDS");
  }

  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws Exception {
    LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
    factoryBean.setDataSource(roDS());
    factoryBean.setPersistenceXmlLocation("classpath*:META-INF/jpa-persistence.xml");
    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    vendorAdapter.setShowSql(showSql);
    vendorAdapter.setGenerateDdl(true);
    factoryBean.setJpaVendorAdapter(vendorAdapter);
    return factoryBean;
  }

  @Bean
  public PlatformTransactionManager transactionManager() {
    return new JpaTransactionManager();
  }

}

