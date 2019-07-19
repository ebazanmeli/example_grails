package example_grails

class Item {

    int id
    String title
    String subTitle
    Category categoryId
    int price
    String imageUrl

    static belongsTo = [categoryId: Category]

    static constraints = {
    }
}
