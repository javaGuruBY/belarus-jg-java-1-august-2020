package com.javaguru.student_vladimir_petranovski.lesson_13.level_6.validation;

import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.domain.Product;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.exceptions.ValidationException;

import java.util.List;

public interface ProductValidator {

    List<ValidationException> validate(Product product);
}
