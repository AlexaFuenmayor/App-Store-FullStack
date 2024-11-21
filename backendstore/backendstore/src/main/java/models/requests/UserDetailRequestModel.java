package models.requests;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class UserDetailRequestModel {

    private String username;
    private String email;
    private String password;
    private String role;

}
