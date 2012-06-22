/*
 * Cataloger.java
 */
package com.jartvf;

import java.io.IOException;
import java.text.ParseException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Cataloger
 */
public class Cataloger {
    
	private static Log log = LogFactory.getLog(Cataloger.class);
	
    /**
     * 
     */
    private Catalogue catalogue;

    /**
     * Getter for property catalogue.
     * 
     * @return Value of property catalogue.
     */
    public Catalogue getCatalog() {
        return this.catalogue;
    }

    /**
     * Setter for property catalogue.
     * 
     * @param catalogue New value of property catalogue.
     */
    public void setCatalog(Catalogue catalogue) {
        this.catalogue = catalogue;
    }
    
    /**
     * 
     * @throws IOException
     */
    public void catalog(String inputFileName) throws IOException, ParseException {
    	log.error("Adding to catalogue...");
    	catalogue.setInputFile(inputFileName);
        catalogue.addJar();
        catalogue.getJarInputStream().close();
    }
    
    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    	
        ClassPathResource resource = new ClassPathResource("/com/jartvf/Cataloger.bdf.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Cataloger cataloger = (Cataloger)factory.getBean("cataloger");
        cataloger.catalog(args[0]);
    }
}
