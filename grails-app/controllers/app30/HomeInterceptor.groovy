package app30


class HomeInterceptor {

    boolean before() {
        //matchAll()
        //        .excludes(controller:"home")
       // println "Hello world - before ...."
      true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }

}
