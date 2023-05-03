package gcu.backend.userservice.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Lob
    @Column(name = "contents")
    private String contents;

    @Builder
    public User(String name, String address, Integer age, String contents) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.contents = contents;
    }
//
//    public void update(User another) {
//        this.name = another.name;
//        this.address = another.address;
//        this.age = another.age;
//        this.contents = another.contents;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof User)) return false;
//        User article = (User) o;
//        return getId().equals(article.getId());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
}
