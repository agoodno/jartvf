/*
 * TestCatalogue.java
 */
package com.jartvf;

import java.io.IOException;
import java.util.jar.JarEntry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * TestCatalogue
 */
public class TestCatalogue extends BaseCatalogue {
    
	private static Log log = LogFactory.getLog(TestCatalogue.class);
	
	
    /**
     * Creates a new instance of TestCatalogue
     */
    public TestCatalogue() {
        super();
    }
 
    public void addJar() throws IOException {
        JarEntry ze = null;
        while ((ze = jis.getNextJarEntry()) != null) {
            if (!ze.isDirectory()) {
                String zeName = ze.getName();
                log.debug(zeName);
            }
        }
    }
}
