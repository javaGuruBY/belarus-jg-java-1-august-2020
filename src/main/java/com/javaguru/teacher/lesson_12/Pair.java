package com.javaguru.teacher.lesson_12;

class Pair<R, L> {

    R right;
    L left;

    public Pair(R right, L left) {
        this.right = right;
        this.left = left;
    }

    public R getRight() {
        return right;
    }

    public L getLeft() {
        return left;
    }
}
