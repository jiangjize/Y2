
package sy.security;

        import java.util.Collection;

        import org.springframework.security.core.GrantedAuthority;
        import org.springframework.security.core.userdetails.UserDetails;

public class UserLoginDetails implements UserDetails{


    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private boolean enabled;
    private Collection<? extends GrantedAuthority> authorities;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }



    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }


    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public boolean isAccountNonExpired() {
        return enabled;
    }

    public boolean isAccountNonLocked() {
        return enabled;
    }

    public boolean isCredentialsNonExpired() {
        return enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

}
