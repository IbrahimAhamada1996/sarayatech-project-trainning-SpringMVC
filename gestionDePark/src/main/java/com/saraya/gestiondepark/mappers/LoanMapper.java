package com.saraya.gestiondepark.mappers;

import com.saraya.gestiondepark.dto.LoanDto;
import com.saraya.gestiondepark.models.Loan;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
@Service
public class LoanMapper {

    public LoanDto toDto(Loan loan){
        LoanDto loanDto = new LoanDto();
        loanDto.setId(loan.getId());
        loanDto.setBooks(loan.getBooks());
        loanDto.setEndDate(formatString(loan.getEndDate()));
        loanDto.setStartDate(formatString(loan.getStartDate()));
        return loanDto;
    }

    public Loan toEntity(LoanDto loanDto){
       Loan loan = new Loan();
       loan.setId(loanDto.getId());
       loan.setBooks(loanDto.getBooks());
       loan.setEndDate(formatLocalDate(loanDto.getEndDate()));
       loan.setStartDate(formatLocalDate(loanDto.getStartDate()));
        return loan;
    }

    private String formatString(LocalDate localDate){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd")
                .withZone(ZoneId.systemDefault());
        return format.format(localDate);
    }

    private LocalDate formatLocalDate(String dateString){

        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
