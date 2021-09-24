package com.company.mobilephoneapiwithgraphql.api;

import com.company.mobilephoneapiwithgraphql.dto.PhoneDTO;
import com.company.mobilephoneapiwithgraphql.entity.Phone;
import com.company.mobilephoneapiwithgraphql.service.inter.PhoneServiceInter;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

@Component
@RequiredArgsConstructor
public class PhoneMutationResolver implements GraphQLMutationResolver
{

    private final PhoneServiceInter phoneService;
    private final ModelMapper modelMapper;

    public Phone addPhone (PhoneDTO phoneDTO)
    {
        Phone phone = modelMapper.map(phoneDTO, Phone.class);
        phone.setImei(ThreadLocalRandom.current().nextInt(31654, 2645649));
        return phoneService.save(phone);
    }

    public Phone updatePhone (PhoneDTO phoneDTO, Integer id)
    {
        Optional<Phone> optionalPhone = phoneService.getById(id);
        if (optionalPhone.isPresent())
        {
            optionalPhone.get().setBrandName(phoneDTO.getBrandName());
            optionalPhone.get().setModelName(phoneDTO.getModelName());

            return phoneService.save(optionalPhone.get());
        }
        return null;
    }

    public Phone removePhone (Integer id)
    {
        Optional<Phone> optionalPhone = phoneService.getById(id);
        if (optionalPhone.isPresent())
        {
            phoneService.remove(optionalPhone.get());
            return optionalPhone.get();
        }
        return null;
    }
}
