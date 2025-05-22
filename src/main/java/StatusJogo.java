import jakarta.persistence.*;

@Entity
public class StatusJogo extends BaseEntity{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
}
