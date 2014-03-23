package org.wei.secondapp.init;

import java.util.Properties;

//import com.jolbox.bonecp.BoneCPDataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@ComponentScan({"org.wei.secondapp.model","org.wei.secondapp.service","org.wei.secondapp.service","org.wei.secondapp.controller"})
@EnableWebMvc
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
@ImportResource("/WEB-INF/spring/root-context.xml")
@EnableJpaRepositories("org.wei.spring.repository")
public class WebAppConfig {

	private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";
	private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";
	private static final String PROPERTY_NAME_DATABASE_URL = "db.url";
	private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";

	private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
	private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
	private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";

	@Resource
	private Environment env;

//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//		dataSource.setDriverClassName(env
//				.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
//		dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
//		dataSource.setUsername(env
//				.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
//		dataSource.setPassword(env
//				.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
//
//		return dataSource;
//	}
//
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//		//entityManagerFactoryBean.setDataSource(dataSource());
//		entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistence.class);
//		entityManagerFactoryBean.setPersistenceUnitName("MySql");
//		entityManagerFactoryBean
//				.setPackagesToScan(env
//						.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));
//
//		entityManagerFactoryBean.setJpaProperties(hibProperties());
//
//		return entityManagerFactoryBean;
//	}
//
//	private Properties hibProperties() {
//		Properties properties = new Properties();
//		properties.put(PROPERTY_NAME_HIBERNATE_DIALECT,
//				env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
//		properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL,
//				env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
//		return properties;
//	}
//
//	@Bean
//	public JpaTransactionManager transactionManager() {
//		JpaTransactionManager transactionManager = new JpaTransactionManager();
//		transactionManager.setEntityManagerFactory(entityManagerFactory()
//				.getObject());
//		return transactionManager;
//	}
//
//	@Bean
//	public UrlBasedViewResolver setupViewResolver() {
//		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
//		resolver.setPrefix("/WEB-INF/pages/");
//		resolver.setSuffix(".jsp");
//		resolver.setViewClass(JstlView.class);
//		return resolver;
//	}

}