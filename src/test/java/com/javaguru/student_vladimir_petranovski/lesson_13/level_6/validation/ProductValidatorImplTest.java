package com.javaguru.student_vladimir_petranovski.lesson_13.level_6.validation;

import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.domain.Product;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.rules_for_validation.ProductDescriptionValidationRule;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.rules_for_validation.ProductNameProductValidationRule;
import com.javaguru.student_vladimir_petranovski.lesson_13.level_6.rules_for_validation.ProductPriceValidationRule;
import junit.framework.TestCase;
import org.junit.Before;

public class ProductValidatorImplTest extends TestCase {

    private ProductValidatorImpl test;
    private final String correctDescription = " Correct description 546";
    private final String more100Symbols = "2222222222222 222222222222222222222222222222222222222" +
            "dsjdhkjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhhhhhhhh hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
    private final String more2000Symbols = "iofsfihjfosifkosjfskfjkejfkjeosjfsofjsofsjfsj33333" +
            "hsdkfjhsfjhdfafhdhafjfhdhfkfhahdfkhadjdhf11111111jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
            "dssssssssssssssssssssssssssssss ssssssssssssssssssssssssssssssssssssssssssssssssss" +
            "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll" +
            "skallllllllllllllllllllllllllllllldssawwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww" +
            "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssdeweqwewqwwwq" +
            "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq" +
            "assssssssdddddddddddddddddddddddddddddddddddffffffffffffffffffffffffffffffffffffff" +
            "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" +
            "jkkkkkkkkkkkkkkjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
            "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr" +
            "eeeeeeeeeeeeeeeeeeeeee eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" +
            "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy" +
            "jdjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
            "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr" +
            "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" +
            "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll" +
            "pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp" +
            "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww" +
            "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" +
            "asdsdddddddddddd ddddddddwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww" +
            "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" +
            "5555555555555555555555555555555555555555555555555555555555555555555555555555555555" +
            "77777777777777777777777777777777777777777777777777777 77777777777777777777777777777" +
            "9999999999999999999999999999999999999999999999999999999999999999999999999999999999" +
            "0000000000000000000000000000000000000000000000000000000000000000000000000000000000" +
            "99999999999999999 99999999999999999999999999999999999999999999999999999999999999999";
    private final String correctName = "Correct name 123";
    private final int correctPrice = 125;

    private final Product product = new Product("", correctPrice, correctDescription);
    private final Product product1 = new Product("abc", correctPrice, correctDescription);
    private final Product product2 = new Product(more100Symbols, correctPrice, correctDescription);
    private final Product product3 = new Product("Вован здарова я надеюсь ты уже сеньер",
            correctPrice, correctDescription);
    private final Product product4 = new Product(correctName, null, correctDescription);
    private final Product product5 = new Product(correctName, 0, correctDescription);
    private final Product product6 = new Product(correctName, -190, correctDescription);
    private final Product product7 = new Product(correctName, correctPrice, more2000Symbols);
    private final Product product8 = new Product(correctName, correctPrice, "Привет");
    private final Product product9 = new Product("", null, correctDescription);
    private final Product product10 = new Product("df", 0, correctDescription);
    private final Product product11 = new Product("df", 0, more2000Symbols);

    private final ProductNameProductValidationRule productNameProductValidationRule =
            new ProductNameProductValidationRule();
    private final ProductPriceValidationRule productPriceValidationRule =
            new ProductPriceValidationRule();
    private final ProductDescriptionValidationRule productDescriptionValidationRule =
            new ProductDescriptionValidationRule();

    @Before
    public void setUp() {
        test = new ProductValidatorImpl(productNameProductValidationRule, productPriceValidationRule,
                productDescriptionValidationRule);

    }

    public void testValidateRule1() {
        assertEquals("[ValidationException{ruleName='NAME_INCORRECT', description='RULE_1_NAME_NOT_EMPTY', " +
                "fieldName='Name product'}]", test.validate(product).toString());
    }

    public void testValidateRule2() {
        assertEquals("[ValidationException{ruleName='NAME_INCORRECT', description='RULE_2_NAME_ISNT_LESS_3_SYMBOLS', " +
                "fieldName='Name product'}]", test.validate(product1).toString());
    }

    public void testValidateRule3() {
        assertEquals("[ValidationException{ruleName='NAME_INCORRECT', description='RULE_3_NAME_ISNT_BIGGER_100_SYMBOLS', " +
                "fieldName='Name product'}]", test.validate(product2).toString());
    }
    public void testValidateRule4() {
        assertEquals("[ValidationException{ruleName='NAME_INCORRECT', description='RULE_4_NAME_MUST_CONTAIN_ONLY_ENGLISH_LETTERS_AND_NUMBERS', " +
                "fieldName='Name product'}]", test.validate(product3).toString());
    }
    public void testValidateRule5() {
        assertEquals("[ValidationException{ruleName='PRICE_INCORRECT', description='RULE_5_PRICE_MUSTNT_BE_EMPTY', " +
                "fieldName='Price product'}]", test.validate(product4).toString());
    }

    public void testValidateRule6() {
        assertEquals("[ValidationException{ruleName='PRICE_INCORRECT', description='RULE_6_PRICE_MUST_BE_BIGGER_ZERO', " +
                "fieldName='Price product'}]", test.validate(product5).toString());
    }

    public void testValidateRule6_0() {
        assertEquals("[ValidationException{ruleName='PRICE_INCORRECT', description='RULE_6_PRICE_MUST_BE_BIGGER_ZERO', " +
                "fieldName='Price product'}]", test.validate(product6).toString());
    }

    public void testValidateRule7() {
        assertEquals("[ValidationException{ruleName='DESCRIPTION_INCORRECT', description='RULE_7_DESCRIPTION_MUSTNT_BE_DIGGER_2000_SYMBOLS', " +
                "fieldName='Description product'}]", test.validate(product7).toString());
    }

    public void testValidateRule8() {
        assertEquals("[ValidationException{ruleName='DESCRIPTION_INCORRECT', description='RULE_8_DESCRIPTION_MUST_CONTAIN_ONLY_ENGLISH_LETTERS_AND_NUMBERS', " +
                "fieldName='Description product'}]", test.validate(product8).toString());
    }

    public void testValidateInvalidNameAndPrice() {
        assertEquals("[ValidationException{ruleName='NAME_INCORRECT', description='RULE_1_NAME_NOT_EMPTY', " +
                        "fieldName='Name product'}, ValidationException{ruleName='PRICE_INCORRECT', " +
                        "description='RULE_5_PRICE_MUSTNT_BE_EMPTY', fieldName='Price product'}]",
                test.validate(product9).toString());
    }

    public void testValidateInvalidNameAndDescription() {
        assertEquals("[ValidationException{ruleName='NAME_INCORRECT', description='RULE_2_NAME_ISNT_LESS_3_SYMBOLS', " +
                        "fieldName='Name product'}, ValidationException{ruleName='PRICE_INCORRECT', " +
                        "description='RULE_6_PRICE_MUST_BE_BIGGER_ZERO', fieldName='Price product'}]",
                test.validate(product10).toString());
    }

    public void testValidateInvalidAllExceptions() {
        assertEquals("[ValidationException{ruleName='NAME_INCORRECT', description='RULE_2_NAME_ISNT_LESS_3_SYMBOLS', " +
                        "fieldName='Name product'}, ValidationException{ruleName='PRICE_INCORRECT', " +
                        "description='RULE_6_PRICE_MUST_BE_BIGGER_ZERO', fieldName='Price product'}, " +
                        "ValidationException{ruleName='DESCRIPTION_INCORRECT', " +
                        "description='RULE_7_DESCRIPTION_MUSTNT_BE_DIGGER_2000_SYMBOLS', fieldName='Description product'}]",
                test.validate(product11).toString());
    }
}