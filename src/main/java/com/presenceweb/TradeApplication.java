package com.presenceweb;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;


@SpringBootApplication
public class TradeApplication extends SpringBootServletInitializer implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(TradeApplication.class);
	private TemplateEngine templateEngine;
	
/*	public TradeApplication(final ServletContext servletContext) {
		
		super();
		
		ServletContextTemplateResolver templateResolver =
				new ServletContextTemplateResolver(servletContext);
		
		// HTML is the default mode, but we set it anyway for better understanding of code        
		templateResolver.setTemplateMode(TemplateMode.HTML);
		// This will convert "home" to "/WEB-INF/templates/home.html"
		templateResolver.setPrefix("/WEB-INF/templates/");
		templateResolver.setSuffix(".html");
		// Template cache TTL=1h. If not set, entries would be cached until expelled        
		templateResolver.setCacheTTLMs(Long.valueOf(3600000L));
		// Cache is set to true by default. Set to false if you want templates to
		// be automatically updated when modified.
		templateResolver.setCacheable(true);
		
		this.templateEngine =new TemplateEngine();
		this.templateEngine.setTemplateResolver(templateResolver);
	}
	*/
	
    
	public static void main(String[] args) {
		
		SpringApplication.run(TradeApplication.class, args);
	}
	@Override
	   public void run(String... arg0) throws Exception {
	 logger.warn("Trade application is started");
	}
	
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(TradeApplication.class);
	 }
}
