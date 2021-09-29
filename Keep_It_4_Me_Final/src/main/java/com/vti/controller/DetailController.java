package com.vti.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vti.entity.DetailGoal;
import com.vti.service.DetailGoalService;

import javax.validation.Valid;

@Controller
public class DetailController {

    @Autowired
    private DetailGoalService detailGoalService;

    @GetMapping("/detailgoal")
    public String list(Model model) {
        model.addAttribute("detailgoals", detailGoalService.findAll());
        return "list";
    }

    @SuppressWarnings("deprecation")
	@GetMapping("/detailgoal/search")
    public String search(@RequestParam("term") String term, Model model) {
        if (StringUtils.isEmpty(term)) {
            return "redirect:/detailgoal";
        }

        model.addAttribute("detailgoals", detailGoalService.search(term));
        return "list";
    }

    @GetMapping("/detailgoal/add")
    public String add(Model model) {
        model.addAttribute("detailgoal", new DetailController());
        return "form";
    }

    @GetMapping("/detailgoal/{id}/edit")
    public String edit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("detailgoal", detailGoalService.findOne(id));
        return "form";
    }

    @PostMapping("/detailgoal/save")
    public String save(@Valid DetailGoal detailGoal, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "form";
        }
        detailGoalService.save(detailGoal);
        redirect.addFlashAttribute("successMessage", "Saved contact successfully!");
        return "redirect:/detailgoal";
    }

    @GetMapping("/detailgoal/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
    	detailGoalService.delete(id);
        redirect.addFlashAttribute("successMessage", "Deleted contact successfully!");
        return "redirect:/detailgoal";
    }

}

