package jpabook.jpashop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS") // DB마다 다르지만 DB에는 Order가 order by, 예약으로 걸려있는 경우가 있다. 그래서 ORDERS로 많이 쓴다.
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING) // ORDINAL 쓰면 나중에 꼬여서 들어가게 될 경우 큰 장애가 날 수 있다.
    private OrderStatus status;

}
