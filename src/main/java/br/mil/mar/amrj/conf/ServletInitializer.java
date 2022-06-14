package br.mil.mar.amrj.conf;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	//roda na inicialização do sistema
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Projeto teste");
		return new Class[] {WebConfiguration.class, JPAConfiguration.class};
	}

	@Override
	//roda quand é feita uma requisição
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
	    encodingFilter.setEncoding("UTF-8");

	    return new Filter[] {encodingFilter, new OpenEntityManagerInViewFilter()};
	}
	
	@Override //trabalhar com upload de arquivos
	protected void customizeRegistration(Dynamic registration) {
		registration.setMultipartConfig(new MultipartConfigElement(""));
	}
}
