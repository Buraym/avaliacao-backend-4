package com.example.avaliacao4.repository;

import com.example.avaliacao4.model.Empresa;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends PagingAndSortingRepository<Empresa, Long> {}
