package com.javaguru.student_vladimir_petranovski.lesson_13.level_6.rules_for_validation;

import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.domain.Product;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.exceptions.ValidationException;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.util.CheckForInvalidChars;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.util.TransformationTextInExpression;

public class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        String ruleName = String.valueOf(RulesIncorrect.DESCRIPTION_INCORRECT);
        String nameDescription = "Description product";

        if (product.getDescriptionProduct().length() > 2000) {
            throw new ValidationException(ruleName,
                    String.valueOf(Rules.RULE_7_DESCRIPTION_MUSTNT_BE_DIGGER_2000_SYMBOLS),
                    nameDescription);
        }

        if (CheckForInvalidChars.check(TransformationTextInExpression.findExpression(product.getDescriptionProduct()))) {
            throw new ValidationException(ruleName,
                    String.valueOf(Rules.RULE_8_DESCRIPTION_MUST_CONTAIN_ONLY_ENGLISH_LETTERS_AND_NUMBERS),
                    nameDescription);
        }
    }
}
