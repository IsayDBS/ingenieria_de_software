package is.pims.MercadoManazo.dto;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Opinion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JoinColumn(name = "compra_id")
	@OneToOne(fetch = FetchType.LAZY)
	private Compra compra;
	private Integer calificacion;
	private String comentario;

	public Opinion(Compra compra, Integer calificacion, String comentario) {
		this.compra = compra;
		this.calificacion = calificacion;
		this.comentario = comentario;
	}
}
