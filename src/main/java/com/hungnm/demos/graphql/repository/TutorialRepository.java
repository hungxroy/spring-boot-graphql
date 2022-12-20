package com.hungnm.demos.graphql.repository;

import com.hungnm.demos.graphql.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
