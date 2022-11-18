package com.example.Prudtask.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Prudtask.Entity.Betting;

@Repository
public interface BetsRepo extends JpaRepository<Betting,Integer>{

}
