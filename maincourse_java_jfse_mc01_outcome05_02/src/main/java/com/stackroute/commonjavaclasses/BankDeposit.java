package com.stackroute.commonjavaclasses;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/* Complete the class as per the requirements given in PROBLEM.md */
public class BankDeposit {
    public String getMaturityDate(String investmentDate, Period duration){
        if((investmentDate != null && duration != null) && (!investmentDate.isEmpty() && !duration.isNegative())){
            String maturity;
            DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("[dd-MM-yyyy]");
            LocalDate ld= LocalDate.parse(investmentDate,dateTimeFormatter);
            ld=ld.plus(duration);
            maturity=ld.format(dateTimeFormatter).toString();
            return maturity;
        }else
            return "Please check your data you might have entered negative or null value.";
    }
    String getInvestmentDuration(String investmentDate, String maturityDate){
        if ((investmentDate !=null && maturityDate != null) || (!investmentDate.isEmpty() && !maturityDate.isEmpty())){
            DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("[dd-MM-yyyy]");
            LocalDate localDate=LocalDate.parse(investmentDate,dateTimeFormatter);
            LocalDate localDate2=LocalDate.parse(maturityDate,dateTimeFormatter);
            Period p1=Period.between(localDate,localDate2);
            String duration=p1.getYears()+","+ p1.getMonths()+","+ p1.getDays();
            return duration;
        }else
            return "Please check your data you might have entered negative or null value.";
    }
}