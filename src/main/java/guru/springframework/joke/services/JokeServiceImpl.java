package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements  JokeService {

//Creo variabile final cosi spring la istanzia una sola volta nel costruttore
    //tramite la constructor injection
    private final ChuckNorrisQuotes chuckNorrisQuotes;


    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
