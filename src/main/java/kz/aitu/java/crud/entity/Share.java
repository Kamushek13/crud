package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "share")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Share {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private long request_id;
    private String note;
    private long sender_id;
    private long receiver_id;
    private long share_timestamp;
}
