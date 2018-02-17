package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Address;

public interface IAddressRepository extends CrudRepository<Address, Long>{

}
