package example_grails

class Category {

    int id
    String name
    Site site

    static hasMany = [site:Site]



    static constraints = {
    }

    @Override
    public String toString() {
        return name
    }
}
