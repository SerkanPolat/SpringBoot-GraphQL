package com.sp.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.sp.graphql.dto.ArabaDTO;
import com.sp.graphql.entity.Araba;
import com.sp.graphql.repo.ArabaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Calendar;

//CRUD Islemleri MutationResolverda yapilir.
@Component
@RequiredArgsConstructor
public class ArabaMutationResolver implements GraphQLMutationResolver {
    private final ArabaRepository arabaRepository;
    public Araba ArabaOlustur(ArabaDTO arabaDTO){
        return arabaRepository.save(dtoToEntity(arabaDTO));
    }

    private Araba dtoToEntity(ArabaDTO arabaDTO){
        Araba araba = new Araba();
        araba.setArabaTip(arabaDTO.getArabaTip());
        araba.setMarkaAd(arabaDTO.getMarkaAd());
        araba.setModelKod(arabaDTO.getModelKod());
        araba.setUretimTarihi(Calendar.getInstance().getTime());
        return araba;
    }

}
