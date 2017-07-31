package com.cfg.repup.helpers;

import pl.allegro.tech.boot.autoconfigure.handlebars.HandlebarsHelper;

@HandlebarsHelper
public class IncrementIndex {

    public IncrementIndex(){
        System.out.println("called");
    }

    public CharSequence inc(int index) {
        System.out.println(index);
        return Integer.toString(index+1);
    }
}
