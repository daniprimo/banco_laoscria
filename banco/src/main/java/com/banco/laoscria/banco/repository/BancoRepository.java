package com.banco.laoscria.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.laoscria.banco.models.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Long>{

}
