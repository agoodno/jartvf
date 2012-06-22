/*
 * BaseCatalogue.java
 */
package com.jartvf;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarInputStream;

/**
 * BaseCatalogue
 */
public abstract class BaseCatalogue implements Catalogue {

	
    /**
     * Holds value of property jis.
     */
    protected JarInputStream jis;
    
    /**
     * Creates a new instance of BaseCatalogue
     */
    public BaseCatalogue() {
    }
    

    public void setJarInputStream(JarInputStream jis) {
        this.jis = jis;
    }
    
    public void setInputStream(InputStream is) throws IOException {
        this.jis = new JarInputStream(is);
    }

    public void setInputFile(String inputFile) throws IOException {
        this.setInputStream(new FileInputStream(inputFile));
    }
    
    public JarInputStream getJarInputStream() {
        return jis;
    }
   
}
