package com.swe645.springboot.rest.survey.springboot2restservicebasic.form;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Form, Long>{

}
