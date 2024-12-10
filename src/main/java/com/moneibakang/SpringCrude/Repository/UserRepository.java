package com.moneibakang.SpringCrude.Repository;

import com.moneibakang.SpringCrude.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}