package overflow.rebridge.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "industry_category")
public class IndustryCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "industry_category_id")
    private String industryId;

    @Column(name = "category_name")
    private String catergoryName;

    @OneToMany(mappedBy = "industryCategory")
    private List<Company> companies = new ArrayList<>();
}
