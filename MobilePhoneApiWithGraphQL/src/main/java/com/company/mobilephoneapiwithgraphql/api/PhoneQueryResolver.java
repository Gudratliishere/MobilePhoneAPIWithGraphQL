package com.company.mobilephoneapiwithgraphql.api;

import com.company.mobilephoneapiwithgraphql.entity.Phone;
import com.company.mobilephoneapiwithgraphql.service.inter.PhoneServiceInter;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PhoneQueryResolver implements GraphQLQueryResolver
{

    private final PhoneServiceInter phoneService;

    public List<Phone> getByBrandName (String name)
    {
        return phoneService.getByBrandName(name);
    }

    public Phone getById (Integer id)
    {
        return phoneService.getById(id).orElse(null);
    }

    public List<Phone> getAll ()
    {
        return phoneService.getAll();
    }
}
