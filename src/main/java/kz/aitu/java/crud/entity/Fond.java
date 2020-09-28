package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "fond")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fond {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String fond_number;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
