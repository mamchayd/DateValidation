package com.example.demo.validator;

import com.example.demo.annotation.ValidDateS;
import com.example.demo.dto.OperationVdrDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidDateValidatorS implements ConstraintValidator<ValidDateS, OperationVdrDto> {

    @Override
    public boolean isValid(OperationVdrDto operationVdrDto, ConstraintValidatorContext context) {
        boolean result = true;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (operationVdrDto != null) {
            try {
                if(!(sdf.parse(operationVdrDto.getDateLimiteRealisation()))
                        .before(sdf.parse(operationVdrDto.getDateRealisationEtude()))) {
                    result=false;
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return result; }

}
