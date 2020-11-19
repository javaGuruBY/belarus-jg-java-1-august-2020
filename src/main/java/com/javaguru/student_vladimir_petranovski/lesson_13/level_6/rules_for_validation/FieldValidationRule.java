package com.javaguru.student_vladimir_petranovski.lesson_13.level_6.rules_for_validation;

import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.domain.Product;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.exceptions.ValidationException;

public interface FieldValidationRule {

    void validate(Product product) throws ValidationException;
}
