package com.company.mobilephoneapiwithgraphql.dto;

import com.company.mobilephoneapiwithgraphql.entity.Phone;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhoneDTO
{
    private String brandName;
    private String modelName;

    public static PhoneDTO of (Phone phone)
    {
        PhoneDTO phoneDTO = new PhoneDTO();
        phoneDTO.setBrandName(phone.getBrandName());
        phoneDTO.setModelName(phone.getModelName());
        return phoneDTO;
    }
}
