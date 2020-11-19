// Khadija Kobra
// G01120432
// Arnab Debnath
// G01120433
// REST Service and JPA

package com.swe645.springboot.rest.survey.springboot2restservicebasic.form;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Form, Long>{

}
