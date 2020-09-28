package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "temp_files")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TempFiles {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private long file_binary;
    private byte final_binary_byte;
}
