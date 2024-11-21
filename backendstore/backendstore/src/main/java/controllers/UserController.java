package controllers;


import models.requests.UserDetailRequestModel;
import models.responses.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import shared.dto.UserDto;

@RestController
@RequestMapping("/users") //url: localhost:8080/users
public class UserController {

    @GetMapping
    public String getUser(){
        return "User data";
    }

    @PostMapping
    //cuando se envíe una request llegara en obj JSON, java lo convertirá
    //al obj JAVA UserDetail...ya que tiene las mismas propiedades. Así tendré todos
    //los datos que se enviaron desde el cliente
    public UserRest createUser(@RequestBody UserDetailRequestModel userDetails){

       //Obj que se retornará al final:
        UserRest userReturn = new  UserRest();

        //Obj para enviar a la Lógica de la app
        UserDto userDto = new UserDto();

        //Copiar las propiedades del obj que recibo al Dto
        BeanUtils.copyProperties(userDetails, userDto);

        //enviar al método createUser que está en un servicio los datos del Dto
        //guardar lo que retorne en el obj createUser
        UserDto createdUser = userService.createUser(userDto);

        //copiar propiedades del obj createdUser al obj a retornar
        BeanUtils.copyProperties(createdUser, userReturn);

        return userReturn;




    }
}
