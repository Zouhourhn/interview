package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Competence;
@Repository
public interface CompetenceRepository extends JpaRepository<Competence, Long> {

}
