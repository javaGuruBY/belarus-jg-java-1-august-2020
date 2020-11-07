package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.DAO_bookLibrary;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.BookDatabase;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.UIAction;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.service_UI.*;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.service_bookDatabaseImpl.BookDatabaseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookLibrary {
    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our library!");
        System.out.println("Doing your choice:");

        while (true) {
            for (Map.Entry<Integer, UIAction> integerUIActionEntry : menuNumberToActionMap.entrySet()) {
                System.out.println(integerUIActionEntry.getKey() + " - " + integerUIActionEntry.getValue().getAction());
            }

            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}
