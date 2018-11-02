package com.nvreport.service;

import com.nvreport.model.Line;
import com.nvreport.model.LinePassingInfo;
import com.nvreport.model.LinePassingResult;

import java.util.List;

public interface ILineService {

    List<Line> getScenes();
    List<Line> getSceneLines(String scene);
    LinePassingResult getLineResult(String liteTitle, String scene);


}
