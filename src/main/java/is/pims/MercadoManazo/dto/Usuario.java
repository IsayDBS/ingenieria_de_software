package is.pims.MercadoManazo.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

@Entity
@Getter
@EqualsAndHashCode
@Setter
@NoArgsConstructor
public class Usuario implements UserDetails {


    @SequenceGenerator(
            name = "secuencia_usuario",
            sequenceName = "secuencia_usuario",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "secuencia_usuario"
    )
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private String telefono;
    @Enumerated(EnumType.STRING)
    private RolUsuario rolUsuario;
    private Boolean locked = false;
    private Boolean enabled = false;

    public Usuario(String nombre, String apellido, String correo, String telefono, RolUsuario rolUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = generaContrasena(8);
        this.telefono = telefono;
        this.rolUsuario = rolUsuario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_"+rolUsuario.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return contrasena;
    }

    @Override
    public String getUsername() {
        return correo;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    private String generaContrasena(int longitud){
        int left = 48; //ASCII 0
        int right = 122; //ASCII z
        Random r = new Random();

        return r.ints(left,right+1)
                                .filter(i->(i<=57 || i >= 65) && (i<= 90 || i >= 97))
                                .limit(longitud).collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
    }
}
