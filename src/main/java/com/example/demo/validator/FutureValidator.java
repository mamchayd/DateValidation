package com.example.demo.validator;

import com.example.demo.annotation.DateFuture;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FutureValidator implements ConstraintValidator<DateFuture,String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        Date today=new Date();
        boolean result=true;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date newDate = sdf.parse(value);
            if( !newDate.before(today) || newDate.after(today)){
                result=true;
            }else {
                result=false;
            }

        }catch (Exception e){
            e.getMessage();
        }
        return result;
    }
}
