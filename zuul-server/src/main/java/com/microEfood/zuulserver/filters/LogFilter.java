package com.microEfood.zuulserver.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/*
 * !!!!!!!!!!!!! Ici ajouter une description de ce qu'est sensée faire la classe !!!!!!!!!!!!!
 *
 * Créée par charles.balet le 30/07/19
 *
 */
@Component
public class LogFilter extends ZuulFilter {

    Logger log = LoggerFactory.getLogger(this.getClass());


    //pre : permet d'exécuter du code avant la redirection de la requête vers sa destination finale.
    //post : permet d'exécuter du code après que la requête a été redirigée.
    //route : permet d'agir sur la façon de rediriger les requêtes.
    //error : permet d'agir en cas d'erreur lors de la redirection de la requête.
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    //Conditions
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest req = RequestContext.getCurrentContext().getRequest();

        log.info("**** Requête interceptée ! L'URL est : {} " , req.getRequestURL());

        return null;    }
}