package com.example.controlle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Teams;
import com.example.service.TeamService;

@Controller
@RequestMapping("/teams")
public class TeamController {

	@Autowired
	private TeamService service;
	
	@RequestMapping("/showList")
	public String showList(Model model) {
		List<Teams> teamList = service.showTeamList();
		model.addAttribute("teamList", teamList);
		return "teamlist";
	}
}
