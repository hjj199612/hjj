package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Graduate;

@Repository
public interface GraduateDao extends JpaRepository<Graduate,Integer>{
    public Graduate findByUsernameAndPassword(String username, String password);
    public ArrayList<Graduate> findGraduatesByUsername(String username);
	public Graduate findGraduateById(Integer id);
	public ArrayList<Graduate> findGraduatesBySchool(String school, Sort sort);	
}
