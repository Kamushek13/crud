package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "nomenclature")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nomenclature {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String nomenclature_number;
    private long year;
    private long nomenclature_summary_id;
    private long company_unit_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
