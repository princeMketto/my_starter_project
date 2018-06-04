package com.gmail.juma.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.juma.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
