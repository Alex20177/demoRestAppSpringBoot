package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.example.entity.Location;

public interface LocationRepositoryPageable extends PagingAndSortingRepository<Location, Integer>{

}
