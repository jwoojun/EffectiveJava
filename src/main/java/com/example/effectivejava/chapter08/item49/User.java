package com.example.effectivejava.chapter08.item49;

import java.util.Objects;

public class User {
      private final Long id;
      private final String name;
      private final String password;

      public User(Long id, String name, String password) {
        this.id = Objects.requireNonNull(id, "id를 반드시 입력해주세요.");
        this.name = Objects.requireNonNull(name, "이름을 반드시 입력해주세요.");
        this.password = Objects.requireNonNull(password, "비밀번호를 반드시 입력해주세요.");
      }
}



