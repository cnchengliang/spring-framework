package com.smart.tx;

import org.springframework.stereotype.Service;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;

import java.util.List;
import java.util.ArrayList;

@Service
public class UserHibernateService {
    

     @Autowired
     private HibernateTemplate hibernateTemplate;

     public void addNotice(){

     }

     public boolean testSession(){
         List<Session> sessions = new ArrayList<Session>();
         sessions.add(getSessionBySessionFactoryUtils());
         sessions.add(getSessionBySessionFactoryUtils());
         sessions.add(getSessionBySessionFactory());
         return sessions.get(0) == sessions.get(1) && sessions.get(1) == sessions.get(2);
     }

     private Session getSessionBySessionFactoryUtils(){
        //return SessionFactoryUtils.getSession(hibernateTemplate.getSessionFactory(),true);
        return null;
     }

     private Session getSessionBySessionFactory(){
        return hibernateTemplate.getSessionFactory().getCurrentSession();
     }
}
