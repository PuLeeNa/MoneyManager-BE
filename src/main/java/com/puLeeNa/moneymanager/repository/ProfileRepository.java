package com.puLeeNa.moneymanager.repository;

import com.puLeeNa.moneymanager.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository {

    // select * from profile where email = ?
    Optional<ProfileEntity> findByEmail(String email);
}
