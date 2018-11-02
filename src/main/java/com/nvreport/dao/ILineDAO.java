package com.nvreport.dao;

import com.nvreport.model.Line;

import java.util.List;

public interface ILineDAO {

    List<Line> getScenes();
    List<Line> getSceneLines(String scene);
    List<Line> getLineIn(String liteTitle, String scene);
    List<Line> getLineOut(String liteTitle, String scene);

}
