package com.saraya.gestiondepark.mappers;

import com.saraya.gestiondepark.dto.RateDto;
import com.saraya.gestiondepark.models.Rate;
import org.springframework.stereotype.Service;

@Service
public class RateMapper {
    public RateDto toDto(Rate rate){
        RateDto rateDto = new RateDto();
        rateDto.setId(rate.getId());
        rateDto.setBook(rate.getBook());
        rateDto.setComment(rate.getComment());
        rateDto.setNote(rate.getNote());
        rateDto.setUser(rate.getUser());
     
        return rateDto;
    }

    public Rate toEntity(RateDto rateDto){
        Rate rate = new Rate();
        rate.setId(rateDto.getId());
        rate.setBook(rateDto.getBook());
        rate.setComment(rateDto.getComment());
        rate.setNote(rateDto.getNote());
        rate.setUser(rateDto.getUser());
        return rate;
    }
}
