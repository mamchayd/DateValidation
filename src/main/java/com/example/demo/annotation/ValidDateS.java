package com.example.demo.annotation;

import com.example.demo.validator.ValidDateValidatorS;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target( {TYPE,ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidDateValidatorS.class )
public @interface ValidDateS {

    String message() default "invalid date DLR > DRE" ;
    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
