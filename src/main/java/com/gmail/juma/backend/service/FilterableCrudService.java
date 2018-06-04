package com.gmail.juma.backend.service;

import java.util.List;
import java.util.Optional;

import com.gmail.juma.backend.data.entity.AbstractEntity;

public interface FilterableCrudService<T extends AbstractEntity> extends CrudService<T> {

	List<T> findAnyMatching(Optional<String> filter);

}
