package model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="role")
public class UserRole {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name",length = 50)
    private String name;

    @Column(name="active")
    private boolean active;

}
