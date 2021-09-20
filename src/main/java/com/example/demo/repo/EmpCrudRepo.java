package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dao.EmpDetailsDao;

public interface EmpCrudRepo extends CrudRepository<EmpDetailsDao, Integer> {

}
