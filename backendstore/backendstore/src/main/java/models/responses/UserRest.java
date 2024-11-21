package models.responses;


import lombok.Data;


//Lo objetos de esta clase serán retornados cuando se cree el usuario
@Data
public class UserRest {
    private String userId;
    private String username;
    private String email;
    private String role;
}
