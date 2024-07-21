package com.avproject.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.avproject.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
