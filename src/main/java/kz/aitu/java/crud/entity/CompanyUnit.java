package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "company_unit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyUnit {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String name_ru;
    private String name_kz;
    private String name_en;
    private long parent_id;
    private long year;
    private long company_id;
    private String code_index;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
