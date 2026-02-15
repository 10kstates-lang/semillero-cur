package com.cur.semillero.semilleroservice.repository;

import com.cur.semillero.semilleroservice.model.Semillero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemilleroRepository extends JpaRepository<Semillero, Long> {
}