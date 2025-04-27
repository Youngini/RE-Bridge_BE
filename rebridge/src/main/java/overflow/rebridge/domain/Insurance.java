package overflow.rebridge.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "insurance")
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insurance_id")
    private Long insuranceId;

    @OneToOne
    @JoinColumn(name = "check_list_id")
    private CheckList checkList;

    private String departureInsurance;
    private String expenseInsurance;
    private String suretyInsurance;
    private String accidentInsurance;
}
