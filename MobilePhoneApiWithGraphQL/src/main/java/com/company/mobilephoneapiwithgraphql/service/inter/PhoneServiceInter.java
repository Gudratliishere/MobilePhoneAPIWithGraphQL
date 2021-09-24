package com.company.mobilephoneapiwithgraphql.service.inter;

import com.company.mobilephoneapiwithgraphql.entity.Phone;

import java.util.List;
import java.util.Optional;

public interface PhoneServiceInter
{
    List<Phone> getAll ();

    List<Phone> getByBrandName(String name);

    Optional<Phone> getById (Integer id);

    Phone save (Phone phone);

    void remove (Phone phone);
}
