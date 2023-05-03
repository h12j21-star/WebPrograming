package gcu.backend.orderservice;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Table(name = "gcuorder")
public class Order implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    String member;
    @Column
    String product;

    @Builder
    public Order(String member, String product){
        this.member = member;
        this.product = product;
    }
}
