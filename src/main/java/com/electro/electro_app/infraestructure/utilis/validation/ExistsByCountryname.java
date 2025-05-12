package com.electro.electro_app.infraestructure.utilis.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = ExistprofesByCountrynameValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistsByCountryname {
    String message() default "ya exite en la base de datos !,escoja otro username ";

    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default{};

}
