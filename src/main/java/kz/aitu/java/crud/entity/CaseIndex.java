package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "case_index")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaseIndex {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String case_index;
    private String title_ru;
    private String title_kz;
    private String title_en;
    private long storage_type;
    private long storage_year;
    private String note;
    private long company_unit_id;
    private long nomenclature_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
