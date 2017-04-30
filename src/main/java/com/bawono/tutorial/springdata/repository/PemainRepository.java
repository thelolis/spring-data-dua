package com.bawono.tutorial.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bawono.tutorial.springdata.model.Pemain;

@Repository("pemainRepository")
public interface PemainRepository extends JpaRepository<Pemain, Long> {

}
