package es.lespsan.ppsspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UsuarioController {

    public Map<Integer, String> usuarios =  new HashMap<>();

    public void putUsers() {
        usuarios.put(1,"Carlos");
        usuarios.put(2,"Santiago");
        usuarios.put(3,"Javier");
        usuarios.put(4,"Félix");
        usuarios.put(5,"Lucia");
    }

    @GetMapping("/users")
    public Map<Integer, String> getUsers() {
        putUsers();
        return usuarios;
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable Integer id) {
        return  usuarios.get(id);
    }
}
