package com.javaguru.teacher.lesson_10.lessoncode.userapplication;

import java.util.UUID;

class UserArrayRepository implements UserRepository {

    private User[] database = new User[10];

    @Override
    public User save(User user) {
        // найти свободное место (null)
        // если не найдено - увеличить массив
        user.setId(UUID.randomUUID().toString());
        database[0] = user;
        return user;
    }

    @Override
    public User findById(String id) {
        for (User user : database) {
            if (user != null && user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
