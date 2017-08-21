package com.example.francisco.codetestweek3;

import java.util.ArrayList;

/**
 * Created by FRANCISCO on 18/08/2017.
 */

public class Tree {
    char element;
    ArrayList<Tree> skipping_branchs;

    public Tree(char element, ArrayList<Tree> skipping_branchs) {
        this.element = element;
        this.skipping_branchs = skipping_branchs;
    }

    public char getElement() {
        return element;
    }

    public void setElement(char element) {
        this.element = element;
    }

    public ArrayList<Tree> getSkipping_branchs() {
        return skipping_branchs;
    }

    public void setSkipping_branchs(ArrayList<Tree> skipping_branchs) {
        this.skipping_branchs = skipping_branchs;
    }
}
