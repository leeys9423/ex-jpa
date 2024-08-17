package hellojpa;

import jakarta.persistence.*;

@Entity
public class MemberProduct {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
}
