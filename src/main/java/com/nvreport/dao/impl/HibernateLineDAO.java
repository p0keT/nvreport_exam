package com.nvreport.dao.impl;

import com.nvreport.dao.ILineDAO;
import com.nvreport.model.Line;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HibernateLineDAO implements ILineDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return  sessionFactory.openSession();
    }

    @Override
    public List<Line> getScenes() {
        Query<Line> q = currentSession().createQuery(
                "from Line group by scene_id"
        );
        return q.getResultList();
    }

    @Override
    public List<Line> getSceneLines(String scene) {
        Query<Line> q = currentSession().createQuery(
                "from Line where scene_id=:scene group by lineTitle", Line.class);
        q.setParameter("scene",scene);
        return q.getResultList();
    }

    @Override
    public List<Line> getLineIn(String line, String scene) {
        Query<Line> q = currentSession().createQuery(
                "from Line where (lineTitle=:line and scene_id=:scene and status=1)", Line.class);
        q.setParameter("line",line);
        q.setParameter("scene",scene);
        return q.getResultList();
    }

    @Override
    public List<Line> getLineOut(String line, String scene) {
        Query<Line> q = currentSession().createQuery(
                "from Line where (lineTitle=:line and scene_id=:scene and status=0)", Line.class);
        q.setParameter("line",line);
        q.setParameter("scene",scene);
        return q.getResultList();
    }
}
