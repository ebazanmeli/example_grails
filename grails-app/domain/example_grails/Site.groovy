package example_grails

class Site {

    int id
    String name


    static constraints = {
    }

    @Override
    public String toString() {
        return name
    }
}
