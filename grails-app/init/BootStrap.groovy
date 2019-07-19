import example_grails.Category
import example_grails.Item
import example_grails.Site
import example_grails.User

class BootStrap {

    def init = { servletContext ->
        new User(name: "Eze", dateFrom: new Date(), dateTo: new Date(), totalVisit: 0, visitDetail: []).save()

        Site siteOne = new Site(name: "MLA")
        siteOne.save()
        Site siteTwo = new Site(name: "MLB")
        siteTwo.save()
        Site siteThree = new Site(name: "MLM")
        siteThree.save()
        Site siteFour = new Site(name: "MLU")
        siteFour.save()

        Category categoryOne = new Category(name: "Autos", site: siteOne)
        categoryOne.save()
        Category categoryTwo = new Category(name: "Celulares", site: siteThree)
        categoryTwo.save()
        Category categoryThree = new Category(name: "Bebes", site: siteTwo)
        categoryThree.save()
        Category categoryFour = new Category(name: "Notebooks", site: siteFour)
        categoryFour.save()

        new Item(title: "Audi TT", subTitle: "3 Puertas", categoryId: categoryOne, price: 699050, imageUrl: "https://picolio.auto123.com/18photo/audi/2018-audi-tt-coupe-20-tfsi.png").save()
        new Item(title: "IPhone X", subTitle: "250 GB", categoryId: categoryTwo, price: 70000, imageUrl: "https://images-na.ssl-images-amazon.com/images/I/51XDRzsKL9L._SY445_.jpg").save()
        new Item(title: "Pañales", subTitle: "Pampers", categoryId: categoryThree, price: 600, imageUrl: "https://thumb.babytuto.com/unsafe/600x600/https://s3-us-west-2.amazonaws.com/babytuto/c25a196369a388d939a4499a075e03e8.jpg").save()
        new Item(title: "Mac XX", subTitle: "Muy Buena", categoryId: categoryFour, price: 100000, imageUrl: "https://image.dhgate.com/0x0s/f2-albu-g2-M01-A9-91-rBVaG1oaxVCAYzyUAAHe3hwziok973.jpg/para-mac-book-wholesale-funda-de-protecci.jpg").save()
        new Item(title: "Bangho TT", subTitle: "No tan buena", categoryId: categoryFour, price: 25890, imageUrl: "https://http2.mlstatic.com/notebook-bangho-max-intel-celeron-4gb-500gb-156-windows-10-D_NQ_NP_401225-MLA25396317398_022017-F.jpg").save()
    }
    def destroy = {
    }
}
