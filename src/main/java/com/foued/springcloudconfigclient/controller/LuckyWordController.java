package com.foued.springcloudconfigclient.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties("word-config")
public class LuckyWordController {

    //@Value("${lucky-word}") String luckyWord;

    private String preamble;
    private String luckyWord;

    public String getPreamble() {
        return preamble;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }

    public String getLuckyWord() {
        return luckyWord;
    }

    public void setLuckyWord(String luckyWord) {
        this.luckyWord = luckyWord;
    }

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return this.preamble + " " +this.luckyWord;
    }
}
