package com.nvreport.service;

import com.nvreport.dao.ILineDAO;
import com.nvreport.model.Line;
import com.nvreport.model.LinePassingInfo;
import com.nvreport.model.LinePassingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LineServiceImpl implements ILineService {

    @Autowired
    private ILineDAO iLineDAO;

    @Override
    public List<Line> getScenes() {
        return iLineDAO.getScenes();
    }

    @Override
    public List<Line> getSceneLines(String scene) {
        return iLineDAO.getSceneLines(scene);
    }

    @Override
    public LinePassingResult getLineResult(String liteTitle, String scene) {

        return new LinePassingResult(
                liteTitle,
                iLineDAO.getLineIn(liteTitle,scene).size(),
                iLineDAO.getLineOut(liteTitle,scene).size(),
                1
        );
    }

}
