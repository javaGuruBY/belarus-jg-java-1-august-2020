package com.javaguru.student_vladimir_petranovski.lesson_13.level_6.validation;

import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.domain.Product;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.exceptions.ValidationException;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.rules_for_validation.FieldValidationRule;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.rules_for_validation.ProductDescriptionValidationRule;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.rules_for_validation.ProductNameProductValidationRule;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.rules_for_validation.ProductPriceValidationRule;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {

//    private ProductNameProductValidationRule productNameProductValidationRule;
//    private ProductPriceValidationRule productPriceValidationRule;
//    private ProductDescriptionValidationRule productDescriptionValidationRule;
    private final List<FieldValidationRule> validationRules = new ArrayList<>();

    public ProductValidatorImpl(ProductNameProductValidationRule productNameProductValidationRule,
                                ProductPriceValidationRule productPriceValidationRule,
                                ProductDescriptionValidationRule productDescriptionValidationRule) {
//        this.productNameProductValidationRule = productNameProductValidationRule;
//        this.productPriceValidationRule = productPriceValidationRule;
//        this.productDescriptionValidationRule = productDescriptionValidationRule;
        validationRules.add(productNameProductValidationRule);
        validationRules.add(productPriceValidationRule);
        validationRules.add(productDescriptionValidationRule);
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        for (FieldValidationRule exceptionRules : validationRules) {
            try {
                exceptionRules.validate(product);
            } catch (ValidationException e){
                exceptions.add(e);
            }
        }

//        try {
//            productNameProductValidationRule.validate(product);
//        } catch(ValidationException e) {
//            exceptions.add(e);
//        }try {
//            productPriceValidationRule.validate(product);
//        } catch(ValidationException e) {
//            exceptions.add(e);
//        }
//        try {
//            productDescriptionValidationRule.validate(product);
//        } catch(ValidationException e) {
//            exceptions.add(e);
//        }

        return exceptions;
    }
}
