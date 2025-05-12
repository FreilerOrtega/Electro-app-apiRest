package com.electro.electro_app.infraestructure.utilis.validation;

import org.springframework.beans.factory.annotation.Autowired;

import com.electro.electro_app.application.service.ICountryService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ExistprofesByCountrynameValidation implements ConstraintValidator<ExistsByCountryname,String> {
    
    @Autowired
    private ICountryService service;

    @Override
    public boolean isValid(String countryname, ConstraintValidatorContext context) {
           if(service == null)
            { return true;
            }

            return !service.existsByCountryname(countryname);
        }

    
}
