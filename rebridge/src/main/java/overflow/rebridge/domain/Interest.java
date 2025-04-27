package overflow.rebridge.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "interest")
public class Interest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interest_id")
    private Long interestId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "interest1", nullable = false)
    private String interest1;

    @Column(name = "interest2")
    private String interest2;
}
