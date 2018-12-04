package com.srm.test.clientinfo.config;

import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Clase que permite controlar el cross domain agregando a la
 * cabecera de la petion post,update,options,delete.
 */
@Component
public class SimpleCORSFilter implements Filter {
    private final List<String> allowedOrigins = Arrays.asList("http://www.sckola.com"
            , "http://sckola.com", "https://sckola.com", "https://www.sckola.com", "http://localhost:8000");

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        // Lets make sure that we are working with HTTP (that is, against HttpServletRequest and HttpServletResponse objects)
        if (req instanceof HttpServletRequest && res instanceof HttpServletResponse) {
            HttpServletRequest request = (HttpServletRequest) req;
            HttpServletResponse response = (HttpServletResponse) res;

            // Access-Control-Allow-Origin
            String origin = request.getHeader("Origin");
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Vary", "Origin");

            // Access-Control-Max-Age
            response.setHeader("Access-Control-Max-Age", "3600");

            // Access-Control-Allow-Credentials
            response.setHeader("Access-Control-Allow-Credentials", "true");

            // Access-Control-Allow-Methods
            response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");


            // Access-Control-Allow-Headers
            response.setHeader("Access-Control-Allow-Headers", "X-PINGOTHER,Origin, " +
                    "Accept, Content-Type, X-Requested-With, X-CSRF-Token, Access-Control-Request-Method," +
                    " Access-Control-Request-Headers");
        }

        chain.doFilter(req, res);
    }

    public void init(FilterConfig filterConfig) {

    }

    public void destroy() {
    }

}
