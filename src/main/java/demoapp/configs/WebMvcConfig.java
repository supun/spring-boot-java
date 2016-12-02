package demoapp.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import demoapp.util.WebConstants;

@Configuration
@EnableWebMvc
@ComponentScan({ "demoapp" })
public class WebMvcConfig extends WebMvcConfigurerAdapter
{
	private static final Logger LOGGER = LoggerFactory.getLogger( WebMvcConfig.class );
	@Autowired
	Environment env;

	@Autowired
	@Qualifier("jstlViewResolver")
	private ViewResolver jstlViewResolver;

	@Override
	public void addResourceHandlers( ResourceHandlerRegistry registry )
	{

		String staticHtmlPath = env.getProperty( WebConstants.STATIC_WEB_HTML_RESOURCES );
		String staticCssPath = env.getProperty( WebConstants.STATIC_WEB_CSS_JS_RESOURCES );

		if ( staticHtmlPath != null )
		{
			registry.addResourceHandler( "/**" ).addResourceLocations( WebConstants.FILE_PROTOCAL + staticHtmlPath ).addResourceLocations( WebConstants.FILE_PROTOCAL + staticCssPath );
		}

		LOGGER.info( "Resource locations are successfully configured." );
	}

	@Bean
	@DependsOn({ "jstlViewResolver" })
	public ViewResolver viewResolver()
	{
		return jstlViewResolver;
	}

	@Bean(name = "jstlViewResolver")
	public ViewResolver jstlViewResolver()
	{
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix( "" ); // NOTE: no preffix here
		resolver.setViewClass( JstlView.class );
		resolver.setSuffix( ".html" ); // NOTE: no suffix here
		return resolver;
	}

	@Override
	public void addViewControllers( ViewControllerRegistry registry )
	{
		registry.addViewController( "/" ).setViewName( "forward:/index.html" );
	}

}
