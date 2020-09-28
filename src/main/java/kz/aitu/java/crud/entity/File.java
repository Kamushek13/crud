package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "file")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class File {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String name;
    private String type;
    private long size;
    private long page_count;
    private String hash;
    private boolean is_deleted;
    private long file_binary_id;
    private long created_timestamp;
    private long created_by;
    private long updated_timestamp;
    private long updated_by;
}
