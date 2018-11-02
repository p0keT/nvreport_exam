package com.nvreport.controller;


import com.nvreport.model.Line;
import com.nvreport.model.LinePassingInfo;
import com.nvreport.model.LinePassingResult;
import com.nvreport.service.ILineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {

    @Autowired
    private ILineService iLineService;

    private String selectedProfile;
    private String selectedLine;
    private LinePassingInfo linePassingInfo = new LinePassingInfo();

    @GetMapping("/scenes")
    public String index(Model model){
        model.addAttribute("scenes", iLineService.getScenes());
        model.addAttribute("line", new Line());
        return "scenes";
    }

    @PostMapping("/scenes")
    public String selectScene(@ModelAttribute Line line){
        selectedProfile = line.getScene_id();
        return "redirect:/lines";
    }

    @GetMapping("/lines")
    public String linesPage(Model model){
        model.addAttribute("lines", iLineService.getSceneLines(selectedProfile));
        model.addAttribute("linePassingInfo", new LinePassingInfo());
        return "/lines";
    }
    @PostMapping("/lines")
    public String selectLine(@ModelAttribute LinePassingInfo linePassingInfo){
        selectedLine = linePassingInfo.getLineName();
        this.linePassingInfo = linePassingInfo;
        return "redirect:/result";
    }

    @GetMapping("/result")
    public String resultPage(Model model){
        List<LinePassingResult> passingResult = new ArrayList<>();
        passingResult.add(iLineService.getLineResult(selectedLine,selectedProfile));
        model.addAttribute("results", passingResult);
        return "/result";
    }
}
