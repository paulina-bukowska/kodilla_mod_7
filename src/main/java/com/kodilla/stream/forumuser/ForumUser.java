package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final Integer id;
    private final String name;
    private final Character sex;
    private final LocalDate birthDate;
    private final Integer postsNum;

    public ForumUser(final Integer id, final String name, final Character sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final Integer postsNum) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNum = postsNum;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Character getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getPostsNum() {
        return postsNum;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNum=" + postsNum +
                '}';
    }
}
