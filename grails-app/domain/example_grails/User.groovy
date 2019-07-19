package example_grails

class User {

    int id
    String name
    Date dateFrom
    Date dateTo
    int totalVisit
    List<String> visitDetail

    static constraints = {
    }
}
