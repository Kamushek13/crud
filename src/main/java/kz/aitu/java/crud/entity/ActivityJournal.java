package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "activity_journal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityJournal {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String event_type;
    private String object_type;
    private long object_id;
    private long created_timestamp;
    private long created_by;
    private String message_level;
    private String message;

}
