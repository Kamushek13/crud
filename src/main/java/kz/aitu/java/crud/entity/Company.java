package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "company")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String name_ru;
    private String name_kz;
    private String name_en;
    private String bin;
    private long parent_id;
    private long fond_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
