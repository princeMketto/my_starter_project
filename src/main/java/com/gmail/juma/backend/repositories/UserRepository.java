package com.gmail.juma.backend.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.juma.backend.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailIgnoreCase(String email);

	Page<User> findBy(Pageable pageable);

	Page<User> findByEmailLikeIgnoreCaseOrFirstNameLikeIgnoreCaseOrLastNameLikeIgnoreCaseOrRoleLikeIgnoreCase(
			String emailLike, String firstNameLike, String lastNameLike, String roleLike, Pageable pageable);
}
