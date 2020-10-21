package com.javaguru.teacher.lesson_10.lessoncode.userapplication;

public interface UserRepository {

    User save(User user);

    User findById(String id);

}
