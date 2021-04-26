package com.example.demo.dto;

import com.example.demo.annotation.ValidDateS;
import com.example.demo.constant.Constaints;
import lombok.*;


import javax.validation.constraints.Pattern;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ValidDateS
public class OperationVdrDto {


    @Pattern(regexp = Constaints.DATEFORMAT,message = "Invalid date Format")
    private String dateRealisationEtude;
    @Pattern(regexp = Constaints.DATEFORMAT,message = "Invalid date Format")
    private String dateLimiteRealisation;


}
