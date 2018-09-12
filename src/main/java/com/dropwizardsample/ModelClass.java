package com.dropwizardsample;


import com.dropwizardsample.samplePackage.NewUser;
import com.dropwizardsample.utils.HibernateUtils;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.GsonBuilder;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/model")
public class ModelClass {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JSONPObject getName() {

        Session session = HibernateUtils.getSession();
        session.beginTransaction();

        NewUser entity = new NewUser(System.currentTimeMillis() + "", "Ram", "1234667899");
        session.save(entity);
        session.getTransaction().commit();
        session.close();
        return new JSONPObject("data", "hello");
    }

    @GET
    @Path("/getData")
    @Produces(MediaType.APPLICATION_JSON)
    public List<NewUser> read() {
        Session session = HibernateUtils.getSession();
        Query q = session.createSQLQuery("select * from NewUser");
        List<NewUser> user =(List<NewUser>) q.list();
        session.close();
        return user;
    }

}
