package is.pims.MercadoManazo.dto;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne()
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;
	private String nombre;
	private String descripcion;
	private Double precio;
	private Integer inventario;
	private String imagen;
	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
	private Set<Compra> compras;

	public Producto(Usuario usuario, String nombre, String descripcion, Double precio, Integer inventario, String imagen, Compra... compras) {
		this.usuario = usuario;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.inventario = inventario;
		this.imagen = imagen;
		for (Compra c: compras) c.setProducto(this);
		this.compras = Stream.of(compras).collect(Collectors.toSet());
	}
}
