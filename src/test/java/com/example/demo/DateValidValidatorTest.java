package com.example.demo;

import com.example.demo.annotation.ValidDateS;
import com.example.demo.dto.OperationVdrDto;
import com.example.demo.validator.ValidDateValidatorS;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import javax.validation.ConstraintValidatorContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DateValidValidatorTest {
    @Mock
    private ValidDateS validDateS;
    @Mock
    private ConstraintValidatorContext constraintValidatorContext;

    @BeforeAll
    static void beforeAlmTests() {System.out.println("---Test Started in DateValidValidatorTest ----: "); }

    @BeforeEach
    void initTest(TestInfo testInfo){
        System.out.println("Starting the test " + testInfo.getDisplayName());
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("---All tests in DateValidValidatorTest has been finished---");
    }

    @Test
    @DisplayName("Test if the object is null with the annotion equalTo")
    public void isFieldNull(){
        ValidDateValidatorS validDateValidatorS=new ValidDateValidatorS();


    }

}
