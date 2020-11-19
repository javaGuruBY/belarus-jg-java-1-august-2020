package com.javaguru.student_vladimir_petranovski.lesson_13.level_6.rules_for_validation;

import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.domain.Product;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.exceptions.ValidationException;

public class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        String ruleName = String.valueOf(RulesIncorrect.PRICE_INCORRECT);
        String nameDescription = "Price product";

        if (product.getPriceProduct() == null) {
            throw new ValidationException(ruleName,
                    String.valueOf(Rules.RULE_5_PRICE_MUSTNT_BE_EMPTY),
                    nameDescription);
        }

        if (product.getPriceProduct() <= 0) {
            throw new ValidationException(ruleName,
                    String.valueOf(Rules.RULE_6_PRICE_MUST_BE_BIGGER_ZERO),
                    nameDescription);
        }
    }
}
