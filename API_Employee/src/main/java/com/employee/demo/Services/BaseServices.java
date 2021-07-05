package com.employee.demo.Services;

import java.util.List;
import java.util.Optional;

public interface BaseServices<T, ID> {

	List<T> findAll();

	Optional<T> findById(ID id);

	void insert(T t);

	void update(T t);

	void save(T t);

	void delete(T t);
}
