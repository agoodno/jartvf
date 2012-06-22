/*
 * TestOutputter.java
 */
package com.jartvf;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import com.jartvf.db.Jar;
import com.jartvf.util.HibernateUtil;

/**
 * DbCatalogue
 */
public class DbCatalogue extends BaseCatalogue {
    
	private static Log log = LogFactory.getLog(DbCatalogue.class);
	private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
	
    /** Creates a new instance of TestOutputter */
    public DbCatalogue() {
        super();
    }
    
    public void addJar() throws IOException, ParseException {

        ZipEntry ze = null;
        Manifest manifest = jis.getManifest();
        Attributes attrs = manifest.getMainAttributes();
        Object[] nameValuePairs = attrs.entrySet().toArray();
        for (int i = 0; i < nameValuePairs.length; i++) {
            log.debug(nameValuePairs[i]);
        }
        
        Jar jar = new Jar();
        jar.setDescription("Apache implementation of XML transformer library");
        jar.setDirectUrl(false);
        jar.setFileName("xerces.jar");
        jar.setVersion("2.6.2");
        jar.setSize(1010806);
        jar.setStamp(df.parse("2006-11-18 13:50"));
        
        while ((ze = jis.getNextEntry()) != null) {
            if (!ze.isDirectory()) {
                String zeName = ze.getName();
                log.debug(zeName);
            }
        }
    	
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(jar);
        session.getTransaction().commit();
    	HibernateUtil.getSessionFactory().close();
    }
    
}
