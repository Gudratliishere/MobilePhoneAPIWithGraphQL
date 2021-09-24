package com.company.mobilephoneapiwithgraphql.service.impl;

import com.company.mobilephoneapiwithgraphql.entity.Phone;
import com.company.mobilephoneapiwithgraphql.repository.PhoneRepository;
import com.company.mobilephoneapiwithgraphql.service.inter.PhoneServiceInter;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PhoneServiceImpl implements PhoneServiceInter
{

    private final PhoneRepository phoneRepository;

    public PhoneServiceImpl (PhoneRepository phoneRepository)
    {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public List<Phone> getAll ()
    {
        return phoneRepository.findAll();
    }

    @Override
    public List<Phone> getByBrandName (String name)
    {
        return phoneRepository.findByBrandNameLike(name);
    }

    @Override
    public Optional<Phone> getById (Integer id)
    {
        return phoneRepository.findById(id);
    }

    @Override
    public Phone save (Phone phone)
    {
        return phoneRepository.save(phone);
    }

    @Override
    public void remove (Phone phone)
    {
        phoneRepository.delete(phone);
    }
}
