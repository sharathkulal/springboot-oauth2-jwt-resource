/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sharath.oauthresource;

import org.apache.log4j.Logger;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sampe Rest Endpoint
 * @author Sharath Kulal
 */
@RestController
public class RestExample {
    
    private final static Logger LOG = Logger.getLogger(RestExample.class);
    
    @RequestMapping("/simple")
    String home() {
        LOG.info("enter /simple endpoint");
        return "Hello World!";
    }
    
    @PreAuthorize("#oauth2.hasScope('read')")
    //@PreAuthorize("hasAuthority('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/secure")
    String secure() {
        LOG.info("enter /secure endpoint");
        return "Hello World! Secure";
    }
}
