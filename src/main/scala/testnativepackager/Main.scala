package testnativepackager


import akka.actor.ActorSystem
import spray.routing.SimpleRoutingApp

object Main extends App with SimpleRoutingApp {
  implicit val system = ActorSystem("my-system")

  startServer(interface = "localhost", port = 8080) {
    path("hello") {
      get {
        complete {
                    <h1>Say hello to spray</h1>
        }
      }
    }
  }
}

