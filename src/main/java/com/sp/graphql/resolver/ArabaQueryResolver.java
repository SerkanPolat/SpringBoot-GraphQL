package com.sp.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sp.graphql.entity.Araba;
import com.sp.graphql.repo.ArabaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ArabaQueryResolver implements GraphQLQueryResolver {

    private final ArabaRepository arabaRepository;

    public List<Araba> getAraba(String arabaTip){
        return arabaRepository.getByArabaTipLike(arabaTip);
    }
    public Optional<Araba> getById(Long Id){
        return arabaRepository.findById(Id);
    }
}
