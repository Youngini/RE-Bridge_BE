package overflow.rebridge.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private Long documentId;

    @OneToOne
    @JoinColumn(name = "check_list_id")
    private CheckList checkList;

    private String customDeclaration;
    private String severancePay;
}
