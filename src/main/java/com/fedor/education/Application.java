package com.fedor.education;

import org.apache.log4j.Logger;

/**
 * Application class.
 *
 * @author Nafaa Friaa (nafaa.friaa@isetjb.rnu.tn)
 */
public class Application
{
    final static Logger log = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        new Desktop();
    }

}
