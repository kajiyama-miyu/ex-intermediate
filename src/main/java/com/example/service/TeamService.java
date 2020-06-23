package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Teams;
import com.example.repository.form.teamRepository;

@Service
@Transactional
public class TeamService {

	@Autowired
	private teamRepository repository;
	
	
	public List<Teams> showTeamList(){
		return repository.findAll();
	}
	
	public Teams showDetail(Integer id) {
		return repository.load(id);
	}
}
