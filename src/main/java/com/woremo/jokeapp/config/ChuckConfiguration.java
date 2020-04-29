package com.woremo.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ChuckConfiguration {

    //we have declared ChuckNorrisQuotes as a Configuration and a Bean
    //this pattern is used a lot when dealing with external Jars
    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){

        return new ChuckNorrisQuotes();

    }


}
