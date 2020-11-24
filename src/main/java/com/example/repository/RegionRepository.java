package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer>{

}
