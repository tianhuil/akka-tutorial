package AkkaTutorial

import akka.actor.{Props, ActorSystem}

object ActorDemo {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("drinks-system")
    val props = Props[DrinkActor]
    val drinkActor = system.actorOf(props, "drinkActor-1")
    drinkActor ! "tea"
    drinkActor ! "coffee"
    drinkActor ! "water"
    system.terminate()
  }
}
