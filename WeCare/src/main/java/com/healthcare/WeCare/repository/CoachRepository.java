package com.healthcare.WeCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.WeCare.entity.Coach;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long>{

}
