interface Animal {
    bool feed(bool timeToEat);
    void groom();
    void pet();
}


class Dog implements Animal {
    bool feed(bool timeToEat) {
        // pour food into bowl
        return true;
    }
    void groom() {
        // brush well
    }
    void pet() {
        // pet cautiously
    }
}

class Giraffe implements Animal {
    bool feed(bool timeToEat) {
        // point to the trees 
        return true;
    }
    void groom() {
       // get a ladder
       // brush well
    }
    void pet() {
        // get a ladder
        // pet cautiously
    }
}
			  
