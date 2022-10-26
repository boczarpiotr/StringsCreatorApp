package com.boczar.StringsCreatorApp.repository;

import com.boczar.StringsCreatorApp.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
}
