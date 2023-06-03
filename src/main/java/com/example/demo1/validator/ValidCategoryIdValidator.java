package com.example.demo1.validator;

import com.example.demo1.entity.Category;
import com.example.demo1.validator.annotation.ValidCategoryId;
import com.example.demo1.entity.Category;
import com.example.demo1.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator <ValidCategoryId, Category>{
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category !=null && category.getId() != null;
    }

}