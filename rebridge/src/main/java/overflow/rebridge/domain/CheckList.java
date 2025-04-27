package overflow.rebridge.domain;

import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

@Entity
@Table(name = "checklist")
public class CheckList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "check_list_id")
    private Long checkListId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne(mappedBy = "checkList", cascade = CascadeType.ALL)
    private TrainingProgram trainingProgram;

    @OneToOne(mappedBy = "checkList", cascade = CascadeType.ALL)
    private Document document;

    @OneToOne(mappedBy = "checkList", cascade = CascadeType.ALL)
    private Insurance insurance;
}
