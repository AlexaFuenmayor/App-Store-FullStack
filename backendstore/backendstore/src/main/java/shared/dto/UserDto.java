package shared.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;


@Data
public class UserDto  implements Serializable {

    @Serial
    private static final long  serialVersionUID = 1L; // Identificador de versión

    private long id;
    private String userId;
    private String username;
    private String email;
    private String role;
    private String password;
    private String encryptedPassword;
}
