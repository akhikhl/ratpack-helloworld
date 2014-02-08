import static ratpack.groovy.Groovy.ratpack

ratpack {
  handlers {
    get {
      render 'Hello, world!'
    }

    assets "public"
  }
}


