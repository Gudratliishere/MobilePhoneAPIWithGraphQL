package com.company.mobilephoneapiwithgraphql.repository;

import com.company.mobilephoneapiwithgraphql.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone, Integer>
{
    List<Phone> findByBrandNameLike (String name);
}
