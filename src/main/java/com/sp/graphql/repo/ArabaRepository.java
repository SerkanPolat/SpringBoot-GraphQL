package com.sp.graphql.repo;

import com.sp.graphql.entity.Araba;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ArabaRepository extends JpaRepository<Araba,Long> {
    List<Araba> getByArabaTipLike(String tip);
}
