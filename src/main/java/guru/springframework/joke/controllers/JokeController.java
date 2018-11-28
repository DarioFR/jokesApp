package guru.springframework.joke.controllers;


import guru.springframework.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//L'annotation controller definisce la classe in questione
//come controller MVC che smisterà le request su specifiche pagine della view html
@Controller
public class JokeController {

    private JokeService jokeService;

    //questa annotation Autowired non è necessaria
    // perchè Spring funzionerà già di suo con la constructor
    //injection
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    //Spring binderà dei parametri all'oggetto model
    //che sarà accessibile a front da Thymeleaf
    @RequestMapping({"/",})
    public String showJoke(Model model){

        //la riga seguente binda alla view il parametro di nome "joke" che sarà accessibile a front da Thymeleaf
        model.addAttribute("joke",jokeService.getJoke());
        //il controller redirigerà sulal view Thymeleaf di nome "chucknorris"
        return "chucknorris";
    }
}
