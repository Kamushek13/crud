package kz.aitu.java.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "authorizations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authorization {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private long ID;
    private String username;
    private String email;
    private String password;
    private String role;
    private String forgot_password_key;
    private long forgot_password_key_timestamp;
    private long company_unit_id;
}
