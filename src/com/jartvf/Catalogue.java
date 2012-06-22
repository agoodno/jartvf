/*
 * Catalogue.java
 */
package com.jartvf;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.jar.JarInputStream;

/**
 * Catalogue
 */
public interface Catalogue {
    
    public void setJarInputStream(JarInputStream jis);
    
    public void setInputStream(InputStream is) throws IOException;
    
    public void setInputFile(String inputFileName) throws IOException;
    
    public JarInputStream getJarInputStream();
    
    public void addJar() throws IOException, ParseException;
    
}
