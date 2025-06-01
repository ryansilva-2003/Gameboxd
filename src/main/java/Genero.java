import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "genero")
public class Genero extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_genero", nullable = false)
    private int idGenero;

    @Column (name = "genero",length = 50, nullable = false)
    private String genero;

    @ManyToMany(mappedBy = "genero")
    private List<Jogos> jogos;

    public Genero (){}

        public int getIdGenero(){
            return idGenero;
        }

        public void setIdGenero(int idGenero){
        this.idGenero = idGenero;
        }

        public String getGenero(){
        return genero;
        }

        public void setGenero(String genero){
        this.genero = genero;
        }
}
