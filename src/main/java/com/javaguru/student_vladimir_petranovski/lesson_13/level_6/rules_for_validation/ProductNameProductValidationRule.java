package com.javaguru.student_vladimir_petranovski.lesson_13.level_6.rules_for_validation;

import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.domain.Product;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.exceptions.ValidationException;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.util.CheckForForbiddenCharsUtil;

import java.util.regex.Pattern;

public class ProductNameProductValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        String ruleName = String.valueOf(RulesIncorrect.NAME_INCORRECT);
        String nameDescription = "Name product";

        if (product.getNameProduct().isEmpty()) {
            throw new ValidationException(ruleName,
                    String.valueOf(Rules.RULE_1_NAME_NOT_EMPTY),
                    nameDescription);
        }

        if (product.getNameProduct().length() <= 3) {
            throw new ValidationException(ruleName,
                    String.valueOf(Rules.RULE_2_NAME_ISNT_LESS_3_SYMBOLS),
                    nameDescription);
        }

        if (product.getNameProduct().length() > 100) {
            throw new ValidationException(ruleName,
                    String.valueOf(Rules.RULE_3_NAME_ISNT_BIGGER_100_SYMBOLS),
                    nameDescription);
        }

        if (CheckForForbiddenCharsUtil.check(product.getNameProduct())) {
            throw new ValidationException(ruleName,
                    String.valueOf(Rules.RULE_4_NAME_MUST_CONTAIN_ONLY_ENGLISH_LETTERS_AND_NUMBERS),
                            nameDescription);
        }
    }
}
