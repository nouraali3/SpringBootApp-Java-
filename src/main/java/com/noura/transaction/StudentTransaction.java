package com.noura.transaction;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.noura.entity.Driver;

@Transactional
public interface StudentTransaction extends JpaRepository<Driver, Integer>
{
	public Iterable<Driver> getStudentById(final int id);
}
