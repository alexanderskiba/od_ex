//package bobsrockets {
//
//  import bobsrockets.navigation.Navigator
//  package navigation {
//  class Navigator{
//    val map = new StarMap
//  }
//    class StarMap
//  }
//  class Ship {
//    val nav = new Navigator
//  }
//  package fleets {
//    class Fleet {
//      def addShip() = {new Ship}
//    }
//  }
//}
//
//package bobsrockets {
//  class Ship
//}
//package bobsrockets.fleets {
//
//  import bobsrockets.Ship
//
//  class Fleet {
//    def addShip() = { new Ship }
//  }
//}
package bobsrockets {
  package navigation {

    import bobsrockets.navigation.launch.Booster1
    package launch {
      class Booster1
    }
    class MissionControl {
      val booster1 = new Booster1
      val booster2 = new bobsrockets.launch.Booster2
      val booster3 = new _root_.launch.Booster3
    }
  }
  package launch {
    class Booster2

  }
}